import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!rd;")
	private static Class64 aClass64_323 = Static69.method1153("Take");

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_322 = aClass64_323;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!rd;")
	private static Class64 aClass64_324 = Static69.method1153("Please use a different world)3");

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "J")
	public static long aLong19 = 0L;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt477 = -1;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_325 = aClass64_324;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!rd;")
	private static Class64 aClass64_327 = Static69.method1153("Enter name of friend to add to list");

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "Lclient!rd;")
	public static Class64 aClass64_326 = aClass64_327;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_328 = Static69.method1153("(X100(U(Y");

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!rd;")
	private static Class64 aClass64_334 = Static69.method1153("Enter object name");

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!rd;")
	public static Class64 aClass64_329 = aClass64_334;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_330 = Static69.method1153("::clientdrop");

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_331 = Static69.method1153("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!rd;")
	public static Class64 aClass64_332 = Static69.method1153("blinken3:");

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_333 = aClass64_324;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
	public static void method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			anInt477 = -1;
			Static30.anInt788 = -1;
			return;
		}
		@Pc(31) int local31 = Static114.method1996(Static15.anInt463, arg2, arg0) - arg1;
		@Pc(35) int local35 = arg2 - Static119.anInt2846;
		@Pc(39) int local39 = arg0 - Static80.anInt1899;
		@Pc(43) int local43 = local31 - Static106.anInt2503;
		@Pc(47) int local47 = Class1_Sub1_Sub5_Sub4.anIntArray427[Static116.anInt2779];
		@Pc(51) int local51 = Class1_Sub1_Sub5_Sub4.anIntArray429[Static72.anInt1642];
		@Pc(55) int local55 = Class1_Sub1_Sub5_Sub4.anIntArray427[Static72.anInt1642];
		@Pc(59) int local59 = Class1_Sub1_Sub5_Sub4.anIntArray429[Static116.anInt2779];
		@Pc(69) int local69 = local35 * local59 + local39 * local47 >> 16;
		@Pc(79) int local79 = local39 * local59 - local35 * local47 >> 16;
		@Pc(81) int local81 = local69;
		@Pc(92) int local92 = local51 * local43 - local79 * local55 >> 16;
		@Pc(102) int local102 = local79 * local51 + local55 * local43 >> 16;
		if (local102 < 50) {
			Static30.anInt788 = -1;
			anInt477 = -1;
		} else {
			anInt477 = (local81 << 9) / local102 + 256;
			Static30.anInt788 = (local92 << 9) / local102 + 167;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!nd;Lclient!nd;II)Lclient!nd;")
	public static Class1_Sub1_Sub11 method302(@OriginalArg(1) Class1_Sub1_Sub11 arg0, @OriginalArg(2) Class1_Sub1_Sub11 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) Class1_Sub1_Sub11 local23 = Static81.method1058(arg1, 0, 0, arg0.anInt1707, arg2, arg0.anInt1717, Static65.aClass1_Sub1_Sub11ArrayArray1[arg0.anInt1717 >> 16], arg0.anInt1706, arg3, arg0.anInt1700, arg0.anInt1689);
		if (local23 == null) {
			if (arg0.aClass1_Sub1_Sub11Array2 != null) {
				local23 = Static81.method1058(arg1, 0, 0, arg0.anInt1707, arg2, arg0.anInt1717, arg0.aClass1_Sub1_Sub11Array2, arg0.anInt1706, arg3, arg0.anInt1700, arg0.anInt1689);
			}
			return local23;
		} else {
			return local23;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method303() {
		aClass64_322 = null;
		aClass64_323 = null;
		aClass64_334 = null;
		aClass64_325 = null;
		aClass64_333 = null;
		aClass64_331 = null;
		aClass64_328 = null;
		aClass64_329 = null;
		aClass64_326 = null;
		aClass64_330 = null;
		aClass64_327 = null;
		aClass64_324 = null;
		aClass64_332 = null;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method304() {
		Static52.aClass19_110.method416();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!nd;Z)Lclient!rd;")
	public static Class64 method305(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		if (Static99.method1599(Static31.method548(arg0)) == 0) {
			return null;
		} else if (arg0.aClass64_1066 == null || arg0.aClass64_1066.method1477().method1469() == 0) {
			return Static1.aBoolean3 ? Static98.aClass64_1397 : null;
		} else {
			return arg0.aClass64_1066;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILjava/awt/Component;Lclient!g;I)Lclient!re;")
	public static Class1_Sub2_Sub2 method306(@OriginalArg(2) Component arg0, @OriginalArg(3) Class28 arg1) {
		Static62.method1089(arg0, arg1);
		@Pc(18) Class1_Sub2_Sub2 local18 = new Class1_Sub2_Sub2();
		Static25.method2026(local18);
		return local18;
	}
}
