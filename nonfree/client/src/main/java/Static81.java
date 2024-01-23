import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	public static volatile int anInt1782 = 0;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
	public static int[] anIntArray137 = new int[100];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!jd;II)[Lclient!jn;")
	private static Class71[] method1533(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1) {
		return Static288.method4789(0, arg0, arg1) ? Static184.method3155() : null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1534(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static191.method628(arg0);
		if (local7 != -1) {
			@Pc(42) int[] local42 = Static197.aClass2_Sub3_Sub18_2.method2981(Static37.aClass113_1.anIntArray261[local7] >> 14 & 0x3FFF, Static37.aClass113_1.anIntArray261[local7] >> 28 & 0x3, Static37.aClass113_1.anIntArray261[local7] & 0x3FFF);
			Static177.method3093(local42[1], local42[2]);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method1535(@OriginalArg(1) Class84 arg0) {
		Static58.aClass2_Sub3_Sub1_Sub1Array1 = Static54.method1078(Static79.anInt1760, arg0);
		Static77.aClass2_Sub3_Sub1Array5 = Static56.method1091(Static200.anInt4154, arg0);
		Static197.aClass2_Sub3_Sub1Array8 = Static56.method1091(Static140.anInt3021, arg0);
		Static286.aClass2_Sub3_Sub1Array11 = Static56.method1091(Static157.anInt3298, arg0);
		Static61.aClass2_Sub3_Sub1Array7 = Static56.method1091(Static106.anInt2315, arg0);
		Static106.aClass2_Sub3_Sub1Array6 = Static56.method1091(Static44.anInt1073, arg0);
		Static214.aClass2_Sub3_Sub1Array10 = Static56.method1091(Static243.anInt3778, arg0);
		Static105.aClass2_Sub3_Sub1_3 = Static86.method1626(Static35.anInt849, arg0);
		Static8.aClass2_Sub3_Sub1Array1 = Static102.method1927(arg0, Static274.anInt5699);
		Static64.aClass2_Sub3_Sub1Array3 = Static102.method1927(arg0, Static16.anInt403);
		Static280.aClass71Array5 = method1533(Static247.anInt4929, arg0);
		Static4.aClass71Array1 = method1533(Static15.anInt354, arg0);
		Static162.aClass2_Sub3_Sub5_2.method3320(Static4.aClass71Array1, null);
		Static208.aClass2_Sub3_Sub5_3.method3320(Static4.aClass71Array1, null);
		Static153.aClass2_Sub3_Sub5_1.method3320(Static4.aClass71Array1, null);
		if (Static60.aBoolean106) {
			Static194.aClass71_Sub1Array76 = Static294.method4871(Static89.anInt1991, arg0);
			for (@Pc(103) int local103 = 0; local103 < Static194.aClass71_Sub1Array76.length; local103++) {
				Static194.aClass71_Sub1Array76[local103].method1861();
			}
		}
		@Pc(120) Class2_Sub3_Sub1_Sub1 local120 = Static104.method1942(Static182.anInt3885, 0, arg0);
		local120.method4381();
		if (Static60.aBoolean106) {
			Static111.aClass2_Sub3_Sub1_4 = new Class2_Sub3_Sub1_Sub2(local120);
		} else {
			Static111.aClass2_Sub3_Sub1_4 = local120;
		}
		@Pc(139) Class2_Sub3_Sub1_Sub1[] local139 = Static54.method1078(Static70.anInt1539, arg0);
		@Pc(141) int local141;
		for (local141 = 0; local141 < local139.length; local141++) {
			local139[local141].method4381();
		}
		if (Static60.aBoolean106) {
			Static206.aClass2_Sub3_Sub1Array9 = new Class2_Sub3_Sub1[local139.length];
			for (local141 = 0; local141 < local139.length; local141++) {
				Static206.aClass2_Sub3_Sub1Array9[local141] = new Class2_Sub3_Sub1_Sub2(local139[local141]);
			}
		} else {
			Static206.aClass2_Sub3_Sub1Array9 = local139;
		}
		local141 = (int) (Math.random() * 21.0D) - 10;
		@Pc(202) int local202 = (int) (Math.random() * 21.0D) - 10;
		@Pc(209) int local209 = (int) (Math.random() * 21.0D) - 10;
		@Pc(216) int local216 = (int) (Math.random() * 41.0D) - 20;
		@Pc(218) int local218;
		for (local218 = 0; local218 < Static58.aClass2_Sub3_Sub1_Sub1Array1.length; local218++) {
			Static58.aClass2_Sub3_Sub1_Sub1Array1[local218].method4390(local216 + local141, local216 + local202, local216 + local209);
		}
		if (Static60.aBoolean106) {
			Static65.aClass2_Sub3_Sub1Array4 = new Class2_Sub3_Sub1[Static58.aClass2_Sub3_Sub1_Sub1Array1.length];
			for (local218 = 0; local218 < Static58.aClass2_Sub3_Sub1_Sub1Array1.length; local218++) {
				Static65.aClass2_Sub3_Sub1Array4[local218] = new Class2_Sub3_Sub1_Sub2(Static58.aClass2_Sub3_Sub1_Sub1Array1[local218]);
			}
		} else {
			Static65.aClass2_Sub3_Sub1Array4 = Static58.aClass2_Sub3_Sub1_Sub1Array1;
		}
	}
}
