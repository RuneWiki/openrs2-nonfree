import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qj", name = "Yc", descriptor = "F")
	public static float aFloat210;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!pl;II)Lclient!sa;")
	public static Class294 method6281(@OriginalArg(1) Class259 arg0, @OriginalArg(3) int arg1) {
		@Pc(20) byte[] local20 = arg0.method5985(0, arg1);
		return local20 == null ? null : new Class294(local20);
	}
}
