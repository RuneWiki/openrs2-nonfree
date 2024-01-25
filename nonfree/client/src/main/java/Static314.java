import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	public static int anInt5208 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!vg;I)V")
	public static void method4062(@OriginalArg(0) Class250 arg0) {
		if (!Static360.aBoolean498) {
			return;
		}
		if (arg0.anObjectArray8 != null) {
			@Pc(22) Class250 local22 = Static359.method4655(Static315.anInt5215, Static234.anInt3782);
			if (local22 != null) {
				@Pc(28) Class1_Sub31 local28 = new Class1_Sub31();
				local28.aClass250_8 = arg0;
				local28.anObjectArray5 = arg0.anObjectArray8;
				local28.aClass250_9 = local22;
				Static267.method3402(local28);
			}
		}
		Static5.method94(Static19.aClass137_29);
		Static75.aClass1_Sub11_Sub1_1.method4450(arg0.anInt6994);
		Static75.aClass1_Sub11_Sub1_1.method4472(Static315.anInt5215);
		Static75.aClass1_Sub11_Sub1_1.method4464(Static364.anInt6148);
		Static75.aClass1_Sub11_Sub1_1.method4448(arg0.anInt7030);
		Static75.aClass1_Sub11_Sub1_1.method4483(Static234.anInt3782);
		Static75.aClass1_Sub11_Sub1_1.method4464(arg0.anInt7038);
	}
}
