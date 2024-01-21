import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!t", name = "L", descriptor = "Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_4;

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!t", name = "R", descriptor = "I")
	public static int anInt2897;

	@OriginalMember(owner = "client!t", name = "V", descriptor = "[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array12;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "Lclient!he;")
	public static Class26 aClass26_1568 = Static6.method100("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!t", name = "K", descriptor = "[B")
	public static byte[] aByteArray38 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!t", name = "N", descriptor = "Lclient!he;")
	public static Class26 aClass26_1569 = Static6.method100("::gc");

	@OriginalMember(owner = "client!t", name = "O", descriptor = "Lclient!he;")
	private static Class26 aClass26_1570 = Static6.method100("wave2:");

	@OriginalMember(owner = "client!t", name = "P", descriptor = "Lclient!he;")
	public static Class26 aClass26_1571 = Static6.method100("null");

	@OriginalMember(owner = "client!t", name = "S", descriptor = "Lclient!he;")
	public static Class26 aClass26_1572 = aClass26_1570;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "Lclient!he;")
	public static Class26 aClass26_1573 = Static6.method100("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!t", name = "U", descriptor = "Lclient!he;")
	public static Class26 aClass26_1574 = aClass26_1570;

	@OriginalMember(owner = "client!t", name = "W", descriptor = "I")
	public static volatile int anInt2898 = 0;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "I")
	public static int anInt2899 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method1979(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static93.aBoolean139) {
			try {
				@Pc(23) Class45 local23 = (Class45) Class.forName("Class45_Sub1").getDeclaredConstructor().newInstance();
				local23.method1676(arg0);
				return local23;
			} catch (@Pc(32) Throwable local32) {
				Static93.aBoolean139 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public static void method1980() {
		aClass26_1568 = null;
		anIntArray346 = null;
		aClass26_1574 = null;
		aClass26_1572 = null;
		aClass26_1571 = null;
		aClass26_1573 = null;
		aByteArray38 = null;
		aClass26_1570 = null;
		aClass26_1569 = null;
		aClass3_Sub1_Sub4_Sub3Array12 = null;
		aClass3_Sub1_Sub4_Sub3_4 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!he;Lclient!ef;Lclient!he;Z)[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] method1981(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class26 arg2) {
		@Pc(4) int local4 = arg1.method574(arg0);
		@Pc(23) int local23 = arg1.method567(arg2, local4);
		return Static43.method1872(local4, local23, arg1);
	}
}
