import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class97 {

	@OriginalMember(owner = "client!et", name = "e", descriptor = "I")
	private int anInt2763;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(II)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static83.method1958(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anInt2763 = local24;
			this.anInt2760 = local20;
			this.anIntArrayArray17 = new int[local20][14];
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray17[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local24 / (double) local20;
				while (local60 < local70) {
					@Pc(92) double local92 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(94) double local94 = local83;
					if (local92 < -1.0E-4D || local92 > 1.0E-4D) {
						local94 = local83 * (Math.sin(local92) / local92);
					}
					local94 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local94 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)I")
	public int method2569(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2763 / (long) this.anInt2760) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[B)[B")
	public byte[] method2570(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray17 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt2763 / (long) this.anInt2760) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray17[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local47[local49] * local42;
				}
				local34 += this.anInt2763;
				@Pc(80) int local80 = local34 / this.anInt2760;
				local34 -= this.anInt2760 * local80;
				local32 += local80;
			}
			arg0 = new byte[local27];
			for (@Pc(101) int local101 = 0; local101 < local27; local101++) {
				@Pc(111) int local111 = local30[local101] + 32768 >> 16;
				if (local111 < -128) {
					arg0[local101] = -128;
				} else if (local111 > 127) {
					arg0[local101] = 127;
				} else {
					arg0[local101] = (byte) local111;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(BI)I")
	public int method2573(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray17 != null) {
			arg0 = (int) ((long) this.anInt2763 * (long) arg0 / (long) this.anInt2760);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[S)[S")
	public short[] method2575(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray17 != null) {
			@Pc(27) int local27 = (int) ((long) this.anInt2763 * (long) arg0.length / (long) this.anInt2760) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) short local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray17[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local32 + local49] += local47[local49] * local42 >> 2;
				}
				local34 += this.anInt2763;
				@Pc(83) int local83 = local34 / this.anInt2760;
				local34 -= local83 * this.anInt2760;
				local32 += local83;
			}
			arg0 = new short[local27];
			for (@Pc(108) int local108 = 0; local108 < local27; local108++) {
				@Pc(118) int local118 = local30[local108] + 8192 >> 14;
				if (local118 < -32768) {
					arg0[local108] = -32768;
				} else if (local118 > 32767) {
					arg0[local108] = 32767;
				} else {
					arg0[local108] = (short) local118;
				}
			}
		}
		return arg0;
	}
}
