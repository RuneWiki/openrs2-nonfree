import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5785;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!kb;")
	public static Class83 aClass83_189;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
	public static int anInt5790;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString188 = "Created gameworld";

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString189 = "Cancel";

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public static int anInt5786 = -1;

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
	public static int[] anIntArray577 = new int[] { 0, 12, 6, 6, 0, -2, -2, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 0, -1, 8, 10, 0, 1, 0, 0, 2, 1, 3, 0, 0, 0, -1, -1, 0, 0, 7, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 4, 15, 9, 0, 0, 0, 0, 0, 5, 0, 0, 0, -2, 0, -1, 0, 0, 0, 2, 0, -1, 0, 0, 7, 6, 3, 0, 0, -1, -1, 6, 10, -2, 0, 0, -2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 14, 11, 0, 0, 14, 0, 0, 0, 0, 0, 3, 3, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 17, 0, 0, 0, 0, 0, 0, 8, 0, -1, 8, 8, 0, 7, 8, 0, 0, -2, 8, 4, 8, 1, 0, -1, 0, 6, 0, 1, 2, 6, 0, 6, 0, 0, 4, 0, 0, 0, 5, 0, -1, 0, 20, 1, 0, -1, 3, 0, 0, 4, -2, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, 12, 0, 0, 0, 0, 0, 0, 0, 6, 0, 28, 5, 0, 0, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, -2, 0, 0, 0, 0, 0, 0, 7, 15, 12, 10, 12, 2, 0, -2, 2, 0, 0, 0, 0, 0, 0, -1, 0, 6 };

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	public static int anInt5788 = 0;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
	public static int anInt5789 = 0;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
	public static void method4503(@OriginalArg(1) int arg0) {
		Static213.anInt4719 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIZIIIIB)V")
	public static void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) int local8 = arg2 - arg3;
		@Pc(13) int local13 = arg0 - arg6;
		@Pc(26) int local26 = (arg8 - arg1 << 16) / local8;
		@Pc(35) int local35 = (arg5 - arg7 << 16) / local13;
		Static286.method4698(local26, arg0, arg7, arg1, arg4, arg3, arg2, local35, arg6);
	}
}
