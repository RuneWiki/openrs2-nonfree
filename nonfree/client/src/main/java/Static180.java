import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	public static int anInt3211;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Lclient!se;")
	public static Class1_Sub40 aClass1_Sub40_2;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
	public static int anInt3208 = 0;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_79 = new Class211(62, 17);

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_80 = new Class211(98, 3);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BILclient!ui;I)Lclient!vn;")
	public static Class238 method2595(@OriginalArg(1) int arg0, @OriginalArg(2) Class230 arg1) {
		@Pc(9) byte[] local9 = arg1.method4985(0, arg0);
		return local9 == null ? null : new Class238(local9);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public static void method2596() {
		if (Static182.aClass73_3 != Static96.aClass73_2) {
			try {
				Static396.method1248(Static305.aClient1, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLclient!se;)Ljava/lang/String;")
	public static String method2597(@OriginalArg(1) Class1_Sub40 arg0) {
		return arg0.aString63 == null || arg0.aString63.length() <= 0 ? arg0.aString62 : arg0.aString62 + Static294.aClass169_276.method3680(Static48.anInt952) + arg0.aString63;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBI)Z")
	public static boolean method2598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static373.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}
}
