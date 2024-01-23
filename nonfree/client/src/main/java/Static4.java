import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public static int anInt60 = 50;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
	public static int[] anIntArray2 = new int[anInt60];

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString1 = "Please remove ";

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1 = new String[anInt60];

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
	public static int[] anIntArray3 = new int[anInt60];

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
	public static int[] anIntArray4 = new int[anInt60];

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "[I")
	public static int[] anIntArray5 = new int[anInt60];

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
	public static int[] anIntArray6 = new int[14];

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
	public static int[] anIntArray7 = new int[anInt60];

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
	public static int[] anIntArray8 = new int[anInt60];

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "[I")
	public static int[] anIntArray9 = new int[anInt60];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!nf;ILclient!sb;)V")
	public static void method47(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		@Pc(5) Class1_Sub30 local5 = new Class1_Sub30();
		local5.anInt5643 = arg2.method2595();
		local5.anInt5642 = arg2.method2647();
		local5.aClass10Array2 = new Class10[local5.anInt5643];
		local5.anIntArray516 = new int[local5.anInt5643];
		local5.aByteArrayArrayArray20 = new byte[local5.anInt5643][][];
		local5.anIntArray517 = new int[local5.anInt5643];
		local5.anIntArray518 = new int[local5.anInt5643];
		local5.aClass10Array1 = new Class10[local5.anInt5643];
		for (@Pc(53) int local53 = 0; local53 < local5.anInt5643; local53++) {
			try {
				@Pc(61) int local61 = arg2.method2595();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local78 = arg2.method2605();
					local82 = arg2.method2605();
					local84 = 0;
					if (local61 == 1) {
						local84 = arg2.method2647();
					}
					local5.anIntArray518[local53] = local61;
					local5.anIntArray516[local53] = local84;
					local5.aClass10Array1[local53] = arg1.method3011(local82, Static298.method4462(local78));
				} else if (local61 == 3 || local61 == 4) {
					local78 = arg2.method2605();
					local82 = arg2.method2605();
					local84 = arg2.method2595();
					@Pc(143) String[] local143 = new String[local84];
					for (@Pc(145) int local145 = 0; local145 < local84; local145++) {
						local143[local145] = arg2.method2605();
					}
					@Pc(160) byte[][] local160 = new byte[local84][];
					@Pc(176) int local176;
					if (local61 == 3) {
						for (@Pc(165) int local165 = 0; local165 < local84; local165++) {
							local176 = arg2.method2647();
							local160[local165] = new byte[local176];
							arg2.method2585(local176, local160[local165]);
						}
					}
					local5.anIntArray518[local53] = local61;
					@Pc(200) Class[] local200 = new Class[local84];
					for (local176 = 0; local176 < local84; local176++) {
						local200[local176] = Static298.method4462(local143[local176]);
					}
					local5.aClass10Array2[local53] = arg1.method2988(Static298.method4462(local78), local200, local82);
					local5.aByteArrayArrayArray20[local53] = local160;
				}
			} catch (@Pc(239) ClassNotFoundException local239) {
				local5.anIntArray517[local53] = -1;
			} catch (@Pc(246) SecurityException local246) {
				local5.anIntArray517[local53] = -2;
			} catch (@Pc(253) NullPointerException local253) {
				local5.anIntArray517[local53] = -3;
			} catch (@Pc(260) Exception local260) {
				local5.anIntArray517[local53] = -4;
			} catch (@Pc(267) Throwable local267) {
				local5.anIntArray517[local53] = -5;
			}
		}
		Static274.aClass24_27.method473(local5);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
	public static boolean method50(@OriginalArg(0) int arg0) {
		if (Static9.anInt3022 == arg0) {
			return false;
		}
		Static254.anIntArrayArray38 = new int[104][104];
		Static173.anIntArrayArray23 = new int[104][104];
		Static204.anIntArrayArray29 = new int[104][104];
		Static268.anIntArrayArrayArray19 = new int[4][13][13];
		Static101.anIntArrayArray10 = new int[104][104];
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			Static56.aClass122Array1[local45] = new Class122(104, 104);
		}
		Static94.aByteArrayArrayArray9 = new byte[4][104][104];
		Static68.aClass24ArrayArrayArray1 = new Class24[4][104][104];
		Static172.aByteArrayArrayArray2 = new byte[4][104][104];
		if (Static291.aBoolean404) {
			Static294.method4353();
			Static174.method2905();
			Static20.aClass135ArrayArray1 = new Class135[13][13];
		}
		Static9.anInt3022 = arg0;
		return true;
	}
}
