import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "Lclient!nj;")
	public static final Class3_Sub25 aClass3_Sub25_7 = new Class3_Sub25(new byte[5000]);

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
	public static int anInt5635 = 0;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "Lclient!la;")
	public static final Class136 aClass136_156 = new Class136(106, 2);

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "Lclient!of;")
	public static final Class174 aClass174_163 = new Class174("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIII)V")
	public static void method4671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class103 local3 = new Class103();
		local3.anInt2965 = arg1 >> Static437.anInt7308;
		local3.anInt2955 = arg2 >> Static437.anInt7308;
		local3.anInt2953 = arg3 >> Static437.anInt7308;
		local3.anInt2952 = arg4 >> Static437.anInt7308;
		local3.anInt2950 = arg0;
		local3.anInt2963 = arg1;
		local3.anInt2964 = arg2;
		local3.anInt2962 = arg3;
		local3.anInt2960 = arg4;
		local3.anInt2954 = arg5;
		local3.anInt2967 = arg6;
		Static178.aClass103Array1[Static339.anInt5688++] = local3;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method4672() {
		Static13.method239((long) Static172.anInt3107, Static413.aClass167_11);
		if (Static343.anInt5785 != -1) {
			Static275.method3806(Static343.anInt5785);
		}
		for (@Pc(19) int local19 = 0; local19 < Static100.anInt1815; local19++) {
			if (Static391.aBooleanArray22[local19]) {
				Static15.aBooleanArray3[local19] = true;
			}
			Static375.aBooleanArray21[local19] = Static391.aBooleanArray22[local19];
			Static391.aBooleanArray22[local19] = false;
		}
		Static185.anInt3401 = Static172.anInt3107;
		if (Static413.aClass167_11.method6024()) {
			Static185.aBoolean257 = true;
		}
		if (Static343.anInt5785 != -1) {
			Static100.anInt1815 = 0;
			Static61.method1152();
		}
		Static413.aClass167_11.H();
		Static384.method5329(Static413.aClass167_11);
		@Pc(66) int local66 = Static123.method1958();
		if (local66 == -1) {
			local66 = Static302.anInt5198;
		}
		if (local66 == -1) {
			local66 = Static122.anInt2179;
		}
		Static371.method5206(local66);
		Static46.anInt814 = 0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
	public static void method4676() {
		Static234.anInt4001 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static339.anInt5688; local3++) {
			@Pc(8) Class103 local8 = Static178.aClass103Array1[local3];
			@Pc(12) int local12;
			if (Static107.anIntArray94 != null) {
				for (local12 = 0; local12 < Static107.anIntArray94.length; local12++) {
					if (Static107.anIntArray94[local12] != -1000000 && (local8.anInt2954 <= Static107.anIntArray94[local12] || local8.anInt2967 <= Static107.anIntArray94[local12]) && (local8.anInt2963 <= Static251.anIntArray395[local12] || local8.anInt2964 <= Static251.anIntArray395[local12]) && (local8.anInt2963 >= Static105.anIntArray92[local12] || local8.anInt2964 >= Static105.anIntArray92[local12]) && (local8.anInt2962 <= Static427.anIntArray460[local12] || local8.anInt2960 <= Static427.anIntArray460[local12]) && (local8.anInt2962 >= Static92.anIntArray76[local12] || local8.anInt2960 >= Static92.anIntArray76[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt2950 == 1) {
				local12 = local8.anInt2965 + Static24.anInt2908 - Static366.anInt6203;
				if (local12 >= 0 && local12 <= Static24.anInt2908 + Static24.anInt2908) {
					local110 = local8.anInt2953 + Static24.anInt2908 - Static465.anInt3909;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static24.anInt2908 + Static24.anInt2908) {
						continue;
					}
					local128 = local8.anInt2952 + Static24.anInt2908 - Static465.anInt3909;
					if (local128 > Static24.anInt2908 + Static24.anInt2908) {
						local128 = Static24.anInt2908 + Static24.anInt2908;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static39.aBooleanArrayArray1[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static257.anInt4288 - local8.anInt2963;
						if (local164 > Static391.anInt6550) {
							local8.anInt2961 = 1;
						} else {
							if (local164 >= -Static391.anInt6550) {
								continue;
							}
							local8.anInt2961 = 2;
							local164 = -local164;
						}
						local8.anInt2958 = (local8.anInt2962 - Static344.anInt5818 << 8) / local164;
						local8.anInt2957 = (local8.anInt2960 - Static344.anInt5818 << 8) / local164;
						local8.anInt2956 = (local8.anInt2954 - Static207.anInt3661 << 8) / local164;
						local8.anInt2968 = (local8.anInt2967 - Static207.anInt3661 << 8) / local164;
						Static368.aClass103Array2[Static234.anInt4001++] = local8;
					}
				}
			} else if (local8.anInt2950 == 2) {
				local12 = local8.anInt2953 + Static24.anInt2908 - Static465.anInt3909;
				if (local12 >= 0 && local12 <= Static24.anInt2908 + Static24.anInt2908) {
					local110 = local8.anInt2965 + Static24.anInt2908 - Static366.anInt6203;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static24.anInt2908 + Static24.anInt2908) {
						continue;
					}
					local128 = local8.anInt2955 + Static24.anInt2908 - Static366.anInt6203;
					if (local128 > Static24.anInt2908 + Static24.anInt2908) {
						local128 = Static24.anInt2908 + Static24.anInt2908;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static39.aBooleanArrayArray1[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static344.anInt5818 - local8.anInt2962;
						if (local164 > Static391.anInt6550) {
							local8.anInt2961 = 3;
						} else {
							if (local164 >= -Static391.anInt6550) {
								continue;
							}
							local8.anInt2961 = 4;
							local164 = -local164;
						}
						local8.anInt2966 = (local8.anInt2963 - Static257.anInt4288 << 8) / local164;
						local8.anInt2959 = (local8.anInt2964 - Static257.anInt4288 << 8) / local164;
						local8.anInt2956 = (local8.anInt2954 - Static207.anInt3661 << 8) / local164;
						local8.anInt2968 = (local8.anInt2967 - Static207.anInt3661 << 8) / local164;
						Static368.aClass103Array2[Static234.anInt4001++] = local8;
					}
				}
			} else if (local8.anInt2950 == 4) {
				local12 = local8.anInt2954 - Static207.anInt3661;
				if (local12 > Static38.anInt635) {
					local110 = local8.anInt2953 + Static24.anInt2908 - Static465.anInt3909;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static24.anInt2908 + Static24.anInt2908) {
						continue;
					}
					local128 = local8.anInt2952 + Static24.anInt2908 - Static465.anInt3909;
					if (local128 > Static24.anInt2908 + Static24.anInt2908) {
						local128 = Static24.anInt2908 + Static24.anInt2908;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt2965 + Static24.anInt2908 - Static366.anInt6203;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static24.anInt2908 + Static24.anInt2908) {
						continue;
					}
					local164 = local8.anInt2955 + Static24.anInt2908 - Static366.anInt6203;
					if (local164 > Static24.anInt2908 + Static24.anInt2908) {
						local164 = Static24.anInt2908 + Static24.anInt2908;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static39.aBooleanArrayArray1[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt2961 = 5;
						local8.anInt2966 = (local8.anInt2963 - Static257.anInt4288 << 8) / local12;
						local8.anInt2959 = (local8.anInt2964 - Static257.anInt4288 << 8) / local12;
						local8.anInt2958 = (local8.anInt2962 - Static344.anInt5818 << 8) / local12;
						local8.anInt2957 = (local8.anInt2960 - Static344.anInt5818 << 8) / local12;
						Static368.aClass103Array2[Static234.anInt4001++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)Lclient!cl;")
	public static Class3_Sub3_Sub4 method4678() {
		@Pc(13) Class3_Sub3_Sub4 local13 = (Class3_Sub3_Sub4) Static60.aClass65_1.method1684();
		if (local13 != null) {
			local13.method6288();
			local13.method6102();
			return local13;
		}
		do {
			local13 = (Class3_Sub3_Sub4) Static341.aClass65_8.method1684();
			if (local13 == null) {
				return null;
			}
			if (local13.method1001() > Static354.method4966()) {
				return null;
			}
			local13.method6288();
			local13.method6102();
		} while ((Long.MIN_VALUE & local13.aLong243) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public static void method4680() {
		Static137.aClass143_1.method5472();
		Static171.aClass50_1.method4990();
		Static382.aClient1.method1027();
		Static151.aCanvas2.setBackground(Color.black);
		Static438.anInt2390 = -1;
		Static137.aClass143_1 = Static258.method3605(Static151.aCanvas2);
		Static171.aClass50_1 = Static47.method887(Static151.aCanvas2);
	}
}
