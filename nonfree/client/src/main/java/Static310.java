import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array9;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
	public static int anInt5666;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	public static int anInt5668;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!hi;")
	public static Class66 aClass66_51 = null;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!td;")
	public static Class1_Sub29 aClass1_Sub29_1 = new Class1_Sub29(0, 0);

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	public static int anInt5667 = 0;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
	public static boolean aBoolean382 = true;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(1) Class1_Sub18 local1 = null;
		for (@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static159.aClass59_26.method1704(); local10 != null; local10 = (Class1_Sub18) Static159.aClass59_26.method1701()) {
			if (local10.anInt1780 == arg5 && arg3 == local10.anInt1791 && arg7 == local10.anInt1785 && arg0 == local10.anInt1779) {
				local1 = local10;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class1_Sub18();
			local1.anInt1780 = arg5;
			local1.anInt1779 = arg0;
			local1.anInt1785 = arg7;
			local1.anInt1791 = arg3;
			Static315.method4458(local1);
			Static159.aClass59_26.method1706(local1);
		}
		local1.anInt1783 = arg8;
		local1.anInt1786 = arg6;
		local1.anInt1790 = arg1;
		local1.anInt1787 = arg4;
		local1.anInt1789 = arg2;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)V")
	public static void method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static5.method35(arg0, 7);
		local4.method2866();
		local4.anInt3315 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I")
	public static int method4733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V")
	public static void method4734() {
		for (@Pc(1) int local1 = 0; local1 < Static312.anInt5729; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static153.anInt3006; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static285.anInt5122; local11++) {
					@Pc(22) Class1_Sub33 local22 = Static105.aClass1_Sub33ArrayArrayArray2[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class160 local27 = local22.aClass160_1;
						if (local27 != null && local27.aClass15_7.method4680()) {
							Static300.method4555(local27.aClass15_7, local1, local6, local11, 1, 1);
							if (local27.aClass15_8 != null && local27.aClass15_8.method4680()) {
								Static300.method4555(local27.aClass15_8, local1, local6, local11, 1, 1);
								local27.aClass15_7.method4683(local27.aClass15_8, 0, 0, 0, false);
								local27.aClass15_8 = local27.aClass15_8.method4684();
							}
							local27.aClass15_7 = local27.aClass15_7.method4684();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt5733; local83++) {
							@Pc(92) Class161 local92 = local22.aClass161Array3[local83];
							if (local92 != null && local92.aClass15_9.method4680()) {
								Static300.method4555(local92.aClass15_9, local1, local6, local11, local92.anInt4639 + 1 - local92.anInt4641, local92.anInt4637 - local92.anInt4636 + 1);
								local92.aClass15_9 = local92.aClass15_9.method4684();
							}
						}
						@Pc(131) Class36 local131 = local22.aClass36_1;
						if (local131 != null && local131.aClass15_1.method4680()) {
							Static93.method1699(local131.aClass15_1, local1, local6, local11);
							local131.aClass15_1 = local131.aClass15_1.method4684();
						}
					}
				}
			}
		}
	}
}
