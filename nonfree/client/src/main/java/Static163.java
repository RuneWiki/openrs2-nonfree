import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_48 = new Class57("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public static int anInt2727 = 0;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!us;")
	public static final Class234 aClass234_60 = new Class234(98, 17);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!np;)V")
	public static void method2303(@OriginalArg(1) Class155 arg0) {
		if (Static287.aBoolean397) {
			Static240.method4883(arg0);
		} else {
			Static381.method5664(arg0);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
	public static void method2304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg2 - arg1;
		@Pc(19) int local19 = arg4 - arg0;
		if (local19 == 0) {
			if (local14 != 0) {
				Static337.method5117(arg3, arg2, arg0, arg1);
			}
		} else if (local14 == 0) {
			Static226.method3727(arg4, arg1, arg0, arg3);
		} else {
			if (local19 < 0) {
				local19 = -local19;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(69) boolean local69 = local19 < local14;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local69) {
				local73 = arg0;
				local75 = arg4;
				arg0 = arg1;
				arg4 = arg2;
				arg1 = local73;
				arg2 = local75;
			}
			if (arg4 < arg0) {
				local73 = arg0;
				local75 = arg1;
				arg0 = arg4;
				arg4 = local73;
				arg1 = arg2;
				arg2 = local75;
			}
			local73 = arg1;
			local75 = arg4 - arg0;
			@Pc(113) int local113 = arg2 - arg1;
			@Pc(118) int local118 = -(local75 >> 1);
			@Pc(125) int local125 = arg1 >= arg2 ? -1 : 1;
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(137) int local137;
			if (local69) {
				for (local137 = arg0; local137 <= arg4; local137++) {
					Static325.anIntArrayArray50[local137][local73] = arg3;
					local118 += local113;
					if (local118 > 0) {
						local118 -= local75;
						local73 += local125;
					}
				}
			} else {
				for (local137 = arg0; local137 <= arg4; local137++) {
					local118 += local113;
					Static325.anIntArrayArray50[local73][local137] = arg3;
					if (local118 > 0) {
						local118 -= local75;
						local73 += local125;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!np;Z)V")
	public static void method2305(@OriginalArg(0) Class155 arg0) {
		if (Static12.aClass138_3.method3058() == 0) {
			return;
		}
		@Pc(55) Class3_Sub38 local55;
		if (Static2.anInt68 == 0) {
			for (local55 = (Class3_Sub38) Static12.aClass138_3.method3051(); local55 != null; local55 = (Class3_Sub38) Static12.aClass138_3.method3050()) {
				Static176.aClass78_3.method1650(local55.anInt5735, arg0, false, local55.aBoolean438 ? Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1 : null, local55.anInt5734, local55.anInt5731, local55.anInt5737, Static71.aClass150_1, local55.anInt5733, false, arg0);
				local55.method5700();
			}
			Static71.method1197();
			return;
		}
		if (Static313.aClass155_8 == null) {
			@Pc(25) Canvas local25 = new Canvas();
			local25.setSize(36, 32);
			Static313.aClass155_8 = Static240.method4934(0, local25, Static61.aClass156_1, Static12.anInterface10_1, 0);
			Static358.aClass150_5 = Static313.aClass155_8.method4888(Static93.method1548(Static368.aClass20_95, Static126.anInt2390), Static402.method2809(Static77.aClass20_19, Static126.anInt2390));
		}
		for (local55 = (Class3_Sub38) Static12.aClass138_3.method3051(); local55 != null; local55 = (Class3_Sub38) Static12.aClass138_3.method3050()) {
			Static176.aClass78_3.method1650(local55.anInt5735, Static313.aClass155_8, false, local55.aBoolean438 ? Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1 : null, local55.anInt5734, local55.anInt5731, local55.anInt5737, Static358.aClass150_5, local55.anInt5733, false, arg0);
			local55.method5700();
		}
	}
}
