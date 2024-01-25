import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "Lclient!vi;")
	public static final Class357 aClass357_1 = new Class357(64);

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(III)Z")
	public static boolean method5788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)Z")
	public static boolean method5789(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V")
	public static void method5790() {
		for (@Pc(10) Class3_Sub4_Sub19 local10 = (Class3_Sub4_Sub19) Static108.aClass223_12.method5874(); local10 != null; local10 = (Class3_Sub4_Sub19) Static108.aClass223_12.method5870()) {
			@Pc(15) Class4_Sub1_Sub2_Sub5 local15 = local10.aClass4_Sub1_Sub2_Sub5_1;
			if (local15.aBoolean640) {
				local10.method8769();
				local15.method7710();
			} else if (local15.anInt8932 <= Static101.anInt2262) {
				local15.method7711(Static354.anInt6785);
				if (local15.aBoolean640) {
					local10.method8769();
				} else {
					Static67.method1693(local15, true);
				}
			}
		}
	}
}
