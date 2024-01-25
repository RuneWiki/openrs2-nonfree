import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	public static int anInt6021;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
	public static int anInt6025;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Lclient!pm;")
	public static Class201 aClass201_7;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_99 = new Class231("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)B")
	public static byte method5045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method5047(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZIBZI)V")
	public static void method5049(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg3 == Static371.anInt6170 && Static80.anInt1561 == arg1 && (Static3.anInt6323 == Static4.anInt30 || Static8.aClass173_Sub1_1.method3965(Static155.anInt2774))) {
			return;
		}
		Static80.anInt1561 = arg1;
		Static3.anInt6323 = Static4.anInt30;
		Static371.anInt6170 = arg3;
		if (Static8.aClass173_Sub1_1.method3965(Static155.anInt2774)) {
			Static3.anInt6323 = 0;
		}
		if (arg2) {
			Static260.method4007(28);
		} else {
			Static260.method4007(25);
		}
		Static94.method1630(true, Static60.aClass92_2, Static306.aClass231_61.method5138(Static382.anInt6289));
		@Pc(61) int local61 = Static206.anInt3592;
		@Pc(63) int local63 = Static99.anInt1814;
		Static206.anInt3592 = (Static371.anInt6170 - (Static84.anInt1632 >> 4)) * 8;
		Static99.anInt1814 = (Static80.anInt1561 - (Static261.anInt4480 >> 4)) * 8;
		Static167.aClass6_Sub1_Sub4_3 = Static36.method2058(Static371.anInt6170 * 8, Static80.anInt1561 * 8);
		Static63.aClass267_2 = null;
		@Pc(95) int local95 = Static206.anInt3592 - local61;
		@Pc(105) int local105 = Static99.anInt1814 - local63;
		@Pc(115) int local115;
		@Pc(123) int local123;
		if (arg2) {
			Static147.anInt7038 = 0;
			local115 = (Static84.anInt1632 - 1) * 128;
			@Pc(121) int local121 = (Static261.anInt4480 - 1) * 128;
			for (local123 = 0; local123 < 32768; local123++) {
				@Pc(129) Class3_Sub3_Sub6_Sub2 local129 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local123];
				if (local129 != null) {
					local129.anInt6675 -= local95 * 128;
					local129.anInt6677 -= local105 * 128;
					if (local129.anInt6675 >= 0 && local129.anInt6675 <= local115 && local129.anInt6677 >= 0 && local121 >= local129.anInt6677) {
						@Pc(182) boolean local182 = true;
						for (@Pc(184) int local184 = 0; local184 < 10; local184++) {
							local129.anIntArray582[local184] -= local95;
							local129.anIntArray583[local184] -= local105;
							if (local129.anIntArray582[local184] < 0 || local129.anIntArray582[local184] >= Static84.anInt1632 || local129.anIntArray583[local184] < 0 || local129.anIntArray583[local184] >= Static261.anInt4480) {
								local182 = false;
							}
						}
						if (local182) {
							Static345.anIntArray507[Static147.anInt7038++] = local123;
						} else {
							Static450.aClass3_Sub3_Sub6_Sub2Array1[local123].method5529(null);
							Static450.aClass3_Sub3_Sub6_Sub2Array1[local123] = null;
						}
					} else {
						Static450.aClass3_Sub3_Sub6_Sub2Array1[local123].method5529(null);
						Static450.aClass3_Sub3_Sub6_Sub2Array1[local123] = null;
					}
				}
			}
		} else {
			for (local115 = 0; local115 < 32768; local115++) {
				@Pc(273) Class3_Sub3_Sub6_Sub2 local273 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local115];
				if (local273 != null) {
					for (local123 = 0; local123 < 10; local123++) {
						local273.anIntArray582[local123] -= local95;
						local273.anIntArray583[local123] -= local105;
					}
					local273.anInt6677 -= local105 * 128;
					local273.anInt6675 -= local95 * 128;
				}
			}
		}
		for (local115 = 0; local115 < 2048; local115++) {
			@Pc(329) Class3_Sub3_Sub6_Sub1 local329 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local115];
			if (local329 != null) {
				for (local123 = 0; local123 < 10; local123++) {
					local329.anIntArray582[local123] -= local95;
					local329.anIntArray583[local123] -= local105;
				}
				local329.anInt6675 -= local95 * 128;
				local329.anInt6677 -= local105 * 128;
			}
		}
		@Pc(379) Class107[] local379 = Static190.aClass107Array1;
		for (local123 = 0; local123 < local379.length; local123++) {
			@Pc(387) Class107 local387 = local379[local123];
			if (local387 != null) {
				local387.anInt2688 -= local95 * 128;
				local387.anInt2684 -= local105 * 128;
			}
		}
		Static205.method1164(local95, local105);
		for (@Pc(419) Class6_Sub43 local419 = (Class6_Sub43) Static203.aClass88_32.method1882(); local419 != null; local419 = (Class6_Sub43) Static203.aClass88_32.method1891()) {
			local419.anInt6925 -= local95;
			local419.anInt6918 -= local105;
			if (Static261.anInt4478 != 3 && (local419.anInt6925 < 0 || local419.anInt6918 < 0 || local419.anInt6925 >= Static84.anInt1632 || local419.anInt6918 >= Static261.anInt4480)) {
				local419.method5977();
			}
		}
		if (Static278.anInt4731 != 0) {
			Static278.anInt4731 -= local95;
			Static58.anInt1221 -= local105;
		}
		Static316.method5799();
		if (arg2) {
			Static38.anInt852 -= local95;
			Static5.anInt47 -= local105;
			Static319.anInt5203 -= local95;
			Static363.anInt6129 -= local105;
			Static214.anInt3730 -= local105 * 128;
			Static32.anInt521 -= local95 * 128;
			if (Math.abs(local95) > Static84.anInt1632 || Math.abs(local105) > Static261.anInt4480) {
				Static121.method1986();
			}
		} else if (Static9.anInt164 == 4) {
			Static45.anInt923 -= local105 * 128;
			Static237.anInt4066 -= local105 * 128;
			Static153.anInt2718 -= local95 * 128;
			Static375.anInt6234 -= local95 * 128;
		} else {
			Static9.anInt164 = 1;
		}
		Static412.method5599();
		Static134.method2179();
		Static205.aClass88_15.method1887();
		Static439.aClass88_46.method1887();
		Static28.aClass128_1.method2829();
		Static356.method5009();
	}
}
