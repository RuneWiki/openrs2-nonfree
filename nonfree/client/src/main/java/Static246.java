import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public static int anInt4136 = 0;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBIZIIIFI)[[I")
	public static int[][] method3674(@OriginalArg(7) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub2_Sub6 local13 = new Class1_Sub2_Sub6();
		local13.anInt905 = 3;
		local13.anInt895 = 4;
		local13.anInt906 = 8;
		local13.aBoolean77 = false;
		local13.anInt898 = (int) (arg0 * 4096.0F);
		local13.method5505();
		Static105.method1498(256, 64);
		for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
			local13.method706(local54, local9[local54]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public static void method3675() {
		Static96.method1399(Static188.aClass135_Sub1_1.anInt3383);
		@Pc(17) int local17 = (Static256.anInt4409 >> 10) + (Static256.anInt4410 >> 3);
		Static122.anInt2188 = Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 = 0;
		@Pc(30) int local30 = (Static293.anInt5053 >> 3) + (Static133.anInt2471 >> 10);
		Static321.aClass25_Sub1_Sub1_Sub1_2.method468(8, 8);
		Static68.anIntArray183 = new int[18];
		Static50.aByteArrayArray3 = new byte[18][];
		Static114.anIntArray260 = new int[18];
		Static50.anIntArrayArray14 = new int[18][4];
		Static223.anIntArray480 = new int[18];
		Static180.anIntArray378 = new int[18];
		Static46.aByteArrayArray2 = new byte[18][];
		Static320.anIntArray634 = new int[18];
		Static313.anIntArray627 = new int[18];
		Static393.aByteArrayArray23 = new byte[18][];
		Static306.aByteArrayArray18 = new byte[18][];
		Static166.aByteArrayArray13 = new byte[18][];
		@Pc(84) int local84 = 0;
		@Pc(104) int local104;
		for (@Pc(93) int local93 = (local17 - (Static92.anInt1675 >> 4)) / 8; local93 <= (local17 + (Static92.anInt1675 >> 4)) / 8; local93++) {
			for (local104 = (local30 - (Static262.anInt6340 >> 4)) / 8; local104 <= ((Static262.anInt6340 >> 4) + local30) / 8; local104++) {
				@Pc(112) int local112 = (local93 << 8) + local104;
				Static223.anIntArray480[local84] = local112;
				Static114.anIntArray260[local84] = Static25.aClass230_5.method4970("m" + local93 + "_" + local104);
				Static313.anIntArray627[local84] = Static25.aClass230_5.method4970("l" + local93 + "_" + local104);
				Static180.anIntArray378[local84] = Static25.aClass230_5.method4970("n" + local93 + "_" + local104);
				Static68.anIntArray183[local84] = Static25.aClass230_5.method4970("um" + local93 + "_" + local104);
				Static320.anIntArray634[local84] = Static25.aClass230_5.method4970("ul" + local93 + "_" + local104);
				if (Static180.anIntArray378[local84] == -1) {
					Static114.anIntArray260[local84] = -1;
					Static313.anIntArray627[local84] = -1;
					Static68.anIntArray183[local84] = -1;
					Static320.anIntArray634[local84] = -1;
				}
				local84++;
			}
		}
		for (local104 = local84; local104 < Static180.anIntArray378.length; local104++) {
			Static180.anIntArray378[local104] = -1;
			Static114.anIntArray260[local104] = -1;
			Static313.anIntArray627[local104] = -1;
			Static68.anIntArray183[local104] = -1;
			Static320.anIntArray634[local104] = -1;
		}
		Static320.method4702(local17, local30, false, true);
	}
}
