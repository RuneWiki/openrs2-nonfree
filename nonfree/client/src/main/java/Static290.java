import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_273 = new Class123(73, -1);

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public static void method4368() {
		Static125.aClass44_12.method1351();
		Static97.aClass44_7.method1351();
		Static445.aClass44_59.method1351();
		Static51.aClass44_4.method1351();
		Static140.aClass44_14.method1351();
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	public static void method4369() {
		for (@Pc(15) Class6_Sub23 local15 = (Class6_Sub23) Static428.aClass244_45.method5976(); local15 != null; local15 = (Class6_Sub23) Static428.aClass244_45.method5964()) {
			if (local15.anInt4208 == -1) {
				local15.anInt4209 = 0;
				if (local15.anInt4218 >= 0 && local15.anInt4215 >= 0 && local15.anInt4218 < Static181.anInt3574 && local15.anInt4215 < Static117.anInt2450) {
					Static184.method2977(local15);
				}
			} else {
				local15.method6525();
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!is;IIIII)V")
	public static void method4370(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7773 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static441.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class76 local35 = Static411.aClass76Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt7773; local37++) {
							if (arg0.aClass6_Sub11Array3[local37] == local35.aClass6_Sub11_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass6_Sub11Array3[arg0.anInt7773++] = local35.aClass6_Sub11_1;
						if (arg0.anInt7773 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt7773; local7 < 4; local7++) {
			arg0.aClass6_Sub11Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	public static void method4371(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub2_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class86 local8 = Static87.aClass86Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static61.anInt1698; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static229.anInt4189; local15++) {
						local1 = local8.method6591(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static62.anInt1705;
							@Pc(32) int local32 = local12 << Static62.anInt1705;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class86 local41 = Static87.aClass86Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method6594(local15, local12) - local41.method6594(local15, local12);
									@Pc(67) int local67 = local8.method6594(local15 + 1, local12) - local41.method6594(local15 + 1, local12);
									@Pc(85) int local85 = local8.method6594(local15 + 1, local12 + 1) - local41.method6594(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method6594(local15, local12 + 1) - local41.method6594(local15, local12 + 1);
									local41.method6583(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI)V")
	public static void method4373(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class6_Sub19 local10 = (Class6_Sub19) Static182.aClass244_16.method5976(); local10 != null; local10 = (Class6_Sub19) Static182.aClass244_16.method5964()) {
			if (local10.aClass6_Sub4_Sub1_3 != null) {
				Static360.aClass6_Sub4_Sub4_2.method5907(local10.aClass6_Sub4_Sub1_3);
				local10.aClass6_Sub4_Sub1_3 = null;
			}
			if (local10.aClass6_Sub4_Sub1_2 != null) {
				Static360.aClass6_Sub4_Sub4_2.method5907(local10.aClass6_Sub4_Sub1_2);
				local10.aClass6_Sub4_Sub1_2 = null;
			}
			local10.method6525();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(51) Class6_Sub19 local51 = (Class6_Sub19) Static307.aClass244_26.method5976(); local51 != null; local51 = (Class6_Sub19) Static307.aClass244_26.method5964()) {
			if (local51.aClass6_Sub4_Sub1_3 != null) {
				Static360.aClass6_Sub4_Sub4_2.method5907(local51.aClass6_Sub4_Sub1_3);
				local51.aClass6_Sub4_Sub1_3 = null;
			}
			local51.method6525();
		}
		for (@Pc(78) Class6_Sub19 local78 = (Class6_Sub19) Static418.aClass74_32.method1889(); local78 != null; local78 = (Class6_Sub19) Static418.aClass74_32.method1881()) {
			if (local78.aClass6_Sub4_Sub1_3 != null) {
				Static360.aClass6_Sub4_Sub4_2.method5907(local78.aClass6_Sub4_Sub1_3);
				local78.aClass6_Sub4_Sub1_3 = null;
			}
			local78.method6525();
		}
	}
}
