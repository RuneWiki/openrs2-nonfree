import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "Lclient!lc;")
	public static Class98 aClass98_132;

	@OriginalMember(owner = "client!r", name = "lb", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_7;

	@OriginalMember(owner = "client!r", name = "K", descriptor = "I")
	public static int anInt4407 = 0;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString142 = "Allocating memory";

	@OriginalMember(owner = "client!r", name = "db", descriptor = "[Z")
	public static boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "[S")
	public static short[] aShortArray73 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!r", name = "ib", descriptor = "Ljava/lang/String;")
	public static String aString143 = null;

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "Lclient!dh;")
	public static Class33 aClass33_33 = new Class33(260);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)I")
	public static int method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(9) int local9 = arg3;
			arg3 = arg2;
			arg2 = local9;
		}
		@Pc(17) int local17 = arg1 & 0x3;
		if (local17 == 0) {
			return arg4;
		} else if (local17 == 1) {
			return arg5;
		} else if (local17 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return 7 + 1 - arg5 - arg2;
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)[Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1[] method3555() {
		@Pc(4) Class4_Sub2_Sub1_Sub1[] local4 = new Class4_Sub2_Sub1_Sub1[Static84.anInt1699];
		for (@Pc(6) int local6 = 0; local6 < Static84.anInt1699; local6++) {
			@Pc(21) int local21 = Static46.anIntArray120[local6] * Static159.anIntArray285[local6];
			@Pc(25) byte[] local25 = Static274.aByteArrayArray20[local6];
			@Pc(28) int[] local28 = new int[local21];
			for (@Pc(30) int local30 = 0; local30 < local21; local30++) {
				local28[local30] = Static6.anIntArray14[local25[local30] & 0xFF];
			}
			local4[local6] = new Class4_Sub2_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local6], Static100.anIntArray223[local6], Static159.anIntArray285[local6], Static46.anIntArray120[local6], local28);
		}
		Static268.method4006();
		return local4;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	public static void method3557() {
		aClass4_Sub2_Sub1_7 = null;
		aShortArray73 = null;
		aString142 = null;
		aClass33_33 = null;
		aString143 = null;
		aClass98_132 = null;
		aBooleanArray20 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI[B)I")
	public static int method3558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = -1;
		for (@Pc(16) int local16 = arg0; local16 < arg1; local16++) {
			local10 = local10 >>> 8 ^ Class4_Sub2_Sub4_Sub1.anIntArray194[(local10 ^ arg2[local16]) & 0xFF];
		}
		return ~local10;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Z")
	public static boolean method3559(@OriginalArg(0) int arg0) {
		if (Static257.aBooleanArray24[arg0]) {
			return true;
		} else if (aClass98_132.method2386(arg0)) {
			@Pc(26) int local26 = aClass98_132.method2394(arg0);
			if (local26 == 0) {
				Static257.aBooleanArray24[arg0] = true;
				return true;
			}
			if (Static148.aClass22ArrayArray1[arg0] == null) {
				Static148.aClass22ArrayArray1[arg0] = new Class22[local26];
			}
			for (@Pc(49) int local49 = 0; local49 < local26; local49++) {
				if (Static148.aClass22ArrayArray1[arg0][local49] == null) {
					@Pc(76) byte[] local76 = aClass98_132.method2396(local49, arg0);
					if (local76 != null) {
						@Pc(88) Class22 local88 = Static148.aClass22ArrayArray1[arg0][local49] = new Class22();
						local88.anInt596 = (arg0 << 16) + local49;
						if (local76[0] == -1) {
							local88.method459(new Class4_Sub17(local76));
						} else {
							local88.method471(new Class4_Sub17(local76));
						}
					}
				}
			}
			Static257.aBooleanArray24[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZLclient!p;)Lclient!gg;")
	public static Class4_Sub2_Sub9 method3560(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		@Pc(31) Class4_Sub2_Sub9 local31 = new Class4_Sub2_Sub9(arg0, arg1.method1841(), arg1.method1841(), arg1.method1889(), arg1.method1889(), arg1.method1874() == 1, arg1.method1874());
		@Pc(39) int local39 = arg1.method1874();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			local31.aClass10_18.method184(new Class4_Sub21(arg1.method1874(), arg1.method1874(), arg1.method1837(), arg1.method1837(), arg1.method1837(), arg1.method1837(), arg1.method1837(), arg1.method1837(), arg1.method1837(), arg1.method1837()));
		}
		local31.method1418();
		return local31;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public static void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static27.anInt1299 = arg4;
		Static156.anInt3144 = arg0;
		Static90.anInt1865 = arg2;
		Static102.anInt2164 = arg1;
		Static71.anInt1318 = arg3;
	}
}
