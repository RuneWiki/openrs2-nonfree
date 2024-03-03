import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZZ)V", line = 1198)
	public static void method1527(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Class97.anInt2592 != -1) {
				Static152.method2980(Class97.anInt2592);
			}
			for (@Pc(19) Class2_Sub7 local19 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method80(); local19 != null; local19 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method79()) {
				if (!local19.method6463()) {
					local19 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method80();
					if (local19 == null) {
						break;
					}
				}
				Static253.method4656(false, local19, true);
			}
			Class97.anInt2592 = -1;
			Class2_Sub3_Sub34.aClass4_130 = new Class4(8);
			Static196.method3721();
			Class97.anInt2592 = Static365.anInt7203;
			Static56.method891(false);
			Static91.method2109();
			Static185.method3599(Class97.anInt2592);
		}
		Static287.method5284();
		Class77.anInt2216 = -1;
		Static284.method5256(Class2_Sub3_Sub39.anInt7250);
		Static17.aClass11_Sub5_Sub2_Sub1_3 = new Class11_Sub5_Sub2_Sub1();
		Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 = 6656;
		Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] = 52;
		Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 = 6656;
		Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] = 52;
		Static197.anInt3773 = 0;
		Static127.anInt6765 = 0;
		if (Static291.anInt5899 == 2) {
			Static197.anInt3773 = Static19.anInt535 << 7;
			Static127.anInt6765 = Static288.anInt5798 << 7;
		} else {
			Static186.method5250();
		}
		Static323.method5829();
		if (Static127.anInt6765 == 0 || Static197.anInt3773 == 0) {
			Static313.method5706(10);
		} else {
			Static241.method6255();
			Static313.method5706(28);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBIIIII)I", line = 1315)
	public static int method1530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(17) int local17 = arg3;
			arg3 = arg4;
			arg4 = local17;
		}
		@Pc(25) int local25 = arg1 & 0x3;
		if (local25 == 0) {
			return arg0;
		} else if (local25 == 1) {
			return arg5;
		} else if (local25 == 2) {
			return 7 + 1 - arg0 - arg3;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(B)V", line = 1383)
	public static void method1532() {
		Static61.aClass19_3.method2881(Static92.anInt2092, Static203.aClass177_Sub1_2.aBoolean348 ? Static339.anInt6804 + 256 : -1);
	}
}
