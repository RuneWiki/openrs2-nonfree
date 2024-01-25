import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!sca;")
	public static Class325 aClass325_3;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "[Lclient!rda;")
	public static Class4_Sub1[] aClass4_Sub1Array5;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static final int anInt5474 = 328;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public static int anInt5481 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!gda;BI)Lclient!kaa;")
	public static Class196 method4907(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte[] local15 = arg0.method3069(arg1);
		return local15 == null ? null : new Class196(local15);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method4908() {
		if (Static382.anInt6450 < 0) {
			return;
		}
		@Pc(7) long local7 = Static480.method6763();
		Static382.anInt6450 = (int) ((long) Static382.anInt6450 + Static248.aLong132 - local7);
		if (Static382.anInt6450 <= 0) {
			Static534.aClass185_4 = Static167.aClass283_3.aClass185_2;
			Static456.aFloat148 = Static167.aClass283_3.aFloat145;
			Static369.aFloat134 = Static167.aClass283_3.aFloat144;
			Static575.anInt9001 = Static167.aClass283_3.anInt7336;
			Static332.aFloat131 = Static167.aClass283_3.aFloat143;
			Static467.aFloat149 = Static167.aClass283_3.aFloat141;
			Static602.anInt9697 = Static167.aClass283_3.anInt7341;
			Static382.anInt6450 = -1;
			Static475.aFloat213 = Static167.aClass283_3.aFloat146;
			Static76.aFloat37 = Static167.aClass283_3.aFloat142;
			Static675.anInt10852 = Static167.aClass283_3.anInt7343;
		} else {
			@Pc(63) int local63 = (Static382.anInt6450 << 8) / Static67.anInt1117;
			@Pc(68) int local68 = 255 - local63;
			@Pc(73) float local73 = (float) local63 / 255.0F;
			Static675.anInt10852 = ((Static167.aClass283_3.anInt7343 & 0xFF00FF) * local68 + local63 * (Static423.anInt10674 & 0xFF00FF) & 0xFF00FF00) + ((Static423.anInt10674 & 0xFF00) * local63 + (Static167.aClass283_3.anInt7343 & 0xFF00) * local68 & 0xFF0000) >>> 8;
			@Pc(111) float local111 = 1.0F - local73;
			Static369.aFloat134 = Static298.aFloat128 + local111 * (Static167.aClass283_3.aFloat144 - Static298.aFloat128);
			Static76.aFloat37 = (Static167.aClass283_3.aFloat142 - Static172.aFloat185) * local111 + Static172.aFloat185;
			Static475.aFloat213 = Static194.aFloat215 + local111 * (Static167.aClass283_3.aFloat146 - Static194.aFloat215);
			Static602.anInt9697 = (local63 * (Static282.anInt5023 & 0xFF00) + (Static167.aClass283_3.anInt7341 & 0xFF00) * local68 & 0xFF0000) + (local68 * (Static167.aClass283_3.anInt7341 & 0xFF00FF) + (Static282.anInt5023 & 0xFF00FF) * local63 & 0xFF00FF00) >>> 8;
			Static332.aFloat131 = (Static167.aClass283_3.aFloat143 - Static127.aFloat60) * local111 + Static127.aFloat60;
			Static575.anInt9001 = Static167.aClass283_3.anInt7336 * local68 + local63 * Static649.anInt10615 >> 8;
			Static467.aFloat149 = (Static167.aClass283_3.aFloat141 - Static41.aFloat27) * local111 + Static41.aFloat27;
			Static456.aFloat148 = (Static167.aClass283_3.aFloat145 - Static268.aFloat120) * local111 + Static268.aFloat120;
			if (Static103.aClass185_1 != Static167.aClass283_3.aClass185_2) {
				Static534.aClass185_4 = Static437.aClass100_10.method8584(Static103.aClass185_1, Static167.aClass283_3.aClass185_2, local111, Static534.aClass185_4);
			}
		}
		Static248.aLong132 = local7;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method4909() {
		Static65.anInt1087 = 0;
		Static24.aClass248Array1 = new Class248[50];
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method4914(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg0, 1);
		local9.method7444();
	}
}
