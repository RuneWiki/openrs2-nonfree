import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public static int anInt6098;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Lclient!cf;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "I")
	public static int anInt6100;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_130 = new Class85("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!to", name = "j", descriptor = "I")
	public static int anInt6099 = -1;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray62 = new String[5];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIZI)V")
	public static void method5474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(42) int local42 = Static196.aShort46 + local21 * (Static292.aShort8 - Static196.aShort46) / 100;
		if (Static88.aShort7 > local42) {
			local42 = Static88.aShort7;
		} else if (local42 > Static354.aShort94) {
			local42 = Static354.aShort94;
		}
		@Pc(63) int local63 = arg0 * local42 * 512 / (arg2 * 334);
		@Pc(108) int local108;
		@Pc(115) int local115;
		@Pc(79) short local79;
		if (local63 < Static78.aShort6) {
			local79 = Static78.aShort6;
			local42 = arg2 * 334 * local79 / (arg0 * 512);
			if (Static354.aShort94 < local42) {
				local42 = Static354.aShort94;
				local108 = local42 * 512 * arg0 / (local79 * 334);
				local115 = (arg2 - local108) / 2;
				if (arg3) {
					Static236.aClass55_9.method5186();
					Static236.aClass55_9.method5254(local115, -16777216, arg0, arg4, arg1);
					Static236.aClass55_9.method5254(local115, -16777216, arg0, arg4 + arg2 - local115, arg1);
				}
				arg2 -= local115 * 2;
				arg4 += local115;
			}
		} else if (local63 > Static311.aShort38) {
			local79 = Static311.aShort38;
			local42 = local79 * 334 * arg2 / (arg0 * 512);
			if (Static88.aShort7 > local42) {
				local42 = Static88.aShort7;
				local108 = arg2 * local79 * 334 / (local42 * 512);
				local115 = (arg0 - local108) / 2;
				if (arg3) {
					Static236.aClass55_9.method5186();
					Static236.aClass55_9.method5254(arg2, -16777216, local115, arg4, arg1);
					Static236.aClass55_9.method5254(arg2, -16777216, local115, arg4, arg0 + arg1 - local115);
				}
				arg0 -= local115 * 2;
				arg1 += local115;
			}
		}
		Static110.anInt2075 = arg0 * local42 / 334;
		Static177.anInt3505 = (short) arg2;
		Static267.anInt5264 = arg4;
		Static44.anInt748 = (short) arg0;
		Static48.anInt928 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
	public static int method5475(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(36) int local36 = (local19 * arg0 >> 12) + 40960;
		return local36 * local13 >> 12;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public static void method5476() {
		Static115.aClass109_26.method2850();
		Static37.aClass109_10.method2850();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5477(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 2);
		local8.method850();
		local8.aString7 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILclient!ij;)Lclient!ge;")
	public static Class5_Sub1_Sub6 method5479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93 arg2) {
		@Pc(12) Class5_Sub12 local12 = new Class5_Sub12(arg2.method2410(arg0, arg1));
		@Pc(45) Class5_Sub1_Sub6 local45 = new Class5_Sub1_Sub6(arg0, local12.method5064(), local12.method5064(), local12.method5067(), local12.method5067(), local12.method5115() == 1, local12.method5115(), local12.method5115());
		@Pc(49) int local49 = local12.method5115();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass103_49.method2745(new Class5_Sub35(local12.method5115(), local12.method5106(), local12.method5106(), local12.method5106(), local12.method5106(), local12.method5106(), local12.method5106(), local12.method5106(), local12.method5106()));
		}
		local45.method1831();
		return local45;
	}
}
