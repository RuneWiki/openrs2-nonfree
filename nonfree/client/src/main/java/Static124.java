import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Lclient!ok;")
	public static Class178 aClass178_40;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "[Lclient!vo;")
	public static Class260[] aClass260Array1;

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_55 = new Class55("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
	public static int anInt2429 = -1;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean135 = true;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_19 = new Class126(32);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2021(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 < 128 || arg6 < 128 || arg1 > (Static333.anInt3375 - 2) * 128 || arg6 > Static102.anInt2086 * 128 - 256) {
			Static25.anIntArray37[0] = Static25.anIntArray37[1] = -1;
			return;
		}
		@Pc(52) int local52 = Static333.method2748(arg4, arg6, arg1) - arg2;
		Static179.aClass33_11.o(arg3, 0, 0);
		Static269.aClass51_9.ea(Static179.aClass33_11);
		Static269.aClass51_9.X(arg1, local52, arg6, Static25.anIntArray37);
		Static179.aClass33_11.o(-arg3, 0, 0);
		Static269.aClass51_9.ea(Static179.aClass33_11);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ec;BIIII)Ljava/awt/Frame;")
	public static Frame method2023(@OriginalArg(0) Class61 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method1454()) {
			return null;
		}
		@Pc(25) Class234[] local25 = Static294.method3885(arg0);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (local25[local33].anInt6123 == arg3 && local25[local33].anInt6121 == arg2 && (!local31 || local25[local33].anInt6125 > arg1)) {
				local31 = true;
				arg1 = local25[local33].anInt6125;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(91) Class236 local91 = arg0.method1460(arg1, arg2, arg3);
		while (local91.anInt6178 == 0) {
			Static214.method2089(10L);
		}
		@Pc(103) Frame local103 = (Frame) local91.anObject8;
		if (local103 == null) {
			return null;
		} else if (local91.anInt6178 == 2) {
			Static39.method562(arg0, local103);
			return null;
		} else {
			return local103;
		}
	}
}
