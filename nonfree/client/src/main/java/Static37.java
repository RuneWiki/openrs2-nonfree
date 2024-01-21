import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static37 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array3;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
	public static int[] anIntArray124 = new int[500];

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Lclient!ed;")
	public static Class23 aClass23_386 = Static169.method2903("(U0a )2 in: ");

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!ed;")
	public static Class23 aClass23_387 = Static169.method2903("<br>(X");

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	public static int anInt994 = 0;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	public static int anInt996 = 0;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "Lclient!ed;")
	public static Class23 aClass23_388 = Static169.method2903("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z")
	public static boolean method594(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public static void method596() {
		aClass23_386 = null;
		aClass23_388 = null;
		aClass1_Sub1_Sub12_Sub1Array3 = null;
		anIntArray125 = null;
		anIntArray124 = null;
		aClass23_387 = null;
	}
}
