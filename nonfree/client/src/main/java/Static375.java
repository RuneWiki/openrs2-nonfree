import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array17;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	public static int anInt6696;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_82 = new Class44(26, 7);

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_137 = new Class256("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	public static int anInt6694 = 0;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_59 = new Class129(64);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method5255() {
		if (Static224.aString38.length() == 0) {
			return;
		}
		Static190.method3004("--> " + Static224.aString38);
		Static176.method2774(Static224.aString38, false);
		Static226.anInt4327 = 0;
		Static126.anInt2500 = 0;
		Static224.aString38 = "";
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
	public static void method5256(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class2 local11 = Static350.aClass240_29.method5438(); local11 != null; local11 = Static350.aClass240_29.method5436()) {
			if ((long) arg0 == (local11.aLong227 >> 48 & 0xFFFFL)) {
				local11.method6072();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!ln;")
	public static Class52 method5258(@OriginalArg(1) Component arg0) {
		return new Class52_Sub1(arg0);
	}
}
