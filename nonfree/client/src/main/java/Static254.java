import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Lclient!ob;")
	public static Class4_Sub30 aClass4_Sub30_1;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_71 = new Class15("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
	public static int anInt4209 = -1;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_72 = new Class15("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
	public static final int anInt4210 = -1;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	public static int anInt4211 = 0;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
	public static int anInt4212 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([I[JIII)V")
	public static void method3351(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg3; local56 < arg2; local56++) {
			if ((long) (local54 & local56) + local20 > arg1[local56]) {
				@Pc(77) long local77 = arg1[local56];
				arg1[local56] = arg1[local16];
				arg1[local16] = local77;
				@Pc(91) int local91 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16++] = local91;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method3351(arg0, arg1, local16 - 1, arg3);
		method3351(arg0, arg1, arg2, local16 + 1);
	}
}
