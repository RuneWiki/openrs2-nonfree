import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Lclient!fa;")
	public static Interface7 anInterface7_8;

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "F")
	public static float aFloat160;

	@OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
	public static int anInt6988;

	@OriginalMember(owner = "client!nt", name = "C", descriptor = "Lclient!eq;")
	public static final Class96 aClass96_5 = new Class96();

	@OriginalMember(owner = "client!nt", name = "D", descriptor = "[B")
	public static final byte[] aByteArray66 = new byte[520];

	@OriginalMember(owner = "client!nt", name = "G", descriptor = "I")
	public static int anInt6989 = -1;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
	public static void method5463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg2 + arg3);
		@Pc(35) int local35 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3 - arg2);
		Static238.method3886(Static442.anIntArrayArray48[arg1], local26, arg0, local35);
		while (local7 < local13) {
			local18 += 2;
			local16 += local18;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(89) int local89;
			@Pc(98) int local98;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local67 = arg1 - local13;
				local71 = local13 + arg1;
				if (local71 >= Static289.anInt5872 && Static160.anInt3347 >= local67) {
					local89 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local7 + arg3);
					local98 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3 - local7);
					if (Static160.anInt3347 >= local71) {
						Static238.method3886(Static442.anIntArrayArray48[local71], local89, arg0, local98);
					}
					if (Static289.anInt5872 <= local67) {
						Static238.method3886(Static442.anIntArrayArray48[local67], local89, arg0, local98);
					}
				}
			}
			local7++;
			local67 = arg1 - local7;
			local71 = arg1 + local7;
			if (local71 >= Static289.anInt5872 && local67 <= Static160.anInt3347) {
				local89 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local13 + arg3);
				local98 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3 - local13);
				if (local71 <= Static160.anInt3347) {
					Static238.method3886(Static442.anIntArrayArray48[local71], local89, arg0, local98);
				}
				if (Static289.anInt5872 <= local67) {
					Static238.method3886(Static442.anIntArrayArray48[local67], local89, arg0, local98);
				}
			}
		}
	}
}
