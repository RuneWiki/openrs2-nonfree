import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!l;")
	public static Class11 aClass11_13;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
	public static int anInt3864 = -50;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "F")
	public static float aFloat108 = 0.0F;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!sm;)I")
	public static int method3068(@OriginalArg(1) Class7_Sub39 arg0) {
		@Pc(9) String local9 = Static336.method4381(arg0);
		@Pc(11) int[] local11 = null;
		if (Static59.method821(arg0.anInt5893)) {
			local11 = Static259.aClass206_2.method4320((int) arg0.aLong186).anIntArray81;
		} else if (arg0.anInt5895 != -1) {
			local11 = Static259.aClass206_2.method4320(arg0.anInt5895).anIntArray81;
		} else if (Static300.method4007(arg0.anInt5893)) {
			@Pc(41) Class26_Sub2_Sub4_Sub1 local41 = Static171.aClass26_Sub2_Sub4_Sub1Array1[(int) arg0.aLong186];
			if (local41 != null) {
				@Pc(46) Class249 local46 = local41.aClass249_1;
				if (local46.anIntArray579 != null) {
					local46 = local46.method5179(Static224.aClass239_7);
				}
				if (local46 != null) {
					local11 = local46.anIntArray582;
				}
			}
		} else if (Static139.method2166(arg0.anInt5893)) {
			@Pc(82) Class189 local82;
			if (arg0.anInt5893 == 1011) {
				local82 = Static411.aClass142_4.method3148((int) arg0.aLong186);
			} else {
				local82 = Static411.aClass142_4.method3148((int) (arg0.aLong186 >>> 32 & 0x7FFFFFFFL));
			}
			if (local82.anIntArray448 != null) {
				local82 = local82.method4038(Static224.aClass239_7);
			}
			if (local82 != null) {
				local11 = local82.anIntArray449;
			}
		}
		if (local11 != null) {
			local9 = local9 + Static96.method1690(local11);
		}
		@Pc(135) int local135 = Static35.aClass57_13.method1384(Static423.aClass11Array15, local9);
		if (arg0.aBoolean391) {
			local135 += Static454.aClass11_21.la() + 4;
		}
		return local135;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
	public static void method3070(@OriginalArg(1) int arg0) {
		@Pc(1) Class7_Sub4_Sub2 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class165 local8 = Static149.aClass165Array7[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static295.anInt4910; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static264.anInt4480; local15++) {
						local1 = local8.k(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static168.anInt3026;
							@Pc(32) int local32 = local12 << Static168.anInt3026;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class165 local41 = Static149.aClass165Array7[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.l(local15, local12) - local41.l(local15, local12);
									@Pc(67) int local67 = local8.l(local15 + 1, local12) - local41.l(local15 + 1, local12);
									@Pc(85) int local85 = local8.l(local15 + 1, local12 + 1) - local41.l(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.l(local15, local12 + 1) - local41.l(local15, local12 + 1);
									local41.b(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
