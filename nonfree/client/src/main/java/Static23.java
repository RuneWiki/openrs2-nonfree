import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_18;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3 aClass4_Sub1_Sub7_Sub3_1;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!nh;")
	public static Class62 aClass62_6;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array4 = new Class46[200];

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_191 = Static177.method3050("(Udns");

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_192 = Static177.method3050("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_193 = Static177.method3050("(U5");

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_194 = Static177.method3050("<br>");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!jd;IIII)V")
	public static void method393(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1 local8 = Static132.method2334(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray7 != null) {
			@Pc(18) Class4_Sub21 local18 = new Class4_Sub21();
			local18.aClass1_40 = local8;
			local18.anObjectArray28 = local8.anObjectArray7;
			local18.anInt3266 = arg2;
			local18.aClass46_1205 = arg0;
			Static2.method18(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt62 > 0) {
			local36 = Static183.method1447(local8);
		}
		if (!local36 || !Static18.method328(arg2 - 1, Static102.method1954(local8))) {
			return;
		}
		if (arg2 == 1) {
			Static90.aClass4_Sub11_Sub1_1.method1285(244);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 2) {
			Static90.aClass4_Sub11_Sub1_1.method1285(169);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 3) {
			Static90.aClass4_Sub11_Sub1_1.method1285(47);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 4) {
			Static90.aClass4_Sub11_Sub1_1.method1285(249);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 5) {
			Static90.aClass4_Sub11_Sub1_1.method1285(136);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 6) {
			Static90.aClass4_Sub11_Sub1_1.method1285(181);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 7) {
			Static90.aClass4_Sub11_Sub1_1.method1285(241);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 8) {
			Static90.aClass4_Sub11_Sub1_1.method1285(225);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 9) {
			Static90.aClass4_Sub11_Sub1_1.method1285(164);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
		if (arg2 == 10) {
			Static90.aClass4_Sub11_Sub1_1.method1285(8);
			Static90.aClass4_Sub11_Sub1_1.method1256(arg3);
			Static90.aClass4_Sub11_Sub1_1.method1268(arg1);
		}
	}
}
