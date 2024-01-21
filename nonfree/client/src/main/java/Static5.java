import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub15 aClass3_Sub1_Sub15_1;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public static int anInt191;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Lclient!na;")
	private static Class53 aClass53_80 = Static109.method1737("New User");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_73 = aClass53_80;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!na;")
	private static Class53 aClass53_74 = Static109.method1737("Enter name of friend to add to list");

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!na;")
	private static Class53 aClass53_77 = Static109.method1737("Error connecting to server)3");

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_75 = aClass53_77;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "[I")
	public static int[] anIntArray17 = new int[50];

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_76 = Static109.method1737("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_78 = Static109.method1737("");

	@OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
	public static int[] anIntArray18 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_79 = aClass53_74;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient!fa;")
	public static Class3_Sub7_Sub1 aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!b", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_81 = null;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "[I")
	public static int[] anIntArray19 = new int[2048];

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	public static int anInt192 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	public static void method113() {
		aClass53_81 = null;
		anIntArray19 = null;
		anIntArray17 = null;
		aClass53_78 = null;
		aClass53_74 = null;
		aClass53_80 = null;
		aClass53_76 = null;
		aClass53_73 = null;
		aClass3_Sub7_Sub1_1 = null;
		aClass53_77 = null;
		aClass3_Sub1_Sub15_1 = null;
		aClass53_75 = null;
		anIntArray18 = null;
		aClass53_79 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BIIII)I")
	public static int method114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = 65536 - Class3_Sub1_Sub5_Sub1.anIntArray84[arg3 * 1024 / arg2] >> 1;
		return (arg1 * (65536 - local17) >> 16) + (arg0 * local17 >> 16);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!vb;IILclient!vb;)Lclient!vb;")
	public static Class3_Sub1_Sub15 method115(@OriginalArg(1) Class3_Sub1_Sub15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub15 arg3) {
		@Pc(27) Class3_Sub1_Sub15 local27 = Static44.method883(arg1, arg0.anInt2727, 0, arg0.anInt2724, arg0.anInt2691, Static107.aClass3_Sub1_Sub15ArrayArray1[arg0.anInt2686 >> 16], arg2, 0, arg0.anInt2686, arg0.anInt2703, arg3);
		if (local27 == null) {
			if (arg0.aClass3_Sub1_Sub15Array2 != null) {
				local27 = Static44.method883(arg1, arg0.anInt2727, 0, arg0.anInt2724, arg0.anInt2691, arg0.aClass3_Sub1_Sub15Array2, arg2, 0, arg0.anInt2686, arg0.anInt2703, arg3);
			}
			return local27;
		} else {
			return local27;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lclient!jc;")
	public static Class38 method116() {
		try {
			return (Class38) Class.forName("Class38_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method117() {
		Static114.aClass4_1.method1908();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static121.aLongArray6[local14] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static21.aLongArray3[local30] = 0L;
		}
		Static90.anInt2120 = 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!na;)V")
	public static void method118(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		Static115.aClass3_Sub7_Sub1_3.method662(223);
		Static115.aClass3_Sub7_Sub1_3.method621(arg0);
		Static115.aClass3_Sub7_Sub1_3.method633(arg1.method1286());
	}
}
