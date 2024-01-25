import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "Lclient!an;")
	public static Class16 aClass16_78;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "[I")
	public static int[] anIntArray424 = new int[1];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public static void method5050() {
		@Pc(7) int local7 = Static381.anInt7254;
		@Pc(9) int[] local9 = Static496.anIntArray465;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class30_Sub1_Sub1_Sub1 local23 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local9[local15]];
			if (local23 != null) {
				Static470.method7081(local23, local23.method3591());
			}
		}
	}
}
