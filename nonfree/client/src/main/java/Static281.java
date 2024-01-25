import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "[I")
	public static final int[] anIntArray443 = new int[250];

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
	public static int anInt5678 = 0;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "Z")
	public static boolean aBoolean502 = false;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Z")
	public static boolean aBoolean503 = false;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_135 = new Class140("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "[I")
	public static final int[] anIntArray444 = new int[5];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILclient!sc;II)Ljava/awt/Frame;")
	public static Frame method4796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class179 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method4874()) {
			return null;
		}
		@Pc(18) Class147[] local18 = Static363.method5800(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (arg3 == local18[local26].anInt4940 && arg1 == local18[local26].anInt4943 && (!local24 || local18[local26].anInt4945 > arg0)) {
				arg0 = local18[local26].anInt4945;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(87) Class26 local87 = arg2.method4901(arg0, arg3, arg1);
		while (local87.anInt484 == 0) {
			Static248.method4401(10L);
		}
		@Pc(102) Frame local102 = (Frame) local87.anObject1;
		if (local102 == null) {
			return null;
		} else if (local87.anInt484 == 2) {
			Static155.method3199(local102, arg2);
			return null;
		} else {
			return local102;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIIIIILclient!ef;ZIIII)V")
	public static void method4797(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub12 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg8 == 1) {
			arg7 = 1;
		} else if (arg8 == 2) {
			arg9 = 1;
			arg7 = 1;
		} else if (arg8 == 3) {
			arg9 = 1;
		}
		@Pc(64) int local64;
		if (arg2 < 0 || arg2 >= Static66.anInt1177 || arg4 < 0 || Static12.anInt213 <= arg4) {
			while (true) {
				local64 = arg5.method3124();
				if (local64 == 0) {
					return;
				}
				if (local64 == 1) {
					arg5.method3124();
					return;
				}
				if (local64 <= 49) {
					arg5.method3124();
				}
			}
			return;
		}
		if (!arg0 && !arg6) {
			Static243.aByteArrayArrayArray10[arg1][arg2][arg4] = 0;
		}
		while (true) {
			local64 = arg5.method3124();
			if (local64 == 0) {
				if (arg0) {
					Static327.anIntArrayArrayArray12[0][arg2 + arg9][arg4 + arg7] = Static101.aClass105Array2[0].method4453(arg9 + arg2, arg4 - -arg7);
					return;
				} else if (arg1 == 0) {
					Static327.anIntArrayArrayArray12[0][arg9 + arg2][arg4 + arg7] = -Static253.method4467(arg10 + 556238, arg3 + 932731) * 8;
					return;
				} else {
					Static327.anIntArrayArrayArray12[arg1][arg2 + arg9][arg7 + arg4] = Static327.anIntArrayArrayArray12[arg1 - 1][arg9 + arg2][arg7 + arg4] - 240;
					return;
				}
			}
			if (local64 == 1) {
				@Pc(156) int local156 = arg5.method3124();
				if (arg0) {
					Static327.anIntArrayArrayArray12[0][arg2 + arg9][arg7 + arg4] = Static101.aClass105Array2[0].method4453(arg9 + arg2, arg7 + arg4) + local156 * 8;
					return;
				}
				if (local156 == 1) {
					local156 = 0;
				}
				if (arg1 == 0) {
					Static327.anIntArrayArrayArray12[0][arg2 + arg9][arg7 + arg4] = -local156 * 8;
					return;
				}
				Static327.anIntArrayArrayArray12[arg1][arg2 + arg9][arg7 + arg4] = Static327.anIntArrayArrayArray12[arg1 - 1][arg2 + arg9][arg7 + arg4] - local156 * 8;
				return;
			}
			if (local64 <= 49) {
				if (arg6) {
					arg5.method3124();
				} else {
					Static182.aByteArrayArrayArray3[arg1][arg2][arg4] = arg5.method3122();
					Static18.aByteArrayArrayArray1[arg1][arg2][arg4] = (byte) ((local64 - 2) / 4);
					Static198.aByteArrayArrayArray8[arg1][arg2][arg4] = (byte) (local64 + arg8 - 2 & 0x3);
				}
			} else if (local64 <= 81) {
				if (!arg0 && !arg6) {
					Static243.aByteArrayArrayArray10[arg1][arg2][arg4] = (byte) (local64 - 49);
				}
			} else if (!arg6) {
				Static335.aByteArrayArrayArray13[arg1][arg2][arg4] = (byte) (local64 - 81);
			}
		}
	}
}
