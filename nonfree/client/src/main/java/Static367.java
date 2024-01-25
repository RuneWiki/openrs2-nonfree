import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mga", name = "z", descriptor = "I")
	public static int anInt6503;

	@OriginalMember(owner = "client!mga", name = "B", descriptor = "J")
	public static long aLong172 = -1L;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IILclient!ha;Z)Lclient!da;")
	public static Class69 method5448(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class122 local18 = Static345.method5205(arg2, arg1, arg0);
		return local18 == null ? null : local18.aClass69_3;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method5449(@OriginalArg(0) Class16 arg0) {
		if (Static236.aBoolean347) {
			Static270.method4308(arg0);
		} else {
			Static436.method6382(arg0);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIII)I")
	public static int method5450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 & 0x3;
		if (local15 == 0) {
			return arg0;
		} else if (local15 == 1) {
			return 4095 - arg2;
		} else if (local15 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}
}
