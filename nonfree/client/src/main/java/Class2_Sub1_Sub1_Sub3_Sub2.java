import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub1_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!nb", name = "pc", descriptor = "Lclient!ai;")
	public Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		return super.anInt3266;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass2_Sub1_Sub2_1 == null) {
			return;
		}
		@Pc(25) Class2_Sub1_Sub5 local25 = super.anInt3270 != -1 && super.anInt3280 == 0 ? Static103.method2357(super.anInt3270) : null;
		@Pc(47) Class2_Sub1_Sub5 local47 = super.anInt3250 == -1 || super.anInt3289 == super.anInt3250 && local25 != null ? null : Static103.method2357(super.anInt3250);
		@Pc(58) Class2_Sub1_Sub1_Sub4 local58 = this.aClass2_Sub1_Sub2_1.method278(super.anInt3301, local25, local47, super.anInt3290);
		if (local58 == null) {
			return;
		}
		super.anInt3266 = local58.method3179();
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = 0;
		if (this.aClass2_Sub1_Sub2_1.aShort1 != 0 && this.aClass2_Sub1_Sub2_1.aShort2 != 0) {
			@Pc(89) int local89 = Class2_Sub1_Sub7_Sub1.anIntArray133[arg0];
			@Pc(93) int local93 = Class2_Sub1_Sub7_Sub1.anIntArray129[arg0];
			@Pc(97) short local97 = this.aClass2_Sub1_Sub2_1.aShort1;
			@Pc(101) short local101 = this.aClass2_Sub1_Sub2_1.aShort2;
			@Pc(106) int local106 = -local101 / 2;
			@Pc(111) int local111 = -local97 / 2;
			@Pc(121) int local121 = local93 * local106 - local89 * local111 >> 16;
			@Pc(131) int local131 = local111 * local93 + local106 * local89 >> 16;
			@Pc(144) int local144 = Static182.method3393(Static62.anInt1923, local131 + super.anInt3302, super.anInt3273 - -local121);
			@Pc(148) int local148 = local97 / 2;
			@Pc(153) int local153 = -local101 / 2;
			@Pc(163) int local163 = local148 * local93 + local153 * local89 >> 16;
			@Pc(173) int local173 = local153 * local93 - local148 * local89 >> 16;
			@Pc(178) int local178 = -local97 / 2;
			@Pc(191) int local191 = Static182.method3393(Static62.anInt1923, super.anInt3302 + local163, local173 + super.anInt3273);
			@Pc(195) int local195 = local101 / 2;
			@Pc(205) int local205 = local178 * local93 + local195 * local89 >> 16;
			@Pc(209) int local209 = local101 / 2;
			@Pc(220) int local220 = local195 * local93 - local89 * local178 >> 16;
			@Pc(233) int local233 = Static182.method3393(Static62.anInt1923, super.anInt3302 + local205, local220 + super.anInt3273);
			@Pc(237) int local237 = local97 / 2;
			@Pc(247) int local247 = local93 * local237 + local89 * local209 >> 16;
			@Pc(258) int local258 = local209 * local93 - local89 * local237 >> 16;
			@Pc(265) int local265 = local144 >= local191 ? local191 : local144;
			@Pc(277) int local277 = Static182.method3393(Static62.anInt1923, local247 + super.anInt3302, local258 + super.anInt3273);
			local69 = local277 + local144;
			if (local191 + local233 < local69) {
				local69 = local233 + local191;
			}
			@Pc(298) int local298 = local233 >= local277 ? local277 : local233;
			local71 = (int) (Math.atan2((double) (local265 - local298), (double) local101) * 325.95D) & 0x7FF;
			if (local71 != 0) {
				local58.method1616(local71);
			}
			@Pc(327) int local327 = local277 > local191 ? local191 : local277;
			@Pc(338) int local338 = local144 >= local233 ? local233 : local144;
			local67 = (int) (Math.atan2((double) (local338 - local327), (double) local97) * 325.95D) & 0x7FF;
			if (local67 != 0) {
				local58.method1618(local67);
			}
			local69 = (local69 >> 1) - super.anInt3283;
			if (local69 != 0) {
				local58.method1622(0, local69, 0);
			}
		}
		@Pc(376) Class2_Sub1_Sub1_Sub4 local376 = null;
		if (super.anInt3249 != -1 && super.anInt3297 != -1) {
			@Pc(390) Class2_Sub1_Sub14 local390 = Static101.method2313(super.anInt3249);
			local376 = local390.method2261(super.anInt3297);
			if (local376 != null) {
				local376.method1622(0, -super.anInt3251, 0);
				if (local390.aBoolean110) {
					if (local71 != 0) {
						local376.method1616(local71);
					}
					if (local67 != 0) {
						local376.method1618(local67);
					}
					if (local69 != 0) {
						local376.method1622(0, local69, 0);
					}
				}
			}
		}
		if (local376 != null) {
			local58 = ((Class2_Sub1_Sub1_Sub4_Sub1) local58).method1626(local376);
		}
		if (this.aClass2_Sub1_Sub2_1.anInt343 == 1) {
			local58.aBoolean89 = true;
		}
		local58.method3173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2554() {
		return this.aClass2_Sub1_Sub2_1 != null;
	}
}
