import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Lclient!iga;")
	public static Class173 aClass173_28;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	public static int anInt8863;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
	public static boolean aBoolean668 = false;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_97 = new Class387(13, 8);

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "[Lclient!ib;")
	public static final Class5_Sub23[] aClass5_Sub23Array1 = new Class5_Sub23[2048];

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Z")
	public static boolean aBoolean669 = false;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!el;")
	public static final Class109 aClass109_187 = new Class109(5, 4);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILclient!ffa;[IIZI)Lclient!gda;")
	public static Class32_Sub1_Sub1 method7586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class57_Sub2 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2.aBoolean228 || Static45.method8836(arg4) && Static45.method8836(arg1)) {
			return new Class32_Sub1_Sub1(arg2, 3553, arg4, arg1, false, arg3, arg0, 0);
		} else if (arg2.aBoolean231) {
			return new Class32_Sub1_Sub1(arg2, 34037, arg4, arg1, false, arg3, arg0, 0);
		} else {
			return new Class32_Sub1_Sub1(arg2, arg4, arg1, Static94.method1393(arg4), Static94.method1393(arg1), arg3);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	public static int method7591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * 57 + arg0;
		@Pc(22) int local22 = local16 ^ local16 << 13;
		@Pc(36) int local36 = Integer.MAX_VALUE & local22 * (local22 * local22 * 15731 + 789221) + 1376312589;
		return local36 >> 19 & 0xFF;
	}
}
