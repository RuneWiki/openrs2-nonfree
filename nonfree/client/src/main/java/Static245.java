import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "Lclient!ku;")
	public static Class138 aClass138_4;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
	public static int anInt4733;

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "[I")
	public static final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean411 = Boolean.FALSE;

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_149 = new Class189("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIII)V")
	public static void method3728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - arg1;
		@Pc(13) int local13 = arg0 - arg4;
		if (local13 == 0) {
			if (local8 != 0) {
				Static415.method5323(arg1, arg4, arg2, arg3);
			}
		} else if (local8 == 0) {
			Static182.method2889(arg0, arg2, arg1, arg4);
		} else {
			if (local8 < 0) {
				local8 = -local8;
			}
			if (local13 < 0) {
				local13 = -local13;
			}
			@Pc(56) boolean local56 = local8 > local13;
			@Pc(60) int local60;
			@Pc(62) int local62;
			if (local56) {
				local60 = arg4;
				local62 = arg0;
				arg4 = arg1;
				arg0 = arg3;
				arg1 = local60;
				arg3 = local62;
			}
			if (arg0 < arg4) {
				local60 = arg4;
				local62 = arg1;
				arg4 = arg0;
				arg1 = arg3;
				arg0 = local60;
				arg3 = local62;
			}
			local60 = arg1;
			local62 = arg0 - arg4;
			@Pc(105) int local105 = arg3 - arg1;
			@Pc(110) int local110 = -(local62 >> 1);
			if (local105 < 0) {
				local105 = -local105;
			}
			@Pc(125) int local125 = arg1 < arg3 ? 1 : -1;
			@Pc(129) int local129;
			if (local56) {
				for (local129 = arg4; local129 <= arg0; local129++) {
					Static262.anIntArrayArray31[local129][local60] = arg2;
					local110 += local105;
					if (local110 > 0) {
						local110 -= local62;
						local60 += local125;
					}
				}
			} else {
				for (local129 = arg4; local129 <= arg0; local129++) {
					Static262.anIntArrayArray31[local60][local129] = arg2;
					local110 += local105;
					if (local110 > 0) {
						local60 += local125;
						local110 -= local62;
					}
				}
			}
		}
	}
}
