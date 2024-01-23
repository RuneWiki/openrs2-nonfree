import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!lg;")
	public static Class97 aClass97_12;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public static int anInt2667 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZI[Lclient!lg;II)V")
	public static void method2175(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class97[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(11) Class97 local11 = arg3[local3];
			if (local11 != null && local11.anInt3165 == arg0) {
				Static112.method1884(local11, arg4, arg2, arg1);
				Static301.method4635(local11, arg2, arg4);
				if (local11.anInt3199 > local11.anInt3180 - local11.anInt3190) {
					local11.anInt3199 = local11.anInt3180 - local11.anInt3190;
				}
				if (local11.anInt3141 - local11.anInt3201 < local11.anInt3169) {
					local11.anInt3169 = local11.anInt3141 - local11.anInt3201;
				}
				if (local11.anInt3199 < 0) {
					local11.anInt3199 = 0;
				}
				if (local11.anInt3169 < 0) {
					local11.anInt3169 = 0;
				}
				if (local11.anInt3177 == 0) {
					Static64.method1168(local11, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BJ)V")
	public static void method2177(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static15.anInt334; local16++) {
			if (arg0 == Static229.aLongArray8[local16]) {
				Static15.anInt334--;
				for (@Pc(32) int local32 = local16; local32 < Static15.anInt334; local32++) {
					Static229.aLongArray8[local32] = Static229.aLongArray8[local32 + 1];
					Static224.aStringArray29[local32] = Static224.aStringArray29[local32 + 1];
					Static151.aBooleanArray23[local32] = Static151.aBooleanArray23[local32 + 1];
				}
				Static279.anInt5479 = Static131.anInt1441;
				Static175.aClass4_Sub24_Sub1_1.method3123(76);
				Static175.aClass4_Sub24_Sub1_1.method3079(arg0);
				break;
			}
		}
	}
}
