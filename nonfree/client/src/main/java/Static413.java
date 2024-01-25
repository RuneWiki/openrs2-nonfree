import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Lclient!mn;")
	public static Class171 aClass171_94;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!wp;")
	public static Class271 aClass271_2;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public static void method5672(@OriginalArg(1) int arg0) {
		Static349.anInt6185 = arg0;
		Static54.aClass188_11.method4156();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V")
	public static void method5674(@OriginalArg(0) boolean arg0) {
		Static230.method3117();
		if (!Static263.method3698(Static433.anInt7309)) {
			return;
		}
		Static392.anInt6754++;
		if (Static392.anInt6754 < 50 && !arg0) {
			return;
		}
		Static392.anInt6754 = 0;
		if (!Static149.aBoolean502 && Static339.aClass66_2 != null) {
			Static164.method2403(Static128.aClass208_28);
			try {
				Static339.aClass66_2.method1392(Static389.aClass2_Sub17_Sub1_2.anInt7523, Static389.aClass2_Sub17_Sub1_2.aByteArray94);
				Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
			} catch (@Pc(50) IOException local50) {
				Static149.aBoolean502 = true;
			}
		}
		Static230.method3117();
	}
}
