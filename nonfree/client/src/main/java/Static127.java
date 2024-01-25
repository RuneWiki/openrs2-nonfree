import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_95 = new Class184(39, -1);

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt2696 = 104;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt2697 = 0;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_89 = new Class175("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString24 = null;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	public static void method2219() {
		if (Static348.anInt7447 < 0) {
			return;
		}
		@Pc(11) long local11 = Static150.method2672();
		Static348.anInt7447 = (int) ((long) Static348.anInt7447 + Static119.aLong79 - local11);
		if (Static348.anInt7447 <= 0) {
			Static177.anInt3620 = Static97.aClass14_1.anInt566;
			Static338.aFloat15 = Static97.aClass14_1.aFloat8;
			Static63.aFloat91 = Static97.aClass14_1.aFloat4;
			Static213.aFloat57 = Static97.aClass14_1.aFloat7;
			Static354.anInt6359 = Static97.aClass14_1.anInt572;
			Static348.anInt7447 = -1;
			Static325.aFloat72 = Static97.aClass14_1.aFloat6;
			Static248.anInt4664 = Static97.aClass14_1.anInt571;
			Static158.aClass7_2 = Static97.aClass14_1.aClass7_1;
			Static21.aFloat10 = Static97.aClass14_1.aFloat9;
			Static122.aFloat25 = Static97.aClass14_1.aFloat5;
		} else {
			@Pc(61) int local61 = (Static348.anInt7447 << 8) / Static183.anInt4103;
			@Pc(65) int local65 = 255 - local61;
			@Pc(70) float local70 = (float) local61 / 255.0F;
			Static354.anInt6359 = ((Static97.aClass14_1.anInt572 & 0xFF00FF) * local65 + (Static79.anInt1713 & 0xFF00FF) * local61 & 0xFF00FF00) + (local65 * (Static97.aClass14_1.anInt572 & 0xFF00) + local61 * (Static79.anInt1713 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(108) float local108 = 1.0F - local70;
			Static325.aFloat72 = Static73.aFloat20 + local108 * (Static97.aClass14_1.aFloat6 - Static73.aFloat20);
			Static177.anInt3620 = ((Static97.aClass14_1.anInt566 & 0xFF00) * local65 + local61 * (Static3.anInt5987 & 0xFF00) & 0xFF0000) + (local65 * (Static97.aClass14_1.anInt566 & 0xFF00FF) + (Static3.anInt5987 & 0xFF00FF) * local61 & 0xFF00FF00) >>> 8;
			Static248.anInt4664 = Static400.anInt6963 * local61 + local65 * Static97.aClass14_1.anInt571 >> 8;
			Static63.aFloat91 = local108 * (Static97.aClass14_1.aFloat4 - Static31.aFloat12) + Static31.aFloat12;
			Static338.aFloat15 = (Static97.aClass14_1.aFloat8 - Static367.aFloat88) * local108 + Static367.aFloat88;
			Static21.aFloat10 = Static52.aFloat13 + local108 * (Static97.aClass14_1.aFloat9 - Static52.aFloat13);
			Static213.aFloat57 = (Static97.aClass14_1.aFloat7 - Static404.aFloat93) * local108 + Static404.aFloat93;
			Static122.aFloat25 = Static376.aFloat96 + (Static97.aClass14_1.aFloat5 - Static376.aFloat96) * local108;
			if (Static392.aClass7_3 != Static97.aClass14_1.aClass7_1) {
				Static158.aClass7_2 = Static115.aClass75_3.method2598(Static392.aClass7_3, Static97.aClass14_1.aClass7_1, local108, Static158.aClass7_2);
			}
		}
		Static119.aLong79 = local11;
	}
}
