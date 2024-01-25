import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "Lclient!em;")
	public static final Class86 aClass86_10 = new Class86();

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "Z")
	public static final boolean aBoolean482 = false;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
	public static void method5646() {
		if (!Static264.aBoolean363) {
			return;
		}
		while (true) {
			while (Static322.anInt6205 < Static74.aClass35_Sub1Array1.length) {
				@Pc(22) Class35_Sub1 local22 = Static74.aClass35_Sub1Array1[Static322.anInt6205];
				if (local22 != null && local22.anInt999 == -1) {
					if (Static322.aClass5_Sub38_1 == null) {
						Static322.aClass5_Sub38_1 = Static187.aClass201_1.method5073(local22.aString26);
					}
					@Pc(46) int local46 = Static322.aClass5_Sub38_1.anInt6970;
					if (local46 == -1) {
						return;
					}
					Static322.anInt6205++;
					Static322.aClass5_Sub38_1 = null;
					local22.anInt999 = local46;
				} else {
					Static322.anInt6205++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILclient!oh;I)V")
	public static void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class220 arg2) {
		if (Static479.aBoolean594) {
			@Pc(14) Class135 local14 = Static192.anInt3701 == -1 ? null : Static216.aClass298_11.method6969(Static192.anInt3701);
			if (Static68.method1303(arg2).method1955() && (Static354.anInt6690 & 0x20) != 0 && (local14 == null || arg2.method5475(Static192.anInt3701, local14.anInt3793) != local14.anInt3793)) {
				Static371.method5606(Static186.anInt3582, arg2.anInt6661, 5, arg2.anInt6641, true, 0L, arg2.anInt6674, Static150.aString37, false, Static516.aString81 + " -> " + arg2.aString63);
			}
			return;
		}
		@Pc(76) String local76;
		for (@Pc(69) int local69 = 9; local69 >= 5; local69--) {
			local76 = Static426.method6105(local69, arg2);
			if (local76 != null) {
				Static371.method5606(Static358.method5521(local69, arg2), arg2.anInt6661, 1007, arg2.anInt6641, true, (long) (local69 + 1), arg2.anInt6674, local76, false, arg2.aString63);
			}
		}
		local76 = Static247.method4238(arg2);
		if (local76 != null) {
			Static371.method5606(arg2.anInt6616, arg2.anInt6661, 12, arg2.anInt6641, true, 0L, arg2.anInt6674, local76, false, arg2.aString63);
		}
		for (@Pc(139) int local139 = 4; local139 >= 0; local139--) {
			@Pc(146) String local146 = Static426.method6105(local139, arg2);
			if (local146 != null) {
				Static371.method5606(Static358.method5521(local139, arg2), arg2.anInt6661, 22, arg2.anInt6641, true, (long) (local139 + 1), arg2.anInt6674, local146, false, arg2.aString63);
			}
		}
		if (!Static68.method1303(arg2).method1959()) {
			return;
		}
		if (arg2.aString66 == null) {
			Static371.method5606(-1, arg2.anInt6661, 58, arg2.anInt6641, true, 0L, arg2.anInt6674, Static175.aClass40_55.method1063(Static194.anInt3737), false, "");
		} else {
			Static371.method5606(-1, arg2.anInt6661, 58, arg2.anInt6641, true, 0L, arg2.anInt6674, arg2.aString66, false, "");
		}
	}
}
