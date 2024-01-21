import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class18 {

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	private int anInt557;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static141.method2091(arg1, arg0);
			@Pc(16) int local16 = arg0 / local12;
			this.anIntArrayArray7 = new int[local16][14];
			this.anInt557 = local16;
			@Pc(28) int local28 = arg1 / local12;
			this.anInt554 = local28;
			for (@Pc(33) int local33 = 0; local33 < local16; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local16 + 6.0D;
				@Pc(49) double local49 = (double) local28 / (double) local16;
				@Pc(54) int[] local54 = this.anIntArrayArray7[local33];
				@Pc(62) int local62 = (int) Math.floor(local43 + 1.0D - 7.0D);
				@Pc(68) int local68 = (int) Math.ceil(local43 + 7.0D);
				if (local62 < 0) {
					local62 = 0;
				}
				if (local68 > 14) {
					local68 = 14;
				}
				while (local68 > local62) {
					@Pc(90) double local90 = ((double) local62 - local43) * 3.141592653589793D;
					@Pc(92) double local92 = local49;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local49 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local62 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local54[local62] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local62++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	public int method439(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray7 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt554 / (long) this.anInt557) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)I")
	public int method440(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray7 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt554 / (long) this.anInt557);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BB)[B")
	public byte[] method442(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray7 != null) {
			@Pc(31) int local31 = (int) ((long) arg0.length * (long) this.anInt554 / (long) this.anInt557) + 14;
			@Pc(34) int[] local34 = new int[local31];
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
				@Pc(46) byte local46 = arg0[local40];
				@Pc(51) int[] local51 = this.anIntArrayArray7[local38];
				for (@Pc(53) int local53 = 0; local53 < 14; local53++) {
					local34[local36 + local53] += local46 * local51[local53];
				}
				local38 += this.anInt554;
				@Pc(85) int local85 = local38 / this.anInt557;
				local38 -= local85 * this.anInt557;
				local36 += local85;
			}
			arg0 = new byte[local31];
			for (@Pc(110) int local110 = 0; local110 < local31; local110++) {
				@Pc(120) int local120 = local34[local110] + 32768 >> 16;
				if (local120 < -128) {
					arg0[local110] = -128;
				} else if (local120 > 127) {
					arg0[local110] = 127;
				} else {
					arg0[local110] = (byte) local120;
				}
			}
		}
		return arg0;
	}
}
