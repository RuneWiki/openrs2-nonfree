import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!g", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray23;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "I")
	public static int anInt1428;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_9;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public static int anInt1431;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_455 = Static181.method2795("null");

	@OriginalMember(owner = "client!g", name = "s", descriptor = "I")
	public static int anInt1427 = 0;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array28 = new Class83[100];

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_457 = Static181.method2795("You have only just left another world)3");

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!qe;")
	public static Class83 aClass83_456 = aClass83_457;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([B[Lclient!dg;IIIIIIII)V")
	public static void method1115(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class22[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg8 > 0 && local3 + arg8 < 103 && arg6 + local7 > 0 && local7 + arg6 < 103) {
					arg1[arg2].anIntArrayArray4[arg8 + local3][arg6 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(80) Class2_Sub3 local80 = new Class2_Sub3(arg0);
		for (@Pc(82) int local82 = 0; local82 < 4; local82++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					if (local82 == arg4 && local91 >= arg7 && local91 < arg7 + 8 && local95 >= arg3 && local95 < arg3 + 8) {
						Static157.method2423(0, arg5, arg8 + Static203.method3079(local95 & 0x7, arg5, local91 & 0x7), arg6 - -Static197.method2967(arg5, local95 & 0x7, local91 & 0x7), local80, 0, arg2);
					} else {
						Static157.method2423(0, 0, -1, -1, local80, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!qe;)V")
	public static void method1116(@OriginalArg(1) Class83 arg0) {
		if (Static23.aClass1_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class83 local13 = Static185.aClass83_1079.method2424(Static23.aClass1_1.anApplet1);
			@Pc(19) Class83 local19 = Static9.aClass83_55.method2424(Static23.aClass1_1.anApplet1);
			@Pc(44) Class83 local44 = Static67.method1268(new Class83[] { local13, Static93.aClass83_609, arg0, Static53.aClass83_411, local19 });
			if (arg0.method2428() == 0) {
				local44 = Static67.method1268(new Class83[] { local44, Static28.aClass83_211 });
			} else {
				local44 = Static67.method1268(new Class83[] { local44, Static197.aClass83_1127, Static2.method59(Static68.method1276() + 94608000000L), Static191.aClass83_1101, Static105.method1822(94608000L) });
			}
			Static67.method1268(new Class83[] { Static211.aClass83_1200, local44, Static97.aClass83_630 }).method2408(Static23.aClass1_1.anApplet1);
		} catch (@Pc(117) Throwable local117) {
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
	public static void method1118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg2 + arg3;
		@Pc(19) int local19 = arg5 - arg3;
		@Pc(23) int local23 = arg3 + arg4;
		for (@Pc(25) int local25 = arg4; local25 < local23; local25++) {
			Static22.method438(arg0, arg1, arg2, Static14.anIntArrayArray18[local25]);
		}
		@Pc(49) int local49 = arg0 - arg3;
		for (@Pc(51) int local51 = arg5; local51 > local19; local51--) {
			Static22.method438(arg0, arg1, arg2, Static14.anIntArrayArray18[local51]);
		}
		for (@Pc(67) int local67 = local23; local67 <= local19; local67++) {
			@Pc(73) int[] local73 = Static14.anIntArrayArray18[local67];
			Static22.method438(local14, arg1, arg2, local73);
			Static22.method438(arg0, arg1, local49, local73);
		}
	}
}
