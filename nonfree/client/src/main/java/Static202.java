import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!ja;")
	public static Class114 aClass114_1;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static int anInt3546;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt3547;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
	public static final int[] anIntArray421 = new int[3];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!tq;ILclient!je;I)V")
	public static void method2875(@OriginalArg(1) Class164 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class117 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class34 local14 = arg2.method2511(arg0);
		if (local14 == null) {
			return;
		}
		arg0.method5313(arg3, arg1, arg2.anInt3074 + arg3, arg1 + arg2.anInt3071);
		if (Static222.anInt4507 == 2 || Static222.anInt4507 == 5 || Static273.aClass51_13 == null) {
			arg0.method5312(local14, arg3, arg1);
			return;
		}
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(58) int local58;
		@Pc(52) int local52;
		if (Static323.anInt5463 == 4) {
			local48 = Static85.anInt1570;
			local50 = Static16.anInt287;
			local52 = 4096;
			local58 = (int) -Static386.aFloat82 & 0x3FFF;
		} else {
			local52 = 4096 - Static205.anInt3600 * 16;
			local58 = Static246.anInt4136 + (int) -Static386.aFloat82 & 0x3FFF;
			local50 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077;
			local48 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080;
		}
		@Pc(94) int local94 = local48 / 32 + 208 + 48 - Static92.anInt1675 * 2;
		@Pc(110) int local110 = Static262.anInt6340 * 4 + 48 - local50 / 32 - (Static262.anInt6340 + -104) * 2;
		Static273.aClass51_13.method4680((float) arg2.anInt3074 / 2.0F + (float) arg3, (float) arg1 + (float) arg2.anInt3071 / 2.0F, (float) local94, (float) local110, local52, local58 << 2, local14, arg3, arg1);
		@Pc(161) int local161;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(193) int local193;
		for (@Pc(144) Class1_Sub30 local144 = (Class1_Sub30) Static144.aClass17_27.method202(); local144 != null; local144 = (Class1_Sub30) Static144.aClass17_27.method207()) {
			@Pc(149) int local149 = local144.anInt3799;
			local161 = (Static208.aClass93_3.anIntArray275[local149] >> 14 & 0x3FFF) - Static256.anInt4410;
			local171 = (Static208.aClass93_3.anIntArray275[local149] & 0x3FFF) - Static293.anInt5053;
			local182 = local161 * 4 + 2 - local48 / 32;
			local193 = local171 * 4 + 2 - local50 / 32;
			Static40.method627(arg1, arg2, arg0, arg3, local182, local14, local193, Static208.aClass93_3.anIntArray276[local149]);
		}
		for (local161 = 0; local161 < Static247.anInt4143; local161++) {
			local171 = Static344.anIntArray646[local161] * 4 + 2 - local48 / 32;
			local182 = Static269.anIntArray136[local161] * 4 + 2 - local50 / 32;
			@Pc(249) Class236 local249 = Static54.aClass153_1.method3081(Static205.anIntArray436[local161]);
			if (local249.anIntArray706 != null) {
				local249 = local249.method5074(Static230.aClass72_3);
				if (local249 == null || local249.anInt5909 == -1) {
					continue;
				}
			}
			Static40.method627(arg1, arg2, arg0, arg3, local171, local14, local182, local249.anInt5909);
		}
		for (@Pc(285) Class1_Sub12 local285 = (Class1_Sub12) Static338.aClass77_34.method1359(); local285 != null; local285 = (Class1_Sub12) Static338.aClass77_34.method1360()) {
			local182 = (int) (local285.aLong207 >> 28 & 0x3L);
			if (Static224.anInt3825 == local182) {
				local193 = (int) (local285.aLong207 & 0x3FFFL) * 4 + 2 - local48 / 32;
				@Pc(332) int local332 = (int) (local285.aLong207 >> 14 & 0x3FFFL) * 4 + 2 - local50 / 32;
				Static159.method2374(arg2, local193, Static68.aClass51Array5[0], local14, arg1, arg3, local332);
			}
		}
		@Pc(406) int local406;
		for (local182 = 0; local182 < Static309.anInt5243; local182++) {
			@Pc(360) Class25_Sub1_Sub1_Sub2 local360 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local182]];
			if (local360 != null && local360.method1892() && Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 == local360.aByte70) {
				@Pc(378) Class59 local378 = local360.aClass59_1;
				if (local378 != null && local378.anIntArray186 != null) {
					local378 = local378.method1150(Static230.aClass72_3);
				}
				if (local378 != null && local378.aBoolean127 && local378.aBoolean125) {
					local406 = local360.anInt6080 / 32 - local48 / 32;
					@Pc(416) int local416 = local360.anInt6077 / 32 - local50 / 32;
					if (local378.anInt1421 == -1) {
						Static159.method2374(arg2, local406, Static68.aClass51Array5[1], local14, arg1, arg3, local416);
					} else {
						Static40.method627(arg1, arg2, arg0, arg3, local406, local14, local416, local378.anInt1421);
					}
				}
			}
		}
		local193 = Static331.anInt5548;
		@Pc(457) int[] local457 = Static345.anIntArray681;
		@Pc(495) int local495;
		@Pc(505) int local505;
		@Pc(509) int local509;
		for (local406 = 0; local406 < local193; local406++) {
			@Pc(467) Class25_Sub1_Sub1_Sub1 local467 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local457[local406]];
			if (local467 != null && local467.method466() && local467 != Static321.aClass25_Sub1_Sub1_Sub1_2 && local467.aByte70 == Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70) {
				local495 = local467.anInt6080 / 32 - local48 / 32;
				local505 = local467.anInt6077 / 32 - local50 / 32;
				@Pc(507) boolean local507 = false;
				for (local509 = 0; local509 < Static248.anInt4157; local509++) {
					if (local467.aString6.equals(Static175.aStringArray45[local509]) && Static234.anIntArray495[local509] != 0) {
						local507 = true;
						break;
					}
				}
				@Pc(539) boolean local539 = false;
				for (@Pc(541) int local541 = 0; local541 < Static4.anInt54; local541++) {
					if (local467.aString6.equals(Static178.aClass149Array1[local541].aString42)) {
						local539 = true;
						break;
					}
				}
				@Pc(565) boolean local565 = false;
				if (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt594 != 0 && local467.anInt594 != 0 && Static321.aClass25_Sub1_Sub1_Sub1_2.anInt594 == local467.anInt594) {
					local565 = true;
				}
				if (local507) {
					Static159.method2374(arg2, local495, Static68.aClass51Array5[3], local14, arg1, arg3, local505);
				} else if (local539) {
					Static159.method2374(arg2, local495, Static68.aClass51Array5[5], local14, arg1, arg3, local505);
				} else if (local565) {
					Static159.method2374(arg2, local495, Static68.aClass51Array5[4], local14, arg1, arg3, local505);
				} else {
					Static159.method2374(arg2, local495, Static68.aClass51Array5[2], local14, arg1, arg3, local505);
				}
			}
		}
		@Pc(640) Class11[] local640 = Static274.aClass11Array1;
		@Pc(733) int local733;
		for (local495 = 0; local495 < local640.length; local495++) {
			@Pc(648) Class11 local648 = local640[local495];
			if (local648 != null && local648.anInt167 != 0 && Static366.anInt5883 % 20 < 10) {
				@Pc(703) int local703;
				if (local648.anInt167 == 1 && local648.anInt172 >= 0 && local648.anInt172 < Static171.aClass25_Sub1_Sub1_Sub2Array1.length) {
					@Pc(681) Class25_Sub1_Sub1_Sub2 local681 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local648.anInt172];
					if (local681 != null) {
						local509 = local681.anInt6080 / 32 - local48 / 32;
						local703 = local681.anInt6077 / 32 - local50 / 32;
						Static29.method481(360000, local509, arg2, arg3, arg1, local14, local648.anInt173, local703);
					}
				}
				if (local648.anInt167 == 2) {
					local733 = (local648.anInt179 - Static256.anInt4410) * 4 + 2 - local48 / 32;
					local509 = (local648.anInt174 - Static293.anInt5053) * 4 + 2 - local50 / 32;
					local703 = local648.anInt169 * 4;
					local703 *= local703;
					Static29.method481(local703, local733, arg2, arg3, arg1, local14, local648.anInt173, local509);
				}
				if (local648.anInt167 == 10 && local648.anInt172 >= 0 && local648.anInt172 < Static225.aClass25_Sub1_Sub1_Sub1Array3.length) {
					@Pc(789) Class25_Sub1_Sub1_Sub1 local789 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local648.anInt172];
					if (local789 != null) {
						local509 = local789.anInt6080 / 32 - local48 / 32;
						local703 = local789.anInt6077 / 32 - local50 / 32;
						Static29.method481(360000, local509, arg2, arg3, arg1, local14, local648.anInt173, local703);
					}
				}
			}
		}
		if (Static323.anInt5463 == 4) {
			return;
		}
		if (Static190.anInt3337 != 0) {
			local505 = Static190.anInt3337 * 4 + Static321.aClass25_Sub1_Sub1_Sub1_2.method1877() * 2 + 2 - local48 / 32 - 2;
			local733 = Static76.anInt5658 * 4 + Static321.aClass25_Sub1_Sub1_Sub1_2.method1877() * 2 + 2 - local50 / 32 - 2;
			Static159.method2374(arg2, local505, Static182.aClass51Array12[Static46.aBoolean78 ? 1 : 0], local14, arg1, arg3, local733);
		}
		arg0.method5343(3, -1, arg1 + arg2.anInt3071 / 2 - 1, arg3 - -(arg2.anInt3074 / 2) + -1, 3);
		return;
	}
}
