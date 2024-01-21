import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class88 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private int anInt4138;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
	private int anInt4142;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static24.method439(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			this.anInt4138 = local20;
			this.anIntArrayArray74 = new int[local20][14];
			@Pc(32) int local32 = arg1 / local16;
			this.anInt4142 = local32;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(47) double local47 = (double) local37 / (double) local20 + 6.0D;
				@Pc(52) int[] local52 = this.anIntArrayArray74[local37];
				@Pc(58) double local58 = (double) local32 / (double) local20;
				@Pc(66) int local66 = (int) Math.floor(local47 + 1.0D - 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				@Pc(76) int local76 = (int) Math.ceil(local47 + 7.0D);
				if (local76 > 14) {
					local76 = 14;
				}
				while (local76 > local66) {
					@Pc(92) double local92 = ((double) local66 - local47) * 3.141592653589793D;
					@Pc(94) double local94 = local58;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local58 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local66 - local47) * 0.2243994752564138D) * 0.46D + 0.54D;
					local52[local66] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B)[B")
	public byte[] method2772(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray74 != null) {
			@Pc(6) int local6 = 0;
			@Pc(8) int local8 = 0;
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt4142 / (long) this.anInt4138) + 14;
			@Pc(26) int[] local26 = new int[local23];
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray74[local8];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local26[local6 + local41] += local34 * local39[local41];
				}
				local8 += this.anInt4142;
				@Pc(70) int local70 = local8 / this.anInt4138;
				local8 -= this.anInt4138 * local70;
				local6 += local70;
			}
			arg0 = new byte[local23];
			for (@Pc(91) int local91 = 0; local91 < local23; local91++) {
				@Pc(101) int local101 = local26[local91] + 32768 >> 16;
				if (local101 < -128) {
					arg0[local91] = -128;
				} else if (local101 > 127) {
					arg0[local91] = 127;
				} else {
					arg0[local91] = (byte) local101;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	public int method2773(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray74 != null) {
			arg0 = (int) ((long) this.anInt4142 * (long) arg0 / (long) this.anInt4138);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)I")
	public int method2774(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray74 != null) {
			arg0 = (int) ((long) this.anInt4142 * (long) arg0 / (long) this.anInt4138) + 6;
		}
		return arg0;
	}
}
