import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "Lclient!nca;")
	public static Class254 aClass254_123;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	public static int anInt7457;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	public static final int anInt7460 = -1;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method6640(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return ~local37 & arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)Z")
	public static boolean method6641(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
