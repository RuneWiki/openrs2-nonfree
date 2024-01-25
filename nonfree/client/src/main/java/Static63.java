import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	public static int anInt5457;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	public static int anInt5456 = 0;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	public static int anInt5458 = 0;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
	public static boolean method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static285.anIntArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == -Static175.anInt3624) {
			return false;
		} else if (local7 == Static175.anInt3624) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static245.method4225(local22 + 1, Static331.aClass8Array5[arg0].method4173(arg1, arg2), local26 + 1) && Static245.method4225(local22 + 128 - 1, Static331.aClass8Array5[arg0].method4173(arg1 + 1, arg2), local26 + 1) && Static245.method4225(local22 + 128 - 1, Static331.aClass8Array5[arg0].method4173(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static245.method4225(local22 + 1, Static331.aClass8Array5[arg0].method4173(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static285.anIntArrayArrayArray14[arg0][arg1][arg2] = Static175.anInt3624;
				return true;
			} else {
				Static285.anIntArrayArrayArray14[arg0][arg1][arg2] = -Static175.anInt3624;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Lclient!el;")
	public static Class7_Sub9 method4608(@OriginalArg(0) int arg0) {
		return (Class7_Sub9) Static175.aClass10_32.method163((long) arg0);
	}
}
