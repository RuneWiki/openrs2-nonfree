import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Lclient!tj;")
	public static Class193 aClass193_45;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Lclient!tj;")
	public static Class193 aClass193_46;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_157 = new Class159("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)V")
	public static void method2667(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 4);
		local8.method4902();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!bk;Ljava/awt/Canvas;BLclient!ml;I)Lclient!vq;")
	public static synchronized Class47 method2669(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class134 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static291.aBooleanArray25[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(49) Class47 local49;
		if (arg0 == 0) {
			local49 = Static191.method3630(arg2, arg1, local7);
		} else if (arg0 == 1) {
			local49 = Static274.method4697(local7, arg1, arg3, arg2, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static291.aBooleanArray25[local7] = true;
		return local49;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILclient!br;I)V")
	public static void method2688(@OriginalArg(1) int arg0, @OriginalArg(2) Class21 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte13 == 0) {
			arg1.anInt709 = arg1.anInt743;
		} else if (arg1.aByte13 == 1) {
			arg1.anInt709 = arg1.anInt743 + (arg2 - arg1.anInt740) / 2;
		} else if (arg1.aByte13 == 2) {
			arg1.anInt709 = arg2 - arg1.anInt740 - arg1.anInt743;
		} else if (arg1.aByte13 == 3) {
			arg1.anInt709 = arg2 * arg1.anInt743 >> 14;
		} else if (arg1.aByte13 == 4) {
			arg1.anInt709 = (arg2 - arg1.anInt740) / 2 + (arg2 * arg1.anInt743 >> 14);
		} else {
			arg1.anInt709 = arg2 - arg1.anInt740 - (arg2 * arg1.anInt743 >> 14);
		}
		if (arg1.aByte10 == 0) {
			arg1.anInt712 = arg1.anInt786;
		} else if (arg1.aByte10 == 1) {
			arg1.anInt712 = arg1.anInt786 + (arg0 - arg1.anInt758) / 2;
		} else if (arg1.aByte10 == 2) {
			arg1.anInt712 = arg0 - arg1.anInt758 - arg1.anInt786;
		} else if (arg1.aByte10 == 3) {
			arg1.anInt712 = arg1.anInt786 * arg0 >> 14;
		} else if (arg1.aByte10 == 4) {
			arg1.anInt712 = (arg0 * arg1.anInt786 >> 14) + (arg0 - arg1.anInt758) / 2;
		} else {
			arg1.anInt712 = arg0 - (arg0 * arg1.anInt786 >> 14) - arg1.anInt758;
		}
		if (!Static189.aBoolean306 || Static44.method877(arg1).anInt1386 == 0 && arg1.anInt722 != 0) {
			return;
		}
		if (arg1.anInt709 < 0) {
			arg1.anInt709 = 0;
		} else if (arg1.anInt740 + arg1.anInt709 > arg2) {
			arg1.anInt709 = arg2 - arg1.anInt740;
		}
		if (arg1.anInt712 < 0) {
			arg1.anInt712 = 0;
		} else if (arg1.anInt712 + arg1.anInt758 > arg0) {
			arg1.anInt712 = arg0 - arg1.anInt758;
		}
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)Lclient!cf;")
	public static Class28 method2698(@OriginalArg(0) int arg0) {
		@Pc(5) Class198 local5 = Static203.aClass198_153;
		@Pc(14) Class28 local14;
		synchronized (Static203.aClass198_153) {
			local14 = (Class28) Static203.aClass198_153.method5210((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static259.aClass193_91.method5047(Static324.method5265(arg0), Static56.method1200(arg0));
		local14 = new Class28();
		if (local34 != null) {
			local14.method755(new Class4_Sub11(local34));
		}
		@Pc(49) Class198 local49 = Static203.aClass198_153;
		synchronized (Static203.aClass198_153) {
			Static203.aClass198_153.method5201(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[J[III)V")
	public static void method2721(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg2) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local21;
		@Pc(35) int local35 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg2; local47++) {
			if (arg0[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(64) long local64 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local64;
				@Pc(78) int local78 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local78;
			}
		}
		arg0[arg2] = arg0[local17];
		arg0[local17] = local21;
		arg1[arg2] = arg1[local17];
		arg1[local17] = local35;
		method2721(arg0, arg1, local17 - 1, arg3);
		method2721(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V")
	public static void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class28 local7 = method2698(arg1);
		@Pc(10) int local10 = local7.anInt1023;
		@Pc(13) int local13 = local7.anInt1017;
		@Pc(16) int local16 = local7.anInt1022;
		@Pc(23) int local23 = Class187.anIntArray458[local16 - local13];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static57.method1205(arg0 << local13 & local23 | Static328.anIntArray485[local10] & ~local23, local10);
	}
}
