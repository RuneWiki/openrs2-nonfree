import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "Lclient!cj;")
	public static Class55 aClass55_5;

	@OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
	public static int anInt5482 = -1;

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (!Static220.aBoolean257 || !Static436.aBoolean530) {
			return false;
		} else if (Static29.anInt690 < 100) {
			return false;
		} else {
			@Pc(42) int local42;
			if (arg4 != arg5 || arg3 != arg0) {
				@Pc(79) int local79;
				for (local42 = arg4; local42 <= arg5; local42++) {
					for (local79 = arg0; local79 <= arg3; local79++) {
						if (Static195.anIntArrayArrayArray9[arg2][local42][local79] == -Static153.anInt2750) {
							return false;
						}
					}
				}
				local79 = (arg4 << Static609.anInt9827) + 1;
				@Pc(113) int local113 = (arg0 << Static609.anInt9827) + 2;
				if (Static387.method5174(local113, Static192.anInt3298 * (arg5 + 1 - arg4), local79, arg1, Static192.anInt3298 * (arg3 + 1 - arg0), Static314.aClass76Array2[arg2].method7396(arg0, arg4))) {
					Static49.anInt8547++;
					return true;
				} else {
					return false;
				}
			} else if (Static223.method3048(arg0, arg4, arg2)) {
				@Pc(38) int local38 = arg4 << Static609.anInt9827;
				local42 = arg0 << Static609.anInt9827;
				if (Static387.method5174(local42, Static192.anInt3298, local38, arg1, Static192.anInt3298, Static314.aClass76Array2[arg2].method7396(arg0, arg4))) {
					Static49.anInt8547++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
