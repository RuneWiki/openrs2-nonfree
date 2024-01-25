import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!dr;")
	public static final Class7_Sub14_Sub1 aClass7_Sub14_Sub1_2 = new Class7_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLclient!vj;ZZ)V")
	public static void method3394(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class7_Sub44 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt7165;
		@Pc(12) int local12 = (int) arg1.aLong230;
		arg1.method5802();
		if (arg0) {
			Static348.method5606(local8);
		}
		Static122.method2001(local8);
		@Pc(27) Class95 local27 = Static313.method4088(local12);
		if (local27 != null) {
			Static413.method5189(local27);
		}
		Static186.method2721();
		if (!arg2 && Static183.anInt3293 != -1) {
			Static379.method4657(1, Static183.anInt3293);
		}
		@Pc(49) Class64 local49 = new Class64(Static23.aClass164_3);
		for (@Pc(54) Class7_Sub44 local54 = (Class7_Sub44) local49.method1553(); local54 != null; local54 = (Class7_Sub44) local49.method1555()) {
			if (!local54.method5801()) {
				local54 = (Class7_Sub44) local49.method1553();
				if (local54 == null) {
					break;
				}
			}
			if (local54.anInt7164 == 3) {
				@Pc(77) int local77 = (int) local54.aLong230;
				if (local8 == local77 >>> 16) {
					method3394(true, local54, arg2);
				}
			}
		}
	}
}
