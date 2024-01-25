import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_171 = new Class263(111, -2);

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "[I")
	public static final int[] anIntArray714 = new int[4];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
	public static int method5762(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 - 1;
		@Pc(15) int local15 = local5 | local5 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z")
	public static boolean method5765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static201.method3241(arg0, arg1)) {
			return Static443.method6128(arg1, arg0) | (arg1 & 0xB000) != 0 | Static175.method2965(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static140.method2263(arg0, arg1) | Static289.method4247(arg1, arg0));
		} else {
			return false;
		}
	}
}
