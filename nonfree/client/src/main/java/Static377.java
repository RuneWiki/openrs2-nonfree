import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!oo", name = "Q", descriptor = "I")
	public static int anInt6888;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "Lclient!su;")
	public static final Class298 aClass298_144 = new Class298();

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "[I")
	public static final int[] anIntArray486 = new int[32];

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[Ljava/lang/Object;[III)V")
	public static void method5515(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg3) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local25;
		@Pc(39) Object local39 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local39;
		@Pc(56) int local56 = local25 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg2; local58 < arg3; local58++) {
			if ((local58 & local56) + local25 > arg1[local58]) {
				@Pc(73) int local73 = arg1[local58];
				arg1[local58] = arg1[local21];
				arg1[local21] = local73;
				@Pc(87) Object local87 = arg0[local58];
				arg0[local58] = arg0[local21];
				arg0[local21++] = local87;
			}
		}
		arg1[arg3] = arg1[local21];
		arg1[local21] = local25;
		arg0[arg3] = arg0[local21];
		arg0[local21] = local39;
		method5515(arg0, arg1, arg2, local21 - 1);
		method5515(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public static void method5516() {
		for (@Pc(7) int local7 = 0; local7 < Static267.aByteArrayArrayArray8.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static267.aByteArrayArrayArray8[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static267.aByteArrayArrayArray8[0][0].length; local15++) {
					Static267.aByteArrayArrayArray8[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "()V")
	public static void method5519() {
		for (@Pc(1) int local1 = 0; local1 < Static398.anInt7207; local1++) {
			@Pc(6) Class15_Sub2 local6 = Static158.aClass15_Sub2Array1[local1];
			Static438.method6209(local6);
			Static158.aClass15_Sub2Array1[local1] = null;
		}
		Static398.anInt7207 = 0;
	}
}
