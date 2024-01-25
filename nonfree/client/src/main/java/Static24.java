import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_12 = new Class267("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public static int anInt778 = 0;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	public static int anInt781 = 0;

	@OriginalMember(owner = "client!be", name = "M", descriptor = "Lclient!ci;")
	public static final Class36 aClass36_2 = new Class36("stellardawn", 1);

	@OriginalMember(owner = "client!be", name = "O", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_2 = new Class44(4);

	@OriginalMember(owner = "client!be", name = "P", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean36 = Boolean.FALSE;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ts;B)V")
	public static void method662(@OriginalArg(0) Class239 arg0) {
		@Pc(7) Class239 local7 = Static211.method3216(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local12 = Static348.anInt6272;
			local15 = Static199.anInt3767;
		} else {
			local12 = local7.anInt6898;
			local15 = local7.anInt6899;
		}
		Static195.method5946(false, local12, arg0, local15);
		Static59.method1316(local15, arg0, local12);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method663(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static346.method5196(arg0);
	}
}
