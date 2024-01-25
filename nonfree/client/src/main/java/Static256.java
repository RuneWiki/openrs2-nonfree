import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_107 = new Class7("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIILclient!rp;)V")
	public static void method3831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class31_Sub5 arg4) {
		@Pc(4) Class80 local4 = Static317.method4490(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt7243 = (arg1 << Static31.anInt665) + Static69.anInt1593;
		arg4.anInt7244 = arg3;
		arg4.anInt7239 = (arg2 << Static31.anInt665) + Static69.anInt1593;
		for (@Pc(28) Class22 local28 = local4.aClass22_2; local28 != null; local28 = local28.aClass22_1) {
			if (local28.aClass31_Sub2_1.aBoolean503) {
				@Pc(38) int local38 = local28.aClass31_Sub2_1.method5976();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt7244 += local8;
			arg4.aBoolean499 = true;
		}
		local4.aClass31_Sub5_1 = arg4;
	}
}
