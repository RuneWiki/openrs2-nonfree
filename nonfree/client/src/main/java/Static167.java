import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
	public static boolean aBoolean229;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "[I")
	public static final int[] anIntArray144 = new int[3];

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
	public static final int[] anIntArray145 = new int[2048];

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_38 = new Class208(68, -1);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([SZI)[S")
	public static short[] method2715(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static598.method771(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
