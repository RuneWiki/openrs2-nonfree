import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
	public static int anInt1048;

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public static void method914() {
		@Pc(6) Class167 local6 = Static580.aClass167_36;
		synchronized (Static580.aClass167_36) {
			Static580.aClass167_36.method3961();
		}
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
	public static void method915() {
		@Pc(13) Class4_Sub24 local13 = (Class4_Sub24) Static36.aClass22_13.method895();
		@Pc(21) boolean local21 = Static292.aClass155_7 != null || Static322.anInt6367 > 0;
		if (local21) {
			Static214.anInt4500 = 1;
		}
		if (Static405.aBoolean565 && Static38.aClass174_1.method4090(81) && Static384.anInt7556 > 2) {
			if (local21) {
				Static474.aClass4_Sub36_3 = (Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285.aClass4_285;
			} else {
				Static360.method5445(local13.method6394(), local13.method6390(), (Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285.aClass4_285);
			}
		} else if (local21) {
			Static474.aClass4_Sub36_3 = (Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285;
		} else {
			Static360.method5445(local13.method6394(), local13.method6390(), (Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285);
		}
	}
}
