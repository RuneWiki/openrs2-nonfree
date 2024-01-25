import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!gfa;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
	public static int anInt3465;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
	public static int anInt3466;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_51 = new Class100(72, 2);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public static void method2865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg1 | (long) arg2 << 32, 18);
		local14.method2817();
		local14.anInt3413 = arg3;
		local14.anInt3419 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)I")
	public static int method2866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static576.aClass51Array3 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(20) int local20 = arg3 >> 9;
			@Pc(24) int local24 = arg1 >> 9;
			if (arg4 < 0 || arg2 < 0 || Static26.anInt462 - 1 < arg4 || Static445.anInt6140 - 1 < arg2) {
				return 0;
			} else if (local20 >= 1 && local24 >= 1 && Static26.anInt462 - 1 >= local20 && local24 <= Static445.anInt6140 - 1) {
				@Pc(93) boolean local93 = (Static553.aByteArrayArrayArray18[1][arg3 >> 9][arg1 >> 9] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(134) boolean local134;
				if ((arg3 & 0x1FF) == 0) {
					local115 = (Static553.aByteArrayArrayArray18[1][local20 - 1][arg1 >> 9] & 0x2) != 0;
					local134 = (Static553.aByteArrayArrayArray18[1][local20][arg1 >> 9] & 0x2) != 0;
					if (local134 != local115) {
						local93 = (Static553.aByteArrayArrayArray18[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x1FF) == 0) {
					local115 = (Static553.aByteArrayArrayArray18[1][arg3 >> 9][local24 - 1] & 0x2) != 0;
					local134 = (Static553.aByteArrayArrayArray18[1][arg3 >> 9][local24] & 0x2) != 0;
					if (local115 != local134) {
						local93 = (Static553.aByteArrayArrayArray18[1][arg4][arg2] & 0x2) != 0;
					}
				}
				if (local93) {
					arg0++;
				}
				return Static576.aClass51Array3[arg0].method7866(arg3, arg1);
			} else {
				return 0;
			}
		} else {
			return Static576.aClass51Array3[arg0].method7866(arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	public static void method2867() {
		Static305.anInt5330 = 0;
		Static125.anInt2486++;
		Static621.anInt10451 = 0;
		Static192.method2992();
		Static44.method948();
		Static306.method4486();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static305.anInt5330; local23++) {
			local29 = Static61.anIntArray97[local23];
			@Pc(36) Class14_Sub44 local36 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local29);
			@Pc(39) Class12_Sub2_Sub2_Sub1_Sub1 local39 = local36.aClass12_Sub2_Sub2_Sub1_Sub1_2;
			if (Static505.aBoolean629 && Static175.method2820(local29)) {
				Static224.method3462();
			}
			if (Static125.anInt2486 != local39.anInt2941) {
				if (local39.aClass283_1.method7127()) {
					Static423.method6258(local39);
				}
				local39.method611((Class283) null);
				local36.method9315();
				local21 = true;
			}
		}
		if (local21) {
			Static570.anInt9823 = Static579.aClass187_73.method4080();
			Static579.aClass187_73.method4087(Static151.aClass14_Sub44Array1);
		}
		if (Static638.anInt10676 != Static481.aClass14_Sub29_Sub1_2.anInt7264) {
			throw new RuntimeException("gnp1 pos:" + Static481.aClass14_Sub29_Sub1_2.anInt7264 + " psize:" + Static638.anInt10676);
		}
		for (local29 = 0; local29 < Static471.anInt8216; local29++) {
			if (Static579.aClass187_73.method4078((long) Static530.anIntArray671[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static471.anInt8216);
			}
		}
		if (Static570.anInt9823 - Static471.anInt8216 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static570.anInt9823 - Static471.anInt8216));
		}
		for (@Pc(174) int local174 = 0; local174 < Static570.anInt9823; local174++) {
			if (Static151.aClass14_Sub44Array1[local174].aClass12_Sub2_Sub2_Sub1_Sub1_2.anInt2941 != Static125.anInt2486) {
				throw new RuntimeException("gnp4 uk:" + Static151.aClass14_Sub44Array1[local174].aClass12_Sub2_Sub2_Sub1_Sub1_2.anInt2945);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
	public static int method2869() {
		return Static453.anInt7941 == 1 ? Static608.anInt10279 : Static496.anInt8827;
	}
}
