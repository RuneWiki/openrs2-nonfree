import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class8_Sub3_Sub2 extends Class8_Sub3 {

	@OriginalMember(owner = "client!se", name = "Tb", descriptor = "Lclient!kf;")
	public Class1_Sub3_Sub13 aClass1_Sub3_Sub13_1;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2681() {
		return this.aClass1_Sub3_Sub13_1 != null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		return super.anInt3598;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass1_Sub3_Sub13_1 == null) {
			return;
		}
		@Pc(25) Class1_Sub3_Sub20 local25 = super.anInt3575 != -1 && super.anInt3589 == 0 ? Static84.method1279(super.anInt3575) : null;
		@Pc(47) Class1_Sub3_Sub20 local47 = super.anInt3616 == -1 || super.anInt3616 == super.anInt3574 && local25 != null ? null : Static84.method1279(super.anInt3616);
		@Pc(58) Class8_Sub5 local58 = this.aClass1_Sub3_Sub13_1.method1580(super.anInt3566, local25, local47, super.anInt3570);
		if (local58 == null) {
			return;
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		super.anInt3598 = local58.method2668();
		@Pc(71) int local71 = 0;
		if (this.aClass1_Sub3_Sub13_1.aShort3 != 0 && this.aClass1_Sub3_Sub13_1.aShort4 != 0) {
			@Pc(89) int local89 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
			@Pc(93) int local93 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
			@Pc(97) short local97 = this.aClass1_Sub3_Sub13_1.aShort3;
			@Pc(101) short local101 = this.aClass1_Sub3_Sub13_1.aShort4;
			@Pc(106) int local106 = -local97 / 2;
			@Pc(111) int local111 = -local101 / 2;
			@Pc(121) int local121 = local93 * local106 + local89 * local111 >> 16;
			@Pc(132) int local132 = local93 * local111 - local89 * local106 >> 16;
			@Pc(136) int local136 = local97 / 2;
			@Pc(149) int local149 = Static64.method1027(local132 + super.anInt3606, super.anInt3600 - -local121, Static192.anInt4180);
			@Pc(154) int local154 = -local101 / 2;
			@Pc(165) int local165 = local154 * local93 - local136 * local89 >> 16;
			@Pc(176) int local176 = local89 * local154 + local136 * local93 >> 16;
			@Pc(189) int local189 = Static64.method1027(super.anInt3606 + local165, local176 + super.anInt3600, Static192.anInt4180);
			@Pc(194) int local194 = -local97 / 2;
			@Pc(198) int local198 = local101 / 2;
			@Pc(208) int local208 = local198 * local89 + local93 * local194 >> 16;
			@Pc(219) int local219 = local93 * local198 - local89 * local194 >> 16;
			@Pc(223) int local223 = local97 / 2;
			@Pc(227) int local227 = local101 / 2;
			@Pc(239) int local239 = Static64.method1027(super.anInt3606 + local219, super.anInt3600 + local208, Static192.anInt4180);
			@Pc(249) int local249 = local227 * local89 + local93 * local223 >> 16;
			@Pc(260) int local260 = local227 * local93 - local223 * local89 >> 16;
			@Pc(271) int local271 = local189 > local149 ? local149 : local189;
			@Pc(283) int local283 = Static64.method1027(local260 + super.anInt3606, super.anInt3600 + local249, Static192.anInt4180);
			local63 = local283 + local149;
			if (local189 + local239 < local63) {
				local63 = local239 + local189;
			}
			@Pc(307) int local307 = local283 <= local239 ? local283 : local239;
			@Pc(314) int local314 = local283 <= local189 ? local283 : local189;
			local65 = (int) (Math.atan2((double) (local271 - local307), (double) local101) * 325.95D) & 0x7FF;
			if (local65 != 0) {
				local58.method2045(local65);
			}
			@Pc(344) int local344 = local239 > local149 ? local149 : local239;
			local71 = (int) (Math.atan2((double) (local344 - local314), (double) local97) * 325.95D) & 0x7FF;
			if (local71 != 0) {
				local58.method2050(local71);
			}
			local63 = (local63 >> 1) - super.anInt3563;
			if (local63 != 0) {
				local58.method2039(0, local63, 0);
			}
		}
		@Pc(381) Class8_Sub5 local381 = null;
		if (super.anInt3564 != -1 && super.anInt3608 != -1) {
			@Pc(395) Class1_Sub3_Sub11 local395 = Static116.method1724(super.anInt3564);
			local381 = local395.method1317(super.anInt3608);
			if (local381 != null) {
				local381.method2039(0, -super.anInt3591, 0);
				if (local395.aBoolean113) {
					if (local65 != 0) {
						local381.method2045(local65);
					}
					if (local71 != 0) {
						local381.method2050(local71);
					}
					if (local63 != 0) {
						local381.method2039(0, local63, 0);
					}
				}
			}
		}
		if (local381 != null) {
			local58 = ((Class8_Sub5_Sub1) local58).method2057(local381);
		}
		if (this.aClass1_Sub3_Sub13_1.anInt2256 == 1) {
			local58.aBoolean163 = true;
		}
		local58.method2672(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
