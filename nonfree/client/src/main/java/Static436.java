import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
	public static int anInt7546;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B[Lclient!pu;)V")
	public static void method6381(@OriginalArg(1) Class50[] arg0) {
		Static404.anInt7172 = arg0.length;
		Static364.aClass50Array8 = new Class50[Static404.anInt7172 + 10];
		Static5.anIntArray4 = new int[Static404.anInt7172 + 10];
		Static686.method4966(arg0, 0, Static364.aClass50Array8, 0, Static404.anInt7172);
		for (@Pc(28) int local28 = 0; local28 < Static404.anInt7172; local28++) {
			Static5.anIntArray4[local28] = Static364.aClass50Array8[local28].method6010();
		}
		for (@Pc(42) int local42 = Static404.anInt7172; local42 < Static364.aClass50Array8.length; local42++) {
			Static5.anIntArray4[local42] = 12;
		}
	}
}
