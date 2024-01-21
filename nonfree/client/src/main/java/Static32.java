import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_8;

	@OriginalMember(owner = "client!de", name = "Sb", descriptor = "[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array9;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
	public static final int anInt3023 = 5063219;

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1089 = Static120.method2057("Select");

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1090 = aClass81_1089;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1091 = Static120.method2057("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!de", name = "Ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1092 = Static120.method2057("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!de", name = "jc", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1096 = Static120.method2057("glow3:");

	@OriginalMember(owner = "client!de", name = "Fb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1093 = aClass81_1096;

	@OriginalMember(owner = "client!de", name = "Lb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1094 = Static120.method2057("null");

	@OriginalMember(owner = "client!de", name = "Zb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1095 = aClass81_1096;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[II)I")
	public static int method2359(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		return arg2 * arg1[1] + arg1[0] * arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!td;III)V")
	public static void method2360(@OriginalArg(0) Class1_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub17 local12;
		@Pc(27) Class1_Sub2_Sub1_Sub6 local27;
		if (arg2 < Static8.anInt164) {
			local12 = Static167.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass1_Sub2_Sub1_3 instanceof Class1_Sub2_Sub1_Sub6) {
				local27 = (Class1_Sub2_Sub1_Sub6) local12.aClass42_1.aClass1_Sub2_Sub1_3;
				Static159.method2763(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static8.anInt164) {
			local12 = Static167.aClass1_Sub17ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass1_Sub2_Sub1_3 instanceof Class1_Sub2_Sub1_Sub6) {
				local27 = (Class1_Sub2_Sub1_Sub6) local12.aClass42_1.aClass1_Sub2_Sub1_3;
				Static159.method2763(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static8.anInt164 && arg3 < Static141.anInt709) {
			local12 = Static167.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass1_Sub2_Sub1_3 instanceof Class1_Sub2_Sub1_Sub6) {
				local27 = (Class1_Sub2_Sub1_Sub6) local12.aClass42_1.aClass1_Sub2_Sub1_3;
				Static159.method2763(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static8.anInt164 || arg3 <= 0) {
			return;
		}
		local12 = Static167.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass42_1 != null && local12.aClass42_1.aClass1_Sub2_Sub1_3 instanceof Class1_Sub2_Sub1_Sub6) {
			local27 = (Class1_Sub2_Sub1_Sub6) local12.aClass42_1.aClass1_Sub2_Sub1_3;
			Static159.method2763(arg0, local27, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method2361() {
		aClass81_1095 = null;
		aClass81_1091 = null;
		aClass81_1093 = null;
		aClass81_1089 = null;
		aClass81_1096 = null;
		aClass81_1094 = null;
		aClass81_1092 = null;
		aClass1_Sub2_Sub2_Sub4Array9 = null;
		aClass1_Sub2_Sub2_Sub3_8 = null;
		aClass81_1090 = null;
	}
}
