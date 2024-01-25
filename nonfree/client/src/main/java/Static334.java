import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_118 = new Class55("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_120 = new Class253(66, -2);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4374(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class7_Sub4_Sub14 local10 = Static54.method750(arg0, 3);
		local10.method4716();
		local10.aString57 = arg1;
	}
}
