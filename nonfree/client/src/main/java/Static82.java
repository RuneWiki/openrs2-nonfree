import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!en", name = "v", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array5;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Lclient!qb;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!en", name = "u", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_14 = new Class210();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method1454() {
		for (@Pc(14) Class2_Sub7 local14 = (Class2_Sub7) Static66.aClass210_43.method5035(); local14 != null; local14 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			if (Static367.method5540(local14.anInt541)) {
				Static133.method2330(local14);
			}
		}
		if (Static379.anInt1192 == 1) {
			Static48.aBoolean87 = false;
			Static299.method4675(Static71.anInt1351, Static8.anInt189, Static40.anInt6591, Static300.anInt5403);
			return;
		}
		Static299.method4675(Static71.anInt1351, Static8.anInt189, Static40.anInt6591, Static300.anInt5403);
		@Pc(61) int local61 = Static60.aClass216_3.method5073(Static5.aClass221_239.method5229(Static189.anInt5185));
		for (@Pc(66) Class2_Sub7 local66 = (Class2_Sub7) Static66.aClass210_43.method5035(); local66 != null; local66 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			@Pc(74) int local74 = Static349.method5338(local66);
			if (local61 < local74) {
				local61 = local74;
			}
		}
		Static71.anInt1351 = Static379.anInt1192 * 16 + (Static372.aBoolean487 ? 26 : 22);
		Static300.anInt5403 = local61 + 8;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	public static void method1455(@OriginalArg(1) int arg0) {
		Static269.anInt4775 = 100;
		Static10.anInt307 = arg0;
		Static276.anInt4916 = 3;
		Static358.anInt6273 = -1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	public static void method1456() {
		for (@Pc(10) Class2_Sub1_Sub12 local10 = (Class2_Sub1_Sub12) aClass210_14.method5035(); local10 != null; local10 = (Class2_Sub1_Sub12) aClass210_14.method5037()) {
			@Pc(15) Class12_Sub1_Sub1 local15 = local10.aClass12_Sub1_Sub1_1;
			if (local15.aByte74 != Static331.anInt5804 || Static295.anInt5281 > local15.anInt245) {
				local10.method5745();
				local15.method301();
			} else if (Static295.anInt5281 >= local15.anInt223) {
				if (local15.anInt242 > 0) {
					@Pc(45) Class12_Sub1_Sub2_Sub1 local45 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local15.anInt242 - 1];
					if (local45 != null && local45.anInt6328 >= 0 && Static392.anInt6751 * 128 > local45.anInt6328 && local45.anInt6317 >= 0 && local45.anInt6317 < Static307.anInt5484 * 128) {
						local15.method305(local45.anInt6328, local45.anInt6317, Static18.method508(local45.anInt6317, local15.aByte74, local45.anInt6328) - local15.lb, Static295.anInt5281);
					}
				}
				if (local15.anInt242 < 0) {
					@Pc(96) int local96 = -local15.anInt242 - 1;
					@Pc(105) Class12_Sub1_Sub2_Sub2 local105;
					if (local96 == Static194.anInt3441) {
						local105 = Static267.aClass12_Sub1_Sub2_Sub2_1;
					} else {
						local105 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local96];
					}
					if (local105 != null && local105.anInt6328 >= 0 && local105.anInt6328 < Static392.anInt6751 * 128 && local105.anInt6317 >= 0 && Static307.anInt5484 * 128 > local105.anInt6317) {
						local15.method305(local105.anInt6328, local105.anInt6317, Static18.method508(local105.anInt6317, local15.aByte74, local105.anInt6328) - local15.lb, Static295.anInt5281);
					}
				}
				local15.method302(Static346.anInt6113);
				Static326.method5033(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)I")
	public static int method1457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}
}
