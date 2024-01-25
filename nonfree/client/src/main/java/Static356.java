import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!kda;")
	public static Class160 aClass160_77;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5623(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static108.anInt2509 >= 100 && !Static341.aBoolean425 || Static108.anInt2509 >= 200) {
			Static289.method4881(Static209.aClass114_90.method3330(Static315.anInt5993));
			return;
		}
		@Pc(25) String local25 = Static361.method5639(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static108.anInt2509; local30++) {
			@Pc(37) String local37 = Static361.method5639(Static366.aStringArray40[local30]);
			if (local37 != null && local37.equals(local25)) {
				Static289.method4881(arg0 + Static508.aClass114_162.method3330(Static315.anInt5993));
				return;
			}
			if (Static417.aStringArray28[local30] != null) {
				@Pc(67) String local67 = Static361.method5639(Static417.aStringArray28[local30]);
				if (local67 != null && local67.equals(local25)) {
					Static289.method4881(arg0 + Static508.aClass114_162.method3330(Static315.anInt5993));
					return;
				}
			}
		}
		for (@Pc(101) int local101 = 0; local101 < Static35.anInt1297; local101++) {
			@Pc(108) String local108 = Static361.method5639(Static159.aStringArray13[local101]);
			if (local108 != null && local108.equals(local25)) {
				Static289.method4881(Static407.aClass114_139.method3330(Static315.anInt5993) + arg0 + Static526.aClass114_168.method3330(Static315.anInt5993));
				return;
			}
			if (Static529.aStringArray47[local101] != null) {
				@Pc(143) String local143 = Static361.method5639(Static529.aStringArray47[local101]);
				if (local143 != null && local143.equals(local25)) {
					Static289.method4881(Static407.aClass114_139.method3330(Static315.anInt5993) + arg0 + Static526.aClass114_168.method3330(Static315.anInt5993));
					return;
				}
			}
		}
		if (Static361.method5639(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36).equals(local25)) {
			Static289.method4881(Static419.aClass114_141.method3330(Static315.anInt5993));
		} else {
			Static444.method6416(Static145.aClass186_47);
			Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(arg0));
			Static192.aClass1_Sub13_Sub2_1.method3061(arg0);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(CZ)B")
	public static byte method5624(@OriginalArg(0) char arg0) {
		@Pc(34) byte local34;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local34 = (byte) arg0;
		} else if (arg0 == '€') {
			local34 = -128;
		} else if (arg0 == '‚') {
			local34 = -126;
		} else if (arg0 == 'ƒ') {
			local34 = -125;
		} else if (arg0 == '„') {
			local34 = -124;
		} else if (arg0 == '…') {
			local34 = -123;
		} else if (arg0 == '†') {
			local34 = -122;
		} else if (arg0 == '‡') {
			local34 = -121;
		} else if (arg0 == 'ˆ') {
			local34 = -120;
		} else if (arg0 == '‰') {
			local34 = -119;
		} else if (arg0 == 'Š') {
			local34 = -118;
		} else if (arg0 == '‹') {
			local34 = -117;
		} else if (arg0 == 'Œ') {
			local34 = -116;
		} else if (arg0 == 'Ž') {
			local34 = -114;
		} else if (arg0 == '‘') {
			local34 = -111;
		} else if (arg0 == '’') {
			local34 = -110;
		} else if (arg0 == '“') {
			local34 = -109;
		} else if (arg0 == '”') {
			local34 = -108;
		} else if (arg0 == '•') {
			local34 = -107;
		} else if (arg0 == '–') {
			local34 = -106;
		} else if (arg0 == '—') {
			local34 = -105;
		} else if (arg0 == '˜') {
			local34 = -104;
		} else if (arg0 == '™') {
			local34 = -103;
		} else if (arg0 == 'š') {
			local34 = -102;
		} else if (arg0 == '›') {
			local34 = -101;
		} else if (arg0 == 'œ') {
			local34 = -100;
		} else if (arg0 == 'ž') {
			local34 = -98;
		} else if (arg0 == 'Ÿ') {
			local34 = -97;
		} else {
			local34 = 63;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!vp;I)V")
	public static void method5626(@OriginalArg(0) Class309 arg0) {
		@Pc(7) Class309 local7 = Static488.method7056(arg0);
		@Pc(15) int local15;
		@Pc(12) int local12;
		if (local7 == null) {
			local12 = Static90.anInt2326;
			local15 = Static290.anInt6867;
		} else {
			local12 = local7.anInt8752;
			local15 = local7.anInt8790;
		}
		Static11.method240(false, local15, arg0, local12);
		Static140.method2957(arg0, local12, local15);
	}
}
