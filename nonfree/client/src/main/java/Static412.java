import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public static int anInt6899;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "Lclient!qq;")
	public static Class28 aClass28_121;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Lclient!mn;")
	public static Class169 aClass169_5;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!jg;")
	public static final Class128 aClass128_10 = new Class128();

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
	public static int anInt6898 = 0;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_124 = new Class186(73, -1);

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_106 = new Class231("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
	public static void method5597() {
		for (@Pc(1) int local1 = 0; local1 < Static215.anInt3735; local1++) {
			@Pc(6) Class3_Sub3 local6 = Static81.aClass3_Sub3Array1[local1];
			Static90.method1558(local6);
			Static81.aClass3_Sub3Array1[local1] = null;
		}
		Static215.anInt3735 = 0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	public static void method5599() {
		Static228.anInt3878 = 0;
		Static307.aClass88_23.method1887();
		Static206.aBoolean239 = false;
	}
}
