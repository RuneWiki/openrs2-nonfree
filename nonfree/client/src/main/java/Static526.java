import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "Lclient!cv;")
	public static final Class59 aClass59_4 = new Class59();

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_114 = new Class160(57, 11);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([BBIIII)V")
	public static void method7356(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		arg1 += arg3;
		@Pc(24) int local24 = arg2 - arg3 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			arg1 = local39 + 1;
			arg0[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V")
	public static void method7357(@OriginalArg(0) int arg0) {
		Static346.anIntArray533 = new int[arg0];
		Static180.anIntArray693 = new int[arg0];
		Static494.anIntArray640 = new int[arg0];
		Static529.anIntArray680 = new int[arg0];
		Static343.anIntArray529 = new int[arg0];
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!dga;Ljava/lang/String;Z)I")
	public static int method7358(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt7244;
		@Pc(10) byte[] local10 = Static408.method5959(arg1);
		arg0.method6037(local10.length);
		arg0.anInt7244 += Static278.aClass322_5.method7351(0, local10.length, arg0.anInt7244, local10, arg0.aByteArray88);
		return arg0.anInt7244 - local6;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZILclient!efa;ZLclient!efa;)I")
	public static int method7360(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class8_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg3.anInt2011;
			local14 = arg1.anInt2011;
			if (!arg2) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static26.method402(arg3.method1748().aString113, Static470.anInt7957, arg1.method1748().aString113);
		} else if (arg0 == 3) {
			if (arg3.aString32.equals("-")) {
				if (arg1.aString32.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString32.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static26.method402(arg3.aString32, Static470.anInt7957, arg1.aString32);
			}
		} else if (arg0 == 4) {
			if (arg3.method1740()) {
				return arg1.method1740() ? 0 : 1;
			} else if (arg1.method1740()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method1741()) {
				return arg1.method1741() ? 0 : 1;
			} else if (arg1.method1741()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method1744()) {
				return arg1.method1744() ? 0 : 1;
			} else if (arg1.method1744()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method1738()) {
				return arg1.method1738() ? 0 : 1;
			} else if (arg1.method1738()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg3.anInt2022;
			local14 = arg1.anInt2022;
			if (arg2) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt2019 - arg1.anInt2019;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method7361(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static484.method6713(-1, -1, arg1, arg0);
	}
}
