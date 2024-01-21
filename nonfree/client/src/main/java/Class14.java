import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class14 {

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static68.method1180(arg1, arg0);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt338 = local24;
			this.anIntArrayArray2 = new int[local24][14];
			this.anInt341 = local20;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray2[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(73) int local73 = (int) Math.ceil(local52 + 7.0D);
				if (local73 > 14) {
					local73 = 14;
				}
				@Pc(86) double local86 = (double) local20 / (double) local24;
				while (local73 > local60) {
					@Pc(95) double local95 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(97) double local97 = local86;
					if (local95 < -1.0E-4D || local95 > 1.0E-4D) {
						local97 = local86 * (Math.sin(local95) / local95);
					}
					local97 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local97 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I")
	public int method220(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = (int) ((long) this.anInt341 * (long) arg0 / (long) this.anInt338) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B[B)[B")
	public byte[] method221(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray2 != null) {
			@Pc(29) int local29 = (int) ((long) arg0.length * (long) this.anInt341 / (long) this.anInt338) + 14;
			@Pc(32) int[] local32 = new int[local29];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(45) int[] local45 = this.anIntArrayArray2[local34];
				@Pc(49) byte local49 = arg0[local38];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local32[local36 + local51] += local49 * local45[local51];
				}
				local34 += this.anInt341;
				@Pc(81) int local81 = local34 / this.anInt338;
				local36 += local81;
				local34 -= this.anInt338 * local81;
			}
			arg0 = new byte[local29];
			for (@Pc(106) int local106 = 0; local106 < local29; local106++) {
				@Pc(116) int local116 = local32[local106] + 32768 >> 16;
				if (local116 < -128) {
					arg0[local106] = -128;
				} else if (local116 <= 127) {
					arg0[local106] = (byte) local116;
				} else {
					arg0[local106] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)I")
	public int method222(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray2 != null) {
			arg0 = (int) ((long) this.anInt341 * (long) arg0 / (long) this.anInt338);
		}
		return arg0;
	}
}
