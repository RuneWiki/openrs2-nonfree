import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public static int anInt3638;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public static int anInt3633 = 0;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public static final int anInt3636 = 1401;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!og;")
	public static final Class182 aClass182_1 = new Class182("WIP", 2);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(CZ)Z")
	public static boolean method3113(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!hh;BLclient!hh;)I")
	public static int method3114(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Class109 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method2348(Static151.anInt2730)) {
			local10++;
		}
		if (arg0.method2348(Static162.anInt2876)) {
			local10++;
		}
		if (arg0.method2348(Static275.anInt4643)) {
			local10++;
		}
		if (arg1.method2348(Static151.anInt2730)) {
			local10++;
		}
		if (arg1.method2348(Static162.anInt2876)) {
			local10++;
		}
		if (arg1.method2348(Static275.anInt4643)) {
			local10++;
		}
		return local10;
	}
}
