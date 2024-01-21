import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 aClass1_Sub3_Sub1_Sub3_2;

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_1;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
	public static int anInt313 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
	public static int anInt315 = 1;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)V")
	public static void method278() {
		if (Static1.aClass78_1 != null) {
			Static1.aClass78_1.method2176();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Lclient!af;")
	public static Class5 method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static49.aClass5_617;
		} else if (local8 < -6) {
			return Static129.aClass5_1475;
		} else if (local8 < -3) {
			return Static41.aClass5_495;
		} else if (local8 < 0) {
			return Static2.aClass5_33;
		} else if (local8 > 9) {
			return Static72.aClass5_821;
		} else if (local8 > 6) {
			return Static54.aClass5_672;
		} else if (local8 > 3) {
			return Static116.aClass5_1328;
		} else if (local8 > 0) {
			return Static76.aClass5_893;
		} else {
			return Static48.aClass5_583;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B[BII)Z")
	public static boolean method280(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) boolean local8 = true;
		@Pc(17) Class1_Sub20 local17 = new Class1_Sub20(arg0);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method2056();
			if (local23 == 0) {
				return local8;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(99) Class1_Sub3_Sub10 local99;
				do {
					@Pc(73) int local73;
					@Pc(78) int local78;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method2056();
										if (local42 == 0) {
											continue label70;
										}
										local17.method2053();
									}
									local42 = local17.method2056();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(57) int local57 = local34 & 0x3F;
									@Pc(63) int local63 = local34 >> 6 & 0x3F;
									local69 = local17.method2053() >> 2;
									local73 = arg2 + local63;
									local78 = local57 + arg1;
								} while (local73 <= 0);
							} while (local78 <= 0);
						} while (local73 >= 103);
					} while (local78 >= 103);
					local99 = Static131.method2263(local19);
				} while (local69 == 22 && Static79.aBoolean64 && local99.anInt1702 == 0 && local99.anInt1681 != 1 && !local99.aBoolean52);
				if (!local99.method1254()) {
					Static12.anInt3241++;
					local8 = false;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZLclient!r;)V")
	public static void method281(@OriginalArg(0) int arg0, @OriginalArg(2) Class41_Sub1 arg1) {
		if (Static41.aClass1_Sub20_1 == null) {
			Static17.method420(255, true, (byte) 0, 255, null, 0);
			Static37.aClass41_Sub1Array1[arg0] = arg1;
		} else {
			Static41.aClass1_Sub20_1.anInt2951 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static41.aClass1_Sub20_1.method2094();
			@Pc(20) int local20 = Static41.aClass1_Sub20_1.method2094();
			arg1.method1736(local20, local16);
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)V")
	public static void method282() {
		aClass41_Sub1_1 = null;
		aClass1_Sub3_Sub1_Sub3_2 = null;
	}
}
