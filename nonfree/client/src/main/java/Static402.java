import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static402 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public static int anInt7196 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZII)V")
	public static void method5785(@OriginalArg(1) boolean arg0) {
		Static269.aBoolean372 = arg0;
		Static304.anInt5650 = 22050;
		Static564.anInt9355 = 2;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!rc;)V")
	public static void method5786(@OriginalArg(1) Class1_Sub40 arg0) {
		if (!Static406.aBoolean553) {
			arg0.method7908();
			Static22.anInt572--;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	public static void method5788() {
		Static490.aClass207_51.method4392();
	}
}
