import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Lclient!ii;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public static int anInt5691;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	public static int anInt5694;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_54 = new Class160(200);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4909(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class141[] local7 = Static335.aClass141Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class141 local15 = local7[local9];
			if (local15 != null && local15.anInt3559 == 2) {
				Static295.method4431(arg0 >> 1, arg3 >> 1, local15.anInt3556 + (local15.anInt3557 - Static28.anInt606 << 7), local15.anInt3565, local15.anInt3564 * 2, (local15.anInt3563 - Static319.anInt5425 << 7) + local15.anInt3553);
				if (Static355.anIntArray1252[0] > -1 && Static253.anInt4469 % 20 < 10) {
					Static164.aClass18Array7[local15.anInt3554].method4558(arg2 + Static355.anIntArray1252[0] - 12, arg1 + -28 - -Static355.anIntArray1252[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg1 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(48) int local48 = (Static386.aShort98 - Static280.aShort62) * local23 / 100 + Static280.aShort62;
		if (local48 < Static1.aShort99) {
			local48 = Static1.aShort99;
		} else if (Static14.aShort4 < local48) {
			local48 = Static14.aShort4;
		}
		@Pc(78) int local78 = local48 * 512 * arg1 / (arg3 * 334);
		@Pc(115) int local115;
		@Pc(122) int local122;
		@Pc(90) short local90;
		if (local78 < Static115.aShort36) {
			local90 = Static115.aShort36;
			local48 = local90 * 334 * arg3 / (arg1 * 512);
			if (Static14.aShort4 < local48) {
				local48 = Static14.aShort4;
				local115 = local48 * 512 * arg1 / (local90 * 334);
				local122 = (arg3 - local115) / 2;
				if (arg4) {
					Static111.aClass63_3.method1967();
					Static111.aClass63_3.method1951(arg0, arg1, local122, -16777216, arg2);
					Static111.aClass63_3.method1951(arg0, arg1, local122, -16777216, arg2 + arg3 - local122);
				}
				arg2 += local122;
				arg3 -= local122 * 2;
			}
		} else if (local78 > Static113.aShort35) {
			local90 = Static113.aShort35;
			local48 = local90 * 334 * arg3 / (arg1 * 512);
			if (Static1.aShort99 > local48) {
				local48 = Static1.aShort99;
				local115 = local90 * arg3 * 334 / (local48 * 512);
				local122 = (arg1 - local115) / 2;
				if (arg4) {
					Static111.aClass63_3.method1967();
					Static111.aClass63_3.method1951(arg0, local122, arg3, -16777216, arg2);
					Static111.aClass63_3.method1951(arg1 + arg0 - local122, local122, arg3, -16777216, arg2);
				}
				arg0 += local122;
				arg1 -= local122 * 2;
			}
		}
		Static198.anInt3653 = arg0;
		Static206.anInt3801 = (short) arg1;
		Static65.anInt4686 = arg2;
		Static350.anInt3740 = local48 * arg1 / 334;
		Static243.anInt4331 = (short) arg3;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
	public static int method4914(@OriginalArg(1) int arg0) {
		if (Static88.aClass221_1 != null) {
			Static88.aClass221_1.method4801();
			Static88.aClass221_1 = null;
		}
		Static321.anInt5498++;
		if (Static321.anInt5498 > 4) {
			Static285.anInt4943 = 0;
			Static321.anInt5498 = 0;
			return arg0;
		}
		Static285.anInt4943 = 0;
		if (Static379.anInt6374 == Static225.anInt4017) {
			Static225.anInt4017 = Static218.anInt4547;
		} else {
			Static225.anInt4017 = Static379.anInt6374;
		}
		return -1;
	}
}
