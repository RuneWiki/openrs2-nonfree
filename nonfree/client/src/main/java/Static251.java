import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public static int anInt4573 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public static void method3865() {
		Static305.method4815();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static275.aClass106Array1[local11].method2663();
		}
		Static551.method7650();
		Static341.method5193();
		Static253.method3893();
		System.gc();
		Static208.aClass65_7.ya();
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZI)V")
	public static void method3866(@OriginalArg(1) int arg0) {
		if (Static26.anInt352 == 0) {
			Static386.aClass5_Sub17_Sub1_2.method2542(arg0);
		} else {
			Static577.anInt9443 = arg0;
		}
	}
}
