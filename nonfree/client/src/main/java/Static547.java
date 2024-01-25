import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
	public static int anInt9285;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
	public static void method7772(@OriginalArg(1) int arg0) {
		if (Static404.aClass2_Sub13_2.aClass33_Sub6_1.method2925() == 0) {
			arg0 = -1;
		}
		if (Static178.anInt3979 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(30) Class321 local30 = Static151.aClass273_1.method6658(arg0);
			@Pc(34) Class120 local34 = local30.method7604();
			if (local34 == null) {
				arg0 = -1;
			} else {
				Static375.aClass359_4.method8273(Static147.aCanvas5, local34.method3078(), local34.method3068(), new Point(local30.anInt9037, local30.anInt9032), local34.method3067());
				Static178.anInt3979 = arg0;
			}
		}
		if (arg0 == -1 && Static178.anInt3979 != -1) {
			Static375.aClass359_4.method8273(Static147.aCanvas5, -1, -1, new Point(), null);
			Static178.anInt3979 = -1;
		}
	}

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
	public static void method7779() {
		@Pc(7) int local7 = Static571.anInt9395;
		@Pc(9) int[] local9 = Static131.anIntArray213;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(24) Class11_Sub1_Sub1_Sub2_Sub1 local24 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local24 != null) {
				Static224.method3808(local24.method2778(), local24);
			}
		}
	}
}
