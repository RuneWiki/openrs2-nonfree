import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
	public static int anInt8424;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_56 = new Class329(4, 1, 1, 1);

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt8426 = 1;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
	public static int anInt8427 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!cca;IZZLclient!cca;ZI)I")
	public static int method6608(@OriginalArg(0) Class48_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class48_Sub1 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static557.method4952(arg5, arg2, arg3, arg0);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static557.method4952(arg1, arg4, arg3, arg0);
			return arg4 ? -local36 : local36;
		}
	}
}
