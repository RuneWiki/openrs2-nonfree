import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lclient!wo;")
	public static Class216 aClass216_31;

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
	public static int anInt2069 = -1;

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "I")
	public static int anInt2078 = 127;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZIZIILclient!bg;IIBI)V")
	public static void method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1_Sub8 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == 1) {
			arg6 = 1;
		} else if (arg0 == 2) {
			arg10 = 1;
			arg6 = 1;
		} else if (arg0 == 3) {
			arg10 = 1;
		}
		@Pc(62) int local62;
		if (arg1 < 0 || Static233.anInt5573 <= arg1 || arg9 < 0 || arg9 >= Static134.anInt2971) {
			while (true) {
				local62 = arg7.method4532();
				if (local62 == 0) {
					break;
				}
				if (local62 == 1) {
					arg7.method4532();
					break;
				}
				if (local62 <= 49) {
					arg7.method4532();
				}
			}
			return;
		}
		if (!arg2 && !arg4) {
			Static200.aByteArrayArrayArray8[arg3][arg1][arg9] = 0;
		}
		while (true) {
			local62 = arg7.method4532();
			if (local62 == 0) {
				if (arg2) {
					Static251.anIntArrayArrayArray15[0][arg10 + arg1][arg9 + arg6] = Static190.aClass53Array1[0].method2785(arg10 + arg1, arg9 + arg6);
				} else if (arg3 == 0) {
					Static251.anIntArrayArrayArray15[0][arg1 + arg10][arg6 + arg9] = -Static297.method4982(arg8 + 556238, arg5 + 932731) * 8;
				} else {
					Static251.anIntArrayArrayArray15[arg3][arg1 + arg10][arg6 + arg9] = Static251.anIntArrayArrayArray15[arg3 - 1][arg1 + arg10][arg9 + arg6] - 240;
				}
				break;
			}
			if (local62 == 1) {
				@Pc(196) int local196 = arg7.method4532();
				if (arg2) {
					Static251.anIntArrayArrayArray15[0][arg1 + arg10][arg9 + arg6] = local196 * 8 + Static190.aClass53Array1[0].method2785(arg10 + arg1, arg9 - -arg6);
				} else {
					if (local196 == 1) {
						local196 = 0;
					}
					if (arg3 == 0) {
						Static251.anIntArrayArrayArray15[0][arg1 + arg10][arg6 + arg9] = -local196 * 8;
					} else {
						Static251.anIntArrayArrayArray15[arg3][arg10 + arg1][arg6 + arg9] = Static251.anIntArrayArrayArray15[arg3 - 1][arg10 + arg1][arg6 + arg9] - local196 * 8;
					}
				}
				break;
			}
			if (local62 <= 49) {
				if (arg4) {
					arg7.method4532();
				} else {
					Static130.aByteArrayArrayArray5[arg3][arg1][arg9] = arg7.method4558();
					Static231.aByteArrayArrayArray9[arg3][arg1][arg9] = (byte) ((local62 - 2) / 4);
					Static189.aByteArrayArrayArray6[arg3][arg1][arg9] = (byte) (local62 + arg0 - 2 & 0x3);
				}
			} else if (local62 <= 81) {
				if (!arg2 && !arg4) {
					Static200.aByteArrayArrayArray8[arg3][arg1][arg9] = (byte) (local62 - 49);
				}
			} else if (!arg4) {
				Static332.aByteArrayArrayArray11[arg3][arg1][arg9] = (byte) (local62 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	public static void method1809(@OriginalArg(0) int arg0) {
		Static99.anInt2382 = arg0;
		@Pc(15) Class87 local15 = Static115.aClass87_23;
		synchronized (Static115.aClass87_23) {
			Static115.aClass87_23.method2485();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)V")
	public static void method1810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) Class1_Sub4_Sub9 local24 = Static139.method4227(arg0, 5);
		local24.method1869();
		local24.anInt2142 = arg1;
	}
}
