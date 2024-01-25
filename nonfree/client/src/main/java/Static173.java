import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!mv;")
	public static Class229 aClass229_35;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
	public static final int[] anIntArray219 = new int[200];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!tba;)V")
	public static void method2266(@OriginalArg(1) Class320 arg0) {
		Static11.aClass320_1 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!r;IILclient!hi;Lclient!ks;Lclient!hh;)V")
	public static void method2267(@OriginalArg(0) int arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub20 arg4, @OriginalArg(6) Class200 arg5, @OriginalArg(7) Class142 arg6) {
		@Pc(15) int local15 = arg4.anInt2968 - arg3 / 2 - 5;
		@Pc(19) int local19 = arg2 + 2;
		if (arg6.anInt2936 != 0) {
			arg1.method6885(local19, arg6.anInt2936, arg3 + 10, local15, arg0 * arg5.method4087() + arg2 + 1 - local19);
		}
		if (arg6.anInt2931 != 0) {
			arg1.method6888(arg6.anInt2931, arg2 + arg5.method4087() * arg0 + 1 - local19, arg3 - -10, local19, local15);
		}
		@Pc(78) int local78 = arg6.anInt2949;
		if (arg4.aBoolean213 && arg6.anInt2950 != -1) {
			local78 = arg6.anInt2950;
		}
		for (@Pc(90) int local90 = 0; local90 < arg0; local90++) {
			@Pc(96) String local96 = Static494.aStringArray37[local90];
			if (arg0 - 1 > local90) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg5.method4088(arg1, local96, arg4.anInt2968, arg2, local78);
			arg2 += arg5.method4087();
		}
	}
}
