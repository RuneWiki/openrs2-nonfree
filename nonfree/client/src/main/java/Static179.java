import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt3754;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "Lclient!ha;")
	public static Class104 aClass104_16;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
	public static int anInt3764 = 16777215;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
	public static int method3508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static254.method4605(arg0 + 45365, arg1 - -91923, 4) + (Static254.method4605(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static254.method4605(arg0, arg1, 1) - 128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static void method3510() {
		Static303.aClass295_33.method7541();
		for (@Pc(13) Class1_Sub25 local13 = (Class1_Sub25) Static105.aClass295_10.method7543(); local13 != null; local13 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			if (local13.anInt4365 < 1000) {
				local13.method8239();
				Static303.aClass295_33.method7533(local13);
			}
		}
		Static303.aClass295_33.method7537(Static105.aClass295_10);
		if (Static197.anInt4015 <= 1) {
			Static250.aClass1_Sub25_2 = null;
		} else if (Static451.aBoolean585 && Static25.aClass241_1.method6303(81) && Static197.anInt4015 > 2) {
			Static250.aClass1_Sub25_2 = (Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284.aClass1_284;
		} else {
			Static250.aClass1_Sub25_2 = (Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284;
		}
		@Pc(71) int local71 = -1;
		@Pc(85) Class1_Sub32 local85 = (Class1_Sub32) Static77.aClass295_9.method7543();
		if (local85 != null) {
			local71 = local85.method5776();
		}
		if (!Static238.aBoolean354) {
			if (local71 == 0 && (Static410.anInt7616 == 1 && Static197.anInt4015 > 2 || Static455.method6993())) {
				local71 = 2;
			}
			if (local71 == 2 && Static197.anInt4015 > 0 && local85 != null) {
				if (Static360.aClass91_10 == null && Static462.anInt7983 == 0) {
					Static367.method5955(local85.method5774(), local85.method5772());
				} else {
					Static121.anInt2501 = 2;
				}
			}
			if (local71 == 0 && Static197.anInt4015 > 0) {
				Static279.method2790();
			}
			if (Static360.aClass91_10 != null || Static462.anInt7983 != 0) {
				return;
			}
			Static32.aClass1_Sub25_1 = null;
			Static121.anInt2501 = 0;
			return;
		}
		@Pc(100) int local100;
		@Pc(104) int local104;
		if (local71 == -1) {
			local100 = Static10.aClass99_1.method6618();
			local104 = Static10.aClass99_1.method6619();
			if (local100 < Static513.anInt9093 - 10 || local100 > Static324.anInt6120 + Static513.anInt9093 + 10 || local104 < Static276.anInt8648 - 10 || local104 > Static276.anInt8648 + Static336.anInt6244 + 10) {
				Static47.method5107();
			}
		}
		if (local71 != 0) {
			return;
		}
		local100 = Static513.anInt9093;
		local104 = Static276.anInt8648;
		@Pc(142) int local142 = Static324.anInt6120;
		@Pc(146) int local146 = local85.method5772();
		@Pc(150) int local150 = local85.method5774();
		@Pc(152) int local152 = -1;
		@Pc(172) int local172;
		for (@Pc(154) int local154 = 0; local154 < Static197.anInt4015; local154++) {
			if (Static242.aBoolean356) {
				local172 = local104 + (Static197.anInt4015 + -1 + -local154) * 16 + 33;
				if (local146 > local100 && local142 + local100 > local146 && local150 > local172 - 13 && local150 < local172 + 4) {
					local152 = local154;
				}
			} else {
				local172 = (Static197.anInt4015 - local154 - 1) * 16 + local104 + 31;
				if (local146 > local100 && local146 < local142 + local100 && local150 > local172 - 13 && local172 + 3 > local150) {
					local152 = local154;
				}
			}
		}
		if (local152 != -1) {
			local172 = 0;
			@Pc(265) Class314 local265 = new Class314(Static105.aClass295_10);
			for (@Pc(270) Class1_Sub25 local270 = (Class1_Sub25) local265.method8057(); local270 != null; local270 = (Class1_Sub25) local265.method8056()) {
				if (local172 == local152) {
					Static318.method5462(local146, local270, local150);
				}
				local172++;
			}
		}
		Static47.method5107();
		return;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
	public static void method3512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static94.anInt2057 && Static187.anInt3872 >= arg0) {
			@Pc(24) int local24 = Static452.method6975(Static119.anInt2469, arg2, Static325.anInt6148);
			@Pc(30) int local30 = Static452.method6975(Static119.anInt2469, arg1, Static325.anInt6148);
			Static442.method6848(arg3, local24, arg0, local30);
		}
	}
}
