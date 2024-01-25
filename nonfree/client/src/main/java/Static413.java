import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Lclient!tn;")
	public static Class229 aClass229_13;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!ib;")
	public static final Class116 aClass116_3 = new Class116(128);

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public static final int anInt7253 = 0;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_135 = new Class254(57, 4);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!tn;)V")
	public static void method5597(@OriginalArg(1) Class229 arg0) {
		if (!Static217.aBoolean311) {
			return;
		}
		if (arg0.anObjectArray30 != null) {
			@Pc(18) Class229 local18 = Static99.method1611(Static380.anInt6831, Static224.anInt3903);
			if (local18 != null) {
				@Pc(24) Class1_Sub16 local24 = new Class1_Sub16();
				local24.anObjectArray1 = arg0.anObjectArray30;
				local24.aClass229_3 = local18;
				local24.aClass229_4 = arg0;
				Static354.method5070(local24);
			}
		}
		Static224.method3272(Static190.aClass254_77);
		Static201.aClass1_Sub14_Sub2_2.method4522(arg0.anInt6923);
		Static201.aClass1_Sub14_Sub2_2.method4505(Static380.anInt6831);
		Static201.aClass1_Sub14_Sub2_2.method4495(Static281.anInt4710);
		Static201.aClass1_Sub14_Sub2_2.method4549(Static224.anInt3903);
		Static201.aClass1_Sub14_Sub2_2.method4495(arg0.anInt6860);
		Static201.aClass1_Sub14_Sub2_2.method4505(arg0.anInt6918);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!hh;Lclient!hh;I)V")
	public static void method5598(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1) {
		Static401.aClass109_89 = arg0;
		Static210.aClass109_55 = arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public static void method5599() {
		if (Static95.anInt1875 == -1 || Static306.anInt5194 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static435.anInt6024 - Static291.anInt7742) * Static345.anInt6315 >> 16) + Static291.anInt7742;
		Static345.anInt6315 += local24;
		if (Static345.anInt6315 >= 65535) {
			if (Static132.aBoolean194) {
				Static35.aBoolean53 = false;
			} else {
				Static35.aBoolean53 = true;
			}
			Static345.anInt6315 = 65535;
			Static132.aBoolean194 = true;
		} else {
			Static132.aBoolean194 = false;
			Static35.aBoolean53 = false;
		}
		@Pc(54) float local54 = (float) Static345.anInt6315 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static152.anInt2738 * 2;
		@Pc(87) int local87;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(158) int local158;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static50.anIntArrayArrayArray21[Static95.anInt1875][local61][local63] * 3;
			local87 = Static50.anIntArrayArrayArray21[Static95.anInt1875][local61 + 1][local63] * 3;
			local120 = (Static50.anIntArrayArrayArray21[Static95.anInt1875][local61 + 2][local63] + Static50.anIntArrayArrayArray21[Static95.anInt1875][local61 + 2][local63] - Static50.anIntArrayArrayArray21[Static95.anInt1875][local61 + 3][local63]) * 3;
			local128 = Static50.anIntArrayArrayArray21[Static95.anInt1875][local61][local63];
			local133 = local87 - local75;
			local141 = local120 + local75 - local87 * 2;
			local158 = local87 + Static50.anIntArrayArrayArray21[Static95.anInt1875][local61 + 2][local63] - local128 - local120;
			local57[local63] = (float) local128 + (local54 * ((float) local141 + (float) local158 * local54) + (float) local133) * local54;
		}
		Static264.anInt4481 = (int) local57[1] * -1;
		Static302.anInt5030 = (int) local57[0] - Static190.anInt3507 * 128;
		Static4.anInt149 = (int) local57[2] - Static331.anInt6034 * 128;
		@Pc(212) float[] local212 = new float[3];
		local87 = Static27.anInt456 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static50.anIntArrayArrayArray21[Static306.anInt5194][local87][local120] * 3;
			local133 = Static50.anIntArrayArrayArray21[Static306.anInt5194][local87 + 1][local120] * 3;
			local141 = (Static50.anIntArrayArrayArray21[Static306.anInt5194][local87 + 2][local120] + Static50.anIntArrayArrayArray21[Static306.anInt5194][local87 + 2][local120] - Static50.anIntArrayArrayArray21[Static306.anInt5194][local87 + 3][local120]) * 3;
			local158 = Static50.anIntArrayArrayArray21[Static306.anInt5194][local87][local120];
			@Pc(287) int local287 = local133 - local128;
			@Pc(296) int local296 = local128 + local141 - local133 * 2;
			@Pc(314) int local314 = local133 + Static50.anIntArrayArrayArray21[Static306.anInt5194][local87 + 2][local120] - local141 - local158;
			local212[local120] = ((float) local287 + ((float) local314 * local54 + (float) local296) * local54) * local54 + (float) local158;
		}
		@Pc(348) float local348 = local212[0] - local57[0];
		@Pc(359) float local359 = -1.0F * (local212[1] - local57[1]);
		@Pc(367) float local367 = local212[2] - local57[2];
		@Pc(377) double local377 = Math.sqrt((double) (local367 * local367 + local348 * local348));
		Static401.anInt7130 = (int) (Math.atan2((double) local359, local377) * 2607.5945876176133D) & 0x3FFF;
		Static432.anInt7548 = (int) (-Math.atan2((double) local348, (double) local367) * 2607.5945876176133D) & 0x3FFF;
		Static423.anInt7380 = Static50.anIntArrayArrayArray21[Static95.anInt1875][local61][3] + (Static345.anInt6315 * (Static50.anIntArrayArrayArray21[Static95.anInt1875][local61 + 2][3] - Static50.anIntArrayArrayArray21[Static95.anInt1875][local61][3]) >> 16);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIBLjava/lang/String;)Z")
	public static boolean method5600(@OriginalArg(3) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(46) char local46 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local46 == '-') {
					local28 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(94) int local94;
			if (local46 >= '0' && local46 <= '9') {
				local94 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local94 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local94 = local46 - 'W';
			} else {
				return false;
			}
			if (local94 >= 10) {
				return false;
			}
			if (local28) {
				local94 = -local94;
			}
			@Pc(123) int local123 = local32 * 10 + local94;
			if (local123 / 10 != local32) {
				return false;
			}
			local30 = true;
			local32 = local123;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILclient!tn;)Z")
	public static boolean method5602(@OriginalArg(1) Class229 arg0) {
		if (Static342.anInt6240 == arg0.anInt6893) {
			Static114.anInt2193 = 250;
			return true;
		} else {
			return false;
		}
	}
}
