import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!om", name = "Lb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "J")
	public static long aLong132 = 0L;

	@OriginalMember(owner = "client!om", name = "zb", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_80 = new Class117(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!om", name = "Ab", descriptor = "J")
	public static long aLong133 = 0L;

	@OriginalMember(owner = "client!om", name = "Fb", descriptor = "I")
	public static int anInt4634 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lclient!nr;")
	public static Class65 method4090(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class65_Sub1");
			@Pc(15) Class65 local15 = (Class65) local11.getDeclaredConstructor().newInstance();
			local15.method2525(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class65_Sub2 local26 = new Class65_Sub2();
			local26.method2525(arg0);
			return local26;
		}
	}
}
