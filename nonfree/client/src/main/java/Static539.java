import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static539 {

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "[S")
	public static short[] aShortArray118;

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
	public static int anInt9220;

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_15 = new Class370(3, 8);

	@OriginalMember(owner = "client!sha", name = "f", descriptor = "I")
	public static int anInt9219 = 0;

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
	public static int anInt9221 = 0;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_52 = new Class391(4);

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public static void method7914(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static659.anInt10597 == 1) {
			Static617.aClass57_14.method7666(arg1, arg0, Static561.anInt9477, Static136.anInt2254);
		} else {
			Static617.aClass57_14.method7666(arg1, arg0, 0, 0);
		}
	}
}
