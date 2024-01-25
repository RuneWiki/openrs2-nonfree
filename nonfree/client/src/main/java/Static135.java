import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "Lclient!ed;")
	public static final Class84 aClass84_1 = new Class84();

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "I")
	public static int anInt2684 = 0;

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_55 = new Class319(83, 4);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!r;IIIIII)Lclient!da;")
	public static Class61 method2272(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(17) Class61 local17 = (Class61) Static172.aClass326_14.method7238(local6);
		if (local17 == null) {
			@Pc(27) Class43 local27 = Static83.method1704(Static454.aClass111_107, arg2);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt1481 < 13) {
				local27.method1366();
			}
			local17 = arg0.method6407(local27, 2055, Static178.anInt3205, 64, 768);
			Static172.aClass326_14.method7236(local17, local6);
		}
		local17 = local17.method7591((byte) 2, 2055, true);
		if (arg5 != 0) {
			local17.M(arg5);
		}
		if (arg4 != 0) {
			local17.MA(arg4);
		}
		if (arg3 != 0) {
			local17.W(arg3);
		}
		if (arg1 != 0) {
			local17.oa(0, arg1, 0);
		}
		return local17;
	}
}
