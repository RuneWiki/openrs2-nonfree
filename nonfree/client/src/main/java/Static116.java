import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Z")
	public static boolean aBoolean139;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public static int anInt2887;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!cf;")
	public static Class16 aClass16_9;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1513 = Static28.method504("Angreifen");

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1514 = Static28.method504("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1515 = Static28.method504("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1516 = Static28.method504("Select");

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1517 = Static28.method504("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!pb;")
	public static Class61 aClass61_14 = new Class61();

	@OriginalMember(owner = "client!u", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1518 = aClass39_1515;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1519 = aClass39_1516;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	public static int anInt2894 = 0;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "I")
	public static int anInt2896 = 255;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1520 = Static28.method504(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1521 = Static28.method504("::");

	@OriginalMember(owner = "client!u", name = "y", descriptor = "[I")
	public static int[] anIntArray312 = new int[2048];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!bd;")
	public static Class4_Sub2_Sub2 method2017(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub2 local10 = (Class4_Sub2_Sub2) Static126.aClass12_88.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static100.aClass20_50.method474(12, arg0);
		local10 = new Class4_Sub2_Sub2();
		if (local29 != null) {
			local10.method213(new Class4_Sub16(local29));
		}
		local10.method208();
		Static126.aClass12_88.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method2019() {
		aClass61_14 = null;
		aClass39_1519 = null;
		aClass39_1518 = null;
		anIntArray312 = null;
		aClass39_1520 = null;
		aClass16_9 = null;
		aClass39_1521 = null;
		aClass39_1515 = null;
		aClass39_1513 = null;
		aClass39_1517 = null;
		aClass39_1516 = null;
		aClass39_1514 = null;
	}
}
