import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "I")
	public static int anInt6844 = 0;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_96 = new Class167(64);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Lclient!um;")
	public static Class244 method5248(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static114.aFloat93 == 3.0D) {
				return Static365.aClass244_8;
			}
			if ((double) Static114.aFloat93 == 4.0D) {
				return Static326.aClass244_6;
			}
			if ((double) Static114.aFloat93 == 6.0D) {
				return Static433.aClass244_10;
			}
			if ((double) Static114.aFloat93 >= 8.0D) {
				return Static133.aClass244_3;
			}
		} else if (arg0 == 1) {
			if ((double) Static114.aFloat93 == 3.0D) {
				return Static433.aClass244_10;
			}
			if ((double) Static114.aFloat93 == 4.0D) {
				return Static133.aClass244_3;
			}
			if ((double) Static114.aFloat93 == 6.0D) {
				return Static69.aClass244_7;
			}
			if ((double) Static114.aFloat93 >= 8.0D) {
				return Static290.aClass244_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static114.aFloat93 == 3.0D) {
				return Static69.aClass244_7;
			}
			if ((double) Static114.aFloat93 == 4.0D) {
				return Static290.aClass244_5;
			}
			if ((double) Static114.aFloat93 == 6.0D) {
				return Static5.aClass244_1;
			}
			if ((double) Static114.aFloat93 >= 8.0D) {
				return Static411.aClass244_9;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!j;III[Z)Z")
	public static boolean method5252(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static202.aClass163Array2 != Static164.aClass163Array1) {
			@Pc(11) int local11 = Static240.aClass163Array3[arg1].va(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class163 local18 = Static240.aClass163Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.va(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4514(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.SA(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!sq;")
	public static Class20_Sub3 method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class146 local14 = local7.aClass146_1; local14 != null; local14 = local14.aClass146_3) {
			@Pc(18) Class20_Sub3 local18 = local14.aClass20_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort85 == arg1 && local18.aShort88 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method5257(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static5.method94(Static278.aClass137_183);
		Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(arg0) + 1);
		Static75.aClass1_Sub11_Sub1_1.method4453(arg0);
		Static75.aClass1_Sub11_Sub1_1.method4445(arg1);
	}
}
