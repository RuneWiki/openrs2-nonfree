import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "Lclient!ni;")
	public static Class223 aClass223_86;

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
	public static int anInt7412 = 0;

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "Z")
	public static boolean aBoolean584 = false;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([SII)[S")
	public static short[] method6264(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static653.method6538(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
