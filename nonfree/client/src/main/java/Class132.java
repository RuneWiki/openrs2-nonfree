import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class132 {

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	private int anInt2743;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
	private int anInt2744;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(II)V")
	public Class132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static243.method3464(arg1, arg0);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray31 = new int[local20][14];
			this.anInt2743 = local20;
			this.anInt2744 = local24;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray31[local37];
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
				while (local70 > local60) {
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

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)I")
	public int method2354(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) this.anInt2744 * (long) arg0 / (long) this.anInt2743);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B[B)[B")
	public byte[] method2355(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray31 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt2744 / (long) this.anInt2743) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray31[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34;
				}
				local26 += this.anInt2744;
				@Pc(70) int local70 = local26 / this.anInt2743;
				local26 -= local70 * this.anInt2743;
				local24 += local70;
			}
			arg0 = new byte[local19];
			for (@Pc(91) int local91 = 0; local91 < local19; local91++) {
				@Pc(101) int local101 = local22[local91] + 32768 >> 16;
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

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I")
	public int method2356(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray31 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2744 / (long) this.anInt2743) + 6;
		}
		return arg0;
	}
}
