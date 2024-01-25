import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!uo", name = "P", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_123 = new Class186(52, 8);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method5586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(15) Class6_Sub43 local15 = null;
		for (@Pc(20) Class6_Sub43 local20 = (Class6_Sub43) Static203.aClass88_32.method1882(); local20 != null; local20 = (Class6_Sub43) Static203.aClass88_32.method1891()) {
			if (arg0 == local20.anInt6914 && local20.anInt6925 == arg1 && local20.anInt6918 == arg3 && local20.anInt6915 == arg5) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class6_Sub43();
			local15.anInt6914 = arg0;
			local15.anInt6925 = arg1;
			local15.anInt6915 = arg5;
			local15.anInt6918 = arg3;
			if (arg1 >= 0 && arg3 >= 0 && arg1 < Static84.anInt1632 && arg3 < Static261.anInt4480) {
				Static54.method1026(local15);
			}
			Static203.aClass88_32.method1878(local15);
		}
		local15.anInt6923 = arg4;
		local15.anInt6917 = arg6;
		local15.anInt6922 = 0;
		local15.anInt6919 = -1;
		local15.anInt6920 = arg2;
	}
}
