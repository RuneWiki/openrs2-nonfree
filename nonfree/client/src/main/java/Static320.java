import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!eba;")
	public static Class81 aClass81_135;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!lr;ILclient!lr;I)I")
	public static int method4864(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class208_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class208_Sub1 arg3) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		if (arg2 == 1) {
			local14 = arg1.anInt5559;
			local17 = arg3.anInt5559;
			if (!arg0) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local17 == -1) {
					local17 = 2001;
				}
			}
			return local14 - local17;
		} else if (arg2 == 2) {
			return Static276.method4277(Static562.anInt9127, arg3.method4739().aString80, arg1.method4739().aString80);
		} else if (arg2 == 3) {
			if (arg1.aString61.equals("-")) {
				if (arg3.aString61.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString61.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static276.method4277(Static562.anInt9127, arg3.aString61, arg1.aString61);
			}
		} else if (arg2 == 4) {
			if (arg1.method4738()) {
				return arg3.method4738() ? 0 : 1;
			} else if (arg3.method4738()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method4736()) {
				return arg3.method4736() ? 0 : 1;
			} else if (arg3.method4736()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method4735()) {
				return arg3.method4735() ? 0 : 1;
			} else if (arg3.method4735()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method4734()) {
				return arg3.method4734() ? 0 : 1;
			} else if (arg3.method4734()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local14 = arg1.anInt5561;
			local17 = arg3.anInt5561;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local17 == 1000) {
					local17 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local17 == -1) {
					local17 = 1000;
				}
			}
			return local14 - local17;
		} else {
			return arg1.anInt5565 - arg3.anInt5565;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!jh;ZLclient!tt;)Lclient!to;")
	public static Class1_Sub48 method4867(@OriginalArg(0) Class170 arg0, @OriginalArg(2) Class319 arg1) {
		@Pc(8) Class1_Sub48 local8 = Static258.method4052();
		local8.aClass319_152 = arg1;
		local8.anInt8523 = arg1.anInt8573;
		if (local8.anInt8523 == -1) {
			local8.aClass1_Sub20_Sub1_2 = new Class1_Sub20_Sub1(260);
		} else if (local8.anInt8523 == -2) {
			local8.aClass1_Sub20_Sub1_2 = new Class1_Sub20_Sub1(10000);
		} else if (local8.anInt8523 <= 18) {
			local8.aClass1_Sub20_Sub1_2 = new Class1_Sub20_Sub1(20);
		} else if (local8.anInt8523 > 98) {
			local8.aClass1_Sub20_Sub1_2 = new Class1_Sub20_Sub1(260);
		} else {
			local8.aClass1_Sub20_Sub1_2 = new Class1_Sub20_Sub1(100);
		}
		local8.aClass1_Sub20_Sub1_2.method3931(arg0);
		local8.aClass1_Sub20_Sub1_2.method3934(local8.aClass319_152.method7096());
		local8.anInt8519 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public static void method4868() {
		if (Static373.aBoolean467) {
			return;
		}
		Static373.aBoolean467 = true;
		Static459.aBoolean567 = true;
		if (Static479.aClass1_Sub7_Sub1_1.aBoolean231) {
			Static143.aFloat61 = (int) Static143.aFloat61 + 191 & 0xFFFFFF80;
		} else {
			Static327.aFloat150 += (24.0F - Static327.aFloat150) / 2.0F;
		}
	}
}
