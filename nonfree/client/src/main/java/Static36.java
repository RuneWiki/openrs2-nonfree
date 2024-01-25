import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "Lclient!kf;")
	public static Class37 aClass37_3;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_52 = new Class102(8);

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_231 = new Class103(12, 4);

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	public static int anInt6548 = 0;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)V")
	public static void method5119() {
		for (@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) Static78.aClass262_8.method5819(); local10 != null; local10 = (Class4_Sub2) Static78.aClass262_8.method5813()) {
			local10.method1241();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
	public static void method5121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class1_Sub5_Sub11 local15 = Static188.method2688(arg2, 10);
		local15.method2661();
		local15.anInt3212 = arg0;
		local15.anInt3213 = arg3;
		local15.anInt3209 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V")
	public static void method5123() {
		Static413.aBoolean744 = false;
		Static187.aClipboard1 = null;
		Static65.method1072();
	}
}
