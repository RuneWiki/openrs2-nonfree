import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1029 = Static193.method3027("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_58 = new Class10();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)Lclient!pf;")
	public static Class3_Sub3_Sub19 method1456(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub3_Sub19 local15 = (Class3_Sub3_Sub19) Static156.aClass85_32.method2558((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static107.aClass52_35.method1581(4, arg0);
		local15 = new Class3_Sub3_Sub19();
		if (local25 != null) {
			local15.method2201(arg0, new Class3_Sub4(local25));
		}
		Static156.aClass85_32.method2560(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
	public static void method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) (arg0 + (arg1 << 16));
		@Pc(16) Class3_Sub3_Sub3 local16 = (Class3_Sub3_Sub3) Static41.aClass40_3.method1029(local6);
		if (local16 != null) {
			Static11.aClass23_1.method677(local16);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!ce;Lclient!ja;)V")
	public static void method1458(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1, @OriginalArg(3) Class47 arg2) {
		@Pc(5) Class3_Sub25 local5 = new Class3_Sub25();
		local5.anInt3926 = arg1.method1278();
		local5.anInt3932 = arg1.method1245();
		local5.anIntArray332 = new int[local5.anInt3926];
		local5.aClass29Array1 = new Class29[local5.anInt3926];
		local5.aByteArrayArrayArray16 = new byte[local5.anInt3926][][];
		local5.anIntArray333 = new int[local5.anInt3926];
		local5.aClass29Array2 = new Class29[local5.anInt3926];
		local5.anIntArray334 = new int[local5.anInt3926];
		for (@Pc(51) int local51 = 0; local51 < local5.anInt3926; local51++) {
			try {
				@Pc(59) int local59 = arg1.method1278();
				@Pc(89) String local89;
				@Pc(98) String local98;
				@Pc(102) int local102;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local89 = new String(arg1.method1246().method2022());
					local98 = new String(arg1.method1246().method2022());
					local102 = 0;
					if (local59 == 1) {
						local102 = arg1.method1245();
					}
					local5.anIntArray332[local51] = local59;
					local5.anIntArray333[local51] = local102;
					local5.aClass29Array2[local51] = arg2.method1369(local98, Static59.method1601(local89));
				} else if (local59 == 3 || local59 == 4) {
					local89 = new String(arg1.method1246().method2022());
					local98 = new String(arg1.method1246().method2022());
					local102 = arg1.method1278();
					@Pc(105) String[] local105 = new String[local102];
					for (@Pc(107) int local107 = 0; local107 < local102; local107++) {
						local105[local107] = new String(arg1.method1246().method2022());
					}
					@Pc(131) byte[][] local131 = new byte[local102][];
					@Pc(144) int local144;
					if (local59 == 3) {
						for (@Pc(138) int local138 = 0; local138 < local102; local138++) {
							local144 = arg1.method1245();
							local131[local138] = new byte[local144];
							arg1.method1268(local131[local138], local144);
						}
					}
					local5.anIntArray332[local51] = local59;
					@Pc(175) Class[] local175 = new Class[local102];
					for (local144 = 0; local144 < local102; local144++) {
						local175[local144] = Static59.method1601(local105[local144]);
					}
					local5.aClass29Array1[local51] = arg2.method1366(local98, Static59.method1601(local89), local175);
					local5.aByteArrayArrayArray16[local51] = local131;
				}
			} catch (@Pc(264) ClassNotFoundException local264) {
				local5.anIntArray334[local51] = -1;
			} catch (@Pc(271) SecurityException local271) {
				local5.anIntArray334[local51] = -2;
			} catch (@Pc(278) NullPointerException local278) {
				local5.anIntArray334[local51] = -3;
			} catch (@Pc(285) Exception local285) {
				local5.anIntArray334[local51] = -4;
			} catch (@Pc(292) Throwable local292) {
				local5.anIntArray334[local51] = -5;
			}
		}
		Static17.aClass10_13.method261(local5);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!oc;I)V")
	public static void method1459(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class70 arg1) {
		@Pc(3) Class70 local3 = arg1.method2021();
		@Pc(6) short[] local6 = new short[16];
		@Pc(12) int local12 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static178.anInt3620; local19++) {
			@Pc(24) Class3_Sub3_Sub11 local24 = Static14.method275(local19);
			if ((!arg0 || local24.aBoolean73) && local24.anInt1261 == -1 && local24.anInt1262 == -1 && local24.aClass70_579.method2021().method2036(local3) != -1) {
				if (local12 >= 250) {
					Static109.aShortArray27 = null;
					Static5.anInt102 = -1;
					return;
				}
				if (local6.length <= local12) {
					@Pc(71) short[] local71 = new short[local6.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local12; local73++) {
						local71[local73] = local6[local73];
					}
					local6 = local71;
				}
				local6[local12++] = (short) local19;
			}
		}
		Static109.aShortArray27 = local6;
		Static71.anInt1412 = 0;
		Static5.anInt102 = local12;
		@Pc(105) Class70[] local105 = new Class70[Static5.anInt102];
		for (@Pc(107) int local107 = 0; local107 < Static5.anInt102; local107++) {
			local105[local107] = Static14.method275(local6[local107]).aClass70_579;
		}
		Static149.method2175(Static109.aShortArray27, local105);
	}
}
