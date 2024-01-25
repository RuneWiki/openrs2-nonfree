import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
	public static int anInt8463;

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "Lclient!pia;")
	public static final Class287 aClass287_1 = new Class287();

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "Lclient!pia;")
	public static final Class287 aClass287_2 = new Class287();

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "Lclient!pia;")
	public static final Class287 aClass287_3 = new Class287();

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "Lclient!pia;")
	public static final Class287 aClass287_4 = new Class287();

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean633 = false;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IB[BIIII)Z")
	public static boolean method7099(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(16) int local16 = arg0 % 8;
		@Pc(26) int local26;
		if (local16 == 0) {
			local26 = 0;
		} else {
			local26 = 8 - local16;
		}
		@Pc(40) int local40 = -((arg2 + 8 - 1) / 8);
		@Pc(49) int local49 = -((arg0 + 7) / 8);
		for (@Pc(51) int local51 = local40; local51 < 0; local51++) {
			for (@Pc(57) int local57 = local49; local57 < 0; local57++) {
				if (arg1[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local26;
			if (arg1[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(Z)V")
	public static void method7101() {
		@Pc(10) Class338 local10 = Static595.aClass338_57;
		synchronized (Static595.aClass338_57) {
			Static595.aClass338_57.method8051();
		}
	}
}
