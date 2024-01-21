import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
	public static int anInt1562;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
	public static int anInt1563;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "Lclient!cd;")
	private static Class10 aClass10_683 = Static51.method932("M");

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_682 = aClass10_683;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_687 = Static51.method932("");

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "Lclient!cd;")
	public static Class10 aClass10_684 = aClass10_687;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
	public static int anInt1566 = 0;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_685 = Static51.method932("Password: ");

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "Lclient!cd;")
	public static Class10 aClass10_686 = aClass10_683;

	@OriginalMember(owner = "client!hc", name = "lb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_688 = aClass10_685;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
	public static void method1122() {
		while (true) {
			if (Static75.aClass2_Sub11_Sub1_1.method1491(Static174.anInt3743) >= 11) {
				@Pc(16) int local16 = Static75.aClass2_Sub11_Sub1_1.method1490(11);
				if (local16 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local16] == null) {
						local23 = true;
						Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local16] = new Class2_Sub1_Sub3_Sub2_Sub1();
						if (Static133.aClass2_Sub11Array1[local16] != null) {
							Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local16].method980(Static133.aClass2_Sub11Array1[local16]);
						}
					}
					Static66.anIntArray175[Static54.anInt1354++] = local16;
					@Pc(61) Class2_Sub1_Sub3_Sub2_Sub1 local61 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local16];
					local61.anInt3491 = Static14.anInt386;
					@Pc(69) int local69 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
					@Pc(76) int local76 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
					if (local76 == 1) {
						Static142.anIntArray334[Static97.anInt2273++] = local16;
					}
					@Pc(94) int local94 = Static75.aClass2_Sub11_Sub1_1.method1490(5);
					if (local94 > 15) {
						local94 -= 32;
					}
					@Pc(105) int local105 = Static75.aClass2_Sub11_Sub1_1.method1490(5);
					@Pc(112) int local112 = Static24.anIntArray41[Static75.aClass2_Sub11_Sub1_1.method1490(3)];
					if (local23) {
						local61.anInt3465 = local61.anInt3489 = local112;
					}
					if (local105 > 15) {
						local105 -= 32;
					}
					local61.method2468(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0] + local105, local69 == 1, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0] + local94);
					continue;
				}
			}
			Static75.aClass2_Sub11_Sub1_1.method1494();
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
	public static void method1123() {
		aClass10_685 = null;
		aClass10_688 = null;
		aClass10_682 = null;
		aClass10_686 = null;
		aClass10_684 = null;
		aClass10_687 = null;
		aClass10_683 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!kh;IIIZ)V")
	public static void method1124(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static55.anInt1427 = arg0;
		Static168.anInt3655 = 1;
		Static83.anInt1906 = arg3;
		Static111.aClass29_49 = arg1;
		Static70.anInt1667 = arg2;
		Static123.anInt2781 = 10000;
		Static92.aBoolean91 = false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!fa;B)Lclient!cd;")
	public static Class10 method1125(@OriginalArg(0) Class23 arg0) {
		if (Static64.method1127(Static126.method2068(arg0)) == 0) {
			return null;
		} else if (arg0.aClass10_499 == null || arg0.aClass10_499.method336().method340() == 0) {
			return Static54.aBoolean55 ? Static7.aClass10_115 : null;
		} else {
			return arg0.aClass10_499;
		}
	}
}
