import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_222 = new Class81(102, -1);

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_165 = new Class319(78, 16);

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "Lclient!jb;")
	public static final Class165 aClass165_6 = new Class165();

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Lclient!rb;")
	public static final Class276 aClass276_4 = new Class276("LIVE", 0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method7641() {
		if (Static137.aBoolean197) {
			return;
		}
		Static196.method5897(Static373.aClass293ArrayArrayArray25);
		if (Static80.aClass293ArrayArrayArray35 != null) {
			Static196.method5897(Static80.aClass293ArrayArrayArray35);
		}
		Static137.aBoolean197 = true;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public static void method7642() {
		@Pc(12) Class1_Sub48 local12 = Static320.method4867(Static442.aClass170_2, Static13.aClass319_6);
		local12.aClass1_Sub20_Sub1_2.method4378(Static19.method541());
		local12.aClass1_Sub20_Sub1_2.method4381(Static443.anInt7718);
		local12.aClass1_Sub20_Sub1_2.method4381(Static300.anInt5516);
		local12.aClass1_Sub20_Sub1_2.method4378(Static479.aClass1_Sub7_Sub1_1.anInt3105);
		Static34.method813(local12);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!oea;)V")
	public static void method7643(@OriginalArg(0) Class237 arg0) {
		if (Static64.anInt1565 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub5 local6 = arg0.aClass1_Sub5_1;
		Static502.aClass237Array1[Static64.anInt1565] = arg0;
		Static503.aBooleanArray26[Static64.anInt1565] = false;
		Static64.anInt1565++;
		@Pc(21) int local21 = arg0.anInt6651;
		if (arg0.aBoolean475) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6651;
		if (arg0.aBoolean474) {
			local29 = Static101.anInt2104 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4158() + Static159.anInt2896 - local6.method4162() >> Static378.anInt6665;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4158() + local6.method4162() - Static159.anInt2896 >> Static378.anInt6665;
			if (local73 >= Static218.anInt4229) {
				local73 = Static218.anInt4229 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray78[local41++];
				@Pc(105) int local105 = (local6.method4159() + Static159.anInt2896 - local6.method4162() >> Static378.anInt6665) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static446.anInt7725) {
					local113 = Static446.anInt7725 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static579.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static579.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static64.anInt1565;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static579.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static64.anInt1565 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static579.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static64.anInt1565 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static579.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static64.anInt1565 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public static boolean method7644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!rc;Z)Z")
	public static boolean method7645(@OriginalArg(0) Class20_Sub2_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static20.aClass17Array1 == Static499.aClass17Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7202();
		if (arg0.aShort100 < 0 || arg0.aShort97 < 0 || arg0.aShort98 >= Static446.anInt7725 || arg0.aShort99 >= Static218.anInt4229) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort100; local36 <= arg0.aShort98; local36++) {
			for (local40 = arg0.aShort97; local40 <= arg0.aShort99; local40++) {
				@Pc(47) Class293 local47 = Static528.method7221(arg0.aByte116, local36, local40);
				if (local47 != null) {
					@Pc(53) Class285 local53 = Static328.method4969(arg0);
					@Pc(56) Class285 local56 = local47.aClass285_6;
					if (local56 == null) {
						local47.aClass285_6 = local53;
					} else {
						while (local56.aClass285_5 != null) {
							local56 = local56.aClass285_5;
						}
						local56.aClass285_5 = local53;
					}
					if (local6 && (Static105.anIntArrayArray12[local36][local40] & 0xFF000000) != 0) {
						local8 = Static105.anIntArrayArray12[local36][local40];
						local10 = Static395.aShortArrayArray8[local36][local40];
						local12 = Static208.aByteArrayArray27[local36][local40];
					}
					if (!arg1 && local47.aClass20_Sub2_Sub3_1 != null && local47.aClass20_Sub2_Sub3_1.aShort76 > local33) {
						local33 = local47.aClass20_Sub2_Sub3_1.aShort76;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort100; local40 <= arg0.aShort98; local40++) {
				for (@Pc(136) int local136 = arg0.aShort97; local136 <= arg0.aShort99; local136++) {
					if ((Static105.anIntArrayArray12[local40][local136] & 0xFF000000) == 0) {
						Static105.anIntArrayArray12[local40][local136] = local8;
						Static395.aShortArrayArray8[local40][local136] = local10;
						Static208.aByteArrayArray27[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static316.aClass20_Sub2_Sub4Array1[Static428.anInt4959++] = arg0;
		} else {
			local40 = Static20.aClass17Array1 == Static499.aClass17Array3 ? 1 : 0;
			if (!arg0.method7249()) {
				Static379.aClass20_Sub2ArrayArray2[local40][Static431.anIntArray499[local40]++] = arg0;
			} else if (arg0.method7256()) {
				Static386.aClass20_Sub2ArrayArray3[local40][Static288.anIntArray327[local40]++] = arg0;
			} else {
				Static166.aClass20_Sub2ArrayArray1[local40][Static464.anIntArray526[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt8790 -= local33;
		}
		return true;
	}
}
