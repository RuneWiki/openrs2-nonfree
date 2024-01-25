import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jh", name = "Lb", descriptor = "I")
	public static int anInt5049;

	@OriginalMember(owner = "client!jh", name = "Gb", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_92 = new Class254(54, -1);

	@OriginalMember(owner = "client!jh", name = "Jb", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_93 = new Class254(24, 8);

	@OriginalMember(owner = "client!jh", name = "Kb", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_7 = new Class112(6, 0, 4, 2);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!fp;BIII)V")
	public static void method4362(@OriginalArg(0) Class11_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class169 local16 = arg0.method6209();
		@Pc(25) int local25 = arg0.anInt7364 - arg0.aClass134_7.anInt4230 & 0x3FFF;
		if (arg3 == -1) {
			if (local25 != 0 || arg0.anInt7389 > 25) {
				arg0.aBoolean545 = false;
				if (arg2 < 0 && local16.anInt5185 != -1) {
					arg0.anInt7390 = local16.anInt5185;
				} else if (arg2 <= 0 || local16.anInt5159 == -1) {
					arg0.anInt7390 = local16.anInt5198;
				} else {
					arg0.anInt7390 = local16.anInt5159;
				}
			} else if (!arg0.aBoolean545 || !local16.method4459(arg0.anInt7390)) {
				arg0.anInt7390 = local16.method4461();
				arg0.aBoolean545 = arg0.anInt7390 != -1;
			}
		} else if (arg0.anInt7407 != -1 && (local25 >= 10240 || local25 <= 2048)) {
			@Pc(55) int local55 = Static181.anIntArray110[arg1] - arg0.aClass134_7.anInt4230 & 0x3FFF;
			arg0.aBoolean545 = false;
			if (arg3 == 2 && local16.anInt5181 != -1) {
				if (local55 > 2048 && local55 <= 6144 && local16.anInt5164 != -1) {
					arg0.anInt7390 = local16.anInt5164;
				} else if (local55 >= 10240 && local55 < 14336 && local16.anInt5191 != -1) {
					arg0.anInt7390 = local16.anInt5191;
				} else if (local55 <= 6144 || local55 >= 10240 || local16.anInt5178 == -1) {
					arg0.anInt7390 = local16.anInt5181;
				} else {
					arg0.anInt7390 = local16.anInt5178;
				}
			} else if (arg3 == 0 && local16.anInt5161 != -1) {
				if (local55 > 2048 && local55 <= 6144 && local16.anInt5166 != -1) {
					arg0.anInt7390 = local16.anInt5166;
				} else if (local55 >= 10240 && local55 < 14336 && local16.anInt5194 != -1) {
					arg0.anInt7390 = local16.anInt5194;
				} else if (local55 <= 6144 || local55 >= 10240 || local16.anInt5160 == -1) {
					arg0.anInt7390 = local16.anInt5161;
				} else {
					arg0.anInt7390 = local16.anInt5160;
				}
			} else if (local55 > 2048 && local55 <= 6144 && local16.anInt5190 != -1) {
				arg0.anInt7390 = local16.anInt5190;
			} else if (local55 >= 10240 && local55 < 14336 && local16.anInt5199 != -1) {
				arg0.anInt7390 = local16.anInt5199;
			} else if (local55 <= 6144 || local55 >= 10240 || local16.anInt5158 == -1) {
				arg0.anInt7390 = local16.anInt5198;
			} else {
				arg0.anInt7390 = local16.anInt5158;
			}
		} else if (local25 == 0 && arg0.anInt7389 <= 25) {
			if (arg3 == 2 && local16.anInt5181 != -1) {
				arg0.anInt7390 = local16.anInt5181;
			} else if (arg3 == 0 && local16.anInt5161 != -1) {
				arg0.anInt7390 = local16.anInt5161;
			} else {
				arg0.anInt7390 = local16.anInt5198;
			}
			arg0.aBoolean545 = false;
		} else {
			if (arg3 == 2 && local16.anInt5181 != -1) {
				if (arg2 < 0 && local16.anInt5173 != -1) {
					arg0.anInt7390 = local16.anInt5173;
				} else if (arg2 <= 0 || local16.anInt5162 == -1) {
					arg0.anInt7390 = local16.anInt5181;
				} else {
					arg0.anInt7390 = local16.anInt5162;
				}
			} else if (arg3 == 0 && local16.anInt5161 != -1) {
				if (arg2 < 0 && local16.anInt5197 != -1) {
					arg0.anInt7390 = local16.anInt5197;
				} else if (arg2 <= 0 || local16.anInt5163 == -1) {
					arg0.anInt7390 = local16.anInt5161;
				} else {
					arg0.anInt7390 = local16.anInt5163;
				}
			} else if (arg2 < 0 && local16.anInt5177 != -1) {
				arg0.anInt7390 = local16.anInt5177;
			} else if (arg2 <= 0 || local16.anInt5195 == -1) {
				arg0.anInt7390 = local16.anInt5198;
			} else {
				arg0.anInt7390 = local16.anInt5195;
			}
			arg0.aBoolean545 = false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "(II)I")
	public static int method4363(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[[BLclient!nq;)V")
	public static void method4364(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class202_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		@Pc(42) int local42;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class6_Sub26 local30 = new Class6_Sub26(local23);
				local36 = Static341.anIntArray470[local17] >> 8;
				local42 = Static341.anIntArray470[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static191.anInt4147;
				@Pc(55) int local55 = local42 * 64 - anInt5049;
				Static186.method3607();
				arg1.method5734(Static55.aClass194Array1, local30, anInt5049, Static191.anInt4147, local49, local55);
				arg1.method5736(local30, Static323.aClass9_8, local49, local55, local12);
				if (!arg1.aBoolean511 && local36 == Static335.anInt6221 / 8 && Static94.anInt2266 / 8 == local42 && local12[0] != -1) {
					Static74.aClass38_3 = Static61.aClass15_1.method642(local12[1], Static273.aClass115_1, local12[3], local12[0], local12[2]);
					Static432.anInt7891 = local12[4];
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < local15; local130++) {
			local36 = (Static341.anIntArray470[local130] >> 8) * 64 - Static191.anInt4147;
			local42 = (Static341.anIntArray470[local130] & 0xFF) * 64 - anInt5049;
			@Pc(158) byte[] local158 = arg0[local130];
			if (local158 == null && Static94.anInt2266 < 800) {
				Static186.method3607();
				arg1.method5731(local36, local42);
			}
		}
	}
}
