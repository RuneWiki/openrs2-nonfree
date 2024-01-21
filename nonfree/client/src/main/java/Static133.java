import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	public static int anInt566;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!we", name = "R", descriptor = "[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array5;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_309 = Static6.method100("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt555 = 0;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "Lclient!he;")
	private static Class26 aClass26_314 = Static6.method100("wishes to trade with you)3");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_310 = aClass26_314;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	public static int anInt560 = 0;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_311 = Static6.method100("headicons_hint");

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Lclient!he;")
	public static Class26 aClass26_312 = Static6.method100("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Lclient!he;")
	public static Class26 aClass26_313 = Static6.method100("logo");

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method372() {
		aClass26_312 = null;
		aClass26_311 = null;
		aClass26_310 = null;
		aByteArrayArray3 = null;
		aClass3_Sub1_Sub4_Sub1Array5 = null;
		aClass26_313 = null;
		aClass26_314 = null;
		aClass26_309 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!he;ZILclient!he;Lclient!ef;)V")
	public static void method377(@OriginalArg(1) Class26 arg0, @OriginalArg(4) Class26 arg1, @OriginalArg(5) Class16 arg2) {
		@Pc(14) int local14 = arg2.method574(arg0);
		@Pc(20) int local20 = arg2.method567(arg1, local14);
		Static113.method2067(255, arg2, local20, local14);
	}
}
