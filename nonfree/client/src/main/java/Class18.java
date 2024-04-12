import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class Class18 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lclient!fb;")
	public static Class20[] aClass20Array3 = new Class20[4];

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
	public static int[] anIntArray415 = new int[5];

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_542 = Static12.method257(":chalreq:");

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[50][];

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_545 = Static12.method257("@yel@World");

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_544 = Static12.method257("chatback");

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt1871 = 0;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int anInt1868 = 0;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_543 = Static12.method257("q8_full");

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
	public static int[] anIntArray416 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public static int anInt1874 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
	public abstract int method1274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public abstract void method1275();

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public abstract void method1280();
}
