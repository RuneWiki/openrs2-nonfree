import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!fha", name = "u", descriptor = "Lclient!ik;")
	public static Class182 aClass182_46;

	@OriginalMember(owner = "client!fha", name = "w", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_51 = new Class397(127, 9);

	@OriginalMember(owner = "client!fha", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "(B)V")
	public static void method2821() {
		for (@Pc(7) int local7 = 0; local7 < Static86.anInt2031; local7++) {
			Static179.aClass108Array5[local7] = null;
		}
		Static86.anInt2031 = 0;
		@Pc(41) int local41;
		@Pc(45) int local45;
		for (@Pc(35) int local35 = 0; local35 < Static169.anInt2992; local35++) {
			for (local41 = 0; local41 < Static128.anInt2531; local41++) {
				for (local45 = 0; local45 < Static448.anInt6835; local45++) {
					@Pc(55) Class364 local55 = Static448.aClass364ArrayArrayArray2[local35][local45][local41];
					if (local55 != null) {
						if (local55.aShort101 > 0) {
							local55.aShort101 = (short) (local55.aShort101 * -1);
						}
						if (local55.aShort102 > 0) {
							local55.aShort102 = (short) (local55.aShort102 * -1);
						}
					}
				}
			}
		}
		for (local41 = 0; local41 < Static169.anInt2992; local41++) {
			for (local45 = 0; local45 < Static128.anInt2531; local45++) {
				for (@Pc(119) int local119 = 0; local119 < Static448.anInt6835; local119++) {
					@Pc(129) Class364 local129 = Static448.aClass364ArrayArrayArray2[local41][local119][local45];
					if (local129 != null) {
						@Pc(155) boolean local155 = Static448.aClass364ArrayArrayArray2[0][local119][local45] != null && Static448.aClass364ArrayArrayArray2[0][local119][local45].aClass364_1 != null;
						@Pc(163) int local163;
						@Pc(165) int local165;
						@Pc(179) Class364 local179;
						@Pc(187) int local187;
						@Pc(376) int local376;
						@Pc(391) int local391;
						@Pc(398) int local398;
						@Pc(415) int local415;
						@Pc(422) int local422;
						@Pc(426) int local426;
						@Pc(430) int local430;
						@Pc(436) int local436;
						@Pc(476) int local476;
						@Pc(480) int local480;
						if (local129.aShort101 < 0) {
							local163 = local45;
							local165 = local45;
							local179 = Static448.aClass364ArrayArrayArray2[local41][local119][local45 - 1];
							local187 = Static43.aClass259Array1[local41].method9295(local45, local119);
							while (local163 > 0 && local179 != null && local179.aShort101 < 0 && local129.aShort101 == local179.aShort101 && local179.aShort100 == local129.aShort100 && local187 == Static43.aClass259Array1[local41].method9295(local163 - 1, local119) && (local163 - 1 <= 0 || Static43.aClass259Array1[local41].method9295(local163 - 2, local119) == local187)) {
								local163--;
								local179 = Static448.aClass364ArrayArrayArray2[local41][local119][local163 - 1];
							}
							for (local179 = Static448.aClass364ArrayArrayArray2[local41][local119][local45 + 1]; local165 < Static448.anInt6835 && local179 != null && local179.aShort101 < 0 && local129.aShort101 == local179.aShort101 && local179.aShort100 == local129.aShort100 && local187 == Static43.aClass259Array1[local41].method9295(local165 + 1, local119) && (local165 + 1 >= Static448.anInt6835 || local187 == Static43.aClass259Array1[local41].method9295(local165 + 2, local119)); local179 = Static448.aClass364ArrayArrayArray2[local41][local119][local165 + 1]) {
								local165++;
							}
							local376 = local41 + 1 - local41;
							local391 = Static43.aClass259Array1[local155 ? local41 + 1 : local41].method9295(local163, local119);
							local398 = local376 * local129.aShort101 + local391;
							local415 = Static43.aClass259Array1[local155 ? local41 + 1 : local41].method9295(local165 + 1, local119);
							local422 = local376 * local129.aShort101 + local415;
							local426 = local119 << Static626.anInt9669;
							local430 = local163 << Static626.anInt9669;
							local436 = (local165 << Static626.anInt9669) + Static308.anInt4969;
							Static179.aClass108Array5[Static86.anInt2031++] = new Class108(1, local41, local129.aShort100 + local426, local426 - -local129.aShort100, local426 + local129.aShort100, local129.aShort100 + local426, local391, local415, local422, local398, local430, local436, local436, local430);
							for (local476 = local41; local476 <= local41; local476++) {
								for (local480 = local163; local480 <= local165; local480++) {
									Static448.aClass364ArrayArrayArray2[local476][local119][local480].aShort101 = (short) (Static448.aClass364ArrayArrayArray2[local476][local119][local480].aShort101 * -1);
								}
							}
						}
						if (local129.aShort102 < 0) {
							local163 = local119;
							local165 = local119;
							local179 = Static448.aClass364ArrayArrayArray2[local41][local119 - 1][local45];
							local187 = Static43.aClass259Array1[local41].method9295(local45, local119);
							while (local163 > 0 && local179 != null && local179.aShort102 < 0 && local179.aShort102 == local129.aShort102 && local179.aShort103 == local129.aShort103 && Static43.aClass259Array1[local41].method9295(local45, local163 - 1) == local187 && (local163 - 1 <= 0 || Static43.aClass259Array1[local41].method9295(local45, local163 - 2) == local187)) {
								local163--;
								local179 = Static448.aClass364ArrayArrayArray2[local41][local163 - 1][local45];
							}
							for (local179 = Static448.aClass364ArrayArrayArray2[local41][local119 + 1][local45]; Static128.anInt2531 > local165 && local179 != null && local179.aShort102 < 0 && local179.aShort102 == local129.aShort102 && local129.aShort103 == local179.aShort103 && Static43.aClass259Array1[local41].method9295(local45, local165 + 1) == local187 && (Static128.anInt2531 <= local165 + 1 || Static43.aClass259Array1[local41].method9295(local45, local165 + 2) == local187); local179 = Static448.aClass364ArrayArrayArray2[local41][local165 + 1][local45]) {
								local165++;
							}
							local376 = local41 + 1 - local41;
							local391 = Static43.aClass259Array1[local155 ? local41 + 1 : local41].method9295(local45, local163);
							local398 = local391 + local129.aShort102 * local376;
							local415 = Static43.aClass259Array1[local155 ? local41 + 1 : local41].method9295(local45, local165 + 1);
							local422 = local129.aShort102 * local376 + local415;
							local426 = local163 << Static626.anInt9669;
							local430 = (local165 << Static626.anInt9669) + Static308.anInt4969;
							local436 = local45 << Static626.anInt9669;
							Static179.aClass108Array5[Static86.anInt2031++] = new Class108(2, local41, local426, local430, local430, local426, local391, local415, local422, local398, local129.aShort103 + local436, local436 + local129.aShort103, local129.aShort103 + local436, local436 - -local129.aShort103);
							for (local476 = local41; local476 <= local41; local476++) {
								for (local480 = local163; local480 <= local165; local480++) {
									Static448.aClass364ArrayArrayArray2[local476][local480][local45].aShort102 = (short) (Static448.aClass364ArrayArrayArray2[local476][local480][local45].aShort102 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static298.aBoolean294 = true;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZLclient!ik;)V")
	public static void method2822(@OriginalArg(1) Class182 arg0) {
		Static488.aClass182_98 = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IZI)V")
	public static void method2823(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) Class3_Sub38 local15 = Static14.method503(arg1, arg0);
		if (local15 != null) {
			local15.method9596();
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILclient!nt;I)I")
	public static int method2824(@OriginalArg(0) int arg0, @OriginalArg(1) Class270 arg1) {
		if (!Static85.method1871(arg1).method6628(arg0) && arg1.anObjectArray30 == null) {
			return -1;
		} else if (arg1.anIntArray513 == null || arg1.anIntArray513.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray513[arg0];
		}
	}
}
