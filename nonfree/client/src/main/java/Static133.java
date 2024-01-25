import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "Lclient!ao;")
	public static Class12 aClass12_129;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_49 = new Class254(75, 0);

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_50 = new Class254(6, 8);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIILclient!eb;)V")
	public static void method2050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class47_Sub3 arg4) {
		@Pc(4) Class137 local4 = Static266.method5735(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt6172 = (arg1 << Static58.anInt1051) + Static86.anInt1530;
		arg4.anInt6168 = arg3;
		arg4.anInt6169 = (arg2 << Static58.anInt1051) + Static86.anInt1530;
		for (@Pc(28) Class167 local28 = local4.aClass167_1; local28 != null; local28 = local28.aClass167_2) {
			if (local28.aClass47_Sub1_2.aBoolean591) {
				@Pc(38) int local38 = local28.aClass47_Sub1_2.method5447();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt6168 += local8;
			arg4.aBoolean503 = true;
		}
		local4.aClass47_Sub3_1 = arg4;
	}
}
