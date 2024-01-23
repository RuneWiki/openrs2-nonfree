import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!va", name = "o", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!nm;")
	public static Class119 aClass119_91;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString210;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!lm;")
	public static Class1_Sub7_Sub2 aClass1_Sub7_Sub2_3;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "I")
	public static int anInt5278;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Z")
	public static boolean aBoolean497;

	@OriginalMember(owner = "client!va", name = "H", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!nm;Lclient!nm;)V")
	public static void method4395(@OriginalArg(1) Class119 arg0, @OriginalArg(2) Class119 arg1) {
		Static40.aClass119_14 = arg1;
		Static228.aClass119_76 = arg0;
		Static40.aClass119_14.method3217(36);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method4396() {
		Static266.aClass175_39.method4287();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)Lclient!bb;")
	public static Class1_Sub5_Sub1 method4398() {
		if (Static249.aClass189_13 == null) {
			return null;
		}
		for (@Pc(21) Class1_Sub5_Sub1 local21 = (Class1_Sub5_Sub1) Static234.aClass98_1.method2472(); local21 != null; local21 = (Class1_Sub5_Sub1) Static234.aClass98_1.method2472()) {
			@Pc(29) Class136 local29 = Static160.method2739(local21.anInt359);
			if (local29 != null && local29.aBoolean368 && local29.method3522()) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	public static void method4399() {
		Static128.aClass175_21.method4294();
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
	public static void method4400() {
		if (Static94.aClass138_1 != null) {
			@Pc(10) Class138 local10 = Static94.aClass138_1;
			synchronized (Static94.aClass138_1) {
				Static94.aClass138_1 = null;
			}
		}
	}
}
