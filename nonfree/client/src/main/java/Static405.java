import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "Lclient!ok;")
	public static Class190 aClass190_4;

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_106 = new Class25(54, 0);

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
	public static int anInt6805 = 20;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLclient!uj;)V")
	public static void method5558(@OriginalArg(1) Class3_Sub3_Sub6_Sub2 arg0) {
		for (@Pc(14) Class6_Sub14 local14 = (Class6_Sub14) Static170.aClass88_18.method1882(); local14 != null; local14 = (Class6_Sub14) Static170.aClass88_18.method1891()) {
			if (arg0 == local14.aClass3_Sub3_Sub6_Sub2_1) {
				if (local14.aClass6_Sub5_Sub4_1 != null) {
					Static371.aClass6_Sub5_Sub2_2.method2168(local14.aClass6_Sub5_Sub4_1);
					local14.aClass6_Sub5_Sub4_1 = null;
				}
				local14.method5977();
				return;
			}
		}
	}
}
