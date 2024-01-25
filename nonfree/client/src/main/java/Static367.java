import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_85 = new Class84("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	public static int anInt6237 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIIIIII)I")
	public static int method5044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(21) int local21 = arg2;
			arg2 = arg5;
			arg5 = local21;
		}
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg4;
		} else if (local12 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return 7 + 1 - arg4 - arg5;
		}
	}
}
