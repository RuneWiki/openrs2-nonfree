import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!cg;")
	public static Class22 aClass22_90;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt5102;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public static int anInt5103;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "[J")
	public static long[] aLongArray9 = new long[200];

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!ul;")
	public static Class172 aClass172_43 = new Class172(64);

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method4056() {
		for (@Pc(11) int local11 = 0; local11 < Static291.anInt5649; local11++) {
			@Pc(22) int local22 = Static148.anIntArray237[local11];
			@Pc(26) Class13_Sub5_Sub2 local26 = Static260.aClass13_Sub5_Sub2Array114[local22];
			@Pc(30) int local30 = Static256.aClass4_Sub24_Sub1_3.method3110();
			if ((local30 & 0x8) != 0) {
				local30 += Static256.aClass4_Sub24_Sub1_3.method3110() << 8;
			}
			if ((local30 & 0x80) != 0) {
				local26.aString178 = Static256.aClass4_Sub24_Sub1_3.method3111();
				local26.anInt5253 = 100;
			}
			if ((local30 & 0x200) != 0) {
				local26.anInt5299 = Static256.aClass4_Sub24_Sub1_3.method3096();
				local26.anInt5320 = Static256.aClass4_Sub24_Sub1_3.method3085();
			}
			@Pc(81) int local81;
			if ((local30 & 0x100) != 0) {
				local81 = Static256.aClass4_Sub24_Sub1_3.method3101();
				@Pc(84) int[] local84 = new int[local81];
				@Pc(87) int[] local87 = new int[local81];
				@Pc(90) int[] local90 = new int[local81];
				for (@Pc(92) int local92 = 0; local92 < local81; local92++) {
					@Pc(99) int local99 = Static256.aClass4_Sub24_Sub1_3.method3085();
					if (local99 == 65535) {
						local99 = -1;
					}
					local90[local92] = local99;
					local87[local92] = Static256.aClass4_Sub24_Sub1_3.method3110();
					local84[local92] = Static256.aClass4_Sub24_Sub1_3.method3074();
				}
				Static188.method4643(local90, local84, local87, local26);
			}
			@Pc(143) int local143;
			if ((local30 & 0x4) != 0) {
				local81 = Static256.aClass4_Sub24_Sub1_3.method3074();
				local143 = Static256.aClass4_Sub24_Sub1_3.method3101();
				if (local81 == 65535) {
					local81 = -1;
				}
				Static213.method3350(local26, local143, local81);
			}
			if ((local30 & 0x10) != 0) {
				local81 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local143 = Static256.aClass4_Sub24_Sub1_3.method3109();
				local26.method4209(local143, local81, Static50.anInt1118);
				local26.anInt5292 = Static50.anInt1118 + 300;
				local26.anInt5289 = Static256.aClass4_Sub24_Sub1_3.method3109();
			}
			if ((local30 & 0x2) != 0) {
				local81 = Static256.aClass4_Sub24_Sub1_3.method3094();
				local143 = Static256.aClass4_Sub24_Sub1_3.method3110();
				local26.method4209(local143, local81, Static50.anInt1118);
			}
			if ((local30 & 0x40) != 0) {
				local81 = Static256.aClass4_Sub24_Sub1_3.method3074();
				if (local81 == 65535) {
					local81 = -1;
				}
				@Pc(227) boolean local227 = true;
				local143 = Static256.aClass4_Sub24_Sub1_3.method3121();
				if (local81 != -1 && local26.anInt5291 != -1 && Static51.method992(Static32.method639(local81).anInt3877).anInt5807 < Static51.method992(Static32.method639(local26.anInt5291).anInt3877).anInt5807) {
					local227 = false;
				}
				if (local227) {
					local26.anInt5325 = Static50.anInt1118 + (local143 & 0xFFFF);
					local26.anInt5279 = 0;
					if (Static50.anInt1118 < local26.anInt5325) {
						local26.anInt5279 = -1;
					}
					local26.anInt5304 = local143 >> 16;
					local26.anInt5280 = 1;
					local26.anInt5291 = local81;
					local26.anInt5281 = 0;
					if (local26.anInt5291 != -1 && local26.anInt5325 == Static50.anInt1118) {
						@Pc(309) int local309 = Static32.method639(local26.anInt5291).anInt3877;
						if (local309 != -1) {
							@Pc(317) Class186 local317 = Static51.method992(local309);
							if (local317 != null && local317.anIntArray469 != null) {
								Static229.method3598(false, local26.anInt5294, local317, local26.anInt5334, 0);
							}
						}
					}
				}
			}
			if ((local30 & 0x20) != 0) {
				local26.anInt5256 = Static256.aClass4_Sub24_Sub1_3.method3108();
				if (local26.anInt5256 == 65535) {
					local26.anInt5256 = -1;
				}
			}
			if ((local30 & 0x1) != 0) {
				if (local26.aClass185_1.method4663()) {
					Static65.method4576(local26);
				}
				local26.method4230(Static22.method458(Static256.aClass4_Sub24_Sub1_3.method3085()));
				local26.method4217(local26.aClass185_1.anInt5803);
				local26.anInt5290 = local26.aClass185_1.anInt5788;
				local26.anInt5275 = local26.aClass185_1.anInt5790;
				if (local26.aClass185_1.method4663()) {
					Static276.method4340(local26.anIntArray411[0], local26.anIntArray418[0], 0, null, Static222.anInt4467, local26, null);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Lclient!dl;")
	public static Class35 method4059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class35 local14 = local7.aClass35_1;
			local7.aClass35_1 = null;
			return local14;
		}
	}
}
