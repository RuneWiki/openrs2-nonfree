import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!us;")
	public static final Class234 aClass234_62 = new Class234(43, 4);

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_49 = new Class57("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!im", name = "d", descriptor = "I")
	public static int anInt2778 = 0;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method2390() {
		for (@Pc(15) int local15 = 0; local15 < Static23.anInt305; local15++) {
			@Pc(21) int local21 = Static369.anIntArray664[local15];
			@Pc(25) Class28_Sub1_Sub1_Sub1 local25 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local21];
			if (local25 != null) {
				Static272.method4270(local25.aClass61_1.anInt1467, local25);
			}
		}
	}
}
