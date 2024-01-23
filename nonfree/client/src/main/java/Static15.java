import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "Lclient!me;")
	public static Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "Lclient!hh;")
	public static Class50 aClass50_120 = Static186.method3527(":tradereq:");

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Z")
	public static boolean method215() {
		try {
			return Static110.method1752();
		} catch (@Pc(16) IOException local16) {
			Static91.method3219();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(61) String local61 = "T2 - " + Static157.anInt3267 + "," + Static134.anInt2778 + "," + Static60.anInt1181 + " - " + Static217.anInt4289 + "," + (Static230.aClass20_Sub3_Sub1_3.anIntArray311[0] + Static91.anInt4078) + "," + (Static230.aClass20_Sub3_Sub1_3.anIntArray313[0] + Static101.anInt2041) + " - ";
			for (@Pc(63) int local63 = 0; Static217.anInt4289 > local63 && local63 < 50; local63++) {
				local61 = local61 + Static97.aClass1_Sub17_Sub1_2.aByteArray40[local63] + ",";
			}
			Static204.method3249(local21, local61);
			Static210.method3288();
			return true;
		}
	}
}
