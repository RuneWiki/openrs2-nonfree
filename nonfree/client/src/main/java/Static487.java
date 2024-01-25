import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "Lclient!wu;")
	public static Class381 aClass381_2;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	public static final int anInt8648 = 1401;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_44 = new Class307(8);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method7148(@OriginalArg(1) int arg0) {
		@Pc(24) byte local24;
		if (arg0 > 12000) {
			Static351.method5758();
			local24 = 4;
		} else if (arg0 > 5000) {
			local24 = 3;
			Static596.method8155();
		} else if (arg0 > 2000) {
			Static173.method8277();
			local24 = 2;
		} else {
			Static534.method7607();
			local24 = 1;
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 2) {
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 2);
			Static559.method7893(false, 2);
		}
		Static152.method3314();
		return local24;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)Z")
	public static boolean method7149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(B)V")
	public static void method7150() {
		@Pc(12) Class3_Sub26 local12 = Static640.method8636(Static477.aClass344_101, Static403.aClass294_3);
		local12.aClass3_Sub15_Sub1_3.method8464(Static222.anInt5083);
		Static472.method5189(local12);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z")
	public static boolean method7151(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([BI)V")
	public static void method7153(@OriginalArg(0) byte[] arg0) {
		@Pc(18) Class3_Sub15 local18 = new Class3_Sub15(arg0);
		while (true) {
			while (true) {
				@Pc(22) int local22 = local18.method8401();
				if (local22 == 0) {
					return;
				}
				if (local22 == 1) {
					@Pc(35) int[] local35 = Static266.anIntArray528 = new int[6];
					local35[0] = local18.method8414();
					local35[1] = local18.method8414();
					local35[2] = local18.method8414();
					local35[3] = local18.method8414();
					local35[4] = local18.method8414();
					local35[5] = local18.method8414();
				} else {
					@Pc(80) int local80;
					@Pc(85) int local85;
					if (local22 == 4) {
						local80 = local18.method8401();
						Static94.anIntArray96 = new int[local80];
						for (local85 = 0; local85 < local80; local85++) {
							Static94.anIntArray96[local85] = local18.method8414();
							if (Static94.anIntArray96[local85] == 65535) {
								Static94.anIntArray96[local85] = -1;
							}
						}
					} else if (local22 == 5) {
						local80 = local18.method8401();
						Static128.anIntArray158 = new int[local80];
						for (local85 = 0; local85 < local80; local85++) {
							Static128.anIntArray158[local85] = local18.method8414();
							if (Static128.anIntArray158[local85] == 65535) {
								Static128.anIntArray158[local85] = -1;
							}
						}
					}
				}
			}
		}
	}
}
