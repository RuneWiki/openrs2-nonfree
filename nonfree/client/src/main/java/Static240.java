import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!al;")
	public static Class11 aClass11_14;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[S")
	public static final short[] aShortArray251 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_153 = new Class83("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)[Lclient!ic;")
	public static Class103[] method5675() {
		if (Static287.aClass103Array1 == null) {
			@Pc(16) Class103[] local16 = Static204.method3184(Static206.aClass66_4);
			@Pc(20) Class103[] local20 = new Class103[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(66) int local66;
			@Pc(72) Class103 local72;
			label63: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(30) Class103 local30 = local16[local24];
				if ((local30.anInt3176 <= 0 || local30.anInt3176 >= 24) && local30.anInt3173 >= 800 && local30.anInt3174 >= 600 && (Static70.anInt1503 >= 96 || Static177.anInt2973 != 0 || local30.anInt3173 <= 1024 && local30.anInt3174 <= 768)) {
					for (local66 = 0; local66 < local22; local66++) {
						local72 = local20[local66];
						if (local30.anInt3173 == local72.anInt3173 && local72.anInt3174 == local30.anInt3174) {
							if (local30.anInt3176 > local72.anInt3176) {
								local20[local66] = local30;
							}
							continue label63;
						}
					}
					local20[local22] = local30;
					local22++;
				}
			}
			Static287.aClass103Array1 = new Class103[local22];
			Static459.method3332(local20, 0, Static287.aClass103Array1, 0, local22);
			@Pc(128) int[] local128 = new int[Static287.aClass103Array1.length];
			for (local66 = 0; local66 < Static287.aClass103Array1.length; local66++) {
				local72 = Static287.aClass103Array1[local66];
				local128[local66] = local72.anInt3173 * local72.anInt3174;
			}
			Static146.method214(Static287.aClass103Array1, local128);
		}
		return Static287.aClass103Array1;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method5677() {
		if (Static323.aClass50_Sub1_1.method2858(Static177.anInt2973) != 2) {
			return;
		}
		@Pc(27) byte local27 = (byte) (Static361.anInt6264 - 4 & 0xFF);
		@Pc(31) int local31 = Static361.anInt6264 % Static326.anInt5666;
		@Pc(37) int local37;
		for (@Pc(33) int local33 = 0; local33 < 4; local33++) {
			for (local37 = 0; local37 < Static283.anInt5187; local37++) {
				Static12.aByteArrayArrayArray1[local33][local31][local37] = local27;
			}
		}
		if (Static263.anInt4963 == 3) {
			return;
		}
		for (local37 = 0; local37 < 2; local37++) {
			Static306.anIntArray360[local37] = -1000000;
			Static21.anIntArray19[local37] = 1000000;
			Static443.anIntArray549[local37] = 0;
			Static52.anIntArray53[local37] = 1000000;
			Static316.anIntArray376[local37] = 0;
		}
		@Pc(136) int local136;
		if (Static111.anInt2386 != 1) {
			local136 = Static13.method135(Static163.anInt3197, Static263.anInt4963, Static145.anInt2906);
			if (local136 - Static100.anInt2024 >= 800 || (Static79.aByteArrayArrayArray2[Static263.anInt4963][Static163.anInt3197 >> 7][Static145.anInt2906 >> 7] & 0x4) == 0) {
				return;
			}
			Static306.method4135(Static163.anInt3197 >> 7, false, Static145.anInt2906 >> 7, 1, Static202.aClass164ArrayArrayArray5);
			return;
		}
		if ((Static79.aByteArrayArrayArray2[Static263.anInt4963][Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7][Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7] & 0x4) != 0) {
			Static306.method4135(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7, false, Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7, 0, Static202.aClass164ArrayArrayArray5);
		}
		if (Static431.anInt7074 >= 2560) {
			return;
		}
		local136 = Static163.anInt3197 >> 7;
		@Pc(140) int local140 = Static145.anInt2906 >> 7;
		@Pc(145) int local145 = Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7;
		@Pc(150) int local150 = Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7;
		@Pc(158) int local158;
		if (local145 <= local136) {
			local158 = local136 - local145;
		} else {
			local158 = local145 - local136;
		}
		@Pc(176) int local176;
		if (local150 <= local140) {
			local176 = local140 - local150;
		} else {
			local176 = local150 - local140;
		}
		if ((local158 != 0 || local176 != 0) && local158 > -Static326.anInt5666 && Static326.anInt5666 > local158 && -Static283.anInt5187 < local176 && Static283.anInt5187 > local176) {
			@Pc(249) int local249;
			@Pc(251) int local251;
			if (local158 <= local176) {
				local249 = local158 * 65536 / local176;
				local251 = 32768;
				while (local140 != local150) {
					if (local150 > local140) {
						local140++;
					} else if (local140 > local150) {
						local140--;
					}
					if ((Static79.aByteArrayArrayArray2[Static263.anInt4963][local136][local140] & 0x4) != 0) {
						Static306.method4135(local136, false, local140, 1, Static202.aClass164ArrayArrayArray5);
						return;
					}
					local251 += local249;
					if (local251 >= 65536) {
						if (local136 < local145) {
							local136++;
						} else if (local136 > local145) {
							local136--;
						}
						local251 -= 65536;
						if ((Static79.aByteArrayArrayArray2[Static263.anInt4963][local136][local140] & 0x4) != 0) {
							Static306.method4135(local136, false, local140, 1, Static202.aClass164ArrayArrayArray5);
							return;
						}
					}
				}
				return;
			}
			local249 = local176 * 65536 / local158;
			local251 = 32768;
			while (local136 != local145) {
				if (local145 > local136) {
					local136++;
				} else if (local145 < local136) {
					local136--;
				}
				if ((Static79.aByteArrayArrayArray2[Static263.anInt4963][local136][local140] & 0x4) != 0) {
					Static306.method4135(local136, false, local140, 1, Static202.aClass164ArrayArrayArray5);
					return;
				}
				local251 += local249;
				if (local251 >= 65536) {
					local251 -= 65536;
					if (local150 > local140) {
						local140++;
					} else if (local140 > local150) {
						local140--;
					}
					if ((Static79.aByteArrayArrayArray2[Static263.anInt4963][local136][local140] & 0x4) != 0) {
						Static306.method4135(local136, false, local140, 1, Static202.aClass164ArrayArrayArray5);
						return;
					}
				}
			}
			return;
		}
		Static94.method1654(null, "RC: " + local136 + "," + local140 + " " + local145 + "," + local150 + " " + Static180.anInt3453 + "," + Static86.anInt1771);
		return;
	}
}
