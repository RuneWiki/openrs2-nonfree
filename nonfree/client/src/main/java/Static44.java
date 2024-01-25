import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cm", name = "P", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_14 = new Class93("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
	public static int anInt988 = -1;

	@OriginalMember(owner = "client!cm", name = "S", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)Lclient!wp;")
	public static Class215 method1076(@OriginalArg(0) int arg0) {
		@Pc(10) Class119 local10 = Static153.aClass119_97;
		@Pc(19) Class215 local19;
		synchronized (Static153.aClass119_97) {
			local19 = (Class215) Static153.aClass119_97.method3311((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static194.aClass191_124.method5459(Static6.method209(arg0), Static284.method5100(arg0));
		local19 = new Class215();
		local19.anInt6962 = arg0;
		if (local39 != null) {
			local19.method5982(new Class2_Sub10(local39));
		}
		@Pc(57) Class119 local57 = Static153.aClass119_97;
		synchronized (Static153.aClass119_97) {
			Static153.aClass119_97.method3308(local19, (long) arg0);
			return local19;
		}
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(B)V")
	public static void method1078() {
		Static295.aClass119_179.method3304();
	}
}
