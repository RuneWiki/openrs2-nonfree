import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_104 = new Class15("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_105 = new Class15("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[Lclient!rh;")
	public static final Class218[] aClass218Array1 = new Class218[16];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!qn;)Lclient!mq;")
	public static Class4_Sub26 method4599(@OriginalArg(0) int arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(16) byte[] local16 = arg1.method4353(arg0);
		return local16 == null ? null : new Class4_Sub26(local16);
	}
}
