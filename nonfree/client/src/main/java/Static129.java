import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public static int anInt2870;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!kb;")
	public static Class83 aClass83_88;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "Lclient!kb;")
	public static Class83 aClass83_89;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
	public static int[] anIntArray267 = new int[4096];

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "[I")
	public static int[] anIntArray268 = new int[100];

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "Lclient!tl;")
	public static Class155 aClass155_23 = new Class155(64);

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	public static int anInt2873 = 0;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "Lclient!tl;")
	public static Class155 aClass155_24 = new Class155(500);

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "[Lclient!k;")
	public static Class81[] aClass81Array1 = new Class81[8];

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	public static int anInt2875 = -1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ok;II)Ljava/lang/String;")
	public static String method2195(@OriginalArg(0) Class116 arg0, @OriginalArg(2) int arg1) {
		if (!Static37.method866(arg0).method1105(arg1) && arg0.anObjectArray2 == null) {
			return null;
		} else if (arg0.aStringArray21 == null || arg0.aStringArray21.length <= arg1 || arg0.aStringArray21[arg1] == null || arg0.aStringArray21[arg1].trim().length() == 0) {
			return Static24.aBoolean27 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray21[arg1];
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
	public static void method2196(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 7);
		local8.method1189();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public static void method2197() {
		if (Static191.aClass158_1 != null) {
			@Pc(5) Class158 local5 = Static191.aClass158_1;
			synchronized (Static191.aClass158_1) {
				Static191.aClass158_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method2198(@OriginalArg(0) Class83 arg0) {
		Static46.anInt6184 = arg0.method2322("titlebg");
		Static270.anInt5838 = arg0.method2322("logo");
	}
}
