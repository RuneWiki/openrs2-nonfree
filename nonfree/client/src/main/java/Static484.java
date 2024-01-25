import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static484 {

	@OriginalMember(owner = "client!uca", name = "O", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_126 = new Class45("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BI)V")
	public static void method7505(@OriginalArg(1) int arg0) {
		Static192.anInt354 = arg0;
		Static303.aClass277_43.method7019();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!et;B)V")
	public static void method7506(@OriginalArg(0) Class91 arg0) {
		if (Static293.anInt9020 != arg0.anInt2429) {
			return;
		}
		if (Static107.aClass20_Sub1_Sub1_Sub1_1.aString13 == null) {
			arg0.anInt2455 = 0;
			arg0.anInt2401 = 0;
			return;
		}
		arg0.anInt2448 = 150;
		arg0.anInt2366 = (int) (Math.sin((double) Static445.anInt7791 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2401 = Static16.anInt9513;
		arg0.anInt2405 = 5;
		arg0.anInt2455 = Static402.method6391(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13);
		arg0.anInt2369 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8973;
		arg0.anInt2424 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt9030;
		arg0.anInt2381 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8993;
		arg0.anInt2393 = 0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method7507(@OriginalArg(0) String arg0) {
		Static229.method4129(arg0, 0, "", 0, "");
	}
}
