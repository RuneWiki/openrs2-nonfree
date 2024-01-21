import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!g", name = "mc", descriptor = "Lclient!sj;")
	public Class5_Sub2_Sub20 aClass5_Sub2_Sub20_1;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method1741() {
		return this.aClass5_Sub2_Sub20_1 != null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		return super.anInt2248;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass5_Sub2_Sub20_1 == null) {
			return;
		}
		@Pc(25) Class5_Sub2_Sub22 local25 = super.anInt2254 != -1 && super.anInt2262 == 0 ? Static14.method253(super.anInt2254) : null;
		@Pc(47) Class5_Sub2_Sub22 local47 = super.anInt2215 == -1 || super.anInt2216 == super.anInt2215 && local25 != null ? null : Static14.method253(super.anInt2215);
		@Pc(58) Class1_Sub1 local58 = this.aClass5_Sub2_Sub20_1.method2719(local25, super.anInt2265, super.anInt2222, local47);
		if (local58 == null) {
			return;
		}
		super.anInt2248 = local58.method2449();
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = 0;
		if (this.aClass5_Sub2_Sub20_1.aShort43 != 0 && this.aClass5_Sub2_Sub20_1.aShort42 != 0) {
			@Pc(86) int local86 = Class80.anIntArray324[arg0];
			@Pc(90) int local90 = Class80.anIntArray327[arg0];
			@Pc(94) short local94 = this.aClass5_Sub2_Sub20_1.aShort43;
			@Pc(98) short local98 = this.aClass5_Sub2_Sub20_1.aShort42;
			@Pc(103) int local103 = -local94 / 2;
			@Pc(108) int local108 = -local98 / 2;
			@Pc(119) int local119 = local108 * local90 - local86 * local103 >> 16;
			@Pc(123) int local123 = local94 / 2;
			@Pc(128) int local128 = -local98 / 2;
			@Pc(138) int local138 = local90 * local123 + local86 * local128 >> 16;
			@Pc(142) int local142 = local98 / 2;
			@Pc(153) int local153 = local86 * local108 + local103 * local90 >> 16;
			@Pc(163) int local163 = local128 * local90 - local123 * local86 >> 16;
			@Pc(176) int local176 = Static128.method1999(Static111.anInt2327, local153 + super.anInt2241, super.anInt2234 - -local119);
			@Pc(188) int local188 = Static128.method1999(Static111.anInt2327, super.anInt2241 + local138, local163 + super.anInt2234);
			@Pc(193) int local193 = -local94 / 2;
			@Pc(203) int local203 = local86 * local142 + local90 * local193 >> 16;
			@Pc(213) int local213 = local90 * local142 - local86 * local193 >> 16;
			@Pc(225) int local225 = Static128.method1999(Static111.anInt2327, local203 + super.anInt2241, super.anInt2234 + local213);
			@Pc(229) int local229 = local94 / 2;
			@Pc(233) int local233 = local98 / 2;
			@Pc(243) int local243 = local86 * local233 + local90 * local229 >> 16;
			@Pc(253) int local253 = local233 * local90 - local86 * local229 >> 16;
			@Pc(264) int local264 = local176 >= local225 ? local225 : local176;
			@Pc(271) int local271 = local188 > local176 ? local176 : local188;
			@Pc(283) int local283 = Static128.method1999(Static111.anInt2327, local243 + super.anInt2241, local253 + super.anInt2234);
			@Pc(290) int local290 = local283 <= local188 ? local283 : local188;
			@Pc(297) int local297 = local225 < local283 ? local225 : local283;
			local69 = (int) (Math.atan2((double) (local271 - local297), (double) local98) * 325.95D) & 0x7FF;
			local71 = local283 + local176;
			if (local69 != 0) {
				local58.method674(local69);
			}
			local67 = (int) (Math.atan2((double) (local264 - local290), (double) local94) * 325.95D) & 0x7FF;
			if (local67 != 0) {
				local58.method663(local67);
			}
			if (local188 + local225 < local71) {
				local71 = local188 + local225;
			}
			local71 = (local71 >> 1) - super.anInt2231;
			if (local71 != 0) {
				local58.method668(0, local71, 0);
			}
		}
		@Pc(372) Class1_Sub1 local372 = null;
		if (super.anInt2266 != -1 && super.anInt2255 != -1) {
			@Pc(387) Class5_Sub2_Sub17 local387 = Static181.method2739(super.anInt2266);
			local372 = local387.method2506(super.anInt2255);
			if (local372 != null) {
				local372.method668(0, -super.anInt2225, 0);
				if (local387.aBoolean146) {
					if (local69 != 0) {
						local372.method674(local69);
					}
					if (local67 != 0) {
						local372.method663(local67);
					}
					if (local71 != 0) {
						local372.method668(0, local71, 0);
					}
				}
			}
		}
		if (local372 != null) {
			local58 = ((Class1_Sub1_Sub1) local58).method679(local372);
		}
		if (this.aClass5_Sub2_Sub20_1.anInt3610 == 1) {
			local58.aBoolean51 = true;
		}
		local58.method2445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
