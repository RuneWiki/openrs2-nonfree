import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	public static int anInt2372;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;Lclient!r;Z)V", line = 19)
	public static void method2368(@OriginalArg(0) Class197 arg0, @OriginalArg(1) Class197 arg1) {
		Static40.aClass197_7 = arg1;
		Static342.aClass197_92 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!wm;)V", line = 33)
	public static void method2369(@OriginalArg(1) Class19 arg0) {
		@Pc(7) int local7 = Static282.anInt5731;
		@Pc(9) int local9 = Static338.anInt6788;
		@Pc(11) int local11 = Static100.anInt2217;
		@Pc(15) int local15 = Static327.anInt6507 - 3;
		if (Static184.aClass13_12 == null || Static129.aClass13_8 == null) {
			if (Static29.aClass197_5.method5088(Static174.anInt3727) && Static29.aClass197_5.method5088(Static63.anInt1634)) {
				Static184.aClass13_12 = arg0.method2893(Static372.method1684(Static29.aClass197_5, Static174.anInt3727, 0));
				@Pc(44) Class48 local44 = Static372.method1684(Static29.aClass197_5, Static63.anInt1634, 0);
				Static129.aClass13_8 = arg0.method2893(local44);
				local44.method1686();
				Static71.aClass13_5 = arg0.method2893(local44);
			} else {
				arg0.method2903(local7, local9, local11, 20, 255 - Static240.anInt6704 << 24 | Static225.anInt4439, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static184.aClass13_12 != null && Static129.aClass13_8 != null) {
			local87 = (local11 - Static129.aClass13_8.method6390() * 2) / Static184.aClass13_12.method6390();
			for (local89 = 0; local89 < local87; local89++) {
				Static184.aClass13_12.method6386(local7 + Static129.aClass13_8.method6390() + Static184.aClass13_12.method6390() * local89, local9);
			}
			Static129.aClass13_8.method6386(local7, local9);
			Static71.aClass13_5.method6386(local7 + local11 - Static71.aClass13_5.method6390(), local9);
		}
		Static49.aClass130_1.method5898(local7 + 3, -1, local9 + 14, Static299.anInt6018 | 0xFF000000, Class124.aClass79_74.method2269(Class197.anInt5569));
		arg0.method2903(local7, local9 + 20, local11, local15 - 20, -Static240.anInt6704 + 255 << 24 | Static225.anInt4439, 1);
		local87 = Static210.aClass119_1.method3305();
		local89 = Static210.aClass119_1.method3314();
		@Pc(169) int local169 = 0;
		@Pc(192) int local192;
		for (@Pc(174) Class2_Sub5 local174 = (Class2_Sub5) Class92.aClass135_19.method3552(); local174 != null; local174 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			local192 = local9 + (-local169 + -1 + Class2_Sub3_Sub24.anInt4949) * 16 + 33;
			local169++;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local192 - 13 && local192 + 4 > local89 && local174.aBoolean83) {
				arg0.method2903(local7, local192 - 12, local11, 16, Static187.anInt3693 | 255 - Static82.anInt1866 << 24, 1);
			}
		}
		if ((Static314.aClass13_17 == null || Static197.aClass13_13 == null || Static34.aClass13_3 == null) && Static29.aClass197_5.method5088(Static70.anInt1720) && Static29.aClass197_5.method5088(Static338.anInt6791) && Static29.aClass197_5.method5088(Static364.anInt7198)) {
			@Pc(275) Class48 local275 = Static372.method1684(Static29.aClass197_5, Static338.anInt6791, 0);
			Static197.aClass13_13 = arg0.method2893(local275);
			local275.method1686();
			Static316.aClass13_18 = arg0.method2893(local275);
			Static314.aClass13_17 = arg0.method2893(Static372.method1684(Static29.aClass197_5, Static70.anInt1720, 0));
			@Pc(300) Class48 local300 = Static372.method1684(Static29.aClass197_5, Static364.anInt7198, 0);
			Static34.aClass13_3 = arg0.method2893(local300);
			local300.method1686();
			Static103.aClass13_6 = arg0.method2893(local300);
		}
		local169 = 0;
		@Pc(368) int local368;
		@Pc(333) int local333;
		if (Static314.aClass13_17 != null && Static197.aClass13_13 != null && Static34.aClass13_3 != null) {
			local192 = (local11 - Static34.aClass13_3.method6390() * 2) / Static314.aClass13_17.method6390();
			for (local333 = 0; local333 < local192; local333++) {
				Static314.aClass13_17.method6386(Static34.aClass13_3.method6390() + local7 + local333 * Static314.aClass13_17.method6390(), local9 + local15 - Static314.aClass13_17.method6383());
			}
			local368 = (local15 - Static34.aClass13_3.method6383() - 20) / Static197.aClass13_13.method6383();
			for (@Pc(370) int local370 = 0; local370 < local368; local370++) {
				Static197.aClass13_13.method6386(local7, local9 + local370 * Static197.aClass13_13.method6383() + 20);
				Static316.aClass13_18.method6386(local11 + local7 - Static316.aClass13_18.method6390(), local370 * Static197.aClass13_13.method6383() + 20 + local9);
			}
			Static34.aClass13_3.method6386(local7, local9 + local15 - Static34.aClass13_3.method6383());
			Static103.aClass13_6.method6386(local7 + local11 - Static34.aClass13_3.method6390(), local15 + local9 + -Static34.aClass13_3.method6383());
		}
		for (@Pc(436) Class2_Sub5 local436 = (Class2_Sub5) Class92.aClass135_19.method3552(); local436 != null; local436 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			local333 = (Class2_Sub3_Sub24.anInt4949 - local169 - 1) * 16 + local9 + 13 + 20;
			local368 = Static299.anInt6018 | 0xFF000000;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local333 - 13 && local89 < local333 + 4 && local436.aBoolean83) {
				local368 = Static355.anInt7105 | 0xFF000000;
			}
			@Pc(499) int[] local499 = null;
			if (Static275.method2427(local436.anInt1004)) {
				local499 = Static290.aClass107_2.method2761((int) local436.aLong30).anIntArray364;
			} else if (local436.anInt1007 != -1) {
				local499 = Static290.aClass107_2.method2761(local436.anInt1007).anIntArray364;
			} else if (Static274.method5112(local436.anInt1004)) {
				@Pc(572) Class11_Sub5_Sub2_Sub2 local572 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[(int) local436.aLong30];
				if (local572 != null) {
					@Pc(577) Class71 local577 = local572.aClass71_1;
					if (local577.anIntArray129 != null) {
						local577 = local577.method2095(Static199.aClass226_1);
					}
					if (local577 != null) {
						local499 = local577.anIntArray131;
					}
				}
			} else if (Static224.method4191(local436.anInt1004)) {
				@Pc(540) Class41 local540;
				if (local436.anInt1004 == 1010) {
					local540 = Static334.aClass202_4.method5164((int) local436.aLong30);
				} else {
					local540 = Static334.aClass202_4.method5164((int) (local436.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local540.anIntArray94 != null) {
					local540 = local540.method1535(Static199.aClass226_1);
				}
				if (local540 != null) {
					local499 = local540.anIntArray96;
				}
			}
			@Pc(607) String local607 = Static295.method5422(local436);
			if (local499 != null) {
				local607 = local607 + Static149.method2940(local499);
			}
			Static49.aClass130_1.method5902(Static68.anIntArray114, Static125.aClass13Array12, local7 + 3, local607, local333, local368);
			local169++;
			if (local436.aBoolean82) {
				Static112.aClass13_7.method6386(local7 + Static106.aClass239_2.method6127(local607) + 5, local333 + -12);
			}
		}
		Static139.method2712(Static338.anInt6788, Static282.anInt5731, Static327.anInt6507, Static100.anInt2217);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)V", line = 261)
	public static void method2371() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Class132.aBooleanArray33[local3] = false;
		}
		Class104.anInt2714 = -1;
		Class230.anInt6443 = -1;
		Static219.anInt4302 = 0;
		Static291.anInt5899 = 1;
		Static32.anInt4456 = 0;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)I", line = 285)
	public static int method2372(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 330)
	public static int method2374(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Class2_Sub43.anInt7165; local19++) {
			if (arg0.equalsIgnoreCase(Class12_Sub1_Sub1.aStringArray43[local19])) {
				return local19;
			}
		}
		return -1;
	}
}
