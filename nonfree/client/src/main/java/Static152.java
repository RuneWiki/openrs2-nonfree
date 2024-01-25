import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_52 = new Class145(26, 7);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(CZ)Z")
	public static boolean method2683(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
	public static void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(16) int local16 = (arg0 + arg3) / 2;
		@Pc(18) int local18 = arg0;
		@Pc(22) String local22 = arg2[local16];
		arg2[local16] = arg2[arg3];
		arg2[arg3] = local22;
		@Pc(36) short local36 = arg1[local16];
		arg1[local16] = arg1[arg3];
		arg1[arg3] = local36;
		for (@Pc(48) int local48 = arg0; local48 < arg3; local48++) {
			if (local22 == null || arg2[local48] != null && arg2[local48].compareTo(local22) < (local48 & 0x1)) {
				@Pc(68) String local68 = arg2[local48];
				arg2[local48] = arg2[local18];
				arg2[local18] = local68;
				@Pc(82) short local82 = arg1[local48];
				arg1[local48] = arg1[local18];
				arg1[local18++] = local82;
			}
		}
		arg2[arg3] = arg2[local18];
		arg2[local18] = local22;
		arg1[arg3] = arg1[local18];
		arg1[local18] = local36;
		method2685(arg0, arg1, arg2, local18 - 1);
		method2685(local18 + 1, arg1, arg2, arg3);
	}
}
