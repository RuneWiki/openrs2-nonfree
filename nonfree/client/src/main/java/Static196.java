import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "Lclient!iea;")
	public static Class31 aClass31_9;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_62 = new Class145(70, 12);

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
	public static int anInt3909 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIILclient!vl;B)V")
	public static void method3384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16_Sub1_Sub1_Sub3 arg3) {
		@Pc(7) Class291 local7 = arg3.method7007();
		@Pc(22) int local22 = arg3.anInt8080 - arg3.aClass111_7.anInt3149 & 0x3FFF;
		if (arg2 == -1) {
			if (local22 != 0 || arg3.anInt8068 > 25) {
				if (arg0 < 0 && local7.anInt7622 != -1) {
					arg3.anInt8095 = local7.anInt7622;
					arg3.aBoolean588 = false;
				} else if (arg0 <= 0 || local7.anInt7609 == -1) {
					arg3.anInt8095 = local7.anInt7614;
				} else {
					arg3.anInt8095 = local7.anInt7609;
				}
				arg3.aBoolean588 = false;
			} else if (!arg3.aBoolean588 || !local7.method6685(arg3.anInt8095)) {
				arg3.anInt8095 = local7.method6682();
				arg3.aBoolean588 = arg3.anInt8095 != -1;
			}
		} else if (arg3.anInt8100 != -1 && (local22 >= 10240 || local22 <= 2048)) {
			@Pc(50) int local50 = Static143.anIntArray193[arg1] - arg3.aClass111_7.anInt3149 & 0x3FFF;
			arg3.aBoolean588 = false;
			if (arg2 == 2 && local7.anInt7640 != -1) {
				if (local50 > 2048 && local50 <= 6144 && local7.anInt7626 != -1) {
					arg3.anInt8095 = local7.anInt7626;
				} else if (local50 >= 10240 && local50 < 14336 && local7.anInt7625 != -1) {
					arg3.anInt8095 = local7.anInt7625;
				} else if (local50 <= 6144 || local50 >= 10240 || local7.anInt7641 == -1) {
					arg3.anInt8095 = local7.anInt7640;
				} else {
					arg3.anInt8095 = local7.anInt7641;
				}
			} else if (arg2 == 0 && local7.anInt7633 != -1) {
				if (local50 > 2048 && local50 <= 6144 && local7.anInt7610 != -1) {
					arg3.anInt8095 = local7.anInt7610;
				} else if (local50 >= 10240 && local50 < 14336 && local7.anInt7635 != -1) {
					arg3.anInt8095 = local7.anInt7635;
				} else if (local50 <= 6144 || local50 >= 10240 || local7.anInt7617 == -1) {
					arg3.anInt8095 = local7.anInt7633;
				} else {
					arg3.anInt8095 = local7.anInt7617;
				}
			} else if (local50 > 2048 && local50 <= 6144 && local7.anInt7605 != -1) {
				arg3.anInt8095 = local7.anInt7605;
			} else if (local50 >= 10240 && local50 < 14336 && local7.anInt7639 != -1) {
				arg3.anInt8095 = local7.anInt7639;
			} else if (local50 <= 6144 || local50 >= 10240 || local7.anInt7637 == -1) {
				arg3.anInt8095 = local7.anInt7614;
			} else {
				arg3.anInt8095 = local7.anInt7637;
			}
		} else if (local22 == 0 && arg3.anInt8068 <= 25) {
			if (arg2 == 2 && local7.anInt7640 != -1) {
				arg3.anInt8095 = local7.anInt7640;
			} else if (arg2 == 0 && local7.anInt7633 != -1) {
				arg3.anInt8095 = local7.anInt7633;
			} else {
				arg3.anInt8095 = local7.anInt7614;
			}
			arg3.aBoolean588 = false;
		} else {
			arg3.aBoolean588 = false;
			if (arg2 == 2 && local7.anInt7640 != -1) {
				if (arg0 < 0 && local7.anInt7615 != -1) {
					arg3.anInt8095 = local7.anInt7615;
				} else if (arg0 <= 0 || local7.anInt7624 == -1) {
					arg3.anInt8095 = local7.anInt7640;
				} else {
					arg3.anInt8095 = local7.anInt7624;
				}
			} else if (arg2 == 0 && local7.anInt7633 != -1) {
				if (arg0 < 0 && local7.anInt7647 != -1) {
					arg3.anInt8095 = local7.anInt7647;
				} else if (arg0 <= 0 || local7.anInt7644 == -1) {
					arg3.anInt8095 = local7.anInt7633;
				} else {
					arg3.anInt8095 = local7.anInt7644;
				}
			} else if (arg0 < 0 && local7.anInt7608 != -1) {
				arg3.anInt8095 = local7.anInt7608;
			} else if (arg0 <= 0 || local7.anInt7636 == -1) {
				arg3.anInt8095 = local7.anInt7614;
			} else {
				arg3.anInt8095 = local7.anInt7636;
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLclient!rl;I)V")
	public static void method3385(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16_Sub1_Sub1_Sub3_Sub2 arg1) {
		if (Static633.anInt10265 >= 400) {
			return;
		}
		if (arg1 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1) {
			@Pc(89) String local89;
			@Pc(123) int local123;
			if (arg1.anInt8149 == 0) {
				@Pc(100) boolean local100 = true;
				if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8150 != -1 && arg1.anInt8150 != -1) {
					local123 = arg1.anInt8150 <= Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8150 ? arg1.anInt8150 : Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8150;
					@Pc(130) int local130 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8144 - arg1.anInt8144;
					if (local130 < 0) {
						local130 = -local130;
					}
					if (local130 > local123) {
						local100 = false;
					}
				}
				@Pc(160) String local160 = Static112.aClass17_3 == Static51.aClass17_2 ? Static573.aClass345_32.method7951(Static496.anInt7407) : Static573.aClass345_30.method7951(Static496.anInt7407);
				if (arg1.anInt8165 > arg1.anInt8144) {
					local89 = arg1.method7015() + (local100 ? Static482.method6816(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8144, arg1.anInt8144) : "<col=ffffff>") + " (" + local160 + arg1.anInt8144 + "+" + (arg1.anInt8165 - arg1.anInt8144) + ")";
				} else {
					local89 = arg1.method7015() + (local100 ? Static482.method6816(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8144, arg1.anInt8144) : "<col=ffffff>") + " (" + local160 + arg1.anInt8144 + ")";
				}
			} else if (arg1.anInt8149 == -1) {
				local89 = arg1.method7015();
			} else {
				local89 = arg1.method7015() + " (" + Static573.aClass345_31.method7951(Static496.anInt7407) + arg1.anInt8149 + ")";
			}
			if (Static557.aBoolean660 && !arg0 && (Static613.anInt10082 & 0x8) != 0) {
				Static244.method4145((long) arg1.anInt8075, (long) arg1.anInt8075, false, true, Static80.aString17 + " -> <col=ffffff>" + local89, -1, Static237.anInt4365, 22, 0, Static184.aString32, false, 0);
			}
			if (arg0) {
				Static244.method4145(0L, (long) arg1.anInt8075, true, false, "", 0, -1, -1, 0, "<col=cccccc>" + local89, false, 0);
			} else {
				for (local123 = 7; local123 >= 0; local123--) {
					if (Static288.aStringArray30[local123] != null) {
						@Pc(302) short local302 = 0;
						if (Static51.aClass17_2 == Static579.aClass17_5 && Static288.aStringArray30[local123].equalsIgnoreCase(Static573.aClass345_25.method7951(Static496.anInt7407))) {
							if (arg1.anInt8144 > Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8144) {
								local302 = 2000;
							}
							if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8163 != 0 && arg1.anInt8163 != 0) {
								if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8163 == arg1.anInt8163) {
									local302 = 2000;
								} else {
									local302 = 0;
								}
							}
						} else if (Static393.aBooleanArray17[local123]) {
							local302 = 2000;
						}
						@Pc(357) short local357 = (short) (local302 + Static458.aShortArray57[local123]);
						@Pc(368) int local368 = Static236.anIntArray282[local123] == -1 ? Static565.anInt9269 : Static236.anIntArray282[local123];
						Static244.method4145((long) arg1.anInt8075, (long) arg1.anInt8075, false, true, "<col=ffffff>" + local89, -1, local368, local357, 0, Static288.aStringArray30[local123], false, 0);
					}
				}
			}
			if (!arg0) {
				for (@Pc(435) Class2_Sub7_Sub21 local435 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local435 != null; local435 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
					if (local435.anInt10014 == 13) {
						local435.aString108 = "<col=ffffff>" + local89;
						return;
					}
				}
			}
		} else if (Static557.aBoolean660 && (Static613.anInt10082 & 0x10) != 0) {
			Static244.method4145(0L, (long) arg1.anInt8075, false, true, Static80.aString17 + " -> <col=ffffff>" + Static573.aClass345_39.method7951(Static496.anInt7407), -1, Static237.anInt4365, 20, 0, Static184.aString32, false, 0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	public static void method3386() {
		if (Static230.anInt4239 <= 0) {
			Static143.aString27 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static97.aStringArray10.length; local11++) {
			if (Static97.aStringArray10[local11].indexOf("--> ") != -1) {
				local9++;
				if (Static230.anInt4239 == local9) {
					Static143.aString27 = Static97.aStringArray10[local11].substring(Static97.aStringArray10[local11].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ii;Z)Z")
	public static boolean method3387(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static511.aClass91Array3 == Static332.aClass91Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6992();
		if (arg0.aShort103 < 0 || arg0.aShort106 < 0 || arg0.aShort104 >= Static595.anInt9881 || arg0.aShort105 >= Static389.anInt6693) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort103; local36 <= arg0.aShort104; local36++) {
			for (local40 = arg0.aShort106; local40 <= arg0.aShort105; local40++) {
				@Pc(47) Class84 local47 = Static111.method2006(arg0.aByte109, local36, local40);
				if (local47 != null) {
					@Pc(53) Class333 local53 = Static22.method572(arg0);
					@Pc(56) Class333 local56 = local47.aClass333_1;
					if (local56 == null) {
						local47.aClass333_1 = local53;
					} else {
						while (local56.aClass333_3 != null) {
							local56 = local56.aClass333_3;
						}
						local56.aClass333_3 = local53;
					}
					if (local6 && (Static356.anIntArrayArray72[local36][local40] & 0xFF000000) != 0) {
						local8 = Static356.anIntArrayArray72[local36][local40];
						local10 = Static348.aShortArrayArray5[local36][local40];
						local12 = Static216.aByteArrayArray9[local36][local40];
					}
					if (!arg1 && local47.aClass16_Sub1_Sub3_1 != null && local47.aClass16_Sub1_Sub3_1.aShort72 > local33) {
						local33 = local47.aClass16_Sub1_Sub3_1.aShort72;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort103; local40 <= arg0.aShort104; local40++) {
				for (@Pc(136) int local136 = arg0.aShort106; local136 <= arg0.aShort105; local136++) {
					if ((Static356.anIntArrayArray72[local40][local136] & 0xFF000000) == 0) {
						Static356.anIntArrayArray72[local40][local136] = local8;
						Static348.aShortArrayArray5[local40][local136] = local10;
						Static216.aByteArrayArray9[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static489.aClass16_Sub1_Sub1Array5[Static184.anInt3672++] = arg0;
		} else {
			local40 = Static511.aClass91Array3 == Static332.aClass91Array2 ? 1 : 0;
			if (!arg0.method6990()) {
				arg0.aClass16_Sub1_23 = Static518.aClass16_Sub1Array4[local40];
				Static518.aClass16_Sub1Array4[local40] = arg0;
			} else if (arg0.method6974()) {
				arg0.aClass16_Sub1_23 = Static451.aClass16_Sub1Array3[local40];
				Static451.aClass16_Sub1Array3[local40] = arg0;
			} else {
				arg0.aClass16_Sub1_23 = Static524.aClass16_Sub1Array5[local40];
				Static524.aClass16_Sub1Array5[local40] = arg0;
				Static578.aBoolean673 = true;
			}
		}
		if (arg1) {
			arg0.anInt8036 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
	public static void method3388() {
		@Pc(8) int local8 = Static305.aClass2_Sub49_15.aClass33_Sub29_1.method8714();
		if (local8 == 0) {
			Static582.aByteArrayArrayArray17 = null;
			Static231.method3729(0);
		} else if (local8 == 1) {
			Static378.method7297((byte) 0);
			Static231.method3729(512);
			if (Static372.aByteArrayArrayArray3 != null) {
				Static260.method4307();
			}
		} else {
			Static378.method7297((byte) (Static364.anInt6282 - 4 & 0xFF));
			Static231.method3729(2);
		}
		Static419.anInt7337 = Static531.anInt8550;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V")
	public static void method3390() {
		if (Static242.anInt4691 != -1) {
			Static285.method4530(Static242.anInt4691, -1, -1, false);
			Static242.anInt4691 = -1;
		}
	}
}
