import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "Lclient!nl;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_5 = new Class305(31, 2);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
	public static void method230() {
		Static374.aClass65_12.method6891(Static572.aClass254_9);
		Static374.aClass65_12.DA(Static365.anInt6627, Static88.anInt2040, Static163.anInt3311, Static136.anInt2680);
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IILclient!aca;ZLclient!aca;)I")
	public static int method231(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class6_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg3.anInt53;
			local12 = arg1.anInt53;
			if (!arg2) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static578.method7998(arg3.method63().aString120, Static544.anInt8937, arg1.method63().aString120);
		} else if (arg0 == 3) {
			if (arg3.aString1.equals("-")) {
				if (arg1.aString1.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString1.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static578.method7998(arg3.aString1, Static544.anInt8937, arg1.aString1);
			}
		} else if (arg0 == 4) {
			if (arg3.method60()) {
				return arg1.method60() ? 0 : 1;
			} else if (arg1.method60()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method62()) {
				return arg1.method62() ? 0 : 1;
			} else if (arg1.method62()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method57()) {
				return arg1.method57() ? 0 : 1;
			} else if (arg1.method57()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method59()) {
				return arg1.method59() ? 0 : 1;
			} else if (arg1.method59()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg3.anInt64;
			local12 = arg1.anInt64;
			if (arg2) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg3.anInt65 - arg1.anInt65;
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(III)I")
	public static int method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return local11 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!uaa;I)Lclient!uaa;")
	public static Class345 method233(@OriginalArg(0) Class345 arg0) {
		if (arg0.anInt9657 != -1) {
			return Static264.method4120(arg0.anInt9657);
		}
		@Pc(19) int local19 = arg0.anInt9664 >>> 16;
		@Pc(24) Class202 local24 = new Class202(Static452.aClass300_33);
		for (@Pc(33) Class5_Sub39 local33 = (Class5_Sub39) local24.method5025(); local33 != null; local33 = (Class5_Sub39) local24.method5027()) {
			if (local33.anInt6238 == local19) {
				return Static264.method4120((int) local33.aLong307);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIZ)V")
	public static void method235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static596.anInt3354 = arg1 - Static330.anInt759;
		Static293.anInt5675 = arg0 - Static330.anInt764;
	}
}
