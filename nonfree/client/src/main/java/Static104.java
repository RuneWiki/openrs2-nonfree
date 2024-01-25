import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Z")
	public static boolean aBoolean155 = true;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!wl;")
	public static final Class377 aClass377_2 = new Class377();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IJBI)V")
	public static void method1716(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static522.method7786(local17, true, 0, local10, arg0, 0, arg2, 0);
			return;
		}
		@Pc(45) Class312 local45 = Static283.aClass210_2.method5629(local31);
		@Pc(58) int local58;
		@Pc(61) int local61;
		if (local17 == 0 || local17 == 2) {
			local58 = local45.anInt9244;
			local61 = local45.anInt9235;
		} else {
			local58 = local45.anInt9235;
			local61 = local45.anInt9244;
		}
		@Pc(72) int local72 = local45.anInt9198;
		if (local17 != 0) {
			local72 = (local72 << local17 & 0xF) + (local72 >> 4 - local17);
		}
		Static522.method7786(0, true, local72, 0, arg0, local58, arg2, local61);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1717(@OriginalArg(1) String arg0) {
		if (!Static194.aClass112_1.aBoolean263) {
			return -1;
		} else if (Static51.aHashtable1.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static186.method3361(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static311.aString74 + local20;
			if (!Static511.aClass353_103.method8405("", local33)) {
				return -1;
			} else if (Static511.aClass353_103.method8397(local33)) {
				@Pc(57) byte[] local57 = Static511.aClass353_103.method8426(local33, "");
				@Pc(63) File local63;
				try {
					local63 = Static93.method1523(local20);
				} catch (@Pc(65) RuntimeException local65) {
					return -1;
				}
				if (local57 == null || local63 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static169.method3112(local63);
				if (local82 != null && local57.length == local82.length) {
					for (@Pc(95) int local95 = 0; local95 < local82.length; local95++) {
						if (local82[local95] != local57[local95]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static194.aClass112_1.method3223(local63, local57);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static21.method339(arg0, local63);
				return 100;
			} else {
				return Static511.aClass353_103.method8418(local33);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLclient!vt;)V")
	public static void method1718(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub40_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method8619(1) == 1;
		if (local17) {
			Static87.anIntArray119[Static26.anInt506++] = arg0;
		}
		@Pc(32) int local32 = arg1.method8619(2);
		@Pc(40) Class20_Sub2_Sub2_Sub1_Sub1 local40 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[arg0];
		if (local32 != 0) {
			@Pc(153) int local153;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local32 == 1) {
				local153 = arg1.method8619(3);
				local158 = local40.anIntArray335[0];
				local163 = local40.anIntArray336[0];
				if (local153 == 0) {
					local163--;
					local158--;
				} else if (local153 == 1) {
					local163--;
				} else if (local153 == 2) {
					local163--;
					local158++;
				} else if (local153 == 3) {
					local158--;
				} else if (local153 == 4) {
					local158++;
				} else if (local153 == 5) {
					local163++;
					local158--;
				} else if (local153 == 6) {
					local163++;
				} else if (local153 == 7) {
					local158++;
					local163++;
				}
				if (local17) {
					local40.anInt1207 = local163;
					local40.aBoolean76 = true;
					local40.anInt1204 = local158;
				} else {
					local40.method1021(Static114.aByteArray40[arg0], local158, local163);
				}
			} else if (local32 == 2) {
				local153 = arg1.method8619(4);
				local158 = local40.anIntArray335[0];
				local163 = local40.anIntArray336[0];
				if (local153 == 0) {
					local158 -= 2;
					local163 -= 2;
				} else if (local153 == 1) {
					local163 -= 2;
					local158--;
				} else if (local153 == 2) {
					local163 -= 2;
				} else if (local153 == 3) {
					local163 -= 2;
					local158++;
				} else if (local153 == 4) {
					local163 -= 2;
					local158 += 2;
				} else if (local153 == 5) {
					local158 -= 2;
					local163--;
				} else if (local153 == 6) {
					local158 += 2;
					local163--;
				} else if (local153 == 7) {
					local158 -= 2;
				} else if (local153 == 8) {
					local158 += 2;
				} else if (local153 == 9) {
					local158 -= 2;
					local163++;
				} else if (local153 == 10) {
					local163++;
					local158 += 2;
				} else if (local153 == 11) {
					local163 += 2;
					local158 -= 2;
				} else if (local153 == 12) {
					local163 += 2;
					local158--;
				} else if (local153 == 13) {
					local163 += 2;
				} else if (local153 == 14) {
					local163 += 2;
					local158++;
				} else if (local153 == 15) {
					local163 += 2;
					local158 += 2;
				}
				if (local17) {
					local40.aBoolean76 = true;
					local40.anInt1204 = local158;
					local40.anInt1207 = local163;
				} else {
					local40.method1021(Static114.aByteArray40[arg0], local158, local163);
				}
			} else {
				local153 = arg1.method8619(1);
				@Pc(426) int local426;
				@Pc(434) int local434;
				@Pc(448) int local448;
				@Pc(456) int local456;
				if (local153 == 0) {
					local158 = arg1.method8619(12);
					local163 = local158 >> 10;
					local426 = local158 >> 5 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local434 = local158 & 0x1F;
					if (local434 > 15) {
						local434 -= 32;
					}
					local448 = local40.anIntArray335[0] + local426;
					local456 = local40.anIntArray336[0] + local434;
					if (local17) {
						local40.aBoolean76 = true;
						local40.anInt1204 = local448;
						local40.anInt1207 = local456;
					} else {
						local40.method1021(Static114.aByteArray40[arg0], local448, local456);
					}
					local40.aByte131 = local40.aByte130 = (byte) (local40.aByte131 + local163 & 0x3);
					if (Static492.method7384(local448, local456)) {
						local40.aByte130++;
					}
					if (arg0 == Static229.anInt4561) {
						if (local40.aByte131 != Static175.anInt3636) {
							Static133.aBoolean183 = true;
						}
						Static175.anInt3636 = local40.aByte131;
					}
				} else {
					local158 = arg1.method8619(30);
					local163 = local158 >> 28;
					local426 = local158 >> 14 & 0x3FFF;
					local434 = local158 & 0x3FFF;
					local448 = (Static606.anInt8651 + local40.anIntArray335[0] + local426 & 0x3FFF) - Static606.anInt8651;
					local456 = (local40.anIntArray336[0] + Static195.anInt3961 + local434 & 0x3FFF) - Static195.anInt3961;
					if (local17) {
						local40.anInt1204 = local448;
						local40.aBoolean76 = true;
						local40.anInt1207 = local456;
					} else {
						local40.method1021(Static114.aByteArray40[arg0], local448, local456);
					}
					local40.aByte131 = local40.aByte130 = (byte) (local40.aByte131 + local163 & 0x3);
					if (Static492.method7384(local448, local456)) {
						local40.aByte130++;
					}
					if (Static229.anInt4561 == arg0) {
						Static175.anInt3636 = local40.aByte131;
					}
				}
			}
		} else if (local17) {
			local40.aBoolean76 = false;
		} else if (Static229.anInt4561 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(68) Class260 local68 = Static592.aClass260Array1[arg0] = new Class260();
			local68.anInt7979 = (local40.anIntArray336[0] + Static195.anInt3961 >> 6) + (Static606.anInt8651 + local40.anIntArray335[0] >> 6 << 14) + (local40.aByte131 << 28);
			if (local40.anInt1219 == -1) {
				local68.anInt7980 = local40.aClass278_7.method7147();
			} else {
				local68.anInt7980 = local40.anInt1219;
			}
			local68.aBoolean535 = local40.aBoolean74;
			local68.anInt7978 = local40.anInt5572;
			if (local40.anInt1213 > 0) {
				Static539.method7915(local40);
			}
			Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[arg0] = null;
			if (arg1.method8619(1) != 0) {
				Static123.method2042(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method1720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static578.method5705(arg0)) {
			Static237.method4122(Static605.aClass302ArrayArray4[arg0], arg1);
		}
	}
}
