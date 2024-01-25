import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!sn;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
	public static boolean aBoolean108 = true;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_86 = new Class159("M", "M", "M", "M");

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	public static int anInt1518 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public static void method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static328.anIntArray485[arg1] = arg0;
		@Pc(20) Class4_Sub13 local20 = (Class4_Sub13) Static108.aClass43_13.method1273((long) arg1);
		if (local20 == null) {
			local20 = new Class4_Sub13(Static208.method3879() + 500L);
			Static108.aClass43_13.method1276(local20, (long) arg1);
		} else {
			local20.aLong45 = Static208.method3879() + 500L;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method1206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg0] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(36) char local36 = Static5.aCharArray5[local22 - 128];
					if (local36 == '\u0000') {
						local36 = '?';
					}
					local22 = local36;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!tj;)I")
	public static int method1207(@OriginalArg(1) Class193 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method5064(Static340.anInt6522)) {
			local10++;
		}
		if (arg0.method5064(Static271.anInt5402)) {
			local10++;
		}
		return local10;
	}
}
