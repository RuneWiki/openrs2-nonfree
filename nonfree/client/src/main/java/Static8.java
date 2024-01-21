import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "Lclient!j;")
	public static Class2_Sub1_Sub12_Sub1_Sub1 aClass2_Sub1_Sub12_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_60 = Static151.method2243("level)2");

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "Lclient!mb;")
	public static Class62 aClass62_61 = aClass62_60;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	public static int method147(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
	public static void method148() {
		if (Static174.aClass3_2 != null) {
			Static174.aClass3_2.method102();
		}
		if (Static96.aClass3_1 != null) {
			Static96.aClass3_1.method102();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!pb;B)Lclient!vi;")
	public static Class2_Sub1_Sub2 method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		return Static157.method2317(arg1, arg2, arg0) ? Static83.method1175() : null;
	}
}
