import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
	public static int anInt8749;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method7314(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V")
	public static void method7315() {
		Static572.aClass245_72.method6079();
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)I")
	public static int method7316(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}
}
