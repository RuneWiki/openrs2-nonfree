import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "Lclient!dda;")
	public static Class53 aClass53_52;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_79 = new Class239(11, 7);

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_99 = new Class202("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_40 = new Class243(63, -1);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIILclient!qa;BLclient!n;)V")
	public static void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(6) Interface12 arg5) {
		if (Static111.anInt2224 < 100) {
			Static42.method812(arg5, arg4);
		}
		arg4.N(arg3, arg0, arg1 + arg3, arg2 + arg0);
		@Pc(33) int local33;
		@Pc(52) int local52;
		if (Static111.anInt2224 < 100) {
			local33 = arg1 / 2 + arg3;
			arg4.f(arg3, arg0, arg1, arg2, -16777216, 0);
			local52 = arg0 + arg2 / 2 - 20 - 18;
			arg4.method6060(local33 - 152, local52, 304, 34, Static423.aColorArray2[Static298.anInt5469].getRGB(), 0);
			arg4.f(local33 - 150, local52 + 2, Static111.anInt2224 * 3, 30, Static390.aColorArray1[Static298.anInt5469].getRGB(), 0);
			Static175.aClass47_1.method7598(Static450.aColorArray3[Static298.anInt5469].getRGB(), local33, Static480.aClass202_242.method5139(Static172.anInt6352), -1, local52 + 20);
			return;
		}
		@Pc(107) int local107 = Static202.anInt3644 - (int) ((float) arg1 / Static201.aFloat5);
		local33 = (int) ((float) arg2 / Static201.aFloat5) + Static140.anInt2619;
		local52 = Static202.anInt3644 + (int) ((float) arg1 / Static201.aFloat5);
		@Pc(132) int local132 = Static140.anInt2619 - (int) ((float) arg2 / Static201.aFloat5);
		Static33.anInt601 = (int) ((float) (arg2 * 2) / Static201.aFloat5);
		Static269.anInt4936 = Static140.anInt2619 - (int) ((float) arg2 / Static201.aFloat5);
		Static507.anInt2736 = (int) ((float) (arg1 * 2) / Static201.aFloat5);
		Static15.anInt349 = Static202.anInt3644 - (int) ((float) arg1 / Static201.aFloat5);
		Static201.method352(local107 + Static201.anInt205, Static201.anInt198 + local33, Static201.anInt205 + local52, local132 + Static201.anInt198, arg3, arg0, arg1 + arg3, arg2 + 1 + arg0);
		Static201.method353(arg4);
		@Pc(194) Class249 local194 = Static201.method360(arg4);
		Static302.method4743(local194, arg4);
		if (Static277.anInt5015 > 0) {
			Static533.anInt9264--;
			if (Static533.anInt9264 == 0) {
				Static277.anInt5015--;
				Static533.anInt9264 = 20;
			}
		}
		if (!Static382.aBoolean529) {
			return;
		}
		@Pc(230) int local230 = arg3 + arg1 - 5;
		@Pc(236) int local236 = arg2 + arg0 - 8;
		Static477.aClass47_4.method7603("Fps:" + Static441.anInt8032, local236, 16776960, local230);
		@Pc(251) int local251 = local236 - 15;
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static477.aClass47_4.method7603("Mem:" + local262 + "k", local251, local264, local230);
		local236 = local251 - 15;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)Z")
	public static boolean method2836(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
