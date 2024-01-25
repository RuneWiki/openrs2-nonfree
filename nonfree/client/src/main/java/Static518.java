import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "[I")
	public static int[] anIntArray580;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
	public static int anInt8595;

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
	public static int anInt8602 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZ)V")
	public static void method7243(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static38.anInt777 != -1) {
				Static555.method7632(Static38.anInt777);
			}
			for (@Pc(18) Class2_Sub9 local18 = (Class2_Sub9) Static606.aClass118_47.method2596(); local18 != null; local18 = (Class2_Sub9) Static606.aClass118_47.method2597()) {
				if (!local18.method8652()) {
					local18 = (Class2_Sub9) Static606.aClass118_47.method2596();
					if (local18 == null) {
						break;
					}
				}
				Static588.method8013(local18, false, true);
			}
			Static38.anInt777 = -1;
			Static606.aClass118_47 = new Class118(8);
			Static289.method4012();
			Static38.anInt777 = Static261.anInt4094;
			Static311.method4222(false);
			Static32.method574();
			Static300.method4134(Static38.anInt777);
		}
		Static91.aString17 = "";
		Static34.aString8 = "";
		Static427.aBoolean500 = false;
		Static590.method8028();
		Static144.anInt2622 = -1;
		Static224.method3106(Static473.anInt7592);
		Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 = new Class13_Sub1_Sub1_Sub1_Sub2();
		Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 = Static228.anInt3704 * 512 / 2;
		Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] = Static228.anInt3704 / 2;
		Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 = Static162.anInt2911 * 512 / 2;
		Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0] = Static162.anInt2911 / 2;
		Static644.anInt10376 = 0;
		Static250.anInt4000 = 0;
		if (Static445.anInt7122 == 2) {
			Static644.anInt10376 = Static639.anInt10305 << 9;
			Static250.anInt4000 = Static2.anInt54 << 9;
		} else {
			Static573.method7859();
		}
		Static249.method3418();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZIILclient!ha;IIII)V")
	public static void method7245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) Interface25 local17 = (Interface25) Static166.method1427(arg6, arg4, arg1);
		@Pc(26) Class191 local26;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (local17 != null) {
			local26 = Static319.aClass141_4.method2971(local17.method8425());
			local32 = local17.method8420() & 0x3;
			local36 = local17.method8421();
			if (local26.anInt4793 == -1) {
				local42 = arg5;
				if (local26.anInt4828 > 0) {
					local42 = arg0;
				}
				if (local36 == 0 || local36 == 2) {
					if (local32 == 0) {
						arg3.method6965(arg2, local42, 4, arg7);
					} else if (local32 == 1) {
						arg3.method6990(arg7, local42, arg2, 4);
					} else if (local32 == 2) {
						arg3.method6965(arg2 + 3, local42, 4, arg7);
					} else if (local32 == 3) {
						arg3.method6990(arg7 + 3, local42, arg2, 4);
					}
				}
				if (local36 == 3) {
					if (local32 == 0) {
						arg3.method6936(1, 1, arg2, local42, arg7);
					} else if (local32 == 1) {
						arg3.method6936(1, 1, arg2 + 3, local42, arg7);
					} else if (local32 == 2) {
						arg3.method6936(1, 1, arg2 + 3, local42, arg7 + 3);
					} else if (local32 == 3) {
						arg3.method6936(1, 1, arg2, local42, arg7 + 3);
					}
				}
				if (local36 == 2) {
					if (local32 == 0) {
						arg3.method6990(arg7, local42, arg2, 4);
					} else if (local32 == 1) {
						arg3.method6965(arg2 + 3, local42, 4, arg7);
					} else if (local32 == 2) {
						arg3.method6990(arg7 + 3, local42, arg2, 4);
					} else if (local32 == 3) {
						arg3.method6965(arg2, local42, 4, arg7);
					}
				}
			} else {
				Static372.method5019(arg7, arg3, arg2, local26, local32);
			}
		}
		local17 = (Interface25) Static245.method3380(arg6, arg4, arg1, vea.class);
		if (local17 != null) {
			local26 = Static319.aClass141_4.method2971(local17.method8425());
			local32 = local17.method8420() & 0x3;
			local36 = local17.method8421();
			if (local26.anInt4793 != -1) {
				Static372.method5019(arg7, arg3, arg2, local26, local32);
			} else if (local36 == 9) {
				local42 = -1118482;
				if (local26.anInt4828 > 0) {
					local42 = -1179648;
				}
				if (local32 == 0 || local32 == 2) {
					arg3.method6955(arg7 + 3, arg7, arg2, arg2 + 3, local42);
				} else {
					arg3.method6955(arg7, arg7 + 3, arg2, arg2 + 3, local42);
				}
			}
		}
		local17 = (Interface25) Static629.method8438(arg6, arg4, arg1);
		if (local17 == null) {
			return;
		}
		local26 = Static319.aClass141_4.method2971(local17.method8425());
		local32 = local17.method8420() & 0x3;
		if (local26.anInt4793 != -1) {
			Static372.method5019(arg7, arg3, arg2, local26, local32);
			return;
		}
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(B)V")
	public static void method7246() {
		@Pc(12) Class171[] local12 = Class169.aClass171Array1;
		synchronized (Class169.aClass171Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class169.aClass171Array1.length; local16++) {
				Class169.aClass171Array1[local16] = new Class171();
				Static470.anIntArray544[local16] = 0;
			}
		}
	}
}
