import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!vba", name = "p", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_89 = new Class236(62, -1);

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
	public static int anInt8630 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)V")
	public static void method6974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg1, 13);
		local8.method1327();
		local8.anInt1437 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBIII)V")
	public static void method6975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
		Static164.aClass5_Sub3_Sub1_2.method4192(Static357.aClass243_7.anInt7052);
		Static164.aClass5_Sub3_Sub1_2.method4192(arg0);
		Static164.aClass5_Sub3_Sub1_2.method4192(arg1);
		Static164.aClass5_Sub3_Sub1_2.method4181(arg3);
		Static164.aClass5_Sub3_Sub1_2.method4181(arg2);
		Static83.anInt1578 = 1;
		Static296.anInt5925 = 0;
		Static464.anInt7964 = -3;
		Static353.anInt6598 = 0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public static void method6976() {
		@Pc(5) int local5 = 0;
		if (Static300.aClass5_Sub28_Sub1_1.method4113(Static17.anInt459)) {
			local5 = 55;
		}
		if (!Static300.aClass5_Sub28_Sub1_1.aBoolean327) {
			local5 |= 0x40;
		}
		Static200.method3292(local5);
		Static453.aClass88_3.method2288(local5);
		Static451.aClass67_2.method2012(local5);
		Static204.aClass282_1.method6600(local5);
		Static501.aClass41_2.method1069(local5);
		Static539.method7325(local5);
		Static42.method892(local5);
		Static282.method4795(local5);
		Static150.method2771(local5);
		Static27.method672();
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(III)Lclient!vj;")
	public static Class15_Sub4 method6978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class15_Sub4 local14 = local7.aClass15_Sub4_1;
			local7.aClass15_Sub4_1 = null;
			return local14;
		}
	}
}
