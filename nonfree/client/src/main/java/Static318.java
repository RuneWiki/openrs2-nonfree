import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "Lclient!ph;")
	public static Class187 aClass187_94;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIII)V")
	public static void method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 + arg2);
		@Pc(31) int local31 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg2 - arg0);
		Static212.method3267(local31, local22, arg3, Class10_Sub10_Sub1.lb[arg1]);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(63) int local63;
			@Pc(68) int local68;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local63 = arg1 - local9;
				local68 = arg1 + local9;
				if (local68 >= Static319.anInt5496 && Static160.anInt3220 >= local63) {
					local90 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local7 + arg2);
					local99 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg2 - local7);
					if (Static160.anInt3220 >= local68) {
						Static212.method3267(local99, local90, arg3, Class10_Sub10_Sub1.lb[local68]);
					}
					if (Static319.anInt5496 <= local63) {
						Static212.method3267(local99, local90, arg3, Class10_Sub10_Sub1.lb[local63]);
					}
				}
			}
			local7++;
			local63 = arg1 - local7;
			local68 = arg1 + local7;
			if (local68 >= Static319.anInt5496 && local63 <= Static160.anInt3220) {
				local90 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local9 + arg2);
				local99 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg2 - local9);
				if (Static160.anInt3220 >= local68) {
					Static212.method3267(local99, local90, arg3, Class10_Sub10_Sub1.lb[local68]);
				}
				if (local63 >= Static319.anInt5496) {
					Static212.method3267(local99, local90, arg3, Class10_Sub10_Sub1.lb[local63]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4369(@OriginalArg(1) String arg0) {
		if (!Static401.aBoolean489) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static270.anInt4754;
		@Pc(14) int[] local14 = Static53.anIntArray79;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class24_Sub3_Sub2_Sub2 local24 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local14[local16]];
			if (local24 != null && Static263.aClass24_Sub3_Sub2_Sub2_4 != local24 && local24.aString58 != null && local24.aString58.equalsIgnoreCase(arg0)) {
				Static310.method4308(Static154.aClass27_59);
				Static337.aClass10_Sub8_Sub2_2.method2506(Static273.anInt4773);
				Static337.aClass10_Sub8_Sub2_2.method2474(0);
				Static337.aClass10_Sub8_Sub2_2.method2505(Static228.anInt4243);
				Static337.aClass10_Sub8_Sub2_2.method2497(local14[local16]);
				Static337.aClass10_Sub8_Sub2_2.method2497(Static219.anInt4156);
				local10 = true;
				Static28.method370(0, local24.anIntArray611[0], true, local24.method4919(), local24.anIntArray610[0], -2, local24.method4919(), 0);
				break;
			}
		}
		if (!local10) {
			Static404.method5326(Static299.aClass182_155.method4155(Static191.anInt3842) + arg0);
		}
		if (Static401.aBoolean489) {
			Static456.method6051();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	public static void method4370() {
		Static166.anInt3290 = 0;
		Static297.anInt5146 = -1;
		Static457.anInt7597 = -1;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZB)V")
	public static void method4371(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static203.aClass10_Sub8_Sub2_1.method2526(Static10.anInt154) >= 15) {
				@Pc(12) int local12 = Static203.aClass10_Sub8_Sub2_1.method2525(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					@Pc(24) Class10_Sub26 local24 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local12);
					@Pc(30) Class24_Sub3_Sub2_Sub1 local30;
					if (local24 == null) {
						local30 = new Class24_Sub3_Sub2_Sub1();
						local30.anInt6228 = local12;
						local24 = new Class10_Sub26(local30);
						Static424.aClass167_33.method3705(local24, (long) local12);
						Static149.aClass10_Sub26Array1[Static134.anInt2764++] = local24;
						local17 = true;
					}
					local30 = local24.aClass24_Sub3_Sub2_Sub1_2;
					Static57.anIntArray91[Static219.anInt4155++] = local12;
					local30.anInt6234 = Static400.anInt6752;
					if (local30.aClass222_1 != null && local30.aClass222_1.method4945()) {
						Static50.method853(local30);
					}
					@Pc(90) int local90 = Static203.aClass10_Sub8_Sub2_1.method2525(3) + 4 << 11 & 0x3EE3;
					local30.method2892(Static448.aClass38_4.method866(Static203.aClass10_Sub8_Sub2_1.method2525(14)));
					@Pc(109) int local109 = Static203.aClass10_Sub8_Sub2_1.method2525(1);
					if (local109 == 1) {
						Static64.anIntArray97[Static216.anInt4132++] = local12;
					}
					@Pc(129) int local129;
					if (arg0) {
						local129 = Static203.aClass10_Sub8_Sub2_1.method2525(8);
						if (local129 > 127) {
							local129 -= 256;
						}
					} else {
						local129 = Static203.aClass10_Sub8_Sub2_1.method2525(5);
						if (local129 > 15) {
							local129 -= 32;
						}
					}
					@Pc(149) int local149 = Static203.aClass10_Sub8_Sub2_1.method2525(1);
					@Pc(154) int local154 = Static203.aClass10_Sub8_Sub2_1.method2525(2);
					@Pc(163) int local163;
					if (arg0) {
						local163 = Static203.aClass10_Sub8_Sub2_1.method2525(8);
						if (local163 > 127) {
							local163 -= 256;
						}
					} else {
						local163 = Static203.aClass10_Sub8_Sub2_1.method2525(5);
						if (local163 > 15) {
							local163 -= 32;
						}
					}
					local30.method4917(local30.aClass222_1.anInt6351);
					local30.anInt6219 = local30.aClass222_1.anInt6358 << 3;
					if (local17) {
						local30.method4907(true, local90);
					}
					local30.method2889(local149 == 1, Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0] + local129, local30.method4919(), Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0] + local163, local154);
					if (local30.aClass222_1.method4945()) {
						Static129.method2264(local30.anIntArray611[0], null, null, local30.anIntArray610[0], 0, local30.aByte98, local30);
					}
					continue;
				}
			}
			Static203.aClass10_Sub8_Sub2_1.method2528();
			return;
		}
	}
}
