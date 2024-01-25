import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array16;

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_128 = new Class34("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
	public static int anInt4211 = 0;

	@OriginalMember(owner = "client!mq", name = "Q", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_25 = new Class16();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLclient!nh;Ljava/awt/Frame;)V")
	public static void method3801(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class162 local10 = arg0.method3902(arg1);
			while (local10.anInt4801 == 0) {
				Static190.method3690(10L);
			}
			if (local10.anInt4801 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static190.method3690(100L);
		}
	}
}
