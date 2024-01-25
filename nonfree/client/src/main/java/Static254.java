import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ih", name = "bd", descriptor = "Lclient!lga;")
	public static Class223 aClass223_57;

	@OriginalMember(owner = "client!ih", name = "Oc", descriptor = "I")
	public static int anInt4888;

	@OriginalMember(owner = "client!ih", name = "fd", descriptor = "I")
	public static int anInt4892;

	@OriginalMember(owner = "client!ih", name = "ad", descriptor = "I")
	public static int anInt4897;

	@OriginalMember(owner = "client!ih", name = "Tc", descriptor = "I")
	public static int anInt4901;

	@OriginalMember(owner = "client!ih", name = "Zc", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method4441(@OriginalArg(0) Class75 arg0) {
		if (Static107.aClass340_16.method8128() == 0) {
			return;
		}
		@Pc(29) Class6_Sub45 local29;
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 0) {
			for (local29 = (Class6_Sub45) Static107.aClass340_16.method8124(); local29 != null; local29 = (Class6_Sub45) Static107.aClass340_16.method8134()) {
				Static149.aClass244_1.method5964(local29.anInt8087, arg0, false, false, local29.aBoolean608 ? Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 : null, Static23.aClass67_1, arg0, local29.anInt8084, local29.anInt8085, local29.anInt8086, local29.anInt8082);
				local29.method9051();
			}
			Static35.method456();
			return;
		}
		if (Static405.aClass75_15 == null) {
			@Pc(83) Canvas local83 = new Canvas();
			local83.setSize(36, 32);
			Static405.aClass75_15 = Static187.method3520(local83, 0, Static377.aClass223_80, Static334.anInterface11_7, 0);
			Static80.aClass67_2 = Static405.aClass75_15.method6649(Static629.method8576(Static607.anInt9575, Static373.aClass223_79), Static691.method1239(Static583.aClass223_113, Static607.anInt9575));
		}
		for (local29 = (Class6_Sub45) Static107.aClass340_16.method8124(); local29 != null; local29 = (Class6_Sub45) Static107.aClass340_16.method8134()) {
			Static149.aClass244_1.method5964(local29.anInt8087, Static405.aClass75_15, false, false, local29.aBoolean608 ? Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 : null, Static80.aClass67_2, arg0, local29.anInt8084, local29.anInt8085, local29.anInt8086, local29.anInt8082);
			local29.method9051();
		}
	}
}
