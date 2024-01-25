import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!rg;")
	public static Class310 aClass310_57;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)I")
	public static int method4213(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local9 & 0x33333333) + (local9 >>> 2 & 0x73333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(45) int local45 = local32 + (local32 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!tha;II)Z")
	public static boolean method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub3_Sub1 arg2, @OriginalArg(3) int arg3) {
		if (!Static413.aBoolean501 || !Static434.aBoolean515) {
			return false;
		} else if (Static241.anInt4621 < 100) {
			return false;
		} else if (Static164.method2366(arg3, arg0, arg1)) {
			@Pc(31) int local31 = arg0 << Static110.anInt1858;
			@Pc(35) int local35 = arg3 << Static110.anInt1858;
			@Pc(45) int local45 = Static258.aClass159Array1[arg1].method8207(arg3, arg0) - 1;
			@Pc(53) int local53 = arg2.method9479() + local45;
			if (arg2.aShort90 == 1) {
				if (!Static485.method7311(local53, local35, local45, local31, local35 + Static391.anInt6813, local53, local35, local31, local31)) {
					return false;
				} else if (Static485.method7311(local53, local35, local45, local31, Static391.anInt6813 + local35, local45, local35 + Static391.anInt6813, local31, local31)) {
					Static235.anInt4560++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 2) {
				if (!Static485.method7311(local53, local35 + Static391.anInt6813, local45, local31, local35 + Static391.anInt6813, local53, Static391.anInt6813 + local35, local31 + Static391.anInt6813, local31)) {
					return false;
				} else if (Static485.method7311(local45, Static391.anInt6813 + local35, local45, local31, Static391.anInt6813 + local35, local53, Static391.anInt6813 + local35, Static391.anInt6813 + local31, local31 + Static391.anInt6813)) {
					Static235.anInt4560++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 4) {
				if (!Static485.method7311(local53, local35, local45, Static391.anInt6813 + local31, local35 - -Static391.anInt6813, local53, local35, Static391.anInt6813 + local31, Static391.anInt6813 + local31)) {
					return false;
				} else if (Static485.method7311(local53, local35, local45, local31 + Static391.anInt6813, local35 + Static391.anInt6813, local45, Static391.anInt6813 + local35, Static391.anInt6813 + local31, local31 + Static391.anInt6813)) {
					Static235.anInt4560++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 8) {
				if (!Static485.method7311(local53, local35, local45, local31, local35, local53, local35, Static391.anInt6813 + local31, local31)) {
					return false;
				} else if (Static485.method7311(local45, local35, local45, local31, local35, local53, local35, local31 + Static391.anInt6813, Static391.anInt6813 + local31)) {
					Static235.anInt4560++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 16) {
				if (Static247.method4204(local31, Static193.anInt9749, Static193.anInt9749 + local35, local53, local45, Static193.anInt9749)) {
					Static235.anInt4560++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 32) {
				if (Static247.method4204(Static193.anInt9749 + local31, Static193.anInt9749, local35 + Static193.anInt9749, local53, local45, Static193.anInt9749)) {
					Static235.anInt4560++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 64) {
				if (Static247.method4204(Static193.anInt9749 + local31, Static193.anInt9749, local35, local53, local45, Static193.anInt9749)) {
					Static235.anInt4560++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 != 128) {
				return true;
			} else if (Static247.method4204(local31, Static193.anInt9749, local35, local53, local45, Static193.anInt9749)) {
				Static235.anInt4560++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
