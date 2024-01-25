import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
	public static int anInt753;

	@OriginalMember(owner = "client!baa", name = "l", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_10 = new Class67("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_20 = new Class133(115, 6);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!rt;BI)Ljava/lang/String;")
	public static String method775(@OriginalArg(0) Class3_Sub27 arg0) {
		try {
			@Pc(12) int local12 = arg0.method7547();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt9191 += Static117.aClass13_1.method636(arg0.aByteArray114, arg0.anInt9191, local12, local20, 0);
			return Static77.method1559(0, local20, local12);
		} catch (@Pc(46) Exception local46) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BII)V")
	public static void method777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static278.method4791(Static118.aClass158_31);
		Static515.aClass3_Sub27_Sub1_2.method7585(arg0);
		Static515.aClass3_Sub27_Sub1_2.method7606(arg1);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
	public static void method779() {
		if (Static227.anInt4885 < 0) {
			return;
		}
		@Pc(16) long local16 = Static12.method647();
		Static227.anInt4885 = (int) ((long) Static227.anInt4885 + Static232.aLong129 - local16);
		if (Static227.anInt4885 <= 0) {
			Static403.aFloat211 = Static219.aClass92_1.aFloat89;
			Static92.aFloat67 = Static219.aClass92_1.aFloat88;
			Static227.anInt4885 = -1;
			Static477.anInt8634 = Static219.aClass92_1.anInt2889;
			Static159.aFloat130 = Static219.aClass92_1.aFloat86;
			Static401.aClass66_3 = Static219.aClass92_1.aClass66_1;
			Static40.aFloat41 = Static219.aClass92_1.aFloat90;
			Static241.aFloat261 = Static219.aClass92_1.aFloat91;
			Static456.aFloat260 = Static219.aClass92_1.aFloat87;
			Static309.anInt108 = Static219.aClass92_1.anInt2885;
			Static293.anInt8472 = Static219.aClass92_1.anInt2884;
		} else {
			@Pc(70) int local70 = (Static227.anInt4885 << 8) / Static395.anInt7319;
			@Pc(75) int local75 = 255 - local70;
			@Pc(80) float local80 = (float) local70 / 255.0F;
			Static309.anInt108 = ((Static219.aClass92_1.anInt2885 & 0xFF00) * local75 + local70 * (Static453.anInt8232 & 0xFF00) & 0xFF0000) + ((Static219.aClass92_1.anInt2885 & 0xFF00FF) * local75 + (Static453.anInt8232 & 0xFF00FF) * local70 & 0xFF00FF00) >>> 8;
			@Pc(116) float local116 = 1.0F - local80;
			Static159.aFloat130 = (Static219.aClass92_1.aFloat86 - Static61.aFloat47) * local116 + Static61.aFloat47;
			Static293.anInt8472 = ((Static106.anInt2363 & 0xFF00FF) * local70 + (Static219.aClass92_1.anInt2884 & 0xFF00FF) * local75 & 0xFF00FF00) + ((Static106.anInt2363 & 0xFF00) * local70 + (Static219.aClass92_1.anInt2884 & 0xFF00) * local75 & 0xFF0000) >>> 8;
			Static403.aFloat211 = local116 * (Static219.aClass92_1.aFloat89 - Static535.aFloat267) + Static535.aFloat267;
			Static92.aFloat67 = (Static219.aClass92_1.aFloat88 - Static399.aFloat209) * local116 + Static399.aFloat209;
			Static241.aFloat261 = local116 * (Static219.aClass92_1.aFloat91 - Static255.aFloat159) + Static255.aFloat159;
			Static477.anInt8634 = Static219.aClass92_1.anInt2889 * local75 + local70 * Static16.anInt656 >> 8;
			Static40.aFloat41 = Static69.aFloat52 + local116 * (Static219.aClass92_1.aFloat90 - Static69.aFloat52);
			Static456.aFloat260 = (Static219.aClass92_1.aFloat87 - Static312.aFloat175) * local116 + Static312.aFloat175;
			if (Static219.aClass92_1.aClass66_1 != Static549.aClass66_4) {
				Static401.aClass66_3 = Static236.aClass5_4.method7450(Static549.aClass66_4, Static219.aClass92_1.aClass66_1, local116, Static401.aClass66_3);
			}
		}
		Static232.aLong129 = local16;
	}
}
