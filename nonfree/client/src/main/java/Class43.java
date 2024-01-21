import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class43 {

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	private int anInt2047;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	private int anInt2048;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(16) int local16 = Static136.method2572(arg0, arg1);
			@Pc(20) int local20 = arg1 / local16;
			@Pc(24) int local24 = arg0 / local16;
			this.anInt2047 = local24;
			this.anIntArrayArray18 = new int[local24][14];
			this.anInt2048 = local20;
			for (@Pc(37) int local37 = 0; local37 < local24; local37++) {
				@Pc(44) int[] local44 = this.anIntArrayArray18[local37];
				@Pc(52) double local52 = (double) local37 / (double) local24 + 6.0D;
				@Pc(58) double local58 = (double) local20 / (double) local24;
				@Pc(66) int local66 = (int) Math.floor(local52 + 1.0D - 7.0D);
				@Pc(72) int local72 = (int) Math.ceil(local52 + 7.0D);
				if (local66 < 0) {
					local66 = 0;
				}
				if (local72 > 14) {
					local72 = 14;
				}
				while (local72 > local66) {
					@Pc(85) double local85 = local58;
					@Pc(93) double local93 = ((double) local66 - local52) * 3.141592653589793D;
					if (local93 < -1.0E-4D || local93 > 1.0E-4D) {
						local85 = local58 * (Math.sin(local93) / local93);
					}
					local85 *= Math.cos(((double) local66 - local52) * 0.2243994752564138D) * 0.46D + 0.54D;
					local44[local66] = (int) Math.floor(local85 * 65536.0D + 0.5D);
					local66++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)I")
	public int method1454(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2048 / (long) this.anInt2047) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BB)[B")
	public byte[] method1455(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray18 != null) {
			@Pc(17) int local17 = (int) ((long) arg0.length * (long) this.anInt2048 / (long) this.anInt2047) + 14;
			@Pc(20) int[] local20 = new int[local17];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < arg0.length; local26++) {
				@Pc(31) byte local31 = arg0[local26];
				@Pc(36) int[] local36 = this.anIntArrayArray18[local22];
				for (@Pc(38) int local38 = 0; local38 < 14; local38++) {
					local20[local24 + local38] += local31 * local36[local38];
				}
				local22 += this.anInt2048;
				@Pc(66) int local66 = local22 / this.anInt2047;
				local24 += local66;
				local22 -= local66 * this.anInt2047;
			}
			arg0 = new byte[local17];
			for (@Pc(91) int local91 = 0; local91 < local17; local91++) {
				@Pc(100) int local100 = local20[local91] + 32768 >> 16;
				if (local100 < -128) {
					arg0[local91] = -128;
				} else if (local100 <= 127) {
					arg0[local91] = (byte) local100;
				} else {
					arg0[local91] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
	public int method1459(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2048 / (long) this.anInt2047);
		}
		return arg0;
	}
}
