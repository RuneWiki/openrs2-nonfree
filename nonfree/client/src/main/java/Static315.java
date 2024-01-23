import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public static int anInt6297;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "Lclient!en;")
	public static Class47 aClass47_8;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
	public static int anInt6303;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!ci;")
	public static Class26 aClass26_62;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString449 = "Loaded sprites";

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString450 = "green:";

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "Lclient!ci;")
	public static Class26 aClass26_61 = new Class26();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!qm;I)V")
	public static void method4761(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static251.aClass193_9 != null) {
			try {
				Static251.aClass193_9.method4697(0L);
				Static251.aClass193_9.method4696(local8);
				@Pc(22) int local22;
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (@Pc(48) int local48 = 0; local48 < 24; local48++) {
					local8[local48] = -1;
				}
			}
		}
		arg0.method2201(24, local8);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!th;)V")
	public static void method4762(@OriginalArg(1) Class168 arg0) {
		Static257.anInt5233 = arg0.method4069("runes");
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
	public static void method4763() {
		if (Static153.method2465() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static207.anInt4467 - 4 & 0xFF);
		@Pc(24) int local24 = Static207.anInt4467 % 104;
		@Pc(26) int local26;
		@Pc(33) int local33;
		for (local26 = 0; local26 < 4; local26++) {
			for (local33 = 0; local33 < 104; local33++) {
				Static53.aByteArrayArrayArray2[local26][local24][local33] = local20;
			}
		}
		if (Static185.anInt4085 == 3) {
			return;
		}
		for (local26 = 0; local26 < 2; local26++) {
			Static38.anIntArray120[local26] = -1000000;
			Static43.anIntArray130[local26] = 1000000;
			Static162.anIntArray323[local26] = 0;
			Static18.anIntArray44[local26] = 1000000;
			Static49.anIntArray146[local26] = 0;
		}
		if (Static106.anInt2378 != 1) {
			local26 = Static93.method1576(Static94.anInt2161, Static58.anInt1269, Static185.anInt4085);
			if (local26 - anInt6297 < 800 && (Static303.aByteArrayArrayArray19[Static185.anInt4085][Static58.anInt1269 >> 7][Static94.anInt2161 >> 7] & 0x4) != 0) {
				Static21.method453(false, Static7.aClass1_Sub2ArrayArrayArray1, 1, Static94.anInt2161 >> 7, Static58.anInt1269 >> 7);
			}
			return;
		}
		if ((Static303.aByteArrayArrayArray19[Static185.anInt4085][Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7][Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7] & 0x4) != 0) {
			Static21.method453(false, Static7.aClass1_Sub2ArrayArrayArray1, 0, Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7, Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7);
		}
		if (Static44.anInt1071 >= 310) {
			return;
		}
		local26 = Static58.anInt1269 >> 7;
		local33 = Static94.anInt2161 >> 7;
		@Pc(148) int local148 = Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7;
		@Pc(153) int local153 = Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7;
		@Pc(160) int local160;
		if (local153 > local33) {
			local160 = local153 - local33;
		} else {
			local160 = local33 - local153;
		}
		@Pc(174) int local174;
		if (local26 < local148) {
			local174 = local148 - local26;
		} else {
			local174 = local26 - local148;
		}
		if (local174 == 0 && local160 == 0 || local174 <= -104 || local174 >= 104 || local160 <= -104 || local160 >= 104) {
			Static66.method3525(null, "RC: " + local26 + "," + local33 + " " + local148 + "," + local153 + " " + Static159.anInt3527 + "," + Static217.anInt4673);
			return;
		}
		@Pc(241) int local241;
		@Pc(235) int local235;
		if (local160 >= local174) {
			local241 = local174 * 65536 / local160;
			local235 = 32768;
			while (local33 != local153) {
				if (local33 < local153) {
					local33++;
				} else if (local33 > local153) {
					local33--;
				}
				if ((Static303.aByteArrayArrayArray19[Static185.anInt4085][local26][local33] & 0x4) != 0) {
					Static21.method453(false, Static7.aClass1_Sub2ArrayArrayArray1, 1, local33, local26);
					break;
				}
				local235 += local241;
				if (local235 >= 65536) {
					if (local148 > local26) {
						local26++;
					} else if (local148 < local26) {
						local26--;
					}
					local235 -= 65536;
					if ((Static303.aByteArrayArrayArray19[Static185.anInt4085][local26][local33] & 0x4) != 0) {
						Static21.method453(false, Static7.aClass1_Sub2ArrayArrayArray1, 1, local33, local26);
						break;
					}
				}
			}
			return;
		}
		local235 = 32768;
		local241 = local160 * 65536 / local174;
		while (local148 != local26) {
			if (local26 < local148) {
				local26++;
			} else if (local148 < local26) {
				local26--;
			}
			if ((Static303.aByteArrayArrayArray19[Static185.anInt4085][local26][local33] & 0x4) != 0) {
				Static21.method453(false, Static7.aClass1_Sub2ArrayArrayArray1, 1, local33, local26);
				break;
			}
			local235 += local241;
			if (local235 >= 65536) {
				local235 -= 65536;
				if (local153 > local33) {
					local33++;
				} else if (local153 < local33) {
					local33--;
				}
				if ((Static303.aByteArrayArrayArray19[Static185.anInt4085][local26][local33] & 0x4) != 0) {
					Static21.method453(false, Static7.aClass1_Sub2ArrayArrayArray1, 1, local33, local26);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
	public static void method4764(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg2) / 2;
		@Pc(19) int local19 = arg0[local15];
		arg0[local15] = arg0[arg2];
		@Pc(27) int local27 = arg3;
		arg0[arg2] = local19;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg2; local47++) {
			if ((local47 & 0x1) + local19 > arg0[local47]) {
				@Pc(72) int local72 = arg0[local47];
				arg0[local47] = arg0[local27];
				arg0[local27] = local72;
				@Pc(86) Object local86 = arg1[local47];
				arg1[local47] = arg1[local27];
				arg1[local27++] = local86;
			}
		}
		arg0[arg2] = arg0[local27];
		arg0[local27] = local19;
		arg1[arg2] = arg1[local27];
		arg1[local27] = local35;
		method4764(arg0, arg1, local27 - 1, arg3);
		method4764(arg0, arg1, arg2, local27 + 1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)I")
	public static int method4766(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}
