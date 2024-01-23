import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class82 {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
	private int anInt3751;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	private int anInt3746;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static187.method2968(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			this.anInt3751 = local16;
			@Pc(23) int local23 = arg1 / local12;
			this.anIntArrayArray33 = new int[local16][14];
			this.anInt3746 = local23;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray33[local33];
				@Pc(48) double local48 = (double) local33 / (double) local16 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				@Pc(62) int local62 = (int) Math.ceil(local48 + 7.0D);
				if (local62 > 14) {
					local62 = 14;
				}
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(77) double local77 = (double) local23 / (double) local16;
				while (local56 < local62) {
					@Pc(81) double local81 = local77;
					@Pc(88) double local88 = ((double) local56 - local48) * 3.141592653589793D;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local81 = local77 * (Math.sin(local88) / local88);
					}
					local81 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local81 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[B)[B")
	public byte[] method2590(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray33 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt3746 * (long) arg0.length / (long) this.anInt3751) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray33[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local47[local49] * local42;
				}
				local34 += this.anInt3746;
				@Pc(79) int local79 = local34 / this.anInt3751;
				local34 -= local79 * this.anInt3751;
				local32 += local79;
			}
			arg0 = new byte[local27];
			for (@Pc(100) int local100 = 0; local100 < local27; local100++) {
				@Pc(110) int local110 = local30[local100] + 32768 >> 16;
				if (local110 < -128) {
					arg0[local100] = -128;
				} else if (local110 <= 127) {
					arg0[local100] = (byte) local110;
				} else {
					arg0[local100] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
	public int method2591(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray33 != null) {
			arg0 = (int) ((long) this.anInt3746 * (long) arg0 / (long) this.anInt3751) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
	public int method2592(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray33 != null) {
			arg0 = (int) ((long) this.anInt3746 * (long) arg0 / (long) this.anInt3751);
		}
		return arg0;
	}
}
