import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_16;

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "Lclient!ea;")
	private static Class18 aClass18_330 = Static8.method128("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!f", name = "db", descriptor = "Lclient!ea;")
	private static Class18 aClass18_331 = Static8.method128("Invalid username or password)3");

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_332 = Static8.method128("Please reload this page)3");

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_333 = aClass18_330;

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_334 = aClass18_332;

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_335 = Static8.method128("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!f", name = "nb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_336 = aClass18_330;

	@OriginalMember(owner = "client!f", name = "ob", descriptor = "Lclient!ea;")
	public static Class18 aClass18_337 = Static8.method128(":trade:");

	@OriginalMember(owner = "client!f", name = "pb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_338 = aClass18_331;

	@OriginalMember(owner = "client!f", name = "sb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_339 = Static8.method128(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!f", name = "tb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_340 = Static8.method128("mapdots");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dd;Lclient!dd;I)V")
	public static void method845(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1) {
		Static82.aClass16_9 = arg1;
		Static85.aClass16_11 = arg0;
		Static8.anInt224 = Static82.aClass16_9.method2252(3);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ec;")
	public static RuntimeException_Sub1 method846(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static void method847() {
		aClass18_332 = null;
		aClass18_334 = null;
		aClass18_339 = null;
		aClass18_337 = null;
		aClass18_338 = null;
		aClass18_335 = null;
		aClass16_Sub1_16 = null;
		aClass18_330 = null;
		aClass18_336 = null;
		aClass18_331 = null;
		aBooleanArray3 = null;
		aClass18_333 = null;
		aClass18_340 = null;
	}
}
