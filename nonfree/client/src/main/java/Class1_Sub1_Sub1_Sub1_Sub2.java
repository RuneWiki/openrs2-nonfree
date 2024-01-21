import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ic", name = "yc", descriptor = "Lclient!gb;")
	public Class1_Sub1_Sub9 aClass1_Sub1_Sub9_1;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method1222() {
		return this.aClass1_Sub1_Sub9_1 != null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method3156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass1_Sub1_Sub9_1 == null) {
			return;
		}
		@Pc(24) Class1_Sub1_Sub18 local24 = super.anInt1842 != -1 && super.anInt1846 == 0 ? Static157.method2652(super.anInt1842) : null;
		@Pc(42) Class1_Sub1_Sub18 local42 = super.anInt1835 == -1 || super.anInt1835 == super.anInt1823 && local24 != null ? null : Static157.method2652(super.anInt1835);
		@Pc(53) Class1_Sub1_Sub1_Sub2 local53 = this.aClass1_Sub1_Sub9_1.method984(super.anInt1837, super.anInt1849, local24, local42);
		if (local53 == null) {
			return;
		}
		local53.method1085();
		super.aShort36 = local53.aShort36;
		if (this.aClass1_Sub1_Sub9_1.aShort7 != 0 && this.aClass1_Sub1_Sub9_1.aShort6 != 0) {
			@Pc(80) int local80 = Class1_Sub1_Sub12_Sub2.anIntArray417[arg0];
			@Pc(84) int local84 = Class1_Sub1_Sub12_Sub2.anIntArray416[arg0];
			@Pc(88) short local88 = this.aClass1_Sub1_Sub9_1.aShort7;
			@Pc(92) short local92 = this.aClass1_Sub1_Sub9_1.aShort6;
			@Pc(97) int local97 = -local92 / 2;
			@Pc(102) int local102 = -local88 / 2;
			@Pc(106) int local106 = local88 / 2;
			@Pc(111) int local111 = -local92 / 2;
			@Pc(122) int local122 = local97 * local80 - local102 * local84 >> 16;
			@Pc(132) int local132 = local84 * local97 + local102 * local80 >> 16;
			@Pc(142) int local142 = local111 * local84 + local106 * local80 >> 16;
			@Pc(154) int local154 = Static99.method1680(local122 + super.anInt1825, local132 + super.anInt1838, Static85.anInt2267);
			@Pc(158) int local158 = local92 / 2;
			@Pc(169) int local169 = local111 * local80 - local106 * local84 >> 16;
			@Pc(181) int local181 = Static99.method1680(super.anInt1825 + local169, local142 + super.anInt1838, Static85.anInt2267);
			@Pc(186) int local186 = -local88 / 2;
			@Pc(197) int local197 = local80 * local158 - local84 * local186 >> 16;
			@Pc(207) int local207 = local80 * local186 + local84 * local158 >> 16;
			@Pc(220) int local220 = Static99.method1680(super.anInt1825 + local197, super.anInt1838 + local207, Static85.anInt2267);
			@Pc(224) int local224 = local88 / 2;
			@Pc(228) int local228 = local92 / 2;
			@Pc(238) int local238 = local80 * local224 + local228 * local84 >> 16;
			@Pc(249) int local249 = local80 * local228 - local84 * local224 >> 16;
			@Pc(262) int local262 = Static99.method1680(super.anInt1825 + local249, super.anInt1838 + local238, Static85.anInt2267);
			@Pc(269) int local269 = local154 >= local181 ? local181 : local154;
			@Pc(276) int local276 = local220 >= local262 ? local262 : local220;
			@Pc(290) int local290 = (int) (Math.atan2((double) (local269 - local276), (double) local92) * 320.0D) & 0x7FF;
			@Pc(297) int local297 = local181 >= local262 ? local262 : local181;
			@Pc(304) int local304 = local154 < local220 ? local154 : local220;
			local53.method1079(local290);
			@Pc(320) int local320 = (int) (Math.atan2((double) (local304 - local297), (double) local88) * 320.0D) & 0x7FF;
			@Pc(330) int local330 = (local304 + local297 + local276 + local269) / 4;
			local53.method1084(local320);
			local53.method1073(0, local330 - super.anInt1832, 0);
		}
		@Pc(344) Class1_Sub1_Sub1_Sub2 local344 = null;
		if (super.anInt1853 != -1 && super.anInt1822 != -1) {
			local344 = Static13.method251(super.anInt1853).method2919(super.anInt1822);
			if (local344 != null) {
				local344.method1073(0, -super.anInt1855, 0);
			}
		}
		if (local344 != null) {
			local53 = ((Class1_Sub1_Sub1_Sub2_Sub1) local53).method1088(local344);
		}
		if (this.aClass1_Sub1_Sub9_1.anInt1540 == 1) {
			local53.aBoolean79 = true;
		}
		local53.method3156(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
