import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[B")
	public static byte[] aByteArray65;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
	public static final int[] anIntArray425 = new int[6];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method4385() {
		@Pc(9) int local9 = Static585.aClass1_Sub35_Sub2_2.method5772();
		Static90.anInt1938 = Static585.aClass1_Sub35_Sub2_2.method5775();
		@Pc(24) boolean local24 = Static585.aClass1_Sub35_Sub2_2.method5793() == 1;
		@Pc(28) int local28 = Static585.aClass1_Sub35_Sub2_2.method5742();
		@Pc(39) int local39 = Static585.aClass1_Sub35_Sub2_2.method5779();
		Static19.method187();
		Static404.method5619(local28);
		Static585.aClass1_Sub35_Sub2_2.method5809();
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(64) int local64;
		for (@Pc(49) int local49 = 0; local49 < 4; local49++) {
			for (local53 = 0; local53 < Static71.anInt1410 >> 3; local53++) {
				for (local57 = 0; local57 < Static471.anInt8012 >> 3; local57++) {
					local64 = Static585.aClass1_Sub35_Sub2_2.method5806(1);
					if (local64 == 1) {
						Static192.anIntArrayArrayArray5[local49][local53][local57] = Static585.aClass1_Sub35_Sub2_2.method5806(26);
					} else {
						Static192.anIntArrayArrayArray5[local49][local53][local57] = -1;
					}
				}
			}
		}
		Static585.aClass1_Sub35_Sub2_2.method5814();
		local53 = (Static445.anInt7693 - Static585.aClass1_Sub35_Sub2_2.anInt7214) / 16;
		Static342.anIntArrayArray132 = new int[local53][4];
		for (local57 = 0; local57 < local53; local57++) {
			for (local64 = 0; local64 < 4; local64++) {
				Static342.anIntArrayArray132[local57][local64] = Static585.aClass1_Sub35_Sub2_2.method5804();
			}
		}
		Static101.anIntArray182 = null;
		Static269.aByteArrayArray20 = new byte[local53][];
		Static566.anIntArray710 = new int[local53];
		Static405.anIntArray542 = new int[local53];
		Static103.aByteArrayArray11 = new byte[local53][];
		Static259.anIntArray367 = new int[local53];
		Static481.aByteArrayArray30 = null;
		aByteArrayArray21 = new byte[local53][];
		Static173.aByteArrayArray15 = new byte[local53][];
		Static279.anIntArray375 = new int[local53];
		Static162.anIntArray263 = new int[local53];
		local53 = 0;
		for (local64 = 0; local64 < 4; local64++) {
			for (@Pc(187) int local187 = 0; local187 < Static71.anInt1410 >> 3; local187++) {
				for (@Pc(191) int local191 = 0; local191 < Static471.anInt8012 >> 3; local191++) {
					@Pc(201) int local201 = Static192.anIntArrayArrayArray5[local64][local187][local191];
					if (local201 != -1) {
						@Pc(210) int local210 = local201 >> 14 & 0x3FF;
						@Pc(216) int local216 = local201 >> 3 & 0x7FF;
						@Pc(227) int local227 = (local210 / 8 << 8) + (local216 / 8);
						for (@Pc(229) int local229 = 0; local229 < local53; local229++) {
							if (local227 == Static566.anIntArray710[local229]) {
								local227 = -1;
								break;
							}
						}
						if (local227 != -1) {
							Static566.anIntArray710[local53] = local227;
							@Pc(262) int local262 = local227 >> 8 & 0xFF;
							@Pc(266) int local266 = local227 & 0xFF;
							Static259.anIntArray367[local53] = Static559.aClass270_116.method5677("m" + local262 + "_" + local266);
							Static162.anIntArray263[local53] = Static559.aClass270_116.method5677("l" + local262 + "_" + local266);
							Static279.anIntArray375[local53] = Static559.aClass270_116.method5677("um" + local262 + "_" + local266);
							Static405.anIntArray542[local53] = Static559.aClass270_116.method5677("ul" + local262 + "_" + local266);
							local53++;
						}
					}
				}
			}
		}
		Static498.method6987(local39, local24, local9, 11);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method4387() {
		Static307.aClass134_8.method6941(Static2.aFloat1, Static262.aFloat116, Static306.aFloat112);
	}
}
