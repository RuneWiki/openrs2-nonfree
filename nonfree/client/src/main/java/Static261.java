import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_54 = new Class94(63, 3);

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
	public static int anInt5567 = 0;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method4784() {
		Static517.aClass49_3.method1922();
		Static151.aClass275_3.method7105();
		Static541.aClass245_2.method6501();
		Static27.aClass342_3.method8541();
		Static462.aClass355_2.method8743();
		Static635.aClass336_2.method8423();
		Static195.aClass193_1.method5572();
		Static459.aClass62_2.method2253();
		Static517.aClass284_1.method7410();
		Static581.aClass305_1.method7738();
		Static415.aClass340_1.method8514();
		Static16.aClass237_3.method6468();
		Static361.aClass248_4.method6578();
		Static361.aClass278_1.method7119();
		Static229.aClass70_1.method2497();
		Static227.aClass190_1.method5491();
		Static371.aClass137_1.method4256();
		Static2.aClass277_4.method7116();
		Static527.aClass260_31.method6827();
		Static384.aClass173_1.method5112();
		Static298.aClass307_2.method7794();
		Static577.method3581();
		Static422.method6796();
		Static315.method5490();
		Static77.method8911();
		if (Static448.aClass107_7 != Static193.aClass107_2) {
			for (@Pc(81) int local81 = 0; local81 < Static642.aByteArrayArray26.length; local81++) {
				Static642.aByteArrayArray26[local81] = null;
			}
			Static133.anInt3323 = 0;
		}
		Static153.method3432();
		Static74.method2136();
		Static120.method2944();
		Static20.method583();
		Static310.method5473();
		Static284.aClass169_33.method5009();
		Static186.aClass20_4.method7266();
		Static178.method3747();
		Static66.method8350();
		Static400.aClass157_206.method4566();
		Static456.aClass157_154.method4566();
		Static337.aClass157_172.method4566();
		Static489.aClass157_241.method4566();
		Static377.aClass157_192.method4566();
		Static316.aClass157_158.method4566();
		Static100.aClass157_64.method4566();
		Static363.aClass157_188.method4566();
		Static214.aClass157_106.method4566();
		Static410.aClass157_211.method4566();
		Static207.aClass157_104.method4566();
		Static361.aClass157_187.method4566();
		Static38.aClass157_28.method4566();
		Static348.aClass157_177.method4566();
		Static282.aClass157_139.method4566();
		Static371.aClass157_189.method4566();
		Static335.aClass157_169.method4566();
		Static539.aClass157_263.method4566();
		Static499.aClass157_245.method4566();
		Static435.aClass157_222.method4566();
		Static563.aClass157_278.method4566();
		Static309.aClass157_152.method4566();
		Static336.aClass157_171.method4566();
		Static474.aClass157_237.method4566();
		Static378.aClass157_70.method4566();
		Static313.aClass157_155.method4566();
		Static233.aClass157_116.method4566();
		Static527.aClass157_304.method4566();
		Static299.aClass157_148.method4566();
		Static571.aClass157_284.method4566();
		Static373.aClass157_190.method4566();
		Static384.aClass157_195.method4566();
		Static44.aClass157_34.method4566();
		Static131.aClass169_22.method5009();
		Static217.aClass169_17.method5009();
		Static40.aClass169_7.method5009();
		Static232.aClass169_31.method5009();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!g;")
	public static Class9 method4787(@OriginalArg(0) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class9_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class9) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class9_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!at;B)V")
	public static void method4788(@OriginalArg(0) Class24 arg0) {
		if (Static535.anInt9667 != arg0.anInt474) {
			return;
		}
		if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64 == null) {
			arg0.anInt482 = 0;
			arg0.anInt466 = 0;
			return;
		}
		arg0.anInt469 = 150;
		arg0.anInt424 = (int) (Math.sin((double) Static407.anInt7704 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt478 = 5;
		arg0.anInt466 = Static569.anInt10211;
		arg0.anInt482 = Static105.method2755(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64);
		arg0.anInt435 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6064;
		arg0.anInt514 = 0;
		arg0.anInt456 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6099;
		arg0.anInt491 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6047;
		@Pc(76) Class130 local76 = arg0.anInt435 == -1 ? null : Static195.aClass193_1.method5573(arg0.anInt435);
		if (local76 != null) {
			Static573.method8546(arg0.anInt491, local76);
		}
	}
}
