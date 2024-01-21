import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!de", name = "Yb", descriptor = "Lclient!pg;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!de", name = "X", descriptor = "I")
	public static volatile int anInt956 = -1;

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_12 = new Class86(64);

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
	public static int anInt973 = 0;

	@OriginalMember(owner = "client!de", name = "zb", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[104][104];

	@OriginalMember(owner = "client!de", name = "Ib", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_233 = Static81.method1507("event_opbase");

	@OriginalMember(owner = "client!de", name = "Wb", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_13 = new Class86(200);

	@OriginalMember(owner = "client!de", name = "Xb", descriptor = "[I")
	public static final int[] anIntArray87 = new int[1000];

	@OriginalMember(owner = "client!de", name = "Zb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_234 = Static81.method1507("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!de", name = "ac", descriptor = "I")
	public static int anInt987 = 0;

	@OriginalMember(owner = "client!de", name = "bc", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_235 = Static81.method1507(" from your ignore list first)3");

	@OriginalMember(owner = "client!de", name = "cc", descriptor = "Lclient!dj;")
	public static Class24 aClass24_236 = aClass24_235;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
	public static void method687() {
		if (Static194.aClass98_17 != null || Static208.aClass98_21 != null) {
			return;
		}
		@Pc(13) int local13 = Static170.anInt3792;
		@Pc(29) int local29;
		@Pc(80) int local80;
		if (Static53.aBoolean73) {
			@Pc(27) int local27;
			if (local13 != 1) {
				local27 = Static24.anInt661;
				local29 = Static7.anInt174;
				if (local27 < Static10.anInt1519 - 10 || local27 > Static109.anInt2509 + Static10.anInt1519 + 10 || Static110.anInt2525 - 10 > local29 || local29 > Static7.anInt173 + Static110.anInt2525 + 10) {
					Static53.aBoolean73 = false;
					Static39.method726(Static7.anInt173, Static110.anInt2525, Static10.anInt1519, Static109.anInt2509);
				}
			}
			if (local13 == 1) {
				@Pc(74) int local74 = Static157.anInt3462;
				local29 = Static110.anInt2525;
				local27 = Static10.anInt1519;
				local80 = Static109.anInt2509;
				@Pc(82) int local82 = Static92.anInt2141;
				@Pc(84) int local84 = -1;
				for (@Pc(86) int local86 = 0; local86 < Static156.anInt3437; local86++) {
					@Pc(101) int local101 = (Static156.anInt3437 - local86 - 1) * 15 + local29 + 31;
					if (local74 > local27 && local74 < local27 + local80 && local82 > local101 - 13 && local101 + 3 > local82) {
						local84 = local86;
					}
				}
				if (local84 != -1) {
					Static63.method1279(local84);
				}
				Static53.aBoolean73 = false;
				Static39.method726(Static7.anInt173, Static110.anInt2525, Static10.anInt1519, Static109.anInt2509);
				return;
			}
			return;
		}
		if (local13 == 1 && Static156.anInt3437 > 0) {
			@Pc(160) short local160 = Static98.aShortArray28[Static156.anInt3437 - 1];
			if (local160 == 6 || local160 == 21 || local160 == 35 || local160 == 47 || local160 == 8 || local160 == 42 || local160 == 40 || local160 == 15 || local160 == 41 || local160 == 49 || local160 == 12 || local160 == 1001) {
				local29 = Static210.anIntArray412[Static156.anInt3437 - 1];
				local80 = Static17.anIntArray38[Static156.anInt3437 - 1];
				@Pc(226) Class98 local226 = Static188.method3229(local80);
				if (Static104.method1812(Static105.method1831(local226)) || Static123.method2076(Static105.method1831(local226))) {
					Static60.anInt3652 = 0;
					Static138.aBoolean146 = false;
					if (Static194.aClass98_17 != null) {
						Static199.method2199(Static194.aClass98_17);
					}
					Static194.aClass98_17 = Static188.method3229(local80);
					Static73.anInt1769 = local29;
					Static4.anInt4611 = Static157.anInt3462;
					Static54.anInt3866 = Static92.anInt2141;
					Static199.method2199(Static194.aClass98_17);
					return;
				}
			}
		}
		if (local13 == 1 && (Static181.anInt4036 == 1 && Static156.anInt3437 > 2 || Static34.method664(Static156.anInt3437 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static156.anInt3437 > 0) {
			Static63.method1279(Static156.anInt3437 - 1);
		}
		if (local13 != 2 || Static156.anInt3437 <= 0) {
			return;
		}
		Static12.method295();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BI[Lclient!ue;II)V")
	public static void method689(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93[] arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class1_Sub7 local9 = new Class1_Sub7(arg0);
		@Pc(15) int local15 = -1;
		while (true) {
			@Pc(19) int local19 = local9.method2782();
			if (local19 == 0) {
				return;
			}
			@Pc(23) int local23 = 0;
			local15 += local19;
			while (true) {
				@Pc(31) int local31 = local9.method2795();
				if (local31 == 0) {
					break;
				}
				local23 += local31 - 1;
				@Pc(45) int local45 = local23 >> 6 & 0x3F;
				@Pc(49) int local49 = local23 & 0x3F;
				@Pc(53) int local53 = local23 >> 12;
				@Pc(57) int local57 = local9.method2771();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local45 + arg3;
				@Pc(69) int local69 = local57 & 0x3;
				@Pc(73) int local73 = local49 + arg1;
				if (local65 > 0 && local73 > 0 && local65 < 103 && local73 < 103) {
					@Pc(90) int local90 = local53;
					if ((Static43.aByteArrayArrayArray3[1][local65][local73] & 0x2) == 2) {
						local90 = local53 - 1;
					}
					@Pc(104) Class93 local104 = null;
					if (local90 >= 0) {
						local104 = arg2[local90];
					}
					Static48.method881(Static30.aBoolean35, local65, local104, local61, local15, true, local73, local69, local53, local53);
				}
			}
		}
	}
}
