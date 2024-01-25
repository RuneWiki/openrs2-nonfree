import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public static int anInt3232 = 0;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!j", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
	public static void method2492(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(12, arg0);
		local8.method5523();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method2494() {
		@Pc(9) int local9 = Static56.aClass4_Sub9_Sub2_1.method5013();
		Static267.anInt4402 = Static56.aClass4_Sub9_Sub2_1.method5012();
		@Pc(17) int local17 = Static56.aClass4_Sub9_Sub2_1.method5045();
		@Pc(21) int local21 = Static56.aClass4_Sub9_Sub2_1.method5042();
		@Pc(32) boolean local32 = Static56.aClass4_Sub9_Sub2_1.method5046() == 1;
		Static35.method468(local9);
		Static56.aClass4_Sub9_Sub2_1.method5076();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static337.anInt5497 >> 3; local44++) {
				for (local48 = 0; local48 < Static282.anInt4644 >> 3; local48++) {
					local55 = Static56.aClass4_Sub9_Sub2_1.method5071(1);
					if (local55 == 1) {
						Static184.anIntArrayArrayArray3[local40][local44][local48] = Static56.aClass4_Sub9_Sub2_1.method5071(26);
					} else {
						Static184.anIntArrayArrayArray3[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static56.aClass4_Sub9_Sub2_1.method5074();
		local44 = (Static313.anInt5082 - Static56.aClass4_Sub9_Sub2_1.anInt6207) / 16;
		Static229.anIntArrayArray42 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static229.anIntArrayArray42[local48][local55] = Static56.aClass4_Sub9_Sub2_1.method4997();
			}
		}
		Static372.aByteArrayArray13 = null;
		Static271.aByteArrayArray10 = new byte[local44][];
		Static91.anIntArray131 = new int[local44];
		Static398.anIntArray495 = new int[local44];
		Static127.anIntArray182 = new int[local44];
		Static146.anIntArray220 = new int[local44];
		Static318.anIntArray417 = new int[local44];
		Static418.aByteArrayArray17 = new byte[local44][];
		Static225.anIntArray279 = null;
		Static375.aByteArrayArray14 = new byte[local44][];
		Static131.aByteArrayArray5 = new byte[local44][];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(180) int local180 = 0; local180 < Static337.anInt5497 >> 3; local180++) {
				for (@Pc(184) int local184 = 0; local184 < Static282.anInt4644 >> 3; local184++) {
					@Pc(194) int local194 = Static184.anIntArrayArrayArray3[local55][local180][local184];
					if (local194 != -1) {
						@Pc(203) int local203 = local194 >> 14 & 0x3FF;
						@Pc(209) int local209 = local194 >> 3 & 0x7FF;
						@Pc(220) int local220 = (local203 / 8 << 8) + (local209 / 8);
						for (@Pc(222) int local222 = 0; local222 < local44; local222++) {
							if (Static91.anIntArray131[local222] == local220) {
								local220 = -1;
								break;
							}
						}
						if (local220 != -1) {
							Static91.anIntArray131[local44] = local220;
							@Pc(255) int local255 = local220 >> 8 & 0xFF;
							@Pc(259) int local259 = local220 & 0xFF;
							Static318.anIntArray417[local44] = Static280.aClass211_68.method4384("m" + local255 + "_" + local259);
							Static146.anIntArray220[local44] = Static280.aClass211_68.method4384("l" + local255 + "_" + local259);
							Static127.anIntArray182[local44] = Static280.aClass211_68.method4384("um" + local255 + "_" + local259);
							Static398.anIntArray495[local44] = Static280.aClass211_68.method4384("ul" + local255 + "_" + local259);
							local44++;
						}
					}
				}
			}
		}
		Static326.method4297(10, local32, local17, local21);
	}
}
