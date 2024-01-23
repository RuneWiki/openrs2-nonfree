import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public static int anInt4827;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public static int anInt4823 = 0;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString164 = "Loaded textures";

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public static int anInt4826 = 0;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "[I")
	public static int[] anIntArray474 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString165 = "";

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method3865() {
		Static29.aClass157_7.method4034(5);
		Static90.aClass157_20.method4034(5);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	public static void method3866(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(5, arg1);
		local8.method2052();
		local8.anInt2698 = arg0;
	}
}
