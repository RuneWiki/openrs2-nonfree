import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public static int anInt2901;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_40 = new Class67(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_41 = new Class67("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	public static int anInt2899 = 0;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[I")
	public static int[] anIntArray281 = new int[2];

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "[I")
	public static final int[] anIntArray282 = new int[4096];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([I[IIII)V")
	public static void method2466(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) int local16 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local16;
		@Pc(30) int local30 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local30;
		@Pc(49) int local49 = ~local16 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg3; local51 < arg2; local51++) {
			if (arg1[local51] < local16 + (local49 & local51)) {
				@Pc(70) int local70 = arg1[local51];
				arg1[local51] = arg1[local12];
				arg1[local12] = local70;
				@Pc(84) int local84 = arg0[local51];
				arg0[local51] = arg0[local12];
				arg0[local12++] = local84;
			}
		}
		arg1[arg2] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg2] = arg0[local12];
		arg0[local12] = local30;
		method2466(arg0, arg1, local12 - 1, arg3);
		method2466(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)Z")
	public static boolean method2467() {
		return Static429.anInt7900 == 0 ? Static345.aClass3_Sub9_Sub1_2.method1184() : true;
	}
}
