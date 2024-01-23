import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "Lclient!wb;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_3;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
	public static int anInt1553 = 0;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)Lclient!oj;")
	public static Class124 method1289(@OriginalArg(0) int arg0) {
		@Pc(10) Class124 local10 = (Class124) Static161.aClass172_29.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static42.aClass22_21.method665(31, arg0);
		local10 = new Class124();
		if (local25 != null) {
			local10.method3205(new Class4_Sub24(local25), arg0);
		}
		Static161.aClass172_29.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)[Lclient!ta;")
	public static Class58_Sub2[] method1290() {
		@Pc(14) Class58_Sub2[] local14 = new Class58_Sub2[Static150.anInt2948];
		for (@Pc(16) int local16 = 0; local16 < Static150.anInt2948; local16++) {
			local14[local16] = new Class58_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[local16], Static278.anIntArray422[local16], Static107.anIntArray188[local16], Static246.anIntArray386[local16], Static99.aByteArrayArray8[local16], Static138.anIntArray228);
		}
		Static184.method2969();
		return local14;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!cg;[Lclient!n;Z)V")
	public static void method1292(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class4_Sub2_Sub4_Sub2[] arg1) {
		Static126.aClass4_Sub2_Sub4_Sub2Array2 = arg1;
		Static245.aClass22_82 = arg0;
		Static213.aBooleanArray29 = new boolean[Static126.aClass4_Sub2_Sub4_Sub2Array2.length];
		Static154.aClass163_23.method4190();
		@Pc(21) int local21 = Static245.aClass22_82.method661("details");
		@Pc(26) int[] local26 = Static245.aClass22_82.method654(local21);
		for (@Pc(32) int local32 = 0; local32 < local26.length; local32++) {
			Static154.aClass163_23.method4181((long) local26[local32], Static15.method276(local26[local32], new Class4_Sub24(Static245.aClass22_82.method665(local21, local26[local32]))));
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZII)I")
	public static int method1293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = Static283.anIntArray441[Static18.method411(arg0, arg1)];
		if (arg2 > 0) {
			@Pc(27) int local27 = Static283.anInterface1_1.method2438(arg2 & 0xFFFF);
			@Pc(35) int local35;
			@Pc(64) int local64;
			if (local27 != 0) {
				if (arg1 < 0) {
					local35 = 0;
				} else if (arg1 <= 127) {
					local35 = arg1 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local27 == 256) {
					local16 = local35;
				} else {
					local64 = 256 - local27;
					local16 = ((local16 & 0xFF00) * local64 + local27 * (local35 & 0xFF00) & 0xFF0000) + ((local35 & 0xFF00FF) * local27 + (local64 * (local16 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local35 = Static283.anInterface1_1.method2425(arg2 & 0xFFFF);
			if (local35 != 0) {
				local35 += 256;
				@Pc(116) int local116 = (local16 >> 16 & 0xFF) * local35;
				if (local116 > 65535) {
					local116 = 65535;
				}
				@Pc(130) int local130 = local35 * (local16 & 0xFF);
				if (local130 > 65535) {
					local130 = 65535;
				}
				local64 = local35 * (local16 >> 8 & 0xFF);
				if (local64 > 65535) {
					local64 = 65535;
				}
				local16 = (local64 & 0xFF00) + (((local116 & 0x8C00FF00) << 8) + (local130 >> 8));
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V")
	public static void method1295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static173.anInt3481 <= arg4 && arg3 <= Static121.anInt2460 && arg2 >= Static293.anInt5688 && arg5 <= Static100.anInt1982) {
			if (arg0 == 1) {
				Static170.method2692(arg1, arg4, arg5, arg3, arg2);
			} else {
				Static120.method2501(arg3, arg1, arg0, arg5, arg4, arg2);
			}
		} else if (arg0 == 1) {
			Static298.method4222(arg5, arg4, arg3, arg1, arg2);
		} else {
			Static23.method528(arg2, arg3, arg5, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!cg;)V")
	public static void method1296(@OriginalArg(1) Class22 arg0) {
		Static245.aClass22_83 = arg0;
	}
}
