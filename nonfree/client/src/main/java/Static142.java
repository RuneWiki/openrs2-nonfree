import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public static int anInt3262;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!oo;")
	public static Class247 aClass247_4;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
	public static int anInt3266;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	public static int anInt3265 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)V")
	public static void method2865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static223.anInt4519 = arg2;
		Static562.anInt9991 = arg0;
		Static24.anInt770 = arg5;
		Static333.anInt6932 = arg4;
		Static122.anInt2790 = arg1;
		Static556.anInt9968 = arg3;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)C")
	public static char method2866(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(39) char local39 = Static397.aCharArray6[local7 - 128];
			if (local39 == '\u0000') {
				local39 = '?';
			}
			local7 = local39;
		}
		return (char) local7;
	}
}
