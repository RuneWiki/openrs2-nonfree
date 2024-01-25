import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class51 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt1176;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt1180;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static308.method4295(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt1176 = local24;
			this.anInt1180 = local20;
			this.anIntArrayArray8 = new int[local24][14];
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray8[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(94) double local94 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(96) double local96 = local84;
					if (local94 < -1.0E-4D || local94 > 1.0E-4D) {
						local96 = local84 * (Math.sin(local94) / local94);
					}
					local96 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local96 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public int method1025(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) this.anInt1180 * (long) arg0 / (long) this.anInt1176);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([SZ)[S")
	public short[] method1026(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray8 != null) {
			@Pc(29) int local29 = (int) ((long) arg0.length * (long) this.anInt1180 / (long) this.anInt1176) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(44) short local44 = arg0[local38];
				@Pc(49) int[] local49 = this.anIntArrayArray8[local36];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local32[local51 + local34] += local49[local51] * local44 >> 2;
				}
				local36 += this.anInt1180;
				@Pc(84) int local84 = local36 / this.anInt1176;
				local36 -= local84 * this.anInt1176;
				local34 += local84;
			}
			arg0 = new short[local29];
			for (@Pc(111) int local111 = 0; local111 < local29; local111++) {
				@Pc(123) int local123 = local32[local111] + 8192 >> 14;
				if (local123 < -32768) {
					arg0[local111] = -32768;
				} else if (local123 <= 32767) {
					arg0[local111] = (short) local123;
				} else {
					arg0[local111] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)I")
	public int method1027(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray8 != null) {
			arg0 = (int) ((long) this.anInt1180 * (long) arg0 / (long) this.anInt1176) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B[B)[B")
	public byte[] method1029(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray8 != null) {
			@Pc(31) int local31 = (int) ((long) this.anInt1180 * (long) arg0.length / (long) this.anInt1176) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray8[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local53 + local36] += local51[local53] * local46;
				}
				local38 += this.anInt1180;
				@Pc(86) int local86 = local38 / this.anInt1176;
				local38 -= this.anInt1176 * local86;
				local36 += local86;
			}
			arg0 = new byte[local31];
			for (@Pc(109) int local109 = 0; local109 < local31; local109++) {
				@Pc(121) int local121 = local34[local109] + 32768 >> 16;
				if (local121 < -128) {
					arg0[local109] = -128;
				} else if (local121 > 127) {
					arg0[local109] = 127;
				} else {
					arg0[local109] = (byte) local121;
				}
			}
		}
		return arg0;
	}
}
