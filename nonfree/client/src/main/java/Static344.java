import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "[Lclient!wda;")
	public static final Interface24[] anInterface24Array2 = new Interface24[128];

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!ps;")
	public static Class273 aClass273_8 = null;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method5009() {
		Static377.anInt6297 = 1;
		Static124.anInt9459 = -1;
		if (Static353.aString80 == null) {
			Static29.method389(35);
		} else {
			@Pc(25) Class2_Sub7 local25 = new Class2_Sub7(Static383.method5319(Static401.method5487(Static353.aString80)));
			@Pc(29) long local29 = local25.method4514();
			Static217.aLong94 = local25.method4514();
			Static24.method350(true, "", Static100.method1511(local29));
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!caa;III)V")
	public static void method5010(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class228 local12;
		if (arg2 < Static83.anInt1434) {
			local12 = Static469.aClass228ArrayArrayArray6[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass12_Sub2_Sub2_1 != null && local12.aClass12_Sub2_Sub2_1.method7510()) {
				arg0.method7507(0, Static337.aClass162_13, Static481.anInt7681, local12.aClass12_Sub2_Sub2_1, true, 0);
			}
		}
		if (arg3 < Static83.anInt1434) {
			local12 = Static469.aClass228ArrayArrayArray6[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass12_Sub2_Sub2_1 != null && local12.aClass12_Sub2_Sub2_1.method7510()) {
				arg0.method7507(0, Static337.aClass162_13, 0, local12.aClass12_Sub2_Sub2_1, true, Static481.anInt7681);
			}
		}
		if (arg2 < Static83.anInt1434 && arg3 < Static405.anInt6657) {
			local12 = Static469.aClass228ArrayArrayArray6[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass12_Sub2_Sub2_1 != null && local12.aClass12_Sub2_Sub2_1.method7510()) {
				arg0.method7507(0, Static337.aClass162_13, Static481.anInt7681, local12.aClass12_Sub2_Sub2_1, true, Static481.anInt7681);
			}
		}
		if (arg2 < Static83.anInt1434 && arg3 > 0) {
			local12 = Static469.aClass228ArrayArrayArray6[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass12_Sub2_Sub2_1 != null && local12.aClass12_Sub2_Sub2_1.method7510()) {
				arg0.method7507(0, Static337.aClass162_13, Static481.anInt7681, local12.aClass12_Sub2_Sub2_1, true, -Static481.anInt7681);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public static void method5011() {
		Static15.aClass162_1.pa(Static532.anInt8756, Static257.aClass2_Sub35_Sub1_1.aBoolean633 ? Static327.anInt5512 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public static void method5012() {
		for (@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) Static246.aClass70_25.method1264(); local10 != null; local10 = (Class2_Sub21) Static246.aClass70_25.method1261()) {
			if (local10.anInt3026 > 0) {
				local10.anInt3026--;
			}
			if (local10.anInt3026 != 0) {
				if (local10.anInt3024 > 0) {
					local10.anInt3024--;
				}
				if (local10.anInt3024 == 0 && local10.anInt3036 >= 1 && local10.anInt3030 >= 1 && Static281.anInt4822 - 2 >= local10.anInt3036 && Static29.anInt491 - 2 >= local10.anInt3030 && (local10.anInt3027 < 0 || Static315.method4550(local10.anInt3033, local10.anInt3027))) {
					Static363.method5137(local10.anInt3030, local10.anInt3033, local10.anInt3029, -1, local10.anInt3027, local10.anInt3035, local10.anInt3036, local10.anInt3031);
					local10.anInt3024 = -1;
					if (local10.anInt3027 == local10.anInt3032 && local10.anInt3032 == -1) {
						local10.method7657();
					} else if (local10.anInt3032 == local10.anInt3027 && local10.anInt3029 == local10.anInt3034 && local10.anInt3033 == local10.anInt3023) {
						local10.method7657();
					}
				}
			} else if (local10.anInt3032 < 0 || Static315.method4550(local10.anInt3023, local10.anInt3032)) {
				Static363.method5137(local10.anInt3030, local10.anInt3023, local10.anInt3034, -1, local10.anInt3032, local10.anInt3035, local10.anInt3036, local10.anInt3031);
				local10.method7657();
			}
		}
	}
}
