import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	public static int anInt2930 = 0;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!mb;ZZ)V")
	public static void method2710(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean872 = arg1;
		if (Static441.aBoolean681) {
			Static162.aClass56Array1[Static162.aClass56Array1.length - 1].method2241(arg0);
		} else {
			Static151.method3294(arg0, Static276.aClass3_Sub27Array5);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZ)V")
	public static void method2712(@OriginalArg(0) boolean arg0) {
		Static14.method8598();
		if (!Static405.method6400(Static581.anInt9720)) {
			return;
		}
		Static559.anInt9555++;
		if (Static559.anInt9555 < 50 && !arg0) {
			return;
		}
		Static559.anInt9555 = 0;
		if (!Static123.aBoolean245 && Static412.aClass51_25 != null) {
			@Pc(41) Class3_Sub26 local41 = Static640.method8636(Static24.aClass344_4, Static403.aClass294_3);
			Static472.method5189(local41);
			try {
				Static388.method6125();
			} catch (@Pc(48) IOException local48) {
				Static123.aBoolean245 = true;
			}
		}
		Static14.method8598();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static void method2714(@OriginalArg(1) int arg0) {
		Static461.anInt8384 = arg0;
		Static268.aClass112_33.method3638();
	}
}
