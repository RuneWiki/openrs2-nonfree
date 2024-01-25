import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
	public static int anInt4365;

	@OriginalMember(owner = "client!hs", name = "bb", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!hs", name = "cb", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!hs", name = "eb", descriptor = "Lclient!saa;")
	public static Class295 aClass295_1;

	@OriginalMember(owner = "client!hs", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!hs", name = "X", descriptor = "Lclient!ac;")
	public static final Class5 aClass5_6 = new Class5("WTRC", 1);

	@OriginalMember(owner = "client!hs", name = "Z", descriptor = "[I")
	public static final int[] anIntArray197 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!hs", name = "db", descriptor = "I")
	public static final int anInt4382 = 328;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)Z")
	public static boolean method3536(@OriginalArg(1) int arg0) {
		Static231.aBoolean303 = true;
		Static538.anInt9387 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "(B)V")
	public static void method3537() {
		@Pc(16) Class3_Sub10 local16 = Static129.method2403(Static452.aClass353_2, Static211.aClass287_138);
		local16.aClass3_Sub26_Sub1_1.method6809(0);
		Static193.method3398(local16);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method3538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if ((arg5 ? Static348.aClass3_Sub51_Sub1_5.anInt9958 : Static348.aClass3_Sub51_Sub1_5.anInt9949) != 0 && arg4 != 0 && Static345.anInt6219 < 50 && arg3 != -1) {
			Static73.aClass367Array4[Static345.anInt6219++] = new Class367((byte) (arg5 ? 3 : 2), arg3, arg4, arg2, arg0, 0, arg1, null);
		}
	}
}
