import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
	public static int anInt2122;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_36 = new Class146(45, 3);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)V")
	public static void method1688(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub17 local10 = Static34.method1709(8, arg0);
		local10.method5523();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IC)Z")
	public static boolean method1691(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
