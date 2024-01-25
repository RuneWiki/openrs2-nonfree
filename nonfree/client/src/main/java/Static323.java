import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!um", name = "i", descriptor = "Lclient!me;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString232;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!mk;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "Lclient!l;")
	public static Class57 aClass57_22;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_56 = new Class198(5);

	@OriginalMember(owner = "client!um", name = "g", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
	public static void method5290() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static177.aClass45ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static177.aClass45ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static103.anInt2156; local6++) {
					for (local9 = 0; local9 < Static116.anInt2499; local9++) {
						if (Static177.aClass45ArrayArrayArray1[local3][local6][local9] != null) {
							Static177.aClass45ArrayArrayArray1[local3][local6][local9].method1006();
						}
						Static177.aClass45ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static177.aClass45ArrayArrayArray1 = null;
		Static355.aClass22Array3 = null;
		if (Static321.aClass45ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static321.aClass45ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static103.anInt2156; local6++) {
					for (local9 = 0; local9 < Static116.anInt2499; local9++) {
						if (Static321.aClass45ArrayArrayArray3[local3][local6][local9] != null) {
							Static321.aClass45ArrayArrayArray3[local3][local6][local9].method1006();
						}
						Static321.aClass45ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static321.aClass45ArrayArrayArray3 = null;
		Static182.aClass22Array2 = null;
		Static256.aClass45ArrayArrayArray2 = null;
		Static69.aClass22Array1 = null;
		Static243.anInt4826 = 0;
		if (Static32.aClass158Array1 != null) {
			for (local3 = 0; local3 < Static243.anInt4826; local3++) {
				Static32.aClass158Array1[local3] = null;
			}
		}
		if (Static287.aClass5_Sub4Array3 != null) {
			for (local3 = 0; local3 < Static45.anInt928; local3++) {
				Static287.aClass5_Sub4Array3[local3] = null;
			}
			Static45.anInt928 = 0;
		}
		if (Static13.aClass3_Sub13_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static321.anInt6217; local3++) {
				Static13.aClass3_Sub13_Sub1Array3[local3] = null;
			}
			for (local6 = 0; local6 < Static131.anInt2754; local6++) {
				for (local9 = 0; local9 < Static103.anInt2156; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static116.anInt2499; local160++) {
						Static145.anIntArrayArrayArray4[local6][local9][local160] = 0;
					}
				}
			}
			Static321.anInt6217 = 0;
		}
		Static285.anIntArrayArrayArray11 = null;
		Static294.method5391();
		Static35.aClass65_5.method1456();
		Static71.aClass103_3 = null;
		Static245.anIntArrayArray46 = null;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public static void method5291() {
		@Pc(12) Class39 local12 = null;
		try {
			@Pc(16) Class207 local16 = Static353.aClass42_5.method971();
			while (local16.anInt6346 == 0) {
				Static134.method2241(1L);
			}
			if (local16.anInt6346 == 1) {
				local12 = (Class39) local16.anObject7;
				@Pc(43) Class3_Sub4 local43 = new Class3_Sub4(Static109.anInt2315 * 6 + 3);
				local43.method3614(1);
				local43.method3660(Static109.anInt2315);
				for (@Pc(53) int local53 = 0; local53 < Static347.anIntArray563.length; local53++) {
					if (Static213.aBooleanArray22[local53]) {
						local43.method3660(local53);
						local43.method3650(Static347.anIntArray563[local53]);
					}
				}
				local12.method902(local43.anInt4268, 0, local43.aByteArray70);
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local12 != null) {
				local12.method903();
			}
		} catch (@Pc(95) Exception local95) {
		}
		Static328.aLong195 = Static53.method898();
		Static63.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!qc;B)V")
	public static void method5292(@OriginalArg(0) Class5_Sub4_Sub4_Sub2 arg0) {
		for (@Pc(10) Class3_Sub12 local10 = (Class3_Sub12) Static102.aClass127_7.method3402(); local10 != null; local10 = (Class3_Sub12) Static102.aClass127_7.method3400()) {
			if (local10.aClass5_Sub4_Sub4_Sub2_1 == arg0) {
				if (local10.aClass3_Sub2_Sub3_2 != null) {
					Static273.aClass3_Sub2_Sub2_2.method1367(local10.aClass3_Sub2_Sub3_2);
					local10.aClass3_Sub2_Sub3_2 = null;
				}
				local10.method5717();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nb;III)V")
	public static void method5293(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static145.anIntArrayArrayArray4[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt63 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass3_Sub13_Sub1Array2[arg0.anInt63++] = Static13.aClass3_Sub13_Sub1Array3[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt63; local19 < 4; local19++) {
			arg0.aClass3_Sub13_Sub1Array2[local19] = null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)I")
	public static int method5294(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5295(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static277.anInt5542; local11++) {
			if (arg0.equalsIgnoreCase(Static350.aStringArray43[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static223.aStringArray25[local11])) {
				return true;
			}
		}
		return false;
	}
}
