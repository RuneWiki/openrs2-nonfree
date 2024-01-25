import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class150 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	private int anInt4576;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray126;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "I")
	private int anInt4582;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static276.method4740(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt4576 = local20;
			this.anIntArrayArray126 = new int[local24][14];
			this.anInt4582 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray126[local37];
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
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local84;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local84 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
	public int method4045(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray126 != null) {
			arg0 = (int) ((long) this.anInt4576 * (long) arg0 / (long) this.anInt4582);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)I")
	public int method4047(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray126 != null) {
			arg0 = (int) ((long) this.anInt4576 * (long) arg0 / (long) this.anInt4582) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BB)[B")
	public byte[] method4049(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray126 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt4576 * (long) arg0.length / (long) this.anInt4582) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray126[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34;
				}
				local26 += this.anInt4576;
				@Pc(70) int local70 = local26 / this.anInt4582;
				local24 += local70;
				local26 -= local70 * this.anInt4582;
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
}
