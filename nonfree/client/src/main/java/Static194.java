import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "Lclient!nk;")
	public static Class121 aClass121_86;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!nk;")
	public static Class121 aClass121_87;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "Lclient!vh;")
	public static Class187 aClass187_103 = new Class187(64);

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "[I")
	public static int[] anIntArray304 = new int[5];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!df;)V")
	public static void method3152(@OriginalArg(1) Class1_Sub10 arg0) {
		Static173.method2912(arg0, 200000);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!nk;B)V")
	public static void method3153(@OriginalArg(0) Class121 arg0) {
		if (Static17.aBoolean10) {
			return;
		}
		if (Static156.aBoolean211) {
			Static119.method2134();
		} else {
			Static25.method400();
		}
		Static141.aClass1_Sub2_Sub1_31 = Static134.method4726(Static76.anInt1571, arg0);
		@Pc(19) int local19 = Static120.anInt2505;
		@Pc(33) int local33 = local19 * 956 / 503;
		Static141.aClass1_Sub2_Sub1_31.method3847((Static292.anInt5236 - local33) / 2, 0, local33, local19);
		Static97.aClass23_1 = Static214.method3361(Static26.anInt443, arg0);
		Static97.aClass23_1.method3909(Static292.anInt5236 / 2 - Static97.aClass23_1.anInt4473 / 2, 18);
		Static17.aBoolean10 = true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
	public static void method3154(@OriginalArg(1) int arg0) {
		if (Static190.anInt3615 == 0) {
			Static217.aClass1_Sub24_Sub4_3.method4663(arg0);
		} else {
			Static213.anInt4453 = arg0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;IZIIJZZILjava/lang/String;B)V")
	public static void method3155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub14 local28 = new Class1_Sub14(128);
		local28.method1390(10);
		local28.method1338((arg7 ? 4 : 0) | (arg6 ? 1 : 0) | (arg2 ? 2 : 0));
		local28.method1374(arg5);
		local28.method1387(local8[0]);
		local28.method1385(arg9);
		local28.method1387(local8[1]);
		local28.method1338(Static71.anInt1519);
		local28.method1390(arg3);
		local28.method1390(arg4);
		local28.method1387(local8[2]);
		local28.method1338(arg8);
		local28.method1338(arg1);
		local28.method1387(local8[3]);
		local28.method1399(Static207.aBigInteger2, Static85.aBigInteger1);
		@Pc(118) Class1_Sub14 local118 = new Class1_Sub14(350);
		local118.method1385(arg0);
		@Pc(133) int local133 = 8 - Static84.method1587(arg0) % 8;
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			local118.method1390((int) (Math.random() * 255.0D));
		}
		local118.method1372(local8);
		Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
		Static127.aClass1_Sub14_Sub1_3.method1390(22);
		Static127.aClass1_Sub14_Sub1_3.method1338(local28.anInt1480 + local118.anInt1480 + 2);
		Static127.aClass1_Sub14_Sub1_3.method1338(549);
		Static127.aClass1_Sub14_Sub1_3.method1335(local28.anInt1480, local28.aByteArray17);
		Static127.aClass1_Sub14_Sub1_3.method1335(local118.anInt1480, local118.aByteArray17);
		Static227.anInt4177 = 1;
		Static280.anInt5073 = 0;
		Static178.anInt3427 = -3;
		Static314.anInt864 = 0;
	}
}
