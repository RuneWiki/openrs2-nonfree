import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_7 = new Class68(64);

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_15 = new Class88("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_2 = new Class202(1, 5);

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "[I")
	public static final int[] anIntArray32 = new int[25];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[FIIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static78.method1703(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static78.method1703(arg2)) {
			@Pc(37) int local37 = Static129.method7912(6408);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg5 >= arg2 ? arg2 : arg5;
			@Pc(50) int local50 = arg5 >> 1;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(56) float[] local56 = arg1;
			@Pc(63) float[] local63 = new float[local50 * local54 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg5, arg2, 0, 6408, 5126, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(81) int local81 = local37 * arg5;
				@Pc(83) float[] local83 = local63;
				for (@Pc(85) int local85 = 0; local85 < local37; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(95) int local95 = local81 + local85;
					for (@Pc(97) int local97 = 0; local97 < local54; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local50; local101++) {
							@Pc(107) float local107 = local56[local91];
							local91 += local37;
							@Pc(117) float local117 = local107 + local56[local91];
							local91 += local37;
							@Pc(127) float local127 = local117 + local56[local95];
							local95 += local37;
							@Pc(137) float local137 = local127 + local56[local95];
							local95 += local37;
							local63[local89] = local137 * 0.25F;
							local89 += local37;
						}
						local95 += local81;
						local91 += local81;
					}
				}
				local63 = local56;
				arg2 = local54;
				local56 = local83;
				arg5 = local50;
				local39++;
				local54 >>= 0x1;
				local46 >>= 0x1;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method554() {
		try {
			@Pc(26) Method local26 = Runtime.class.getMethod("availableProcessors");
			if (local26 != null) {
				try {
					@Pc(30) Runtime local30 = Runtime.getRuntime();
					@Pc(36) Integer local36 = (Integer) local26.invoke(local30, (Object[]) null);
					Static52.anInt1395 = local36;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZZ)V")
	public static void method558(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static23.anInt9179--;
			if (Static23.anInt9179 == 0) {
				Static141.anIntArray234 = null;
			}
		}
		if (arg1) {
			Static182.anInt4220--;
			if (Static182.anInt4220 == 0) {
				Static69.anIntArray673 = null;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB[BI)I")
	public static int method559(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local7 = Class94.anIntArray223[(arg1[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method560() {
		if (Static383.aClass42_7 != null) {
			Static383.aClass42_7.method5807();
			Class54_Sub1.lb = null;
			Static383.aClass42_7 = null;
		}
	}
}
