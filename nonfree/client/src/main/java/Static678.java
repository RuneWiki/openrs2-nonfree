import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
	public static int anInt10941;

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array15;

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "[I")
	public static final int[] anIntArray632 = new int[32];

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBLclient!iga;II)Z")
	public static boolean method9024(@OriginalArg(0) int arg0, @OriginalArg(2) Class34_Sub1_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static355.aBoolean420 || !Static296.aBoolean335) {
			return false;
		} else if (Static304.anInt5127 < 100) {
			return false;
		} else if (Static674.method8987(arg0, arg3, arg2)) {
			@Pc(26) int local26 = arg3 << Static571.anInt9216;
			@Pc(30) int local30 = arg2 << Static571.anInt9216;
			@Pc(40) int local40 = Static582.aClass35Array3[arg0].method7461(arg2, arg3) - 1;
			@Pc(47) int local47 = local40 + arg1.method7847();
			if (arg1.aShort53 == 1) {
				if (!Static118.method7907(local26, local40, local47, local26, local30, local26, local30 + Static599.anInt7773, local47, local30)) {
					return false;
				} else if (Static118.method7907(local26, local40, local40, local26, local30, local26, local30 + Static599.anInt7773, local47, local30 + Static599.anInt7773)) {
					Static548.anInt8557++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort53 == 2) {
				if (!Static118.method7907(local26, local40, local47, local26, local30 + Static599.anInt7773, Static599.anInt7773 + local26, Static599.anInt7773 + local30, local47, Static599.anInt7773 + local30)) {
					return false;
				} else if (Static118.method7907(local26, local40, local47, Static599.anInt7773 + local26, Static599.anInt7773 + local30, Static599.anInt7773 + local26, Static599.anInt7773 + local30, local40, Static599.anInt7773 + local30)) {
					Static548.anInt8557++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort53 == 4) {
				if (!Static118.method7907(Static599.anInt7773 + local26, local40, local47, Static599.anInt7773 + local26, local30, Static599.anInt7773 + local26, Static599.anInt7773 + local30, local47, local30)) {
					return false;
				} else if (Static118.method7907(Static599.anInt7773 + local26, local40, local40, local26 + Static599.anInt7773, local30, Static599.anInt7773 + local26, local30 - -Static599.anInt7773, local47, Static599.anInt7773 + local30)) {
					Static548.anInt8557++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort53 == 8) {
				if (!Static118.method7907(local26, local40, local47, local26, local30, Static599.anInt7773 + local26, local30, local47, local30)) {
					return false;
				} else if (Static118.method7907(local26, local40, local47, Static599.anInt7773 + local26, local30, Static599.anInt7773 + local26, local30, local40, local30)) {
					Static548.anInt8557++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort53 == 16) {
				if (Static320.method4599(Static579.anInt9391 + local30, local47, local40, Static579.anInt9391, local26, Static579.anInt9391)) {
					Static548.anInt8557++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort53 == 32) {
				if (Static320.method4599(local30 + Static579.anInt9391, local47, local40, Static579.anInt9391, local26 + Static579.anInt9391, Static579.anInt9391)) {
					Static548.anInt8557++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort53 == 64) {
				if (Static320.method4599(local30, local47, local40, Static579.anInt9391, local26 + Static579.anInt9391, Static579.anInt9391)) {
					Static548.anInt8557++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort53 != 128) {
				return true;
			} else if (Static320.method4599(local30, local47, local40, Static579.anInt9391, local26, Static579.anInt9391)) {
				Static548.anInt8557++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!qba;Z)V")
	public static void method9025(@OriginalArg(0) Class34_Sub1_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class34_Sub1_Sub1_Sub2_Sub2) {
			@Pc(14) Class34_Sub1_Sub1_Sub2_Sub2 local14 = (Class34_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local14.aClass261_1 != null) {
				Static630.method8506(local14, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 != local14.aByte132);
				return;
			}
		} else if (arg0 instanceof Class34_Sub1_Sub1_Sub2_Sub1) {
			@Pc(43) Class34_Sub1_Sub1_Sub2_Sub1 local43 = (Class34_Sub1_Sub1_Sub2_Sub1) arg0;
			Static503.method6582(local43, local43.aByte132 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)Z")
	public static boolean method9026() {
		try {
			return Static139.method5490();
		} catch (@Pc(17) IOException local17) {
			Static226.method3385();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(80) String local80 = "T2 - " + (Static307.aClass171_79 == null ? -1 : Static307.aClass171_79.method3996()) + "," + (Static268.aClass171_64 == null ? -1 : Static268.aClass171_64.method3996()) + "," + (Static78.aClass171_15 == null ? -1 : Static78.aClass171_15.method3996()) + " - " + Static147.anInt2709 + "," + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] + Static534.anInt8358) + "," + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] + Static402.anInt6661) + " - ";
			for (@Pc(82) int local82 = 0; local82 < Static147.anInt2709 && local82 < 50; local82++) {
				local80 = local80 + Static459.aClass3_Sub4_Sub1_1.aByteArray90[local82] + ",";
			}
			Static456.method6140(local80, local22);
			Static316.method4541(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZ)I")
	public static int method9028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(34) int local34 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method9031(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg2 + arg1;
		while (local17 < local21) {
			@Pc(30) int local30 = arg0[local17++] & 0xFF;
			@Pc(61) int local61;
			if (local30 >= 128) {
				if (local30 < 192) {
					local61 = 65533;
				} else if (local30 < 224) {
					if (local21 > local17 && (arg0[local17] & 0xC0) == 128) {
						local61 = arg0[local17++] & 0x3F | (local30 & 0x1F) << 6;
						if (local61 < 128) {
							local61 = 65533;
						}
					} else {
						local61 = 65533;
					}
				} else if (local30 >= 240) {
					if (local30 >= 248) {
						local61 = 65533;
					} else if (local17 + 2 < local21 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128 && (arg0[local17 + 2] & 0xC0) == 128) {
						local61 = (local30 & 0x7) << 18 | arg0[local17++] << 12 & 0x3F000 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
						if (local61 >= 65536 && local61 <= 1114111) {
							local61 = 65533;
						} else {
							local61 = 65533;
						}
					} else {
						local61 = 65533;
					}
				} else if (local21 > local17 + 1 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128) {
					local61 = (local30 & 0xF) << 12 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
					if (local61 < 2048) {
						local61 = 65533;
					}
				} else {
					local61 = 65533;
				}
			} else if (local30 == 0) {
				local61 = 65533;
			} else {
				local61 = local30;
			}
			local8[local10++] = (char) local61;
		}
		return new String(local8, 0, local10);
	}
}
