import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
	private int anInt1666;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(21) int[] local21 = this.method3012(0, arg0);
			@Pc(24) int local24 = this.anInt1666;
			@Pc(46) int local46;
			@Pc(44) int local44;
			@Pc(77) int[] local77;
			@Pc(82) int[] local82;
			@Pc(93) int local93;
			@Pc(97) int local97;
			@Pc(101) int local101;
			if (local24 == 2) {
				for (local24 = 0; local24 < Static65.anInt1933; local24++) {
					local44 = local21[local24];
					for (local46 = 1; this.anIntArrayArray10.length - 1 > local46 && local44 >= this.anIntArrayArray10[local46][0]; local46++) {
					}
					local77 = this.anIntArrayArray10[local46 - 1];
					local82 = this.anIntArrayArray10[local46];
					local93 = this.method1265(local46 - 2)[1];
					local97 = local77[1];
					local101 = local82[1];
					@Pc(110) int local110 = this.method1265(local46 + 1)[1];
					@Pc(128) int local128 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					@Pc(134) int local134 = local128 * local128 >> 12;
					@Pc(144) int local144 = local110 + local97 - local101 - local93;
					@Pc(149) int local149 = local101 - local93;
					@Pc(157) int local157 = local93 - local97 - local144;
					@Pc(163) int local163 = local157 * local134 >> 12;
					@Pc(173) int local173 = local134 * (local144 * local128 >> 12) >> 12;
					@Pc(179) int local179 = local128 * local149 >> 12;
					local7[local24] = local97 + local179 + local163 + local173;
				}
			} else if (local24 == 1) {
				for (local24 = 0; local24 < Static65.anInt1933; local24++) {
					local44 = local21[local24];
					for (local46 = 1; this.anIntArrayArray10.length - 1 > local46 && this.anIntArrayArray10[local46][0] <= local44; local46++) {
					}
					local82 = this.anIntArrayArray10[local46];
					local77 = this.anIntArrayArray10[local46 - 1];
					local93 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					local97 = 4096 - Static3.anIntArray6[local93 >> 5 & 0xFF] >> 1;
					local101 = 4096 - local97;
					local7[local24] = local82[1] * local97 + local101 * local77[1] >> 12;
				}
			} else {
				for (local24 = 0; local24 < Static65.anInt1933; local24++) {
					local44 = local21[local24];
					for (local46 = 1; local46 < this.anIntArrayArray10.length - 1 && this.anIntArrayArray10[local46][0] <= local44; local46++) {
					}
					local77 = this.anIntArrayArray10[local46 - 1];
					local82 = this.anIntArrayArray10[local46];
					local93 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					local97 = 4096 - local93;
					local7[local24] = local82[1] * local93 + local97 * local77[1] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		if (this.anIntArrayArray10 == null) {
			this.anIntArrayArray10 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray10.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1666 == 2) {
			this.method1266();
		}
		Static68.method1457();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[I")
	private int[] method1265(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray176;
		} else if (this.anIntArrayArray10.length <= arg0) {
			return this.anIntArray177;
		} else {
			return this.anIntArrayArray10[arg0];
		}
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
	private void method1266() {
		@Pc(8) int[] local8 = this.anIntArrayArray10[0];
		@Pc(13) int[] local13 = this.anIntArrayArray10[1];
		@Pc(22) int[] local22 = this.anIntArrayArray10[this.anIntArrayArray10.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray10[this.anIntArrayArray10.length - 1];
		this.anIntArray176 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] + -local13[1] };
		this.anIntArray177 = new int[] { local22[0] + local22[0] - local39[0], local22[1] + local22[1] - local39[1] };
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1666 = arg1.method1607();
		this.anIntArrayArray10 = new int[arg1.method1607()][2];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray10.length; local21++) {
			this.anIntArrayArray10[local21][0] = arg1.method1642();
			this.anIntArrayArray10[local21][1] = arg1.method1642();
		}
	}
}
