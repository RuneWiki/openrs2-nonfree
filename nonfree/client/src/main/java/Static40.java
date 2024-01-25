import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_12 = new Class186(118, 4);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!rba;)Lclient!sf;")
	public static Class21_Sub3 method588(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(7) Class21 local7 = Static582.method8682(arg0);
		@Pc(11) int local11 = arg0.method5272();
		@Pc(15) int local15 = arg0.method5272();
		@Pc(26) int local26 = arg0.method5272();
		@Pc(30) int local30 = arg0.method5272();
		@Pc(34) int local34 = arg0.method5272();
		@Pc(38) int local38 = arg0.method5272();
		return new Class21_Sub3(local7.aClass304_9, local7.aClass216_9, local7.anInt3469, local7.anInt3465, local7.anInt3462, local7.anInt3460, local7.anInt3467, local7.anInt3463, local7.anInt3466, local11, local15, local26, local30, local34, local38);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public static void method589() {
		@Pc(7) int local7 = Static558.anInt9284;
		@Pc(9) int[] local9 = Static408.anIntArray393;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(27) Class19_Sub1_Sub3_Sub2_Sub2 local27 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local9[local19]];
			if (local27 != null) {
				Static480.method7029(local27, false);
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIII)V")
	public static void method590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class28 local17 = Static678.aClass28ArrayArray5[arg1][arg0];
		Static538.method6233(arg2, local17 == null ? Static3.aClass28_1 : local17);
	}
}
