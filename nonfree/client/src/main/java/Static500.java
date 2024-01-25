import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	public static int anInt8734;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Lclient!lf;")
	public static Class204 aClass204_8;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "Lclient!r;")
	public static Class78 aClass78_134;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Lclient!laa;")
	public static Class198 aClass198_4;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
	public static int anInt8737;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "Lclient!en;")
	public static final Class84 aClass84_8 = new Class84("", 15);

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
	public static final int[] anIntArray525 = new int[13];

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
	public static void method7049() {
		Static557.method7542((long) Static518.anInt9331, Static31.aClass78_18);
		if (Static165.anInt3165 != -1) {
			Static18.method441(Static165.anInt3165);
		}
		for (@Pc(19) int local19 = 0; local19 < Static231.anInt4302; local19++) {
			if (Static73.aBooleanArray6[local19]) {
				Static102.aBooleanArray7[local19] = true;
			}
			Static529.aBooleanArray31[local19] = Static73.aBooleanArray6[local19];
			Static73.aBooleanArray6[local19] = false;
		}
		Static43.anInt868 = Static518.anInt9331;
		if (Static165.anInt3165 != -1) {
			Static231.anInt4302 = 0;
			Static2.method68();
		}
		Static31.aClass78_18.JA();
		Static550.method7495(Static31.aClass78_18);
		@Pc(64) int local64 = Static347.method5188();
		if (local64 == -1) {
			local64 = Static422.anInt7430;
		}
		if (local64 == -1) {
			local64 = Static533.anInt8981;
		}
		Static399.method5767(local64);
		Static175.anInt3258 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!in;Lclient!r;BII)V")
	public static void method7051(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class181 local10 = arg0.method3361(arg1);
		if (local10 == null) {
			return;
		}
		arg1.da(arg3, arg2, arg0.anInt4182 + arg3, arg0.anInt4156 + arg2);
		if (Static71.anInt1363 == 2 || Static71.anInt1363 == 5 || Static513.aClass5_37 == null) {
			arg1.FA(-16777216, local10, arg3, arg2);
			return;
		}
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(54) int local54;
		@Pc(46) int local46;
		if (Static358.anInt9363 == 4) {
			local57 = Static576.anInt4080;
			local60 = Static273.anInt1191;
			local54 = (int) -Static331.aFloat172 & 0x3FFF;
			local46 = 4096;
		} else {
			local46 = 4096 - Static267.anInt4887 * 16;
			local54 = Static272.anInt5007 + (int) -Static331.aFloat172 & 0x3FFF;
			local57 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902;
			local60 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906;
		}
		@Pc(86) int local86 = local57 / 128 + 48 + 208 - Static458.anInt9736 * 2;
		@Pc(104) int local104 = Static378.anInt6747 * 4 + 48 + 208 - local60 / 128 - Static378.anInt6747 * 2;
		Static513.aClass5_37.method7796((float) arg0.anInt4182 / 2.0F + (float) arg3, (float) arg0.anInt4156 / 2.0F + (float) arg2, (float) local86, (float) local104, local46, local54 << 2, local10, arg3, arg2);
		@Pc(155) int local155;
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(186) int local186;
		for (@Pc(138) Class1_Sub27 local138 = (Class1_Sub27) Static334.aClass111_37.method2547(); local138 != null; local138 = (Class1_Sub27) Static334.aClass111_37.method2554()) {
			@Pc(143) int local143 = local138.anInt3348;
			local155 = (Static114.aClass267_1.anIntArray424[local143] >> 14 & 0x3FFF) - Static539.anInt9045;
			local165 = (Static114.aClass267_1.anIntArray424[local143] & 0x3FFF) - Static311.anInt5708;
			local175 = local155 * 4 + 2 - local57 / 128;
			local186 = local165 * 4 + 2 - local60 / 128;
			Static427.method6122(arg2, arg0, local186, arg3, arg1, Static114.aClass267_1.anIntArray425[local143], local175, local10);
		}
		for (local155 = 0; local155 < Static375.anInt6734; local155++) {
			local165 = Static483.anIntArray517[local155] * 4 + 2 - local57 / 128;
			local175 = Static426.anIntArray458[local155] * 4 + 2 - local60 / 128;
			@Pc(243) Class178 local243 = Static347.aClass122_4.method2770(Static225.anIntArray200[local155]);
			if (local243.anIntArray252 != null) {
				local243 = local243.method3713(Static390.aClass353_29);
				if (local243 == null || local243.anInt4646 == -1) {
					continue;
				}
			}
			Static427.method6122(arg2, arg0, local175, arg3, arg1, local243.anInt4646, local165, local10);
		}
		@Pc(328) int local328;
		@Pc(339) int local339;
		for (@Pc(284) Class1_Sub20 local284 = (Class1_Sub20) Static365.aClass91_29.method2278(); local284 != null; local284 = (Class1_Sub20) Static365.aClass91_29.method2276()) {
			local175 = (int) (local284.aLong268 >> 28 & 0x3L);
			if (local175 == Static473.anInt8115) {
				local186 = (int) (local284.aLong268 & 0x3FFFL) - Static539.anInt9045;
				@Pc(317) int local317 = (int) (local284.aLong268 >> 14 & 0x3FFFL) - Static311.anInt5708;
				local328 = local186 * 4 + 2 - local57 / 128;
				local339 = local317 * 4 + 2 - local60 / 128;
				Static82.method1353(arg2, local339, local10, arg3, arg0, Static205.aClass5Array12[0], local328);
			}
		}
		@Pc(429) int local429;
		for (local175 = 0; local175 < Static306.anInt4911; local175++) {
			@Pc(370) Class1_Sub33 local370 = (Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local175]);
			if (local370 != null) {
				@Pc(375) Class11_Sub1_Sub1_Sub3_Sub2 local375 = local370.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				if (local375.method6087() && local375.aByte113 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) {
					@Pc(391) Class354 local391 = local375.aClass354_1;
					if (local391 != null && local391.anIntArray597 != null) {
						local391 = local391.method7683(Static390.aClass353_29);
					}
					if (local391 != null && local391.aBoolean703 && local391.aBoolean701) {
						local339 = local375.anInt8902 / 128 - local57 / 128;
						local429 = local375.anInt8906 / 128 - local60 / 128;
						if (local391.anInt9424 == -1) {
							Static82.method1353(arg2, local429, local10, arg3, arg0, Static205.aClass5Array12[1], local339);
						} else {
							Static427.method6122(arg2, arg0, local429, arg3, arg1, local391.anInt9424, local339, local10);
						}
					}
				}
			}
		}
		local186 = Static75.anInt1461;
		@Pc(470) int[] local470 = Static167.anIntArray145;
		@Pc(517) int local517;
		@Pc(521) int local521;
		@Pc(550) int local550;
		for (local328 = 0; local328 < local186; local328++) {
			@Pc(480) Class11_Sub1_Sub1_Sub3_Sub1 local480 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local470[local328]];
			if (local480 != null && local480.method2949() && !local480.aBoolean262 && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 != local480 && local480.aByte113 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) {
				local429 = local480.anInt8902 / 128 - local57 / 128;
				local517 = local480.anInt8906 / 128 - local60 / 128;
				@Pc(519) boolean local519 = false;
				for (local521 = 0; local521 < Static99.anInt1760; local521++) {
					if (local480.aString35.equals(Static187.aStringArray6[local521]) && Static225.anIntArray201[local521] != 0) {
						local519 = true;
						break;
					}
				}
				@Pc(548) boolean local548 = false;
				for (local550 = 0; local550 < Static33.anInt723; local550++) {
					if (local480.aString35.equals(Static272.aClass254Array1[local550].aString77)) {
						local548 = true;
						break;
					}
				}
				@Pc(574) boolean local574 = false;
				if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3612 != 0 && local480.anInt3612 != 0 && local480.anInt3612 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3612) {
					local574 = true;
				}
				if (local480.aBoolean259) {
					Static82.method1353(arg2, local517, local10, arg3, arg0, Static205.aClass5Array12[6], local429);
				} else if (local519) {
					Static82.method1353(arg2, local517, local10, arg3, arg0, Static205.aClass5Array12[3], local429);
				} else if (local548) {
					Static82.method1353(arg2, local517, local10, arg3, arg0, Static205.aClass5Array12[5], local429);
				} else if (local574) {
					Static82.method1353(arg2, local517, local10, arg3, arg0, Static205.aClass5Array12[4], local429);
				} else {
					Static82.method1353(arg2, local517, local10, arg3, arg0, Static205.aClass5Array12[2], local429);
				}
			}
		}
		@Pc(680) Class358[] local680 = Static243.aClass358Array1;
		@Pc(767) int local767;
		for (local429 = 0; local429 < local680.length; local429++) {
			@Pc(688) Class358 local688 = local680[local429];
			if (local688 != null && local688.anInt9530 != 0 && Static518.anInt9331 % 20 < 10) {
				@Pc(732) int local732;
				if (local688.anInt9530 == 1) {
					@Pc(717) Class1_Sub33 local717 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local688.anInt9537);
					if (local717 != null) {
						@Pc(722) Class11_Sub1_Sub1_Sub3_Sub2 local722 = local717.aClass11_Sub1_Sub1_Sub3_Sub2_2;
						local732 = local722.anInt8902 / 128 - local57 / 128;
						local550 = local722.anInt8906 / 128 - local60 / 128;
						Static366.method5383(360000L, local732, arg0, local10, arg2, local688.anInt9538, arg3, local550);
					}
				}
				if (local688.anInt9530 == 2) {
					local767 = local688.anInt9534 / 128 - local57 / 128;
					local521 = local688.anInt9532 / 128 - local60 / 128;
					@Pc(783) long local783 = (long) (local688.anInt9540 << 7);
					@Pc(787) long local787 = local783 * local783;
					Static366.method5383(local787, local767, arg0, local10, arg2, local688.anInt9538, arg3, local521);
				}
				if (local688.anInt9530 == 10 && local688.anInt9537 >= 0 && Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1.length > local688.anInt9537) {
					@Pc(815) Class11_Sub1_Sub1_Sub3_Sub1 local815 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local688.anInt9537];
					if (local815 != null) {
						local521 = local815.anInt8902 / 128 - local57 / 128;
						local732 = local815.anInt8906 / 128 - local60 / 128;
						Static366.method5383(360000L, local521, arg0, local10, arg2, local688.anInt9538, arg3, local732);
					}
				}
			}
		}
		if (Static358.anInt9363 == 4) {
			return;
		}
		if (Static258.anInt4724 != 0) {
			local517 = Static258.anInt4724 * 4 + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() + -1) * 2 + 2 - local57 / 128;
			local767 = Static345.anInt9498 * 4 + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() * 2 + 2 - local60 / 128 - 2;
			Static82.method1353(arg2, local767, local10, arg3, arg0, Static21.aClass5Array4[Static395.aBoolean537 ? 1 : 0], local517);
		}
		if (!Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aBoolean262) {
			arg1.method6800(-1, 3, arg3 + arg0.anInt4182 / 2 - 1, 3, arg2 + arg0.anInt4156 / 2 - 1);
		}
	}
}
