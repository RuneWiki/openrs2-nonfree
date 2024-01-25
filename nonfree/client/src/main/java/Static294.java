import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
	public static int anInt4647;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "B")
	public static byte aByte73;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
	public static int anInt4652;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
	public static int anInt4646 = -1;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_106 = new Class151(6, 6);

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public static int anInt4648 = 0;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	public static int anInt4653 = 0;

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
	public static void method4171() {
		if (Static582.aClass33_13.method8071()) {
			Static582.aClass33_13.method8110(Static17.aCanvas1);
			Static88.method1788();
			if (Static423.aBoolean517) {
				Static98.method1980(Static17.aCanvas1);
			} else {
				@Pc(23) Dimension local23 = Static17.aCanvas1.getSize();
				Static582.aClass33_13.method8144(Static17.aCanvas1, local23.width, local23.height);
			}
			Static582.aClass33_13.method8132(Static17.aCanvas1);
		} else {
			Static46.method825(Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052(), false);
		}
		Static34.method8332();
		Static42.aBoolean73 = true;
	}
}
