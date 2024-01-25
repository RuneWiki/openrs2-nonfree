import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Lclient!nq;")
	public static Class144 aClass144_73;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_42 = new Class26(8);

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
	public static final int[] anIntArray343 = new int[32];

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_43 = new Class26(5);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIB)V")
	public static void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(22) int local22;
		if (arg1 <= arg2) {
			for (local22 = arg1; local22 < arg2; local22++) {
				Static73.anIntArrayArray6[local22][arg0] = arg3;
			}
		} else {
			for (local22 = arg2; local22 < arg1; local22++) {
				Static73.anIntArrayArray6[local22][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lclient!tq;")
	public static Class11_Sub4_Sub18 method3981(@OriginalArg(1) int arg0) {
		@Pc(12) Class11_Sub4_Sub18 local12 = (Class11_Sub4_Sub18) Static23.aClass142_1.method3874((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = aClass144_73.method3896(arg0, 0);
		} else {
			local25 = Static212.aClass144_67.method3896(arg0 & 0x7FFF, 0);
		}
		local12 = new Class11_Sub4_Sub18();
		if (local25 != null) {
			local12.method5246(new Class11_Sub25(local25));
		}
		if (arg0 >= 32768) {
			local12.method5251();
		}
		Static23.aClass142_1.method3870(local12, (long) arg0);
		return local12;
	}
}
