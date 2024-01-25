import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class174 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	private int anInt5186;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	private int anInt5184;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static132.method2045(arg0, arg1);
			@Pc(20) int local20 = arg0 / local16;
			@Pc(24) int local24 = arg1 / local16;
			this.anIntArrayArray32 = new int[local20][14];
			this.anInt5186 = local24;
			this.anInt5184 = local20;
			for (@Pc(37) int local37 = 0; local37 < local20; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray32[local37];
				@Pc(52) double local52 = (double) local37 / (double) local20 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(84) double local84 = (double) local24 / (double) local20;
				while (local60 < local73) {
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

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public int method4039(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray32 != null) {
			arg0 = (int) ((long) this.anInt5186 * (long) arg0 / (long) this.anInt5184);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
	public int method4042(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray32 != null) {
			arg0 = (int) ((long) this.anInt5186 * (long) arg0 / (long) this.anInt5184) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B[B)[B")
	public byte[] method4043(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray32 != null) {
			@Pc(19) int local19 = (int) ((long) this.anInt5186 * (long) arg0.length / (long) this.anInt5184) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray32[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local39[local41] * local34;
				}
				local26 += this.anInt5186;
				@Pc(70) int local70 = local26 / this.anInt5184;
				local24 += local70;
				local26 -= this.anInt5184 * local70;
			}
			arg0 = new byte[local19];
			for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
				@Pc(105) int local105 = local22[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 <= 127) {
					arg0[local95] = (byte) local105;
				} else {
					arg0[local95] = 127;
				}
			}
		}
		return arg0;
	}
}
