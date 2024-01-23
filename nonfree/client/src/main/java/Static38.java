import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!db", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "Lclient!qe;")
	public static Class78 aClass78_128 = Static199.method3560("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_130 = Static199.method3560(":tradereq:");

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_131 = Static199.method3560("::fpson");

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_132 = Static199.method3560("<col=00ffff>");

	@OriginalMember(owner = "client!db", name = "db", descriptor = "[Lclient!uc;")
	public static Class100[] aClass100Array2 = new Class100[5000];

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	public static int anInt715 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	public static void method507() {
		if (!Static125.aBoolean60) {
			return;
		}
		@Pc(16) Class64 local16 = Static3.method79(Static170.anInt3942, Static43.anInt794);
		if (local16 != null && local16.anObjectArray14 != null) {
			@Pc(25) Class2_Sub1 local25 = new Class2_Sub1();
			local25.aClass64_1 = local16;
			local25.anObjectArray1 = local16.anObjectArray14;
			Static50.method649(local25);
		}
		Static125.aBoolean60 = false;
		Static70.method2259(local16);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub25 local7 = null;
		for (@Pc(12) Class2_Sub25 local12 = (Class2_Sub25) Static165.aClass44_44.method1359(); local12 != null; local12 = (Class2_Sub25) Static165.aClass44_44.method1356()) {
			if (local12.anInt3269 == arg2 && arg6 == local12.anInt3279 && local12.anInt3270 == arg0 && local12.anInt3277 == arg7) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub25();
			local7.anInt3270 = arg0;
			local7.anInt3279 = arg6;
			local7.anInt3277 = arg7;
			local7.anInt3269 = arg2;
			Static142.method2535(local7);
			Static165.aClass44_44.method1355(local7);
		}
		local7.anInt3276 = arg4;
		local7.anInt3281 = arg8;
		local7.anInt3280 = arg3;
		local7.anInt3271 = arg1;
		local7.anInt3272 = arg5;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!qe;)Z")
	public static boolean method510(@OriginalArg(1) Class78 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static140.anInt3196; local14++) {
			if (arg0.method3038(Static159.aClass78Array31[local14])) {
				return true;
			}
		}
		return arg0.method3038(Static31.aClass5_Sub2_Sub2_1.aClass78_423);
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
	public static int method511() {
		return 2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lclient!f;")
	public static Class2_Sub3_Sub6 method517(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub6 local10 = (Class2_Sub3_Sub6) Static171.aClass110_18.method3891((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static97.aClass72_Sub1_19.method3197(0, arg0);
		if (local20 == null) {
			return null;
		}
		local10 = new Class2_Sub3_Sub6();
		@Pc(33) Class2_Sub23 local33 = new Class2_Sub23(local20);
		local33.anInt2703 = local33.aByteArray41.length - 2;
		@Pc(44) int local44 = local33.method2095();
		@Pc(55) int local55 = local33.aByteArray41.length - local44 - 2 - 12;
		local33.anInt2703 = local55;
		@Pc(62) int local62 = local33.method2133();
		local10.anInt1019 = local33.method2095();
		local10.anInt1020 = local33.method2095();
		local10.anInt1018 = local33.method2095();
		local10.anInt1017 = local33.method2095();
		@Pc(93) int local93 = local33.method2122();
		@Pc(104) int local104;
		@Pc(109) int local109;
		if (local93 > 0) {
			local10.aClass103Array1 = new Class103[local93];
			for (local104 = 0; local104 < local93; local104++) {
				local109 = local33.method2095();
				@Pc(116) Class103 local116 = new Class103(Static185.method3424(local109));
				local10.aClass103Array1[local104] = local116;
				while (local109-- > 0) {
					@Pc(126) int local126 = local33.method2133();
					@Pc(130) int local130 = local33.method2133();
					local116.method3665((long) local126, new Class2_Sub7(local130));
				}
			}
		}
		local104 = 0;
		local33.anInt2703 = 0;
		local10.aClass78_197 = local33.method2088();
		local10.anIntArray167 = new int[local62];
		local10.aClass78Array8 = new Class78[local62];
		local10.anIntArray166 = new int[local62];
		while (local55 > local33.anInt2703) {
			local109 = local33.method2095();
			if (local109 == 3) {
				local10.aClass78Array8[local104] = local33.method2115();
			} else if (local109 >= 100 || local109 == 21 || local109 == 38 || local109 == 39) {
				local10.anIntArray166[local104] = local33.method2122();
			} else {
				local10.anIntArray166[local104] = local33.method2133();
			}
			local10.anIntArray167[local104++] = local109;
		}
		Static171.aClass110_18.method3894(local10, (long) arg0);
		return local10;
	}
}
