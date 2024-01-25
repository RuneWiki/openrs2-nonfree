import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!sr", name = "L", descriptor = "I")
	public static int anInt6136;

	@OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
	public static int anInt6138;

	@OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
	public static int anInt6137 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)Lclient!ki;")
	public static Class140 method4925(@OriginalArg(1) int arg0) {
		@Pc(16) Class140 local16 = (Class140) Static461.aClass77_64.method1387((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static18.aClass185_67.method4002(1, arg0);
		local16 = new Class140();
		local16.anInt3960 = arg0;
		if (local26 != null) {
			local16.method3086(new Class1_Sub19(local26));
		}
		local16.method3091();
		if (local16.anInt3962 == 2 && Static29.aClass208_2.method4405((long) arg0) == null) {
			Static29.aClass208_2.method4413((long) arg0, new Class1_Sub18(Static33.anInt501));
			Static396.aClass140Array1[Static33.anInt501++] = local16;
		}
		Static461.aClass77_64.method1396(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(III)I")
	public static int method4926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4927(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (local17 << 5) + arg0.charAt(local19) - local17;
		}
		return local17;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIILclient!za;II)Lclient!e;")
	public static Class8 method4928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class117 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(17) Class8 local17 = (Class8) Static282.aClass77_36.method1387(local6);
		if (local17 == null) {
			@Pc(27) Class147 local27 = Static135.method1728(Static412.aClass185_111, arg1);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt4181 < 13) {
				local27.method3306();
			}
			local17 = arg3.method5678(local27, 2055, Static85.anInt6282, 64, 768);
			Static282.aClass77_36.method1396(local17, local6);
		}
		local17 = local17.method5983((byte) 2, 2055, true);
		if (arg2 != 0) {
			local17.ma(arg2);
		}
		if (arg0 != 0) {
			local17.W(arg0);
		}
		if (arg5 != 0) {
			local17.K(arg5);
		}
		if (arg4 != 0) {
			local17.a(0, arg4, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public static void method4929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static40.anInt598 == 1) {
			Static273.aClass85Array8[Static344.anInt5674 / 100].method5406(Static101.anInt1354 - 8, Static294.anInt4897 - 8);
		}
		if (Static40.anInt598 == 2) {
			Static273.aClass85Array8[Static344.anInt5674 / 100 + 4].method5406(Static101.anInt1354 - 8, Static294.anInt4897 - 8);
		}
		Static35.method490();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!hm;I)V")
	public static void method4930(@OriginalArg(0) Class107 arg0) {
		if (arg0.anInt2588 != Static455.anInt7244) {
			return;
		}
		if (Static94.aClass11_Sub1_Sub3_Sub2_1.aString32 == null) {
			arg0.anInt2596 = 0;
			arg0.anInt2652 = 0;
			return;
		}
		arg0.anInt2599 = 150;
		arg0.anInt2659 = (int) (Math.sin((double) Static98.anInt1304 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2615 = 5;
		arg0.anInt2596 = Static220.anInt4038;
		arg0.anInt2652 = method4927(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32);
		arg0.anInt2662 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3307;
		arg0.anInt2647 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3317;
		arg0.anInt2590 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3298;
		arg0.anInt2619 = 0;
	}
}
