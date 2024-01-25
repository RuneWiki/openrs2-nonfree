import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!qfa", name = "J", descriptor = "I")
	public static int anInt9693;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)I")
	public static int method8181(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILclient!ha;ILjava/lang/String;III)V")
	public static void method8183(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static152.aClass9_6 == null || Static235.aClass9_9 == null) {
			if (Static403.aClass221_115.method5068(Static137.anInt2537) && Static403.aClass221_115.method5068(Static389.anInt7012)) {
				Static152.aClass9_6 = arg1.method7659(Static728.method4757(Static403.aClass221_115, Static137.anInt2537, 0), true);
				@Pc(34) Class194 local34 = Static728.method4757(Static403.aClass221_115, Static389.anInt7012, 0);
				Static235.aClass9_9 = arg1.method7659(local34, true);
				local34.method4760();
				Static428.aClass9_21 = arg1.method7659(local34, true);
			} else {
				arg1.aa(arg5, arg2, arg0, 20, Static354.anInt6017 | 255 - Static270.anInt4885 << 24, 1);
			}
		}
		if (Static152.aClass9_6 != null && Static235.aClass9_9 != null) {
			@Pc(86) int local86 = (arg0 - Static235.aClass9_9.method8602() * 2) / Static152.aClass9_6.method8602();
			for (@Pc(88) int local88 = 0; local88 < local86; local88++) {
				Static152.aClass9_6.method8617(Static235.aClass9_9.method8602() + arg5 + local88 * Static152.aClass9_6.method8602(), arg2);
			}
			Static235.aClass9_9.method8617(arg5, arg2);
			Static428.aClass9_21.method8617(arg5 + arg0 - Static428.aClass9_21.method8602(), arg2);
		}
		Static427.aClass44_34.method8129(Static129.anInt2431 | 0xFF000000, arg3, -1, arg5 + 3, arg2 - -14);
		arg1.aa(arg5, arg2 + 20, arg0, arg4 - 20, Static354.anInt6017 | 255 - Static270.anInt4885 << 24, 1);
	}

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "(I)Lclient!bs;")
	public static Class3_Sub12 method8184() {
		if (Static654.aClass357_50 == null || Static580.aClass60_1 == null) {
			return null;
		}
		Static580.aClass60_1.method1303(Static654.aClass357_50);
		@Pc(29) Class3_Sub12 local29 = (Class3_Sub12) Static580.aClass60_1.method1304();
		if (local29 == null) {
			return null;
		} else {
			@Pc(40) Class105 local40 = Static654.aClass98_4.method2452(local29.anInt950);
			return local40 != null && local40.aBoolean251 && local40.method2655(Static654.anInterface10_2) ? local29 : Static109.method1955();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZ)V")
	public static void method8185(@OriginalArg(0) int arg0) {
		Static11.aLong14 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!rba;II)V")
	public static void method8186(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (Static667.aClass325_8 == null) {
			return;
		}
		try {
			Static667.aClass325_8.method7815(0L);
			Static667.aClass325_8.method7818(arg1, arg0.aByteArray50, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)Z")
	public static boolean method8187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static111.method1983(arg0, arg1) || Static165.method2650(arg0, arg1);
	}
}
