import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!oi", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!oi", name = "G", descriptor = "Lclient!r;")
	public static Class1_Sub3_Sub1_Sub3_Sub1 aClass1_Sub3_Sub1_Sub3_Sub1_4;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1368 = Static187.method3089("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1367 = aClass92_1368;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_16 = new Class20();

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1369 = Static187.method3089("Please try using a different world)3");

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1370 = aClass92_1369;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1371 = aClass92_1369;

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1372 = aClass92_1369;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1373 = aClass92_1369;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Lclient!td;")
	public static final Class86 aClass86_2 = new Class86();

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1374 = aClass92_1369;

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1375 = aClass92_1369;

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
	public static int anInt2855 = 1;

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_9 = new Class77(4);

	@OriginalMember(owner = "client!oi", name = "C", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1376 = Static187.method3089("sl_stars");

	@OriginalMember(owner = "client!oi", name = "F", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method2101() {
		Static208.method786();
		Static39.method721();
		Static11.method204();
		Static17.method2615();
		Static63.method2680();
		Static203.method3355();
		Static173.method2741();
		Static96.method1389();
		Static159.method2505();
		Static83.method1268();
		Static160.method2506();
		Static191.method3132();
		((Class82) Static174.anInterface3_2).method2600();
		Static105.aClass47_16.method1276();
		Static76.aClass3_Sub1_9.method3271();
		Static88.aClass3_Sub1_11.method3271();
		Static105.aClass3_Sub1_14.method3271();
		Static140.aClass3_Sub1_20.method3271();
		Static99.aClass3_Sub1_24.method3271();
		Static166.aClass3_Sub1_23.method3271();
		Static106.aClass3_Sub1_15.method3271();
		Static71.aClass3_Sub1_8.method3271();
		Static109.aClass3_Sub1_17.method3271();
		Static79.aClass3_Sub1_10.method3271();
		Static39.aClass3_Sub1_5.method3271();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lclient!uh;")
	public static Class1_Sub3_Sub24 method2102(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub3_Sub24 local12 = (Class1_Sub3_Sub24) Static105.aClass47_16.method1281((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static39.aClass3_Sub1_5.method3265(arg0, 0);
		if (local24 == null) {
			return null;
		}
		local12 = new Class1_Sub3_Sub24();
		@Pc(37) Class1_Sub14 local37 = new Class1_Sub14(local24);
		local37.anInt4061 = local37.aByteArray49.length - 2;
		@Pc(48) int local48 = local37.method3023();
		@Pc(59) int local59 = local37.aByteArray49.length - local48 - 12 - 2;
		local37.anInt4061 = local59;
		@Pc(73) int local73 = local37.method3058();
		local12.anInt4164 = local37.method3023();
		local12.anInt4167 = local37.method3023();
		local12.anInt4161 = local37.method3023();
		local12.anInt4158 = local37.method3023();
		@Pc(99) int local99 = local37.method3010();
		@Pc(107) int local107;
		@Pc(113) int local113;
		if (local99 > 0) {
			local12.aClass97Array1 = new Class97[local99];
			for (local107 = 0; local107 < local99; local107++) {
				local113 = local37.method3023();
				@Pc(122) Class97 local122 = new Class97(Static155.method2190(local113));
				local12.aClass97Array1[local107] = local122;
				while (local113-- > 0) {
					@Pc(133) int local133 = local37.method3058();
					@Pc(137) int local137 = local37.method3058();
					local122.method3374(new Class1_Sub20(local137), (long) local133);
				}
			}
		}
		local37.anInt4061 = 0;
		local12.aClass92_1954 = local37.method3007();
		local12.anIntArray333 = new int[local73];
		local12.aClass92Array29 = new Class92[local73];
		local12.anIntArray332 = new int[local73];
		local107 = 0;
		while (local37.anInt4061 < local59) {
			local113 = local37.method3023();
			if (local113 == 3) {
				local12.aClass92Array29[local107] = local37.method3022();
			} else if (local113 >= 100 || local113 == 21 || local113 == 38 || local113 == 39) {
				local12.anIntArray333[local107] = local37.method3010();
			} else {
				local12.anIntArray333[local107] = local37.method3058();
			}
			local12.anIntArray332[local107++] = local113;
		}
		Static105.aClass47_16.method1273((long) arg0, local12);
		return local12;
	}
}
