import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	public static int anInt6270;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_52 = new Class126(64);

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_97 = new Class217(34, 7);

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!nr;")
	public static final Class3_Sub33 aClass3_Sub33_1 = new Class3_Sub33(0, 0);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIILclient!qa;I)V")
	public static void method4870(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class172 arg3, @OriginalArg(5) int arg4) {
		arg3.pa(arg2, arg0, arg2 + arg1, arg0 - -arg4);
		arg3.method5507(-16777216, arg4, arg2, arg0, arg1);
		if (Static66.anInt1702 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static144.anInt5411 / (float) Static144.anInt5421;
		@Pc(36) int local36 = arg1;
		@Pc(38) int local38 = arg4;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg1);
		} else {
			local36 = (int) ((float) arg4 / local34);
		}
		@Pc(65) int local65 = arg2 + (arg1 - local36) / 2;
		@Pc(79) int local79 = arg0 + (arg4 - local38) / 2;
		if (Static72.aClass8_5 == null || arg1 != Static72.aClass8_5.UA() || Static72.aClass8_5.qa() != arg4) {
			Static144.method4245(Static144.anInt5410, Static144.anInt5420 + Static144.anInt5411, Static144.anInt5410 - -Static144.anInt5421, Static144.anInt5420, local65, local79, local36 + local65, local79 - -local38);
			Static144.method4250(arg3);
			Static72.aClass8_5 = arg3.method5481(local65, local79, local36, local38, false);
		}
		Static72.aClass8_5.method6001(local65, local79);
		@Pc(132) int local132 = Static175.anInt7347 * local36 / Static144.anInt5421;
		@Pc(138) int local138 = local38 * Static240.anInt4579 / Static144.anInt5411;
		@Pc(146) int local146 = local36 * Static437.anInt7373 / Static144.anInt5421 + local65;
		@Pc(158) int local158 = local79 + local38 - local38 * Static67.anInt1705 / Static144.anInt5411 - local138;
		@Pc(160) int local160 = -1996554240;
		if (Static57.aClass183_3 == Static297.aClass183_4) {
			local160 = -1996488705;
		}
		arg3.NA(local146, local158, local132, local138, local160, 1);
		arg3.method5484(local146, local158, local132, local138, local160, 0);
		if (Static374.anInt6289 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static238.anInt4569 <= 50) {
			local193 = Static238.anInt4569 * 5;
		} else {
			local193 = (100 - Static238.anInt4569) * 5;
		}
		for (@Pc(207) Class3_Sub26 local207 = (Class3_Sub26) Static144.aClass243_33.method5208(); local207 != null; local207 = (Class3_Sub26) Static144.aClass243_33.method5203()) {
			@Pc(215) Class90 local215 = Static144.aClass171_4.method3940(local207.anInt3892);
			if (Static64.method1303(local215)) {
				@Pc(244) int local244;
				@Pc(255) int local255;
				if (Static128.anInt2675 == local207.anInt3892) {
					local244 = local207.anInt3895 * local36 / Static144.anInt5421 + local65;
					local255 = local79 + (Static144.anInt5411 - local207.anInt3891) * local38 / Static144.anInt5411;
					arg3.method5507(local193 << 24 | 0xFFFF00, 4, local244 - 2, local255 - 2, 4);
				} else if (Static233.anInt4469 != -1 && Static233.anInt4469 == local215.anInt2698) {
					local244 = local207.anInt3895 * local36 / Static144.anInt5421 + local65;
					local255 = (Static144.anInt5411 - local207.anInt3891) * local38 / Static144.anInt5411 + local79;
					arg3.method5507(local193 << 24 | 0xFFFF00, 4, local244 - 2, local255 + -2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)I")
	public static int method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public static void method4873() {
		Static166.aClass172_6.ua(((float) Static374.aClass20_Sub1_1.anInt2346 * 0.1F + 0.7F) * 1.1523438F);
		Static166.aClass172_6.XA(Static407.anInt6698, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static166.aClass172_6.V(Static219.anInt4146, -1, 256);
		Static166.aClass172_6.method5530(Static328.aClass23_5);
	}
}
