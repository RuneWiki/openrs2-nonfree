import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!cw;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "[S")
	public static short[] aShortArray96;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public static int anInt5435;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!rc;")
	public static final Class279 aClass279_10 = new Class279();

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_147 = new Class363(11, 0);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIIIIBII[B)V")
	public static void method4557(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(23) int local23 = -(arg3 >> 2);
		@Pc(28) int local28 = -(arg3 & 0x3);
		for (@Pc(31) int local31 = -arg5; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local23; local35 < 0; local35++) {
				local39 = arg4++;
				arg7[local39] += arg0[arg1++];
				@Pc(51) int local51 = arg4++;
				arg7[local51] += arg0[arg1++];
				@Pc(63) int local63 = arg4++;
				arg7[local63] += arg0[arg1++];
				@Pc(75) int local75 = arg4++;
				arg7[local75] += arg0[arg1++];
			}
			for (@Pc(93) int local93 = local28; local93 < 0; local93++) {
				local39 = arg4++;
				arg7[local39] += arg0[arg1++];
			}
			arg1 += arg2;
			arg4 += arg6;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lclient!og;")
	public static Class6_Sub5 method4561(@OriginalArg(1) int arg0) {
		@Pc(7) Class109[] local7 = Class326.aClass109Array1;
		synchronized (Class326.aClass109Array1) {
			@Pc(30) Class6_Sub5 local30;
			if (Class326.aClass109Array1.length <= arg0 || Class326.aClass109Array1[arg0].method2308()) {
				local30 = new Class6_Sub5();
				local30.aClass6_Sub6Array1 = new Class6_Sub6[arg0];
				for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
					local30.aClass6_Sub6Array1[local36] = new Class6_Sub6();
				}
			} else {
				local30 = (Class6_Sub5) Class326.aClass109Array1[arg0].method2315();
				local30.method7989();
				@Pc(65) int local65 = Static244.anIntArray303[arg0]--;
			}
			return local30;
		}
	}
}
