import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "[I")
	public static final int[] anIntArray217 = new int[14];

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_25 = new Class91(200);

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_47 = new Class158("M", "M", "M", "M");

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_48 = new Class158(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLclient!za;)V")
	public static void method1493(@OriginalArg(1) Class106 arg0) {
		@Pc(5) int local5 = Static293.anInt4679;
		@Pc(7) int local7 = Static32.anInt891;
		@Pc(9) int local9 = Static232.anInt4578;
		@Pc(11) int local11 = Static316.anInt5908;
		arg0.method5941(local7, local9, local5, local11, -10660793);
		arg0.method5941(local7 + 1, local9 + -2, local5 + 1, 16, -16777216);
		arg0.method5916(local9 - 2, -16777216, local11 + -19, local7 + 18, local5 - -1);
		Static13.aClass20_2.method5340(-1, local5 + 3, local7 + 14, -10660793, Static192.aClass158_104.method3594(Static365.anInt6682));
		@Pc(70) int local70 = Static336.aClass87_1.method1919();
		@Pc(74) int local74 = Static336.aClass87_1.method1909();
		@Pc(76) int local76 = 0;
		for (@Pc(81) Class1_Sub35 local81 = (Class1_Sub35) Static401.aClass203_47.method4548(); local81 != null; local81 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			@Pc(98) int local98 = local7 + (Static126.anInt2794 + -1 - local76) * 16 + 31;
			@Pc(100) short local100 = -1;
			if (local70 > local5 && local5 + local9 > local70 && local74 > local98 - 13 && local74 < local98 + 3 && local81.aBoolean370) {
				local100 = -256;
			}
			@Pc(130) int[] local130 = null;
			if (Static57.method1071(local81.anInt5839)) {
				local130 = Static43.aClass57_1.method1414((int) local81.aLong166).anIntArray463;
			} else if (local81.anInt5843 != -1) {
				local130 = Static43.aClass57_1.method1414(local81.anInt5843).anIntArray463;
			} else if (Static370.method5159(local81.anInt5839)) {
				@Pc(154) Class1_Sub27 local154 = (Class1_Sub27) Static24.aClass38_3.method765((long) local81.aLong166);
				if (local154 != null) {
					@Pc(159) Class30_Sub1_Sub1_Sub1 local159 = local154.aClass30_Sub1_Sub1_Sub1_2;
					@Pc(162) Class11 local162 = local159.aClass11_1;
					if (local162.anIntArray12 != null) {
						local162 = local162.method136(Static366.aClass190_1);
					}
					if (local162 != null) {
						local130 = local162.anIntArray15;
					}
				}
			} else if (Static351.method4975(local81.anInt5839)) {
				@Pc(204) Class192 local204;
				if (local81.anInt5839 == 1011) {
					local204 = Static455.aClass161_4.method3628((int) local81.aLong166);
				} else {
					local204 = Static455.aClass161_4.method3628((int) (local81.aLong166 >>> 32 & 0x7FFFFFFFL));
				}
				if (local204.anIntArray532 != null) {
					local204 = local204.method4369(Static366.aClass190_1);
				}
				if (local204 != null) {
					local130 = local204.anIntArray535;
				}
			}
			@Pc(246) String local246 = Static60.method1126(local81);
			if (local130 != null) {
				local246 = local246 + Static445.method5849(local130);
			}
			Static13.aClass20_2.method5341(local100, Static154.aClass137Array6, local5 + 3, Static461.anIntArray726, local246, local98);
			if (local81.aBoolean371) {
				Static96.aClass137_3.method5708(Static394.aClass209_10.method4694(local246) + local5 + 5, local98 + -12);
			}
			local76++;
		}
		Static150.method2378(Static316.anInt5908, Static293.anInt4679, Static32.anInt891, Static232.anInt4578);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;CI)I")
	public static int method1497(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			if (arg1 == arg0.charAt(local18)) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V")
	public static void method1499() {
		@Pc(1) Class91 local1 = Static406.aClass91_61;
		synchronized (Static406.aClass91_61) {
			Static406.aClass91_61.method1999();
		}
		local1 = Static117.aClass91_39;
		synchronized (Static117.aClass91_39) {
			Static117.aClass91_39.method1999();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(CBI)C")
	public static char method1501(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BC)Z")
	public static boolean method1502(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "()V")
	public static void method1504() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static409.aClass252ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static409.aClass252ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static216.anInt4346; local6++) {
					for (local9 = 0; local9 < Static198.anInt7949; local9++) {
						if (Static409.aClass252ArrayArrayArray3[local3][local6][local9] != null) {
							Static409.aClass252ArrayArrayArray3[local3][local6][local9].method5680();
						}
						Static409.aClass252ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static409.aClass252ArrayArrayArray3 = null;
		Static262.aClass96Array3 = null;
		if (Static53.aClass252ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static53.aClass252ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static216.anInt4346; local6++) {
					for (local9 = 0; local9 < Static198.anInt7949; local9++) {
						if (Static53.aClass252ArrayArrayArray1[local3][local6][local9] != null) {
							Static53.aClass252ArrayArrayArray1[local3][local6][local9].method5680();
						}
						Static53.aClass252ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static53.aClass252ArrayArrayArray1 = null;
		Static221.aClass96Array4 = null;
		Static67.aClass252ArrayArrayArray2 = null;
		Static396.aClass96Array5 = null;
		Static156.anInt3364 = 0;
		if (Static160.aClass230Array1 != null) {
			for (local3 = 0; local3 < Static156.anInt3364; local3++) {
				Static160.aClass230Array1[local3] = null;
			}
		}
		if (Static268.aClass30_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static12.anInt184; local3++) {
				Static268.aClass30_Sub1Array3[local3] = null;
			}
			Static12.anInt184 = 0;
		}
		if (Static135.aClass75Array1 != null) {
			for (local3 = 0; local3 < Static315.anInt5904; local3++) {
				Static135.aClass75Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static220.anInt4418; local6++) {
				for (local9 = 0; local9 < Static216.anInt4346; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static198.anInt7949; local160++) {
						Static457.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static315.anInt5904 = 0;
		}
		Static220.anIntArrayArrayArray13 = null;
		Static82.method1510();
		Static43.aClass117_2.method2960();
		Static383.aByteArrayArray22 = null;
		Static360.anIntArrayArray52 = null;
		Static372.aShortArrayArray6 = null;
		Static47.aClass9_3 = null;
		Static272.aClass40_3 = null;
		Static227.aClass106_8 = null;
	}
}
