import java.awt.event.ActionEvent;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!od", name = "G", descriptor = "Lclient!ai;")
	public static Class7 aClass7_29;

	@OriginalMember(owner = "client!od", name = "H", descriptor = "Lclient!jj;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Lclient!s;")
	public static Class88 aClass88_5;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1088 = Static200.method3116("Select a world");

	@OriginalMember(owner = "client!od", name = "z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1089 = Static200.method3116("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!od", name = "B", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1090 = Static200.method3116("title_mute");

	@OriginalMember(owner = "client!od", name = "F", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1091 = aClass60_1088;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	public static int anInt3109 = 0;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1092 = Static200.method3116("mapscene");

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1093 = Static200.method3116("Passwort: ");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!li;)V")
	public static void method2380(@OriginalArg(1) Class1_Sub7 arg0) {
		if (arg0.aClass1_Sub19_5 != null) {
			arg0.aClass1_Sub19_5.anInt3295 = 0;
		}
		arg0.aBoolean263 = false;
		for (@Pc(22) Class1_Sub7 local22 = arg0.method3454(); local22 != null; local22 = arg0.method3452()) {
			method2380(local22);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
	public static void method2381(@OriginalArg(1) int arg0) {
		@Pc(5) Class51 local5 = Static176.aClass51_2;
		synchronized (Static176.aClass51_2) {
			Static24.anInt568 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z")
	public static boolean method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static49.anIntArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == -Static7.anInt189) {
			return false;
		} else if (local7 == Static7.anInt189) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static125.method2122(local22 + 1, Static138.anIntArrayArrayArray17[arg0][arg1][arg2], local26 + 1) && Static125.method2122(local22 + 128 - 1, Static138.anIntArrayArrayArray17[arg0][arg1 + 1][arg2], local26 + 1) && Static125.method2122(local22 + 128 - 1, Static138.anIntArrayArrayArray17[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static125.method2122(local22 + 1, Static138.anIntArrayArrayArray17[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static49.anIntArrayArrayArray5[arg0][arg1][arg2] = Static7.anInt189;
				return true;
			} else {
				Static49.anIntArrayArrayArray5[arg0][arg1][arg2] = -Static7.anInt189;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Object;ILclient!mc;)V")
	public static void method2383(@OriginalArg(0) Object arg0, @OriginalArg(2) Class65 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static146.method2494(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ve;Z)V")
	public static void method2384(@OriginalArg(0) Class9_Sub4 arg0) {
		if (arg0.anInt3941 == 0) {
			arg0.anInt3930 = 1024;
		}
		arg0.anInt3939 = 0;
		if (arg0.anInt3941 == 1) {
			arg0.anInt3930 = 1536;
		}
		if (arg0.anInt3941 == 2) {
			arg0.anInt3930 = 0;
		}
		if (arg0.anInt3941 == 3) {
			arg0.anInt3930 = 512;
		}
		@Pc(56) int local56 = arg0.anInt3937 * 64 + arg0.anInt3920 * 128;
		@Pc(61) int local61 = arg0.anInt3951 - Static42.anInt910;
		arg0.anInt3925 += (local56 - arg0.anInt3925) / local61;
		@Pc(82) int local82 = arg0.anInt3937 * 64 + arg0.anInt3908 * 128;
		arg0.anInt3903 += (local82 - arg0.anInt3903) / local61;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	public static int method2385(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
