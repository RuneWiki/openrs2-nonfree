import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "Lclient!rg;")
	public static Class325 aClass325_1;

	@OriginalMember(owner = "client!mba", name = "j", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array12;

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
	public static int anInt6167 = 0;

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "Lclient!lma;")
	public static final Class234 aClass234_5 = new Class234();

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_62 = new Class144(77, 2);

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_20 = new Class320(22);

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "[S")
	public static short[] aShortArray75 = new short[256];

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IBIIIII)Lclient!ih;")
	public static Class113 method5357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg4 * 97549L ^ (long) arg1 * 67481L ^ (long) arg2 * 986053L ^ (long) arg5 * 76724863L;
		@Pc(39) Class113 local39 = (Class113) Static422.aClass307_66.method7002(local33);
		if (local39 == null) {
			local39 = Static126.aClass22_3.method9366(arg1, arg4, arg0, arg2, arg3, arg5);
			Static422.aClass307_66.method7000(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)Z")
	public static boolean method5358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLclient!vga;)I")
	public static int method5360(@OriginalArg(1) Class392 arg0) {
		if (Static358.aClass392_1 == arg0) {
			return 5890;
		} else if (Static407.aClass392_2 == arg0) {
			return 34167;
		} else if (arg0 == Static671.aClass392_4) {
			return 34168;
		} else if (Static547.aClass392_3 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
