import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public static int anInt681 = 0;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!bu;")
	public static final Class30 aClass30_1 = new Class30("LOCAL", 4);

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!qh;")
	public static final Class199 aClass199_25 = new Class199(16);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method568(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static107.anInt2042; local16++) {
			if (arg0.equalsIgnoreCase(Static320.aStringArray44[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[I[IB)V")
	public static void method572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg1; local55++) {
			if ((local55 & local53) + local20 > arg3[local55]) {
				@Pc(70) int local70 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16] = local70;
				@Pc(84) int local84 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16++] = local84;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method572(arg0, local16 - 1, arg2, arg3);
		method572(local16 + 1, arg1, arg2, arg3);
	}
}
