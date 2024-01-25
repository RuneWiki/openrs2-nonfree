import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
	public static int anInt1209 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[S)[S")
	public static short[] method922(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static469.method6017(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
