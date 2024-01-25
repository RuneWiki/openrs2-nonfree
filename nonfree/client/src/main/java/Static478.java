import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_177 = new Class359(22, -1);

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_34 = new Class300(8);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public static void method6827() {
		@Pc(8) int local8 = Static62.aByteArrayArray2.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static62.aByteArrayArray2[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static662.anInt10634; local20++) {
					if (Static611.anIntArray552[local10] == Static122.anIntArray544[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static122.anIntArray544[Static662.anInt10634] = Static611.anIntArray552[local10];
					local18 = Static662.anInt10634++;
				}
				@Pc(59) Class5_Sub41 local59 = new Class5_Sub41(Static62.aByteArrayArray2[local10]);
				@Pc(61) int local61 = 0;
				while (Static62.aByteArrayArray2[local10].length > local59.anInt9230 && local61 < 511 && Static36.anInt607 < 1023) {
					@Pc(80) int local80 = local61++ << 6 | local18;
					@Pc(84) int local84 = local59.method7860();
					@Pc(88) int local88 = local84 >> 14;
					@Pc(94) int local94 = local84 >> 7 & 0x3F;
					@Pc(98) int local98 = local84 & 0x3F;
					@Pc(111) int local111 = (Static611.anIntArray552[local10] >> 8) * 64 + local94 - Static153.anInt3147;
					@Pc(124) int local124 = local98 + (Static611.anIntArray552[local10] & 0xFF) * 64 - Static201.anInt3839;
					@Pc(131) Class134 local131 = Static231.aClass19_2.method274(local59.method7860());
					@Pc(138) Class5_Sub25 local138 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local80);
					if (local138 == null && (local131.aByte50 & 0x1) > 0 && local88 == Static419.anInt7416 && local111 >= 0 && local131.anInt3851 + local111 < Static201.anInt3834 && local124 >= 0 && local124 + local131.anInt3851 < Static626.anInt10238) {
						@Pc(183) Class28_Sub1_Sub4_Sub2_Sub1 local183 = new Class28_Sub1_Sub4_Sub2_Sub1();
						local183.anInt5512 = local80;
						@Pc(191) Class5_Sub25 local191 = new Class5_Sub25(local183);
						Static56.aClass300_8.method7191(local191, (long) local80);
						Static317.aClass5_Sub25Array1[Static37.anInt617++] = local191;
						Static588.anIntArray533[Static36.anInt607++] = local80;
						local183.anInt5452 = Static26.anInt350;
						local183.method3061(local131);
						local183.method4585(local183.aClass134_1.anInt3851);
						local183.anInt5519 = local183.aClass134_1.anInt3825 << 3;
						local183.method4590((local183.aClass134_1.aByte44 + 4 & 0x3B600007) << 11, true);
						local183.method3062(local124, local183.method4599(), local111, true, local88);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)Z")
	public static boolean method6829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static135.method2404(arg1, arg0) : Static189.method3159(arg0, arg1);
		return local22 | (arg1 & 0x10000) != 0 | Static97.method1947(arg0, arg1);
	}
}
