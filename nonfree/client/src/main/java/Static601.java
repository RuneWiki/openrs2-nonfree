import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "Lclient!hl;")
	public static final Class148 aClass148_21 = new Class148(4, 1);

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
	public static int anInt10526 = 0;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!gga;Lclient!gga;Lclient!gga;ILclient!iv;Lclient!of;)Z")
	public static boolean method9018(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(4) Class34 arg3, @OriginalArg(5) Class2_Sub26_Sub3 arg4) {
		Static208.anIntArray470 = new int[16];
		Static300.aClass2_Sub26_Sub3_8 = arg4;
		Static280.aClass124_60 = arg0;
		Static554.aClass34_3 = arg3;
		Static90.aClass124_23 = arg1;
		Static526.aClass124_112 = arg2;
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			Static208.anIntArray470[local20] = 255;
		}
		return true;
	}
}
