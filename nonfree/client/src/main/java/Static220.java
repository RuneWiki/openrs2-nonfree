import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_139;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Lclient!nj;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public static int anInt4800 = 0;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "Lclient!i;")
	public static Class41 aClass41_1289 = Static184.method2923("leuchten1:");

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_1290 = Static184.method2923("::fpson");

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Lclient!i;")
	public static Class41 aClass41_1291 = Static184.method2923(" )2> ");

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[I[III)V")
	public static void method3323(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg3;
		if (arg3 > 25) {
			local7 = 25;
		}
		arg3--;
		@Pc(19) int local19 = arg2[arg3];
		@Pc(23) int local23 = arg1[arg3];
		if (arg0 == 0) {
			Static131.aClass2_Sub3_Sub1_2.method221(200);
			Static131.aClass2_Sub3_Sub1_2.method208(local7 + local7 + 3);
		}
		if (arg0 == 1) {
			Static131.aClass2_Sub3_Sub1_2.method221(199);
			Static131.aClass2_Sub3_Sub1_2.method208(local7 + local7 + 17);
		}
		if (arg0 == 2) {
			Static131.aClass2_Sub3_Sub1_2.method221(159);
			Static131.aClass2_Sub3_Sub1_2.method208(local7 + local7 + 3);
		}
		Static131.aClass2_Sub3_Sub1_2.method167(local19 + Static168.anInt3899);
		Static131.aClass2_Sub3_Sub1_2.method159(Static219.aBooleanArray25[82] ? 1 : 0);
		Static102.anInt2490 = arg1[0];
		Static125.anInt1524 = arg2[0];
		for (@Pc(114) int local114 = 1; local114 < local7; local114++) {
			arg3--;
			Static131.aClass2_Sub3_Sub1_2.method189(arg1[arg3] - local23);
			Static131.aClass2_Sub3_Sub1_2.method159(arg2[arg3] - local19);
		}
		Static131.aClass2_Sub3_Sub1_2.method193(local23 + Static198.anInt4451);
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
	public static void method3330() {
		Static191.aClass43_22.method1469();
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V")
	public static void method3333() {
		Static131.aClass2_Sub3_Sub1_2.method221(58);
		Static131.aClass2_Sub3_Sub1_2.method190(0L);
	}
}
