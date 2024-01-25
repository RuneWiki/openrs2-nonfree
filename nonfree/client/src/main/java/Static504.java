import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	public static int anInt8759;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!vfa;")
	public static Class329 aClass329_9;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public static int anInt8760;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIILclient!wv;)V")
	public static void method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15_Sub5 arg4) {
		@Pc(4) Class133 local4 = Static90.method4174(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt6431 = (arg1 << Static23.anInt420) + Static259.anInt4703;
		arg4.anInt6428 = arg3;
		arg4.anInt6433 = (arg2 << Static23.anInt420) + Static259.anInt4703;
		for (@Pc(28) Class315 local28 = local4.aClass315_1; local28 != null; local28 = local28.aClass315_3) {
			if (local28.aClass15_Sub2_2.aBoolean577) {
				@Pc(38) int local38 = local28.aClass15_Sub2_2.method7123();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt6428 += local8;
			arg4.aBoolean450 = true;
		} else if (local4.aClass15_Sub3_2 != null) {
			arg4.anInt6428 -= local4.aClass15_Sub3_2.aShort99;
		}
		local4.aClass15_Sub5_1 = arg4;
	}
}
