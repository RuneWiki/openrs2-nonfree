import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
	public static int anInt8858;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
	public static int anInt8864;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_85 = new Class344(67, -1);

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "[I")
	public static final int[] anIntArray517 = new int[6];

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
	public static int anInt8867 = -1;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([SB)[S")
	public static short[] method6798(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static599.method3059(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
