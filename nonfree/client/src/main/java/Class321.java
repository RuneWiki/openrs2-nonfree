import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class321 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	private int anInt9404;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	private int anInt9409;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(II)V")
	public Class321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(16) int local16 = Static242.method4388(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt9404 = local20;
			this.anIntArrayArray55 = new int[local24][14];
			this.anInt9409 = local24;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray55[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(60) int local60 = (int) Math.floor(local52 + 1.0D - 7.0D);
				if (local60 < 0) {
					local60 = 0;
				}
				@Pc(70) int local70 = (int) Math.ceil(local52 + 7.0D);
				if (local70 > 14) {
					local70 = 14;
				}
				@Pc(83) double local83 = (double) local20 / (double) local24;
				while (local60 < local70) {
					@Pc(93) double local93 = ((double) local60 - local52) * 3.141592653589793D;
					@Pc(95) double local95 = local83;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local95 = local83 * (Math.sin(local93) / local93);
					}
					local95 *= Math.cos(((double) local60 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local60] = (int) Math.floor(local95 * 65536.0D + 0.5D);
					local60++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I")
	public int method7674(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray55 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt9404 / (long) this.anInt9409) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[S)[S")
	public short[] method7677(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray55 != null) {
			@Pc(28) int local28 = (int) ((long) this.anInt9404 * (long) arg0.length / (long) this.anInt9409) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) short local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray55[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local48[local50] * local43 >> 2;
				}
				local35 += this.anInt9404;
				@Pc(84) int local84 = local35 / this.anInt9409;
				local33 += local84;
				local35 -= local84 * this.anInt9409;
			}
			arg0 = new short[local28];
			for (@Pc(105) int local105 = 0; local105 < local28; local105++) {
				@Pc(115) int local115 = local31[local105] + 8192 >> 14;
				if (local115 < -32768) {
					arg0[local105] = -32768;
				} else if (local115 <= 32767) {
					arg0[local105] = (short) local115;
				} else {
					arg0[local105] = 32767;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z[B)[B")
	public byte[] method7678(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray55 != null) {
			@Pc(31) int local31 = (int) ((long) arg0.length * (long) this.anInt9404 / (long) this.anInt9409) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray55[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local36 + local53] += local51[local53] * local46;
				}
				local38 += this.anInt9404;
				@Pc(82) int local82 = local38 / this.anInt9409;
				local36 += local82;
				local38 -= this.anInt9409 * local82;
			}
			arg0 = new byte[local31];
			for (@Pc(107) int local107 = 0; local107 < local31; local107++) {
				@Pc(117) int local117 = local34[local107] + 32768 >> 16;
				if (local117 < -128) {
					arg0[local107] = -128;
				} else if (local117 <= 127) {
					arg0[local107] = (byte) local117;
				} else {
					arg0[local107] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)I")
	public int method7679(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray55 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt9404 / (long) this.anInt9409);
		}
		return arg0;
	}
}
