import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class13 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static68.method1238(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			this.anInt482 = local16;
			this.anIntArrayArray5 = new int[local16][14];
			@Pc(28) int local28 = arg1 / local12;
			this.anInt495 = local28;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local16 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray5[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local43 + 7.0D);
				@Pc(72) double local72 = (double) local28 / (double) local16;
				if (local66 > 14) {
					local66 = 14;
				}
				while (local56 < local66) {
					@Pc(88) double local88 = ((double) local56 - local43) * 3.141592653589793D;
					@Pc(90) double local90 = local72;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local72 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([BB)[B")
	public byte[] method351(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray5 != null) {
			@Pc(29) int local29 = (int) ((long) this.anInt495 * (long) arg0.length / (long) this.anInt482) + 14;
			@Pc(31) int local31 = 0;
			@Pc(34) int[] local34 = new int[local29];
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
				@Pc(44) byte local44 = arg0[local38];
				@Pc(49) int[] local49 = this.anIntArrayArray5[local36];
				for (@Pc(51) int local51 = 0; local51 < 14; local51++) {
					local34[local31 + local51] += local49[local51] * local44;
				}
				local36 += this.anInt495;
				@Pc(82) int local82 = local36 / this.anInt482;
				local31 += local82;
				local36 -= local82 * this.anInt482;
			}
			arg0 = new byte[local29];
			for (@Pc(107) int local107 = 0; local107 < local29; local107++) {
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

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)I")
	public int method356(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray5 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt495 / (long) this.anInt482);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)I")
	public int method359(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray5 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt495 / (long) this.anInt482) + 6;
		}
		return arg0;
	}
}
