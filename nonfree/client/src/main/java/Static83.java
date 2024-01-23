import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "[[B")
	public static byte[][] aByteArrayArray42 = new byte[50][];

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString91 = "flash2:";

	@OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
	public static int anInt1889 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!jd;Lclient!jd;Lclient!jd;Lclient!jd;)V")
	public static void method1593(@OriginalArg(1) Class84 arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) Class84 arg3) {
		Static5.aClass84_3 = arg3;
		Static277.aClass84_118 = arg1;
		Static198.aClass84_84 = arg0;
		Static225.aClass84_102 = arg2;
		Static219.aClass115ArrayArray1 = new Class115[Static277.aClass84_118.method2118()][];
		Static116.aBooleanArray12 = new boolean[Static277.aClass84_118.method2118()];
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)I")
	public static int method1594(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 > local14) {
			local32 = local23;
		}
		@Pc(40) double local40 = local14;
		if (local32 < local30) {
			local32 = local30;
		}
		if (local23 < local14) {
			local40 = local23;
		}
		if (local40 > local30) {
			local40 = local30;
		}
		@Pc(63) double local63 = 0.0D;
		@Pc(65) double local65 = 0.0D;
		@Pc(71) double local71 = (local40 + local32) / 2.0D;
		if (local32 != local40) {
			if (local14 == local32) {
				local63 = (local23 - local30) / (local32 - local40);
			} else if (local32 == local23) {
				local63 = (local30 - local14) / (local32 - local40) + 2.0D;
			} else if (local32 == local30) {
				local63 = (local14 - local23) / (local32 - local40) + 4.0D;
			}
			if (local71 < 0.5D) {
				local65 = (local32 - local40) / (local32 + local40);
			}
			if (local71 >= 0.5D) {
				local65 = (local32 - local40) / (2.0D - local40 - local32);
			}
		}
		@Pc(159) int local159 = (int) (local65 * 256.0D);
		local63 /= 6.0D;
		if (local159 < 0) {
			local159 = 0;
		} else if (local159 > 255) {
			local159 = 255;
		}
		@Pc(194) int local194 = (int) (local63 * 256.0D);
		@Pc(199) int local199 = (int) (local71 * 256.0D);
		if (local199 < 0) {
			local199 = 0;
		} else if (local199 > 255) {
			local199 = 255;
		}
		if (local199 > 243) {
			local159 >>= 0x4;
		} else if (local199 > 217) {
			local159 >>= 0x3;
		} else if (local199 > 192) {
			local159 >>= 0x2;
		} else if (local199 > 179) {
			local159 >>= 0x1;
		}
		return (local199 >> 1) + (local194 >> 2 << 10) + (local159 >> 5 << 7);
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Lclient!hk;")
	public static Class71_Sub1 method1595() {
		@Pc(25) Class71_Sub1 local25 = new Class71_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], Static273.aByteArrayArray115[0], Static187.anIntArray314);
		Static171.method2953();
		return local25;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1596(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static151.anInt3192; local16++) {
			if (arg0.equalsIgnoreCase(Static56.aStringArray5[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!kk;III)V")
	public static void method1597(@OriginalArg(0) Class36_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt5087 && arg2 != -1) {
			@Pc(73) Class15 local73 = Static35.method706(arg2);
			@Pc(76) int local76 = local73.anInt428;
			if (local76 == 1) {
				arg0.anInt5070 = arg1;
				arg0.anInt5103 = 0;
				arg0.anInt5071 = 1;
				arg0.anInt5081 = 0;
				arg0.anInt5106 = 0;
				Static225.method3777(arg0.anInt5106, false, arg0.anInt5109, local73, arg0.anInt5093);
			}
			if (local76 == 2) {
				arg0.anInt5103 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt5087 == -1 || Static35.method706(arg2).anInt413 >= Static35.method706(arg0.anInt5087).anInt413) {
			arg0.anInt5087 = arg2;
			arg0.anInt5106 = 0;
			arg0.anInt5070 = arg1;
			arg0.anInt5077 = arg0.anInt5096;
			arg0.anInt5071 = 1;
			arg0.anInt5103 = 0;
			arg0.anInt5081 = 0;
			if (arg0.anInt5087 != -1) {
				Static225.method3777(arg0.anInt5106, false, arg0.anInt5109, Static35.method706(arg0.anInt5087), arg0.anInt5093);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static95.aClass2_Sub26_Sub1_1.method4287(147);
		Static95.aClass2_Sub26_Sub1_1.method4218(Static61.method2447(arg1));
		Static95.aClass2_Sub26_Sub1_1.method4234(arg0);
	}
}
