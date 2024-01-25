import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!f;")
	public static Class5 aClass5_35;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public static int anInt8074 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method6492(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([BB)V")
	public static void method6493(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub3 local14 = new Class1_Sub3(arg0);
		while (true) {
			@Pc(18) int local18 = local14.method7974();
			if (local18 == 0) {
				return;
			}
			if (local18 == 2) {
				Static155.anInt2940 = local14.method7945();
			}
		}
	}
}
