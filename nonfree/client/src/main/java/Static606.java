import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!via", name = "L", descriptor = "I")
	public static int anInt9939;

	@OriginalMember(owner = "client!via", name = "X", descriptor = "I")
	public static int anInt9947;

	@OriginalMember(owner = "client!via", name = "S", descriptor = "[I")
	public static int[] anIntArray803 = new int[2];

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
	public static void method8448() {
		Static193.aClass293_21.method6930();
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V")
	public static void method8449() {
		if (Static457.anIntArray613 != null && Static46.anIntArray61 != null) {
			return;
		}
		Static457.anIntArray613 = new int[256];
		Static46.anIntArray61 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static457.anIntArray613[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static46.anIntArray61[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}
}
