import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ts", name = "C", descriptor = "[I")
	public static int[] anIntArray622;

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "Lclient!sh;")
	public static final Class213 aClass213_16 = new Class213("RC", 1);

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
	public static int method5163() {
		if ((double) Static42.aFloat5 == 3.0D) {
			return 37;
		} else if ((double) Static42.aFloat5 == 4.0D) {
			return 50;
		} else if ((double) Static42.aFloat5 == 6.0D) {
			return 75;
		} else if ((double) Static42.aFloat5 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!bd;Lclient!bd;Z)I")
	public static int method5165(@OriginalArg(1) int arg0, @OriginalArg(2) Class23_Sub1 arg1, @OriginalArg(3) Class23_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg2.anInt329;
			local12 = arg1.anInt329;
			if (!arg3) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static228.method3741(Static66.anInt1307, arg1.method310().aString31, arg2.method310().aString31);
		} else if (arg0 == 3) {
			if (arg2.aString4.equals("-")) {
				if (arg1.aString4.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString4.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static228.method3741(Static66.anInt1307, arg1.aString4, arg2.aString4);
			}
		} else if (arg0 == 4) {
			if (arg2.method301()) {
				return arg1.method301() ? 0 : 1;
			} else if (arg1.method301()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method308()) {
				return arg1.method308() ? 0 : 1;
			} else if (arg1.method308()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method303()) {
				return arg1.method303() ? 0 : 1;
			} else if (arg1.method303()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method307()) {
				return arg1.method307() ? 0 : 1;
			} else if (arg1.method307()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg2.anInt335;
			local12 = arg1.anInt335;
			if (arg3) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt333 - arg1.anInt333;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ql;I)V")
	public static void method5166(@OriginalArg(0) Class12_Sub7 arg0) {
		arg0.aClass28_1 = null;
		@Pc(17) int local17 = arg0.aClass12_Sub5Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass12_Sub5Array1[local19].aBoolean256 = false;
		}
		@Pc(37) Class22[] local37 = Class38.aClass22Array3;
		synchronized (Class38.aClass22Array3) {
			if (local17 < Class38.aClass22Array3.length && Static22.anIntArray37[local17] < 200) {
				Class38.aClass22Array3[local17].method286(arg0);
				@Pc(58) int local58 = Static22.anIntArray37[local17]++;
			}
		}
	}
}
