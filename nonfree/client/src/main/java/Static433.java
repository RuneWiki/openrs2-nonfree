import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "Lclient!um;")
	public static Class244 aClass244_10;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "B")
	public static byte aByte103;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
	public static int anInt7200 = 0;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
	public static boolean aBoolean592 = false;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Lclient!eu;")
	public static Class72 method5429() {
		try {
			return (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BILclient!dh;Lclient!ji;)V")
	public static void method5432(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1, @OriginalArg(3) Class124 arg2) {
		@Pc(9) Class1_Sub12 local9 = new Class1_Sub12();
		local9.anInt1360 = arg1.method4463();
		local9.anInt1359 = arg1.method4487();
		local9.anIntArray61 = new int[local9.anInt1360];
		local9.aClass215Array2 = new Class215[local9.anInt1360];
		local9.anIntArray63 = new int[local9.anInt1360];
		local9.aClass215Array1 = new Class215[local9.anInt1360];
		local9.aByteArrayArrayArray1 = new byte[local9.anInt1360][][];
		local9.anIntArray62 = new int[local9.anInt1360];
		for (@Pc(57) int local57 = 0; local57 < local9.anInt1360; local57++) {
			try {
				@Pc(63) int local63 = arg1.method4463();
				@Pc(86) String local86;
				@Pc(90) String local90;
				@Pc(94) int local94;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local86 = arg1.method4484();
					local90 = arg1.method4484();
					local94 = 0;
					if (local63 == 1) {
						local94 = arg1.method4487();
					}
					local9.anIntArray61[local57] = local63;
					local9.anIntArray62[local57] = local94;
					local9.aClass215Array2[local57] = arg2.method2519(local90, Static100.method1443(local86));
				} else if (local63 == 3 || local63 == 4) {
					local86 = arg1.method4484();
					local90 = arg1.method4484();
					local94 = arg1.method4463();
					@Pc(97) String[] local97 = new String[local94];
					for (@Pc(99) int local99 = 0; local99 < local94; local99++) {
						local97[local99] = arg1.method4484();
					}
					@Pc(120) byte[][] local120 = new byte[local94][];
					@Pc(133) int local133;
					if (local63 == 3) {
						for (@Pc(125) int local125 = 0; local125 < local94; local125++) {
							local133 = arg1.method4487();
							local120[local125] = new byte[local133];
							arg1.method4471(local120[local125], local133);
						}
					}
					local9.anIntArray61[local57] = local63;
					@Pc(158) Class[] local158 = new Class[local94];
					for (local133 = 0; local133 < local94; local133++) {
						local158[local133] = Static100.method1443(local97[local133]);
					}
					local9.aClass215Array1[local57] = arg2.method2504(Static100.method1443(local86), local90, local158);
					local9.aByteArrayArrayArray1[local57] = local120;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local9.anIntArray63[local57] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local9.anIntArray63[local57] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local9.anIntArray63[local57] = -3;
			} catch (@Pc(258) Exception local258) {
				local9.anIntArray63[local57] = -4;
			} catch (@Pc(265) Throwable local265) {
				local9.anIntArray63[local57] = -5;
			}
		}
		Static131.aClass254_13.method5430(local9);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!sc;)V")
	public static void method5434(@OriginalArg(1) Class13_Sub6 arg0) {
		arg0.aClass20_Sub3_Sub3_1 = null;
		if (Static105.anInt1827 < 20) {
			Static250.aClass227_2.method4832(arg0);
			Static105.anInt1827++;
		}
	}
}
