import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fba", name = "q", descriptor = "[[[Lclient!mf;")
	public static Class217[][][] aClass217ArrayArrayArray1;

	@OriginalMember(owner = "client!fba", name = "X", descriptor = "J")
	public static long aLong89;

	@OriginalMember(owner = "client!fba", name = "fb", descriptor = "I")
	public static int anInt3153;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	public static int anInt3124 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BLclient!ud;)Lclient!rp;")
	public static Class299 method2699(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(7) int local7 = arg0.method6884();
		return new Class299(local7);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIII)I")
	public static int method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg0;
		@Pc(27) int local27 = (arg2 & 0x7F) * arg0 + (arg1 & 0x7F) * local13 >> 7;
		@Pc(46) int local46 = arg0 * (arg2 & 0x380) + (arg1 & 0x380) * local13 >> 7;
		@Pc(61) int local61 = (arg1 & 0xFC00) * local13 + (arg2 & 0xFC00) * arg0 >> 7;
		return local46 & 0x380 | local61 & 0xFC00 | local27 & 0x7F;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!ud;B)Lclient!pc;")
	public static Class2_Sub10 method2707(@OriginalArg(0) Class2_Sub34 arg0) {
		arg0.method6904();
		@Pc(20) int local20 = arg0.method6904();
		@Pc(24) Class2_Sub10 local24 = Static484.method6949(local20);
		local24.anInt10042 = arg0.method6904();
		@Pc(33) int local33 = arg0.method6904();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method6904();
			local24.method8410(arg0, local41);
		}
		local24.method8407();
		return local24;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
	public static void method2719() {
		@Pc(5) Class233 local5 = Static522.aClass233_51;
		synchronized (Static522.aClass233_51) {
			Static522.aClass233_51.method5663();
		}
	}
}
