import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!ga;")
	public static Interface4 anInterface4_9;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard4;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_10 = new Class237(8, 2);

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	public static int anInt4244 = 0;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "I")
	public static int anInt4251 = 0;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "I")
	public static int anInt4252 = 0;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void method3527(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		Static452.method5933(arg2, arg3, arg0, arg4, null, -1, arg1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!kk;)V")
	public static void method3529(@OriginalArg(1) Class31_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class31_Sub2_Sub1_Sub2) {
			@Pc(14) Class31_Sub2_Sub1_Sub2 local14 = (Class31_Sub2_Sub1_Sub2) arg0;
			if (local14.aClass53_1 != null) {
				Static30.method603(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 != local14.aByte100, local14);
				return;
			}
		} else if (arg0 instanceof Class31_Sub2_Sub1_Sub1) {
			@Pc(35) Class31_Sub2_Sub1_Sub1 local35 = (Class31_Sub2_Sub1_Sub1) arg0;
			Static398.method5315(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 != local35.aByte100, local35);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method3540() {
		if (Static38.aClass135_Sub1_1.method4241(Static143.anInt2766) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static244.anInt4494 - 4 & 0xFF);
		@Pc(33) int local33 = Static244.anInt4494 % Static195.anInt3537;
		@Pc(39) int local39;
		for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
			for (local39 = 0; local39 < Static118.anInt2419; local39++) {
				Static22.aByteArrayArrayArray10[local35][local33][local39] = local21;
			}
		}
		if (Static357.anInt5881 == 3) {
			return;
		}
		for (local39 = 0; local39 < 2; local39++) {
			Static257.anIntArray392[local39] = -1000000;
			Static24.anIntArray48[local39] = 1000000;
			Static397.anIntArray590[local39] = 0;
			Static188.anIntArray301[local39] = 1000000;
			Static19.anIntArray42[local39] = 0;
		}
		@Pc(133) int local133;
		if (Static345.anInt5797 != 1) {
			local133 = Static301.method4312(Static357.anInt5881, Static139.anInt2727, Static92.anInt1946);
			if (local133 - Static142.anInt5535 >= 800 || (Static2.aByteArrayArrayArray1[Static357.anInt5881][Static139.anInt2727 >> 7][Static92.anInt1946 >> 7] & 0x4) == 0) {
				return;
			}
			Static400.method5338(false, 1, client.lb, Static92.anInt1946 >> 7, Static139.anInt2727 >> 7);
			return;
		}
		if ((Static2.aByteArrayArrayArray1[Static357.anInt5881][Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7][Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7] & 0x4) != 0) {
			Static400.method5338(false, 0, client.lb, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7);
		}
		if (Static296.anInt5167 >= 2560) {
			return;
		}
		local133 = Static139.anInt2727 >> 7;
		@Pc(137) int local137 = Static92.anInt1946 >> 7;
		@Pc(142) int local142 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7;
		@Pc(147) int local147 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7;
		@Pc(159) int local159;
		if (local142 > local133) {
			local159 = local142 - local133;
		} else {
			local159 = local133 - local142;
		}
		@Pc(174) int local174;
		if (local137 < local147) {
			local174 = local147 - local137;
		} else {
			local174 = local137 - local147;
		}
		if ((local159 != 0 || local174 != 0) && local159 > (-Static195.anInt3537) && Static195.anInt3537 > local159 && local174 > -Static118.anInt2419 && local174 < Static118.anInt2419) {
			@Pc(253) int local253;
			@Pc(255) int local255;
			if (local174 >= local159) {
				local253 = local159 * 65536 / local174;
				local255 = 32768;
				while (local137 != local147) {
					if (local137 < local147) {
						local137++;
					} else if (local147 < local137) {
						local137--;
					}
					if ((Static2.aByteArrayArrayArray1[Static357.anInt5881][local133][local137] & 0x4) != 0) {
						Static400.method5338(false, 1, client.lb, local137, local133);
						return;
					}
					local255 += local253;
					if (local255 >= 65536) {
						local255 -= 65536;
						if (local142 > local133) {
							local133++;
						} else if (local133 > local142) {
							local133--;
						}
						if ((Static2.aByteArrayArrayArray1[Static357.anInt5881][local133][local137] & 0x4) != 0) {
							Static400.method5338(false, 1, client.lb, local137, local133);
							return;
						}
					}
				}
				return;
			}
			local253 = local174 * 65536 / local159;
			local255 = 32768;
			while (local133 != local142) {
				if (local133 < local142) {
					local133++;
				} else if (local133 > local142) {
					local133--;
				}
				if ((Static2.aByteArrayArrayArray1[Static357.anInt5881][local133][local137] & 0x4) != 0) {
					Static400.method5338(false, 1, client.lb, local137, local133);
					return;
				}
				local255 += local253;
				if (local255 >= 65536) {
					local255 -= 65536;
					if (local147 > local137) {
						local137++;
					} else if (local137 > local147) {
						local137--;
					}
					if ((Static2.aByteArrayArrayArray1[Static357.anInt5881][local133][local137] & 0x4) != 0) {
						Static400.method5338(false, 1, client.lb, local137, local133);
						return;
					}
				}
			}
			return;
		}
		Static158.method2570(null, "RC: " + local133 + "," + local137 + " " + local142 + "," + local147 + " " + Static165.anInt3049 + "," + Static345.anInt5799);
		return;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Lclient!uq;")
	public static Class251 method3544(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static437.aClass251ArrayArray2[local7] == null || Static437.aClass251ArrayArray2[local7][local11] == null) {
			@Pc(25) boolean local25 = Static125.method2231(local7);
			if (!local25) {
				return null;
			}
		}
		return Static437.aClass251ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method3545() {
		for (@Pc(7) int local7 = 0; local7 < Static259.anInt4646; local7++) {
			@Pc(13) Class74 local13 = Static113.aClass74Array1[local7];
			if (local13.aByte46 == 2) {
				if (local13.aClass1_Sub19_Sub1_2 == null) {
					local13.anInt2294 = Integer.MIN_VALUE;
				} else {
					Static59.aClass1_Sub19_Sub2_1.method2185(local13.aClass1_Sub19_Sub1_2);
				}
			}
		}
	}
}
