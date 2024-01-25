import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
	public static boolean method3799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)Z")
	public static boolean method3800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3811(arg1, arg0) | (arg1 & 0x20000) != 0 || method3803(arg0, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)Z")
	public static boolean method3801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3809(arg1, arg0) || method3803(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)Z")
	public static boolean method3802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method3808(arg0, arg1) | (arg0 & 0x8000) != 0 || method3818(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method3803(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(III)Z")
	public static boolean method3803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method3807(arg0, arg1)) {
			return (arg1 & 0x5800) != 0 | method3809(arg0, arg1) | method3811(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (method3808(arg1, arg0) | method3806(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Z")
	public static boolean method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(III)Z")
	public static boolean method3805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x30000) != 0 | method3822(arg1, arg0) || method3803(arg1, arg0) || method3814(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(III)Z")
	private static boolean method3806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IBI)Z")
	public static boolean method3807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(III)Z")
	public static boolean method3808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(III)Z")
	public static boolean method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(III)Z")
	public static boolean method3810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "(III)Z")
	public static boolean method3811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "(III)Z")
	public static boolean method3812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "(III)Z")
	public static boolean method3813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "(III)Z")
	public static boolean method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3822(arg0, arg1) & method3815(arg0, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)Z")
	public static boolean method3815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(IBI)Z")
	public static boolean method3816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 | method3820(arg0, arg1) || method3803(arg0, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(BII)Z")
	public static boolean method3817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method3804(arg1, arg0) || method3827(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "(III)Z")
	public static boolean method3818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method3808(arg0, arg1) | (arg0 & 0x1000) != 0 | method3806(arg1, arg0)) & method3812(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIB)Z")
	public static boolean method3819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3828(arg0, arg1) & method3823(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)Z")
	public static boolean method3820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "(III)Z")
	public static boolean method3821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3829(arg0, arg1) | (arg0 & 0x38000) != 0 || method3827(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "(III)Z")
	public static boolean method3822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIB)Z")
	public static boolean method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(IIB)Z")
	public static boolean method3824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IZI)Z")
	public static boolean method3825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x38000) != 0 | method3813(arg0, arg1) || method3827(arg0, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(BII)Z")
	public static boolean method3826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3828(arg1, arg0) || method3819(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "(III)Z")
	public static boolean method3827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method3813(arg0, arg1) | method3804(arg0, arg1) | method3829(arg1, arg0)) & method3799(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "(III)Z")
	public static boolean method3828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "(III)Z")
	public static boolean method3829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
