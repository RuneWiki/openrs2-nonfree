import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array47;

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "Lclient!la;")
	public static Class17 aClass17_36;

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "Lclient!wc;")
	public static Class81 aClass81_10;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "Lclient!t;")
	public static Class68 aClass68_14;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Lclient!v;")
	private static Class76 aClass76_1193 = Static134.method2017("Service unavailable)3");

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
	public static int anInt2512 = 0;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
	public static int anInt2513 = -1;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "Lclient!v;")
	public static Class76 aClass76_1194 = Static134.method2017("::rect_debug");

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "Lclient!v;")
	public static Class76 aClass76_1195 = Static134.method2017("<col=ff9040>");

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "Lclient!v;")
	public static Class76 aClass76_1196 = Static134.method2017("<col=ffb000>");

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "Lclient!v;")
	private static Class76 aClass76_1199 = Static134.method2017("New User");

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "Lclient!v;")
	public static Class76 aClass76_1197 = aClass76_1199;

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "Lclient!v;")
	public static Class76 aClass76_1198 = aClass76_1193;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIII)V")
	public static void method1751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub8 local8 = Static62.method1079(arg1, arg0);
		if (local8 != null && local8.anObjectArray24 != null) {
			@Pc(17) Class4_Sub20 local17 = new Class4_Sub20();
			local17.anObjectArray28 = local8.anObjectArray24;
			local17.aClass4_Sub8_14 = local8;
			Static20.method307(local17);
		}
		Static90.anInt2117 = arg0;
		Static92.anInt2152 = arg1;
		Static18.aBoolean21 = true;
		Static119.anInt2563 = arg2;
		Static63.method1095(local8);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!la;ZII)[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] method1752(@OriginalArg(0) Class17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static1.method3(arg1, arg2, arg0) ? Static15.method179() : null;
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
	public static void method1755() {
		aClass76_1194 = null;
		aClass4_Sub4_Sub5_Sub2Array47 = null;
		aClass76_1196 = null;
		aClass81_10 = null;
		aClass68_14 = null;
		aClass76_1193 = null;
		aClass76_1198 = null;
		aClass76_1199 = null;
		aClass17_36 = null;
		aClass76_1197 = null;
		aClass76_1195 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!od;)V")
	public static void method1756(@OriginalArg(1) Class4_Sub15 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt2049 == 0) {
			local5 = aClass81_10.method1954(arg0.anInt2043, arg0.anInt2044, arg0.anInt2048);
		}
		@Pc(19) int local19 = 0;
		if (arg0.anInt2049 == 1) {
			local5 = aClass81_10.method1970(arg0.anInt2043, arg0.anInt2044, arg0.anInt2048);
		}
		if (arg0.anInt2049 == 2) {
			local5 = aClass81_10.method1990(arg0.anInt2043, arg0.anInt2044, arg0.anInt2048);
		}
		@Pc(55) int local55 = 0;
		if (arg0.anInt2049 == 3) {
			local5 = aClass81_10.method1966(arg0.anInt2043, arg0.anInt2044, arg0.anInt2048);
		}
		@Pc(72) int local72 = -1;
		if (local5 != 0) {
			@Pc(87) int local87 = aClass81_10.method1982(arg0.anInt2043, arg0.anInt2044, arg0.anInt2048, local5);
			local72 = local5 >> 14 & 0x7FFF;
			local19 = local87 >> 6 & 0x3;
			local55 = local87 & 0x1F;
		}
		arg0.anInt2052 = local55;
		arg0.anInt2053 = local19;
		arg0.anInt2041 = local72;
	}
}
