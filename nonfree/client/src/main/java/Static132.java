import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	public static int anInt2861;

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
	public static int anInt2864;

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	public static void method2685() {
		Static328.aClass66_103.method1942();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public static void method2686(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static225.aBooleanArray17[arg0]) {
			return;
		}
		Static327.aClass170_117.method4550(arg0);
		if (Static348.aClass96ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(30) boolean local30 = true;
		for (@Pc(32) int local32 = 0; local32 < Static348.aClass96ArrayArray1[arg0].length; local32++) {
			if (Static348.aClass96ArrayArray1[arg0][local32] != null) {
				if (Static348.aClass96ArrayArray1[arg0][local32].anInt2933 == 2) {
					local30 = false;
				} else {
					Static348.aClass96ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local30) {
			Static348.aClass96ArrayArray1[arg0] = null;
		}
		Static225.aBooleanArray17[arg0] = false;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	public static void method2687() {
		if (Static126.anInt2645 == 0) {
			return;
		}
		try {
			if (++Static170.anInt3491 > 1500) {
				if (Static95.aClass68_23 != null) {
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
				}
				if (Static262.anInt5044 >= 1) {
					Static29.anInt782 = -5;
					Static126.anInt2645 = 0;
					return;
				}
				Static126.anInt2645 = 1;
				Static262.anInt5044++;
				if (Static134.anInt2748 == Static162.anInt3270) {
					Static162.anInt3270 = Static108.anInt2320;
				} else {
					Static162.anInt3270 = Static134.anInt2748;
				}
				Static170.anInt3491 = 0;
			}
			if (Static126.anInt2645 == 1) {
				Static164.aClass60_6 = Static202.aClass10_3.method310(Static162.anInt3270, Static98.aString131);
				Static126.anInt2645 = 2;
			}
			@Pc(125) int local125;
			if (Static126.anInt2645 == 2) {
				if (Static164.aClass60_6.anInt1838 == 2) {
					throw new IOException();
				}
				if (Static164.aClass60_6.anInt1838 != 1) {
					return;
				}
				Static95.aClass68_23 = new Class68((Socket) Static164.aClass60_6.anObject2, Static202.aClass10_3);
				Static164.aClass60_6 = null;
				Static95.aClass68_23.method2002(Static335.aClass5_Sub1_Sub1_3.anInt2029, Static335.aClass5_Sub1_Sub1_3.aByteArray18);
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				local125 = Static95.aClass68_23.method2000();
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				if (local125 != 101) {
					Static29.anInt782 = local125;
					Static126.anInt2645 = 0;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
					return;
				}
				Static126.anInt2645 = 3;
			}
			if (Static126.anInt2645 == 3 && Static95.aClass68_23.method1999() >= 2) {
				local125 = Static95.aClass68_23.method2000() << 8 | Static95.aClass68_23.method2000();
				Static165.method3057(local125);
				if (Static315.anInt6021 == -1) {
					Static126.anInt2645 = 0;
					Static29.anInt782 = 6;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
				} else {
					Static126.anInt2645 = 0;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
					Static131.method2526();
				}
			}
		} catch (@Pc(203) IOException local203) {
			if (Static95.aClass68_23 != null) {
				Static95.aClass68_23.method1994();
				Static95.aClass68_23 = null;
			}
			if (Static262.anInt5044 >= 1) {
				Static126.anInt2645 = 0;
				Static29.anInt782 = -4;
			} else {
				Static262.anInt5044++;
				Static126.anInt2645 = 1;
				if (Static134.anInt2748 == Static162.anInt3270) {
					Static162.anInt3270 = Static108.anInt2320;
				} else {
					Static162.anInt3270 = Static134.anInt2748;
				}
				Static170.anInt3491 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
	public static void method2688() {
		Static79.anIntArray103 = Static273.method4661(0.4F);
	}
}
