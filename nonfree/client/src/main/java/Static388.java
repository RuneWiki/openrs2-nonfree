import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static388 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_60 = new Class236(67, 4);

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_108 = new Class40("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_174 = new Class150(1, -2);

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_61 = new Class236(56, -1);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BII)Z")
	public static boolean method5701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
