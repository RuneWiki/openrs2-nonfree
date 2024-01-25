import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_55 = new Class117("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "[I")
	public static final int[] anIntArray200 = new int[13];

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_27 = new Class26(16);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)V")
	public static void method2524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class214 local9 = Static247.aClass214ArrayArray1[arg1][arg0];
		Static275.method4660(local9 == null ? Static217.aClass214_2 : local9, 5000);
	}
}
