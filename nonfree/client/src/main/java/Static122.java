import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
	public static int anInt2920;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!id;")
	public static Class43 aClass43_12 = new Class43(64);

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	public static int anInt2916 = 0;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLclient!nb;)V")
	public static void method2036(@OriginalArg(1) Class15 arg0) {
		Static124.aClass15_23 = arg0;
		Static136.anInt3155 = Static124.aClass15_23.method390(4);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
	public static void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static187.method2974(arg0)) {
			Static204.method3149(arg1, Static68.aClass80ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ea;IZIIIII)V")
	public static void method2040(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(31) int local31;
		if (arg0 < 0 || arg0 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local31 = arg1.method209();
				if (local31 == 0) {
					return;
				}
				if (local31 == 1) {
					arg1.method209();
					return;
				}
				if (local31 <= 49) {
					arg1.method209();
				}
			}
			return;
		}
		Static102.aByteArrayArrayArray7[arg6][arg0][arg4] = 0;
		while (true) {
			local31 = arg1.method209();
			if (local31 == 0) {
				if (arg6 == 0) {
					Static56.anIntArrayArrayArray7[0][arg0][arg4] = -Static192.method3028(arg3 + arg0 + 932731, 556238 - -arg4 - -arg2) * 8;
					return;
				} else {
					Static56.anIntArrayArrayArray7[arg6][arg0][arg4] = Static56.anIntArrayArrayArray7[arg6 - 1][arg0][arg4] - 240;
					return;
				}
			}
			if (local31 == 1) {
				@Pc(146) int local146 = arg1.method209();
				if (local146 == 1) {
					local146 = 0;
				}
				if (arg6 == 0) {
					Static56.anIntArrayArrayArray7[0][arg0][arg4] = -local146 * 8;
					return;
				}
				Static56.anIntArrayArrayArray7[arg6][arg0][arg4] = Static56.anIntArrayArrayArray7[arg6 - 1][arg0][arg4] - local146 * 8;
				return;
			}
			if (local31 <= 49) {
				Static95.aByteArrayArrayArray5[arg6][arg0][arg4] = arg1.method186();
				Static7.aByteArrayArrayArray2[arg6][arg0][arg4] = (byte) ((local31 - 2) / 4);
				Static208.aByteArrayArrayArray13[arg6][arg0][arg4] = (byte) (arg5 + local31 - 2 & 0x3);
			} else if (local31 <= 81) {
				Static102.aByteArrayArrayArray7[arg6][arg0][arg4] = (byte) (local31 - 49);
			} else {
				Static147.aByteArrayArrayArray9[arg6][arg0][arg4] = (byte) (local31 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!jj;)V")
	public static void method2041(@OriginalArg(0) Class51 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2305; local2 <= arg0.anInt2312; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2308; local6 <= arg0.anInt2307; local6++) {
				@Pc(16) Class2_Sub7 local16 = Static27.aClass2_Sub7ArrayArrayArray4[arg0.anInt2318][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1382; local20++) {
						if (local16.aClass51Array1[local20] == arg0) {
							local16.anInt1382--;
							for (local35 = local20; local35 < local16.anInt1382; local35++) {
								local16.aClass51Array1[local35] = local16.aClass51Array1[local35 + 1];
								local16.anIntArray130[local35] = local16.anIntArray130[local35 + 1];
							}
							local16.aClass51Array1[local16.anInt1382] = null;
							break;
						}
					}
					local16.anInt1378 = 0;
					for (local35 = 0; local35 < local16.anInt1382; local35++) {
						local16.anInt1378 |= local16.anIntArray130[local35];
					}
				}
			}
		}
	}
}
