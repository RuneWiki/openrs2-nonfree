import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
	public static int anInt4105;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "[B")
	public static byte[] aByteArray55;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	public static int anInt4110 = -60;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
	public static int anInt4112 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZB)V")
	public static void method3594(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 0) {
			Static513.aClass122_10 = Static379.method7208(0, Static544.aClass1_Sub22_Sub1_1.anInt5445 * 2, Static105.aCanvas3, Static313.aClass171_93, Static227.anInterface8_11);
		} else {
			if (arg1) {
				Static513.aClass122_10 = Static379.method7208(0, 0, Static105.aCanvas3, Static313.aClass171_93, Static227.anInterface8_11);
				Static513.aClass122_10.Z(0);
				@Pc(26) Class232 local26 = Static372.method5725(Static341.anInt6104, Static542.aClass171_152);
				@Pc(35) Class67 local35 = Static513.aClass122_10.method7270(local26, Static552.method3538(Static543.aClass171_154, Static341.anInt6104));
				Static489.method6714(Static190.aClass306_42.method7165(Static179.anInt3168), true, local35);
				Static97.method1657();
				Static513.aClass122_10.method7224();
			}
			try {
				Static513.aClass122_10 = Static379.method7208(arg0, Static544.aClass1_Sub22_Sub1_1.anInt5445 * 2, Static105.aCanvas3, Static313.aClass171_93, Static227.anInterface8_11);
				if (Static513.aClass122_10.method7266()) {
					@Pc(64) boolean local64 = true;
					try {
						local64 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(74) Throwable local74) {
					}
					@Pc(80) Class1_Sub8 local80;
					if (local64) {
						local80 = Static513.aClass122_10.method7263(146800640);
					} else {
						local80 = Static513.aClass122_10.method7263(104857600);
					}
					Static513.aClass122_10.method7229(local80);
				}
			} catch (@Pc(91) Throwable local91) {
				arg0 = 0;
				Static513.aClass122_10 = Static379.method7208(0, 0, Static105.aCanvas3, Static313.aClass171_93, Static227.anInterface8_11);
			}
		}
		Static374.anInt6861 = arg0;
		Static42.method904();
		if (!Static513.aClass122_10.method7240()) {
			Static61.anInt1166 = 1;
		}
		Static513.aClass122_10.method7239(Static61.anInt1166);
		Static513.aClass122_10.method7232(0);
		Static513.aClass122_10.L(32);
		Static37.aClass118_3 = Static513.aClass122_10.method7275();
		Static158.aClass118_6 = Static513.aClass122_10.method7275();
		Static55.method1089();
		Static513.aClass122_10.method7272(!Static544.aClass1_Sub22_Sub1_1.aBoolean395);
		if (Static513.aClass122_10.method7244()) {
			Static336.method5121(Static544.aClass1_Sub22_Sub1_1.aBoolean387);
		}
		Static135.method2251(Static459.anInt7799 >> 3, Static482.anInt7990 >> 3, Static513.aClass122_10);
		Static283.method4575();
		Static375.aBoolean499 = false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)[Lclient!bn;")
	public static Class31[] method3597() {
		return new Class31[] { Static450.aClass31_15, Static359.aClass31_11, Static356.aClass31_10, Static277.aClass31_8, Static490.aClass31_18, Static391.aClass31_14, Static367.aClass31_12, Static219.aClass31_16, Static4.aClass31_1, Static480.aClass31_17, Static242.aClass31_6, Static384.aClass31_13, Static127.aClass31_5, Static337.aClass31_9 };
	}
}
