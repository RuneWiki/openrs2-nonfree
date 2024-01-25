import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "F")
	public static float aFloat274;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_98 = new Class40("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "[Lclient!ef;")
	public static final Class79_Sub1[] aClass79_Sub1Array2 = new Class79_Sub1[32];

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lclient!nt;")
	public static Class5_Sub34 method5369(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class5_Sub34_Sub1");
			@Pc(10) Class5_Sub34 local10 = (Class5_Sub34) local6.getDeclaredConstructor().newInstance();
			local10.method6470(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class5_Sub34_Sub2 local26 = new Class5_Sub34_Sub2();
			local26.method6470(arg0);
			return local26;
		}
	}
}
