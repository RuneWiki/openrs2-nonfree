import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!wl;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!fh;")
	public static Class58 aClass58_7;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!fd;ZZZIIIIIIII)V")
	public static void method195(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(37) int local37;
		if (arg10 < 0 || arg10 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local37 = arg0.method4666();
				if (local37 == 0) {
					break;
				}
				if (local37 == 1) {
					arg0.method4666();
					break;
				}
				if (local37 <= 49) {
					arg0.method4666();
				}
			}
			return;
		}
		if (!arg2 && !arg1) {
			Static174.aByteArrayArrayArray17[arg3][arg10][arg6] = 0;
		}
		while (true) {
			local37 = arg0.method4666();
			if (local37 == 0) {
				if (arg2) {
					Static243.anIntArrayArrayArray13[0][arg9 + arg10][arg8 + arg6] = Static259.anIntArrayArrayArray14[0][arg9 + arg10][arg8 + arg6];
				} else if (arg3 == 0) {
					Static243.anIntArrayArrayArray13[0][arg9 + arg10][arg6 + arg8] = -Static181.method2939(arg4 + 932731, arg5 + 556238) * 8;
				} else {
					Static243.anIntArrayArrayArray13[arg3][arg10 + arg9][arg8 + arg6] = Static243.anIntArrayArrayArray13[arg3 - 1][arg10 + arg9][arg6 + arg8] - 240;
				}
				break;
			}
			if (local37 == 1) {
				@Pc(132) int local132 = arg0.method4666();
				if (arg2) {
					Static243.anIntArrayArrayArray13[0][arg9 + arg10][arg8 + arg6] = local132 * 8 + Static259.anIntArrayArrayArray14[0][arg9 + arg10][arg8 + arg6];
				} else {
					if (local132 == 1) {
						local132 = 0;
					}
					if (arg3 == 0) {
						Static243.anIntArrayArrayArray13[0][arg9 + arg10][arg6 + arg8] = -local132 * 8;
					} else {
						Static243.anIntArrayArrayArray13[arg3][arg10 + arg9][arg8 + arg6] = Static243.anIntArrayArrayArray13[arg3 - 1][arg9 + arg10][arg8 + arg6] - local132 * 8;
					}
				}
				break;
			}
			if (local37 <= 49) {
				if (arg1) {
					arg0.method4666();
				} else {
					Static151.aByteArrayArrayArray15[arg3][arg10][arg6] = arg0.method4674();
					Static78.aByteArrayArrayArray4[arg3][arg10][arg6] = (byte) ((local37 - 2) / 4);
					Static8.aByteArrayArrayArray1[arg3][arg10][arg6] = (byte) (arg7 + local37 - 2 & 0x3);
				}
			} else if (local37 > 81) {
				if (!arg1) {
					Static57.aByteArrayArrayArray3[arg3][arg10][arg6] = (byte) (local37 - 81);
				}
			} else if (!arg2 && !arg1) {
				Static174.aByteArrayArrayArray17[arg3][arg10][arg6] = (byte) (local37 - 49);
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!fh;II)Z")
	public static boolean method197(@OriginalArg(1) Class58 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1372(arg1, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static222.method3579(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public static void method198() {
		Static193.aClass26_37.method511();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public static void method199() {
		if (Static30.aClass103_1 != null) {
			Static30.aClass103_1.method3014();
		}
		if (Static249.aClass103_2 != null) {
			Static249.aClass103_2.method3014();
		}
		Static10.method175(Static273.aBoolean122);
		Static30.aClass103_1 = Static179.method2820(Static188.aCanvas115, 22050, Static276.aClass139_4, 0);
		Static30.aClass103_1.method3021(Static31.aClass4_Sub6_Sub2_2);
		Static249.aClass103_2 = Static179.method2820(Static188.aCanvas115, 2048, Static276.aClass139_4, 1);
		Static249.aClass103_2.method3021(Static211.aClass4_Sub6_Sub3_2);
	}
}
