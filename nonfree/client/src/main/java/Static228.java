import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	public static int anInt4792;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	public static int anInt4794 = -1;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[Lclient!q;")
	public static Class90[] aClass90Array1 = new Class90[4];

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1648 = Static64.method1101("Abbrechen");

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1649 = Static64.method1101("<img=0>");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!ia;")
	public static Class51 method3747(@OriginalArg(0) int arg0) {
		@Pc(9) Class51 local9 = Static27.method511(arg0);
		for (@Pc(20) int local20 = local9.method1399() - 3; local20 > 0; local20 -= 3) {
			local9 = Static150.method2574(new Class51[] { local9.method1433(0, local20), Static107.aClass51_789, local9.method1394(local20) });
		}
		if (local9.method1399() > 9) {
			return Static150.method2574(new Class51[] { Static64.aClass51_461, local9.method1433(0, local9.method1399() - 8), Static159.aClass51_1220, Static125.aClass51_1245, local9, Static145.aClass51_1113 });
		} else if (local9.method1399() > 6) {
			return Static150.method2574(new Class51[] { Static54.aClass51_381, local9.method1433(0, local9.method1399() - 4), Static219.aClass51_1564, Static125.aClass51_1245, local9, Static145.aClass51_1113 });
		} else {
			return Static150.method2574(new Class51[] { Static56.aClass51_1230, local9, Static14.aClass51_111 });
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
	public static void method3748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) byte arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static58.anInt1373 * 128) {
			arg0 = Static58.anInt1373 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static172.anInt3854 * 128) {
			arg2 = Static172.anInt3854 * 128 - 1;
		}
		Static116.anInt1300 = Class94.anIntArray278[arg3];
		Static157.anInt3436 = Class94.anIntArray277[arg3];
		Static15.anInt355 = Class94.anIntArray278[arg4];
		Static123.anInt2715 = Class94.anIntArray277[arg4];
		Static155.anInt3423 = arg0;
		Static115.anInt2533 = arg1;
		Static70.anInt1623 = arg2;
		Static72.anInt1643 = arg0 / 128;
		Static220.anInt4646 = arg2 / 128;
		Static197.anInt2420 = arg5;
		Static163.anInt3523 = Static72.anInt1643 - Static62.anInt1432;
		if (Static163.anInt3523 < 0) {
			Static163.anInt3523 = 0;
		}
		Static127.anInt2831 = Static220.anInt4646 - Static62.anInt1432;
		if (Static127.anInt2831 < 0) {
			Static127.anInt2831 = 0;
		}
		Static41.anInt972 = Static72.anInt1643 + Static62.anInt1432;
		if (Static41.anInt972 > Static58.anInt1373) {
			Static41.anInt972 = Static58.anInt1373;
		}
		Static230.anInt4880 = Static220.anInt4646 + Static62.anInt1432;
		if (Static230.anInt4880 > Static172.anInt3854) {
			Static230.anInt4880 = Static172.anInt3854;
		}
		@Pc(104) int local104;
		@Pc(115) int local115;
		for (@Pc(101) int local101 = 0; local101 < Static62.anInt1432 + Static62.anInt1432 + 2; local101++) {
			for (local104 = 0; local104 < Static62.anInt1432 + Static62.anInt1432 + 2; local104++) {
				local115 = (local101 - Static62.anInt1432 << 7) - (Static155.anInt3423 & 0x7F);
				@Pc(125) int local125 = (local104 - Static62.anInt1432 << 7) - (Static70.anInt1623 & 0x7F);
				@Pc(131) int local131 = Static72.anInt1643 + local101 - Static62.anInt1432;
				@Pc(137) int local137 = Static220.anInt4646 + local104 - Static62.anInt1432;
				if (local131 >= 0 && local137 >= 0 && local131 < Static58.anInt1373 && local137 < Static172.anInt3854) {
					@Pc(161) int local161;
					if (Static103.anIntArrayArrayArray13 == null) {
						local161 = Static190.anIntArrayArrayArray9[0][local131][local137] + 128 - Static115.anInt2533;
					} else {
						local161 = Static103.anIntArrayArrayArray13[0][local131][local137] + 128 - Static115.anInt2533;
					}
					@Pc(186) int local186 = Static190.anIntArrayArrayArray9[3][local131][local137] - Static115.anInt2533 - 1000;
					Static213.aBooleanArrayArray2[local101][local104] = Static176.method2991(local115, local186, local161, local125);
				} else {
					Static213.aBooleanArrayArray2[local101][local104] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static62.anInt1432 + Static62.anInt1432 + 1; local104++) {
			for (local115 = 0; local115 < Static62.anInt1432 + Static62.anInt1432 + 1; local115++) {
				Static165.aBooleanArrayArray1[local104][local115] = Static213.aBooleanArrayArray2[local104][local115] || Static213.aBooleanArrayArray2[local104 + 1][local115] || Static213.aBooleanArrayArray2[local104][local115 + 1] || Static213.aBooleanArrayArray2[local104 + 1][local115 + 1];
			}
		}
		Static139.anIntArray208 = arg7;
		Static181.anIntArray300 = arg8;
		Static126.anIntArray172 = arg9;
		Static80.anIntArray112 = arg10;
		Static163.anIntArray230 = arg11;
		Static26.method2453();
		Static73.method1283(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
	public static void method3749(@OriginalArg(1) boolean arg0) {
		Static208.method3447();
		if (Static47.anInt1142 == 28) {
			return;
		}
		Static192.anInt4170++;
		if (Static192.anInt4170 < 50 && !arg0) {
			return;
		}
		Static192.anInt4170 = 0;
		if (Static200.aBoolean192 || Static192.aClass11_36 == null) {
			return;
		}
		Static167.aClass1_Sub16_Sub1_2.method3823(138);
		try {
			Static192.aClass11_36.method269(Static167.aClass1_Sub16_Sub1_2.anInt4860, Static167.aClass1_Sub16_Sub1_2.aByteArray62);
			Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
		} catch (@Pc(53) IOException local53) {
			Static200.aBoolean192 = true;
		}
	}
}
