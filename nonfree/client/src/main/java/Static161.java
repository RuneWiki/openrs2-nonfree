import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gk", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!gk", name = "S", descriptor = "Lclient!lk;")
	public static Class179 aClass179_3;

	@OriginalMember(owner = "client!gk", name = "Q", descriptor = "Lclient!h;")
	public static final Class114 aClass114_74 = new Class114("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!gk", name = "T", descriptor = "[I")
	public static final int[] anIntArray281 = new int[32];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)I")
	public static int method3234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}
}
