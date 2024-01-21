import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "Lclient!rf;")
	public static Class70 aClass70_790 = Static49.method1293("VOLL");

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
	public static final int anInt2426 = 4;

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "[I")
	public static int[] anIntArray238 = new int[anInt2426];

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "[[Lclient!pc;")
	public static Class64[][] aClass64ArrayArray1 = new Class64[anInt2426][500];

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "Lclient!rf;")
	public static Class70 aClass70_791 = Static49.method1293("::autoshadow off");

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
	public static int anInt2425 = 0;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_792 = Static49.method1293("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ih", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_793 = Static49.method1293(")1j");

	@OriginalMember(owner = "client!ih", name = "gb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_794 = Static49.method1293(" loggt sich aus)3");

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)Z")
	public static boolean method1786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static144.method2837(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static2.method144(local10 + 1, Static92.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local14 + 1) && Static2.method144(local10 + 128 - 1, Static92.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static2.method144(local10 + 128 - 1, Static92.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static2.method144(local10 + 1, Static92.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	public static void method1787() {
		aClass64ArrayArray1 = null;
		aClass70_791 = null;
		aClass70_793 = null;
		aClass70_790 = null;
		anIntArray238 = null;
		aClass70_792 = null;
		aClass70_794 = null;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
	public static void method1788() {
		for (@Pc(11) int local11 = 0; local11 < Static88.anInt2601; local11++) {
			@Pc(17) int local17 = Static166.anIntArray411[local11]--;
			if (Static166.anIntArray411[local11] >= -10) {
				@Pc(86) Class47 local86 = Static12.aClass47Array1[local11];
				if (local86 == null) {
					local86 = Static187.method2174(Static113.aClass76_Sub1_10, Static15.anIntArray30[local11], 0);
					if (local86 == null) {
						continue;
					}
					Static166.anIntArray411[local11] += local86.method2177();
					Static12.aClass47Array1[local11] = local86;
				}
				if (Static166.anIntArray411[local11] < 0) {
					@Pc(126) int local126;
					if (Static179.anIntArray426[local11] == 0) {
						local126 = Static174.anInt4470;
					} else {
						@Pc(136) int local136 = (Static179.anIntArray426[local11] & 0xFF) * 128;
						@Pc(144) int local144 = Static179.anIntArray426[local11] >> 8 & 0xFF;
						@Pc(152) int local152 = Static179.anIntArray426[local11] >> 16 & 0xFF;
						@Pc(162) int local162 = local152 * 128 + 64 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030;
						if (local162 < 0) {
							local162 = -local162;
						}
						@Pc(179) int local179 = local144 * 128 + 64 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001;
						if (local179 < 0) {
							local179 = -local179;
						}
						@Pc(190) int local190 = local162 + local179 - 128;
						if (local136 < local190) {
							Static166.anIntArray411[local11] = -100;
							continue;
						}
						if (local190 < 0) {
							local190 = 0;
						}
						local126 = Static140.anInt3678 * (local136 - local190) / local136;
					}
					if (local126 > 0) {
						@Pc(229) Class1_Sub20_Sub1 local229 = local86.method2176().method2781(Static26.aClass77_1);
						@Pc(234) Class1_Sub8_Sub4 local234 = Static190.method2981(local229, local126);
						local234.method2968(Static30.anIntArray98[local11] - 1);
						Static105.aClass1_Sub8_Sub1_1.method1090(local234);
					}
					Static166.anIntArray411[local11] = -100;
				}
			} else {
				Static88.anInt2601--;
				for (@Pc(33) int local33 = local11; local33 < Static88.anInt2601; local33++) {
					Static15.anIntArray30[local33] = Static15.anIntArray30[local33 + 1];
					Static12.aClass47Array1[local33] = Static12.aClass47Array1[local33 + 1];
					Static30.anIntArray98[local33] = Static30.anIntArray98[local33 + 1];
					Static166.anIntArray411[local33] = Static166.anIntArray411[local33 + 1];
					Static179.anIntArray426[local33] = Static179.anIntArray426[local33 + 1];
				}
				local11--;
			}
		}
		if (Static100.aBoolean115 && !Static174.method3429()) {
			if (Static134.anInt3479 != 0 && Static96.anInt2801 != -1) {
				Static34.method876(Static134.anInt3479, Static124.aClass76_Sub1_12, 0, Static96.anInt2801);
			}
			Static100.aBoolean115 = false;
		} else if (Static134.anInt3479 != 0 && Static96.anInt2801 != -1 && !Static174.method3429()) {
			Static131.aClass1_Sub9_Sub1_3.method1283(173);
			Static131.aClass1_Sub9_Sub1_3.method1259(Static96.anInt2801);
			Static96.anInt2801 = -1;
		}
	}
}
