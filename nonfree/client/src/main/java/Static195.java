import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gr", name = "ub", descriptor = "I")
	public static int anInt3357;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([SI)[S")
	public static short[] method2797(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static679.method1564(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
