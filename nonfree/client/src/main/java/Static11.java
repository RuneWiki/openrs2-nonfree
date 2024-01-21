import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
	public static int anInt307;

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
	public static int anInt309;

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "Lclient!ua;")
	public static Class82 aClass82_7 = new Class82(50);

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_151 = Static146.method2172("Bad session id)3");

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
	public static int anInt308 = 0;

	@OriginalMember(owner = "client!b", name = "qb", descriptor = "[I")
	public static int[] anIntArray41 = new int[200];

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_152 = aClass77_151;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
	public static int method173(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		@Pc(17) int local17 = local11 | local11 >>> 1;
		@Pc(23) int local23 = local17 | local17 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
	public static void method174() {
		aClass77_152 = null;
		anIntArray41 = null;
		aClass77_151 = null;
		aClass82_7 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method175(@OriginalArg(0) Class43 arg0) {
		Static79.aClass43_21 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method176() {
		try {
			if (Static23.aClass58_1 == null) {
				Static23.aClass58_1 = new Class58(Static144.aClass50_4, Static146.method2168(new Class77[] { Static50.aClass77_540, Static41.aClass77_471, Static1.aClass77_3 }).method2513());
			} else {
				@Pc(11) byte[] local11 = Static23.aClass58_1.method1988();
				if (local11 != null) {
					@Pc(18) Class2_Sub18 local18 = new Class2_Sub18(local11);
					Static58.anInt1526 = local18.method2353();
					Static140.aClass84Array1 = new Class84[Static58.anInt1526];
					for (@Pc(27) int local27 = 0; local27 < Static58.anInt1526; local27++) {
						@Pc(37) Class84 local37 = Static140.aClass84Array1[local27] = new Class84();
						@Pc(41) int local41 = local18.method2353();
						local37.anInt4020 = local41 & 0x7FFF;
						local37.aBoolean166 = (local41 & 0x8000) != 0;
						local37.aClass77_1371 = local18.method2361();
						local37.anInt4015 = local18.method2386();
						local37.anInt4018 = local27;
						local37.anInt4016 = Static163.method2747(local37.aClass77_1371);
					}
					Static136.method2284(Static140.aClass84Array1, 0, Static100.anIntArray102, Static140.aClass84Array1.length - 1, Static106.anIntArray410);
					Static23.aClass58_1 = null;
					Static48.aBoolean67 = true;
				}
			}
		} catch (@Pc(122) Exception local122) {
			local122.printStackTrace();
			Static23.aClass58_1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!sg;B)V")
	public static void method177(@OriginalArg(0) Class77 arg0) {
		if (Static46.anInt1207 >= 2) {
			if (arg0.method2508(Static103.aClass77_985)) {
				System.gc();
			}
			if (arg0.method2508(Static165.aClass77_1379)) {
				Static115.method2044();
			}
			if (arg0.method2508(Static174.aClass77_1516)) {
				Static8.aBoolean11 = true;
			}
			if (arg0.method2508(Static31.aClass77_368)) {
				Static8.aBoolean11 = false;
			}
			if (arg0.method2508(Static139.aClass77_1209)) {
				for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
					for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
						for (@Pc(52) int local52 = 1; local52 < 103; local52++) {
							Static27.aClass86Array1[local44].anIntArrayArray36[local48][local52] = 0;
						}
					}
				}
			}
			if (arg0.method2508(Static106.aClass77_1012) && Static18.anInt619 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2522(Static165.aClass77_1376)) {
				Static58.anInt1521 = arg0.method2504(12).method2505().method2521();
				Static174.method2943(null, Static146.method2168(new Class77[] { Static17.aClass77_265, Static2.method61(Static58.anInt1521) }), 0);
			}
			if (arg0.method2508(Static86.aClass77_883)) {
				Static150.aBoolean150 = true;
			}
		}
		Static124.aClass2_Sub18_Sub1_3.method2398(43);
		Static124.aClass2_Sub18_Sub1_3.method2389(arg0.method2532() - 1);
		Static124.aClass2_Sub18_Sub1_3.method2367(arg0.method2504(2));
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B)Lclient!hg;")
	public static Class2_Sub2_Sub3_Sub4_Sub1 method178(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class2_Sub2_Sub3_Sub4_Sub1 local23 = new Class2_Sub2_Sub3_Sub4_Sub1(arg0, Static160.anIntArray642, Static37.anIntArray175, Static178.anIntArray637, Static2.anIntArray15, Static173.anIntArray623, Static170.aByteArrayArray10);
			Static59.method1102();
			return local23;
		}
	}
}
