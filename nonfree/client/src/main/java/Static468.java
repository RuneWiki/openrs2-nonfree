import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "Lclient!f;")
	public static Class46 aClass46_29;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "[I")
	public static final int[] anIntArray593 = new int[4];

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "Lclient!oda;")
	public static final Class240 aClass240_5 = new Class240();

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_235 = new Class272(69, 4);

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "[Lclient!rc;")
	public static final Class3_Sub3_Sub15[] aClass3_Sub3_Sub15Array5 = new Class3_Sub3_Sub15[14];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!og;)V")
	public static void method6466(@OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg0) {
		@Pc(19) Class3_Sub17 local19 = (Class3_Sub17) Static145.aClass310_11.method6601((long) arg0.anInt6429);
		if (local19 == null) {
			Static238.method3980(arg0.aByte126, arg0, arg0.anIntArray518[0], 0, null, null, arg0.anIntArray517[0]);
		} else {
			local19.method2233();
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	public static void method6468() {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static363.method5457(0, 15);
		local13.method845();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg5);
		@Pc(17) int local17 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg1);
		@Pc(23) int local23 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0);
		@Pc(29) int local29 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg4);
		@Pc(37) int local37 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg3 + arg5);
		@Pc(46) int local46 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg1 - arg3);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static337.method5150(local29, arg6, local23, Static176.anIntArrayArray28[local48]);
		}
		for (@Pc(70) int local70 = local17; local70 > local46; local70--) {
			Static337.method5150(local29, arg6, local23, Static176.anIntArrayArray28[local70]);
		}
		@Pc(94) int local94 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 + arg3);
		@Pc(103) int local103 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg4 - arg3);
		for (@Pc(105) int local105 = local37; local105 <= local46; local105++) {
			@Pc(111) int[] local111 = Static176.anIntArrayArray28[local105];
			Static337.method5150(local94, arg6, local23, local111);
			Static337.method5150(local103, arg2, local94, local111);
			Static337.method5150(local29, arg6, local103, local111);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!mq;I)V")
	public static void method6470(@OriginalArg(1) Class217 arg0, @OriginalArg(2) int arg1) {
		if (Static450.aBoolean583) {
			Static450.aBoolean583 = false;
			arg1 = 0;
		}
		if (Static39.aClass217_1 != null && Static39.aClass217_1.method5140(arg0)) {
			return;
		}
		Static39.aClass217_1 = arg0;
		Static438.aLong128 = Static587.method7753();
		Static501.anInt7991 = arg1;
		Static467.anInt7656 = arg1;
		if (Static467.anInt7656 != 0) {
			Static155.aFloat49 = Static84.aFloat33;
			Static13.aFloat128 = Static589.aFloat224;
			Static129.aFloat44 = Static348.aFloat126;
			Static448.aClass55_4 = Static447.aClass55_3;
			Static204.aFloat84 = Static503.aFloat176;
			Static555.aFloat221 = Static143.aFloat182;
			Static534.anInt8388 = Static57.anInt1376;
			Static379.aFloat144 = Static474.aFloat157;
			Static426.anInt7110 = Static39.anInt951;
			Static592.anInt9398 = Static278.anInt5099;
			return;
		}
		Static3.method52();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Z")
	public static boolean method6473(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method6475(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local18 - local22 || local20 - local24 < local16) {
			if (local18 - local22 >= local8) {
				return -1;
			}
			if (local20 - local24 >= local16) {
				return 1;
			}
			@Pc(63) char local63;
			if (local22 == '\u0000') {
				local63 = arg2.charAt(local18++);
			} else {
				local63 = local22;
			}
			@Pc(73) char local73;
			if (local24 == '\u0000') {
				local73 = arg0.charAt(local20++);
			} else {
				local73 = local24;
			}
			local22 = Static159.method2858(local63);
			local24 = Static159.method2858(local73);
			local63 = Static29.method542(arg1, local63);
			local73 = Static29.method542(arg1, local73);
			if (local63 != local73 && Character.toUpperCase(local63) != Character.toUpperCase(local73)) {
				local63 = Character.toLowerCase(local63);
				local73 = Character.toLowerCase(local73);
				if (local63 != local73) {
					return Static473.method6504(local63, arg1) - Static473.method6504(local73, arg1);
				}
			}
		}
		@Pc(146) int local146 = Math.min(local8, local16);
		for (@Pc(148) int local148 = 0; local148 < local146; local148++) {
			if (arg1 == 2) {
				local18 = local8 - local148 - 1;
				local20 = local16 - local148 - 1;
			} else {
				local20 = local148;
				local18 = local148;
			}
			@Pc(179) char local179 = arg2.charAt(local18);
			@Pc(183) char local183 = arg0.charAt(local20);
			if (local179 != local183 && Character.toUpperCase(local179) != Character.toUpperCase(local183)) {
				local179 = Character.toLowerCase(local179);
				local183 = Character.toLowerCase(local183);
				if (local179 != local183) {
					return Static473.method6504(local179, arg1) - Static473.method6504(local183, arg1);
				}
			}
		}
		@Pc(223) int local223 = local8 - local16;
		if (local223 != 0) {
			return local223;
		}
		for (@Pc(232) int local232 = 0; local232 < local146; local232++) {
			@Pc(238) char local238 = arg2.charAt(local232);
			@Pc(242) char local242 = arg0.charAt(local232);
			if (local242 != local238) {
				return Static473.method6504(local238, arg1) - Static473.method6504(local242, arg1);
			}
		}
		return 0;
	}
}
