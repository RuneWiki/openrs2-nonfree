import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!tea;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!ap;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_11 = new Class131(15, 0, 1, 0);

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_101 = new Class359(47, -1);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method4537() {
		Static358.anInt6492 = 200;
		Static550.anInt9008 = (int) ((double) Static201.anInt3834 * 34.46D);
		Static550.anInt9008 <<= 0x2;
		if (Static208.aClass65_7.method6930()) {
			Static550.anInt9008 += 512;
		}
		Static467.method6657(false);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZIIIZJIIJILjava/lang/String;Z)V")
	public static void method4539(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) boolean arg11) {
		if (!Static493.aBoolean702 && Static483.anInt8099 < 500) {
			@Pc(22) int local22 = arg3 == -1 ? Static105.anInt2256 : arg3;
			@Pc(38) Class5_Sub3_Sub20 local38 = new Class5_Sub3_Sub20(arg0, arg10, local22, arg7, arg2, arg5, arg9, arg6, arg11, arg1, arg8, arg4);
			Static528.method7442(local38);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIZBI)V")
	public static void method4540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(25) Class5_Sub43 local25 = (Class5_Sub43) Static583.aClass300_44.method7188(local14);
		if (local25 == null) {
			local25 = new Class5_Sub43();
			Static583.aClass300_44.method7191(local25, local14);
		}
		if (arg1 >= local25.anIntArray406.length) {
			@Pc(50) int[] local50 = new int[arg1 + 1];
			@Pc(55) int[] local55 = new int[arg1 + 1];
			for (@Pc(57) int local57 = 0; local57 < local25.anIntArray406.length; local57++) {
				local50[local57] = local25.anIntArray406[local57];
				local55[local57] = local25.anIntArray405[local57];
			}
			for (@Pc(83) int local83 = local25.anIntArray406.length; local83 < arg1; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local25.anIntArray405 = local55;
			local25.anIntArray406 = local50;
		}
		local25.anIntArray406[arg1] = arg2;
		local25.anIntArray405[arg1] = arg0;
	}
}
