import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!aq;")
	public static Class5 aClass5_14;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_220 = new Class221("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
	public static boolean aBoolean461 = true;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_165 = new Class77(45, 14);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BB)Z")
	public static boolean method5289(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(12) int local12 = local8.method4240();
		if (local12 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method4240() == 1;
		if (local33) {
			Static79.method1415(local8);
		}
		Static232.method3810(local8);
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	public static void method5290(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub1_Sub2 local16 = Static323.method4982(arg0, 5);
		local16.method412();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBII)V")
	public static void method5291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static355.method5388(Static313.anInt5542, arg4, Static345.anInt6084);
		@Pc(17) int local17 = Static355.method5388(Static313.anInt5542, arg3, Static345.anInt6084);
		@Pc(28) int local28 = Static355.method5388(Static332.anInt5823, arg2, Static202.anInt3722);
		@Pc(34) int local34 = Static355.method5388(Static332.anInt5823, arg1, Static202.anInt3722);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static264.method4096(Static267.anIntArrayArray38[local36], arg0, local34, local28);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public static void method5293() {
		Static389.method5721(Static32.anInt6037);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!fc;Lclient!fc;I)V")
	public static void method5294(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1) {
		Static137.aClass71_29 = arg0;
		Static110.aClass71_23 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(CI)Z")
	public static boolean method5295(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method5296() {
		Static379.anInt1192 = 0;
		Static66.aClass210_43.method5043();
		Static66.aClass210_43.method5044(Static327.aClass2_Sub7_2);
		Static379.anInt1192++;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!fc;B)V")
	public static void method5297(@OriginalArg(0) Class71 arg0) {
		Static10.anInt310 = arg0.method1568("titlebg");
		Static58.anInt5536 = arg0.method1568("logo");
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(IB)I")
	public static int method5301(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
