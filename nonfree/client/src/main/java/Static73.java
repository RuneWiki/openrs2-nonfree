import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!qv;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!mn;")
	public static Class171 aClass171_16;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public static int anInt1228 = -50;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZB)V")
	public static void method1126(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(13) Class2_Sub12 local13 = Static92.method1397(arg0, arg1);
		if (local13 != null) {
			local13.method6260();
		}
	}
}
