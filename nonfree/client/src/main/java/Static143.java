import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Lclient!wfa;")
	public static Class6_Sub19_Sub4 aClass6_Sub19_Sub4_7;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Z")
	public static boolean aBoolean537 = false;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
	public static void method6495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub1_Sub5 local13 = Static77.method1176(0, 15);
		local13.method776();
		local13.anInt972 = arg0;
		local13.anInt974 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)Z")
	public static boolean method6496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static519.method7319(arg0, arg1) & Static544.method7518(arg0, arg1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
	public static byte[] method6505(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static483.method6705(local18) : local18;
		} else if (arg0 instanceof Class286) {
			@Pc(32) Class286 local32 = (Class286) arg0;
			return local32.method6534();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
