import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Lclient!fi;")
	public static final Class65 aClass65_5 = new Class65();

	@OriginalMember(owner = "client!c", name = "w", descriptor = "I")
	public static int anInt2863 = 0;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
	public static void method2333() {
		if (Static174.anInt3622 < 0) {
			return;
		}
		@Pc(11) long local11 = Static53.method898();
		Static174.anInt3622 = (int) ((long) Static174.anInt3622 + Static52.aLong47 - local11);
		if (Static174.anInt3622 <= 0) {
			Static174.anInt3622 = -1;
			Static227.anInt4635 = Static213.aClass184_2.anInt5814;
			Static79.anInt5531 = Static213.aClass184_2.anInt5808;
			Static320.aFloat18 = Static213.aClass184_2.aFloat71;
			Static103.aFloat11 = Static213.aClass184_2.aFloat74;
			Static97.aFloat10 = Static213.aClass184_2.aFloat72;
			Static285.aFloat69 = Static213.aClass184_2.aFloat70;
			Static212.aFloat9 = Static213.aClass184_2.aFloat73;
			Static121.aFloat19 = Static213.aClass184_2.aFloat75;
			Static76.anInt1472 = Static213.aClass184_2.anInt5805;
			Static295.aClass113_4 = Static213.aClass184_2.aClass113_3;
		} else {
			@Pc(65) int local65 = (Static174.anInt3622 << 8) / Static301.anInt5983;
			@Pc(70) int local70 = 255 - local65;
			@Pc(75) float local75 = (float) local65 / 255.0F;
			Static227.anInt4635 = ((Static117.anInt2505 & 0xFF00FF) * local65 + (Static213.aClass184_2.anInt5814 & 0xFF00FF) * local70 & 0xFF00FF00) + (local70 * (Static213.aClass184_2.anInt5814 & 0xFF00) + local65 * (Static117.anInt2505 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(113) float local113 = 1.0F - local75;
			Static103.aFloat11 = local113 * (Static213.aClass184_2.aFloat74 - Static204.aFloat26) + Static204.aFloat26;
			Static212.aFloat9 = Static221.aFloat30 + local113 * (Static213.aClass184_2.aFloat73 - Static221.aFloat30);
			Static79.anInt5531 = ((Static167.anInt3454 & 0xFF00FF) * local65 + local70 * (Static213.aClass184_2.anInt5808 & 0xFF00FF) & 0xFF00FF00) + ((Static213.aClass184_2.anInt5808 & 0xFF00) * local70 + local65 * (Static167.anInt3454 & 0xFF00) & 0xFF0000) >>> 8;
			Static320.aFloat18 = Static190.aFloat25 + (Static213.aClass184_2.aFloat71 - Static190.aFloat25) * local113;
			Static97.aFloat10 = (Static213.aClass184_2.aFloat72 - Static18.aFloat1) * local113 + Static18.aFloat1;
			Static285.aFloat69 = Static134.aFloat22 + (Static213.aClass184_2.aFloat70 - Static134.aFloat22) * local113;
			Static121.aFloat19 = local113 * (Static213.aClass184_2.aFloat75 - Static123.aFloat20) + Static123.aFloat20;
			Static76.anInt1472 = Static213.aClass184_2.anInt5805 * local70 + local65 * Static116.anInt2486 >> 8;
			if (Static112.aClass113_1 != Static213.aClass184_2.aClass113_3) {
				Static295.aClass113_4 = Static235.aClass122_9.method4775(Static112.aClass113_1, Static213.aClass184_2.aClass113_3, local113, Static295.aClass113_4);
			}
		}
		Static52.aLong47 = local11;
	}
}
