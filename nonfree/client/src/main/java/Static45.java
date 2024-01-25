import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!wn;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	public static final int[] anIntArray55 = new int[32];

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_15 = new Class231("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_14 = new Class25(63, 12);

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_16 = new Class231("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_15 = new Class25(51, 3);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lt;III)Lclient!co;")
	public static Class6_Sub1_Sub4 method827(@OriginalArg(0) Class158 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class6_Sub15 local14 = new Class6_Sub15(arg0.method3672(arg2, arg1));
		@Pc(47) Class6_Sub1_Sub4 local47 = new Class6_Sub1_Sub4(arg2, local14.method3093(), local14.method3093(), local14.method3109(), local14.method3109(), local14.method3111() == 1, local14.method3111(), local14.method3111());
		@Pc(51) int local51 = local14.method3111();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass88_12.method1878(new Class6_Sub34(local14.method3111(), local14.method3108(), local14.method3108(), local14.method3108(), local14.method3108(), local14.method3108(), local14.method3108(), local14.method3108(), local14.method3108()));
		}
		local47.method1073();
		return local47;
	}
}
