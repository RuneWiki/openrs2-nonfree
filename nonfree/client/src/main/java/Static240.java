import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public static int anInt4810;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!dj;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	public static int anInt4808 = -1;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!kg;)V")
	public static void method4141(@OriginalArg(1) Class5_Sub4_Sub4_Sub1 arg0) {
		@Pc(16) Class3_Sub12 local16 = (Class3_Sub12) Static41.aClass24_2.method609((long) arg0.anInt4946);
		if (local16 == null) {
			return;
		}
		if (local16.aClass3_Sub2_Sub3_2 != null) {
			Static273.aClass3_Sub2_Sub2_2.method1367(local16.aClass3_Sub2_Sub3_2);
			local16.aClass3_Sub2_Sub3_2 = null;
		}
		local16.method5717();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBZIIII)V")
	public static void method4142(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static145.anInt2900 = arg3;
		Static158.anInt3055 = arg4;
		Static156.anInt3023 = arg0;
		Static256.anInt5088 = arg5;
		Static210.anInt4316 = arg2;
		if (arg1 && Static145.anInt2900 >= 100) {
			Static210.anInt4317 = Static158.anInt3055 * 128 + 64;
			Static110.anInt2324 = Static156.anInt3023 * 128 + 64;
			Static175.anInt3631 = Static286.method4919(Static110.anInt2324, Static210.anInt4317, Static163.anInt3184) - Static256.anInt5088;
		}
		Static261.anInt5200 = 2;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIZIIIIII)Z")
	public static boolean method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static319.method5267(arg0, arg4, arg9, arg1, Static76.anIntArray94, Static308.anIntArray508, arg6, arg7, arg8, arg2, Static349.aClass5_Sub4_Sub4_Sub1_2.method4208(), arg5, arg3, Static34.aClass13Array1[Static163.anInt3184]);
		if (local24 < 1) {
			return false;
		}
		Static154.anInt6365 = Static76.anIntArray94[local24 - 1];
		Static355.anInt6865 = Static308.anIntArray508[local24 - 1];
		Static312.aBoolean427 = false;
		Static354.method5737();
		return true;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILclient!tj;Lclient!m;I)V")
	public static void method4144(@OriginalArg(2) Class122 arg0, @OriginalArg(3) Class127 arg1) {
		Static293.aClass127_40.method3401();
		if (Static118.aBoolean140) {
			return;
		}
		for (@Pc(20) Class3_Sub5 local20 = (Class3_Sub5) arg1.method3402(); local20 != null; local20 = (Class3_Sub5) arg1.method3400()) {
			@Pc(27) Class211 local27 = Static136.method2268(local20.anInt544);
			if (Static22.method433(local27)) {
				@Pc(41) boolean local41 = Static171.method2845(arg0, local20, local27);
				if (local41) {
					Static83.method1303(local27, local20, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public static void method4147() {
		if (Static46.aFloat2 < 1024.0F) {
			Static46.aFloat2 = 1024.0F;
		}
		if (Static46.aFloat2 > 3072.0F) {
			Static46.aFloat2 = 3072.0F;
		}
		while (Static57.aFloat3 >= 16384.0F) {
			Static57.aFloat3 -= 16384.0F;
		}
		while (Static57.aFloat3 < 0.0F) {
			Static57.aFloat3 += 16384.0F;
		}
		@Pc(46) int local46 = Static298.anInt5943 >> 7;
		@Pc(50) int local50 = Static56.anInt1230 >> 7;
		@Pc(56) int local56 = Static286.method4919(Static298.anInt5943, Static56.anInt1230, Static163.anInt3184);
		@Pc(58) int local58 = 0;
		@Pc(80) int local80;
		if (local46 > 3 && local50 > 3 && local46 < 100 && local50 < 100) {
			for (local80 = local46 - 4; local80 <= local46 + 4; local80++) {
				for (@Pc(86) int local86 = local50 - 4; local86 <= local50 + 4; local86++) {
					@Pc(90) int local90 = Static163.anInt3184;
					if (local90 < 3 && Static116.method2027(local86, local80)) {
						local90++;
					}
					@Pc(101) int local101 = 0;
					if (Static72.aByteArrayArrayArray1 != null && Static72.aByteArrayArrayArray1[local90] != null) {
						local101 = (Static72.aByteArrayArrayArray1[local90][local80][local86] & 0xFF) * 8;
					}
					@Pc(130) int local130 = local101 + local56 - Static69.aClass22Array1[local90].method4672(local80, local86);
					if (local130 > local58) {
						local58 = local130;
					}
				}
			}
		}
		local80 = local58 * 1536;
		if (local80 > 786432) {
			local80 = 786432;
		}
		if (local80 < 262144) {
			local80 = 262144;
		}
		if (local80 > Static220.anInt4544) {
			Static220.anInt4544 += (local80 - Static220.anInt4544) / 24;
		} else if (local80 < Static220.anInt4544) {
			Static220.anInt4544 += (local80 - Static220.anInt4544) / 80;
			return;
		}
	}
}
