import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt9180;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZ)Lclient!hia;")
	public static Class3_Sub25 method7479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class3_Sub25 local7 = new Class3_Sub25();
		local7.anInt3966 = arg1;
		local7.anInt3959 = arg0;
		Static513.aClass333_33.method7488((long) arg2, local7);
		Static277.method4055(arg0);
		@Pc(26) Class265 local26 = Static223.method3278(arg2);
		if (local26 != null) {
			Static218.method3194(local26);
		}
		if (Static84.aClass265_4 != null) {
			Static218.method3194(Static84.aClass265_4);
			Static84.aClass265_4 = null;
		}
		Static190.method2932();
		if (local26 != null) {
			Static463.method6195(!arg3, local26);
		}
		if (!arg3) {
			Static250.method3769(arg0);
		}
		if (!arg3 && Static187.anInt3418 != -1) {
			Static628.method8496(Static187.anInt3418, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method7480() {
		Static368.aClass295_38.method6464();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZI)I")
	public static int method7482(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class3_Sub21 local10 = Static586.method7782(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray175.length; local23++) {
				if (arg2 == local10.anIntArray174[local23]) {
					local21 += local10.anIntArray175[local23];
				}
			}
			return local21;
		}
	}
}
