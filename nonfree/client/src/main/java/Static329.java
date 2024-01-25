import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString57;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_148 = new Class77(70, 12);

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_202 = new Class221("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_48 = new Class154(260);

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "[B")
	public static final byte[] aByteArray90 = new byte[520];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V")
	public static void method5057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		@Pc(28) int local28 = Static355.method5388(Static332.anInt5823, arg2 + arg3, Static202.anInt3722);
		@Pc(37) int local37 = Static355.method5388(Static332.anInt5823, arg2 - arg3, Static202.anInt3722);
		Static264.method4096(Static267.anIntArrayArray38[arg0], arg1, local28, local37);
		while (local7 < local9) {
			local19 += 2;
			local17 += local19;
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local17 > 0) {
				local9--;
				local17 -= local9 << 1;
				local69 = arg0 - local9;
				local73 = arg0 + local9;
				if (local73 >= Static313.anInt5542 && local69 <= Static345.anInt6084) {
					local91 = Static355.method5388(Static332.anInt5823, local7 + arg2, Static202.anInt3722);
					local100 = Static355.method5388(Static332.anInt5823, arg2 - local7, Static202.anInt3722);
					if (local73 <= Static345.anInt6084) {
						Static264.method4096(Static267.anIntArrayArray38[local73], arg1, local91, local100);
					}
					if (local69 >= Static313.anInt5542) {
						Static264.method4096(Static267.anIntArrayArray38[local69], arg1, local91, local100);
					}
				}
			}
			local7++;
			local69 = arg0 - local7;
			local73 = local7 + arg0;
			if (Static313.anInt5542 <= local73 && local69 <= Static345.anInt6084) {
				local91 = Static355.method5388(Static332.anInt5823, arg2 + local9, Static202.anInt3722);
				local100 = Static355.method5388(Static332.anInt5823, arg2 - local9, Static202.anInt3722);
				if (local73 <= Static345.anInt6084) {
					Static264.method4096(Static267.anIntArrayArray38[local73], arg1, local91, local100);
				}
				if (local69 >= Static313.anInt5542) {
					Static264.method4096(Static267.anIntArrayArray38[local69], arg1, local91, local100);
				}
			}
		}
	}
}
