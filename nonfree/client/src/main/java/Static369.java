import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	public static int anInt7056;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
	public static int anInt7055 = 0;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!sba;Lclient!ha;II)V")
	public static void method5891(@OriginalArg(1) Class302 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1 local12 = arg0.method7356(arg1);
		if (local12 == null) {
			return;
		}
		arg1.KA(arg2, arg3, arg0.anInt8909 + arg2, arg3 + arg0.anInt8872);
		if (Static571.anInt9787 == 2 || Static571.anInt9787 == 5 || Static142.aClass4_10 == null) {
			arg1.A(-16777216, local12, arg2, arg3);
			return;
		}
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(56) int local56;
		if (Static554.anInt9497 == 4) {
			local52 = Static150.anInt3512;
			local54 = Static260.anInt5570;
			local56 = 4096;
			local62 = (int) -Static595.aFloat184 & 0x3FFF;
		} else {
			local56 = 4096 - Static289.anInt10738 * 16;
			local52 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360;
			local62 = Static372.anInt7080 + (int) -Static595.aFloat184 & 0x3FFF;
			local54 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357;
		}
		@Pc(98) int local98 = local52 / 128 + 48 - (Static306.anInt6176 - 104) * 2;
		@Pc(117) int local117 = Static108.anInt2930 * 4 + 48 + 208 - local54 / 128 - Static108.anInt2930 * 2;
		Static142.aClass4_10.method7709((float) arg2 + (float) arg0.anInt8909 / 2.0F, (float) arg3 + (float) arg0.anInt8872 / 2.0F, (float) local98, (float) local117, local56, local62 << 2, local12, arg2, arg3);
		@Pc(168) int local168;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(199) int local199;
		for (@Pc(151) Class6_Sub37 local151 = (Class6_Sub37) Static127.aClass163_16.method4966(); local151 != null; local151 = (Class6_Sub37) Static127.aClass163_16.method4965()) {
			@Pc(156) int local156 = local151.anInt7833;
			local168 = (Static511.aClass374_3.anIntArray559[local156] >> 14 & 0x3FFF) - Static477.anInt8412;
			local178 = (Static511.aClass374_3.anIntArray559[local156] & 0x3FFF) - Static227.anInt5049;
			local189 = local168 * 4 + 2 - local52 / 128;
			local199 = local178 * 4 + 2 - local54 / 128;
			Static305.method5160(local189, Static511.aClass374_3.anIntArray561[local156], arg3, local12, arg1, arg0, arg2, local199);
		}
		for (local168 = 0; local168 < Static108.anInt2934; local168++) {
			local178 = Static41.anIntArray41[local168] * 4 + 2 - local52 / 128;
			local189 = Static10.anIntArray13[local168] * 4 + 2 - local54 / 128;
			@Pc(260) Class356 local260 = Static249.aClass310_1.method7474(Static149.anIntArray156[local168]);
			if (local260.anIntArray545 != null) {
				local260 = local260.method8322(Static140.aClass157_1);
				if (local260 == null || local260.anInt10226 == -1) {
					continue;
				}
			}
			Static305.method5160(local178, local260.anInt10226, arg3, local12, arg1, arg0, arg2, local189);
		}
		@Pc(348) int local348;
		@Pc(359) int local359;
		for (@Pc(300) Class6_Sub47 local300 = (Class6_Sub47) Static283.aClass380_37.method8755(); local300 != null; local300 = (Class6_Sub47) Static283.aClass380_37.method8752()) {
			local189 = (int) (local300.aLong278 >> 28 & 0x3L);
			if (local189 == Static49.anInt1670) {
				local199 = (int) (local300.aLong278 & 0x3FFFL) - Static477.anInt8412;
				@Pc(337) int local337 = (int) (local300.aLong278 >> 14 & 0x3FFFL) - Static227.anInt5049;
				local348 = local199 * 4 + 2 - local52 / 128;
				local359 = local337 * 4 + 2 - local54 / 128;
				Static8.method485(arg3, local359, arg2, arg0, local12, local348, Static166.aClass4Array18[0]);
			}
		}
		@Pc(450) int local450;
		for (local189 = 0; local189 < Static288.anInt5977; local189++) {
			@Pc(392) Class6_Sub42 local392 = (Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local189]);
			if (local392 != null) {
				@Pc(397) Class9_Sub4_Sub2_Sub1_Sub1 local397 = local392.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				if (local397.method1992() && local397.aByte135 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135) {
					@Pc(413) Class158 local413 = local397.aClass158_1;
					if (local413 != null && local413.anIntArray260 != null) {
						local413 = local413.method4867(Static140.aClass157_1);
					}
					if (local413 != null && local413.aBoolean456 && local413.aBoolean453) {
						local359 = local397.anInt10360 / 128 - local52 / 128;
						local450 = local397.anInt10357 / 128 - local54 / 128;
						if (local413.anInt5831 == -1) {
							Static8.method485(arg3, local450, arg2, arg0, local12, local359, Static166.aClass4Array18[1]);
						} else {
							Static305.method5160(local359, local413.anInt5831, arg3, local12, arg1, arg0, arg2, local450);
						}
					}
				}
			}
		}
		local199 = Static6.anInt462;
		@Pc(486) int[] local486 = Static551.anIntArray503;
		@Pc(537) int local537;
		@Pc(541) int local541;
		@Pc(573) int local573;
		for (local348 = 0; local348 < local199; local348++) {
			@Pc(496) Class9_Sub4_Sub2_Sub1_Sub2 local496 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local486[local348]];
			if (local496 != null && local496.method3634() && !local496.aBoolean354 && local496 != Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 == local496.aByte135) {
				local450 = local496.anInt10360 / 128 - local52 / 128;
				local537 = local496.anInt10357 / 128 - local54 / 128;
				@Pc(539) boolean local539 = false;
				for (local541 = 0; local541 < Static544.anInt9412; local541++) {
					if (local496.aString46.equals(Static277.aStringArray16[local541]) && Static284.anIntArray265[local541] != 0) {
						local539 = true;
						break;
					}
				}
				@Pc(571) boolean local571 = false;
				for (local573 = 0; local573 < Static67.anInt2305; local573++) {
					if (local496.aString46.equals(Static638.aClass162Array1[local573].aString63)) {
						local571 = true;
						break;
					}
				}
				@Pc(593) boolean local593 = false;
				if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4377 != 0 && local496.anInt4377 != 0 && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4377 == local496.anInt4377) {
					local593 = true;
				}
				if (local496.aBoolean357) {
					Static8.method485(arg3, local537, arg2, arg0, local12, local450, Static166.aClass4Array18[6]);
				} else if (local539) {
					Static8.method485(arg3, local537, arg2, arg0, local12, local450, Static166.aClass4Array18[3]);
				} else if (local571) {
					Static8.method485(arg3, local537, arg2, arg0, local12, local450, Static166.aClass4Array18[5]);
				} else if (local593) {
					Static8.method485(arg3, local537, arg2, arg0, local12, local450, Static166.aClass4Array18[4]);
				} else {
					Static8.method485(arg3, local537, arg2, arg0, local12, local450, Static166.aClass4Array18[2]);
				}
			}
		}
		@Pc(695) Class50[] local695 = Static189.aClass50Array1;
		@Pc(777) int local777;
		for (local450 = 0; local450 < local695.length; local450++) {
			@Pc(703) Class50 local703 = local695[local450];
			if (local703 != null && local703.anInt2414 != 0 && Static384.anInt7234 % 20 < 10) {
				@Pc(743) int local743;
				if (local703.anInt2414 == 1) {
					@Pc(729) Class6_Sub42 local729 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local703.anInt2411);
					if (local729 != null) {
						@Pc(734) Class9_Sub4_Sub2_Sub1_Sub1 local734 = local729.aClass9_Sub4_Sub2_Sub1_Sub1_1;
						local743 = local734.anInt10360 / 128 - local52 / 128;
						local573 = local734.anInt10357 / 128 - local54 / 128;
						Static452.method6866(local703.anInt2407, local12, local573, local743, arg0, arg3, 360000L, arg2);
					}
				}
				if (local703.anInt2414 == 2) {
					local777 = local703.anInt2404 / 128 - local52 / 128;
					local541 = local703.anInt2415 / 128 - local54 / 128;
					@Pc(793) long local793 = (long) (local703.anInt2406 << 7);
					@Pc(797) long local797 = local793 * local793;
					Static452.method6866(local703.anInt2407, local12, local541, local777, arg0, arg3, local797, arg2);
				}
				if (local703.anInt2414 == 10 && local703.anInt2411 >= 0 && local703.anInt2411 < Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1.length) {
					@Pc(828) Class9_Sub4_Sub2_Sub1_Sub2 local828 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local703.anInt2411];
					if (local828 != null) {
						local541 = local828.anInt10360 / 128 - local52 / 128;
						local743 = local828.anInt10357 / 128 - local54 / 128;
						Static452.method6866(local703.anInt2407, local12, local743, local541, arg0, arg3, 360000L, arg2);
					}
				}
			}
		}
		if (Static554.anInt9497 == 4) {
			return;
		}
		if (Static473.anInt8390 != 0) {
			local537 = Static473.anInt8390 * 4 + (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() + -1) * 2 + 2 - local52 / 128;
			local777 = Static445.anInt8080 * 4 + (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() - 1) * 2 + 2 - local54 / 128;
			Static8.method485(arg3, local777, arg2, arg0, local12, local537, Static579.aClass4Array17[Static622.aBoolean830 ? 1 : 0]);
		}
		if (!Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aBoolean354) {
			arg1.method6123(3, 3, arg0.anInt8872 / 2 + arg3 - 1, -1, arg2 + arg0.anInt8909 / 2 - 1);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZ)V")
	public static void method5892(@OriginalArg(1) boolean arg0) {
		@Pc(9) int local9 = Static547.anInt513;
		@Pc(11) int local11 = Static482.anInt8531;
		if (arg0 && Static423.aBoolean622) {
			local9 <<= 0x1;
			local11 = -local9;
		}
		Static467.aClass5_13.f(local11, local9);
	}
}
