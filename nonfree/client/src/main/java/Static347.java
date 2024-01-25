import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "Lclient!np;")
	public static Class155 aClass155_9;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_84 = new Class244(7, 7);

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public static int anInt5875 = 0;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_85 = new Class244(72, -1);

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_88 = new Class57("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Lclient!mt;")
	public static final Class162 aClass162_10 = new Class162();

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method5256() {
		Static264.aBoolean365 = true;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)[Lclient!ae;")
	public static Class5[] method5257() {
		if (Static134.aClass5Array1 == null) {
			@Pc(12) Class5[] local12 = Static155.method2391(Static61.aClass156_1);
			@Pc(16) Class5[] local16 = new Class5[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(72) int local72;
			@Pc(78) Class5 local78;
			label63: for (@Pc(20) int local20 = 0; local20 < local12.length; local20++) {
				@Pc(26) Class5 local26 = local12[local20];
				if ((local26.anInt112 <= 0 || local26.anInt112 >= 24) && local26.anInt115 >= 800 && local26.anInt116 >= 600 && (Static368.anInt6173 >= 96 || Static2.anInt68 != 0 || local26.anInt115 <= 1024 && local26.anInt116 <= 768)) {
					for (local72 = 0; local72 < local18; local72++) {
						local78 = local16[local72];
						if (local78.anInt115 == local26.anInt115 && local26.anInt116 == local78.anInt116) {
							if (local78.anInt112 < local26.anInt112) {
								local16[local72] = local26;
							}
							continue label63;
						}
					}
					local16[local18] = local26;
					local18++;
				}
			}
			Static134.aClass5Array1 = new Class5[local18];
			Static400.method1879(local16, 0, Static134.aClass5Array1, 0, local18);
			@Pc(142) int[] local142 = new int[Static134.aClass5Array1.length];
			for (local72 = 0; local72 < Static134.aClass5Array1.length; local72++) {
				local78 = Static134.aClass5Array1[local72];
				local142[local72] = local78.anInt116 * local78.anInt115;
			}
			Static81.method1342(Static134.aClass5Array1, local142);
		}
		return Static134.aClass5Array1;
	}
}
