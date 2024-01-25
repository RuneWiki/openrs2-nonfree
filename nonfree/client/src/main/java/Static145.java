import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt2577;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public static int anInt2581;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!qn;I)I")
	public static int method2041(@OriginalArg(0) Class211 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4382(Static187.anInt3443)) {
			local5++;
		}
		if (arg0.method4382(Static343.anInt5691)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)V")
	public static void method2043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class67 local10 = new Class67(16);
		for (@Pc(22) Class4_Sub6 local22 = (Class4_Sub6) Static41.aClass67_2.method1428(); local22 != null; local22 = (Class4_Sub6) Static41.aClass67_2.method1424()) {
			local22.method6059();
			@Pc(33) int local33 = (int) (local22.aLong227 >> 28);
			@Pc(43) int local43 = (int) (local22.aLong227 >> 14 & 0x3FFFL) - arg1;
			@Pc(51) int local51 = (int) (local22.aLong227 & 0x3FFFL) - arg0;
			if (local51 >= 0 && local43 >= 0 && local51 < Static337.anInt5497 && Static282.anInt4644 > local43) {
				local10.method1426(local22, (long) (local51 | local33 << 28 | local43 << 14));
			}
		}
		Static41.aClass67_2 = local10;
	}
}
