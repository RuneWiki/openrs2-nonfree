import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)V")
	public static void method7812() {
		Static126.anInt2172 = 0;
		@Pc(11) int local11 = Static429.aClass6_Sub12_Sub2_2.method6057();
		@Pc(15) int local15 = Static429.aClass6_Sub12_Sub2_2.method6027();
		@Pc(24) boolean local24 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
		@Pc(28) int local28 = Static429.aClass6_Sub12_Sub2_2.method6048();
		Static173.method2710();
		Static512.method7030(local15);
		@Pc(41) int local41 = (Static207.anInt3929 - Static429.aClass6_Sub12_Sub2_2.anInt7556) / 16;
		Static16.anIntArrayArray3 = new int[local41][4];
		@Pc(55) int local55;
		for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static16.anIntArrayArray3[local51][local55] = Static429.aClass6_Sub12_Sub2_2.method6015();
			}
		}
		Static401.anIntArray504 = new int[local41];
		Static287.aByteArrayArray13 = new byte[local41][];
		Static501.aByteArrayArray28 = new byte[local41][];
		Static468.anIntArray577 = new int[local41];
		Static77.anIntArray115 = null;
		Static369.aByteArrayArray19 = null;
		Static98.aByteArrayArray6 = new byte[local41][];
		Static492.aByteArrayArray27 = new byte[local41][];
		Static345.anIntArray457 = new int[local41];
		Static187.anIntArray312 = new int[local41];
		Static185.anIntArray306 = new int[local41];
		local41 = 0;
		for (local55 = (local28 - (Static18.anInt5706 >> 4)) / 8; local55 <= (local28 + (Static18.anInt5706 >> 4)) / 8; local55++) {
			for (@Pc(125) int local125 = (local11 - (Static80.anInt1367 >> 4)) / 8; local125 <= ((Static80.anInt1367 >> 4) + local11) / 8; local125++) {
				Static468.anIntArray577[local41] = local125 + (local55 << 8);
				Static345.anIntArray457[local41] = Static88.aClass248_15.method5777("m" + local55 + "_" + local125);
				Static185.anIntArray306[local41] = Static88.aClass248_15.method5777("l" + local55 + "_" + local125);
				Static401.anIntArray504[local41] = Static88.aClass248_15.method5777("um" + local55 + "_" + local125);
				Static187.anIntArray312[local41] = Static88.aClass248_15.method5777("ul" + local55 + "_" + local125);
				local41++;
			}
		}
		Static424.method5985(local11, local24, local28, 11);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BII)V")
	public static void method7813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub5_Sub8 local13 = Static49.method760(12, arg0);
		local13.method3256();
		local13.anInt3740 = arg1;
	}
}
