import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!am", name = "Q", descriptor = "Lclient!aw;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!am", name = "I", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_2 = new Class276(5, 6);

	@OriginalMember(owner = "client!am", name = "L", descriptor = "[I")
	public static final int[] anIntArray8 = new int[8];

	@OriginalMember(owner = "client!am", name = "N", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBIIII)Lclient!kn;")
	public static Class108 method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg1 * 67481L ^ (long) arg0 * 97549L ^ (long) arg3 * 475427L ^ (long) arg5 * 76724863L;
		@Pc(39) Class108 local39 = (Class108) Static234.aClass211_35.method5534(local33);
		if (local39 == null) {
			local39 = Static322.aClass15_10.method5328(arg1, arg0, arg3, arg2, arg4, arg5);
			Static234.aClass211_35.method5529(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
