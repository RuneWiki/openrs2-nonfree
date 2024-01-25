import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jha", name = "u", descriptor = "Lclient!gj;")
	public static Class143 aClass143_73;

	@OriginalMember(owner = "client!jha", name = "x", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array14;

	@OriginalMember(owner = "client!jha", name = "y", descriptor = "Lclient!po;")
	public static Class281 aClass281_5;

	@OriginalMember(owner = "client!jha", name = "A", descriptor = "Z")
	public static boolean aBoolean408;

	@OriginalMember(owner = "client!jha", name = "p", descriptor = "Lclient!am;")
	public static final Class20 aClass20_4 = new Class20();

	@OriginalMember(owner = "client!jha", name = "r", descriptor = "I")
	public static int anInt5243 = 0;

	@OriginalMember(owner = "client!jha", name = "w", descriptor = "I")
	public static int anInt5246 = 0;

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZLclient!taa;)V")
	public static void method4443(@OriginalArg(1) Class332 arg0) {
		Static255.aClass332_1 = arg0;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4444(@OriginalArg(1) String arg0) {
		if (!Static329.aBoolean166 || (Static7.anInt94 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static187.anInt3432;
		@Pc(21) int[] local21 = Static668.anIntArray664;
		for (@Pc(28) int local28 = 0; local28 < local19; local28++) {
			@Pc(36) Class23_Sub2_Sub1_Sub2_Sub1 local36 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local21[local28]];
			if (local36.aString34 != null && local36.aString34.equalsIgnoreCase(arg0) && (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == local36 && (Static7.anInt94 & 0x10) != 0 || local36 != null && (Static7.anInt94 & 0x8) != 0)) {
				@Pc(69) Class3_Sub44 local69 = Static275.method5689(Static405.aClass376_99, Static540.aClass282_4);
				local69.aClass3_Sub17_Sub2_3.method4876(local21[local28]);
				local69.aClass3_Sub17_Sub2_3.method4886(Static452.anInt7746);
				local69.aClass3_Sub17_Sub2_3.method4885(Static169.anInt3050);
				local69.aClass3_Sub17_Sub2_3.method4875(0);
				local69.aClass3_Sub17_Sub2_3.method4887(Static395.anInt6819);
				Static616.method8089(local69);
				Static628.method8288(0, local36.method8625(), true, local36.anIntArray659[0], local36.method8625(), local36.anIntArray660[0], -2, 0);
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static304.method4693(Static569.aClass335_22.method7694(Static319.anInt5939) + arg0);
		}
		if (Static329.aBoolean166) {
			Static61.method1523();
		}
	}
}
