import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
	public static int anInt8506;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(JJ)J")
	public static long method7323(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lclient!iv;")
	public static Class168 method7324(@OriginalArg(0) int arg0) {
		@Pc(8) Class168[] local8 = Static260.method4304();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class168 local16 = local8[local10];
			if (local16.anInt4802 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZILclient!wf;Lclient!wf;)I")
	public static int method7325(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class362_Sub1 arg2, @OriginalArg(4) Class362_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg2.anInt10277;
			local14 = arg3.anInt10277;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static236.method3799(arg3.method8742().aString52, Static496.anInt7407, arg2.method8742().aString52);
		} else if (arg1 == 3) {
			if (arg2.aString111.equals("-")) {
				if (arg3.aString111.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString111.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static236.method3799(arg3.aString111, Static496.anInt7407, arg2.aString111);
			}
		} else if (arg1 == 4) {
			if (arg2.method8738()) {
				return arg3.method8738() ? 0 : 1;
			} else if (arg3.method8738()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg2.method8741()) {
				return arg3.method8741() ? 0 : 1;
			} else if (arg3.method8741()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg2.method8740()) {
				return arg3.method8740() ? 0 : 1;
			} else if (arg3.method8740()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg2.method8739()) {
				return arg3.method8739() ? 0 : 1;
			} else if (arg3.method8739()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg2.anInt10285;
			local14 = arg3.anInt10285;
			if (arg0) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local11 == -1) {
					local11 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg2.anInt10286 - arg3.anInt10286;
		}
	}
}
