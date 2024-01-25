import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!au", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!au", name = "m", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "I")
	public static int anInt445;

	@OriginalMember(owner = "client!au", name = "r", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!au", name = "B", descriptor = "I")
	public static int anInt454;

	@OriginalMember(owner = "client!au", name = "D", descriptor = "J")
	public static long aLong15;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_1 = new Class284(3, 5);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!gba;Lclient!gba;I)V")
	public static void method435(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class115 arg1) {
		@Pc(12) Class4_Sub41 local12 = Static128.method2707(Static454.aClass61_105, Class16_Sub3.lb);
		local12.aClass4_Sub9_Sub1_3.method5963(arg0.anInt3464);
		local12.aClass4_Sub9_Sub1_3.method6012(arg0.anInt3510);
		local12.aClass4_Sub9_Sub1_3.method6012(arg0.anInt3517);
		local12.aClass4_Sub9_Sub1_3.method6002(arg1.anInt3510);
		local12.aClass4_Sub9_Sub1_3.method5964(arg1.anInt3464);
		local12.aClass4_Sub9_Sub1_3.method5984(arg1.anInt3517);
		Static551.method7603(local12);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)I")
	public static int method436(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIZI)I")
	public static int method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class4_Sub20 local8 = Static17.method367(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray308.length > arg1) {
			return local8.anIntArray308[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!fg;B)Ljava/lang/String;")
	public static String method438(@OriginalArg(0) Class4_Sub18 arg0) {
		return arg0.aString26 == null || arg0.aString26.length() <= 0 ? arg0.aString27 : arg0.aString27 + Static275.aClass198_31.method4407(Static56.anInt953) + arg0.aString26;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static68.anInt1306 <= arg6 && Static589.anInt9684 >= arg1 && Static252.anInt4971 <= arg4 && arg3 <= Static359.anInt6232) {
			Static583.method7896(arg2, arg3, arg5, arg1, arg4, arg6, arg0);
		} else {
			Static168.method3261(arg1, arg5, arg4, arg6, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	public static void method440() {
		if (Static346.anInterface7Array1 == null) {
			return;
		}
		@Pc(5) Interface7[] local5 = Static346.anInterface7Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface7 local13 = local5[local7];
			local13.method7204();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	public static void method441() {
		Static99.aClass223_12.method4933(5);
	}
}
