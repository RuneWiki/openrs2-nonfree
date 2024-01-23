import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_6;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_300 = Static186.method3527("Lade Texturen )2 ");

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_301 = Static186.method3527("http:)4)4");

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_302 = null;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt832 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!rc;IIIIIIZ)V")
	public static void method609(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray418.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray418[local5] - Static85.anInt1761;
			local20 = arg0.anIntArray410[local5] - Static131.anInt2716;
			local27 = arg0.anIntArray407[local5] - Static221.anInt4311;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray416 != null) {
				Static180.anIntArray406[local5] = local37;
				Static180.anIntArray419[local5] = local59;
				Static180.anIntArray413[local5] = local69;
			}
			Static180.anIntArray412[local5] = Static215.anInt4264 + (local37 << 9) / local69;
			Static180.anIntArray415[local5] = Static215.anInt4266 + (local59 << 9) / local69;
		}
		Static215.anInt4265 = 0;
		local3 = arg0.anIntArray420.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray420[local13];
			local27 = arg0.anIntArray408[local13];
			local37 = arg0.anIntArray414[local13];
			@Pc(142) int local142 = Static180.anIntArray412[local20];
			@Pc(146) int local146 = Static180.anIntArray412[local27];
			@Pc(150) int local150 = Static180.anIntArray412[local37];
			@Pc(154) int local154 = Static180.anIntArray415[local20];
			@Pc(158) int local158 = Static180.anIntArray415[local27];
			@Pc(162) int local162 = Static180.anIntArray415[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static183.aBoolean171 && Static18.method267(Static58.anInt1157 + Static215.anInt4264, Static145.anInt2964 + Static215.anInt4266, local154, local158, local162, local142, local146, local150)) {
					Static218.anInt3570 = arg5;
					Static63.anInt1255 = arg6;
				}
				if (!arg7) {
					Static215.aBoolean203 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static215.anInt4267 || local146 > Static215.anInt4267 || local150 > Static215.anInt4267) {
						Static215.aBoolean203 = true;
					}
					if (arg0.anIntArray416 == null || arg0.anIntArray416[local13] == -1) {
						if (arg0.anIntArray417[local13] != 12345678) {
							Static215.method3358(local154, local158, local162, local142, local146, local150, arg0.anIntArray417[local13], arg0.anIntArray409[local13], arg0.anIntArray411[local13]);
						}
					} else if (!Static148.aBoolean130) {
						@Pc(369) int local369 = Static215.anInterface4_3.method2508(arg0.anIntArray416[local13]);
						Static215.method3358(local154, local158, local162, local142, local146, local150, Static52.method2675(local369, arg0.anIntArray417[local13]), Static52.method2675(local369, arg0.anIntArray409[local13]), Static52.method2675(local369, arg0.anIntArray411[local13]));
					} else if (arg0.aBoolean169) {
						Static215.method3364(local154, local158, local162, local142, local146, local150, arg0.anIntArray417[local13], arg0.anIntArray409[local13], arg0.anIntArray411[local13], Static180.anIntArray406[0], Static180.anIntArray406[1], Static180.anIntArray406[3], Static180.anIntArray419[0], Static180.anIntArray419[1], Static180.anIntArray419[3], Static180.anIntArray413[0], Static180.anIntArray413[1], Static180.anIntArray413[3], arg0.anIntArray416[local13]);
					} else {
						Static215.method3364(local154, local158, local162, local142, local146, local150, arg0.anIntArray417[local13], arg0.anIntArray409[local13], arg0.anIntArray411[local13], Static180.anIntArray406[local20], Static180.anIntArray406[local27], Static180.anIntArray406[local37], Static180.anIntArray419[local20], Static180.anIntArray419[local27], Static180.anIntArray419[local37], Static180.anIntArray413[local20], Static180.anIntArray413[local27], Static180.anIntArray413[local37], arg0.anIntArray416[local13]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method611() {
		Static24.method343();
		Static105.method1611();
		Static68.method1005();
		Static189.method3112();
		Static175.method2897();
		Static234.method3537();
		Static210.method3285();
		Static207.method3273();
		Static70.method1016();
		Static5.method74();
		Static59.method901();
		Static185.method3086();
		Static173.method2876();
		Static134.method2261();
		Static164.aClass84_28.method2577(5);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIB)V")
	public static void method612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static49.anInt1030 = 0;
		Static131.anInt2713 = 0;
		Static135.anInt2790 = arg0;
		Static177.anInt3701 = arg1;
	}
}
