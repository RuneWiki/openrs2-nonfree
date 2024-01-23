import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class152 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	private int anInt4872;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	private int anInt4874;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V")
	public Class152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(13) int local13 = Static99.method1580(arg1, arg0);
			@Pc(17) int local17 = arg1 / local13;
			this.anInt4872 = local17;
			@Pc(24) int local24 = arg0 / local13;
			this.anInt4874 = local24;
			this.anIntArrayArray68 = new int[local24][14];
			for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
				@Pc(42) int[] local42 = this.anIntArrayArray68[local34];
				@Pc(50) double local50 = (double) local34 / (double) local24 + 6.0D;
				@Pc(58) int local58 = (int) Math.floor(local50 + 1.0D - 7.0D);
				@Pc(64) int local64 = (int) Math.ceil(local50 + 7.0D);
				if (local58 < 0) {
					local58 = 0;
				}
				if (local64 > 14) {
					local64 = 14;
				}
				@Pc(80) double local80 = (double) local17 / (double) local24;
				while (local64 > local58) {
					@Pc(95) double local95 = ((double) local58 - local50) * 3.141592653589793D;
					@Pc(97) double local97 = local80;
					if (-1.0E-4D > local95 || local95 > 1.0E-4D) {
						local97 = local80 * (Math.sin(local95) / local95);
					}
					local97 *= Math.cos(((double) local58 - local50) * 0.2243994752564138D) * 0.46D + 0.54D;
					local42[local58] = (int) Math.floor(local97 * 65536.0D + 0.5D);
					local58++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
	public int method4070(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray68 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4872 / (long) this.anInt4874);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)I")
	public int method4071(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray68 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt4872 / (long) this.anInt4874) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z[B)[B")
	public byte[] method4072(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray68 != null) {
			@Pc(21) int local21 = (int) ((long) this.anInt4872 * (long) arg0.length / (long) this.anInt4874) + 14;
			@Pc(24) int[] local24 = new int[local21];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg0.length; local30++) {
				@Pc(38) byte local38 = arg0[local30];
				@Pc(43) int[] local43 = this.anIntArrayArray68[local26];
				@Pc(45) int local45;
				for (local45 = 0; local45 < 14; local45++) {
					local24[local28 + local45] += local38 * local43[local45];
				}
				local26 += this.anInt4872;
				local45 = local26 / this.anInt4874;
				local28 += local45;
				local26 -= local45 * this.anInt4874;
			}
			arg0 = new byte[local21];
			for (local30 = 0; local30 < local21; local30++) {
				@Pc(109) int local109 = local24[local30] + 32768 >> 16;
				if (local109 < -128) {
					arg0[local30] = -128;
				} else if (local109 <= 127) {
					arg0[local30] = (byte) local109;
				} else {
					arg0[local30] = 127;
				}
			}
		}
		return arg0;
	}
}
