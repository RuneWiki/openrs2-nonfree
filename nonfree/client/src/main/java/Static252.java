import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public static int anInt4350;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!mn;")
	public static Class171 aClass171_57;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	public static int anInt4355;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "I")
	public static int anInt4351 = 0;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Lclient!gi;")
	public static Class93 aClass93_15 = null;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "J")
	public static long aLong212 = 0L;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!tm;Z)Z")
	public static boolean method3490(@OriginalArg(0) Class11_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static241.aClass22Array3 == Static46.aClass22Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6214();
		if (arg0.aShort108 < 0 || arg0.aShort109 < 0 || arg0.aShort107 >= Static212.anInt3636 || arg0.aShort106 >= Static104.anInt1675) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort108; local34 <= arg0.aShort107; local34++) {
			for (local38 = arg0.aShort109; local38 <= arg0.aShort106; local38++) {
				@Pc(45) Class36 local45 = Static61.method976(arg0.aByte101, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort108) {
						local49++;
					}
					if (local34 < arg0.aShort107) {
						local49 += 4;
					}
					if (local38 > arg0.aShort109) {
						local49 += 8;
					}
					if (local38 < arg0.aShort106) {
						local49 += 2;
					}
					@Pc(74) Class195 local74 = Static409.method694(local49, arg0);
					@Pc(77) Class195 local77 = local45.aClass195_1;
					if (local77 == null) {
						local45.aClass195_1 = local74;
					} else {
						while (local77.aClass195_2 != null) {
							local77 = local77.aClass195_2;
						}
						local77.aClass195_2 = local74;
					}
					local45.aByte7 = (byte) (local45.aByte7 | local49);
					if (local6 && (Static427.anIntArrayArray176[local34][local38] & 0xFF000000) != 0) {
						local8 = Static427.anIntArrayArray176[local34][local38];
						local10 = Static131.aShortArrayArray3[local34][local38];
						local12 = Static182.aByteArrayArray11[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort108; local38 <= arg0.aShort107; local38++) {
				for (@Pc(150) int local150 = arg0.aShort109; local150 <= arg0.aShort106; local150++) {
					if ((Static427.anIntArrayArray176[local38][local150] & 0xFF000000) == 0) {
						Static427.anIntArrayArray176[local38][local150] = local8;
						Static131.aShortArrayArray3[local38][local150] = local10;
						Static182.aByteArrayArray11[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static218.aClass11_Sub5Array3[Static315.anInt5651++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3491(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static164.method2403(Static334.aClass208_79);
		Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(arg0) + 1);
		Static389.aClass2_Sub17_Sub1_2.method6151(arg0);
		Static389.aClass2_Sub17_Sub1_2.method6161(arg1);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method3492() {
		Static32.anInt7620 = Static458.aClass15_11.anInt326 + Static458.aClass15_11.anInt318 + 2;
		Static419.anInt7184 = Static9.aClass15_9.anInt326 + Static9.aClass15_9.anInt318 + 2;
		Static20.aStringArray8 = new String[500];
		for (@Pc(30) int local30 = 0; local30 < Static20.aStringArray8.length; local30++) {
			Static20.aStringArray8[local30] = "";
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILjava/lang/String;[B)I")
	public static int method3494(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg2.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg3[local12 + arg0] = (byte) local20;
			} else if (local20 == '€') {
				arg3[local12 + arg0] = -128;
			} else if (local20 == '‚') {
				arg3[arg0 + local12] = -126;
			} else if (local20 == 'ƒ') {
				arg3[arg0 + local12] = -125;
			} else if (local20 == '„') {
				arg3[arg0 + local12] = -124;
			} else if (local20 == '…') {
				arg3[arg0 + local12] = -123;
			} else if (local20 == '†') {
				arg3[local12 + arg0] = -122;
			} else if (local20 == '‡') {
				arg3[arg0 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg3[local12 + arg0] = -120;
			} else if (local20 == '‰') {
				arg3[local12 + arg0] = -119;
			} else if (local20 == 'Š') {
				arg3[local12 + arg0] = -118;
			} else if (local20 == '‹') {
				arg3[arg0 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg3[local12 + arg0] = -116;
			} else if (local20 == 'Ž') {
				arg3[local12 + arg0] = -114;
			} else if (local20 == '‘') {
				arg3[arg0 + local12] = -111;
			} else if (local20 == '’') {
				arg3[arg0 + local12] = -110;
			} else if (local20 == '“') {
				arg3[arg0 + local12] = -109;
			} else if (local20 == '”') {
				arg3[local12 + arg0] = -108;
			} else if (local20 == '•') {
				arg3[arg0 + local12] = -107;
			} else if (local20 == '–') {
				arg3[local12 + arg0] = -106;
			} else if (local20 == '—') {
				arg3[arg0 + local12] = -105;
			} else if (local20 == '˜') {
				arg3[arg0 + local12] = -104;
			} else if (local20 == '™') {
				arg3[local12 + arg0] = -103;
			} else if (local20 == 'š') {
				arg3[arg0 + local12] = -102;
			} else if (local20 == '›') {
				arg3[local12 + arg0] = -101;
			} else if (local20 == 'œ') {
				arg3[arg0 + local12] = -100;
			} else if (local20 == 'ž') {
				arg3[local12 + arg0] = -98;
			} else if (local20 == 'Ÿ') {
				arg3[arg0 + local12] = -97;
			} else {
				arg3[arg0 + local12] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!za;Lclient!bm;IIIII)V")
	public static void method3495(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static180.anInt3181) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static212.anInt3636) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static104.anInt1675 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class36 local62 = Static175.aClass36ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static241.aClass22Array3[local17].ua(local23, local32) + Static241.aClass22Array3[local17].ua(local23 + 1, local32) + Static241.aClass22Array3[local17].ua(local23, local32 + 1) + Static241.aClass22Array3[local17].ua(local23 + 1, local32 + 1)) / 4 - (Static241.aClass22Array3[arg2].ua(arg3, arg4) + Static241.aClass22Array3[arg2].ua(arg3 + 1, arg4) + Static241.aClass22Array3[arg2].ua(arg3, arg4 + 1) + Static241.aClass22Array3[arg2].ua(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class11_Sub1 local143 = local62.aClass11_Sub1_2;
									@Pc(146) Class11_Sub1 local146 = local62.aClass11_Sub1_3;
									if (local143 != null && local143.method6211()) {
										arg1.method6207(local140, arg0, (local32 - arg4) * Static327.anInt5862 + (1 - arg6) * Static417.anInt7156, local1, (local23 - arg3) * Static327.anInt5862 + (1 - arg5) * Static417.anInt7156, local143);
									}
									if (local146 != null && local146.method6211()) {
										arg1.method6207(local140, arg0, (local32 - arg4) * Static327.anInt5862 + (1 - arg6) * Static417.anInt7156, local1, (local23 - arg3) * Static327.anInt5862 + (1 - arg5) * Static417.anInt7156, local146);
									}
									for (@Pc(219) Class195 local219 = local62.aClass195_1; local219 != null; local219 = local219.aClass195_2) {
										@Pc(223) Class11_Sub5 local223 = local219.aClass11_Sub5_1;
										if (local223 != null && local223.method6211() && (local23 == local223.aShort108 || local23 == local3) && (local32 == local223.aShort109 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort107 + 1 - local223.aShort108;
											@Pc(260) int local260 = local223.aShort106 + 1 - local223.aShort109;
											arg1.method6207(local140, arg0, (local223.aShort109 - arg4) * Static327.anInt5862 + (local260 - arg6) * Static417.anInt7156, local1, (local223.aShort108 - arg3) * Static327.anInt5862 + (local252 - arg5) * Static417.anInt7156, local223);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
