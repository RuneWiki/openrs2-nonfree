import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "Lclient!od;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_40 = new Class7("M", "M", "M", "M");

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	public static int anInt1741 = -1;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_15 = new Class181();

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Z")
	public static boolean aBoolean102 = true;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ad;B)I")
	public static int method1517(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(15) String local15 = Static74.method1493(arg0);
		@Pc(17) int[] local17 = null;
		if (Static423.method5615(arg0.anInt117)) {
			local17 = Static165.aClass19_1.method560((int) arg0.aLong10).anIntArray340;
		} else if (arg0.anInt120 != -1) {
			local17 = Static165.aClass19_1.method560(arg0.anInt120).anIntArray340;
		} else if (Static112.method2066(arg0.anInt117)) {
			@Pc(82) Class31_Sub2_Sub1_Sub2 local82 = Static98.aClass31_Sub2_Sub1_Sub2Array1[(int) arg0.aLong10];
			if (local82 != null) {
				@Pc(87) Class53 local87 = local82.aClass53_1;
				if (local87.anIntArray131 != null) {
					local87 = local87.method1508(Static394.aClass23_1);
				}
				if (local87 != null) {
					local17 = local87.anIntArray132;
				}
			}
		} else if (Static262.method3883(arg0.anInt117)) {
			@Pc(54) Class129 local54;
			if (arg0.anInt117 == 1004) {
				local54 = Static349.aClass115_4.method2766((int) arg0.aLong10);
			} else {
				local54 = Static349.aClass115_4.method2766((int) (arg0.aLong10 >>> 32 & 0x7FFFFFFFL));
			}
			if (local54.anIntArray310 != null) {
				local54 = local54.method3031(Static394.aClass23_1);
			}
			if (local54 != null) {
				local17 = local54.anIntArray308;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static254.method3806(local17);
		}
		@Pc(136) int local136 = Static3.aClass151_6.method3471(local15, Static212.aClass143Array6);
		if (arg0.aBoolean6) {
			local136 += Static57.aClass143_9.la() + 4;
		}
		return local136;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
	public static void method1518() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static195.anInt3537; local7++) {
			for (@Pc(15) int local15 = 0; local15 < Static118.anInt2419; local15++) {
				if (Static400.method5338(true, local5, client.lb, local15, local7)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([I[I[BI[[BII[[B)I")
	public static int method1519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(14) int local14 = arg0[arg5];
		@Pc(20) int local20 = local14 + arg1[arg5];
		@Pc(24) int local24 = arg0[arg3];
		@Pc(30) int local30 = arg1[arg3] + local24;
		@Pc(32) int local32 = local14;
		if (local14 < local24) {
			local32 = local24;
		}
		@Pc(39) int local39 = local20;
		if (local30 < local20) {
			local39 = local30;
		}
		@Pc(50) int local50 = arg2[arg5] & 0xFF;
		if (local50 > (arg2[arg3] & 0xFF)) {
			local50 = arg2[arg3] & 0xFF;
		}
		@Pc(71) byte[] local71 = arg6[arg5];
		@Pc(75) byte[] local75 = arg4[arg3];
		@Pc(80) int local80 = local32 - local14;
		@Pc(84) int local84 = local32 - local24;
		for (@Pc(86) int local86 = local32; local86 < local39; local86++) {
			@Pc(97) int local97 = local71[local80++] + local75[local84++];
			if (local50 > local97) {
				local50 = local97;
			}
		}
		return -local50;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[IZILclient!kd;)Lclient!oi;")
	public static Class3_Sub2_Sub1 method1520(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class39_Sub2 arg3) {
		if (arg3.aBoolean237 || Static400.method5337(arg2) && Static400.method5337(arg0)) {
			return new Class3_Sub2_Sub1(arg3, 3553, arg2, arg0, false, arg1);
		} else if (arg3.aBoolean229) {
			return new Class3_Sub2_Sub1(arg3, 34037, arg2, arg0, false, arg1);
		} else {
			return new Class3_Sub2_Sub1(arg3, arg2, arg0, Static406.method5434(arg2), Static406.method5434(arg0), arg1);
		}
	}
}
