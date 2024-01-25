import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static133 {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!tq;")
	public static Class191 aClass191_84;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
	public static int anInt2765;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
	public static int anInt2775;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_54 = new Class93(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
	public static int anInt2771 = 0;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "[I")
	public static final int[] anIntArray238 = new int[2500];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!tq;Lclient!tq;ILclient!gp;)V")
	public static void method2666(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(3) Interface2 arg2) {
		Static327.aClass191_210 = arg0;
		Static235.anInterface2_1 = arg2;
		Static34.aClass191_20 = arg1;
		if (Static34.aClass191_20 != null) {
			Static69.anInt1505 = Static34.aClass191_20.method5443(1);
		}
		if (Static327.aClass191_210 != null) {
			Static322.anInt6491 = Static327.aClass191_210.method5443(1);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2669(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2671(@OriginalArg(0) String arg0) {
		return Static162.method3044(10, arg0);
	}
}
