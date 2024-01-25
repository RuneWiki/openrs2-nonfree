import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
	public static int anInt6132;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Lclient!h;")
	public static final Class114 aClass114_115 = new Class114("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_97 = new Class6(9, 20);

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
	public static boolean aBoolean418 = true;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
	public static int anInt6133 = 0;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "Lclient!h;")
	public static final Class114 aClass114_116 = new Class114("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIBI)V")
	public static void method5300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(39) int local39 = arg0 << 1;
		@Pc(48) int local48 = local21 + local13 * (1 - local39);
		@Pc(57) int local57 = local17 - (local39 - 1) * local25;
		@Pc(61) int local61 = local13 << 2;
		@Pc(65) int local65 = local17 << 2;
		@Pc(73) int local73 = local21 * 3;
		@Pc(81) int local81 = ((arg0 << 1) - 3) * local25;
		@Pc(87) int local87 = local65;
		@Pc(105) int local105;
		@Pc(114) int local114;
		if (arg2 >= Static92.anInt2338 && Static341.anInt6379 >= arg2) {
			local105 = Static193.method3621(Static299.anInt4491, arg4 + arg3, Static95.anInt2358);
			local114 = Static193.method3621(Static299.anInt4491, arg3 - arg4, Static95.anInt2358);
			Static227.method7421(local114, arg1, local105, Static81.anIntArrayArray25[arg2]);
		}
		@Pc(128) int local128 = (arg0 - 1) * local61;
		while (local9 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local57 += local87;
					local48 += local73;
					local73 += local65;
					local87 += local65;
					local7++;
				}
			}
			if (local57 < 0) {
				local48 += local73;
				local57 += local87;
				local7++;
				local73 += local65;
				local87 += local65;
			}
			local48 += -local128;
			local57 += -local81;
			local9--;
			local128 -= local61;
			local81 -= local61;
			local105 = arg2 - local9;
			local114 = arg2 + local9;
			if (Static92.anInt2338 <= local114 && Static341.anInt6379 >= local105) {
				@Pc(228) int local228 = Static193.method3621(Static299.anInt4491, local7 + arg3, Static95.anInt2358);
				@Pc(237) int local237 = Static193.method3621(Static299.anInt4491, arg3 - local7, Static95.anInt2358);
				if (local105 >= Static92.anInt2338) {
					Static227.method7421(local237, arg1, local228, Static81.anIntArrayArray25[local105]);
				}
				if (Static341.anInt6379 >= local114) {
					Static227.method7421(local237, arg1, local228, Static81.anIntArrayArray25[local114]);
				}
			}
		}
	}
}
