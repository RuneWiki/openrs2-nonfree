import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public static int anInt6237;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_64 = new Class144(89, -1);

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
	public static int anInt6239 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	public static void method5423() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static572.aBooleanArray23[local3] = true;
		}
		if (false) {
			method5421();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BLclient!dga;)I")
	public static int method5424(@OriginalArg(1) Class3_Sub7_Sub5 arg0) {
		@Pc(14) String local14 = Static239.method3430(arg0);
		return Static677.aClass169_12.method3646(Static413.aClass178Array13, local14);
	}
}
