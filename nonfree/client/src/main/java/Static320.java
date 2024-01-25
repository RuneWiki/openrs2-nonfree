import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
	public static int anInt6202;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
	public static boolean aBoolean408 = true;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "J")
	public static long aLong189 = -1L;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_107 = new Class117("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!oo;IIIII)V")
	public static void method5311(@OriginalArg(0) int arg0, @OriginalArg(1) Class67_Sub3_Sub3 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static117.method1775(arg1.anInt6310, arg0, 0, arg1.anInt6308, arg3, arg2);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Frame;BLclient!ko;)V")
	public static void method5313(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class118 arg1) {
		while (true) {
			@Pc(11) Class2 local11 = arg1.method2713(arg0);
			while (local11.anInt6 == 0) {
				Static244.method4311(10L);
			}
			if (local11.anInt6 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static244.method4311(100L);
		}
	}
}
