import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "[B")
	public static byte[] aByteArray49;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	public static int anInt3948;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
	public static int anInt3951;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_202 = new Class123(107, 11);

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "[I")
	public static final int[] anIntArray287 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lclient!qs;")
	public static Class6_Sub32 method3284() {
		if (Static7.aClass244_7 == null || Static229.aClass256_1 == null) {
			return null;
		}
		Static229.aClass256_1.method6291(Static7.aClass244_7);
		@Pc(23) Class6_Sub32 local23 = (Class6_Sub32) Static229.aClass256_1.method6288();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class260 local33 = Static7.aClass169_6.method3948(local23.anInt5707);
			return local33 != null && local33.aBoolean485 && local33.method6336(Static7.anInterface6_2) ? local23 : Static235.method3637();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3285(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static403.method5961(Static244.aClass92_152);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(arg0));
			Static109.aClass6_Sub1_Sub1_5.method6448(arg0);
		}
	}
}
