import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "[[Lclient!wk;")
	public static Class214[][] aClass214ArrayArray1;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	public static int anInt4959;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array19;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
	public static int anInt4961;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "J")
	public static long aLong146 = 0L;

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "[S")
	public static final short[] aShortArray94 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
	public static void method4329() {
		if (Static33.method465() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static347.anInt6633 - 4 & 0xFF);
		@Pc(23) int local23 = Static347.anInt6633 % Static24.anInt454;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static240.anInt4832; local29++) {
				aByteArrayArrayArray9[local25][local23][local29] = local19;
			}
		}
		if (Static322.anInt6250 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static78.anIntArray99[local29] = -1000000;
			Static34.anIntArray49[local29] = 1000000;
			Static189.anIntArray45[local29] = 0;
			Static341.anIntArray540[local29] = 1000000;
			Static30.anIntArray34[local29] = 0;
		}
		@Pc(104) int local104;
		if (Static81.anInt1498 != 1) {
			local104 = Static168.method2721(Static190.anInt3870, Static322.anInt6250, Static316.anInt6169);
			if (local104 - Static86.anInt1541 < 800 && (Static1.aByteArrayArrayArray1[Static322.anInt6250][Static190.anInt3870 >> 7][Static316.anInt6169 >> 7] & 0x4) != 0) {
				Static144.method2186(Static316.anInt6169 >> 7, 1, false, Static212.aClass106ArrayArrayArray2, Static190.anInt3870 >> 7);
				return;
			}
			return;
		}
		if ((Static1.aByteArrayArrayArray1[Static322.anInt6250][Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7][Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7] & 0x4) != 0) {
			Static144.method2186(Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7, 0, false, Static212.aClass106ArrayArrayArray2, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7);
		}
		if (Static184.anInt3721 >= 2560) {
			return;
		}
		local104 = Static190.anInt3870 >> 7;
		@Pc(183) int local183 = Static316.anInt6169 >> 7;
		@Pc(188) int local188 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7;
		@Pc(193) int local193 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7;
		@Pc(201) int local201;
		if (local104 < local188) {
			local201 = local188 - local104;
		} else {
			local201 = local104 - local188;
		}
		@Pc(220) int local220;
		if (local183 >= local193) {
			local220 = local183 - local193;
		} else {
			local220 = local193 - local183;
		}
		if (local201 == 0 && local220 == 0 || -Static24.anInt454 >= local201 || local201 >= Static24.anInt454 || -Static240.anInt4832 >= local220 || Static240.anInt4832 <= local220) {
			Static38.method554(null, "RC: " + local104 + "," + local183 + " " + local188 + "," + local193 + " " + Static182.anInt3662 + "," + Static169.anInt6312);
			return;
		}
		@Pc(296) int local296;
		@Pc(298) int local298;
		if (local220 >= local201) {
			local296 = local201 * 65536 / local220;
			local298 = 32768;
			while (local193 != local183) {
				if (local183 < local193) {
					local183++;
				} else if (local193 < local183) {
					local183--;
				}
				if ((Static1.aByteArrayArrayArray1[Static322.anInt6250][local104][local183] & 0x4) != 0) {
					Static144.method2186(local183, 1, false, Static212.aClass106ArrayArrayArray2, local104);
					return;
				}
				local298 += local296;
				if (local298 >= 65536) {
					if (local104 < local188) {
						local104++;
					} else if (local104 > local188) {
						local104--;
					}
					local298 -= 65536;
					if ((Static1.aByteArrayArrayArray1[Static322.anInt6250][local104][local183] & 0x4) != 0) {
						Static144.method2186(local183, 1, false, Static212.aClass106ArrayArrayArray2, local104);
						return;
					}
				}
			}
			return;
		}
		local296 = local220 * 65536 / local201;
		local298 = 32768;
		while (local104 != local188) {
			if (local188 > local104) {
				local104++;
			} else if (local188 < local104) {
				local104--;
			}
			if ((Static1.aByteArrayArrayArray1[Static322.anInt6250][local104][local183] & 0x4) != 0) {
				Static144.method2186(local183, 1, false, Static212.aClass106ArrayArrayArray2, local104);
				return;
			}
			local298 += local296;
			if (local298 >= 65536) {
				if (local183 < local193) {
					local183++;
				} else if (local183 > local193) {
					local183--;
				}
				local298 -= 65536;
				if ((Static1.aByteArrayArrayArray1[Static322.anInt6250][local104][local183] & 0x4) != 0) {
					Static144.method2186(local183, 1, false, Static212.aClass106ArrayArrayArray2, local104);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(B)V")
	public static void method4334() {
		if (Static29.aFrame1 != null) {
			return;
		}
		@Pc(18) Container local18;
		if (Static241.aFrame2 == null) {
			local18 = Static77.aClass118_7.anApplet1;
		} else {
			local18 = Static241.aFrame2;
		}
		Static264.anInt5404 = local18.getSize().width;
		Static319.anInt6199 = local18.getSize().height;
		@Pc(36) Insets local36;
		if (Static241.aFrame2 == local18) {
			local36 = Static241.aFrame2.getInsets();
			Static264.anInt5404 -= local36.right + local36.left;
			Static319.anInt6199 -= local36.bottom + local36.top;
		}
		if (Static104.method1587() == 1) {
			Static343.anInt6572 = (Static264.anInt5404 - 765) / 2;
			Static164.anInt3090 = 765;
			Static54.anInt1024 = 0;
			Static79.anInt5259 = 503;
		} else if (Static355.anInt6753 < 96 && Static74.anInt1413 == 0) {
			@Pc(87) int local87 = Static264.anInt5404 > 1024 ? 1024 : Static264.anInt5404;
			Static343.anInt6572 = (Static264.anInt5404 - local87) / 2;
			Static164.anInt3090 = local87;
			@Pc(105) int local105 = Static319.anInt6199 <= 768 ? Static319.anInt6199 : 768;
			Static54.anInt1024 = 0;
			Static79.anInt5259 = local105;
		} else {
			Static343.anInt6572 = 0;
			Static79.anInt5259 = Static319.anInt6199;
			Static164.anInt3090 = Static264.anInt5404;
			Static54.anInt1024 = 0;
		}
		if (Static278.anInt6305 != 0) {
			@Pc(133) boolean local133;
			if (Static164.anInt3090 < 1024 && Static79.anInt5259 < 768) {
				local133 = true;
			} else {
				local133 = false;
			}
		}
		Static34.aCanvas1.setSize(Static164.anInt3090, Static79.anInt5259);
		if (Static107.aClass129_4 != null) {
			Static107.aClass129_4.method4974();
		}
		if (Static241.aFrame2 == local18) {
			local36 = Static241.aFrame2.getInsets();
			Static34.aCanvas1.setLocation(local36.left + Static343.anInt6572, local36.top - -Static54.anInt1024);
		} else {
			Static34.aCanvas1.setLocation(Static343.anInt6572, Static54.anInt1024);
		}
		if (Static270.anInt5491 != -1) {
			Static219.method3921(true);
		}
		Static220.method3946();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!uo;IILclient!hh;III)V")
	public static void method4335(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class92 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Interface7 local9 = null;
		if (arg0 == 0) {
			local9 = (Interface7) Static3.method15(arg5, arg2, arg4);
		}
		if (arg0 == 1) {
			local9 = (Interface7) Static74.method1139(arg5, arg2, arg4);
		}
		if (arg0 == 2) {
			local9 = (Interface7) Static284.method4725(arg5, arg2, arg4, sc.class);
		}
		if (arg0 == 3) {
			local9 = (Interface7) Static136.method5506(arg5, arg2, arg4);
		}
		if (local9 == null) {
			return;
		}
		@Pc(60) int local60 = local9.method5414();
		@Pc(64) int local64 = local9.method5413();
		@Pc(70) Class84 local70 = Static108.method1650(local9.method5410());
		if (local70.method1631()) {
			Static321.method5328(arg5, arg2, arg4, local70);
		}
		if (local9.method5412()) {
			local9.method5415(arg1);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				Static175.method2829(arg5, arg2, arg4);
				return;
			}
			if (arg0 == 2) {
				Static4.method20(arg5, arg2, arg4, sc.class);
				if (local70.anInt2006 == 0 || Static24.anInt454 <= arg2 + local70.anInt1988 || local70.anInt1988 + arg4 >= Static240.anInt4832 || Static24.anInt454 <= local70.anInt2035 + arg2 || Static240.anInt4832 <= local70.anInt2035 + arg4) {
					return;
				}
				arg3.method1762(local70.anInt2035, arg4, local70.aBoolean137, arg2, !local70.aBoolean132, local64, local70.anInt1988);
			} else if (arg0 == 3) {
				Static69.method1042(arg5, arg2, arg4);
				if (local70.anInt2006 == 1) {
					arg3.method1756(arg4, arg2);
					return;
				}
			}
			return;
		}
		Static191.method5353(arg5, arg2, arg4);
		if (local70.anInt2006 != 0) {
			arg3.method1760(arg4, !local70.aBoolean132, local60, local64, arg2, local70.aBoolean137);
			return;
		}
	}
}
