import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Lclient!fc;")
	public static Class71 aClass71_84;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "Lclient!op;")
	public static Class21 aClass21_3;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_214 = new Class221("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
	public static int anInt6052 = 0;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "[Lclient!bg;")
	public static final Class20[] aClass20Array1 = new Class20[29];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)[B")
	public static byte[] method5242(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub15 local12 = (Class2_Sub1_Sub15) Static154.aClass55_4.method1250((long) arg0);
		if (local12 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static367.method5542(local52, local28);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local12 = new Class2_Sub1_Sub15(local22);
			Static154.aClass55_4.method1248((long) arg0, local12);
		}
		return local12.aByteArray95;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg4) {
			Static203.method3380(arg1, arg6, arg3, arg2, arg5, arg0);
		} else if (arg2 - arg3 >= Static332.anInt5823 && arg3 + arg2 <= Static202.anInt3722 && Static313.anInt5542 <= arg5 - arg4 && arg4 + arg5 <= Static345.anInt6084) {
			Static29.method708(arg4, arg6, arg1, arg5, arg0, arg2, arg3);
		} else {
			Static344.method5460(arg5, arg0, arg4, arg3, arg1, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIB)I")
	public static int method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}
}
