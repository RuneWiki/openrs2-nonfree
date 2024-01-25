import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "I")
	public static int anInt6732;

	@OriginalMember(owner = "client!nfa", name = "s", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!nfa", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[200];

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!vp;ZILclient!vp;IZ)I")
	public static int method5306(@OriginalArg(1) Class222_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class222_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(22) int local22 = Static39.method1066(arg5, arg3, arg0, arg2);
		if (local22 != 0) {
			return arg5 ? -local22 : local22;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(43) int local43 = Static39.method1066(arg1, arg3, arg0, arg4);
			return arg1 ? -local43 : local43;
		}
	}
}
