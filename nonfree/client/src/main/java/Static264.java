import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
	public static int anInt5684;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!uaa;")
	public static Class333 aClass333_4;

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_6 = new Class129(2, 2);

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray236 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;BILjava/lang/String;)V")
	public static void method4755(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class147 local9 = Static55.aClass147Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static55.aClass147Array1[local11] = Static55.aClass147Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class147(arg1, arg6, arg2, arg7, arg0, arg5, arg4, arg3);
		} else {
			local9.method4484(arg4, arg3, arg2, arg5, arg6, arg7, arg1, arg0);
		}
		Static257.anInt5538++;
		Static55.aClass147Array1[0] = local9;
		Static31.anInt837 = Static51.anInt1750;
	}
}
