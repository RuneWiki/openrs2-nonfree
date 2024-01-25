import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_111 = new Class96("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_147 = new Class254(28, 7);

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "[I")
	public static final int[] anIntArray573 = new int[3];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)Z")
	public static boolean method5913(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(17) int local17 = local8.method4548();
		if (local17 != 1) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method4548() == 1;
		if (local35) {
			Static148.method5603(local8);
		}
		Static454.method5993(local8);
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!db;I)Z")
	public static boolean method5915(@OriginalArg(0) Class52 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean101) {
			return false;
		} else if (!arg0.method981(Static350.anInterface1_2)) {
			return false;
		} else if (Static353.aClass51_25.method930((long) arg0.anInt1184) == null) {
			return Static22.aClass51_2.method930((long) arg0.anInt1179) == null;
		} else {
			return false;
		}
	}
}
