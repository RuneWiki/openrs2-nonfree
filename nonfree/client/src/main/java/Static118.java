import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "[Lclient!jba;")
	public static final Class175[] aClass175Array2 = new Class175[14];

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "Z")
	public static final boolean aBoolean228 = false;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZII)I")
	public static int method2222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(30) int local30 = ((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg1 & 0xFF00FF) * local12 & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public static void method2225() {
		Static576.aBoolean795 = true;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)I")
	public static int method2229() {
		return Static456.anInt7746++;
	}
}
