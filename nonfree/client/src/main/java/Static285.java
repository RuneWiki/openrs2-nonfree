import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public static int anInt5596;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
	public static int anInt5618;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString194 = "Walk here";

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLclient!nn;ILclient!nn;I)I")
	public static int method4242(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13_Sub1 arg3) {
		if (arg2 == 1) {
			@Pc(9) int local9 = arg1.anInt3517;
			@Pc(12) int local12 = arg3.anInt3517;
			if (!arg0) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static189.method2958(arg3.method2750().aString45, arg1.method2750().aString45, Static184.anInt3648);
		} else if (arg2 == 3) {
			if (arg1.aString124.equals("-")) {
				if (arg3.aString124.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString124.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static189.method2958(arg3.aString124, arg1.aString124, Static184.anInt3648);
			}
		} else if (arg2 == 4) {
			return arg1.method2748() ? (arg3.method2748() ? 0 : 1) : (arg3.method2748() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg1.method2744() ? (arg3.method2744() ? 0 : 1) : (arg3.method2744() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg1.method2746() ? (arg3.method2746() ? 0 : 1) : arg3.method2746() ? -1 : 0;
		} else if (arg2 == 7) {
			return arg1.method2747() ? (arg3.method2747() ? 0 : 1) : arg3.method2747() ? -1 : 0;
		} else {
			return arg1.anInt3528 - arg3.anInt3528;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)I")
	public static int method4243() {
		return Static87.aClass61_15.method1376();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!wk;Z)V")
	public static void method4247(@OriginalArg(0) Class43_Sub2 arg0) {
		@Pc(5) int local5;
		for (local5 = 0; local5 < Static69.anIntArray104.length; local5++) {
			Static69.anIntArray104[local5] = 0;
		}
		@Pc(34) int local34;
		for (local5 = 0; local5 < 5000; local5++) {
			local34 = (int) (Math.random() * 128.0D * (double) 256);
			Static69.anIntArray104[local34] = (int) (Math.random() * 284.0D);
		}
		@Pc(62) int local62;
		@Pc(71) int local71;
		for (local5 = 0; local5 < 20; local5++) {
			for (local34 = 1; local34 < 255; local34++) {
				for (local62 = 1; local62 < 127; local62++) {
					local71 = (local34 << 7) + local62;
					Static35.anIntArray57[local71] = (Static69.anIntArray104[local71 + 128] + Static69.anIntArray104[local71 - 128] + Static69.anIntArray104[local71 + 1] + Static69.anIntArray104[local71 + -1]) / 4;
				}
			}
			@Pc(107) int[] local107 = Static69.anIntArray104;
			Static69.anIntArray104 = Static35.anIntArray57;
			Static35.anIntArray57 = local107;
		}
		if (arg0 == null) {
			return;
		}
		local5 = 0;
		for (local34 = 0; local34 < arg0.anInt5709; local34++) {
			for (local62 = 0; local62 < arg0.anInt5710; local62++) {
				if (arg0.aByteArray77[local5++] != 0) {
					local71 = arg0.anInt5708 + local62 + 16;
					@Pc(155) int local155 = local34 + arg0.anInt5712 + 16;
					@Pc(161) int local161 = local71 + (local155 << 7);
					Static69.anIntArray104[local161] = 0;
				}
			}
		}
	}
}
