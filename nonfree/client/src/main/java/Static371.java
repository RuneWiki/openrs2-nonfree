import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "Lclient!ve;")
	public static Class383 aClass383_1 = new Class383();

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "[I")
	public static final int[] anIntArray353 = new int[1];

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_64 = new Class286(34, 8);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([SI)[S")
	public static short[] method5359(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static735.method9189(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
