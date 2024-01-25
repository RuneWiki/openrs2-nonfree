import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "J")
	public static final long aLong147 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V")
	public static void method5312(@OriginalArg(1) int arg0) {
		if (arg0 == Static151.anInt2620) {
			return;
		}
		if (arg0 == 13) {
			if (aString61 == null) {
				Static78.method1356(Static92.anInt1879, Static95.aString23, Static221.aString43);
			} else {
				Static413.method8719(Static92.anInt1879);
			}
		}
		if (arg0 != 13 && Static254.aClass170_1 != null) {
			Static254.aClass170_1.method8119();
			Static254.aClass170_1 = null;
		}
		if (arg0 == 3) {
			Static579.method8375(Static470.anInt9222 != Static337.anInt5727);
		}
		if (arg0 == 7) {
			Static535.method7884(Static449.anInt7648 != Static337.anInt5727);
		}
		if (arg0 == 5) {
			if (aString61 == null) {
				Static342.method5124(Static221.aString43, Static95.aString23);
			} else {
				Static210.method3643();
			}
		} else if (arg0 == 6) {
			if (aString61 == null) {
				Static78.method1356(Static92.anInt1879, Static95.aString23, Static221.aString43);
			} else {
				Static413.method8719(Static92.anInt1879);
			}
		} else if (arg0 == 9) {
			if (aString61 == null) {
				Static78.method1356(Static92.anInt1879, Static95.aString23, Static221.aString43);
			} else {
				Static413.method8719(Static92.anInt1879);
			}
		} else if (arg0 == 12) {
			if (aString61 == null) {
				Static342.method5124(Static221.aString43, Static95.aString23);
			} else {
				Static210.method3643();
			}
		}
		if (Static432.method6578(Static151.anInt2620)) {
			Static141.aClass207_30.anInt5242 = 2;
			Static168.aClass207_36.anInt5242 = 2;
			Static101.aClass207_23.anInt5242 = 2;
			Static509.aClass207_108.anInt5242 = 2;
			Static108.aClass207_25.anInt5242 = 2;
			Static452.aClass207_92.anInt5242 = 2;
			Static460.aClass207_96.anInt5242 = 2;
		}
		if (Static432.method6578(arg0)) {
			Static143.anInt2485 = 0;
			Static312.anInt10527 = 1;
			Static607.anInt9468 = 0;
			Static226.anInt10417 = 0;
			Static93.anInt1896 = 1;
			Static232.method3875(true);
			Static141.aClass207_30.anInt5242 = 1;
			Static168.aClass207_36.anInt5242 = 1;
			Static101.aClass207_23.anInt5242 = 1;
			Static509.aClass207_108.anInt5242 = 1;
			Static108.aClass207_25.anInt5242 = 1;
			Static452.aClass207_92.anInt5242 = 1;
			Static460.aClass207_96.anInt5242 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static238.method3975();
		}
		@Pc(225) boolean local225 = arg0 == 2 || Static280.method4485(arg0) || Static535.method7883(arg0);
		@Pc(242) boolean local242 = Static151.anInt2620 == 2 || Static280.method4485(Static151.anInt2620) || Static535.method7883(Static151.anInt2620);
		if (local242 != local225) {
			if (local225) {
				Static407.anInt7117 = Static464.anInt7792;
				if (Static97.aClass5_Sub25_8.aClass6_Sub18_2.method5120() == 0) {
					Static630.method8907();
				} else {
					Static71.method1203(Static151.aClass207_34, Static464.anInt7792, Static97.aClass5_Sub25_8.aClass6_Sub18_2.method5120());
					Static283.method4494();
				}
				Static1.aClass309_7.method7420(false);
			} else {
				Static630.method8907();
				Static1.aClass309_7.method7420(true);
			}
		}
		if (Static432.method6578(arg0) || arg0 == 13) {
			Static213.aClass133_5.method7247();
		}
		Static151.anInt2620 = arg0;
	}
}
