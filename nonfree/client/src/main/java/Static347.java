import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_97 = new Class45(5, 6);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class12_Sub17 local7 = null;
		for (@Pc(12) Class12_Sub17 local12 = (Class12_Sub17) Static179.aClass73_31.method2005(); local12 != null; local12 = (Class12_Sub17) Static179.aClass73_31.method2009()) {
			if (arg3 == local12.anInt3849 && local12.anInt3846 == arg2 && arg5 == local12.anInt3840 && arg1 == local12.anInt3848) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class12_Sub17();
			local7.anInt3848 = arg1;
			local7.anInt3846 = arg2;
			local7.anInt3840 = arg5;
			local7.anInt3849 = arg3;
			if (arg2 >= 0 && arg5 >= 0 && Static37.anInt7512 > arg2 && arg5 < Static329.anInt6247) {
				Static107.method2238(local7);
			}
			Static179.aClass73_31.method2012(local7);
		}
		local7.anInt3843 = arg6;
		local7.anInt3839 = arg0;
		local7.anInt3836 = 0;
		local7.anInt3841 = -1;
		local7.anInt3844 = arg4;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	public static void method5470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass30_Sub2_2 != null) {
			local7.aClass30_Sub2_2 = null;
		}
		if (local7.aClass30_Sub2_1 != null) {
			local7.aClass30_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!lm;)V")
	public static void method5471(@OriginalArg(0) Class30_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort115; local2 <= arg0.aShort113; local2++) {
			for (@Pc(6) int local6 = arg0.aShort112; local6 <= arg0.aShort114; local6++) {
				@Pc(16) Class37 local16 = Static120.aClass37ArrayArrayArray1[arg0.aByte99][local2][local6];
				if (local16 != null) {
					@Pc(21) Class243 local21 = local16.aClass243_3;
					@Pc(23) Class243 local23 = null;
					while (local21 != null) {
						if (local21.aClass30_Sub1_2 == arg0) {
							if (local23 == null) {
								local16.aClass243_3 = local21.aClass243_11;
							} else {
								local23.aClass243_11 = local21.aClass243_11;
							}
							local21.method6032();
							break;
						}
						local23 = local21;
						local21 = local21.aClass243_11;
					}
					local16.aByte27 = 0;
					for (@Pc(56) Class243 local56 = local16.aClass243_3; local56 != null; local56 = local56.aClass243_11) {
						local16.aByte27 = (byte) (local16.aByte27 | local56.anInt7259);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIII)V")
	public static void method5472(@OriginalArg(0) boolean arg0) {
		Static140.aBoolean250 = arg0;
		Static44.anInt846 = 2;
		Static426.anInt6103 = 22050;
	}
}
