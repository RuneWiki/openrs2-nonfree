import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
	public static int anInt4970;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
	public static int anInt4964 = 0;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
	public static final int anInt4967 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!ha;Z)Lclient!da;")
	public static Class62 method4470(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) Class95 local11 = Static558.method8036(arg1, arg0, arg2);
		return local11 == null ? null : local11.aClass62_2;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Z")
	public static boolean method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static567.method8640(arg0, arg1) || Static72.method1725(arg0, arg1);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!qk;Z)V")
	public static void method4474(@OriginalArg(0) Class279 arg0) {
		if (arg0.anInt8204 == 5 && arg0.anInt8217 != -1) {
			Static498.method7385(arg0, Static323.aClass5_9);
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(II)I")
	public static int method4478(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}
}
