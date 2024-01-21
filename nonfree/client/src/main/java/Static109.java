import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!jd;")
	public static Class36 aClass36_77;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1323 = Static2.method66("From");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1322 = aClass39_1323;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1324 = Static2.method66("Loading )2 please wait)3");

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1329 = Static2.method66("Checking for updates )2 ");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1325 = aClass39_1329;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1326 = Static2.method66("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1327 = Static2.method66("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1328 = Static2.method66("Message");

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1330 = Static2.method66("Prepared visibility map");

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1331 = Static2.method66("Unexpected server response");

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1341 = Static2.method66("Hidden");

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1332 = aClass39_1341;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1333 = Static2.method66("Loaded wordpack");

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1334 = aClass39_1328;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1335 = aClass39_1330;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1336 = Static2.method66("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1337 = aClass39_1333;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1338 = Static2.method66("sch-Utteln:");

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1339 = aClass39_1324;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1340 = aClass39_1331;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method2078() {
		aClass39_1331 = null;
		aClass39_1322 = null;
		aClass39_1332 = null;
		aClass39_1324 = null;
		aClass39_1334 = null;
		aClass39_1333 = null;
		aClass39_1335 = null;
		aClass39_1340 = null;
		aClass39_1338 = null;
		aClass39_1329 = null;
		aClass39_1323 = null;
		aClass36_77 = null;
		aClass39_1337 = null;
		aClass39_1341 = null;
		aClass39_1339 = null;
		aClass39_1328 = null;
		aClass39_1336 = null;
		aClass39_1330 = null;
		aClass39_1326 = null;
		aClass39_1325 = null;
		aClass39_1327 = null;
		anIntArray371 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	public static int method2079() {
		return Static69.anInt2010++;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = 2048 - arg2 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg3 & 0x7FF;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg0;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (local10 != 0) {
			local31 = Static32.anIntArray122[local10];
			local35 = Static32.anIntArray129[local10];
			local46 = local35 * 0 - arg0 * local31 >> 16;
			local22 = arg0 * local35 + local31 * 0 >> 16;
			local20 = local46;
		}
		if (local16 != 0) {
			local31 = Static32.anIntArray122[local16];
			local35 = Static32.anIntArray129[local16];
			local46 = local22 * local31 + local35 * 0 >> 16;
			local22 = local35 * local22 - local31 * 0 >> 16;
			local18 = local46;
		}
		Static64.anInt1897 = arg2;
		Static88.anInt1136 = arg4 - local18;
		Static41.anInt1188 = arg1 - local22;
		Static5.anInt100 = arg5 - local20;
		Static41.anInt1190 = arg3;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ge;BI)V")
	public static void method2081(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static71.method1465(arg1, arg0.anInt2899, arg0.anInt2896);
	}
}
