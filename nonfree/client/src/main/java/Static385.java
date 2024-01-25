import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static385 {

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_103 = new Class45(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_361 = new Class305(113, 2);

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)[Lclient!cu;")
	public static Class54[] method6170() {
		return new Class54[] { Static480.aClass54_27, Static481.aClass54_24, Static211.aClass54_16, Static467.aClass54_26, Static279.aClass54_14, Static29.aClass54_1, Static115.aClass54_9, Static320.aClass54_22, Static310.aClass54_23, Static320.aClass54_21, Static45.aClass54_2, Static105.aClass54_7, Static247.aClass54_19, Static108.aClass54_8, Static83.aClass54_28 };
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)B")
	public static byte method6172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
