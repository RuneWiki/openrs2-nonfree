import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public static int anInt6609;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Lclient!an;")
	public static Class16 aClass16_87;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_191 = new Class88("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[I")
	public static final int[] anIntArray459 = new int[500];

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	public static int anInt6608 = 0;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_63 = new Class77(19, 8);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public static void method5527() {
		for (@Pc(10) Class12_Sub17 local10 = (Class12_Sub17) Static179.aClass73_31.method2005(); local10 != null; local10 = (Class12_Sub17) Static179.aClass73_31.method2009()) {
			if (local10.anInt3841 > 0) {
				local10.anInt3841--;
			}
			if (local10.anInt3841 != 0) {
				if (local10.anInt3836 > 0) {
					local10.anInt3836--;
				}
				if (local10.anInt3836 == 0 && local10.anInt3846 >= 1 && local10.anInt3840 >= 1 && Static37.anInt7512 - 2 >= local10.anInt3846 && local10.anInt3840 <= Static329.anInt6247 - 2 && (local10.anInt3844 < 0 || Static268.method4555(local10.anInt3844, local10.anInt3839))) {
					Static252.method4354(local10.anInt3839, local10.anInt3849, local10.anInt3846, local10.anInt3840, local10.anInt3848, local10.anInt3843, local10.anInt3844, -1);
					local10.anInt3836 = -1;
					if (local10.anInt3842 == local10.anInt3844 && local10.anInt3842 == -1) {
						local10.method7967();
					} else if (local10.anInt3844 == local10.anInt3842 && local10.anInt3843 == local10.anInt3845 && local10.anInt3839 == local10.anInt3838) {
						local10.method7967();
					}
				}
			} else if (local10.anInt3842 < 0 || Static268.method4555(local10.anInt3842, local10.anInt3838)) {
				Static252.method4354(local10.anInt3838, local10.anInt3849, local10.anInt3846, local10.anInt3840, local10.anInt3848, local10.anInt3845, local10.anInt3842, -1);
				local10.method7967();
			}
		}
	}
}
