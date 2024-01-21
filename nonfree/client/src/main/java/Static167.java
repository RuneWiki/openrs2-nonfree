import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1959 = Static122.method531("auf der Hautpseite)3");

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
	public static int[] anIntArray384 = new int[] { 0, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 4, -1, 0, 2, 0, -2, 0, 7, 5, 4, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, -2, -1, 0, 0, -2, 0, 0, 6, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 1, 5, 0, 10, 0, 0, 0, 0, 0, 0, 0, -2, 8, 0, 0, 4, 0, 0, 0, 0, 3, 6, 0, 0, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 15, 11, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 11, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, -2, 0, 7, 0, 0, 0, 0, 2, 0, -2, 0, 5, 0, 8, 0, 2, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 14, -2, 0, 6, 0, 0, 0, 7, 0, 10, 0, 0, 0, 0, 6, 0, 2, 0, 0, 6, 0, 6, -2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 1, 0, 0, 0, 0, 2, 0, 6, -1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, -2, 12 };

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method2621() {
		for (@Pc(11) int local11 = 0; local11 < Static34.anInt835; local11++) {
			@Pc(17) int local17 = Static41.anIntArray94[local11]--;
			if (Static41.anIntArray94[local11] >= -10) {
				@Pc(88) Class66 local88 = Static117.aClass66Array1[local11];
				if (local88 == null) {
					local88 = Static187.method2241(Static129.aClass13_Sub1_16, Static176.anIntArray420[local11], 0);
					if (local88 == null) {
						continue;
					}
					Static41.anIntArray94[local11] += local88.method2239();
					Static117.aClass66Array1[local11] = local88;
				}
				if (Static41.anIntArray94[local11] < 0) {
					@Pc(209) int local209;
					if (Static166.anIntArray382[local11] == 0) {
						local209 = Static136.anInt3089;
					} else {
						@Pc(135) int local135 = (Static166.anIntArray382[local11] & 0xFF) * 128;
						@Pc(143) int local143 = Static166.anIntArray382[local11] >> 16 & 0xFF;
						@Pc(153) int local153 = local143 * 128 + 64 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169;
						if (local153 < 0) {
							local153 = -local153;
						}
						@Pc(166) int local166 = Static166.anIntArray382[local11] >> 8 & 0xFF;
						@Pc(176) int local176 = local166 * 128 + 64 - Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159;
						if (local176 < 0) {
							local176 = -local176;
						}
						@Pc(187) int local187 = local176 + local153 - 128;
						if (local135 < local187) {
							Static41.anIntArray94[local11] = -100;
							continue;
						}
						if (local187 < 0) {
							local187 = 0;
						}
						local209 = (local135 - local187) * Static51.anInt1201 / local135;
					}
					if (local209 > 0) {
						@Pc(220) Class3_Sub4_Sub1 local220 = local88.method2240().method203(Static127.aClass44_2);
						@Pc(225) Class3_Sub9_Sub1 local225 = Static183.method740(local220, local209);
						local225.method741(Static138.anIntArray331[local11] - 1);
						Static11.aClass3_Sub9_Sub4_1.method2223(local225);
					}
					Static41.anIntArray94[local11] = -100;
				}
			} else {
				Static34.anInt835--;
				for (@Pc(31) int local31 = local11; local31 < Static34.anInt835; local31++) {
					Static176.anIntArray420[local31] = Static176.anIntArray420[local31 + 1];
					Static117.aClass66Array1[local31] = Static117.aClass66Array1[local31 + 1];
					Static138.anIntArray331[local31] = Static138.anIntArray331[local31 + 1];
					Static41.anIntArray94[local31] = Static41.anIntArray94[local31 + 1];
					Static166.anIntArray382[local31] = Static166.anIntArray382[local31 + 1];
				}
				local11--;
			}
		}
		if (Static44.aBoolean70 && !Static130.method2165()) {
			if (Static69.anInt1602 != 0 && Static164.anInt3564 != -1) {
				Static69.method1224(0, Static11.aClass13_Sub1_4, Static164.anInt3564, Static69.anInt1602);
			}
			Static44.aBoolean70 = false;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method2622() {
		aClass73_1959 = null;
		aByteArrayArrayArray8 = null;
		anIntArray384 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public static void method2623(@OriginalArg(0) boolean arg0) {
		Static109.method1956();
		Static99.anInt2198++;
		if (Static99.anInt2198 < 50 && !arg0) {
			return;
		}
		Static99.anInt2198 = 0;
		if (Static14.aBoolean25 || Static42.aClass2_2 == null) {
			return;
		}
		Static139.aClass3_Sub12_Sub1_3.method1400(118);
		try {
			Static42.aClass2_2.method15(Static139.aClass3_Sub12_Sub1_3.anInt1793, Static139.aClass3_Sub12_Sub1_3.aByteArray16);
			Static139.aClass3_Sub12_Sub1_3.anInt1793 = 0;
		} catch (@Pc(49) IOException local49) {
			Static14.aBoolean25 = true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!f;I)[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] method2624(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		return Static133.method2204(arg0, arg2, arg1) ? Static12.method192() : null;
	}
}
