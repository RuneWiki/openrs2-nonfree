import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
	public static int anInt4639;

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
	public static int anInt4648;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method4231(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	public static void method4232() {
		Static68.aClass168_60.method3856();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)Lclient!ot;")
	public static Class274 method4233(@OriginalArg(0) int arg0) {
		@Pc(10) Class274 local10 = (Class274) Static220.aClass168_40.method3860((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static593.aClass126_269.method3086(arg0, 1);
		local10 = new Class274();
		local10.anInt7207 = arg0;
		if (local21 != null) {
			local10.method6282(new Class5_Sub36(local21));
		}
		local10.method6278();
		if (local10.anInt7211 == 2 && Static17.aClass306_2.method6943((long) arg0) == null) {
			Static17.aClass306_2.method6944(new Class5_Sub43(Static377.anInt6332), (long) arg0, -12002);
			Static518.aClass274Array1[Static377.anInt6332++] = local10;
		}
		Static220.aClass168_40.method3853((long) arg0, local10);
		return local10;
	}
}
