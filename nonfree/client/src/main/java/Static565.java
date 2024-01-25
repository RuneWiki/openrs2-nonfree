import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
	public static int anInt9254;

	@OriginalMember(owner = "client!vn", name = "P", descriptor = "[I")
	public static int[] anIntArray669;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	public static int anInt9249 = 0;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)Lclient!ega;")
	public static Class94 method7677() {
		return Static351.method5220();
	}

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "(I)V")
	public static void method7678() {
		Static418.aClass313_43.method6983();
	}

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "(I)Z")
	public static boolean method7680() {
		try {
			@Pc(7) Class272 local7 = new Class272();
			@Pc(18) byte[] local18 = local7.method6371(Static516.aByteArray86);
			Static23.method438(local18);
			return true;
		} catch (@Pc(25) Exception local25) {
			return false;
		}
	}
}
