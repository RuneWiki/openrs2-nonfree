import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_104 = new Class276(62, 7);

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "[I")
	public static final int[] anIntArray491 = new int[5];

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Z")
	public static boolean aBoolean661 = false;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIII)V")
	public static void method6587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(19) int local19 = arg2 - arg1;
		if (local9 == 0) {
			if (local19 != 0) {
				Static523.method7753(arg3, arg2, arg1, arg0);
			}
		} else if (local19 == 0) {
			Static343.method5823(arg0, arg3, arg1, arg4);
		} else {
			@Pc(48) int local48 = (local19 << 12) / local9;
			@Pc(57) int local57 = arg1 - (arg0 * local48 >> 12);
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (arg4 < Static535.anInt9696) {
				local62 = Static535.anInt9696;
				local71 = local57 + (Static535.anInt9696 * local48 >> 12);
			} else if (arg4 <= Static35.anInt993) {
				local62 = arg4;
				local71 = arg2;
			} else {
				local71 = local57 + (local48 * Static35.anInt993 >> 12);
				local62 = Static35.anInt993;
			}
			@Pc(107) int local107;
			@Pc(105) int local105;
			if (Static535.anInt9696 > arg0) {
				local105 = (Static535.anInt9696 * local48 >> 12) + local57;
				local107 = Static535.anInt9696;
			} else if (Static35.anInt993 >= arg0) {
				local105 = arg1;
				local107 = arg0;
			} else {
				local107 = Static35.anInt993;
				local105 = (Static35.anInt993 * local48 >> 12) + local57;
			}
			if (Static55.anInt1303 > local105) {
				local107 = (Static55.anInt1303 - local57 << 12) / local48;
				local105 = Static55.anInt1303;
			} else if (Static208.anInt4309 < local105) {
				local105 = Static208.anInt4309;
				local107 = (Static208.anInt4309 - local57 << 12) / local48;
			}
			if (local71 < Static55.anInt1303) {
				local71 = Static55.anInt1303;
				local62 = (Static55.anInt1303 - local57 << 12) / local48;
			} else if (local71 > Static208.anInt4309) {
				local62 = (Static208.anInt4309 - local57 << 12) / local48;
				local71 = Static208.anInt4309;
			}
			Static223.method3822(local71, local107, arg3, local62, local105);
		}
	}
}
