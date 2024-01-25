import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	public static int anInt2100 = 0;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "[I")
	public static final int[] anIntArray120 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "Lclient!gi;")
	public static final Class131 aClass131_10 = new Class131();

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	public static int anInt2105 = 0;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
	public static void method1777() {
		@Pc(16) int local16 = Static110.aByteArrayArray7.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (Static110.aByteArrayArray7[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static388.anInt6476; local28++) {
					if (Static448.anIntArray394[local18] == Static316.anIntArray298[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static316.anIntArray298[Static388.anInt6476] = Static448.anIntArray394[local18];
					local26 = Static388.anInt6476++;
				}
				@Pc(72) Class3_Sub4 local72 = new Class3_Sub4(Static110.aByteArrayArray7[local18]);
				@Pc(74) int local74 = 0;
				while (Static110.aByteArrayArray7[local18].length > local72.anInt9739 && local74 < 511 && Static52.anInt1140 < 1023) {
					@Pc(93) int local93 = local26 | local74++ << 6;
					@Pc(97) int local97 = local72.method7951();
					@Pc(101) int local101 = local97 >> 14;
					@Pc(107) int local107 = local97 >> 7 & 0x3F;
					@Pc(111) int local111 = local97 & 0x3F;
					@Pc(125) int local125 = (Static448.anIntArray394[local18] >> 8) * 64 + local107 - Static534.anInt8358;
					@Pc(138) int local138 = local111 + (Static448.anIntArray394[local18] & 0xFF) * 64 - Static402.anInt6661;
					@Pc(145) Class261 local145 = Static267.aClass196_1.method4478(local72.method7951());
					@Pc(152) Class3_Sub52 local152 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local93);
					if (local152 == null && (local145.aByte106 & 0x1) > 0 && Static566.anInt9142 == local101 && local125 >= 0 && Static98.anInt361 > local125 + local145.anInt6807 && local138 >= 0 && local145.anInt6807 + local138 < Static438.anInt7120) {
						@Pc(197) Class34_Sub1_Sub1_Sub2_Sub2 local197 = new Class34_Sub1_Sub1_Sub2_Sub2();
						local197.anInt9671 = local93;
						@Pc(205) Class3_Sub52 local205 = new Class3_Sub52(local197);
						Static105.aClass333_11.method7488((long) local93, local205);
						Static129.aClass3_Sub52Array3[Static331.anInt5501++] = local205;
						Static603.anIntArray537[Static52.anInt1140++] = local93;
						local197.anInt9667 = Static122.anInt2190;
						local197.method7886(local145);
						local197.method7862(local197.aClass261_1.anInt6807);
						local197.anInt9639 = local197.aClass261_1.anInt6806 << 3;
						local197.method7864(true, local197.aClass261_1.aByte100 + 4 << 11 & 0x3BB7);
						local197.method7879(true, local197.method7866(), local138, local101, local125);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIC)C")
	public static char method1778(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIZII)J")
	public static long method1779(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		Static387.aCalendar3.clear();
		Static387.aCalendar3.set(arg1, arg2, arg0, 12, 0, 0);
		return Static387.aCalendar3.getTime().getTime();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)Z")
	public static boolean method1780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static65.method1164(arg0, arg1) || Static430.method5939(arg0, arg1);
	}
}
