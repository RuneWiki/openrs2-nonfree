import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
	public static int anInt3513;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "[I")
	public static final int[] anIntArray380 = new int[5];

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[S)[S")
	public static short[] method3148(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static553.method3369(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(B)Z")
	public static boolean method3149() {
		return Static517.anInt9002 == 0 ? Static519.aClass2_Sub12_Sub1_3.method1027() : true;
	}
}
