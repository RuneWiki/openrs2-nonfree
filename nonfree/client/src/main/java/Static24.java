import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!fc;")
	public static Class24 aClass24_3;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "J")
	public static volatile long aLong24 = 0L;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_205 = Static134.method2017("hel");

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!fd;")
	public static Class4_Sub10_Sub1 aClass4_Sub10_Sub1_1 = new Class4_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_206 = Static134.method2017(")3runescape)3com");

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_207 = Static134.method2017("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "[I")
	public static int[] anIntArray76 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!v;")
	private static Class76 aClass76_208 = Static134.method2017("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_209 = aClass76_208;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!v;")
	public static Class76 aClass76_210 = Static134.method2017("Mem:");

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_211 = Static134.method2017("Weiter");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method352() {
		@Pc(1) Object local1 = Static99.anObject35;
		synchronized (Static99.anObject35) {
			if (Static97.anInt2247 == 0) {
				Static121.aClass14_3.method192(new Class33(), 5);
			}
			Static97.anInt2247 = 600;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!v;Lclient!v;Lclient!la;I)Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 method353(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class17 arg2) {
		@Pc(8) int local8 = arg2.method299(arg1);
		@Pc(22) int local22 = arg2.method298(arg0, local8);
		return Static47.method838(local22, arg2, local8);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBLclient!je;I)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub4_Sub3_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt1390 == arg2 && arg2 != -1) {
			@Pc(57) int local57 = Static118.method1796(arg2).anInt1563;
			if (local57 == 1) {
				arg1.anInt1417 = arg0;
				arg1.anInt1385 = 0;
				arg1.anInt1423 = 0;
				arg1.anInt1415 = 0;
			}
			if (local57 == 2) {
				arg1.anInt1423 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt1390 == -1 || Static118.method1796(arg2).anInt1552 >= Static118.method1796(arg1.anInt1390).anInt1552) {
			arg1.anInt1423 = 0;
			arg1.anInt1385 = 0;
			arg1.anInt1390 = arg2;
			arg1.anInt1417 = arg0;
			arg1.anInt1404 = arg1.anInt1434;
			arg1.anInt1415 = 0;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method355() {
		anIntArray76 = null;
		aClass76_208 = null;
		aClass76_206 = null;
		aClass4_Sub10_Sub1_1 = null;
		aClass24_3 = null;
		aClass76_211 = null;
		aByteArrayArrayArray1 = null;
		aClass76_207 = null;
		aClass76_209 = null;
		aClass76_205 = null;
		aClass76_210 = null;
	}
}
