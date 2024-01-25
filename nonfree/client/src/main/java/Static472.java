import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class41 local13 = local7.aClass41_3; local13 != null; local13 = local13.aClass41_2) {
			@Pc(17) Class28_Sub1_Sub4 local17 = local13.aClass28_Sub1_Sub4_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort124 == arg1 && local17.aShort121 == arg2) {
				Static327.method5081(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIZI)V")
	public static void method6780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg3 >= Static106.anInt2266 && Static669.anInt10712 >= arg1 + arg3 && arg2 - arg3 >= Static639.anInt10384 && arg3 + arg2 <= Static496.anInt8305) {
			Static404.method5949(arg1, arg0, arg3, arg2);
		} else {
			Static378.method5639(arg0, arg1, arg3, arg2);
		}
	}
}
