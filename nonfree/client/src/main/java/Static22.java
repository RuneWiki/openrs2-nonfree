import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dc", name = "Ib", descriptor = "Lclient!oa;")
	private static Class56 aClass56_336 = Static33.method650("Click to switch");

	@OriginalMember(owner = "client!dc", name = "rb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_328 = aClass56_336;

	@OriginalMember(owner = "client!dc", name = "sb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_329 = Static33.method650("::errortest");

	@OriginalMember(owner = "client!dc", name = "ub", descriptor = "Lclient!oa;")
	public static Class56 aClass56_330 = Static33.method650("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!dc", name = "vb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_331 = Static33.method650("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!dc", name = "yb", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array1 = new Class56[20];

	@OriginalMember(owner = "client!dc", name = "Cb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_334 = Static33.method650("Please reload this page)3");

	@OriginalMember(owner = "client!dc", name = "zb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_332 = aClass56_334;

	@OriginalMember(owner = "client!dc", name = "Kb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_337 = Static33.method650("Members only world");

	@OriginalMember(owner = "client!dc", name = "Ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_333 = aClass56_337;

	@OriginalMember(owner = "client!dc", name = "Bb", descriptor = "[I")
	public static int[] anIntArray47 = new int[500];

	@OriginalMember(owner = "client!dc", name = "Db", descriptor = "I")
	public static int anInt685 = 0;

	@OriginalMember(owner = "client!dc", name = "Eb", descriptor = "I")
	public static int anInt686 = 0;

	@OriginalMember(owner = "client!dc", name = "Fb", descriptor = "[I")
	public static int[] anIntArray48 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!dc", name = "Ob", descriptor = "Lclient!oa;")
	private static Class56 aClass56_339 = Static33.method650("Unable to find ");

	@OriginalMember(owner = "client!dc", name = "Hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_335 = aClass56_339;

	@OriginalMember(owner = "client!dc", name = "Jb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!dc", name = "Nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_338 = Static33.method650("Die Verbindung konnte");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!d;[BIZ[Lclient!wc;)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class81[] arg4) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method311();
			if (local20 == 0) {
				return;
			}
			@Pc(24) int local24 = 0;
			local12 += local20;
			while (true) {
				@Pc(32) int local32 = local10.method311();
				if (local32 == 0) {
					break;
				}
				local24 += local32 - 1;
				@Pc(47) int local47 = local24 & 0x3F;
				@Pc(51) int local51 = local24 >> 12;
				@Pc(57) int local57 = local24 >> 6 & 0x3F;
				@Pc(61) int local61 = local10.method270();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = arg3 + local57;
				@Pc(73) int local73 = local61 & 0x3;
				@Pc(78) int local78 = local47 + arg0;
				if (local69 > 0 && local78 > 0 && local69 < 103 && local78 < 103) {
					@Pc(93) int local93 = local51;
					if ((Static66.aByteArrayArrayArray3[1][local69][local78] & 0x2) == 2) {
						local93 = local51 - 1;
					}
					@Pc(109) Class81 local109 = null;
					if (local93 >= 0) {
						local109 = arg4[local93];
					}
					Static106.method1762(local78, local109, local73, local65, local51, local69, local12, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	public static void method489() {
		Static57.anInt1621 = 1;
		Static117.anInt2967 = -1;
		Static2.aBoolean1 = false;
		Static19.anInt593 = -1;
		Static19.anInt592 = 2;
		Static47.aClass44_30 = null;
		Static57.anInt1619 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method490() {
		aClass56_330 = null;
		aClass56_331 = null;
		anIntArray47 = null;
		aClass56_336 = null;
		aClass56_339 = null;
		aClass56_337 = null;
		aClass56Array1 = null;
		aClass56_329 = null;
		aClass56_334 = null;
		aClass56_328 = null;
		aClass56_332 = null;
		anIntArray48 = null;
		aClass56_338 = null;
		aClass56_333 = null;
		anIntArrayArrayArray4 = null;
		aClass56_335 = null;
	}
}
