import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "Lclient!fc;")
	public static Class71 aClass71_26;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Lclient!ws;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public static void method2205() {
		if (Static258.anInt4004 < 0) {
			return;
		}
		@Pc(13) long local13 = Static51.method979();
		Static258.anInt4004 = (int) ((long) Static258.anInt4004 + Static218.aLong136 - local13);
		if (Static258.anInt4004 <= 0) {
			Static327.anInt5764 = aClass251_1.anInt6721;
			Static69.anInt1310 = aClass251_1.anInt6720;
			Static258.anInt4004 = -1;
			Static343.aClass21_3 = aClass251_1.aClass21_4;
			Static159.aFloat33 = aClass251_1.aFloat100;
			Static93.aFloat20 = aClass251_1.aFloat98;
			Static282.aFloat50 = aClass251_1.aFloat102;
			Static110.aFloat28 = aClass251_1.aFloat101;
			Static392.aFloat104 = aClass251_1.aFloat103;
			Static366.aFloat97 = aClass251_1.aFloat99;
			Static251.anInt4516 = aClass251_1.anInt6717;
		} else {
			@Pc(64) int local64 = (Static258.anInt4004 << 8) / Static75.anInt1419;
			@Pc(69) int local69 = 255 - local64;
			@Pc(74) float local74 = (float) local64 / 255.0F;
			@Pc(78) float local78 = 1.0F - local74;
			Static251.anInt4516 = (local64 * (Static301.anInt5427 & 0xFF00FF) + local69 * (aClass251_1.anInt6717 & 0xFF00FF) & 0xFF00FF00) + ((Static301.anInt5427 & 0xFF00) * local64 + ((aClass251_1.anInt6717 & 0xFF00) * local69) & 0xFF0000) >>> 8;
			Static327.anInt5764 = (local64 * (Static219.anInt4061 & 0xFF00) + local69 * (aClass251_1.anInt6721 & 0xFF00) & 0xFF0000) + ((aClass251_1.anInt6721 & 0xFF00FF) * local69 + (Static219.anInt4061 & 0xFF00FF) * local64 & 0xFF00FF00) >>> 8;
			Static392.aFloat104 = (aClass251_1.aFloat103 - Static155.aFloat32) * local78 + Static155.aFloat32;
			Static110.aFloat28 = Static358.aFloat95 + (aClass251_1.aFloat101 - Static358.aFloat95) * local78;
			Static282.aFloat50 = (aClass251_1.aFloat102 - Static186.aFloat96) * local78 + Static186.aFloat96;
			Static159.aFloat33 = (aClass251_1.aFloat100 - Static314.aFloat90) * local78 + Static314.aFloat90;
			Static69.anInt1310 = Static279.anInt4936 * local64 + local69 * aClass251_1.anInt6720 >> 8;
			Static93.aFloat20 = Static130.aFloat29 + local78 * (aClass251_1.aFloat98 - Static130.aFloat29);
			Static366.aFloat97 = local78 * (aClass251_1.aFloat99 - Static103.aFloat21) + Static103.aFloat21;
			if (aClass251_1.aClass21_4 != Static301.aClass21_1) {
				Static343.aClass21_3 = Static267.aClass82_6.method4465(Static301.aClass21_1, aClass251_1.aClass21_4, local78, Static343.aClass21_3);
			}
		}
		Static218.aLong136 = local13;
	}
}
