import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	public static int anInt4937;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean415 = true;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[Lclient!pe;")
	public static Class135[] aClass135Array1 = new Class135[29];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method3968() {
		for (@Pc(7) int local7 = 0; local7 < Static151.anInt3191; local7++) {
			@Pc(14) int local14 = Static219.anIntArray378[local7]--;
			if (Static219.anIntArray378[local7] >= -10) {
				@Pc(94) Class30 local94 = Static73.aClass30Array1[local7];
				if (local94 == null) {
					local94 = Static304.method647(Static115.aClass84_50, Static23.anIntArray36[local7], 0);
					if (local94 == null) {
						continue;
					}
					Static219.anIntArray378[local7] += local94.method648();
					Static73.aClass30Array1[local7] = local94;
				}
				if (Static219.anIntArray378[local7] < 0) {
					@Pc(219) int local219;
					if (Static63.anIntArray106[local7] == 0) {
						local219 = Static214.anInt4468 * Static156.anIntArray488[local7] >> 8;
					} else {
						@Pc(135) int local135 = (Static63.anIntArray106[local7] & 0xFF) * 128;
						@Pc(143) int local143 = Static63.anIntArray106[local7] >> 16 & 0xFF;
						@Pc(152) int local152 = local143 * 128 + 64 - Static111.aClass36_Sub3_Sub2_1.anInt5093;
						@Pc(160) int local160 = Static63.anIntArray106[local7] >> 8 & 0xFF;
						@Pc(170) int local170 = local160 * 128 + 64 - Static111.aClass36_Sub3_Sub2_1.anInt5109;
						if (local152 < 0) {
							local152 = -local152;
						}
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(191) int local191 = local152 + local170 - 128;
						if (local191 > local135) {
							Static219.anIntArray378[local7] = -100;
							continue;
						}
						if (local191 < 0) {
							local191 = 0;
						}
						local219 = Static156.anIntArray488[local7] * (local135 - local191) * Static144.anInt3122 / local135 >> 8;
					}
					if (local219 > 0) {
						@Pc(240) Class2_Sub9_Sub1 local240 = local94.method646().method1941(Static171.aClass9_1);
						@Pc(245) Class2_Sub5_Sub2 local245 = Static306.method1795(local240, local219);
						local245.method1794(Static184.anIntArray311[local7] - 1);
						Static43.aClass2_Sub5_Sub1_1.method403(local245);
					}
					Static219.anIntArray378[local7] = -100;
				}
			} else {
				Static151.anInt3191--;
				for (@Pc(29) int local29 = local7; local29 < Static151.anInt3191; local29++) {
					Static23.anIntArray36[local29] = Static23.anIntArray36[local29 + 1];
					Static73.aClass30Array1[local29] = Static73.aClass30Array1[local29 + 1];
					Static184.anIntArray311[local29] = Static184.anIntArray311[local29 + 1];
					Static219.anIntArray378[local29] = Static219.anIntArray378[local29 + 1];
					Static63.anIntArray106[local29] = Static63.anIntArray106[local29 + 1];
					Static156.anIntArray488[local29] = Static156.anIntArray488[local29 + 1];
				}
				local7--;
			}
		}
		if (Static145.aBoolean257 && !Static270.method4505()) {
			if (Static91.anInt2030 != 0 && Static149.anInt3177 != -1) {
				Static173.method2976(Static152.aClass84_61, Static91.anInt2030, Static149.anInt3177);
			}
			Static145.aBoolean257 = false;
		} else if (Static91.anInt2030 != 0 && Static149.anInt3177 != -1 && !Static270.method4505()) {
			Static95.aClass2_Sub26_Sub1_1.method4287(61);
			Static95.aClass2_Sub26_Sub1_1.method4260(Static149.anInt3177);
			Static149.anInt3177 = -1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)V")
	public static void method3969(@OriginalArg(1) long arg0) {
		@Pc(9) int local9 = Static52.anInt1206 + Static111.aClass36_Sub3_Sub2_1.anInt5093;
		if (!Static236.aBoolean408) {
			Static198.aFloat41 += Static188.aFloat39 * (float) arg0 / 40.0F;
			Static142.aFloat31 += Static21.aFloat3 * (float) arg0 / 40.0F;
		}
		@Pc(39) int local39 = Static111.aClass36_Sub3_Sub2_1.anInt5109 + Static247.anInt4921;
		if (Static280.anInt5827 - local9 < -500 || Static280.anInt5827 - local9 > 500 || Static247.anInt4924 - local39 < -500 || Static247.anInt4924 - local39 > 500) {
			Static280.anInt5827 = local9;
			Static247.anInt4924 = local39;
		}
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (local9 != Static280.anInt5827) {
			local79 = local9 - Static280.anInt5827;
			local87 = (int) ((long) local79 * arg0 / 320L);
			if (local79 <= 0) {
				if (local87 == 0) {
					local87 = -1;
				} else if (local87 < local79) {
					local87 = local79;
				}
			} else if (local87 == 0) {
				local87 = 1;
			} else if (local79 < local87) {
				local87 = local79;
			}
			Static280.anInt5827 += local87;
		}
		if (Static247.anInt4924 != local39) {
			local79 = local39 - Static247.anInt4924;
			local87 = (int) (arg0 * (long) local79 / 320L);
			if (local79 <= 0) {
				if (local87 == 0) {
					local87 = -1;
				} else if (local79 > local87) {
					local87 = local79;
				}
			} else if (local87 == 0) {
				local87 = 1;
			} else if (local87 > local79) {
				local87 = local79;
			}
			Static247.anInt4924 += local87;
		}
		Static189.method3194();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method3971() {
		Static70.aClass46_7.method1079();
		Static116.aClass46_18.method1079();
	}
}
