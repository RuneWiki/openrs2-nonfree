import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hca", name = "v", descriptor = "J")
	public static long aLong166;

	@OriginalMember(owner = "client!hca", name = "F", descriptor = "I")
	public static int anInt5856;

	@OriginalMember(owner = "client!hca", name = "u", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_147 = new Class251(90, 3);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZ)V")
	public static void method5246(@OriginalArg(0) int arg0) {
		@Pc(17) Class14_Sub27 local17 = (Class14_Sub27) Static445.aClass125_30.method2630((long) arg0);
		if (local17 != null) {
			local17.aBoolean476 = !local17.aBoolean476;
			local17.aClass147_Sub1_1.method5257(local17.aBoolean476);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5252(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
