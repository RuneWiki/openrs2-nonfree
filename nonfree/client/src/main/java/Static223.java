import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
	public static int anInt3720 = 0;

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_4 = new Class163(11, 17);

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
	public static int anInt3726 = -1;

	@OriginalMember(owner = "client!kp", name = "R", descriptor = "[I")
	public static final int[] anIntArray233 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!ae;Lclient!cl;Lclient!za;)V")
	public static void method2945(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class5_Sub8 arg1, @OriginalArg(3) Class200 arg2) {
		@Pc(10) Class49 local10 = arg0.method89(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.YA();
		if (local16 < local10.ZA()) {
			local16 = local10.ZA();
		}
		@Pc(46) int local46 = arg1.anInt950;
		@Pc(49) int local49 = arg1.anInt952;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(69) int local69;
		@Pc(92) int local92;
		if (arg0.aString1 != null) {
			local51 = Static113.aClass14_5.method278(null, null, arg0.aString1, Static427.aStringArray45);
			for (local69 = 0; local69 < local51; local69++) {
				@Pc(75) String local75 = Static427.aStringArray45[local69];
				if (local69 < local51 - 1) {
					local75 = local75.substring(0, local75.length() - 4);
				}
				local92 = Static26.aClass269_8.method5961(local75);
				if (local92 > local53) {
					local53 = local92;
				}
			}
			local55 = Static26.aClass269_8.method5960() * local51 + Static26.aClass269_8.method5958() / 2;
		}
		local69 = local16 / 2 + arg1.anInt950;
		if (local46 < local16 + Static98.anInt3327) {
			local46 = Static98.anInt3327;
			local69 = local16 / 2 + Static98.anInt3327 + local53 / 2 + 5 + 10;
		} else if (Static98.anInt3329 - local16 < local46) {
			local46 = Static98.anInt3329 - local16;
			local69 = Static98.anInt3329 - local53 / 2 - local16 / 2 - 5 - 10;
		}
		@Pc(180) int local180 = arg1.anInt952;
		if (local49 < local16 + Static98.anInt3335) {
			local49 = Static98.anInt3335;
			local180 = local16 / 2 + Static98.anInt3335 + 10;
		} else if (Static98.anInt3337 - local16 < local49) {
			local180 = Static98.anInt3337 - local55 - local16 / 2 - 10;
			local49 = Static98.anInt3337 - local16;
		}
		local92 = (int) (Math.atan2((double) (local46 - arg1.anInt950), (double) (local49 - arg1.anInt952)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5786((float) local46 + (float) local16 / 2.0F, (float) local49 + (float) local16 / 2.0F, 4096, local92);
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg0.aString1 != null) {
			local263 = local69 - local53 / 2 - 5;
			local265 = local180;
			local267 = local263 + local53 + 10;
			local269 = local180 + local51 * Static26.aClass269_8.method5960() + 3;
			if (arg0.anInt126 != 0) {
				arg2.method5856(local180, arg0.anInt126, local267 - local263, -local180 + local269, local263);
			}
			if (arg0.anInt109 != 0) {
				arg2.method5857(local263, local180, local267 - local263, -local180 + local269, arg0.anInt109);
			}
			for (@Pc(341) int local341 = 0; local341 < local51; local341++) {
				@Pc(347) String local347 = Static427.aStringArray45[local341];
				if (local341 < local51 - 1) {
					local347 = local347.substring(0, local347.length() - 4);
				}
				Static26.aClass269_8.method5956(arg2, local347, local69, local180, arg0.anInt98);
				local180 += Static26.aClass269_8.method5960();
			}
		}
		if (arg0.anInt102 == -1 && arg0.aString1 == null) {
			return;
		}
		@Pc(391) Class5_Sub29 local391 = new Class5_Sub29(arg1);
		local16 >>= 0x1;
		local391.anInt4539 = local49 - local16;
		local391.anInt4542 = local46 - local16;
		local391.anInt4543 = local269;
		local391.anInt4546 = local49 + local16;
		local391.anInt4541 = local267;
		local391.anInt4547 = local46 + local16;
		local391.anInt4540 = local265;
		local391.anInt4544 = local263;
		Static382.aClass177_35.method3615(local391);
	}

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)I")
	public static int method2946() {
		@Pc(10) Class44 local10 = Static200.aClass44_32;
		synchronized (Static200.aClass44_32) {
			return Static200.aClass44_32.method1030();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method2948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static3.anInt45 <= arg2 && Static112.anInt1900 >= arg2 && Static3.anInt45 <= arg7 && arg7 <= Static112.anInt1900 && Static3.anInt45 <= arg3 && arg3 <= Static112.anInt1900 && Static3.anInt45 <= arg8 && Static112.anInt1900 >= arg8 && arg0 >= Static356.anInt5817 && Static3.anInt46 >= arg0 && Static356.anInt5817 <= arg6 && Static3.anInt46 >= arg6 && arg4 >= Static356.anInt5817 && arg4 <= Static3.anInt46 && arg5 >= Static356.anInt5817 && Static3.anInt46 >= arg5) {
			Static13.method252(arg8, arg0, arg4, arg2, arg3, arg5, arg1, arg6, arg7);
		} else {
			Static245.method3167(arg2, arg5, arg6, arg0, arg3, arg7, arg4, arg8, arg1);
		}
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(B)V")
	public static void method2949() {
		@Pc(1) Class44 local1 = Static200.aClass44_32;
		synchronized (Static200.aClass44_32) {
			Static200.aClass44_32.method1024();
		}
		local1 = Static335.aClass44_55;
		synchronized (Static335.aClass44_55) {
			Static335.aClass44_55.method1024();
		}
	}
}
