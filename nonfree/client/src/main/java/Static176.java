import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "F")
	public static float aFloat231;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "Lclient!hia;")
	public static Class133 aClass133_45;

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "Lclient!fg;")
	public static Class98 aClass98_35;

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "Lclient!sca;")
	public static Class302 aClass302_57;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray76 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIILclient!fe;)V")
	public static void method9005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class94 arg4) {
		@Pc(7) Class6_Sub6 local7 = null;
		for (@Pc(17) Class6_Sub6 local17 = (Class6_Sub6) Static69.aClass8_9.method149(); local17 != null; local17 = (Class6_Sub6) Static69.aClass8_9.method155()) {
			if (local17.anInt1248 == arg2 && arg1 == local17.anInt1247 && local17.anInt1250 == arg0 && arg3 == local17.anInt1251) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub6();
			local7.anInt1247 = arg1;
			local7.anInt1251 = arg3;
			local7.anInt1248 = arg2;
			local7.anInt1250 = arg0;
			Static69.aClass8_9.method157(local7);
		}
		local7.aBoolean79 = true;
		local7.aBoolean78 = false;
		local7.aClass94_1 = arg4;
	}
}
