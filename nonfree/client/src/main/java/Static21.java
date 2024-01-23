import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	public static int anInt411;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "Lclient!fh;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_145 = Static231.method3737(")3");

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_146 = Static231.method3737("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "Lclient!sc;")
	public static Class107 aClass107_147 = Static231.method3737(" )2> ");

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "Lclient!sc;")
	public static Class107 aClass107_148 = Static231.method3737("headicons_prayer");

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!vf;B)Lclient!d;")
	public static Class1_Sub2_Sub6 method389(@OriginalArg(0) Class1_Sub26 arg0) {
		@Pc(36) Class1_Sub2_Sub6 local36 = new Class1_Sub2_Sub6(arg0.method2978(), arg0.method2978(), arg0.method2964(), arg0.method2964(), arg0.method2958(), arg0.method2945() == 1);
		@Pc(40) int local40 = arg0.method2945();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			local36.aClass120_3.method3567(new Class1_Sub4(arg0.method2964(), arg0.method2964(), arg0.method2964(), arg0.method2964()));
		}
		local36.method696();
		return local36;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!jb;II)[Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1[] method392(@OriginalArg(1) Class28 arg0, @OriginalArg(3) int arg1) {
		return Static83.method1393(arg1, arg0) ? Static27.method479() : null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLclient!sc;)I")
	public static int method393(@OriginalArg(1) Class107 arg0) {
		if (arg0.method3095() == 0) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static83.aClass119_2.anInt4555; local18++) {
			if (Static83.aClass119_2.aClass107Array29[local18].method3093(arg0)) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!o;)Lclient!o;")
	public static Class86 method394(@OriginalArg(1) Class86 arg0) {
		@Pc(6) Class86 local6 = Static34.method680(arg0);
		if (local6 == null) {
			local6 = arg0.aClass86_8;
		}
		return local6;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!ed;)V")
	public static void method395(@OriginalArg(1) Class5_Sub5_Sub1 arg0) {
		@Pc(14) Class1_Sub21 local14 = (Class1_Sub21) Static59.aClass50_10.method1364(arg0.aClass107_351.method3066());
		if (local14 == null) {
			Static194.method3159(arg0, null, null, 0, arg0.anIntArray260[0], Static191.anInt4237, arg0.anIntArray256[0]);
		} else {
			local14.method2527();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
	public static void method396() {
		Static83.aByteArrayArrayArray7 = null;
		Static107.anInt2345 = 0;
		Static43.anIntArrayArrayArray4 = null;
		Static13.aByteArrayArrayArray1 = null;
		Static88.aShortArrayArrayArray1 = null;
		Static1.anIntArray1 = null;
		Static66.aClass86_3 = null;
		Static150.aByteArrayArrayArray10 = null;
		Static223.anIntArrayArrayArray12 = null;
		Static57.aClass1_Sub2_Sub6_42 = null;
		Static81.aByteArrayArrayArray6 = null;
		Static212.aByteArrayArrayArray12 = null;
		Static199.aClass120_20.method3560();
		Static176.aClass27_8 = null;
		Static153.aClass27_7 = null;
		Static29.aClass27_3 = null;
		Static155.aClass27_2 = null;
		Static213.aClass1_Sub2_Sub2_93 = null;
		Static141.aClass27_5 = null;
		Static147.aClass27_6 = null;
		Static196.aClass27_9 = null;
		Static83.aClass119_2 = null;
		Static117.aClass27_4 = null;
	}
}
