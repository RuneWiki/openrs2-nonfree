import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_88 = new Class117("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "[I")
	public static final int[] anIntArray399 = new int[5];

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public static int anInt5200 = -1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)Z")
	public static boolean method4460(@OriginalArg(0) int arg0) {
		if (Static192.aBooleanArray20[arg0]) {
			return true;
		} else if (Static46.aClass144_19.method3915(arg0)) {
			@Pc(28) int local28 = Static46.aClass144_19.method3890(arg0);
			if (local28 == 0) {
				Static192.aBooleanArray20[arg0] = true;
				return true;
			}
			if (Static188.aClass137ArrayArray1[arg0] == null) {
				Static188.aClass137ArrayArray1[arg0] = new Class137[local28];
			}
			for (@Pc(50) int local50 = 0; local50 < local28; local50++) {
				if (Static188.aClass137ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static46.aClass144_19.method3896(local50, arg0);
					if (local64 != null) {
						@Pc(76) Class137 local76 = Static188.aClass137ArrayArray1[arg0][local50] = new Class137();
						local76.anInt4044 = (arg0 << 16) + local50;
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method3604(new Class11_Sub25(local64));
					}
				}
			}
			Static192.aBooleanArray20[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([BB)[B")
	public static byte[] method4461(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static363.method1668(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!nq;I)I")
	public static int method4462(@OriginalArg(0) Class144 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3910(Static163.anInt3076)) {
			local5++;
		}
		if (arg0.method3910(Static58.anInt1091)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IJ)V")
	public static void method4464(@OriginalArg(1) long arg0) {
		Static313.aClass11_Sub25_Sub1_5.anInt6076 = 0;
		Static313.aClass11_Sub25_Sub1_5.method5186(21);
		Static313.aClass11_Sub25_Sub1_5.method5178(arg0);
		Static90.anInt4649 = -3;
		Static41.anInt740 = 0;
		Static2.anInt9 = 0;
		Static136.anInt6476 = 1;
	}
}
