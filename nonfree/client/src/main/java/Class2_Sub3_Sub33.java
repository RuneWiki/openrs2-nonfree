import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub3_Sub33 extends Class2_Sub3 {

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!tc", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!tc", name = "sb", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
	private int anInt3418;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(21) int[] local21 = this.method3011(arg0, 0);
			@Pc(24) int local24 = this.anInt3418;
			@Pc(44) int local44;
			@Pc(42) int local42;
			@Pc(75) int[] local75;
			@Pc(80) int[] local80;
			@Pc(89) int local89;
			@Pc(93) int local93;
			@Pc(97) int local97;
			if (local24 == 2) {
				for (local24 = 0; local24 < Static53.anInt1184; local24++) {
					local42 = local21[local24];
					for (local44 = 1; this.anIntArrayArray33.length - 1 > local44 && this.anIntArrayArray33[local44][0] <= local42; local44++) {
					}
					local75 = this.anIntArrayArray33[local44 - 1];
					local80 = this.anIntArrayArray33[local44];
					local89 = this.method2647(local44 - 2)[1];
					local93 = local75[1];
					local97 = local80[1];
					@Pc(106) int local106 = this.method2647(local44 + 1)[1];
					@Pc(123) int local123 = (local42 - local75[0] << 12) / (local80[0] - local75[0]);
					@Pc(129) int local129 = local123 * local123 >> 12;
					@Pc(138) int local138 = local93 + local106 - local97 - local89;
					@Pc(146) int local146 = local89 - local138 - local93;
					@Pc(153) int local153 = local97 - local89;
					@Pc(163) int local163 = (local123 * local138 >> 12) * local129 >> 12;
					@Pc(169) int local169 = local123 * local153 >> 12;
					@Pc(175) int local175 = local129 * local146 >> 12;
					local7[local24] = local169 + local175 + local163 + local93;
				}
			} else if (local24 == 1) {
				for (local24 = 0; local24 < Static53.anInt1184; local24++) {
					local42 = local21[local24];
					for (local44 = 1; this.anIntArrayArray33.length - 1 > local44 && this.anIntArrayArray33[local44][0] <= local42; local44++) {
					}
					local75 = this.anIntArrayArray33[local44 - 1];
					local80 = this.anIntArrayArray33[local44];
					local89 = (local42 - local75[0] << 12) / (local80[0] - local75[0]);
					local93 = 4096 - Static96.anIntArray205[local89 >> 5 & 0xFF] >> 1;
					local97 = 4096 - local93;
					local7[local24] = local80[1] * local93 + local97 * local75[1] >> 12;
				}
			} else {
				for (local24 = 0; local24 < Static53.anInt1184; local24++) {
					local42 = local21[local24];
					for (local44 = 1; local44 < this.anIntArrayArray33.length - 1 && this.anIntArrayArray33[local44][0] <= local42; local44++) {
					}
					local80 = this.anIntArrayArray33[local44];
					local75 = this.anIntArrayArray33[local44 - 1];
					local89 = (local42 - local75[0] << 12) / (local80[0] - local75[0]);
					local93 = 4096 - local89;
					local7[local24] = local93 * local75[1] + local89 * local80[1] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(B)V")
	private void method2646() {
		@Pc(8) int[] local8 = this.anIntArrayArray33[0];
		@Pc(17) int[] local17 = this.anIntArrayArray33[this.anIntArrayArray33.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray33[1];
		@Pc(39) int[] local39 = this.anIntArrayArray33[this.anIntArrayArray33.length - 1];
		this.anIntArray312 = new int[] { local17[0] + local17[0] - local39[0], local17[1] - local39[1] - -local17[1] };
		this.anIntArray313 = new int[] { local8[0] + local8[0] - local22[0], local8[1] - (local22[1] + -local8[1]) };
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3418 = arg1.method2962();
		this.anIntArrayArray33 = new int[arg1.method2962()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray33.length; local28++) {
			this.anIntArrayArray33[local28][0] = arg1.method2933();
			this.anIntArrayArray33[local28][1] = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		if (this.anIntArrayArray33 == null) {
			this.anIntArrayArray33 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray33.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3418 == 2) {
			this.method2646();
		}
		Static157.method2659();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)[I")
	private int[] method2647(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray313;
		} else if (arg0 >= this.anIntArrayArray33.length) {
			return this.anIntArray312;
		} else {
			return this.anIntArrayArray33[arg0];
		}
	}
}
