import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "J")
	public static long aLong92;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "[Lclient!aca;")
	public static final Interface1[] anInterface1Array1 = new Interface1[75];

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "[I")
	public static final int[] anIntArray237 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_87 = new Class88("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_31 = new Class77(45, 8);

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_88 = new Class88("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "[I")
	public static final int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Lclient!fq;")
	public static Class30_Sub5 method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class30_Sub5 local14 = local7.aClass30_Sub5_1;
			local7.aClass30_Sub5_1 = null;
			return local14;
		}
	}
}
