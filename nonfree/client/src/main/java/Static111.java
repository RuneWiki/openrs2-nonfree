import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_107;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1309 = Static56.method972("To create a new account you need to");

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1310 = Static56.method972("backleft2");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1311 = Static56.method972("Entfernen");

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1312 = Static56.method972(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!w", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][105][105];

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1313 = aClass5_1309;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1314 = Static56.method972("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public static int anInt2907 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method1919() {
		Static4.aClass9_5.method283();
		Static115.aClass9_27.method283();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method1920() {
		aClass5_1310 = null;
		aClass5_1312 = null;
		aClass11_Sub1_107 = null;
		aClass5_1313 = null;
		aClass5_1314 = null;
		anIntArrayArrayArray7 = null;
		aClass5_1311 = null;
		aClass5_1309 = null;
		aLongArray7 = null;
		aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ba;ZI[B)V")
	public static void method1921(@OriginalArg(0) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class3_Sub9 local7 = new Class3_Sub9();
		local7.aLong85 = arg1;
		local7.aByteArray14 = arg2;
		local7.anInt1958 = 0;
		local7.aClass8_2 = arg0;
		@Pc(26) Class51 local26 = Static18.aClass51_5;
		synchronized (Static18.aClass51_5) {
			Static18.aClass51_5.method1303(local7);
		}
		Static109.method1899();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!bf;Lclient!bf;Lclient!bf;I)V")
	public static void method1922(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2) {
		Static87.aClass11_53 = arg2;
		Static60.aClass11_72 = arg0;
		Static79.aClass11_44 = arg1;
	}
}
