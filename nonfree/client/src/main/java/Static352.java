import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
	public static int anInt5986;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
	public static final int anInt5988 = 2;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_8 = new Class240("", 16);

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_121 = new Class211(81, 7);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
	public static void method4675() {
		Static37.method5022(10);
		Static11.method149();
		System.gc();
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)Z")
	public static boolean method4677(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub46 local10 = (Class2_Sub46) Static261.aClass156_13.method3155(); local10 != null; local10 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			if (Static346.method4610(local10.anInt7283) && (long) arg0 == local10.aLong226) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(II)V")
	public static void method4678(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub5_Sub7 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class162 local8 = Static314.aClass162Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static316.anInt5459; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static169.anInt2876; local15++) {
						local1 = local8.OA(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static460.anInt7074;
							@Pc(32) int local32 = local12 << Static460.anInt7074;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class162 local41 = Static314.aClass162Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ua(local15, local12) - local41.ua(local15, local12);
									@Pc(67) int local67 = local8.ua(local15 + 1, local12) - local41.ua(local15 + 1, local12);
									@Pc(85) int local85 = local8.ua(local15 + 1, local12 + 1) - local41.ua(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ua(local15, local12 + 1) - local41.ua(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZILclient!at;I)V")
	public static void method4679(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray7 != null) {
			@Pc(13) Class2_Sub44 local13 = new Class2_Sub44();
			local13.aClass16_20 = arg1;
			local13.anObjectArray36 = arg1.anObjectArray7;
			Static191.method2562(local13);
		}
		Static201.anInt3379 = arg1.anInt256;
		Static368.anInt6200 = arg1.anInt293;
		Static368.anInt6201 = arg1.anInt320;
		Static256.anInt2800 = arg0;
		Static405.anInt6628 = arg2;
		Static215.aBoolean217 = true;
		Static96.anInt1855 = arg1.anInt303;
		Static279.anInt6428 = arg1.anInt301;
		Static176.method70(arg1);
	}
}
