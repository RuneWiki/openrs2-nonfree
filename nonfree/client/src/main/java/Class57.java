import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class57 {

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	private final int anInt1810;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	private final int anInt1808;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static82.method1290(arg0, arg1);
		@Pc(12) int local12 = arg1 / local8;
		this.anInt1810 = local12;
		@Pc(19) int local19 = arg0 / local8;
		this.anInt1808 = local19;
		if (local19 != local12) {
			this.anIntArrayArray18 = new int[local19][14];
			for (@Pc(33) int local33 = 0; local33 < local19; local33++) {
				@Pc(43) double local43 = (double) local33 / (double) local19 + 6.0D;
				@Pc(48) int[] local48 = this.anIntArrayArray18[local33];
				@Pc(56) int local56 = (int) Math.floor(local43 + 1.0D - 7.0D);
				@Pc(62) int local62 = (int) Math.ceil(local43 + 7.0D);
				if (local62 > 14) {
					local62 = 14;
				}
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(77) double local77 = (double) local12 / (double) local19;
				while (local62 > local56) {
					@Pc(87) double local87 = ((double) local56 - local43) * 3.141592653589793D;
					@Pc(89) double local89 = local77;
					if (local87 < -1.0E-4D || local87 > 1.0E-4D) {
						local89 = local77 * (Math.sin(local87) / local87);
					}
					local89 *= Math.cos(((double) local56 - local43) * 0.2243994752564138D) * 0.46D + 0.54D;
					local48[local56] = (int) Math.floor(local89 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)I")
	public int method1223(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = arg0 * this.anInt1810 / this.anInt1808 + 7;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BB)[B")
	public byte[] method1224(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray18 != null) {
			@Pc(15) int local15 = this.anInt1810 * arg0.length / this.anInt1808 + 14;
			@Pc(18) int[] local18 = new int[local15];
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
				@Pc(30) byte local30 = arg0[local24];
				@Pc(35) int[] local35 = this.anIntArrayArray18[local22];
				for (@Pc(37) int local37 = 0; local37 < 14; local37++) {
					local18[local20 + local37] += local35[local37] * local30;
				}
				local22 += this.anInt1810;
				@Pc(68) int local68 = local22 / this.anInt1808;
				local20 += local68;
				local22 -= this.anInt1808 * local68;
			}
			arg0 = new byte[local15];
			for (@Pc(93) int local93 = 0; local93 < local15; local93++) {
				@Pc(103) int local103 = local18[local93] + 32768 >> 16;
				if (local103 < -128) {
					arg0[local93] = -128;
				} else if (local103 <= 127) {
					arg0[local93] = (byte) local103;
				} else {
					arg0[local93] = 127;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(BI)I")
	public int method1226(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray18 != null) {
			arg0 = this.anInt1810 * arg0 / this.anInt1808;
		}
		return arg0;
	}
}
