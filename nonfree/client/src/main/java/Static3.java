import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!cs;")
	public static Class42 aClass42_56 = new Class42(64);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_107 = new Class66(64);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!af;I)V")
	public static void method5633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2) {
		Static115.aClass6ArrayArray1[arg0][arg1] = arg2;
	}
}
