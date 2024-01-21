import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_35;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public static int anInt762;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "Lclient!ca;")
	public static Class9 aClass9_3;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!hb;")
	public static Class27 aClass27_378 = Static87.method1648("@gr2@");

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public static int anInt767 = 0;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Lclient!hb;")
	private static Class27 aClass27_379 = Static87.method1648(" ");

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_380 = aClass27_379;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Lclient!hb;")
	public static Class27 aClass27_381 = Static87.method1648("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public static void method637() {
		aClass9_3 = null;
		aClass27_379 = null;
		aClass27_378 = null;
		anObject3 = null;
		aClass27_381 = null;
		aClass27_380 = null;
		aClass3_Sub3_Sub2_Sub4_35 = null;
		Class5_Sub1.anIntArray148 = null;
		anIntArray147 = null;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	public static void method639() {
		Static11.aClass21_32.method663();
		Static80.aClass21_25.method663();
		Static97.aClass21_28.method663();
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)I")
	public static int method640(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static34.anIntArray156[arg0];
		@Pc(11) int local11 = (local3 * Static107.anInt2765 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!hc;I)V")
	public static void method641(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 * arg2 + arg0 * arg0;
		if (local8 <= 4225 || local8 >= 90000) {
			Static2.method16(arg0, arg1, arg2);
			return;
		}
		@Pc(27) int local27 = Static73.anInt1924 + Static46.anInt1251 & 0x7FF;
		@Pc(31) int local31 = Static21.anIntArray99[local27];
		@Pc(39) int local39 = local31 * 256 / (Static3.anInt91 + 256);
		@Pc(43) int local43 = Static21.anIntArray96[local27];
		@Pc(51) int local51 = local43 * 256 / (Static3.anInt91 + 256);
		@Pc(62) int local62 = arg0 * local39 + arg2 * local51 >> 16;
		@Pc(73) int local73 = local51 * arg0 - local39 * arg2 >> 16;
		@Pc(79) double local79 = Math.atan2((double) local62, (double) local73);
		@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
		@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
		Static78.aClass3_Sub3_Sub2_Sub2_6.method798(local85 + 94 + 4 - 10, 83 - (local91 - -20), local79);
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)V")
	public static void method642() {
		Static47.aClass3_Sub11_Sub1_1.method1475();
		@Pc(13) int local13 = Static47.aClass3_Sub11_Sub1_1.method1476(8);
		@Pc(22) int local22;
		if (local13 < Static104.anInt2724) {
			for (local22 = local13; local22 < Static104.anInt2724; local22++) {
				Static55.anIntArray240[Static18.anInt427++] = Static85.anIntArray349[local22];
			}
		}
		if (Static104.anInt2724 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static104.anInt2724 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(68) int local68 = Static85.anIntArray349[local22];
			@Pc(72) Class3_Sub3_Sub1_Sub4_Sub1 local72 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local68];
			@Pc(77) int local77 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
			if (local77 == 0) {
				Static85.anIntArray349[Static104.anInt2724++] = local68;
				local72.anInt2382 = Static2.anInt38;
			} else {
				@Pc(100) int local100 = Static47.aClass3_Sub11_Sub1_1.method1476(2);
				if (local100 == 0) {
					Static85.anIntArray349[Static104.anInt2724++] = local68;
					local72.anInt2382 = Static2.anInt38;
					Static82.anIntArray335[Static70.anInt1829++] = local68;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local100 == 1) {
						Static85.anIntArray349[Static104.anInt2724++] = local68;
						local72.anInt2382 = Static2.anInt38;
						local142 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
						local72.method1674(false, local142);
						local152 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
						if (local152 == 1) {
							Static82.anIntArray335[Static70.anInt1829++] = local68;
						}
					} else if (local100 == 2) {
						Static85.anIntArray349[Static104.anInt2724++] = local68;
						local72.anInt2382 = Static2.anInt38;
						local142 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
						local72.method1674(true, local142);
						local152 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
						local72.method1674(true, local152);
						@Pc(206) int local206 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
						if (local206 == 1) {
							Static82.anIntArray335[Static70.anInt1829++] = local68;
						}
					} else if (local100 == 3) {
						Static55.anIntArray240[Static18.anInt427++] = local68;
					}
				}
			}
		}
	}
}
