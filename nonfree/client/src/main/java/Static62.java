import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public static int anInt1663;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public static int anInt1671;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public static int anInt1672;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Z")
	public static boolean aBoolean78;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt1664 = 0;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_785 = Static56.method972("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt1665 = 0;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!ae;")
	private static Class5 aClass5_786 = Static56.method972("Enter message to send to ");

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_787 = Static56.method972("Konfig geladen)3");

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_788 = Static56.method972("backright2");

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_789 = Static56.method972("Freunde");

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt1666 = 0;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_790 = Static56.method972("Null");

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_791 = Static56.method972("compass");

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	public static int anInt1677 = 0;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_792 = aClass5_786;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "J")
	public static volatile long aLong53 = 0L;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Lclient!ae;")
	public static Class5 aClass5_793 = Static56.method972("@gre@");

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
	public static volatile int anInt1680 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZLclient!bf;II)V")
	public static synchronized void method1073(@OriginalArg(2) int arg0, @OriginalArg(4) Class11 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (!Static79.method1278()) {
			return;
		}
		Static109.anInt2865 = -1;
		Static95.aBoolean122 = false;
		Static36.anInt2763 = arg3;
		Static88.anInt2258 = arg0;
		Static85.aClass11_49 = arg1;
		Static43.aBoolean60 = true;
		Static32.anInt917 = 0;
		Static4.anInt342 = -1;
		Static109.anInt2873 = arg2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static synchronized void method1074() {
		if (Static79.method1278()) {
			Static76.method1698();
			Static43.aBoolean60 = false;
			Static85.aClass11_49 = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1075() {
		Static115.aClass37_1.method1691();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static69.aLongArray5[local6] = 0L;
		}
		for (@Pc(35) int local35 = 0; local35 < 32; local35++) {
			Static111.aLongArray7[local35] = 0L;
		}
		Static3.anInt291 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!bf;IIZIIII)V")
	public static synchronized void method1076(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(7) int arg3) {
		if (!Static79.method1278()) {
			return;
		}
		Static4.anInt342 = -1;
		Static88.anInt2258 = 0;
		Static36.anInt2763 = arg1;
		Static109.anInt2865 = 10;
		Static85.aClass11_49 = arg0;
		Static43.aBoolean60 = true;
		Static32.anInt917 = arg2;
		Static109.anInt2873 = arg3;
		Static95.aBoolean122 = false;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static synchronized void method1077() {
		if (!Static79.method1278()) {
			return;
		}
		if (Static43.aBoolean60) {
			@Pc(18) byte[] local18 = Static10.method1877(Static32.anInt917, Static36.anInt2763, Static85.aClass11_49, Static88.anInt2258);
			if (local18 != null) {
				if (Static109.anInt2865 >= 0) {
					Static55.method949(Static109.anInt2873, Static95.aBoolean122, local18, Static109.anInt2865);
				} else if (Static4.anInt342 >= 0) {
					Static37.method695(Static95.aBoolean122, Static4.anInt342, Static109.anInt2873, local18);
				} else {
					Static78.method1270(Static109.anInt2873, Static95.aBoolean122, local18);
				}
				Static43.aBoolean60 = false;
				Static85.aClass11_49 = null;
			}
		}
		Static73.method1215();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static synchronized void method1078() {
		Static92.method1537();
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method1079() {
		aClass5_788 = null;
		aClass5_792 = null;
		aCanvas1 = null;
		aClass5_789 = null;
		aClass5_793 = null;
		aClass5_785 = null;
		aClass5_786 = null;
		aClass5_791 = null;
		aClass5_787 = null;
		aClass5_790 = null;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public static void method1080() {
		if (Static24.aClass15_1 != null) {
			Static24.aClass15_1.method1904();
			Static24.aClass15_1 = null;
		}
		Static17.anInt610 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZILclient!ae;ZLclient!ae;Lclient!bf;I)V")
	public static synchronized void method1081(@OriginalArg(2) int arg0, @OriginalArg(3) Class5 arg1, @OriginalArg(5) Class5 arg2, @OriginalArg(6) Class11 arg3) {
		if (Static79.method1278()) {
			@Pc(16) int local16 = arg3.method1880(arg1);
			@Pc(22) int local22 = arg3.method1860(local16, arg2);
			method1076(arg3, local16, local22, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V")
	public static synchronized void method1082() {
		if (Static79.method1278()) {
			Static105.method1748();
			Static85.aClass11_49 = null;
			Static43.aBoolean60 = false;
		}
	}
}
