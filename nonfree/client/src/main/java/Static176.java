import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!kg;")
	public static Class43 aClass43_44;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt4472;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array24;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_8;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1541 = Static49.method1293("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1542 = Static49.method1293("gr-Un:");

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
	public static int[] anIntArray423 = new int[128];

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1543 = Static49.method1293("mapedge");

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1544 = Static49.method1293(")3");

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1545 = Static49.method1293("welle2:");

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!fa;")
	public static Class1_Sub9 aClass1_Sub9_4 = new Class1_Sub9(new byte[5000]);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method3431() {
		Static164.aClass25_23.method1300();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method3432() {
		aClass70_1544 = null;
		aClass70_1541 = null;
		aClass43_44 = null;
		aClass70_1545 = null;
		aClass70Array24 = null;
		aShortArrayArray6 = null;
		aClass18_8 = null;
		aClass70_1542 = null;
		anIntArray423 = null;
		aClass1_Sub9_4 = null;
		aClass70_1543 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Lclient!g;")
	public static Class1_Sub1_Sub7 method3433(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static135.aClass25_20.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static85.aClass76_73.method3316(arg0, 6);
		local10 = new Class1_Sub1_Sub7();
		local10.anInt1810 = arg0;
		if (local25 != null) {
			local10.method1402(new Class1_Sub9(local25));
		}
		local10.method1396();
		if (local10.aBoolean66) {
			local10.aBoolean67 = false;
			local10.anInt1842 = 0;
		}
		Static135.aClass25_20.method1299(local10, (long) arg0);
		return local10;
	}
}
