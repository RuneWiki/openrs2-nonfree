import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lclient!ni;")
	public static final Class178 aClass178_13 = new Class178("WTQA", 2);

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_132 = new Class56(93, -1);

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)I")
	public static int method2989(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([FIB)[F")
	public static float[] method2991(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float[] local14 = new float[arg1];
		Static461.method1984(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
