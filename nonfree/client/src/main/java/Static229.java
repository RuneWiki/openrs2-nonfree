import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "Lclient!dc;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
	public static int anInt5073 = 0;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	public static void method4394(@OriginalArg(1) int arg0) {
		Static306.anInt6356 = arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)Lclient!ma;")
	public static Class2_Sub8_Sub3 method4396() {
		return Static341.aClass2_Sub8_Sub3_4;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I[[BLclient!vaa;)V")
	public static void method4397(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class322_Sub1 arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt10425; local14++) {
			Static293.method5263();
			for (@Pc(20) int local20 = 0; local20 < Static47.anInt1794 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static209.anInt4742 >> 3; local24++) {
					@Pc(34) int local34 = Static277.anIntArrayArrayArray11[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean715 || local44 == 0) {
							@Pc(55) int local55 = local34 >> 1 & 0x3;
							@Pc(61) int local61 = local34 >> 14 & 0x3FF;
							@Pc(67) int local67 = local34 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static431.anIntArray533.length; local79++) {
								if (Static431.anIntArray533[local79] == local77 && arg0[local79] != null) {
									arg1.method8709((local61 & 0x7) * 8, local55, arg0[local79], local44, (local67 & 0x7) * 8, Static186.aClass20_4, local24 * 8, local20 * 8, Static55.aClass104Array3, local14);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)V")
	public static void method4400() {
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) Static501.aClass341_59.method8524(); local15 != null; local15 = (Class2_Sub21) Static501.aClass341_59.method8519()) {
			if (local15.aBoolean344) {
				local15.method4085();
			}
		}
		for (@Pc(35) Class2_Sub21 local35 = (Class2_Sub21) Static76.aClass341_25.method8524(); local35 != null; local35 = (Class2_Sub21) Static76.aClass341_25.method8519()) {
			if (local35.aBoolean344) {
				local35.method4085();
			}
		}
	}
}
