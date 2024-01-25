import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
	public static int anInt3807;

	@OriginalMember(owner = "client!lq", name = "M", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_144 = new Class214(96, 20);

	@OriginalMember(owner = "client!lq", name = "P", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_125 = new Class151("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
	public static void method3089() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static302.anInt5050 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIB)Z")
	public static boolean method3090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(IIIIII)V")
	public static void method3092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg2;
		@Pc(14) int local14 = arg4 - arg1;
		if (local9 == 0) {
			if (local14 != 0) {
				Static387.method4936(arg2, arg4, arg3, arg1);
			}
		} else if (local14 == 0) {
			Static225.method3001(arg2, arg0, arg1, arg3);
		} else {
			@Pc(46) int local46 = (local14 << 12) / local9;
			@Pc(55) int local55 = arg1 - (arg2 * local46 >> 12);
			@Pc(72) int local72;
			@Pc(81) int local81;
			if (Static271.anInt4271 > arg2) {
				local72 = Static271.anInt4271;
				local81 = local55 + (local46 * Static271.anInt4271 >> 12);
			} else if (arg2 > Static13.anInt263) {
				local72 = Static13.anInt263;
				local81 = local55 + (local46 * Static13.anInt263 >> 12);
			} else {
				local81 = arg1;
				local72 = arg2;
			}
			@Pc(112) int local112;
			@Pc(110) int local110;
			if (arg0 < Static271.anInt4271) {
				local110 = local55 + (Static271.anInt4271 * local46 >> 12);
				local112 = Static271.anInt4271;
			} else if (Static13.anInt263 < arg0) {
				local110 = local55 + (Static13.anInt263 * local46 >> 12);
				local112 = Static13.anInt263;
			} else {
				local110 = arg4;
				local112 = arg0;
			}
			if (local81 < Static74.anInt1413) {
				local72 = (Static74.anInt1413 - local55 << 12) / local46;
				local81 = Static74.anInt1413;
			} else if (local81 > Static149.anInt7384) {
				local81 = Static149.anInt7384;
				local72 = (Static149.anInt7384 - local55 << 12) / local46;
			}
			if (Static74.anInt1413 > local110) {
				local110 = Static74.anInt1413;
				local112 = (Static74.anInt1413 - local55 << 12) / local46;
			} else if (Static149.anInt7384 < local110) {
				local112 = (Static149.anInt7384 - local55 << 12) / local46;
				local110 = Static149.anInt7384;
			}
			Static311.method4037(local81, local112, arg3, local72, local110);
		}
	}
}
