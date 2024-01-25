import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "[[[Lclient!dc;")
	public static Class51[][][] aClass51ArrayArrayArray3;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static int anInt4296 = 0;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_21 = new Class107(64);

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_98 = new Class140("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_141 = new Class221(60, -2);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)V")
	public static void method3636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static181.anIntArray308[arg1] = arg0;
		@Pc(22) Class2_Sub17 local22 = (Class2_Sub17) Static180.aClass41_19.method902((long) arg1);
		if (local22 == null) {
			local22 = new Class2_Sub17(Static22.method285() + 500L);
			Static180.aClass41_19.method901(local22, (long) arg1);
		} else {
			local22.aLong74 = Static22.method285() + 500L;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V")
	public static void method3638(@OriginalArg(1) boolean arg0) {
		Static219.aBoolean424 = arg0;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(63) int local63;
		if (!Static219.aBoolean424) {
			@Pc(368) int local368 = Static273.aClass2_Sub12_Sub2_3.method3104();
			@Pc(379) boolean local379 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
			local36 = Static273.aClass2_Sub12_Sub2_3.method3109();
			local40 = Static273.aClass2_Sub12_Sub2_3.method3146();
			Static17.method257(local40);
			local48 = (Static275.anInt5636 - Static273.aClass2_Sub12_Sub2_3.anInt3606) / 16;
			Static307.anIntArrayArray53 = new int[local48][4];
			for (local52 = 0; local52 < local48; local52++) {
				for (local56 = 0; local56 < 4; local56++) {
					Static307.anIntArrayArray53[local52][local56] = Static273.aClass2_Sub12_Sub2_3.method3135();
				}
			}
			Static134.anIntArray230 = new int[local48];
			Static80.aByteArrayArray3 = new byte[local48][];
			Static348.anIntArray219 = new int[local48];
			Static351.anIntArray518 = new int[local48];
			Static25.anIntArray50 = new int[local48];
			Static107.anIntArray176 = null;
			Static121.aByteArrayArray8 = new byte[local48][];
			Static238.aByteArrayArray12 = new byte[local48][];
			Static356.anIntArray525 = new int[local48];
			Static84.aByteArrayArray4 = new byte[local48][];
			Static77.aByteArrayArray2 = null;
			local48 = 0;
			for (local56 = (local36 - (Static66.anInt1177 >> 4)) / 8; local56 <= (local36 + (Static66.anInt1177 >> 4)) / 8; local56++) {
				for (local63 = (local368 - (Static12.anInt213 >> 4)) / 8; local63 <= (local368 + (Static12.anInt213 >> 4)) / 8; local63++) {
					Static25.anIntArray50[local48] = local63 + (local56 << 8);
					Static134.anIntArray230[local48] = Static63.aClass104_43.method2769("m" + local56 + "_" + local63);
					Static348.anIntArray219[local48] = Static63.aClass104_43.method2769("l" + local56 + "_" + local63);
					Static356.anIntArray525[local48] = Static63.aClass104_43.method2769("um" + local56 + "_" + local63);
					Static351.anIntArray518[local48] = Static63.aClass104_43.method2769("ul" + local56 + "_" + local63);
					local48++;
				}
			}
			Static266.method4676(local368, false, local379, local36);
			return;
		}
		@Pc(28) boolean local28 = Static273.aClass2_Sub12_Sub2_3.method3146() == 1;
		@Pc(32) int local32 = Static273.aClass2_Sub12_Sub2_3.method3104();
		local36 = Static273.aClass2_Sub12_Sub2_3.method3116();
		local40 = Static273.aClass2_Sub12_Sub2_3.method3140();
		Static17.method257(local40);
		Static273.aClass2_Sub12_Sub2_3.method3165();
		for (local48 = 0; local48 < 4; local48++) {
			for (local52 = 0; local52 < Static66.anInt1177 >> 3; local52++) {
				for (local56 = 0; local56 < Static12.anInt213 >> 3; local56++) {
					local63 = Static273.aClass2_Sub12_Sub2_3.method3172(1);
					if (local63 == 1) {
						Static53.anIntArrayArrayArray4[local48][local52][local56] = Static273.aClass2_Sub12_Sub2_3.method3172(26);
					} else {
						Static53.anIntArrayArrayArray4[local48][local52][local56] = -1;
					}
				}
			}
		}
		Static273.aClass2_Sub12_Sub2_3.method3164();
		local52 = (Static275.anInt5636 - Static273.aClass2_Sub12_Sub2_3.anInt3606) / 16;
		Static307.anIntArrayArray53 = new int[local52][4];
		for (local56 = 0; local56 < local52; local56++) {
			for (local63 = 0; local63 < 4; local63++) {
				Static307.anIntArrayArray53[local56][local63] = Static273.aClass2_Sub12_Sub2_3.method3135();
			}
		}
		Static84.aByteArrayArray4 = new byte[local52][];
		Static121.aByteArrayArray8 = new byte[local52][];
		Static348.anIntArray219 = new int[local52];
		Static77.aByteArrayArray2 = null;
		Static25.anIntArray50 = new int[local52];
		Static356.anIntArray525 = new int[local52];
		Static238.aByteArrayArray12 = new byte[local52][];
		Static80.aByteArrayArray3 = new byte[local52][];
		Static351.anIntArray518 = new int[local52];
		Static134.anIntArray230 = new int[local52];
		Static107.anIntArray176 = null;
		local52 = 0;
		for (local63 = 0; local63 < 4; local63++) {
			for (@Pc(189) int local189 = 0; local189 < Static66.anInt1177 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static12.anInt213 >> 3; local193++) {
					@Pc(203) int local203 = Static53.anIntArrayArrayArray4[local63][local189][local193];
					if (local203 != -1) {
						@Pc(213) int local213 = local203 >> 14 & 0x3FF;
						@Pc(219) int local219 = local203 >> 3 & 0x7FF;
						@Pc(229) int local229 = local219 / 8 + (local213 / 8 << 8);
						for (@Pc(231) int local231 = 0; local231 < local52; local231++) {
							if (local229 == Static25.anIntArray50[local231]) {
								local229 = -1;
								break;
							}
						}
						if (local229 != -1) {
							Static25.anIntArray50[local52] = local229;
							@Pc(260) int local260 = local229 >> 8 & 0xFF;
							@Pc(264) int local264 = local229 & 0xFF;
							Static134.anIntArray230[local52] = Static63.aClass104_43.method2769("m" + local260 + "_" + local264);
							Static348.anIntArray219[local52] = Static63.aClass104_43.method2769("l" + local260 + "_" + local264);
							Static356.anIntArray525[local52] = Static63.aClass104_43.method2769("um" + local260 + "_" + local264);
							Static351.anIntArray518[local52] = Static63.aClass104_43.method2769("ul" + local260 + "_" + local264);
							local52++;
						}
					}
				}
			}
		}
		Static266.method4676(local36, false, local28, local32);
	}
}
