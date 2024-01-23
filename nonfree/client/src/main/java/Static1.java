import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString252;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!mh;")
	public static Class104 aClass104_2;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	public static int anInt4241 = 0;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public static int anInt4243 = 0;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	public static int anInt4245 = 0;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString253 = "K";

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BZLclient!km;Lclient!km;)V")
	public static void method3380(@OriginalArg(2) Class91 arg0, @OriginalArg(3) Class91 arg1) {
		Static170.aClass91_137 = arg1;
		Static104.aBoolean169 = true;
		Static127.aClass91_99 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZZIIIILclient!cg;IZI)V")
	public static void method3383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub11 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(31) int local31;
		if (arg3 < 0 || arg3 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local31 = arg7.method2690();
				if (local31 == 0) {
					break;
				}
				if (local31 == 1) {
					arg7.method2690();
					break;
				}
				if (local31 <= 49) {
					arg7.method2690();
				}
			}
			return;
		}
		if (!arg9 && !arg2) {
			Static260.aByteArrayArrayArray25[arg10][arg3][arg6] = 0;
		}
		while (true) {
			local31 = arg7.method2690();
			if (local31 == 0) {
				if (arg9) {
					Static55.anIntArrayArrayArray3[0][arg1 + arg3][arg6 + arg8] = Static108.anIntArrayArrayArray7[0][arg1 + arg3][arg6 + arg8];
				} else if (arg10 == 0) {
					Static55.anIntArrayArrayArray3[0][arg3 + arg1][arg8 + arg6] = -Static299.method4469(arg4 + 932731, arg5 + 556238) * 8;
				} else {
					Static55.anIntArrayArrayArray3[arg10][arg3 + arg1][arg6 + arg8] = Static55.anIntArrayArrayArray3[arg10 - 1][arg3 + arg1][arg6 + arg8] - 240;
				}
				break;
			}
			if (local31 == 1) {
				@Pc(131) int local131 = arg7.method2690();
				if (arg9) {
					Static55.anIntArrayArrayArray3[0][arg3 + arg1][arg6 + arg8] = Static108.anIntArrayArrayArray7[0][arg1 + arg3][arg8 + arg6] + local131 * 8;
				} else {
					if (local131 == 1) {
						local131 = 0;
					}
					if (arg10 == 0) {
						Static55.anIntArrayArrayArray3[0][arg3 + arg1][arg8 + arg6] = -local131 * 8;
					} else {
						Static55.anIntArrayArrayArray3[arg10][arg3 + arg1][arg8 + arg6] = Static55.anIntArrayArrayArray3[arg10 - 1][arg1 + arg3][arg8 + arg6] - local131 * 8;
					}
				}
				break;
			}
			if (local31 > 49) {
				if (local31 <= 81) {
					if (!arg9 && !arg2) {
						Static260.aByteArrayArrayArray25[arg10][arg3][arg6] = (byte) (local31 - 49);
					}
				} else if (!arg2) {
					Static58.aByteArrayArrayArray10[arg10][arg3][arg6] = (byte) (local31 - 81);
				}
			} else if (arg2) {
				arg7.method2690();
			} else {
				Static85.aByteArrayArrayArray13[arg10][arg3][arg6] = arg7.method2663();
				Static238.aByteArrayArrayArray21[arg10][arg3][arg6] = (byte) ((local31 - 2) / 4);
				Static2.aByteArrayArrayArray3[arg10][arg3][arg6] = (byte) (local31 + arg0 - 2 & 0x3);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class1_Sub20 local8 = (Class1_Sub20) Static80.aClass61_3.method1835();
		@Pc(27) Class1_Sub20 local27 = null;
		while (local8 != null) {
			if (local8.anInt3349 == arg7 && local8.anInt3353 == arg3 && arg1 == local8.anInt3341 && arg0 == local8.anInt3343) {
				local27 = local8;
				break;
			}
			local8 = (Class1_Sub20) Static80.aClass61_3.method1836();
		}
		if (local27 == null) {
			local27 = new Class1_Sub20();
			local27.anInt3343 = arg0;
			local27.anInt3349 = arg7;
			local27.anInt3341 = arg1;
			local27.anInt3353 = arg3;
			Static178.method3182(local27);
			Static80.aClass61_3.method1839(local27);
		}
		local27.anInt3346 = arg6;
		local27.anInt3350 = arg5;
		local27.anInt3344 = arg8;
		local27.anInt3348 = arg4;
		local27.anInt3347 = arg2;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!km;I)I")
	public static int method3391(@OriginalArg(0) Class91 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2501(Static127.anInt2834)) {
			local5++;
		}
		if (arg0.method2501(Static113.anInt2603)) {
			local5++;
		}
		if (arg0.method2501(Static260.anInt5628)) {
			local5++;
		}
		if (arg0.method2501(Static34.anInt797)) {
			local5++;
		}
		if (arg0.method2501(Static220.anInt4365)) {
			local5++;
		}
		if (arg0.method2501(Static72.anInt1529)) {
			local5++;
		}
		if (arg0.method2501(Static172.anInt3654)) {
			local5++;
		}
		if (arg0.method2501(Static188.anInt3902)) {
			local5++;
		}
		if (arg0.method2501(Static114.anInt2621)) {
			local5++;
		}
		if (arg0.method2501(Static112.anInt2575)) {
			local5++;
		}
		if (arg0.method2501(Static187.anInt3896)) {
			local5++;
		}
		if (arg0.method2501(Static170.anInt3634)) {
			local5++;
		}
		if (arg0.method2501(Static238.anInt3834)) {
			local5++;
		}
		if (arg0.method2501(Static223.anInt4419)) {
			local5++;
		}
		if (arg0.method2501(Static139.anInt3024)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public static void method3393() {
		Static205.aClass135_23.method3317();
		Static232.aClass135_28.method3317();
	}
}
