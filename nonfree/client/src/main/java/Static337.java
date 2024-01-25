import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static337 {

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
	public static int anInt6447;

	@OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
	public static int anInt6450;

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_117 = new Class117("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public static void method5495() {
		Static219.aBoolean296 = true;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!nq;BLclient!nq;)V")
	public static void method5496(@OriginalArg(0) Class144 arg0, @OriginalArg(2) Class144 arg1) {
		Static221.aClass144_71 = arg0;
		Static198.aClass144_58 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V")
	public static void method5498(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static235.aBoolean314) {
			Static235.aBoolean314 = arg0;
			Static152.method4674();
		}
	}
}
