import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bfa", name = "j", descriptor = "[I")
	public static int[] anIntArray56;

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
	public static int anInt602;

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lclient!tfa;")
	public static final Class352 aClass352_1 = new Class352();

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "[I")
	public static final int[] anIntArray57 = new int[250];

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZII)V")
	public static void method591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class264 local9 = Static307.aClass264ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static69.anInt1215 = local9.anInt7051;
			Static68.anInt1181 = local9.anInt7053;
			Static118.anInt1986 = local9.anInt7044;
		}
		Static162.method2418();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!nca;)V")
	public static void method593(@OriginalArg(1) Class254 arg0) {
		Static102.anInt1792 = arg0.method6077("hitbar_default");
		Static73.anInt1305 = arg0.method6077("timerbar_default");
		Static723.anInt11034 = arg0.method6077("headicons_pk");
		Static293.anInt4538 = arg0.method6077("headicons_prayer");
		Static476.anInt7646 = arg0.method6077("hint_headicons");
		Static104.anInt1808 = arg0.method6077("hint_mapmarkers");
		Static477.anInt7667 = arg0.method6077("mapflag");
		Static361.anInt5761 = arg0.method6077("cross");
		Static110.anInt1833 = arg0.method6077("mapdots");
		Static488.anInt7863 = arg0.method6077("scrollbar");
		Static694.anInt10675 = arg0.method6077("name_icons");
		Static530.anInt8404 = arg0.method6077("floorshadows");
		Static629.anInt9655 = arg0.method6077("compass");
		Static234.anInt3711 = arg0.method6077("otherlevel");
		Static632.anInt9758 = arg0.method6077("hint_mapedge");
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIZIFII)[[I")
	public static int[][] method594(@OriginalArg(6) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub11_Sub20 local13 = new Class2_Sub11_Sub20();
		local13.anInt7854 = 3;
		local13.anInt7851 = 4;
		local13.anInt7859 = (int) (arg0 * 4096.0F);
		local13.anInt7860 = 4;
		local13.aBoolean687 = false;
		local13.method9530();
		Static7.method98(256, 64);
		for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
			local13.method7010(local58, local9[local58]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IBZI)Lclient!nca;")
	public static Class254 method595(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class402 local13 = null;
		if (Static163.aClass260_2 != null) {
			local13 = new Class402(arg0, Static163.aClass260_2, Static501.aClass260Array4[arg0], 1000000);
		}
		Static485.aClass147_Sub1Array1[arg0] = Static402.aClass318_1.method7562(Static633.aClass402_3, local13, arg0);
		Static485.aClass147_Sub1Array1[arg0].method3247();
		return new Class254(Static485.aClass147_Sub1Array1[arg0], arg1, arg2);
	}
}
