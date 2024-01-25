import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "Lclient!ofa;")
	public static Class117 aClass117_8;

	@OriginalMember(owner = "client!faa", name = "q", descriptor = "I")
	public static int anInt8583;

	@OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
	public static int anInt8584 = -60;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)B")
	public static byte method7396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public static void method7402() {
		@Pc(8) int local8 = Static503.aByteArrayArray8.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static503.aByteArrayArray8[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static170.anInt3104; local20++) {
					if (Static338.anIntArray438[local20] == Static594.anIntArray784[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static338.anIntArray438[Static170.anInt3104] = Static594.anIntArray784[local10];
					local18 = Static170.anInt3104++;
				}
				@Pc(67) Class5_Sub12 local67 = new Class5_Sub12(Static503.aByteArrayArray8[local10]);
				@Pc(69) int local69 = 0;
				while (local67.anInt10154 < Static503.aByteArrayArray8[local10].length && local69 < 511 && Static58.anInt926 < 1023) {
					@Pc(88) int local88 = local69++ << 6 | local18;
					@Pc(92) int local92 = local67.method8631();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(120) int local120 = (Static594.anIntArray784[local10] >> 8) * 64 + local102 - Static113.anInt1785;
					@Pc(133) int local133 = local106 + (Static594.anIntArray784[local10] & 0xFF) * 64 - Static622.anInt10087;
					@Pc(142) Class271 local142 = Static258.aClass138_1.method3202(local67.method8631());
					@Pc(149) Class5_Sub13 local149 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local88);
					if (local149 == null && (local142.aByte97 & 0x1) > 0 && Static315.anInt5514 == local96 && local120 >= 0 && Static111.anInt1752 > local120 + local142.anInt7335 && local133 >= 0 && Static279.anInt4567 > local133 + local142.anInt7335) {
						@Pc(190) Class14_Sub1_Sub1_Sub3_Sub2 local190 = new Class14_Sub1_Sub1_Sub3_Sub2();
						local190.anInt2960 = local88;
						@Pc(198) Class5_Sub13 local198 = new Class5_Sub13(local190);
						Static51.aClass81_11.method1607(local198, (long) local88);
						Static367.aClass5_Sub13Array1[Static108.anInt1716++] = local198;
						Static191.anIntArray287[Static58.anInt926++] = local88;
						local190.anInt2935 = Static235.anInt3998;
						local190.method2534(local142);
						local190.method2525(local190.aClass271_1.anInt7335);
						local190.anInt2956 = local190.aClass271_1.anInt7342 << 3;
						local190.method2521((local190.aClass271_1.aByte99 + 4 & 0xED800007) << 11, true);
						local190.method2530(true, local120, local133, local190.method2509(), local96);
					}
				}
			}
		}
	}
}
