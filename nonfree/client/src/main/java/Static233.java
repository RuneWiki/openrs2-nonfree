import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!os", name = "g", descriptor = "[Lclient!fg;")
	public static Class5_Sub13_Sub1[] aClass5_Sub13_Sub1Array3;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "I")
	public static int anInt4553;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	public static int anInt4557;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	public static int anInt4549 = 0;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "I")
	public static int anInt4552 = 0;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZLclient!bk;IIIIIIIIZ)V")
	public static void method3987(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		if (arg7 == 1) {
			arg6 = 1;
		} else if (arg7 == 2) {
			arg6 = 1;
			arg9 = 1;
		} else if (arg7 == 3) {
			arg9 = 1;
		}
		@Pc(52) int local52;
		if (arg2 < 0 || Static266.anInt5101 <= arg2 || arg5 < 0 || arg5 >= Static339.anInt6352) {
			while (true) {
				local52 = arg1.method1832();
				if (local52 == 0) {
					break;
				}
				if (local52 == 1) {
					arg1.method1832();
					break;
				}
				if (local52 <= 49) {
					arg1.method1832();
				}
			}
			return;
		}
		if (!arg0 && !arg10) {
			Static32.aByteArrayArrayArray4[arg4][arg2][arg5] = 0;
		}
		while (true) {
			local52 = arg1.method1832();
			if (local52 == 0) {
				if (arg0) {
					Static200.anIntArrayArrayArray17[0][arg2 + arg9][arg5 + arg6] = Static262.aClass3Array3[0].method5638(arg2 + arg9, arg6 + arg5);
				} else if (arg4 == 0) {
					Static200.anIntArrayArrayArray17[0][arg2 + arg9][arg5 + arg6] = -Static208.method3718(arg8 + 932731, arg3 + 556238) * 8;
				} else {
					Static200.anIntArrayArrayArray17[arg4][arg9 + arg2][arg6 + arg5] = Static200.anIntArrayArrayArray17[arg4 - 1][arg9 + arg2][arg5 + arg6] - 240;
				}
				break;
			}
			if (local52 == 1) {
				@Pc(186) int local186 = arg1.method1832();
				if (arg0) {
					Static200.anIntArrayArrayArray17[0][arg2 + arg9][arg6 + arg5] = local186 * 8 + Static262.aClass3Array3[0].method5638(arg2 + arg9, arg5 + arg6);
				} else {
					if (local186 == 1) {
						local186 = 0;
					}
					if (arg4 == 0) {
						Static200.anIntArrayArrayArray17[0][arg2 + arg9][arg6 + arg5] = -local186 * 8;
					} else {
						Static200.anIntArrayArrayArray17[arg4][arg2 + arg9][arg6 + arg5] = Static200.anIntArrayArrayArray17[arg4 - 1][arg2 + arg9][arg6 + arg5] - local186 * 8;
					}
				}
				break;
			}
			if (local52 <= 49) {
				if (arg10) {
					arg1.method1832();
				} else {
					Static81.aByteArrayArrayArray9[arg4][arg2][arg5] = arg1.method1863();
					Static152.aByteArrayArrayArray14[arg4][arg2][arg5] = (byte) ((local52 - 2) / 4);
					Static171.aByteArrayArrayArray17[arg4][arg2][arg5] = (byte) (arg7 + local52 - 2 & 0x3);
				}
			} else if (local52 <= 81) {
				if (!arg0 && !arg10) {
					Static32.aByteArrayArrayArray4[arg4][arg2][arg5] = (byte) (local52 - 49);
				}
			} else if (!arg10) {
				Static95.aByteArrayArrayArray30[arg4][arg2][arg5] = (byte) (local52 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
	public static boolean method3988(@OriginalArg(0) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local43 >= '0' && local43 <= '9') {
				local76 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local76 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local76 = local43 - 'W';
			} else {
				return false;
			}
			if (local76 >= 10) {
				return false;
			}
			if (local28) {
				local76 = -local76;
			}
			@Pc(109) int local109 = local32 * 10 + local76;
			if (local32 != local109 / 10) {
				return false;
			}
			local30 = true;
			local32 = local109;
		}
		return local30;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public static void method3989() {
		@Pc(5) Class66 local5 = Static48.aClass66_15;
		synchronized (Static48.aClass66_15) {
			Static48.aClass66_15.method1942();
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	public static void method3991() {
		Static108.aClass66_36.method1942();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)Lclient!sn;")
	public static Class187 method3993(@OriginalArg(1) int arg0) {
		@Pc(10) Class187 local10 = (Class187) Static355.aClass66_110.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static139.aClass170_116.method4584(35, arg0);
		local10 = new Class187();
		if (local20 != null) {
			local10.method4986(new Class5_Sub1(local20));
		}
		local10.method4984();
		Static355.aClass66_110.method1936((long) arg0, local10);
		return local10;
	}
}
