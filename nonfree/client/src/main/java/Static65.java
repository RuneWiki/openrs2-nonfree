import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!e", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Lclient!lg;")
	public static Class60 aClass60_4;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!rh;")
	public static final Class178 aClass178_2 = new Class178();

	@OriginalMember(owner = "client!e", name = "x", descriptor = "[B")
	public static final byte[] aByteArray23 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public static int anInt1359 = 0;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "I")
	public static int anInt1360 = 0;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "I")
	public static int anInt1361 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method1096() {
		Static320.aClass4_Sub7_Sub1_3.method1237(40);
		Static320.aClass4_Sub7_Sub1_3.method2416(Static11.method265());
		Static320.aClass4_Sub7_Sub1_3.method2376(Static202.anInt4258);
		Static320.aClass4_Sub7_Sub1_3.method2376(Static38.anInt832);
		Static320.aClass4_Sub7_Sub1_3.method2416(Static339.anInt6679);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!vm;Lclient!al;IIII)V")
	public static void method1097(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static38.anInt833 < 100) {
			Static103.method2834(arg1, arg2);
		}
		arg1.method4459(arg5, arg3, arg5 + arg4, arg3 - -arg0);
		@Pc(36) int local36;
		@Pc(46) int local46;
		if (Static38.anInt833 < 100) {
			local36 = arg4 / 2 + arg5;
			local46 = arg0 / 2 + arg3 - 18 - 20;
			arg1.method4436(arg5, arg3, arg4, arg0, -16777216, 0);
			arg1.method4495(local36 - 152, local46, 304, 34, Static104.aColorArray123[Static171.anInt3786].getRGB(), 0);
			arg1.method4436(local36 - 150, local46 - -2, Static38.anInt833 * 3, 30, Static298.aColorArray104[Static171.anInt3786].getRGB(), 0);
			Static81.aClass78_2.method4072(Static7.aString7, local36, Static218.aColorArray82[Static171.anInt3786].getRGB(), -1, local46 + 20);
			return;
		}
		@Pc(107) int local107 = Static307.anInt3771 - (int) ((float) arg4 / Static42.aFloat26);
		local36 = (int) ((float) arg0 / Static42.aFloat26) + Static35.anInt732;
		local46 = Static307.anInt3771 + (int) ((float) arg4 / Static42.aFloat26);
		@Pc(137) int local137 = Static35.anInt732 - (int) ((float) arg0 / Static42.aFloat26);
		Static310.anInt6221 = (int) ((float) (arg4 * 2) / Static42.aFloat26);
		Static307.anInt3768 = Static307.anInt3771 - (int) ((float) arg4 / Static42.aFloat26);
		Static328.anInt6445 = Static35.anInt732 - (int) ((float) arg0 / Static42.aFloat26);
		Static266.anInt5447 = (int) ((float) (arg0 * 2) / Static42.aFloat26);
		Static42.method2045(Static42.anInt2446 + local107, Static42.anInt2441 + local36, local46 + Static42.anInt2446, Static42.anInt2441 + local137, arg5, arg3, arg5 + arg4, arg3 - -arg0 + 1);
		Static42.method2060(arg1);
		@Pc(201) Class130 local201 = Static42.method2057(arg1);
		Static21.method391(arg1, local201);
		if (Static153.anInt3426 > 0) {
			Static290.anInt5894--;
			if (Static290.anInt5894 == 0) {
				Static153.anInt3426--;
				Static290.anInt5894 = 20;
			}
		}
		if (!Static258.aBoolean450) {
			return;
		}
		@Pc(232) int local232 = arg4 + arg5 - 5;
		@Pc(239) int local239 = arg3 + arg0 - 8;
		Static118.aClass78_3.method4054(local232, 16776960, local239, "Fps:" + Static173.anInt3835);
		@Pc(256) int local256 = local239 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static118.aClass78_3.method4054(local232, local269, local256, "Mem:" + local267 + "k");
		local239 = local256 - 15;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method1099() {
		if (Static183.aClass141_1 != null) {
			@Pc(8) Class141 local8 = Static183.aClass141_1;
			synchronized (Static183.aClass141_1) {
				Static183.aClass141_1 = null;
			}
		}
	}
}
