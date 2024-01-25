import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
	public static int anInt5483;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lclient!bc;")
	public static Interface1 anInterface1_5;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "Lclient!ms;")
	public static Class155 aClass155_31 = null;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Lclient!hi;")
	public static Class100 aClass100_1 = new Class100(8);

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
	public static int anInt5484 = 104;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_184 = new Class221(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public static void method4777() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static57.aBooleanArray108[local3] = false;
		}
		Static368.anInt6428 = 0;
		Static159.anInt2909 = -1;
		Static283.anInt5017 = 1;
		Static53.anInt1096 = -1;
		Static213.anInt3924 = 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static357.method861(arg2, arg1, arg4, arg3, arg0, arg5, 0);
	}
}
