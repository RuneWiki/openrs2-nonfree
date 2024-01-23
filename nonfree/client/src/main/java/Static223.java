import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!td", name = "N", descriptor = "I")
	public static int anInt4896 = 0;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	public static int anInt4901 = 0;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "[I")
	public static int[] anIntArray429 = new int[1000];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BIII)I")
	public static int method3706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZLclient!mi;)V")
	public static void method3707(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1) {
		if (Static156.anInt3722 < arg1.anInt421) {
			Static38.method666(arg1);
		} else if (arg1.anInt409 < Static156.anInt3722) {
			Static64.method1258(arg1);
		} else {
			Static187.method3152(arg1);
		}
		if (arg1.anInt427 < 128 || arg1.anInt479 < 128 || arg1.anInt427 >= 13184 || arg1.anInt479 >= 13184) {
			arg1.anInt443 = -1;
			arg1.anInt409 = 0;
			arg1.anInt448 = -1;
			arg1.anInt421 = 0;
			arg1.anInt427 = arg1.anIntArray43[0] * 128 + arg1.method208() * 64;
			arg1.anInt479 = arg1.anIntArray41[0] * 128 + arg1.method208() * 64;
			arg1.method216();
		}
		if (arg1 == Static83.aClass9_Sub1_Sub1_1 && (arg1.anInt427 < 1536 || arg1.anInt479 < 1536 || arg1.anInt427 >= 11776 || arg1.anInt479 >= 11776)) {
			arg1.anInt409 = 0;
			arg1.anInt448 = -1;
			arg1.anInt443 = -1;
			arg1.anInt421 = 0;
			arg1.anInt427 = arg1.anIntArray43[0] * 128 + arg1.method208() * 64;
			arg1.anInt479 = arg1.anIntArray41[0] * 128 + arg1.method208() * 64;
			arg1.method216();
		}
		Static169.method2949(arg1);
		Static21.method404(arg1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method3708(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub18 local10 = Static13.method232(arg0, 7);
		local10.method3805();
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
	public static void method3711() {
		for (@Pc(14) Class1_Sub2_Sub17 local14 = (Class1_Sub2_Sub17) Static106.aClass3_12.method30(); local14 != null; local14 = (Class1_Sub2_Sub17) Static106.aClass3_12.method33()) {
			@Pc(19) Class9_Sub7 local19 = local14.aClass9_Sub7_1;
			if (Static137.anInt3321 != local19.anInt3127 || Static156.anInt3722 > local19.anInt3123) {
				local14.method4186();
			} else if (Static156.anInt3722 >= local19.anInt3107) {
				if (local19.anInt3134 > 0) {
					@Pc(49) Class9_Sub1_Sub2 local49 = Static36.aClass9_Sub1_Sub2Array2[local19.anInt3134 - 1];
					if (local49 != null && local49.anInt427 >= 0 && local49.anInt427 < 13312 && local49.anInt479 >= 0 && local49.anInt479 < 13312) {
						local19.method2371(local49.anInt427, local49.anInt479, Static156.anInt3722, Static200.method3326(local19.anInt3127, local49.anInt479, local49.anInt427) - local19.anInt3135);
					}
				}
				if (local19.anInt3134 < 0) {
					@Pc(98) int local98 = -local19.anInt3134 - 1;
					@Pc(109) Class9_Sub1_Sub1 local109;
					if (local98 == Static243.anInt5251) {
						local109 = Static83.aClass9_Sub1_Sub1_1;
					} else {
						local109 = Static147.aClass9_Sub1_Sub1Array1[local98];
					}
					if (local109 != null && local109.anInt427 >= 0 && local109.anInt427 < 13312 && local109.anInt479 >= 0 && local109.anInt479 < 13312) {
						local19.method2371(local109.anInt427, local109.anInt479, Static156.anInt3722, Static200.method3326(local19.anInt3127, local109.anInt479, local109.anInt427) - local19.anInt3135);
					}
				}
				local19.method2370(Static37.anInt999);
				Static164.method2853(Static137.anInt3321, (int) local19.aDouble2, (int) local19.aDouble5, (int) local19.aDouble7, 60, local19, local19.anInt3117, -1L, false);
			}
		}
	}
}
