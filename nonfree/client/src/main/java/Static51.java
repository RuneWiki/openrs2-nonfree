import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!pe;")
	public static Class1_Sub3_Sub15 aClass1_Sub3_Sub15_1;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!af;")
	private static Class5 aClass5_652 = Static45.method1937("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_651 = aClass5_652;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_653 = Static45.method1937("(U4");

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_654 = Static45.method1937("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	public static void method896(@OriginalArg(1) boolean arg0) {
		if (Static1.aClass78_1 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub20 local16 = new Class1_Sub20(4);
			local16.method2081(arg0 ? 2 : 3);
			local16.method2104(0);
			Static1.aClass78_1.method2182(4, local16.aByteArray36);
		} catch (@Pc(37) IOException local37) {
			try {
				Static1.aClass78_1.method2176();
			} catch (@Pc(42) Exception local42) {
			}
			Static120.anInt1835++;
			Static1.aClass78_1 = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method897() {
		Static119.aClass8_1.method2245();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static84.aLongArray2[local6] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static129.aLongArray6[local28] = 0L;
		}
		Static46.anInt1120 = 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!kb;ZI)Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 method898(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) int arg2) {
		return Static58.method1055(arg0, arg2, arg1) ? Static64.method1167() : null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method899() {
		aClass5_653 = null;
		aClass1_Sub3_Sub15_1 = null;
		aClass5_651 = null;
		aFrame1 = null;
		aClass5_654 = null;
		anIntArray204 = null;
		aClass5_652 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!af;")
	public static Class5 method900(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static100.method1696(new Class5[] { Static8.aClass5_139, Static48.method838(arg0), Static91.aClass5_1092 });
		} else if (arg0 < 10000000) {
			return Static100.method1696(new Class5[] { Static20.aClass5_326, Static48.method838(arg0 / 1000), Static57.aClass5_707, Static91.aClass5_1092 });
		} else {
			return Static100.method1696(new Class5[] { Static126.aClass5_1441, Static48.method838(arg0 / 1000000), Static105.aClass5_1341, Static91.aClass5_1092 });
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method901() {
		if (!Static47.aBoolean35) {
			return;
		}
		@Pc(11) Class1_Sub17 local11 = Static18.method2150(Static84.anInt2143, Static20.anInt654);
		if (local11 != null && local11.anObjectArray22 != null) {
			@Pc(20) Class1_Sub6 local20 = new Class1_Sub6();
			local20.aClass1_Sub17_26 = local11;
			local20.anObjectArray1 = local11.anObjectArray22;
			Static71.method1228(local20);
		}
		Static47.aBoolean35 = false;
		Static119.method2161(local11);
	}
}
