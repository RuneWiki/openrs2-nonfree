import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class2_Sub2_Sub3_Sub7_Sub1 extends Class2_Sub2_Sub3_Sub7 {

	@OriginalMember(owner = "client!p", name = "xc", descriptor = "Lclient!sd;")
	public Class2_Sub2_Sub15 aClass2_Sub2_Sub15_1;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass2_Sub2_Sub15_1 == null) {
			return;
		}
		@Pc(21) Class2_Sub2_Sub4 local21 = super.anInt3568 != -1 && super.anInt3548 == 0 ? Static29.method543(super.anInt3568) : null;
		@Pc(43) Class2_Sub2_Sub4 local43 = super.anInt3554 == -1 || super.anInt3554 == super.anInt3525 && local21 != null ? null : Static29.method543(super.anInt3554);
		@Pc(54) Class2_Sub2_Sub3_Sub4 local54 = this.aClass2_Sub2_Sub15_1.method2479(local21, super.anInt3550, super.anInt3538, local43);
		if (local54 == null) {
			return;
		}
		local54.method1042();
		super.aShort34 = local54.aShort34;
		if (this.aClass2_Sub2_Sub15_1.aShort33 != 0 && this.aClass2_Sub2_Sub15_1.aShort32 != 0) {
			@Pc(78) int local78 = Class2_Sub2_Sub2_Sub4.anIntArray217[arg0];
			@Pc(82) int local82 = Class2_Sub2_Sub2_Sub4.anIntArray218[arg0];
			@Pc(86) short local86 = this.aClass2_Sub2_Sub15_1.aShort32;
			@Pc(91) int local91 = -local86 / 2;
			@Pc(95) short local95 = this.aClass2_Sub2_Sub15_1.aShort33;
			@Pc(100) int local100 = -local95 / 2;
			@Pc(111) int local111 = local78 * local91 + local100 * local82 >> 16;
			@Pc(115) int local115 = local95 / 2;
			@Pc(126) int local126 = local91 * local82 - local100 * local78 >> 16;
			@Pc(140) int local140 = Static18.method346(super.anInt3578 + local126, Static66.anInt1396, super.anInt3529 + local111);
			@Pc(145) int local145 = -local86 / 2;
			@Pc(155) int local155 = local115 * local82 + local145 * local78 >> 16;
			@Pc(165) int local165 = local82 * local145 - local78 * local115 >> 16;
			@Pc(170) int local170 = -local95 / 2;
			@Pc(182) int local182 = Static18.method346(local165 + super.anInt3578, Static66.anInt1396, local155 + super.anInt3529);
			@Pc(186) int local186 = local86 / 2;
			@Pc(196) int local196 = local78 * local186 + local82 * local170 >> 16;
			@Pc(200) int local200 = local86 / 2;
			@Pc(211) int local211 = local186 * local82 - local170 * local78 >> 16;
			@Pc(215) int local215 = local95 / 2;
			@Pc(226) int local226 = local200 * local82 - local215 * local78 >> 16;
			@Pc(236) int local236 = local215 * local82 + local78 * local200 >> 16;
			@Pc(248) int local248 = Static18.method346(local211 + super.anInt3578, Static66.anInt1396, local196 + super.anInt3529);
			@Pc(261) int local261 = Static18.method346(super.anInt3578 + local226, Static66.anInt1396, super.anInt3529 + local236);
			@Pc(268) int local268 = local182 <= local140 ? local182 : local140;
			@Pc(279) int local279 = local261 <= local248 ? local261 : local248;
			@Pc(290) int local290 = local182 >= local261 ? local261 : local182;
			@Pc(301) int local301 = local140 < local248 ? local140 : local248;
			@Pc(315) int local315 = (int) (Math.atan2((double) (local268 - local279), (double) local86) * 320.0D) & 0x7FF;
			@Pc(326) int local326 = (local301 + local279 + local268 + local290) / 4;
			local54.method1043(local315);
			@Pc(343) int local343 = (int) (Math.atan2((double) (local301 - local290), (double) local95) * 320.0D) & 0x7FF;
			local54.method1044(local343);
			local54.method1046(0, local326 - super.anInt3558, 0);
		}
		@Pc(357) Class2_Sub2_Sub3_Sub4 local357 = null;
		if (super.anInt3557 != -1 && super.anInt3569 != -1) {
			local357 = Static170.method2831(super.anInt3557).method1698(super.anInt3569);
			if (local357 != null) {
				local357.method1046(0, -super.anInt3577, 0);
			}
		}
		if (local357 != null) {
			local54 = ((Class2_Sub2_Sub3_Sub4_Sub1) local54).method1064(local357);
		}
		if (this.aClass2_Sub2_Sub15_1.anInt3209 == 1) {
			local54.aBoolean52 = true;
		}
		local54.method2726(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2733() {
		return this.aClass2_Sub2_Sub15_1 != null;
	}
}
