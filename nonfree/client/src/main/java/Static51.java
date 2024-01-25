import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	public static int anInt930;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V")
	public static void method965(@OriginalArg(0) byte arg0) {
		if (Static6.aByteArrayArrayArray1 == null) {
			Static6.aByteArrayArrayArray1 = new byte[4][Static373.anInt6324][Static291.anInt5062];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static373.anInt6324; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static291.anInt5062; local22++) {
					Static6.aByteArrayArrayArray1[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[[[Lclient!sn;)V")
	public static void method966(@OriginalArg(1) Class227[][][] arg0) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class227[][] local14 = arg0[local8];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class227 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass1_Sub4_2 instanceof Interface5) {
							((Interface5) local28.aClass1_Sub4_2).method6264();
						}
						if (local28.aClass1_Sub1_1 instanceof Interface5) {
							((Interface5) local28.aClass1_Sub1_1).method6264();
						}
						if (local28.aClass1_Sub1_2 instanceof Interface5) {
							((Interface5) local28.aClass1_Sub1_2).method6264();
						}
						if (local28.aClass1_Sub3_3 instanceof Interface5) {
							((Interface5) local28.aClass1_Sub3_3).method6264();
						}
						if (local28.aClass1_Sub3_2 instanceof Interface5) {
							((Interface5) local28.aClass1_Sub3_2).method6264();
						}
						for (@Pc(78) Class114 local78 = local28.aClass114_2; local78 != null; local78 = local78.aClass114_1) {
							@Pc(83) Class1_Sub2 local83 = local78.aClass1_Sub2_1;
							if (local83 instanceof Interface5) {
								((Interface5) local83).method6264();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(Z)Lclient!fb;")
	public static Class3_Sub16 method967() {
		if (Static211.aClass193_3 == null || Static358.aClass21_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub16 local21 = (Class3_Sub16) Static358.aClass21_1.method498(); local21 != null; local21 = (Class3_Sub16) Static358.aClass21_1.method498()) {
			@Pc(29) Class152 local29 = Static211.aClass45_2.method1255(local21.anInt1896);
			if (local29 != null && local29.aBoolean317 && local29.method3608(Static211.anInterface6_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
	public static void method968() {
		if (Static52.aFrame1 != null) {
			return;
		}
		@Pc(18) Container local18;
		if (Static456.aFrame2 == null) {
			local18 = Static32.aClass51_1.anApplet1;
		} else {
			local18 = Static456.aFrame2;
		}
		Static277.anInt5005 = local18.getSize().width;
		Static199.anInt3571 = local18.getSize().height;
		@Pc(36) Insets local36;
		if (Static456.aFrame2 == local18) {
			local36 = Static456.aFrame2.getInsets();
			Static199.anInt3571 -= local36.top + local36.bottom;
			Static277.anInt5005 -= local36.right + local36.left;
		}
		if (Static282.method3967() == 1) {
			Static159.anInt2944 = 0;
			Static166.anInt3014 = Static459.anInt5917;
			Static310.anInt5307 = Static28.anInt495;
			Static229.anInt3847 = (Static277.anInt5005 - Static28.anInt495) / 2;
		} else if (Static61.anInt1155 < 96 && Static402.anInt6656 == 0) {
			@Pc(82) int local82 = Static277.anInt5005 > 1024 ? 1024 : Static277.anInt5005;
			Static229.anInt3847 = (Static277.anInt5005 - local82) / 2;
			Static310.anInt5307 = local82;
			@Pc(98) int local98 = Static199.anInt3571 <= 768 ? Static199.anInt3571 : 768;
			Static159.anInt2944 = 0;
			Static166.anInt3014 = local98;
		} else {
			Static166.anInt3014 = Static199.anInt3571;
			Static229.anInt3847 = 0;
			Static159.anInt2944 = 0;
			Static310.anInt5307 = Static277.anInt5005;
		}
		if (Static230.aClass35_2 != Static80.aClass35_1) {
			@Pc(128) boolean local128;
			if (Static310.anInt5307 < 1024 && Static166.anInt3014 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static151.aCanvas2.setSize(Static310.anInt5307, Static166.anInt3014);
		if (Static413.aClass167_11 != null) {
			Static413.aClass167_11.method5970(Static151.aCanvas2);
		}
		if (local18 == Static456.aFrame2) {
			local36 = Static456.aFrame2.getInsets();
			Static151.aCanvas2.setLocation(Static229.anInt3847 + local36.left, Static159.anInt2944 + local36.top);
		} else {
			Static151.aCanvas2.setLocation(Static229.anInt3847, Static159.anInt2944);
		}
		if (Static343.anInt5785 != -1) {
			Static213.method3196(true);
		}
		Static277.method4114();
	}
}
