import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_90 = new Class158("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public static void method2630() {
		Static32.method677(Static426.aClass177_22);
		Static433.aClass1_Sub3_Sub1_11.method1227(Static20.anInt524);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public static void method2632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg0, 16);
		local8.method2957();
		local8.anInt3820 = arg1;
	}
}
