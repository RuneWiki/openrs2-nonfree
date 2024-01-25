import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_124 = new Class184(0, -2);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method2969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) char[] local6 = new char[arg0];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(27) int local27 = arg2[arg1 + local10] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(41) char local41 = Static203.aCharArray7[local27 - 128];
					if (local41 == '\u0000') {
						local41 = '?';
					}
					local27 = local41;
				}
				local6[local8++] = (char) local27;
			}
		}
		return new String(local6, 0, local8);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IC)C")
	public static char method2971(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method2975() {
		for (@Pc(1) int local1 = 0; local1 < Static205.anInt4113; local1++) {
			@Pc(6) Class83 local6 = Static192.aClass83Array1[local1];
			@Pc(8) boolean local8 = false;
			@Pc(121) int local121;
			if (local6.aClass3_Sub5_Sub3_1 == null) {
				local6.anInt2722--;
				if (local6.anInt2722 >= (local6.aByte39 == 2 ? -1500 : -10)) {
					if (local6.aByte39 == 1 && local6.aClass136_1 == null) {
						local6.aClass136_1 = Static458.method3436(Static95.aClass56_23, local6.anInt2723, 0);
						if (local6.aClass136_1 == null) {
							continue;
						}
						local6.anInt2722 += local6.aClass136_1.method3435();
					} else if (local6.aByte39 == 2 && (local6.aClass3_Sub6_1 == null || local6.aClass3_Sub13_Sub1_1 == null)) {
						if (local6.aClass3_Sub6_1 == null) {
							local6.aClass3_Sub6_1 = Static23.method650(Static405.aClass56_84, local6.anInt2723);
						}
						if (local6.aClass3_Sub6_1 == null) {
							continue;
						}
						if (local6.aClass3_Sub13_Sub1_1 == null) {
							local6.aClass3_Sub13_Sub1_1 = local6.aClass3_Sub6_1.method651(new int[] { 22050 });
							if (local6.aClass3_Sub13_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local6.anInt2722 < 0) {
						if (local6.anInt2718 == 0) {
							local121 = Static123.aClass21_Sub1_1.anInt868 * local6.anInt2719 >> 8;
						} else {
							@Pc(129) int local129 = local6.anInt2718 >> 24 & 0x3;
							if (local129 == Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77) {
								@Pc(147) int local147 = (local6.anInt2718 & 0xFF) << 7;
								@Pc(154) int local154 = local6.anInt2718 >> 16 & 0xFF;
								@Pc(163) int local163 = (local154 << 7) + 64 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053;
								if (local163 < 0) {
									local163 = -local163;
								}
								@Pc(178) int local178 = local6.anInt2718 >> 8 & 0xFF;
								@Pc(188) int local188 = (local178 << 7) + 64 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055;
								if (local188 < 0) {
									local188 = -local188;
								}
								@Pc(199) int local199 = local163 + local188 - 128;
								if (local147 < local199) {
									local6.anInt2722 = -99999;
									continue;
								}
								if (local199 < 0) {
									local199 = 0;
								}
								local121 = local6.anInt2719 * Static123.aClass21_Sub1_1.anInt863 * (local147 - local199) / local147 >> 8;
							} else {
								local121 = 0;
							}
						}
						if (local121 > 0) {
							@Pc(236) Class3_Sub13_Sub1 local236 = null;
							if (local6.aByte39 == 1) {
								local236 = local6.aClass136_1.method3437().method1496(Static19.aClass199_1);
							} else if (local6.aByte39 == 2) {
								local236 = local6.aClass3_Sub13_Sub1_1;
							}
							@Pc(266) Class3_Sub5_Sub3 local266 = local6.aClass3_Sub5_Sub3_1 = Static461.method4330(local236, local121);
							local266.method4360(local6.anInt2721 - 1);
							Static251.aClass3_Sub5_Sub4_1.method5197(local266);
						}
					}
				} else {
					local8 = true;
				}
			} else if (!local6.aClass3_Sub5_Sub3_1.method5985()) {
				local8 = true;
			}
			if (local8) {
				Static205.anInt4113--;
				for (local121 = local1; local121 < Static205.anInt4113; local121++) {
					Static192.aClass83Array1[local121] = Static192.aClass83Array1[local121 + 1];
				}
				local1--;
			}
		}
		if (Static358.aBoolean419 && !Static78.method1395()) {
			if (Static123.aClass21_Sub1_1.anInt871 != 0 && Static257.anInt4778 != -1) {
				Static60.method1187(Static123.aClass21_Sub1_1.anInt871, Static160.aClass56_39, Static257.anInt4778);
			}
			Static358.aBoolean419 = false;
		} else if (Static123.aClass21_Sub1_1.anInt871 != 0 && Static257.anInt4778 != -1 && !Static78.method1395()) {
			Static414.method5552(Static304.aClass92_184);
			Static302.aClass3_Sub2_Sub2_2.method6008(Static257.anInt4778);
			Static257.anInt4778 = -1;
		}
	}
}
