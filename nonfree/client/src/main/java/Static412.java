import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!pu;")
	public static Class270 aClass270_84;

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Lclient!pu;")
	public static Class270 aClass270_85;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!we;")
	public static Class356 aClass356_1;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
	public static void method5667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub6_Sub16 local13 = Static212.method3332(12, arg1);
		local13.method6594();
		local13.anInt8204 = arg0;
	}
}
