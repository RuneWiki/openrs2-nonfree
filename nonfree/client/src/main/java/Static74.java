import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!dl;")
	public static final Class90 aClass90_3 = new Class90(16);

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_19 = new Class387(57, 3);

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!el;")
	public static final Class109 aClass109_33 = new Class109(50, 10);

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public static int anInt1194 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method1182(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += (long) (local22 - 64);
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += (long) (local22 + 1 - 97);
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += (long) (local22 + 27 - 48);
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		if (63 < 12) {
			method1184((byte) 62, 104);
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBIIII)I")
	public static int method1183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static242.aClass22Array3 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(15) int local15 = arg3 >> 9;
			@Pc(19) int local19 = arg2 >> 9;
			if (arg1 < 0 || arg4 < 0 || arg1 > Static544.anInt9261 - 1 || Static282.anInt4887 - 1 < arg4) {
				return 0;
			} else if (local15 >= 1 && local19 >= 1 && local15 <= Static544.anInt9261 - 1 && Static282.anInt4887 - 1 >= local19) {
				@Pc(97) boolean local97 = (Static220.aByteArrayArrayArray14[1][arg3 >> 9][arg2 >> 9] & 0x2) != 0;
				@Pc(125) boolean local125;
				@Pc(142) boolean local142;
				if ((arg3 & 0x1FF) == 0) {
					local125 = (Static220.aByteArrayArrayArray14[1][local15 - 1][arg2 >> 9] & 0x2) != 0;
					local142 = (Static220.aByteArrayArrayArray14[1][local15][arg2 >> 9] & 0x2) != 0;
					if (local142 != local125) {
						local97 = (Static220.aByteArrayArrayArray14[1][arg1][arg4] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x1FF) == 0) {
					local125 = (Static220.aByteArrayArrayArray14[1][arg3 >> 9][local19 - 1] & 0x2) != 0;
					local142 = (Static220.aByteArrayArrayArray14[1][arg3 >> 9][local19] & 0x2) != 0;
					if (local125 != local142) {
						local97 = (Static220.aByteArrayArrayArray14[1][arg1][arg4] & 0x2) != 0;
					}
				}
				if (local97) {
					arg0++;
				}
				return Static242.aClass22Array3[arg0].method8032(arg3, arg2);
			} else {
				return 0;
			}
		} else {
			return Static242.aClass22Array3[arg0].method8032(arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)Z")
	public static boolean method1184(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 48 || arg1 == 5 || arg1 == 21 || arg1 == 50 || arg1 == 60) {
			return true;
		} else {
			if (arg0 <= 124) {
				aBoolean97 = true;
			}
			return arg1 == 10 || arg1 == 1007;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method1186() {
		@Pc(7) int local7 = Static116.anInt3318;
		@Pc(9) int[] local9 = Static88.anIntArray464;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class8_Sub1_Sub3_Sub2_Sub1 local19 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt7022 > 0) {
				local19.anInt7022--;
				if (local19.anInt7022 == 0) {
					local19.aString92 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static247.anInt4256; local54++) {
			@Pc(61) long local61 = (long) Static671.anIntArray620[local54];
			@Pc(67) Class5_Sub35 local67 = (Class5_Sub35) Static623.aClass291_43.method6993(local61, 1);
			if (local67 != null) {
				@Pc(72) Class8_Sub1_Sub3_Sub2_Sub2 local72 = local67.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				if (local72.anInt7022 > 0) {
					local72.anInt7022--;
					if (local72.anInt7022 == 0) {
						local72.aString92 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public static int method1187(@OriginalArg(0) String arg0) {
		if (!Static580.aClass230_5.aBoolean471) {
			return -1;
		} else if (Static357.aHashtable8.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static590.method8465(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(36) String local36 = Static114.aString32 + local22;
			if (!Static357.aClass208_80.method4989("", local36)) {
				return -1;
			} else if (Static357.aClass208_80.method5006(local36)) {
				@Pc(62) byte[] local62 = Static357.aClass208_80.method4999("", local36);
				@Pc(68) File local68;
				try {
					local68 = Static527.method7593(local22);
				} catch (@Pc(77) RuntimeException local77) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(87) boolean local87 = true;
				@Pc(91) byte[] local91 = Static443.method6568(local68);
				if (local91 != null && local62.length == local91.length) {
					for (@Pc(110) int local110 = 0; local110 < local91.length; local110++) {
						if (local62[local110] != local91[local110]) {
							local87 = false;
							break;
						}
					}
				} else {
					local87 = false;
				}
				try {
					if (!local87) {
						Static580.aClass230_5.method5351(local68, local62);
					}
				} catch (@Pc(146) Throwable local146) {
					return -1;
				}
				Static400.method5894(local68, arg0);
				return 100;
			} else {
				return Static357.aClass208_80.method4987(local36);
			}
		}
	}
}
