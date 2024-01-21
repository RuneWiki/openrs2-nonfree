import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!wg;")
	public static Class94 aClass94_7;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public static int anInt3648;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1406 = Static120.method1824("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1410 = Static120.method1824(" has logged out)3");

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1407 = aClass80_1410;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1411 = Static120.method1824("M");

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1408 = aClass80_1411;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1409 = aClass80_1411;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "[Lclient!ve;")
	public static final Class3_Sub1_Sub5_Sub4_Sub2[] aClass3_Sub1_Sub5_Sub4_Sub2Array1 = new Class3_Sub1_Sub5_Sub4_Sub2[2048];

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public static int anInt3649 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZ)Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 method2632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(19) long local19 = ((long) arg2 << 40) + ((long) arg3 << 38) + (long) arg0 + ((long) arg1 << 16);
		@Pc(31) Class3_Sub1_Sub4_Sub4 local31;
		if (!arg4) {
			local31 = (Class3_Sub1_Sub4_Sub4) Static27.aClass5_65.method139(local19);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class3_Sub1_Sub2 local39 = Static173.method2793(arg0);
		if (arg1 > 1 && local39.anIntArray60 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (local39.anIntArray59[local51] <= arg1 && local39.anIntArray59[local51] != 0) {
					local49 = local39.anIntArray60[local51];
				}
			}
			if (local49 != -1) {
				local39 = Static173.method2793(local49);
			}
		}
		@Pc(88) Class3_Sub1_Sub5_Sub3_Sub1 local88 = local39.method270();
		if (local88 == null) {
			return null;
		}
		@Pc(94) Class3_Sub1_Sub4_Sub4 local94 = null;
		if (local39.anInt362 != -1) {
			local94 = method2632(local39.anInt374, 10, 0, 1, true);
			if (local94 == null) {
				return null;
			}
		}
		@Pc(114) int[] local114 = Static24.anIntArray448;
		@Pc(116) int local116 = Static24.anInt3597;
		@Pc(118) int local118 = Static24.anInt3596;
		@Pc(121) int[] local121 = new int[4];
		Static24.method2562(local121);
		local31 = new Class3_Sub1_Sub4_Sub4(36, 32);
		Static24.method2578(local31.anIntArray449, 36, 32);
		Static24.method2566();
		Static65.method964();
		Static65.method958(16, 16);
		@Pc(142) int local142 = local39.anInt355;
		if (arg4) {
			local142 = (int) ((double) local142 * 1.5D);
		} else if (arg3 == 2) {
			local142 = (int) ((double) local142 * 1.04D);
		}
		Static65.aBoolean58 = false;
		@Pc(172) int local172 = local142 * Class3_Sub1_Sub4_Sub2.anIntArray188[local39.anInt377] >> 16;
		@Pc(181) int local181 = local142 * Class3_Sub1_Sub4_Sub2.anIntArray190[local39.anInt377] >> 16;
		local88.method1385();
		local88.method1382(local39.anInt391, local39.anInt347, local39.anInt377, local39.anInt359, local172 + local39.anInt381 - local88.aShort34 / 2, local39.anInt381 + local181);
		if (arg3 >= 1) {
			local31.method2602(1);
		}
		if (arg3 >= 2) {
			local31.method2602(16777215);
		}
		if (arg2 != 0) {
			local31.method2605(arg2);
		}
		Static24.method2578(local31.anIntArray449, 36, 32);
		if (local39.anInt362 != -1) {
			local94.method2595(0, 0);
		}
		if (!arg4 && (local39.anInt389 == 1 || arg1 != 1) && arg1 != -1) {
			Static108.aClass3_Sub1_Sub4_Sub3_Sub1_5.method2264(Static138.method2149(arg1), 0, 9, 16776960, 1);
		}
		if (!arg4) {
			Static27.aClass5_65.method145(local31, local19);
		}
		Static24.method2578(local114, local118, local116);
		Static24.method2572(local121);
		Static65.method964();
		Static65.aBoolean58 = true;
		return local31;
	}
}
