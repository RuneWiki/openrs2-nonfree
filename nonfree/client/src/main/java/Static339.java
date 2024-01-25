import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!qj", name = "F", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_89 = new Class242(39, 8);

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_90 = new Class242(19, -1);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[S)[S")
	public static short[] method4433(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static471.method3068(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
