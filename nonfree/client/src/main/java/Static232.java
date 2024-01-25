import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!on", name = "Y", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!on", name = "S", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_246 = new Class159(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!on", name = "W", descriptor = "I")
	public static int anInt4673 = 1;

	@OriginalMember(owner = "client!on", name = "X", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_247 = new Class159("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!pn;)I")
	public static int method4120(@OriginalArg(1) Class8_Sub1_Sub2_Sub2 arg0) {
		@Pc(13) Class141 local13 = arg0.aClass141_1;
		if (local13.anIntArray380 != null) {
			local13 = local13.method3908();
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local13.anInt4379;
		@Pc(31) Class40 local31 = arg0.method4347();
		if (arg0.aBoolean371) {
			local27 = local13.anInt4400;
		} else if (local31.anInt1443 == arg0.anInt4937 || local31.anInt1450 == arg0.anInt4937 || arg0.anInt4937 == local31.anInt1452 || arg0.anInt4937 == local31.anInt1466) {
			local27 = local13.anInt4385;
		} else if (local31.anInt1472 == arg0.anInt4937 || arg0.anInt4937 == local31.anInt1461 || local31.anInt1438 == arg0.anInt4937 || arg0.anInt4937 == local31.anInt1478) {
			local27 = local13.anInt4376;
		}
		return local27;
	}

	@OriginalMember(owner = "client!on", name = "i", descriptor = "(B)V")
	public static void method4122() {
		if (Static155.aClass114_3 != null) {
			Static155.aClass114_3.method3165();
			Static155.aClass114_3 = null;
		}
		Static33.method566();
		Static183.method3522();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static16.aClass170Array1[local17].method4593();
		}
		Static354.method5641(false);
		System.gc();
		Static19.method320();
		Static74.aBoolean135 = false;
		Static206.anInt4321 = -1;
		Static97.method2231(true);
		Static36.anInt1007 = 0;
		Static136.anInt3193 = 0;
		Static286.anInt6699 = 0;
		Static77.aBoolean143 = false;
		Static103.anInt2592 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static116.aClass187Array1.length; local56++) {
			Static116.aClass187Array1[local56] = null;
		}
		Static145.anInt3273 = 0;
		Static289.anInt5643 = 0;
		for (@Pc(83) int local83 = 0; local83 < 2048; local83++) {
			Static327.aClass8_Sub1_Sub2_Sub1Array1[local83] = null;
			Static1.aClass4_Sub11Array2[local83] = null;
		}
		for (@Pc(99) int local99 = 0; local99 < 32768; local99++) {
			Static169.aClass8_Sub1_Sub2_Sub2Array1[local99] = null;
		}
		Static165.aClass43_20.method1282();
		Static146.method2546();
		Static286.anInt6705 = 0;
		Static206.method3875();
		Static74.method1744();
		Static1.method4520();
		Static339.method10(true);
		try {
			Static366.method4253("loggedout", Static1.aClass134_7.anApplet1);
		} catch (@Pc(137) Throwable local137) {
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIBLclient!vq;IIIII)V")
	public static void method4123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class47 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface7 local11 = (Interface7) Static354.method5631(arg7, arg5, arg4);
		@Pc(19) Class18 local19;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local11 != null) {
			local19 = Static113.method2380(local11.method5594());
			local25 = local11.method5590() & 0x3;
			local29 = local11.method5589();
			if (local19.anInt525 == -1) {
				local44 = arg6;
				if (local19.anInt503 > 0) {
					local44 = arg1;
				}
				if (local29 == 0 || local29 == 2) {
					if (local25 == 0) {
						arg2.method2737(arg3, 4, local44, arg0);
					} else if (local25 == 1) {
						arg2.method2747(arg3, local44, 4, arg0);
					} else if (local25 == 2) {
						arg2.method2737(arg3 + 3, 4, local44, arg0);
					} else if (local25 == 3) {
						arg2.method2747(arg3, local44, 4, arg0 + 3);
					}
				}
				if (local29 == 3) {
					if (local25 == 0) {
						arg2.method2687(arg3, local44, 1, arg0, 1);
					} else if (local25 == 1) {
						arg2.method2687(arg3 + 3, local44, 1, arg0, 1);
					} else if (local25 == 2) {
						arg2.method2687(arg3 + 3, local44, 1, arg0 + 3, 1);
					} else if (local25 == 3) {
						arg2.method2687(arg3, local44, 1, arg0 + 3, 1);
					}
				}
				if (local29 == 2) {
					if (local25 == 0) {
						arg2.method2747(arg3, local44, 4, arg0);
					} else if (local25 == 1) {
						arg2.method2737(arg3 + 3, 4, local44, arg0);
					} else if (local25 == 2) {
						arg2.method2747(arg3, local44, 4, arg0 + 3);
					} else if (local25 == 3) {
						arg2.method2737(arg3, 4, local44, arg0);
					}
				}
			} else {
				Static288.method4866(arg3, arg0, arg2, local19, local25);
			}
		}
		local11 = (Interface7) Static347.method5528(arg7, arg5, arg4, mb.class);
		if (local11 != null) {
			local19 = Static113.method2380(local11.method5594());
			local25 = local11.method5590() & 0x3;
			local29 = local11.method5589();
			if (local19.anInt525 != -1) {
				Static288.method4866(arg3, arg0, arg2, local19, local25);
			} else if (local29 == 9) {
				local44 = -1118482;
				if (local19.anInt503 > 0) {
					local44 = -1179648;
				}
				if (local25 == 0 || local25 == 2) {
					arg2.method2704(arg3, arg3 + 3, local44, arg0, arg0 + 3);
				} else {
					arg2.method2704(arg3, arg3 + 3, local44, arg0 + 3, arg0);
				}
			}
		}
		local11 = (Interface7) Static172.method3324(arg7, arg5, arg4);
		if (local11 == null) {
			return;
		}
		local19 = Static113.method2380(local11.method5594());
		local25 = local11.method5590() & 0x3;
		if (local19.anInt525 != -1) {
			Static288.method4866(arg3, arg0, arg2, local19, local25);
		}
	}

	@OriginalMember(owner = "client!on", name = "j", descriptor = "(B)I")
	public static int method4124() {
		try {
			if (Static28.anInt6554 == 0) {
				if (Static208.method3879() - 5000L < Static333.aLong210) {
					return 0;
				}
				Static159.aClass185_2 = Static1.aClass134_7.method3760(Static156.anInt5228, Static89.aString25);
				Static185.aLong115 = Static208.method3879();
				Static28.anInt6554 = 1;
			}
			if (Static185.aLong115 + 30000L < Static208.method3879()) {
				return Static129.method2644(1000);
			}
			@Pc(89) int local89;
			@Pc(126) int local126;
			if (Static28.anInt6554 == 1) {
				if (Static159.aClass185_2.anInt5682 == 2) {
					return Static129.method2644(1001);
				}
				if (Static159.aClass185_2.anInt5682 != 1) {
					return -1;
				}
				Static155.aClass114_3 = new Class114((Socket) Static159.aClass185_2.anObject4, Static1.aClass134_7);
				Static159.aClass185_2 = null;
				local89 = 0;
				if (Static2.aBoolean7) {
					local89 = Static129.anInt3037;
				}
				Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
				Static15.aClass4_Sub11_Sub1_2.method3434(23);
				Static15.aClass4_Sub11_Sub1_2.method3452(local89);
				Static155.aClass114_3.method3163(Static15.aClass4_Sub11_Sub1_2.aByteArray55, Static15.aClass4_Sub11_Sub1_2.anInt3768);
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				local126 = Static155.aClass114_3.method3170();
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				if (local126 != 0) {
					return Static129.method2644(local126);
				}
				Static28.anInt6554 = 2;
			}
			if (Static28.anInt6554 == 2) {
				if (Static155.aClass114_3.method3161() < 2) {
					return -1;
				}
				Static73.anInt2041 = Static155.aClass114_3.method3170();
				Static73.anInt2041 <<= 0x8;
				Static73.anInt2041 += Static155.aClass114_3.method3170();
				Static28.anInt6554 = 3;
				Static65.aByteArray25 = new byte[Static73.anInt2041];
				Static282.anInt4758 = 0;
			}
			if (Static28.anInt6554 != 3) {
				return -1;
			}
			local89 = Static155.aClass114_3.method3161();
			if (local89 < 1) {
				return -1;
			}
			if (local89 > Static73.anInt2041 - Static282.anInt4758) {
				local89 = Static73.anInt2041 - Static282.anInt4758;
			}
			Static155.aClass114_3.method3168(local89, Static65.aByteArray25, Static282.anInt4758);
			Static282.anInt4758 += local89;
			if (Static73.anInt2041 > Static282.anInt4758) {
				return -1;
			} else if (Static354.method5633(Static65.aByteArray25)) {
				Static77.aClass10_Sub1Array1 = new Class10_Sub1[Static210.anInt4363];
				local126 = 0;
				for (@Pc(235) int local235 = Static140.anInt3220; local235 <= Static77.anInt2071; local235++) {
					@Pc(241) Class10_Sub1 local241 = Static43.method841(local235);
					if (local241 != null) {
						Static77.aClass10_Sub1Array1[local126++] = local241;
					}
				}
				Static223.aClass4_Sub35_1 = null;
				Static340.anInt6521 = 0;
				Static155.aClass114_3.method3165();
				Static28.anInt6554 = 0;
				Static65.aByteArray25 = null;
				Static155.aClass114_3 = null;
				Static247.anInt5052 = 0;
				Static333.aLong210 = Static208.method3879();
				return 0;
			} else {
				return Static129.method2644(1002);
			}
		} catch (@Pc(273) IOException local273) {
			return Static129.method2644(1003);
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V")
	public static void method4125(@OriginalArg(1) int arg0) {
		Static3.anInt109 = arg0;
		@Pc(7) Class198 local7 = Static28.aClass198_241;
		synchronized (Static28.aClass198_241) {
			Static28.aClass198_241.method5213();
		}
		local7 = Static88.aClass198_76;
		synchronized (Static88.aClass198_76) {
			Static88.aClass198_76.method5213();
		}
	}
}
