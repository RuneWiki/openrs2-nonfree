import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!tb", name = "Bb", descriptor = "[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array5;

	@OriginalMember(owner = "client!tb", name = "Cb", descriptor = "Lclient!ee;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!tb", name = "Gb", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!tb", name = "Ub", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!tb", name = "ub", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1346 = Static75.method1216("Connecting to friendserver");

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1345 = aClass4_1346;

	@OriginalMember(owner = "client!tb", name = "vb", descriptor = "Lclient!q;")
	public static Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!tb", name = "Eb", descriptor = "Lclient!pa;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!tb", name = "Fb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1347 = Static75.method1216(",Zffentlicher Chat");

	@OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1348 = Static75.method1216("Loaded gamescreen");

	@OriginalMember(owner = "client!tb", name = "Pb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1354 = Static75.method1216("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!tb", name = "Ib", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1349 = aClass4_1354;

	@OriginalMember(owner = "client!tb", name = "Lb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1351 = Static75.method1216("Loaded title screen");

	@OriginalMember(owner = "client!tb", name = "Kb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1350 = aClass4_1351;

	@OriginalMember(owner = "client!tb", name = "Mb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1352 = aClass4_1348;

	@OriginalMember(owner = "client!tb", name = "Sb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1355 = Static75.method1216("skill)2");

	@OriginalMember(owner = "client!tb", name = "Nb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1353 = aClass4_1355;

	@OriginalMember(owner = "client!tb", name = "Ob", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array18 = new Class4[100];

	@OriginalMember(owner = "client!tb", name = "Rb", descriptor = "Z")
	public static boolean aBoolean209 = true;

	@OriginalMember(owner = "client!tb", name = "Tb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1356 = Static75.method1216("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!rd;III)[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] method1646(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static5.method161(arg2, arg0, arg1) ? Static60.method1009() : null;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public static void method1647() {
		aClass4_1356 = null;
		anIntArray304 = null;
		aClass24_4 = null;
		aClass4_1349 = null;
		aClass60_1 = null;
		aClass4_1348 = null;
		aClass4_1352 = null;
		aClass4_1350 = null;
		aClass4_1347 = null;
		aClass4_1346 = null;
		aClass4_1355 = null;
		aClass4Array18 = null;
		aClass4_1351 = null;
		aClass4_1353 = null;
		aClass4_1354 = null;
		aClass3_Sub1_Sub4_Sub3Array5 = null;
		anIntArray305 = null;
		aClass4_1345 = null;
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(II)Z")
	public static boolean method1650(@OriginalArg(1) int arg0) {
		if (Static30.aBooleanArray6[arg0]) {
			return true;
		} else if (Static6.aClass64_10.method1640(arg0)) {
			@Pc(23) int local23 = Static6.aClass64_10.method1637(arg0);
			if (local23 == 0) {
				Static30.aBooleanArray6[arg0] = true;
				return true;
			}
			if (Static104.aClass3_Sub1_Sub14ArrayArray1[arg0] == null) {
				Static104.aClass3_Sub1_Sub14ArrayArray1[arg0] = new Class3_Sub1_Sub14[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static6.aClass64_10.method1625(arg0, local42);
					if (local56 != null) {
						Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local42] = new Class3_Sub1_Sub14();
						Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local42].anInt2092 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local42].method1424(new Class3_Sub4(local56));
						} else {
							Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local42].method1423(new Class3_Sub4(local56));
						}
					}
				}
			}
			Static30.aBooleanArray6[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
