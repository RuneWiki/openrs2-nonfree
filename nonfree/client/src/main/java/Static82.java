import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public static int anInt2082;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_17 = new Class87(50);

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
	public static final int[] anIntArray202 = new int[100];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIII)V")
	public static void method1813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(15) int local15 = arg0 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static152.method4088(arg3, arg2, arg4, arg1);
			}
		} else if (local10 == 0) {
			Static300.method5086(arg3, arg0, arg1, arg2);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(58) boolean local58 = local10 > local15;
			@Pc(62) int local62;
			@Pc(64) int local64;
			if (local58) {
				local62 = arg1;
				local64 = arg0;
				arg1 = arg2;
				arg2 = local62;
				arg0 = arg4;
				arg4 = local64;
			}
			if (arg1 > arg0) {
				local62 = arg1;
				arg1 = arg0;
				local64 = arg2;
				arg0 = local62;
				arg2 = arg4;
				arg4 = local64;
			}
			local62 = arg2;
			local64 = arg0 - arg1;
			@Pc(99) int local99 = arg4 - arg2;
			@Pc(104) int local104 = -(local64 >> 1);
			@Pc(111) int local111 = arg4 > arg2 ? 1 : -1;
			if (local99 < 0) {
				local99 = -local99;
			}
			@Pc(127) int local127;
			if (local58) {
				for (local127 = arg1; local127 <= arg0; local127++) {
					local104 += local99;
					Static344.anIntArrayArray65[local127][local62] = arg3;
					if (local104 > 0) {
						local104 -= local64;
						local62 += local111;
					}
				}
			} else {
				for (local127 = arg1; local127 <= arg0; local127++) {
					local104 += local99;
					Static344.anIntArrayArray65[local62][local127] = arg3;
					if (local104 > 0) {
						local62 += local111;
						local104 -= local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method1814() {
		Static324.aClass32_14.method2204(Static157.anInt4858, Static306.aBoolean584 ? Static303.anInt2314 + 256 : -1);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!pi;)V")
	public static void method1816(@OriginalArg(1) Class17_Sub1_Sub1_Sub2 arg0) {
		for (@Pc(14) Class1_Sub22 local14 = (Class1_Sub22) Static150.aClass16_15.method410(); local14 != null; local14 = (Class1_Sub22) Static150.aClass16_15.method419()) {
			if (arg0 == local14.aClass17_Sub1_Sub1_Sub2_1) {
				if (local14.aClass1_Sub1_Sub2_2 != null) {
					Static145.aClass1_Sub1_Sub4_1.method5037(local14.aClass1_Sub1_Sub2_2);
					local14.aClass1_Sub1_Sub2_2 = null;
				}
				local14.method5628();
				return;
			}
		}
	}
}
