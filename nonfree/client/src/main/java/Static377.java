import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "[I")
	public static final int[] anIntArray496 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_9 = new Class273(9, 0, 4, 1);

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "Lclient!h;")
	public static final Class114 aClass114_129 = new Class114("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "Lclient!h;")
	public static final Class114 aClass114_130 = new Class114("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!h;")
	public static final Class114 aClass114_131 = new Class114("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!gw;Z)V")
	public static void method5728(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (Static132.aClass279_8 == null) {
			return;
		}
		try {
			Static132.aClass279_8.method6839(0L);
			Static132.aClass279_8.method6847(arg0, arg1.aByteArray45, 24);
		} catch (@Pc(19) Exception local19) {
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
	public static void method5729(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(12, arg1);
		local8.method4919();
		local8.anInt5686 = arg0;
	}
}
