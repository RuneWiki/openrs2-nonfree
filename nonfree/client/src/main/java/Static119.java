import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_1068 = Static41.method597("scrollbar");

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_1069 = Static41.method597("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
	public static int[] anIntArray338 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!od;")
	private static Class60 aClass60_1070 = Static41.method597("Cancel");

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_1071 = Static41.method597("va");

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_1072 = aClass60_1070;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_1073 = Static41.method597("<col=00ff80>");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBLclient!sa;)I")
	public static int method1900(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub14 arg1) {
		if (arg1.anIntArrayArray71 == null || arg0 >= arg1.anIntArrayArray71.length) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg1.anIntArrayArray71[arg0];
			@Pc(27) int local27 = 0;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local29++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 1) {
					local38 = Static99.anIntArray76[local25[local29++]];
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 2) {
					local38 = Static41.anIntArray114[local25[local29++]];
				}
				if (local36 == 3) {
					local38 = Static7.anIntArray9[local25[local29++]];
				}
				if (local36 == 16) {
					local40 = 2;
				}
				@Pc(96) int local96;
				@Pc(107) Class4_Sub14 local107;
				@Pc(112) int local112;
				@Pc(125) int local125;
				if (local36 == 4) {
					local96 = local25[local29++] << 16;
					@Pc(103) int local103 = local96 + local25[local29++];
					local107 = Static61.method991(local103);
					local112 = local25[local29++];
					if (local112 != -1 && (!Static112.method1854(local112).aBoolean125 || Static29.aBoolean36)) {
						for (local125 = 0; local125 < local107.anIntArray312.length; local125++) {
							if (local107.anIntArray312[local125] == local112 + 1) {
								local38 += local107.anIntArray311[local125];
							}
						}
					}
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 5) {
					local38 = Static53.anIntArray141[local25[local29++]];
				}
				if (local36 == 6) {
					local38 = Class63.anIntArray230[Static41.anIntArray114[local25[local29++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static53.anIntArray141[local25[local29++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt413;
				}
				if (local36 == 9) {
					for (local96 = 0; local96 < 25; local96++) {
						if (Static68.aBooleanArray11[local96]) {
							local38 += Static41.anIntArray114[local96];
						}
					}
				}
				if (local36 == 10) {
					local96 = local25[local29++] << 16;
					local96 += local25[local29++];
					local107 = Static61.method991(local96);
					local112 = local25[local29++];
					if (local112 != -1 && (!Static112.method1854(local112).aBoolean125 || Static29.aBoolean36)) {
						for (local125 = 0; local125 < local107.anIntArray312.length; local125++) {
							if (local112 + 1 == local107.anIntArray312[local125]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static25.anInt847;
				}
				if (local36 == 12) {
					local38 = Static109.anInt2593;
				}
				if (local36 == 13) {
					local96 = Static53.anIntArray141[local25[local29++]];
					@Pc(324) int local324 = local25[local29++];
					local38 = (local96 & 0x1 << local324) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local96 = local25[local29++];
					local38 = Static59.method973(local96);
				}
				if (local36 == 18) {
					local38 = Static49.anInt1207 + (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 >> 7);
				}
				if (local36 == 19) {
					local38 = Static60.anInt2956 + (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 >> 7);
				}
				if (local36 == 20) {
					local38 = local25[local29++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local27 += local38;
					}
					if (local31 == 1) {
						local27 -= local38;
					}
					if (local31 == 2 && local38 != 0) {
						local27 /= local38;
					}
					if (local31 == 3) {
						local27 *= local38;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(425) Exception local425) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method1901() {
		aClass60_1068 = null;
		aClass60_1070 = null;
		aByteArrayArrayArray7 = null;
		aClass60_1071 = null;
		anIntArray338 = null;
		aClass60_1072 = null;
		aCRC32_2 = null;
		aClass60_1069 = null;
		aClass60_1073 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIB)V")
	public static void method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class4_Sub14 local16 = Static53.method867(arg1, arg2);
		if (local16 != null && local16.anObjectArray19 != null) {
			@Pc(25) Class4_Sub21 local25 = new Class4_Sub21();
			local25.anObjectArray28 = local16.anObjectArray19;
			local25.aClass4_Sub14_14 = local16;
			Static28.method1353(local25);
		}
		Static45.anInt1122 = arg1;
		Static111.anInt2632 = arg0;
		Static49.anInt1204 = arg2;
		Static86.aBoolean71 = true;
		Static36.method558(local16);
	}
}
