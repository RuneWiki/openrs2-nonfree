import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	public static int anInt923;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!pa;")
	public static Class5_Sub14 aClass5_Sub14_2 = new Class5_Sub14(8);

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public static int anInt917 = 0;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public static int anInt918 = 0;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!r;")
	private static Class61 aClass61_276 = Static129.method2060("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_275 = aClass61_276;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!r;")
	private static Class61 aClass61_279 = Static129.method2060("Use");

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_277 = aClass61_279;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_278 = Static129.method2060("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	public static volatile int anInt922 = 0;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	public static int anInt924 = 127;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	public static int anInt925 = 0;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	public static int anInt926 = -1;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method632() {
		aByteArrayArrayArray2 = null;
		aClass61_276 = null;
		aString1 = null;
		aClass61_279 = null;
		aClass5_Sub14_2 = null;
		aClass61_277 = null;
		aClass61_278 = null;
		aClass61_275 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!j;")
	public static RuntimeException_Sub1 method633(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString2 = local12.aString2 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
