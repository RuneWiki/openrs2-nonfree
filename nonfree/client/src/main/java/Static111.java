import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
	public static int anInt2449;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
	public static int anInt2450;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_38 = new Class154(16);

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "[I")
	public static final int[] anIntArray236 = new int[50];

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
	public static int anInt2451 = 1;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method2068() {
		Static238.method4097(Static301.aClass72_19);
		Static203.anInt4288++;
		if (Static182.aBoolean332 && Static205.aBoolean368) {
			@Pc(24) int local24 = Static38.anInt830;
			local24 -= Static72.anInt1627;
			@Pc(30) int local30 = Static184.anInt4055;
			if (Static277.anInt5631 > local24) {
				local24 = Static277.anInt5631;
			}
			local30 -= Static345.anInt6765;
			if (Static310.anInt6218 > local30) {
				local30 = Static310.anInt6218;
			}
			if (Static352.aClass72_20.anInt1829 + Static277.anInt5631 < Static301.aClass72_19.anInt1829 + local24) {
				local24 = Static352.aClass72_20.anInt1829 + Static277.anInt5631 - Static301.aClass72_19.anInt1829;
			}
			if (local30 + Static301.aClass72_19.anInt1806 > Static310.anInt6218 + Static352.aClass72_20.anInt1806) {
				local30 = Static310.anInt6218 + Static352.aClass72_20.anInt1806 - Static301.aClass72_19.anInt1806;
			}
			@Pc(94) int local94 = local24 - Static240.anInt5023;
			@Pc(99) int local99 = local30 - Static89.anInt1953;
			@Pc(102) int local102 = Static301.aClass72_19.anInt1846;
			if (Static301.aClass72_19.anInt1840 < Static203.anInt4288 && (local102 < local94 || -local102 > local94 || local99 > local102 || local99 < -local102)) {
				Static181.aBoolean329 = true;
			}
			@Pc(146) int local146 = local24 + Static352.aClass72_20.anInt1841 - Static277.anInt5631;
			@Pc(161) int local161 = local30 + Static352.aClass72_20.anInt1864 - Static310.anInt6218;
			@Pc(170) Class4_Sub22 local170;
			if (Static301.aClass72_19.anObjectArray14 != null && Static181.aBoolean329) {
				local170 = new Class4_Sub22();
				local170.anInt3125 = local161;
				local170.anInt3116 = local146;
				local170.anObjectArray34 = Static301.aClass72_19.anObjectArray14;
				local170.aClass72_12 = Static301.aClass72_19;
				Static97.method1756(local170);
			}
			if (Static136.anInt3094 == 0) {
				if (Static181.aBoolean329) {
					if (Static301.aClass72_19.anObjectArray6 != null) {
						local170 = new Class4_Sub22();
						local170.anInt3116 = local146;
						local170.aClass72_11 = Static57.aClass72_5;
						local170.anInt3125 = local161;
						local170.aClass72_12 = Static301.aClass72_19;
						local170.anObjectArray34 = Static301.aClass72_19.anObjectArray6;
						Static97.method1756(local170);
					}
					if (Static57.aClass72_5 != null && Static46.method874(Static301.aClass72_19) != null) {
						Static320.aClass4_Sub7_Sub1_3.method1237(114);
						Static320.aClass4_Sub7_Sub1_3.method2387(Static301.aClass72_19.anInt1830);
						Static320.aClass4_Sub7_Sub1_3.method2406(Static57.aClass72_5.anInt1849);
						Static320.aClass4_Sub7_Sub1_3.method2408(Static57.aClass72_5.anInt1830);
						Static320.aClass4_Sub7_Sub1_3.method2376(Static301.aClass72_19.anInt1849);
					}
				} else if ((Static82.anInt1737 == 1 || Static72.method1364()) && Static282.anInt5713 > 2) {
					Static170.method3195(2);
				} else if (Static282.method4832()) {
					Static170.method3195(1);
				}
				Static301.aClass72_19 = null;
			}
		} else if (Static203.anInt4288 > 1) {
			Static301.aClass72_19 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)I")
	public static int method2069(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local13 * local32 >> 12;
	}
}
