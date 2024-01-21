import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
	public static final int[] anIntArray78 = new int[1000];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method1041() {
		Static18.aClass85_1.method2557();
		Static55.aClass94_3.method3157();
		Static54.aClass85_10.method2557();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[B)V")
	public static void method1043(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		local8.anInt1758 = arg0.length - 2;
		Static76.anInt1503 = local8.method1270();
		Static160.anIntArray245 = new int[Static76.anInt1503];
		Static172.anIntArray284 = new int[Static76.anInt1503];
		Static204.aByteArrayArray9 = new byte[Static76.anInt1503][];
		Static176.anIntArray295 = new int[Static76.anInt1503];
		Static163.anIntArray250 = new int[Static76.anInt1503];
		local8.anInt1758 = arg0.length - Static76.anInt1503 * 8 - 7;
		Static88.anInt1712 = local8.method1270();
		Static126.anInt2492 = local8.method1270();
		@Pc(60) int local60 = (local8.method1278() & 0xFF) + 1;
		for (@Pc(62) int local62 = 0; local62 < Static76.anInt1503; local62++) {
			Static176.anIntArray295[local62] = local8.method1270();
		}
		for (@Pc(75) int local75 = 0; local75 < Static76.anInt1503; local75++) {
			Static160.anIntArray245[local75] = local8.method1270();
		}
		for (@Pc(88) int local88 = 0; local88 < Static76.anInt1503; local88++) {
			Static163.anIntArray250[local88] = local8.method1270();
		}
		for (@Pc(105) int local105 = 0; local105 < Static76.anInt1503; local105++) {
			Static172.anIntArray284[local105] = local8.method1270();
		}
		local8.anInt1758 = arg0.length + 3 - Static76.anInt1503 * 8 - local60 * 3 - 7;
		Static63.anIntArray75 = new int[local60];
		for (@Pc(143) int local143 = 1; local143 < local60; local143++) {
			Static63.anIntArray75[local143] = local8.method1271();
			if (Static63.anIntArray75[local143] == 0) {
				Static63.anIntArray75[local143] = 1;
			}
		}
		local8.anInt1758 = 0;
		for (@Pc(176) int local176 = 0; local176 < Static76.anInt1503; local176++) {
			@Pc(181) int local181 = Static163.anIntArray250[local176];
			@Pc(185) int local185 = Static172.anIntArray284[local176];
			@Pc(189) int local189 = local181 * local185;
			@Pc(192) byte[] local192 = new byte[local189];
			Static204.aByteArrayArray9[local176] = local192;
			@Pc(200) int local200 = local8.method1278();
			@Pc(210) int local210;
			if (local200 == 0) {
				for (local210 = 0; local210 < local189; local210++) {
					local192[local210] = local8.method1248();
				}
			} else if (local200 == 1) {
				for (local210 = 0; local210 < local181; local210++) {
					for (@Pc(213) int local213 = 0; local213 < local185; local213++) {
						local192[local213 * local181 + local210] = local8.method1248();
					}
				}
			}
		}
	}
}
