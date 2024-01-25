import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "I")
	public static int anInt316;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public static int anInt317 = 0;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	public static int anInt319 = 16777215;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!gh;B)V")
	public static void method257(@OriginalArg(0) Class89 arg0) {
		if (!Static401.aBoolean489) {
			return;
		}
		if (arg0.anObjectArray3 != null) {
			@Pc(14) Class89 local14 = Static397.method5275(Static219.anInt4156, Static273.anInt4773);
			if (local14 != null) {
				@Pc(20) Class10_Sub40 local20 = new Class10_Sub40();
				local20.aClass89_11 = local14;
				local20.aClass89_12 = arg0;
				local20.anObjectArray36 = arg0.anObjectArray3;
				Static79.method1501(local20);
			}
		}
		Static310.method4308(Static149.aClass27_56);
		Static337.aClass10_Sub8_Sub2_2.method2506(arg0.anInt2677);
		Static337.aClass10_Sub8_Sub2_2.method2497(Static219.anInt4156);
		Static337.aClass10_Sub8_Sub2_2.method2497(Static228.anInt4243);
		Static337.aClass10_Sub8_Sub2_2.method2509(arg0.anInt2720);
		Static337.aClass10_Sub8_Sub2_2.method2497(arg0.anInt2670);
		Static337.aClass10_Sub8_Sub2_2.method2473(Static273.anInt4773);
	}
}
