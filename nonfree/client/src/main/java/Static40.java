import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
	public static int anInt758;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_24 = new Class56(84, 8);

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BLclient!pi;Ljava/awt/Frame;)V")
	public static void method656(@OriginalArg(1) Class258 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class39 local6 = arg0.method5887(arg1);
			while (local6.anInt894 == 0) {
				Static589.method7892(10L);
			}
			if (local6.anInt894 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static589.method7892(100L);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)I")
	public static int method658() {
		if ((double) Static44.aFloat203 == 3.0D) {
			return 37;
		} else if ((double) Static44.aFloat203 == 4.0D) {
			return 50;
		} else if ((double) Static44.aFloat203 == 6.0D) {
			return 75;
		} else if ((double) Static44.aFloat203 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
