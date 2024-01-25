import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	public static int anInt4366;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_150 = new Class221("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "[Lclient!he;")
	public static final Class97[] aClass97Array1 = new Class97[8];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V")
	public static void method3875(@OriginalArg(0) int arg0) {
		Static368.anInt6424 = arg0;
		@Pc(12) Class154 local12 = Static285.aClass154_38;
		synchronized (Static285.aClass154_38) {
			Static285.aClass154_38.method3748();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBIII)V")
	public static void method3880(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static332.anInt5823 = 0;
		Static202.anInt3722 = arg1;
		Static345.anInt6084 = arg0;
		Static313.anInt5542 = 0;
	}
}
