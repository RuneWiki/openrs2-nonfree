import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
	public static int anInt9430;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_120 = new Class186(40, 2);

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	public static int anInt9428 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7942(@OriginalArg(0) String arg0) {
		return Static527.method7511(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BZ)Z")
	public static boolean method7943(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static478.aClass9_10.method7591();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static478.aClass9_10.method7602();
		} else if (!Static478.aClass9_10.method7583()) {
			arg0 = false;
		}
		if (arg0 == local14) {
			return false;
		} else {
			Static89.aClass1_Sub28_Sub1_1.aBoolean330 = arg0;
			Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)V")
	public static void method7945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static538.aClass37_4 == Static452.aClass37_3) {
			if (Static76.method1968(arg1, 1, false, arg0, 1, -2, 0, 0)) {
				return;
			}
			Static76.method1968(arg1, 1, false, arg0, 1, -3, 0, 0);
		} else if (Static76.method1968(arg1, 1, false, arg0, 1, -3, 0, 0)) {
			return;
		} else {
			Static76.method1968(arg1, 1, false, arg0, 1, -2, 0, 0);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7947(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static555.method5095(arg0, 0, local14, 0, local11);
		return local14;
	}
}
