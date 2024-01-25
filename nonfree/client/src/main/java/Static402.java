import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_103 = new Class231("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public static int anInt6639 = 10;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!oq;")
	public static final Class193 aClass193_8 = new Class193("", 12);

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_104 = new Class231("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_105 = new Class231("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
	public static int anInt6641 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!uj;)I")
	public static int method5467(@OriginalArg(1) Class3_Sub3_Sub6_Sub2 arg0) {
		@Pc(8) Class17 local8 = arg0.aClass17_1;
		if (local8.anIntArray26 != null) {
			local8 = local8.method288(Static71.aClass126_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local8.anInt353;
		@Pc(34) Class208 local34 = arg0.method5511();
		if (arg0.aBoolean453) {
			local30 = local8.anInt354;
		} else if (local34.anInt5574 == arg0.anInt6735 || arg0.anInt6735 == local34.anInt5595 || local34.anInt5570 == arg0.anInt6735 || arg0.anInt6735 == local34.anInt5555) {
			local30 = local8.anInt355;
		} else if (local34.anInt5588 == arg0.anInt6735 || local34.anInt5571 == arg0.anInt6735 || local34.anInt5585 == arg0.anInt6735 || local34.anInt5573 == arg0.anInt6735) {
			local30 = local8.anInt358;
		}
		return local30;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIB)I")
	public static int method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method5469() {
		Static153.aClass220_18.method4999();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Z")
	public static boolean method5471(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
