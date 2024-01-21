import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public static int anInt2925;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!bg;")
	public static final Class11 aClass11_12 = new Class11();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "[I")
	public static final int[] anIntArray274 = new int[25];

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public static int anInt2922 = 1;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
	public static final int[] anIntArray275 = new int[100];

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1074 = Static177.method3050("Please remove ");

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1071 = aClass46_1074;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1072 = aClass46_1074;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1073 = Static177.method3050("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
	public static final int[] anIntArray276 = new int[2048];

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[Lclient!vh;")
	public static final Class92[] aClass92Array1 = new Class92[4];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZZ)Lclient!ud;")
	public static Class62_Sub1 method2177(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class52 local10 = null;
		if (Static172.aClass56_5 != null) {
			local10 = new Class52(arg0, Static172.aClass56_5, Static109.aClass56Array1[arg0], 1000000);
		}
		return new Class62_Sub1(local10, Static42.aClass52_1, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[[[I)V")
	public static void method2178(@OriginalArg(3) int[][][] arg0) {
		Static135.anInt3222 = 4;
		Static57.anInt1408 = 104;
		Static84.anInt4112 = 104;
		Static28.aClass4_Sub7ArrayArrayArray1 = new Class4_Sub7[4][104][104];
		Static73.anIntArrayArrayArray21 = new int[4][105][105];
		Static142.anIntArrayArrayArray33 = arg0;
		Static91.method1803();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public static int method2179(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
