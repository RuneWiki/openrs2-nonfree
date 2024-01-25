import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "[S")
	public static short[] aShortArray10;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public static final int anInt550 = 1406;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public static void method499() {
		for (@Pc(10) Class1_Sub3_Sub8 local10 = (Class1_Sub3_Sub8) Static454.aClass14_52.method203(); local10 != null; local10 = (Class1_Sub3_Sub8) Static454.aClass14_52.method208()) {
			@Pc(20) Class11_Sub1_Sub5 local20 = local10.aClass11_Sub1_Sub5_1;
			if (local20.anInt6195 < Static98.anInt1304) {
				local10.method5953();
				local20.method4960();
			} else if (local20.anInt6187 <= Static98.anInt1304) {
				if (local20.anInt6191 > 0) {
					@Pc(47) Class1_Sub44 local47 = (Class1_Sub44) Static46.aClass208_33.method4405((long) (local20.anInt6191 - 1));
					if (local47 != null) {
						@Pc(52) Class11_Sub1_Sub3_Sub1 local52 = local47.aClass11_Sub1_Sub3_Sub1_2;
						if (local52.anInt6428 >= 0 && Static147.anInt2300 * 128 > local52.anInt6428 && local52.anInt6430 >= 0 && local52.anInt6430 < Static293.anInt4886 * 128) {
							local20.method4959(Static98.anInt1304, Static135.method1732(local52.anInt6428, local52.anInt6430, local20.aByte90) - local20.anInt6184, local52.anInt6428, local52.anInt6430);
						}
					}
				}
				if (local20.anInt6191 < 0) {
					@Pc(117) int local117 = -local20.anInt6191 - 1;
					@Pc(126) Class11_Sub1_Sub3_Sub2 local126;
					if (Static220.anInt4038 == local117) {
						local126 = Static94.aClass11_Sub1_Sub3_Sub2_1;
					} else {
						local126 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local117];
					}
					if (local126 != null && local126.anInt6428 >= 0 && local126.anInt6428 < Static147.anInt2300 * 128 && local126.anInt6430 >= 0 && local126.anInt6430 < Static293.anInt4886 * 128) {
						local20.method4959(Static98.anInt1304, Static135.method1732(local126.anInt6428, local126.anInt6430, local20.aByte90) - local20.anInt6184, local126.anInt6428, local126.anInt6430);
					}
				}
				local20.method4966(Static71.anInt1041);
				Static95.method5201(local20, true);
			}
		}
	}
}
