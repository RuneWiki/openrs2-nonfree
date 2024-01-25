import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "Lclient!f;")
	public static Class88 aClass88_12;

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "F")
	public static float aFloat83 = 0.0F;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
	public static boolean method3133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static119.method2177(arg1, arg0) || Static378.method5890(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
	public static void method3134(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static446.anInt8493 != -1) {
				Static192.method3153(Static446.anInt8493);
			}
			for (@Pc(14) Class4_Sub45 local14 = (Class4_Sub45) Static569.aClass221_27.method5072(); local14 != null; local14 = (Class4_Sub45) Static569.aClass221_27.method5071()) {
				if (!local14.method8199()) {
					local14 = (Class4_Sub45) Static569.aClass221_27.method5072();
					if (local14 == null) {
						break;
					}
				}
				Static205.method3352(true, local14, false);
			}
			Static446.anInt8493 = -1;
			Static569.aClass221_27 = new Class221(8);
			Static511.method7326();
			Static446.anInt8493 = Static162.anInt3366;
			Static284.method4495(false);
			Static533.method7519();
			Static471.method6880(Static446.anInt8493);
		}
		Static33.aBoolean107 = false;
		Static422.aString169 = "";
		Static544.aString215 = "";
		Static451.method6638();
		Static117.anInt2703 = -1;
		Static458.method6742(Static538.anInt9806);
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 = new Class21_Sub1_Sub1_Sub1_Sub2();
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] = Static338.anInt6508 / 2;
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 = Static390.anInt7654 * 512 / 2;
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 = Static338.anInt6508 * 512 / 2;
		Static114.anInt2613 = 0;
		Static534.anInt9775 = 0;
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0] = Static390.anInt7654 / 2;
		if (Static300.anInt6053 == 2) {
			Static534.anInt9775 = Static80.anInt2172 << 9;
			Static114.anInt2613 = Static414.anInt7982 << 9;
		} else {
			Static23.method888();
		}
		Static41.method1090();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!is;IB)V")
	public static void method3136(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2) {
		if (Static292.aClass155_7 != null || Static117.aBoolean207 || (arg1 == null || Static159.method2598(arg1) == null)) {
			return;
		}
		Static292.aClass155_7 = arg1;
		Static95.aClass155_1 = Static159.method2598(arg1);
		Static454.anInt8653 = 0;
		Static221.anInt1106 = arg0;
		Static487.anInt9232 = arg2;
		Static383.aBoolean553 = false;
	}
}
