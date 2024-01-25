import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	public static int anInt2705;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "Lclient!tj;")
	public static Class193 aClass193_39;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Lclient!am;")
	public static Class4_Sub4_Sub1 method2376(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub1 local10 = (Class4_Sub4_Sub1) Static202.aClass124_7.method3525((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass193_15.method5047(5, arg0);
		local10 = new Class4_Sub4_Sub1();
		if (local20 != null) {
			local10.method224(new Class4_Sub11(local20));
		}
		Static202.aClass124_7.method3528(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)V")
	public static void method2378() {
		Static210.aClass198_157.method5209();
	}
}
