import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!eda;")
	public static Class90 aClass90_34 = null;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	public static int anInt2432 = 0;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public static int anInt2434 = -1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg2);
		@Pc(17) int local17 = Static87.method1817(Static289.anInt5872, Static160.anInt3347, arg3);
		@Pc(23) int local23 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1);
		@Pc(29) int local29 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg4);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static238.method3886(Static442.anIntArrayArray48[local31], local29, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ek;I)Lclient!paa;")
	public static Class50_Sub3_Sub1 method1929(@OriginalArg(0) Class4_Sub13 arg0) {
		@Pc(7) Class50_Sub3 local7 = Static489.method5436(arg0);
		@Pc(11) int local11 = arg0.method7043();
		return new Class50_Sub3_Sub1(local7.aClass347_11, local7.aClass214_11, local7.anInt7638, local7.anInt7633, local7.anInt7637, local7.anInt7630, local7.anInt7631, local7.anInt7632, local7.anInt7635, local7.anInt7641, local7.anInt7642, local7.anInt7639, local7.anInt7650, local7.anInt7645, local7.anInt7647, local11);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([BB)[B")
	public static byte[] method1930(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub13 local8 = new Class4_Sub13(arg0);
		@Pc(17) int local17 = local8.method7004();
		@Pc(21) int local21 = local8.method6990();
		if (local21 < 0 || Static92.anInt8625 != 0 && local21 > Static92.anInt8625) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(92) byte[] local92 = new byte[local21];
			local8.method7049(local92, local21);
			return local92;
		} else {
			@Pc(41) int local41 = local8.method6990();
			if (local41 < 0 || Static92.anInt8625 != 0 && Static92.anInt8625 < local41) {
				throw new RuntimeException();
			}
			@Pc(58) byte[] local58 = new byte[local41];
			if (local17 == 1) {
				Static316.method4970(local58, local41, arg0, local21);
			} else {
				@Pc(74) Class141 local74 = Static511.aClass141_1;
				synchronized (Static511.aClass141_1) {
					Static511.aClass141_1.method3143(local58, local8);
				}
			}
			return local58;
		}
	}
}
