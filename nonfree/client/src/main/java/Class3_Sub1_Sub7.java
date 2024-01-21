import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		if (this.anIntArrayArray3 == null) {
			this.anIntArrayArray3 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray3.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1030 == 2) {
			this.method655();
		}
		Static6.method99();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(21) int[] local21 = this.method2904(0, arg0);
			@Pc(24) int local24 = this.anInt1030;
			@Pc(44) int local44;
			@Pc(42) int local42;
			@Pc(75) int[] local75;
			@Pc(80) int[] local80;
			@Pc(89) int local89;
			@Pc(93) int local93;
			@Pc(97) int local97;
			if (local24 == 2) {
				for (local24 = 0; local24 < Static141.anInt3261; local24++) {
					local42 = local21[local24];
					for (local44 = 1; this.anIntArrayArray3.length - 1 > local44 && this.anIntArrayArray3[local44][0] <= local42; local44++) {
					}
					local75 = this.anIntArrayArray3[local44 - 1];
					local80 = this.anIntArrayArray3[local44];
					local89 = this.method652(local44 - 2)[1];
					local93 = local75[1];
					local97 = local80[1];
					@Pc(106) int local106 = this.method652(local44 + 1)[1];
					@Pc(117) int local117 = local106 + local93 - local89 - local97;
					@Pc(135) int local135 = (local42 - local75[0] << 12) / (local80[0] - local75[0]);
					@Pc(141) int local141 = local135 * local135 >> 12;
					@Pc(149) int local149 = local89 - local93 - local117;
					@Pc(154) int local154 = local97 - local89;
					@Pc(166) int local166 = (local135 * local117 >> 12) * local141 >> 12;
					@Pc(172) int local172 = local149 * local141 >> 12;
					@Pc(178) int local178 = local154 * local135 >> 12;
					local11[local24] = local166 + local172 + local178 + local93;
				}
			} else if (local24 == 1) {
				for (local24 = 0; local24 < Static141.anInt3261; local24++) {
					local42 = local21[local24];
					for (local44 = 1; local44 < this.anIntArrayArray3.length - 1 && this.anIntArrayArray3[local44][0] <= local42; local44++) {
					}
					local80 = this.anIntArrayArray3[local44];
					local75 = this.anIntArrayArray3[local44 - 1];
					local89 = (local42 - local75[0] << 12) / (local80[0] - local75[0]);
					local93 = 4096 - Static25.anIntArray445[local89 >> 5 & 0xFF] >> 1;
					local97 = 4096 - local93;
					local11[local24] = local80[1] * local93 + local75[1] * local97 >> 12;
				}
			} else {
				for (local24 = 0; local24 < Static141.anInt3261; local24++) {
					local42 = local21[local24];
					for (local44 = 1; this.anIntArrayArray3.length - 1 > local44 && this.anIntArrayArray3[local44][0] <= local42; local44++) {
					}
					local75 = this.anIntArrayArray3[local44 - 1];
					local80 = this.anIntArrayArray3[local44];
					local89 = (local42 - local75[0] << 12) / (local80[0] - local75[0]);
					local93 = 4096 - local89;
					local11[local24] = local93 * local75[1] + local80[1] * local89 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)[I")
	private int[] method652(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray83;
		} else if (this.anIntArrayArray3.length <= arg0) {
			return this.anIntArray82;
		} else {
			return this.anIntArrayArray3[arg0];
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1030 = arg1.method191();
		this.anIntArrayArray3 = new int[arg1.method191()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray3.length; local17++) {
			this.anIntArrayArray3[local17][0] = arg1.method208();
			this.anIntArrayArray3[local17][1] = arg1.method208();
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	private void method655() {
		@Pc(4) int[] local4 = this.anIntArrayArray3[0];
		@Pc(13) int[] local13 = this.anIntArrayArray3[1];
		@Pc(22) int[] local22 = this.anIntArrayArray3[this.anIntArrayArray3.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray3[this.anIntArrayArray3.length - 1];
		this.anIntArray82 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + local22[1] - local31[1] };
		this.anIntArray83 = new int[] { local4[0] + local4[0] - local13[0], local4[1] - (local13[1] + -local4[1]) };
	}
}
