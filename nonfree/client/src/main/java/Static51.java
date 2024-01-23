import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!de", name = "V", descriptor = "Lclient!rn;")
	public static Class155 aClass155_28;

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
	public static int anInt995;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "Lclient!cn;")
	public static Class30 aClass30_8;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "I")
	public static int anInt988 = 0;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "[Lclient!ni;")
	public static Class121[] aClass121Array1 = new Class121[8];

	@OriginalMember(owner = "client!de", name = "X", descriptor = "I")
	public static int anInt994 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[Ljava/lang/String;B[S)V")
	public static void method818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) String local24 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local24;
		@Pc(38) short local38 = arg3[local18];
		arg3[local18] = arg3[arg0];
		arg3[arg0] = local38;
		for (@Pc(50) int local50 = arg1; local50 < arg0; local50++) {
			if (local24 == null || arg2[local50] != null && arg2[local50].compareTo(local24) < (local50 & 0x1)) {
				@Pc(82) String local82 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20] = local82;
				@Pc(96) short local96 = arg3[local50];
				arg3[local50] = arg3[local20];
				arg3[local20++] = local96;
			}
		}
		arg2[arg0] = arg2[local20];
		arg2[local20] = local24;
		arg3[arg0] = arg3[local20];
		arg3[local20] = local38;
		method818(local20 - 1, arg1, arg2, arg3);
		method818(arg0, local20 + 1, arg2, arg3);
	}
}
