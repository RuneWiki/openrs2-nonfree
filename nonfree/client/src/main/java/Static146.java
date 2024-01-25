import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
	public static int anInt3109;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "[Lclient!rda;")
	public static final Class1_Sub4_Sub2_Sub1_Sub2[] aClass1_Sub4_Sub2_Sub1_Sub2Array1 = new Class1_Sub4_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public static int anInt3106 = 0;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
	public static void method2802() {
		for (@Pc(1) int local1 = Static381.anInt7743; local1 < Static345.anInt6662; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static182.anInt3633; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static253.anInt4651; local7++) {
					@Pc(16) Class53 local16 = Static60.aClass53ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class1_Sub4_Sub5 local21 = local16.aClass1_Sub4_Sub5_2;
						@Pc(24) Class1_Sub4_Sub5 local24 = local16.aClass1_Sub4_Sub5_1;
						if (local21 != null && local21.method8114()) {
							Static118.method3497(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8114()) {
								Static118.method3497(local24, local1, local4, local7, 1, 1);
								local24.method8127(0, 0, false, Static468.aClass44_7, local21, 0);
								local24.method8120();
							}
							local21.method8120();
						}
						for (@Pc(68) Class289 local68 = local16.aClass289_1; local68 != null; local68 = local68.aClass289_3) {
							@Pc(72) Class1_Sub4_Sub2 local72 = local68.aClass1_Sub4_Sub2_1;
							if (local72 != null && local72.method8114()) {
								Static118.method3497(local72, local1, local4, local7, local72.aShort122 + 1 - local72.aShort121, local72.aShort119 - local72.aShort120 + 1);
								local72.method8120();
							}
						}
						@Pc(108) Class1_Sub4_Sub4 local108 = local16.aClass1_Sub4_Sub4_1;
						if (local108 != null && local108.method8114()) {
							Static438.method6800(local108, local1, local4, local7);
							local108.method8120();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[Ljava/lang/Object;I[IB)V")
	public static void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg0; local53 < arg2; local53++) {
			if (arg3[local53] < (local53 & local51) + local20) {
				@Pc(68) int local68 = arg3[local53];
				arg3[local53] = arg3[local16];
				arg3[local16] = local68;
				@Pc(82) Object local82 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16++] = local82;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method2803(arg0, arg1, local16 - 1, arg3);
		method2803(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(CI)Z")
	public static boolean method2805(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static298.aCharArray4;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(43) char local43 = local35[local37];
				if (local43 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
