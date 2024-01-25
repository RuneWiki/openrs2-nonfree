import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
	public static int anInt3394;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(B)V")
	public static void method2846() {
		for (@Pc(14) Class2_Sub2_Sub20 local14 = (Class2_Sub2_Sub20) Static378.aClass109_71.method2325(); local14 != null; local14 = (Class2_Sub2_Sub20) Static378.aClass109_71.method2318()) {
			@Pc(19) Class13_Sub1_Sub1_Sub3 local19 = local14.aClass13_Sub1_Sub1_Sub3_1;
			if (local19.anInt7588 < Static262.anInt5597) {
				local14.method8653();
				local19.method6400();
			} else if (Static262.anInt5597 >= local19.anInt7567) {
				local19.method6401();
				if (local19.anInt7593 > 0) {
					@Pc(62) Class2_Sub43 local62 = (Class2_Sub43) Static440.aClass118_41.method2595((long) (local19.anInt7593 - 1));
					if (local62 != null) {
						@Pc(67) Class13_Sub1_Sub1_Sub1_Sub1 local67 = local62.aClass13_Sub1_Sub1_Sub1_Sub1_2;
						if (local67.anInt10090 >= 0 && Static228.anInt3704 * 512 > local67.anInt10090 && local67.anInt10089 >= 0 && local67.anInt10089 < Static162.anInt2911 * 512) {
							local19.method6403(Static262.anInt5597, Static504.method6917(local67.anInt10090, local19.aByte127, local67.anInt10089) - local19.anInt7561, local67.anInt10090, local67.anInt10089);
						}
					}
				}
				if (local19.anInt7593 < 0) {
					@Pc(123) int local123 = -local19.anInt7593 - 1;
					@Pc(130) Class13_Sub1_Sub1_Sub1_Sub2 local130;
					if (local123 == Static528.anInt8672) {
						local130 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1;
					} else {
						local130 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local123];
					}
					if (local130 != null && local130.anInt10090 >= 0 && local130.anInt10090 < Static228.anInt3704 * 512 && local130.anInt10089 >= 0 && Static162.anInt2911 * 512 > local130.anInt10089) {
						local19.method6403(Static262.anInt5597, Static504.method6917(local130.anInt10090, local19.aByte127, local130.anInt10089) - local19.anInt7561, local130.anInt10090, local130.anInt10089);
					}
				}
				local19.method6399(Static544.anInt9305);
				Static545.method7521(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)V")
	public static void method2847(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 2);
		local8.method669();
	}
}
