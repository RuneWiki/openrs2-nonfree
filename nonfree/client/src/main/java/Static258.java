import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!tm", name = "ib", descriptor = "Lclient!mf;")
	public static Class100 aClass100_7;

	@OriginalMember(owner = "client!tm", name = "bb", descriptor = "Lclient!pm;")
	public static Class125 aClass125_6 = new Class125(64);

	@OriginalMember(owner = "client!tm", name = "jb", descriptor = "Ljava/lang/String;")
	public static String aString183 = "Loaded config";

	@OriginalMember(owner = "client!tm", name = "lb", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!tm", name = "mb", descriptor = "I")
	public static int anInt5644 = 0;

	@OriginalMember(owner = "client!tm", name = "nb", descriptor = "[S")
	public static short[] aShortArray88 = new short[] { 17, 32, 39, 45, 25, 43, 49, 44 };

	@OriginalMember(owner = "client!tm", name = "ob", descriptor = "I")
	public static int anInt5645 = 7759444;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V")
	public static void method4391(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub6 local13 = Static104.method831(arg0, 4);
		local13.method1189();
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)Lclient!lj;")
	public static Class93 method4393(@OriginalArg(0) int arg0) {
		@Pc(14) Class93 local14 = (Class93) Static11.aClass155_26.method4358((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static49.aClass83_34.method2306(31, arg0);
		local14 = new Class93();
		if (local28 != null) {
			local14.method2857(arg0, new Class1_Sub16(local28));
		}
		Static11.aClass155_26.method4360((long) arg0, local14);
		return local14;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)Z")
	public static boolean method4394(@OriginalArg(0) int arg0) {
		if (Static24.anInt494 == arg0) {
			return false;
		}
		Static130.anIntArrayArrayArray13 = new int[4][13][13];
		Static150.anIntArrayArray12 = new int[104][104];
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			Static213.aClass36Array1[local28] = new Class36(104, 104);
		}
		Static269.aByteArrayArrayArray51 = new byte[4][104][104];
		Static126.aByteArrayArrayArray24 = new byte[4][104][104];
		Static240.aClass131ArrayArrayArray1 = new Class131[4][104][104];
		if (Static296.aBoolean335) {
			Static67.method1283();
			Static124.method2115();
			Static112.aClass59ArrayArray1 = new Class59[13][13];
		}
		Static24.anInt494 = arg0;
		return true;
	}
}
