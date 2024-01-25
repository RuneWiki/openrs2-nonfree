import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_308 = new Class159("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V")
	public static void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class183 local3 = new Class183();
		local3.anInt5674 = arg1 >> 7;
		local3.anInt5664 = arg2 >> 7;
		local3.anInt5668 = arg3 >> 7;
		local3.anInt5657 = arg4 >> 7;
		local3.anInt5651 = arg0;
		local3.anInt5656 = arg1;
		local3.anInt5663 = arg2;
		local3.anInt5653 = arg3;
		local3.anInt5666 = arg4;
		local3.anInt5661 = arg5;
		local3.anInt5654 = arg6;
		Static183.aClass183Array2[Static67.anInt1776++] = local3;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(IIIIIII)I")
	public static int method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg2 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(17) int local17 = arg4;
			arg4 = arg0;
			arg0 = local17;
		}
		if (local8 == 0) {
			return arg5;
		} else if (local8 == 1) {
			return 7 + 1 - arg1 - arg4;
		} else if (local8 == 2) {
			return 1 + 7 - arg0 - arg5;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I")
	public static int method4880(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public static void method4882() {
		if (Static128.anInt3034 > 0) {
			Static232.method4122();
		} else {
			Static70.aClass114_2 = Static155.aClass114_3;
			Static155.aClass114_3 = null;
			Static243.method5095(40);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method4883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg0 < 0 || arg6 >= Static350.anInt6637 - 1 || Static105.anInt2647 - 1 <= arg0) {
			return;
		}
		if (Static273.aClass128ArrayArrayArray4 == null) {
			return;
		}
		@Pc(42) Interface7 local42;
		if (arg5 == 0) {
			local42 = (Interface7) Static354.method5631(arg3, arg6, arg0);
			@Pc(48) Interface7 local48 = (Interface7) Static156.method4512(arg3, arg6, arg0);
			if (local42 != null && arg1 != 2) {
				if (local42 instanceof Class8_Sub4_Sub2) {
					((Class8_Sub4_Sub2) local42).aClass216_4.method5546(arg4);
				} else {
					Static246.method4384(arg4, arg0, arg1, local42.method5594(), arg6, arg3, arg2, arg5);
				}
			}
			if (local48 != null) {
				if (local48 instanceof Class8_Sub4_Sub2) {
					((Class8_Sub4_Sub2) local48).aClass216_4.method5546(arg4);
					return;
				}
				Static246.method4384(arg4, arg0, arg1, local48.method5594(), arg6, arg3, arg2, arg5);
				return;
			}
			return;
		}
		if (arg5 == 1) {
			local42 = (Interface7) Static43.method852(arg3, arg6, arg0);
			if (local42 != null) {
				if (!(local42 instanceof Class8_Sub2_Sub1)) {
					@Pc(121) int local121 = local42.method5594();
					if (arg1 != 4 && arg1 != 5) {
						if (arg1 == 6) {
							Static246.method4384(arg4, arg0, 4, local121, arg6, arg3, arg2 + 4, arg5);
						} else if (arg1 == 7) {
							Static246.method4384(arg4, arg0, 4, local121, arg6, arg3, (arg2 + 2 & 0x3) + 4, arg5);
							return;
						} else if (arg1 == 8) {
							Static246.method4384(arg4, arg0, 4, local121, arg6, arg3, arg2 + 4, arg5);
							Static246.method4384(arg4, arg0, 4, local121, arg6, arg3, (arg2 + 2 & 0x3) + 4, arg5);
							return;
						}
						return;
					}
					Static246.method4384(arg4, arg0, 4, local121, arg6, arg3, arg2, arg5);
					return;
				}
				((Class8_Sub2_Sub1) local42).aClass216_1.method5546(arg4);
				return;
			}
			return;
		}
		if (arg5 != 2) {
			if (arg5 == 3) {
				local42 = (Interface7) Static172.method3324(arg3, arg6, arg0);
				if (local42 != null) {
					if (!(local42 instanceof Class8_Sub5_Sub2)) {
						Static246.method4384(arg4, arg0, arg1, local42.method5594(), arg6, arg3, arg2, arg5);
						return;
					}
					((Class8_Sub5_Sub2) local42).aClass216_3.method5546(arg4);
					return;
				}
			}
			return;
		}
		local42 = (Interface7) Static347.method5528(arg3, arg6, arg0, mb.class);
		if (local42 == null) {
			return;
		}
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (!(local42 instanceof Class8_Sub1_Sub4)) {
			Static246.method4384(arg4, arg0, arg1, local42.method5594(), arg6, arg3, arg2, arg5);
			return;
		}
		((Class8_Sub1_Sub4) local42).aClass216_2.method5546(arg4);
		return;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public static void method4884() {
		Static210.aClass198_157.method5213();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIILclient!lf;ZIZIII)V")
	public static void method4885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub11 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == 1) {
			arg9 = 1;
		} else if (arg2 == 2) {
			arg9 = 1;
			arg0 = 1;
		} else if (arg2 == 3) {
			arg0 = 1;
		}
		@Pc(46) int local46;
		if (arg8 < 0 || Static350.anInt6637 <= arg8 || arg3 < 0 || Static105.anInt2647 <= arg3) {
			while (true) {
				local46 = arg4.method3440();
				if (local46 == 0) {
					break;
				}
				if (local46 == 1) {
					arg4.method3440();
					break;
				}
				if (local46 <= 49) {
					arg4.method3440();
				}
			}
			return;
		}
		if (!arg5 && !arg7) {
			Static2.aByteArrayArrayArray1[arg6][arg8][arg3] = 0;
		}
		while (true) {
			local46 = arg4.method3440();
			if (local46 == 0) {
				if (arg5) {
					Static338.anIntArrayArrayArray40[0][arg8 + arg0][arg3 + arg9] = Static304.aClass60Array3[0].method2264(arg8 + arg0, arg3 + arg9);
				} else if (arg6 == 0) {
					Static338.anIntArrayArrayArray40[0][arg8 + arg0][arg3 + arg9] = -Static174.method3346(arg10 + 932731, arg1 + 556238) * 8;
				} else {
					Static338.anIntArrayArrayArray40[arg6][arg0 + arg8][arg3 + arg9] = Static338.anIntArrayArrayArray40[arg6 - 1][arg0 + arg8][arg3 + arg9] - 240;
				}
				break;
			}
			if (local46 == 1) {
				@Pc(192) int local192 = arg4.method3440();
				if (arg5) {
					Static338.anIntArrayArrayArray40[0][arg0 + arg8][arg3 + arg9] = Static304.aClass60Array3[0].method2264(arg8 + arg0, arg9 + arg3) + local192 * 8;
				} else {
					if (local192 == 1) {
						local192 = 0;
					}
					if (arg6 == 0) {
						Static338.anIntArrayArrayArray40[0][arg0 + arg8][arg9 + arg3] = -local192 * 8;
					} else {
						Static338.anIntArrayArrayArray40[arg6][arg8 + arg0][arg9 + arg3] = Static338.anIntArrayArrayArray40[arg6 - 1][arg0 + arg8][arg3 + arg9] - local192 * 8;
					}
				}
				break;
			}
			if (local46 <= 49) {
				if (arg7) {
					arg4.method3440();
				} else {
					Static251.aByteArrayArrayArray12[arg6][arg8][arg3] = arg4.method3426();
					Static353.aByteArrayArrayArray9[arg6][arg8][arg3] = (byte) ((local46 - 2) / 4);
					Static80.aByteArrayArrayArray6[arg6][arg8][arg3] = (byte) (arg2 + local46 - 2 & 0x3);
				}
			} else if (local46 <= 81) {
				if (!arg5 && !arg7) {
					Static2.aByteArrayArrayArray1[arg6][arg8][arg3] = (byte) (local46 - 49);
				}
			} else if (!arg7) {
				Static67.aByteArrayArrayArray4[arg6][arg8][arg3] = (byte) (local46 - 81);
			}
		}
	}
}
