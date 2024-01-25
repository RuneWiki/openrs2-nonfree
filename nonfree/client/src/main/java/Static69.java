import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_2 = new Class220(8, 0, 4, 1);

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt1836 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!dv;[[B)V")
	public static void method1329(@OriginalArg(1) Class29_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(15) int[] local15 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(18) int local18 = arg1.length;
		@Pc(38) int local38;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(25) byte[] local25 = arg1[local20];
			if (local25 != null) {
				@Pc(32) Class1_Sub3 local32 = new Class1_Sub3(local25);
				local38 = Static168.anIntArray147[local20] >> 8;
				@Pc(44) int local44 = Static168.anIntArray147[local20] & 0xFF;
				@Pc(51) int local51 = local38 * 64 - Static278.anInt5374;
				@Pc(58) int local58 = local44 * 64 - Static380.anInt6896;
				Static326.method4622();
				arg0.method1542(Static380.anInt6896, Static19.aClass120Array1, local58, local32, local51, Static278.anInt5374);
				arg0.method1549(Static30.aClass106_3, local15, local58, local32, local51);
				if (!arg0.aBoolean128 && Static150.anInt3209 / 8 == local38 && local44 == Static76.anInt1937 / 8 && local15[0] != -1) {
					Static311.aClass189_1 = Static106.aClass53_1.method1339(local15[0], Static100.aClass42_1, local15[3], local15[1], local15[2]);
					Static7.anInt92 = local15[4];
				}
			}
		}
		for (@Pc(132) int local132 = 0; local132 < local18; local132++) {
			@Pc(144) int local144 = (Static168.anIntArray147[local132] >> 8) * 64 - Static278.anInt5374;
			local38 = (Static168.anIntArray147[local132] & 0xFF) * 64 - Static380.anInt6896;
			@Pc(159) byte[] local159 = arg1[local132];
			if (local159 == null && Static76.anInt1937 < 800) {
				Static326.method4622();
				arg0.method1538(local38, local144);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method1330() {
		if (Static170.anInt3494 == 2) {
			Static118.method2017(3);
		} else if (Static170.anInt3494 == 6) {
			Static118.method2017(7);
		} else if (Static170.anInt3494 == 9) {
			Static118.method2017(10);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	public static void method1332() {
		Static296.method4296((long) Static187.anInt3975, Static30.aClass106_3);
		if (Static456.anInt1594 != -1) {
			Static117.method1922(Static456.anInt1594);
		}
		for (@Pc(19) int local19 = 0; local19 < Static316.anInt5918; local19++) {
			if (Static58.aBooleanArray8[local19]) {
				Static55.aBooleanArray7[local19] = true;
			}
			aBooleanArray10[local19] = Static58.aBooleanArray8[local19];
			Static58.aBooleanArray8[local19] = false;
		}
		Static124.anInt2755 = Static187.anInt3975;
		if (Static30.aClass106_3.method5975()) {
			Static456.aBoolean105 = true;
		}
		if (Static456.anInt1594 != -1) {
			Static316.anInt5918 = 0;
			Static421.method5713();
		}
		Static30.aClass106_3.va();
		Static393.method5442(Static30.aClass106_3);
		@Pc(71) int local71 = Static188.method3083();
		if (local71 == -1) {
			local71 = Static49.anInt1209;
		}
		if (local71 == -1) {
			local71 = Static19.anInt523;
		}
		Static78.method1441(local71);
		Static234.anInt4630 = 0;
	}
}
