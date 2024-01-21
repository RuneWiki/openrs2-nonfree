import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	public static int anInt3217;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!ag;")
	public static Class4 aClass4_77;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
	public static int[] anIntArray308 = new int[100];

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1068 = Static161.method2971("Loaded textures");

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1069 = aClass13_1068;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1070 = Static161.method2971("Lade Sprites )2 ");

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1071 = Static161.method2971("welle:");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ce;IBLclient!e;)V")
	public static void method2278(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(5) Class1_Sub9 local5 = new Class1_Sub9();
		local5.anInt1212 = arg0.method1607();
		local5.anInt1213 = arg0.method1626();
		local5.anIntArray129 = new int[local5.anInt1212];
		local5.aClass32Array2 = new Class32[local5.anInt1212];
		local5.aClass32Array1 = new Class32[local5.anInt1212];
		local5.anIntArray131 = new int[local5.anInt1212];
		local5.aByteArrayArrayArray21 = new byte[local5.anInt1212][][];
		local5.anIntArray130 = new int[local5.anInt1212];
		for (@Pc(56) int local56 = 0; local56 < local5.anInt1212; local56++) {
			try {
				@Pc(62) int local62 = arg0.method1607();
				@Pc(89) String local89;
				@Pc(98) String local98;
				@Pc(102) int local102;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local89 = new String(arg0.method1622().method882());
					local102 = 0;
					local98 = new String(arg0.method1622().method882());
					if (local62 == 1) {
						local102 = arg0.method1626();
					}
					local5.anIntArray129[local56] = local62;
					local5.anIntArray131[local56] = local102;
					local5.aClass32Array1[local56] = arg2.method985(Static1.method46(local89), local98);
				} else if (local62 == 3 || local62 == 4) {
					local89 = new String(arg0.method1622().method882());
					local98 = new String(arg0.method1622().method882());
					local102 = arg0.method1607();
					@Pc(105) String[] local105 = new String[local102];
					for (@Pc(107) int local107 = 0; local107 < local102; local107++) {
						local105[local107] = new String(arg0.method1622().method882());
					}
					@Pc(127) byte[][] local127 = new byte[local102][];
					@Pc(140) int local140;
					if (local62 == 3) {
						for (@Pc(134) int local134 = 0; local134 < local102; local134++) {
							local140 = arg0.method1626();
							local127[local134] = new byte[local140];
							arg0.method1641(local127[local134], local140);
						}
					}
					local5.anIntArray129[local56] = local62;
					@Pc(169) Class[] local169 = new Class[local102];
					for (local140 = 0; local140 < local102; local140++) {
						local169[local140] = Static1.method46(local105[local140]);
					}
					local5.aClass32Array2[local56] = arg2.method984(local169, local98, Static1.method46(local89));
					local5.aByteArrayArrayArray21[local56] = local127;
				}
			} catch (@Pc(258) ClassNotFoundException local258) {
				local5.anIntArray130[local56] = -1;
			} catch (@Pc(265) SecurityException local265) {
				local5.anIntArray130[local56] = -2;
			} catch (@Pc(272) NullPointerException local272) {
				local5.anIntArray130[local56] = -3;
			} catch (@Pc(279) Exception local279) {
				local5.anIntArray130[local56] = -4;
			} catch (@Pc(286) Throwable local286) {
				local5.anIntArray130[local56] = -5;
			}
		}
		Static153.aClass82_15.method2853(local5);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	public static void method2282() {
		for (@Pc(3) int local3 = 0; local3 < Static74.anInt2127; local3++) {
			@Pc(9) int local9 = Static66.anIntArray202[local3];
			@Pc(13) Class1_Sub2_Sub2_Sub2_Sub1 local13 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local9];
			if (local13 != null) {
				Static179.method2965(local13.aClass1_Sub2_Sub19_1.anInt3836, local13);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public static void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub10 local28 = Static170.aClass1_Sub10ArrayArrayArray35[local9][arg0][arg1] = Static170.aClass1_Sub10ArrayArrayArray35[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1537--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1544; local38++) {
					@Pc(44) Class59 local44 = local28.aClass59Array4[local38];
					if ((local44.aLong106 >> 29 & 0x3L) == 2L && local44.anInt3133 == arg0 && local44.anInt3130 == arg1) {
						local44.anInt3136--;
					}
				}
			}
		}
		if (Static170.aClass1_Sub10ArrayArrayArray35[0][arg0][arg1] == null) {
			Static170.aClass1_Sub10ArrayArrayArray35[0][arg0][arg1] = new Class1_Sub10(0, arg0, arg1);
		}
		Static170.aClass1_Sub10ArrayArrayArray35[0][arg0][arg1].aClass1_Sub10_1 = local7;
		Static170.aClass1_Sub10ArrayArrayArray35[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method2284() {
		anIntArray308 = null;
		aClass13_1069 = null;
		aClass13_1071 = null;
		aClass13_1070 = null;
		aClass4_77 = null;
		aClass13_1068 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ag;BLclient!ag;)V")
	public static void method2286(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		Static52.aClass4_47 = arg0;
		Static37.aClass4_38 = arg1;
	}
}
