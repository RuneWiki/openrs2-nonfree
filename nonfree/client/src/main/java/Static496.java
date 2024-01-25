import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "Lclient!oca;")
	public static Class210 aClass210_3;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_130 = new Class45("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7603(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(3, arg1);
		local8.method6693();
		local8.aString185 = arg0;
	}
}
