import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "[B")
	public static byte[] aByteArray63;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Lclient!rj;")
	public static Class106_Sub1 aClass106_Sub1_1;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!up;")
	public static final Class60 aClass60_1 = Static449.method5590();

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
	public static final int[] anIntArray332 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "[I")
	public static final int[] anIntArray333 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)I")
	public static int method4289(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public static void method4290() {
		Static2.aClass28_4.method610();
		Static139.aClass18_2.method389();
		Static221.aClass129_2.method2716();
		Static259.aClass95_3.method1829();
		Static304.aClass27_1.method592();
		Static227.aClass65_2.method1334();
		Static152.aClass213_1.method4411();
		Static44.aClass190_2.method4004();
		Static182.aClass205_1.method4218();
		Static183.aClass269_3.method5613();
		Static332.aClass174_1.method3494();
		Static346.aClass135_3.method2794();
		Static330.aClass101_3.method2108();
		Static100.aClass108_1.method2211();
		Static85.aClass132_5.method2768();
		Static128.aClass66_1.method1358();
		Static331.aClass238_1.method5003();
		Static337.aClass120_2.method2412();
		Static455.aClass52_2.method1177();
		Static120.aClass267_2.method5601();
		Static137.method1840();
		Static254.method3257();
		Static104.method5472();
		if (Static209.aClass166_6 != Static136.aClass166_3) {
			for (@Pc(84) int local84 = 0; local84 < Static91.aByteArrayArray12.length; local84++) {
				Static91.aByteArrayArray12[local84] = null;
			}
			Static311.anInt5171 = 0;
		}
		Static430.method5419();
		Static126.method1747();
		Static443.method4782();
		Static163.method2237();
		Static176.method2359();
		Static267.aClass167_64.method3390();
		Static213.aClass128_22.method3535();
		Static270.aClass240_3.method5019();
		Static350.method4434();
		Static356.aClass113_110.method2256();
		Static230.aClass113_116.method2256();
		Static383.aClass113_117.method2256();
		Static291.aClass113_92.method2256();
		Static12.aClass113_7.method2256();
		Static310.aClass113_97.method2256();
		Static116.aClass113_101.method2256();
		Static258.aClass113_80.method2256();
		Static169.aClass113_55.method2256();
		Static391.aClass113_119.method2256();
		Static313.aClass113_98.method2256();
		Static408.aClass113_127.method2256();
		Static143.aClass113_48.method2256();
		Static166.aClass113_59.method2256();
		Static224.aClass113_73.method2256();
		Static169.aClass113_54.method2256();
		Static315.aClass113_99.method2256();
		Static383.aClass113_118.method2256();
		Static28.aClass113_11.method2256();
		Static9.aClass113_5.method2256();
		Static66.aClass113_23.method2256();
		Static52.aClass113_20.method2256();
		Static265.aClass113_82.method2256();
		Static274.aClass113_84.method2256();
		Static61.aClass113_22.method2256();
		Static322.aClass113_135.method2256();
		Static334.aClass113_103.method2256();
		Class20_Sub3_Sub2.lb.method2256();
		Static221.aClass113_71.method2256();
		Static74.aClass113_26.method2256();
		Static104.aClass167_99.method3390();
		Static322.aClass167_103.method3390();
		Static22.aClass167_5.method3390();
		Static390.aClass167_88.method3390();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BIZIIZJZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method4291(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) long arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) String arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class1_Sub11 local30 = new Class1_Sub11(128);
		local30.method4445(10);
		local30.method4448((arg6 ? 2 : 0) | (arg4 ? 1 : 0) | (arg1 ? 4 : 0));
		local30.method4446(arg5);
		local30.method4450(local8[0]);
		local30.method4453(arg8);
		local30.method4450(local8[1]);
		local30.method4448(Static28.anInt564);
		local30.method4445(arg2);
		local30.method4445(arg9);
		local30.method4450(local8[2]);
		local30.method4448(arg3);
		local30.method4448(arg0);
		local30.method4450(local8[3]);
		local30.method4455(Static230.aBigInteger3, Static272.aBigInteger2);
		@Pc(116) Class1_Sub11 local116 = new Class1_Sub11(350);
		local116.method4453(arg7);
		@Pc(128) int local128 = 8 - Static221.method2944(arg7) % 8;
		for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
			local116.method4445((int) (Math.random() * 255.0D));
		}
		local116.method4442(local8);
		Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
		Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_8.anInt1569);
		Static75.aClass1_Sub11_Sub1_1.method4448(local30.anInt5766 + local116.anInt5766 + 2);
		Static75.aClass1_Sub11_Sub1_1.method4448(589);
		Static75.aClass1_Sub11_Sub1_1.method4480(local30.aByteArray64, local30.anInt5766);
		Static75.aClass1_Sub11_Sub1_1.method4480(local116.aByteArray64, local116.anInt5766);
		Static428.anInt7092 = 0;
		Static383.anInt6367 = 0;
		Static48.anInt801 = 1;
		Static52.anInt942 = -3;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Lclient!lh;")
	public static Class20_Sub1 method4293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub1_2;
	}
}
