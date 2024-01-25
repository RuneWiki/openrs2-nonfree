import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Lclient!di;")
	public static final Class54 aClass54_76 = new Class54(74, -1);

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_123 = new Class209("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[5];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static386.anIntArrayArrayArray12[arg0][local16][local20] == -Static318.anInt6744) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static307.anInt5425) + 1;
			@Pc(142) int local142 = (arg3 << Static307.anInt5425) + 2;
			@Pc(151) int local151 = Static58.aClass64Array1[arg0].l(arg1, arg3) + arg5;
			if (!Static389.method5165(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static307.anInt5425) - 1;
			if (!Static389.method5165(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static307.anInt5425) - 1;
			if (!Static389.method5165(local20, local151, local177)) {
				return false;
			} else if (Static389.method5165(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static387.method5127(arg0, arg1, arg3)) {
			local16 = arg1 << Static307.anInt5425;
			local20 = arg3 << Static307.anInt5425;
			return Static389.method5165(local16 + 1, Static58.aClass64Array1[arg0].l(arg1, arg3) + arg5, local20 + 1) && Static389.method5165(local16 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1 + 1, arg3) + arg5, local20 + 1) && Static389.method5165(local16 + Static8.anInt242 - 1, Static58.aClass64Array1[arg0].l(arg1 + 1, arg3 + 1) + arg5, local20 + Static8.anInt242 - 1) && Static389.method5165(local16 + 1, Static58.aClass64Array1[arg0].l(arg1, arg3 + 1) + arg5, local20 + Static8.anInt242 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(JI)V")
	public static void method4295(@OriginalArg(0) long arg0) {
		Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
		Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_7.anInt6576);
		Static424.aClass2_Sub23_Sub2_1.method5450(arg0);
		Static449.anInt7307 = 0;
		Static103.anInt2416 = 0;
		Static3.anInt113 = -3;
		Static10.anInt258 = 1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method4296(@OriginalArg(0) Class49 arg0) {
		if (Static404.aClass14_44.method297() == 0) {
			return;
		}
		@Pc(57) Class2_Sub40 local57;
		if (Static399.anInt6653 == 0) {
			for (local57 = (Class2_Sub40) Static404.aClass14_44.method309(); local57 != null; local57 = (Class2_Sub40) Static404.aClass14_44.method311()) {
				Static318.aClass144_6.method3267(local57.anInt6443, local57.anInt6449, local57.aBoolean440 ? Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1 : null, false, Static291.aClass116_3, arg0, local57.anInt6444, false, arg0, local57.anInt6446, local57.anInt6448);
				local57.method5866();
			}
			Static260.method3927();
			return;
		}
		if (Static246.aClass49_8 == null) {
			@Pc(27) Canvas local27 = new Canvas();
			local27.setSize(36, 32);
			Static246.aClass49_8 = Static455.method4474(0, Static43.aClass59_5, Static427.anInterface4_8, local27, 0);
			Static279.aClass116_2 = Static246.aClass49_8.method4479(Static334.method4661(Static410.aClass160_77, Static400.anInt7453), Static459.method2071(Static153.aClass160_25, Static400.anInt7453));
		}
		for (local57 = (Class2_Sub40) Static404.aClass14_44.method309(); local57 != null; local57 = (Class2_Sub40) Static404.aClass14_44.method311()) {
			Static318.aClass144_6.method3267(local57.anInt6443, local57.anInt6449, local57.aBoolean440 ? Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1 : null, false, Static279.aClass116_2, Static246.aClass49_8, local57.anInt6444, false, arg0, local57.anInt6446, local57.anInt6448);
			local57.method5866();
		}
	}
}
