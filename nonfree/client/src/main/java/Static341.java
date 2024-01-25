import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Lclient!sea;")
	public static Class308 aClass308_120;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
	public static int anInt6292;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_6 = new Class295(7, 4);

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
	public static void method5096() {
		Static402.method5785(Static86.aClass1_Sub30_Sub1_1.aBoolean479);
		Static78.aClass76_4 = Static539.method7337(22050, Static361.aClass198_3, 0, Static103.aCanvas2);
		Static231.method3440(Static9.method235(null));
		Static53.aClass76_14 = Static539.method7337(2048, Static361.aClass198_3, 1, Static103.aCanvas2);
		Static425.aClass1_Sub6_Sub3_2 = new Class1_Sub6_Sub3();
		Static53.aClass76_14.method2506(Static425.aClass1_Sub6_Sub3_2);
		Static44.aClass227_1 = new Class227(22050, Static304.anInt5650);
		Static463.anInt8042 = Static51.aClass308_24.method6558("scape main");
		Static115.method1625();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ac;I)V")
	public static void method5098(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static411.aClass302_8 != null) {
			@Pc(20) int local20;
			try {
				Static411.aClass302_8.method6452(0L);
				Static411.aClass302_8.method6456(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method7973(24, local8);
	}
}
