import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!sfa", name = "F", descriptor = "Lclient!ul;")
	public static Class318 aClass318_4;

	@OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
	public static int anInt8569 = 0;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
	public static void method7155() {
		Static205.anInt4369 = 0;
		Static207.aClass211_29.method5179();
		Static207.aClass211_29.method5173(Static540.aClass6_Sub42_7);
		Static205.anInt4369++;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V")
	public static void method7157() {
		if (Static571.anIntArray829 != null && Static293.anIntArray416 != null) {
			return;
		}
		Static571.anIntArray829 = new int[256];
		Static293.anIntArray416 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static571.anIntArray829[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static293.anIntArray416[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
	public static void method7159() {
		if (Static558.anInt9502 == 6) {
			Static558.anInt9502 = 7;
		}
	}
}
