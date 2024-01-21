import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class4_Sub1_Sub1_Sub1_Sub2 extends Class4_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!nd", name = "uc", descriptor = "Lclient!ji;")
	public Class4_Sub1_Sub11 aClass4_Sub1_Sub11_1;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method2111() {
		return this.aClass4_Sub1_Sub11_1 != null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass4_Sub1_Sub11_1 == null) {
			return;
		}
		@Pc(21) Class4_Sub1_Sub4 local21 = super.anInt2808 != -1 && super.anInt2840 == 0 ? Static137.method2394(super.anInt2808) : null;
		@Pc(39) Class4_Sub1_Sub4 local39 = super.anInt2809 == -1 || super.anInt2816 == super.anInt2809 && local21 != null ? null : Static137.method2394(super.anInt2809);
		@Pc(50) Class4_Sub1_Sub1_Sub4 local50 = this.aClass4_Sub1_Sub11_1.method1747(local21, super.anInt2814, super.anInt2844, local39);
		if (local50 == null) {
			return;
		}
		local50.method2824();
		super.aShort29 = local50.aShort29;
		if (this.aClass4_Sub1_Sub11_1.aShort27 != 0 && this.aClass4_Sub1_Sub11_1.aShort26 != 0) {
			@Pc(71) int local71 = Class4_Sub1_Sub7_Sub4.anIntArray412[arg0];
			@Pc(75) short local75 = this.aClass4_Sub1_Sub11_1.aShort27;
			@Pc(80) int local80 = -local75 / 2;
			@Pc(84) int local84 = Class4_Sub1_Sub7_Sub4.anIntArray416[arg0];
			@Pc(88) short local88 = this.aClass4_Sub1_Sub11_1.aShort26;
			@Pc(92) int local92 = local75 / 2;
			@Pc(97) int local97 = -local88 / 2;
			@Pc(107) int local107 = local80 * local84 + local97 * local71 >> 16;
			@Pc(118) int local118 = local97 * local84 - local80 * local71 >> 16;
			@Pc(123) int local123 = -local88 / 2;
			@Pc(133) int local133 = local84 * local92 + local71 * local123 >> 16;
			@Pc(144) int local144 = local84 * local123 - local92 * local71 >> 16;
			@Pc(149) int local149 = -local75 / 2;
			@Pc(163) int local163 = Static106.method1998(super.anInt2832 + local107, Static73.anInt1873, super.anInt2803 + local118);
			@Pc(177) int local177 = Static106.method1998(super.anInt2832 + local133, Static73.anInt1873, super.anInt2803 + local144);
			@Pc(181) int local181 = local88 / 2;
			@Pc(191) int local191 = local149 * local84 + local181 * local71 >> 16;
			@Pc(202) int local202 = local84 * local181 - local71 * local149 >> 16;
			@Pc(206) int local206 = local75 / 2;
			@Pc(218) int local218 = Static106.method1998(local191 + super.anInt2832, Static73.anInt1873, super.anInt2803 + local202);
			@Pc(222) int local222 = local88 / 2;
			@Pc(233) int local233 = local222 * local84 - local206 * local71 >> 16;
			@Pc(244) int local244 = local71 * local222 + local84 * local206 >> 16;
			@Pc(256) int local256 = Static106.method1998(super.anInt2832 + local244, Static73.anInt1873, super.anInt2803 + local233);
			@Pc(267) int local267 = local256 > local218 ? local218 : local256;
			@Pc(278) int local278 = local177 >= local256 ? local256 : local177;
			@Pc(289) int local289 = local163 < local177 ? local163 : local177;
			@Pc(303) int local303 = (int) (Math.atan2((double) (local289 - local267), (double) local88) * 320.0D) & 0x7FF;
			local50.method2831(local303);
			@Pc(313) int local313 = local218 > local163 ? local163 : local218;
			@Pc(327) int local327 = (int) (Math.atan2((double) (local313 - local278), (double) local75) * 320.0D) & 0x7FF;
			@Pc(337) int local337 = (local313 + local278 + local267 + local289) / 4;
			local50.method2835(local327);
			local50.method2829(0, local337 - super.anInt2834, 0);
		}
		@Pc(351) Class4_Sub1_Sub1_Sub4 local351 = null;
		if (super.anInt2825 != -1 && super.anInt2827 != -1) {
			local351 = Static93.method1816(super.anInt2825).method1095(super.anInt2827);
			if (local351 != null) {
				local351.method2829(0, -super.anInt2807, 0);
			}
		}
		if (local351 != null) {
			local50 = ((Class4_Sub1_Sub1_Sub4_Sub1) local50).method2847(local351);
		}
		if (this.aClass4_Sub1_Sub11_1.anInt2251 == 1) {
			local50.aBoolean148 = true;
		}
		local50.method2821(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
