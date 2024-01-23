import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "[S")
	public static short[] aShortArray94;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!wi;")
	public static Class193 aClass193_9;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public static int anInt5520 = -1;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	public static int anInt5521 = 0;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static int anInt5522 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)Z")
	public static boolean method4175(@OriginalArg(1) int arg0) {
		if (arg0 == Static63.anInt1369) {
			return false;
		}
		Static133.anIntArrayArray36 = new int[104][104];
		Static118.anIntArrayArray32 = new int[104][104];
		Static145.anIntArrayArray77 = new int[104][104];
		Static246.anIntArrayArray64 = new int[104][104];
		Static309.anIntArrayArrayArray15 = new int[4][13][13];
		for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
			Static82.aClass75Array1[local39] = new Class75(104, 104);
		}
		Static20.aClass26ArrayArrayArray1 = new Class26[4][104][104];
		Static303.aByteArrayArrayArray19 = new byte[4][104][104];
		Static53.aByteArrayArrayArray2 = new byte[4][104][104];
		if (Static294.aBoolean367) {
			Static191.method3096();
			Static177.method2851();
			Static87.aClass61ArrayArray1 = new Class61[13][13];
		}
		Static63.anInt1369 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method4177() {
		Static219.aClass89_34.method2266();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lclient!ka;")
	public static Class91 method4178(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = (Class91) Static255.aClass89_39.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static165.aClass168_121.method4058(arg0, 32);
		local6 = new Class91();
		if (local21 != null) {
			local6.method2305(new Class1_Sub14(local21));
		}
		local6.method2306();
		Static255.aClass89_39.method2272((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BB)V")
	public static void method4179(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg0);
		local10.anInt3000 = arg0.length - 2;
		Static165.anInt3668 = local10.method2244();
		Static95.anIntArray212 = new int[Static165.anInt3668];
		Static34.aByteArrayArray5 = new byte[Static165.anInt3668][];
		Static250.anIntArray469 = new int[Static165.anInt3668];
		Static102.aByteArrayArray7 = new byte[Static165.anInt3668][];
		Static50.anIntArray22 = new int[Static165.anInt3668];
		Static151.aBooleanArray19 = new boolean[Static165.anInt3668];
		Static137.anIntArray227 = new int[Static165.anInt3668];
		local10.anInt3000 = arg0.length - Static165.anInt3668 * 8 - 7;
		Static300.anInt5957 = local10.method2244();
		Static295.anInt5893 = local10.method2244();
		@Pc(67) int local67 = (local10.method2199() & 0xFF) + 1;
		@Pc(69) int local69;
		for (local69 = 0; local69 < Static165.anInt3668; local69++) {
			Static250.anIntArray469[local69] = local10.method2244();
		}
		for (local69 = 0; local69 < Static165.anInt3668; local69++) {
			Static137.anIntArray227[local69] = local10.method2244();
		}
		for (local69 = 0; local69 < Static165.anInt3668; local69++) {
			Static95.anIntArray212[local69] = local10.method2244();
		}
		for (local69 = 0; local69 < Static165.anInt3668; local69++) {
			Static50.anIntArray22[local69] = local10.method2244();
		}
		local10.anInt3000 = arg0.length + 3 - local67 * 3 - Static165.anInt3668 * 8 - 7;
		Static234.anIntArray454 = new int[local67];
		for (local69 = 1; local69 < local67; local69++) {
			Static234.anIntArray454[local69] = local10.method2215();
			if (Static234.anIntArray454[local69] == 0) {
				Static234.anIntArray454[local69] = 1;
			}
		}
		local10.anInt3000 = 0;
		for (local69 = 0; local69 < Static165.anInt3668; local69++) {
			@Pc(190) int local190 = Static95.anIntArray212[local69];
			@Pc(192) boolean local192 = false;
			@Pc(196) int local196 = Static50.anIntArray22[local69];
			@Pc(200) int local200 = local190 * local196;
			@Pc(203) byte[] local203 = new byte[local200];
			@Pc(206) byte[] local206 = new byte[local200];
			Static34.aByteArrayArray5[local69] = local203;
			Static102.aByteArrayArray7[local69] = local206;
			@Pc(218) int local218 = local10.method2199();
			@Pc(224) int local224;
			if ((local218 & 0x1) == 0) {
				for (local224 = 0; local224 < local200; local224++) {
					local203[local224] = local10.method2212();
				}
				if ((local218 & 0x2) != 0) {
					for (local224 = 0; local224 < local200; local224++) {
						@Pc(340) byte local340 = local206[local224] = local10.method2212();
						local192 |= local340 != -1;
					}
				}
			} else {
				local224 = 0;
				label89: while (true) {
					@Pc(229) int local229;
					if (local190 <= local224) {
						if ((local218 & 0x2) == 0) {
							break;
						}
						local224 = 0;
						while (true) {
							if (local190 <= local224) {
								break label89;
							}
							for (local229 = 0; local229 < local196; local229++) {
								@Pc(290) byte local290 = local206[local224 + local229 * local190] = local10.method2212();
								local192 |= local290 != -1;
							}
							local224++;
						}
					}
					for (local229 = 0; local229 < local196; local229++) {
						local203[local229 * local190 + local224] = local10.method2212();
					}
					local224++;
				}
			}
			Static151.aBooleanArray19[local69] = local192;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method4180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static99.method1656(arg7)) {
			Static181.method2925(arg5, arg4, -1, Static34.aClass191ArrayArray1[arg7], arg1, arg0, arg3, arg2, arg6);
		} else if (arg1 == -1) {
			for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
				Static29.aBooleanArray6[local21] = true;
			}
		} else {
			Static29.aBooleanArray6[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILclient!im;ZILclient!im;B)I")
	public static int method4181(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class80_Sub1 arg5) {
		@Pc(10) int local10 = Static176.method2832(arg2, arg4, arg5, arg0);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static176.method2832(arg2, arg1, arg5, arg3);
			return arg3 ? -local42 : local42;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method4183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIIIIII)V")
	public static void method4184(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static170.anInt3814 <= arg3 && arg4 <= Static310.anInt6206 && Static206.anInt4449 <= arg2 && arg5 <= Static90.anInt2088) {
			Static296.method4535(arg1, arg5, arg6, arg2, arg4, arg3, arg0);
		} else {
			Static8.method260(arg4, arg5, arg3, arg1, arg0, arg6, arg2);
		}
	}
}
