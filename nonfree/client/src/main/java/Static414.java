import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_9;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Lclient!in;")
	public static final Class169 aClass169_186 = new Class169(28, 7);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIZI)V")
	public static void method6774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg4;
		@Pc(14) int local14 = arg0 - arg3;
		if (local14 == 0) {
			if (local9 != 0) {
				Static430.method7043(arg2, arg1, arg3, arg4);
			}
		} else if (local9 == 0) {
			Static615.method9218(arg2, arg4, arg3, arg0);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(63) boolean local63 = local14 < local9;
			@Pc(67) int local67;
			@Pc(69) int local69;
			if (local63) {
				local67 = arg3;
				local69 = arg0;
				arg3 = arg4;
				arg4 = local67;
				arg0 = arg1;
				arg1 = local69;
			}
			if (arg0 < arg3) {
				local67 = arg3;
				local69 = arg4;
				arg3 = arg0;
				arg0 = local67;
				arg4 = arg1;
				arg1 = local69;
			}
			local67 = arg4;
			local69 = arg0 - arg3;
			@Pc(108) int local108 = arg1 - arg4;
			@Pc(113) int local113 = -(local69 >> 1);
			@Pc(124) int local124 = arg1 <= arg4 ? -1 : 1;
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(133) int local133;
			if (local63) {
				for (local133 = arg3; local133 <= arg0; local133++) {
					local113 += local108;
					Static186.anIntArrayArray12[local133][local67] = arg2;
					if (local113 > 0) {
						local67 += local124;
						local113 -= local69;
					}
				}
			} else {
				for (local133 = arg3; local133 <= arg0; local133++) {
					Static186.anIntArrayArray12[local67][local133] = arg2;
					local113 += local108;
					if (local113 > 0) {
						local67 += local124;
						local113 -= local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZII[B)[B")
	public static byte[] method6775(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static679.method4129(arg1, arg0, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
	public static void method6776() {
		for (@Pc(10) Class2_Sub18 local10 = (Class2_Sub18) Static284.aClass335_14.method8358(); local10 != null; local10 = (Class2_Sub18) Static284.aClass335_14.method8355()) {
			if (local10.aClass78_Sub1_1.method1993()) {
				Static274.method4661(local10.anInt1619);
			} else {
				local10.aClass78_Sub1_1.method2009();
				try {
					local10.aClass78_Sub1_1.method2007();
				} catch (@Pc(35) Exception local35) {
					Static165.method3319(local35, "TV: " + local10.anInt1619);
					Static274.method4661(local10.anInt1619);
				}
				if (!local10.aBoolean113 && !local10.aBoolean110) {
					@Pc(61) Class2_Sub7_Sub3 local61 = local10.aClass78_Sub1_1.method2004();
					if (local61 != null) {
						@Pc(67) Class2_Sub26_Sub2 local67 = local61.method4464();
						if (local67 != null) {
							local67.method3382(local10.anInt1621);
							Static270.aClass2_Sub26_Sub4_2.method7391(local67);
							local10.aBoolean113 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)V")
	public static void method6778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static353.method6087(local7.aClass15_Sub3_Sub5_1);
			if (local7.aClass15_Sub3_Sub5_1 != null) {
				local7.aClass15_Sub3_Sub5_1 = null;
			}
		}
	}
}
