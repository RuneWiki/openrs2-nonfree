import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!ca;")
	public static Class12 aClass12_61;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public static int anInt2923;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!oc;")
	public static Class56 aClass56_92;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!dc;")
	public static Class1_Sub5 aClass1_Sub5_62;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1409 = Static78.method1313("Username: ");

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1410 = Static78.method1313("mapedge");

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "J")
	public static long aLong183 = 0L;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public static int anInt2922 = 0;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1411 = Static78.method1313("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "[I")
	public static int[] anIntArray495 = new int[100];

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1412 = aClass25_1409;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
	public static int anInt2927 = 0;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
	public static int[] anIntArray496 = new int[50];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2019() {
		Static39.aByteArrayArrayArray5 = null;
		Static120.anIntArray486 = null;
		Static37.anIntArrayArray10 = null;
		Static71.anIntArray278 = null;
		Static97.anIntArray399 = null;
		Static97.anIntArrayArrayArray7 = null;
		Static28.aByteArrayArrayArray2 = null;
		Static26.aByteArrayArrayArray1 = null;
		Static22.anIntArray161 = null;
		Static14.anIntArray76 = null;
		Static38.aByteArrayArrayArray3 = null;
		Static85.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2020() {
		aClass25_1409 = null;
		anIntArray496 = null;
		aClass25_1411 = null;
		aClass25_1412 = null;
		aClass25_1410 = null;
		anIntArray495 = null;
		aClass56_92 = null;
		aClass1_Sub5_62 = null;
		anIntArray497 = null;
		aClass12_61 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!oc;Lclient!fc;BLclient!fc;)[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] method2021(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		@Pc(13) int local13 = arg0.method1278(arg1);
		@Pc(19) int local19 = arg0.method1264(arg2, local13);
		return Static37.method857(local19, local13, arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLclient!oc;Lclient!oc;B)V")
	public static void method2022(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2) {
		Static109.aClass56_75 = arg2;
		Static125.aClass56_74 = arg1;
		Static27.aBoolean24 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIZZZ)Lclient!mf;")
	public static Class56_Sub1 method2023(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) Class70 local13 = null;
		if (aClass12_61 != null) {
			local13 = new Class70(arg0, aClass12_61, Static33.aClass12Array1[arg0], 1000000);
		}
		return new Class56_Sub1(local13, Static94.aClass70_4, arg0, arg2, arg1, arg3);
	}
}
