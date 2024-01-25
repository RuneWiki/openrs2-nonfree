import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "[I")
	public static final int[] anIntArray216 = new int[1];

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III[I[Ljava/lang/String;)V")
	public static void method3869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(25) int local25 = (arg1 + arg0) / 2;
		@Pc(27) int local27 = arg1;
		@Pc(31) String local31 = arg3[local25];
		arg3[local25] = arg3[arg0];
		arg3[arg0] = local31;
		@Pc(45) int local45 = arg2[local25];
		arg2[local25] = arg2[arg0];
		arg2[arg0] = local45;
		for (@Pc(57) int local57 = arg1; local57 < arg0; local57++) {
			if (local31 == null || arg3[local57] != null && arg3[local57].compareTo(local31) < (local57 & 0x1)) {
				@Pc(84) String local84 = arg3[local57];
				arg3[local57] = arg3[local27];
				arg3[local27] = local84;
				@Pc(98) int local98 = arg2[local57];
				arg2[local57] = arg2[local27];
				arg2[local27++] = local98;
			}
		}
		arg3[arg0] = arg3[local27];
		arg3[local27] = local31;
		arg2[arg0] = arg2[local27];
		arg2[local27] = local45;
		method3869(local27 - 1, arg1, arg2, arg3);
		method3869(arg0, local27 + 1, arg2, arg3);
	}
}
