import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public static void method4140() {
		@Pc(18) int local18 = Static137.aByteArrayArray8.length;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			if (Static137.aByteArrayArray8[local20] != null) {
				@Pc(28) int local28 = -1;
				for (@Pc(30) int local30 = 0; local30 < Static267.anInt4661; local30++) {
					if (Static578.anIntArray644[local30] == Static300.anIntArray289[local20]) {
						local28 = local30;
						break;
					}
				}
				if (local28 == -1) {
					Static578.anIntArray644[Static267.anInt4661] = Static300.anIntArray289[local20];
					local28 = Static267.anInt4661++;
				}
				@Pc(78) Class6_Sub23 local78 = new Class6_Sub23(Static137.aByteArrayArray8[local20]);
				@Pc(80) int local80 = 0;
				while (Static137.aByteArrayArray8[local20].length > local78.anInt9901 && local80 < 511 && Static133.anInt2316 < 1023) {
					@Pc(97) int local97 = local80++ << 6 | local28;
					@Pc(101) int local101 = local78.method8363();
					@Pc(105) int local105 = local101 >> 14;
					@Pc(111) int local111 = local101 >> 7 & 0x3F;
					@Pc(115) int local115 = local101 & 0x3F;
					@Pc(127) int local127 = (Static300.anIntArray289[local20] >> 8) * 64 + local111 - Static534.anInt8753;
					@Pc(140) int local140 = local115 + (Static300.anIntArray289[local20] & 0xFF) * 64 - Static234.anInt4239;
					@Pc(149) Class91 local149 = Static95.aClass188_1.method4262(local78.method8363());
					@Pc(156) Class6_Sub44 local156 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local97);
					if (local156 == null && (local149.aByte35 & 0x1) > 0 && local105 == Static216.anInt3669 && local127 >= 0 && Static491.anInt9856 > local127 + local149.anInt2346 && local140 >= 0 && Static393.anInt6574 > local149.anInt2346 + local140) {
						@Pc(193) Class2_Sub1_Sub1_Sub3_Sub2 local193 = new Class2_Sub1_Sub1_Sub3_Sub2();
						local193.anInt5103 = local97;
						@Pc(201) Class6_Sub44 local201 = new Class6_Sub44(local193);
						Static349.aClass209_32.method5035((long) local97, local201);
						Static84.aClass6_Sub44Array1[Static490.anInt8336++] = local201;
						Static74.anIntArray80[Static133.anInt2316++] = local97;
						local193.anInt5062 = Static90.anInt1698;
						local193.method4341(local149);
						local193.method4323(local193.aClass91_1.anInt2346);
						local193.anInt5050 = local193.aClass91_1.anInt2349 << 3;
						local193.method4328(local193.aClass91_1.aByte43 + 4 << 11 & 0x3F96, true);
						local193.method4342(local140, local193.method4326(), local127, true, local105);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!ha;ZILclient!sha;)V")
	public static void method4142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class321 arg4) {
		for (@Pc(8) int local8 = 7; local8 >= 0; local8--) {
			for (@Pc(12) int local12 = 127; local12 >= 0; local12--) {
				Static144.method2110(true, false);
				@Pc(34) int local34 = local12 & 0x7F | (local8 & 0x7) << 7 | (arg0 & 0x3F) << 10;
				@Pc(38) int local38 = Static70.anIntArray71[local34];
				Static557.method7881(false, true);
				arg2.aa(arg3 + (arg4.anInt9103 * local12 >> 7), ((-local8 + 7) * arg4.anInt9077 >> 3) + arg1, (arg4.anInt9103 >> 7) + 1, (arg4.anInt9077 >> 3) + 1, local38, 0);
			}
		}
	}
}
