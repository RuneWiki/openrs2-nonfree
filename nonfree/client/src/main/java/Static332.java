import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	public static int anInt5914;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
	public static int anInt5918;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
	public static int anInt5920;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_99 = new Class21("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_38 = new Class91();

	@OriginalMember(owner = "client!qk", name = "A", descriptor = "Lclient!sn;")
	public static Class235 aClass235_6 = null;

	@OriginalMember(owner = "client!qk", name = "C", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method4900(@OriginalArg(1) Class30 arg0) {
		@Pc(7) int local7 = Static22.anInt426;
		@Pc(13) int local13 = Static223.anInt4455;
		@Pc(15) int local15 = Static177.anInt3637;
		@Pc(17) int local17 = Static153.anInt3164;
		arg0.method2072(local13, local7, local15, local17, -10660793);
		arg0.method2072(local13 + 1, local7 + 1, local15 - 2, 16, -16777216);
		arg0.method2095(local13 + 18, local7 + 1, -16777216, local15 - 2, local17 + -19);
		Static247.aClass18_2.method5769(Static311.aClass21_95.method362(Static168.anInt3290), local7 + 3, -1, local13 - -14, -10660793);
		@Pc(78) int local78 = Static329.aClass95_1.method5170();
		@Pc(82) int local82 = Static329.aClass95_1.method5175();
		@Pc(84) int local84 = 0;
		for (@Pc(89) Class4_Sub14 local89 = (Class4_Sub14) Static289.aClass91_31.method2584(); local89 != null; local89 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			@Pc(103) int local103 = (Static352.anInt6233 - local84 - 1) * 16 + local13 + 31;
			@Pc(105) short local105 = -1;
			if (local7 < local78 && local7 + local15 > local78 && local103 - 13 < local82 && local103 + 3 > local82 && local89.aBoolean149) {
				local105 = -256;
			}
			@Pc(143) int[] local143 = null;
			if (Static383.method5405(local89.anInt2132)) {
				local143 = Static139.aClass193_1.method4650((int) local89.aLong69).anIntArray625;
			} else if (local89.anInt2130 != -1) {
				local143 = Static139.aClass193_1.method4650(local89.anInt2130).anIntArray625;
			} else if (Static258.method3303(local89.anInt2132)) {
				@Pc(222) Class4_Sub44 local222 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local89.aLong69);
				if (local222 != null) {
					@Pc(227) Class11_Sub5_Sub2_Sub2 local227 = local222.aClass11_Sub5_Sub2_Sub2_2;
					@Pc(230) Class241 local230 = local227.aClass241_1;
					if (local230.anIntArray565 != null) {
						local230 = local230.method5593(Static67.aClass224_1);
					}
					if (local230 != null) {
						local143 = local230.anIntArray562;
					}
				}
			} else if (Static463.method6261(local89.anInt2132)) {
				@Pc(187) Class139 local187;
				if (local89.anInt2132 == 1007) {
					local187 = Static146.aClass228_1.method5203((int) local89.aLong69);
				} else {
					local187 = Static146.aClass228_1.method5203((int) (local89.aLong69 >>> 32 & 0x7FFFFFFFL));
				}
				if (local187.anIntArray344 != null) {
					local187 = local187.method3751(Static67.aClass224_1);
				}
				if (local187 != null) {
					local143 = local187.anIntArray343;
				}
			}
			@Pc(257) String local257 = Static311.method4739(local89);
			if (local143 != null) {
				local257 = local257 + Static418.method2688(local143);
			}
			Static247.aClass18_2.method5764(Static171.aClass2Array26, local105, local257, local7 + 3, Static104.anIntArray195, local103);
			local84++;
			if (local89.aBoolean150) {
				Static151.aClass2_17.method5921(local7 + Static296.aClass84_10.method2381(local257) + 5, local103 + -12);
			}
		}
		Static92.method1817(Static153.anInt3164, Static177.anInt3637, Static22.anInt426, Static223.anInt4455);
	}
}
