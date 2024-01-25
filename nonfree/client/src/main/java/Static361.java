import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	public static int anInt6755;

	@OriginalMember(owner = "client!ow", name = "p", descriptor = "Lclient!qm;")
	public static Class3_Sub40 aClass3_Sub40_2;

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_118 = new Class133(71, 4);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZZBLclient!lc;)V")
	public static void method5656(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class3_Sub29 arg2) {
		@Pc(8) int local8 = arg2.anInt5522;
		@Pc(12) int local12 = (int) arg2.aLong285;
		arg2.method7820();
		if (arg1) {
			Static102.method4938(local8);
		}
		Static319.method5144(local8);
		@Pc(27) Class245 local27 = Static46.method1005(local12);
		if (local27 != null) {
			Static31.method809(local27);
		}
		Static34.method838();
		if (!arg0 && Static422.anInt8667 != -1) {
			Static342.method5429(1, Static422.anInt8667);
		}
		@Pc(49) Class213 local49 = new Class213(Static156.aClass267_14);
		for (@Pc(54) Class3_Sub29 local54 = (Class3_Sub29) local49.method5504(); local54 != null; local54 = (Class3_Sub29) local49.method5505()) {
			if (!local54.method7821()) {
				local54 = (Class3_Sub29) local49.method5504();
				if (local54 == null) {
					break;
				}
			}
			if (local54.anInt5521 == 3) {
				@Pc(77) int local77 = (int) local54.aLong285;
				if (local77 >>> 16 == local8) {
					method5656(arg0, true, local54);
				}
			}
		}
	}
}
