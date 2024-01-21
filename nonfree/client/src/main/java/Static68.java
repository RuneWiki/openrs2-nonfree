import java.awt.Graphics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!o", name = "u", descriptor = "I")
	public static int anInt391;

	@OriginalMember(owner = "client!o", name = "V", descriptor = "I")
	private static int anInt411;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!gd;")
	private static Class23 aClass23_249 = Static15.method178("Error connecting to server)3");

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_248 = aClass23_249;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	public static int anInt386 = 0;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_250 = Static15.method178("_");

	@OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
	public static int[] anIntArray62 = new int[50];

	@OriginalMember(owner = "client!o", name = "v", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!gd;")
	public static Class23 aClass23_251 = Static15.method178("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!o", name = "P", descriptor = "Lclient!gd;")
	public static Class23 aClass23_252 = Static15.method178("Fertigkeit)2");

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_253 = Static15.method178("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method216() {
		Static100.aClass5_56.method99();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIILclient!he;I)V")
	public static void method221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub6_Sub2 arg2, @OriginalArg(4) int arg3) {
		Static108.aClass34_80.method1138();
		Static36.aClass1_Sub1_Sub6_Sub3_11.method1194(0, 0);
		arg2.method847(Static13.aClass23_191, 55, 28, 16777215, true);
		if (arg1 == 0) {
			arg2.method847(Static97.aClass23_1428, 55, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg2.method847(Static72.aClass23_1188, 55, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg2.method847(Static65.aClass23_1122, 55, 41, 16711680, true);
		}
		if (arg1 == 3) {
			arg2.method847(Static64.aClass23_1094, 55, 41, 65535, true);
		}
		arg2.method847(Static82.aClass23_1298, 184, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method847(Static97.aClass23_1428, 184, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method847(Static72.aClass23_1188, 184, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method847(Static65.aClass23_1122, 184, 41, 16711680, true);
		}
		arg2.method847(Static33.aClass23_569, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method847(Static97.aClass23_1428, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method847(Static72.aClass23_1188, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method847(Static65.aClass23_1122, 324, 41, 16711680, true);
		}
		arg2.method849(Static107.aClass23_1586, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(155) Graphics local155 = Static26.aCanvas1.getGraphics();
			Static108.aClass34_80.method1144(453, local155, 0);
		} catch (@Pc(163) Exception local163) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
	public static int method222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub14 local18 = (Class1_Sub14) Static7.aClass14_2.method343((long) arg0);
		if (local18 == null) {
			return 0;
		} else if (arg1 >= 0 && local18.anIntArray408.length > arg1) {
			return local18.anIntArray408[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	public static void method223() {
		aClass23_253 = null;
		anIntArray62 = null;
		aClass23_251 = null;
		aCalendar2 = null;
		aClass23_252 = null;
		aClass23_250 = null;
		aClass23_248 = null;
		aClass23_249 = null;
	}
}
