import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
	public static final int[] anIntArray135 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1102 = Static193.method3027(")1p");

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1103 = Static193.method3027("null");

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "[I")
	public static final int[] anIntArray136 = new int[100];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B[B)V")
	public static void method1598(@OriginalArg(1) byte[] arg0) {
		@Pc(13) int local13 = 0;
		while (true) {
			while (local13 < arg0.length) {
				@Pc(27) int local27 = (arg0[local13++] & 0xFF) * 64 - Static157.anInt3260;
				@Pc(38) int local38 = (arg0[local13++] & 0xFF) * 64 - Static115.anInt2318;
				@Pc(92) byte local92;
				@Pc(70) int local70;
				if (local27 > 0 && local38 > 0 && Static65.anInt1364 > local27 + 64 && Static50.anInt1046 > local38 + 64) {
					local70 = local27 >> 6;
					@Pc(79) int local79 = Static50.anInt1046 - local38 - 1 >> 6;
					for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
						for (@Pc(85) int local85 = -64; local85 < 0; local85++) {
							local92 = arg0[local13++];
							if (local92 != 0) {
								if (Static98.aByteArrayArrayArray8[local70][local79] == null) {
									Static98.aByteArrayArrayArray8[local70][local79] = new byte[4096];
								}
								Static98.aByteArrayArrayArray8[local70][local79][(-(local85 + 1) << 6) + local81] = local92;
								@Pc(131) byte local131 = arg0[local13++];
								if (Static114.aByteArrayArrayArray10[local70][local79] == null) {
									Static114.aByteArrayArrayArray10[local70][local79] = new byte[4096];
								}
								Static114.aByteArrayArrayArray10[local70][local79][(-(local85 + 1) << 6) + local81] = local131;
							}
						}
					}
				} else {
					for (local70 = -4096; local70 < 0; local70++) {
						local92 = arg0[local13++];
						if (local92 != 0) {
							local13++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIII)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 * arg1;
		@Pc(13) int local13 = local9 << 1;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg0 * arg0;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg0 << 1;
		@Pc(29) int local29 = local19 << 1;
		@Pc(38) int local38 = local19 - (local25 - 1) * local13;
		@Pc(48) int local48 = local9 * (1 - local25) + local29;
		@Pc(52) int local52 = local19 << 2;
		@Pc(60) int local60 = ((arg0 << 1) - 3) * local13;
		@Pc(64) int local64 = local9 << 2;
		@Pc(72) int local72 = local29 * 3;
		@Pc(78) int local78 = local52;
		@Pc(89) int local89 = (arg0 - 1) * local64;
		@Pc(104) int local104;
		@Pc(113) int local113;
		if (arg2 >= Static26.anInt554 && Static52.anInt1117 >= arg2) {
			local104 = Static130.method1827(Static200.anInt4074, arg4 + arg1, Static119.anInt2428);
			local113 = Static130.method1827(Static200.anInt4074, arg4 - arg1, Static119.anInt2428);
			Static16.method302(arg3, local113, local104, Static157.anIntArrayArray24[arg2]);
		}
		while (local21 > 0) {
			local21--;
			if (local48 < 0) {
				while (local48 < 0) {
					local38 += local78;
					local15++;
					local78 += local52;
					local48 += local72;
					local72 += local52;
				}
			}
			local104 = arg2 - local21;
			local113 = arg2 + local21;
			if (local38 < 0) {
				local38 += local78;
				local78 += local52;
				local48 += local72;
				local72 += local52;
				local15++;
			}
			local48 += -local89;
			if (Static26.anInt554 <= local113 && local104 <= Static52.anInt1117) {
				@Pc(204) int local204 = Static130.method1827(Static200.anInt4074, arg4 + local15, Static119.anInt2428);
				@Pc(213) int local213 = Static130.method1827(Static200.anInt4074, arg4 - local15, Static119.anInt2428);
				if (Static26.anInt554 <= local104) {
					Static16.method302(arg3, local213, local204, Static157.anIntArrayArray24[local104]);
				}
				if (Static52.anInt1117 >= local113) {
					Static16.method302(arg3, local213, local204, Static157.anIntArrayArray24[local113]);
				}
			}
			local38 += -local60;
			local89 -= local64;
			local60 -= local64;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1601(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)Lclient!oc;")
	public static Class70 method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static43.aClass70_456;
		} else if (local4 < -6) {
			return Static186.aClass70_1838;
		} else if (local4 < -3) {
			return Static127.aClass70_1194;
		} else if (local4 < 0) {
			return Static172.aClass70_1648;
		} else if (local4 > 9) {
			return Static22.aClass70_223;
		} else if (local4 > 6) {
			return Static1.aClass70_921;
		} else if (local4 > 3) {
			return Static208.aClass70_1242;
		} else if (local4 > 0) {
			return Static82.aClass70_801;
		} else {
			return Static150.aClass70_1454;
		}
	}
}
