import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	public static int anInt350 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!ga;)Lclient!ya;")
	public static Class19 method302(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class19_Sub1(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB)Z")
	public static boolean method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static283.method3965(arg0, arg1) & Static8.method87(arg0, arg1);
	}
}
