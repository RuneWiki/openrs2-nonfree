import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
	public static int anInt4910;

	@OriginalMember(owner = "client!ms", name = "S", descriptor = "Lclient!kv;")
	public static Class41 aClass41_4;

	@OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
	public static int anInt4914 = -1;

	@OriginalMember(owner = "client!ms", name = "Q", descriptor = "I")
	public static int anInt4915 = -1;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(FFIFIFILclient!gl;FII[BII)V")
	public static void method4159(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(7) Class66 arg5, @OriginalArg(8) float arg6, @OriginalArg(11) byte[] arg7, @OriginalArg(13) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(60) int local60;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg2;
			arg5.method1830(0, arg4 * 127.0F, arg8, arg3 / (float) 128, local12, arg0 / (float) 16, arg6 / (float) 128);
			arg3 *= 2.0F;
			arg4 *= arg1;
			arg0 *= 2.0F;
			arg6 *= 2.0F;
			for (local60 = 0; local60 < 16384; local60++) {
				arg7[local18] = (byte) ((float) arg7[local18] + local12[local60]);
				local18++;
			}
		}
		local18 = arg2;
		for (local60 = 0; local60 < 16384; local60++) {
			arg7[local18] = (byte) (arg7[local18] + 127);
			local18++;
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(III)Z")
	public static boolean method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static292.anInt5387; local1++) {
			@Pc(6) Class113 local6 = Static170.aClass113Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3435 == 1) {
				local15 = local6.anInt3444 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3453 + (local6.anInt3447 * local15 >> 8);
					local37 = local6.anInt3445 + (local6.anInt3452 * local15 >> 8);
					local47 = local6.anInt3448 + (local6.anInt3440 * local15 >> 8);
					local57 = local6.anInt3438 + (local6.anInt3436 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3435 == 2) {
				local15 = arg0 - local6.anInt3444;
				if (local15 > 0) {
					local27 = local6.anInt3453 + (local6.anInt3447 * local15 >> 8);
					local37 = local6.anInt3445 + (local6.anInt3452 * local15 >> 8);
					local47 = local6.anInt3448 + (local6.anInt3440 * local15 >> 8);
					local57 = local6.anInt3438 + (local6.anInt3436 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3435 == 3) {
				local15 = local6.anInt3453 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3444 + (local6.anInt3449 * local15 >> 8);
					local37 = local6.anInt3437 + (local6.anInt3443 * local15 >> 8);
					local47 = local6.anInt3448 + (local6.anInt3440 * local15 >> 8);
					local57 = local6.anInt3438 + (local6.anInt3436 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3435 == 4) {
				local15 = arg2 - local6.anInt3453;
				if (local15 > 0) {
					local27 = local6.anInt3444 + (local6.anInt3449 * local15 >> 8);
					local37 = local6.anInt3437 + (local6.anInt3443 * local15 >> 8);
					local47 = local6.anInt3448 + (local6.anInt3440 * local15 >> 8);
					local57 = local6.anInt3438 + (local6.anInt3436 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3435 == 5) {
				local15 = arg1 - local6.anInt3448;
				if (local15 > 0) {
					local27 = local6.anInt3444 + (local6.anInt3449 * local15 >> 8);
					local37 = local6.anInt3437 + (local6.anInt3443 * local15 >> 8);
					local47 = local6.anInt3453 + (local6.anInt3447 * local15 >> 8);
					local57 = local6.anInt3445 + (local6.anInt3452 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "(I)[Lclient!qv;")
	public static Class214[] method4161() {
		return new Class214[] { Static3.aClass214_47, Static374.aClass214_203, Static365.aClass214_198, Static329.aClass214_183, Static132.aClass214_95, Static246.aClass214_150, Static198.aClass214_135, Static337.aClass214_185, Static340.aClass214_187, Static442.aClass214_227, Static215.aClass214_146, Static155.aClass214_110, Static418.aClass214_105, Static317.aClass214_176, Static285.aClass214_164, Static258.aClass214_132, Static159.aClass214_113, Static21.aClass214_20, Static80.aClass214_69, Static162.aClass214_65, Static216.aClass214_179, Static402.aClass214_213, Static149.aClass214_108, Static335.aClass214_184, Static61.aClass214_58, Static215.aClass214_147, Static233.aClass214_145, Static382.aClass214_136, Static283.aClass214_61, Static235.aClass214_148, Static266.aClass214_158, Static323.aClass214_83, Static86.aClass214_71, Static61.aClass214_59, Static257.aClass214_153, Static260.aClass214_156, Static345.aClass214_190, Static440.aClass214_225, Static246.aClass214_151, Static307.aClass214_222, Static17.aClass214_14, Static289.aClass214_165, Static15.aClass214_9, Static68.aClass214_62, Static339.aClass214_186, Static439.aClass214_224, Static173.aClass214_127, Static262.aClass214_157, Static114.aClass214_88, Static228.aClass214_144, Static35.aClass214_29, Static461.aClass214_173, Static88.aClass214_204, Static125.aClass214_91, Static326.aClass214_181, Static356.aClass214_193, Static259.aClass214_155, Static276.aClass214_162, Static145.aClass214_101, Static302.aClass214_174, Static441.aClass214_226, Static80.aClass214_70, Static307.aClass214_221, Static89.aClass214_73, Static184.aClass214_133, Static70.aClass214_66, Static459.aClass214_223, Static218.aClass214_140, Static302.aClass214_175, Static379.aClass214_205, Static295.aClass214_167, Static312.aClass214_206, Static210.aClass214_139, Static347.aClass214_191, Static461.aClass214_172, Static445.aClass214_228, Static404.aClass214_214, Static399.aClass214_212, Static390.aClass214_208, Static17.aClass214_15, Static224.aClass214_141, Static297.aClass214_168, Static319.aClass214_177, Static48.aClass214_40, Static430.aClass214_219, Static422.aClass214_218, Static392.aClass214_209, Static109.aClass214_85, Static274.aClass214_161, Static111.aClass214_87, Static294.aClass214_166, Static272.aClass214_159, Static46.aClass214_39, Static107.aClass214_84, Static72.aClass214_67, Static411.aClass214_202, Static9.aClass214_8, Static245.aClass214_149, Static247.aClass214_152, Static90.aClass214_192, Static323.aClass214_82, Static2.aClass214_1, Static165.aClass214_114, Static139.aClass214_96, Static39.aClass214_36, Static448.aClass214_229, Static369.aClass214_199, Static389.aClass214_207, Static409.aClass214_215, Static25.aClass214_24, Static20.aClass214_217, Static5.aClass214_7, Static328.aClass214_182, Static465.aClass214_230 };
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method4162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class4_Sub36 local7 = null;
		for (@Pc(12) Class4_Sub36 local12 = (Class4_Sub36) Static190.aClass91_25.method2584(); local12 != null; local12 = (Class4_Sub36) Static190.aClass91_25.method2586()) {
			if (local12.anInt6599 == arg0 && local12.anInt6592 == arg2 && local12.anInt6587 == arg1 && local12.anInt6598 == arg5) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub36();
			local7.anInt6599 = arg0;
			local7.anInt6598 = arg5;
			local7.anInt6587 = arg1;
			local7.anInt6592 = arg2;
			if (arg2 >= 0 && arg1 >= 0 && arg2 < Static193.anInt3853 && Static301.anInt5585 > arg1) {
				Static295.method4511(local7);
			}
			Static190.aClass91_25.method2587(local7);
		}
		local7.anInt6588 = arg4;
		local7.anInt6584 = -1;
		local7.anInt6597 = arg3;
		local7.anInt6594 = arg6;
		local7.anInt6596 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method4163(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static391.anInt6797 = 7;
		Static223.anInt4452 = 0x1 << Static391.anInt6797;
		Static423.anInt7318 = Static223.anInt4452 >> 1;
		Static196.anInt7580 = (int) Math.sqrt((double) (Static423.anInt7318 * Static423.anInt7318 + Static423.anInt7318 * Static423.anInt7318));
		Static302.anInt5614 = Static223.anInt4452 >> 2;
		Static155.anInt3204 = Static223.anInt4452;
		Static230.anInt4581 = arg0;
		Static268.anInt5106 = arg1;
		Static120.anInt2511 = arg2;
		Static338.aClass162ArrayArrayArray3 = new Class162[4][Static230.anInt4581][Static268.anInt5106];
		Static267.aClass14Array2 = new Class14[4];
		if (arg3) {
			Static383.anIntArrayArray47 = new int[Static230.anInt4581][Static268.anInt5106];
			Static410.aByteArrayArray20 = new byte[Static230.anInt4581][Static268.anInt5106];
			Static231.aShortArrayArray6 = new short[Static230.anInt4581][Static268.anInt5106];
			Static146.aClass162ArrayArrayArray1 = new Class162[1][Static230.anInt4581][Static268.anInt5106];
			Static77.aClass14Array1 = new Class14[1];
		} else {
			Static383.anIntArrayArray47 = null;
			Static410.aByteArrayArray20 = null;
			Static231.aShortArrayArray6 = null;
			Static146.aClass162ArrayArrayArray1 = null;
			Static77.aClass14Array1 = null;
		}
		if (arg4) {
			Static170.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			client.lb = new Class153[65535];
			Static141.aBooleanArray158 = new boolean[65535];
			Static398.anInt7036 = 0;
		} else {
			Static170.aLongArrayArrayArray1 = null;
			client.lb = null;
			Static141.aBooleanArray158 = null;
			Static398.anInt7036 = 0;
		}
		Static427.method5891(false);
		Static114.aClass113Array1 = new Class113[1000];
		Static20.anInt7227 = 0;
		Static170.aClass113Array2 = new Class113[1000];
		Static292.anInt5387 = 0;
		Static381.anIntArrayArrayArray11 = new int[4][Static230.anInt4581 + 1][Static268.anInt5106 + 1];
		Static95.aClass11_Sub5Array1 = new Class11_Sub5[5000];
		Static132.anInt2706 = 0;
		Static327.aBooleanArrayArray10 = new boolean[Static120.anInt2511 + Static120.anInt2511 + 1][Static120.anInt2511 + Static120.anInt2511 + 1];
		Static262.aBooleanArrayArray9 = new boolean[Static120.anInt2511 + Static120.anInt2511 + 2][Static120.anInt2511 + Static120.anInt2511 + 2];
		Static180.aClass32_1 = null;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(III)V")
	public static void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub3_1 != null) {
			local7.aClass11_Sub3_1 = null;
		}
		if (local7.aClass11_Sub3_2 != null) {
			local7.aClass11_Sub3_2 = null;
		}
	}
}
