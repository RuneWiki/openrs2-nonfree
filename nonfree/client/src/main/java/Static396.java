import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "Lclient!ufa;")
	public static Class4 aClass4_19;

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
	public static int anInt7401 = 0;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method6256(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static236.aHashtable6.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B[I[III)V")
	public static void method6258(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local24;
		@Pc(38) int local38 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg2; local59 < arg3; local59++) {
			if (arg1[local59] < (local57 & local59) + local24) {
				@Pc(78) int local78 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20] = local78;
				@Pc(92) int local92 = arg0[local59];
				arg0[local59] = arg0[local20];
				arg0[local20++] = local92;
			}
		}
		arg1[arg3] = arg1[local20];
		arg1[local20] = local24;
		arg0[arg3] = arg0[local20];
		arg0[local20] = local38;
		method6258(arg0, arg1, arg2, local20 - 1);
		method6258(arg0, arg1, local20 + 1, arg3);
	}
}
