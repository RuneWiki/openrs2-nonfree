import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
	public static int anInt7430;

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
	public static int anInt7437;

	@OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
	public static int anInt7439;

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
	public static int anInt7428 = 104;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "()V")
	public static void method6481() {
		for (@Pc(1) int local1 = 0; local1 < Static569.aClass380Array1.length; local1++) {
			Static569.aClass380Array1[local1].method8753();
		}
		Static569.aClass380Array1 = null;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BI)Lclient!kt;")
	public static Class206 method6482(@OriginalArg(1) int arg0) {
		@Pc(15) Class206 local15 = (Class206) Static564.aClass69_52.method1919((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static513.aClass238_243.method5567(arg0, 1);
		local15 = new Class206();
		local15.anInt5481 = arg0;
		if (local25 != null) {
			local15.method4782(new Class2_Sub17(local25));
		}
		local15.method4783();
		if (local15.anInt5480 == 2 && Static404.aClass323_25.method7484((long) arg0) == null) {
			Static404.aClass323_25.method7477(new Class2_Sub41(Static492.anInt7872), (long) arg0);
			Static566.aClass206Array1[Static492.anInt7872++] = local15;
		}
		Static564.aClass69_52.method1917((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBII)Z")
	public static boolean method6483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface25 local11 = (Interface25) Static587.method8331(arg2, arg1, arg0);
		if (local11 != null) {
			local5 = Static486.method6827(local11) & true;
		}
		local11 = (Interface25) Static22.method567(arg2, arg1, arg0, rca.class);
		if (local11 != null) {
			local5 &= Static486.method6827(local11);
		}
		local11 = (Interface25) Static366.method5446(arg2, arg1, arg0);
		if (local11 != null) {
			local5 &= Static486.method6827(local11);
		}
		return local5;
	}
}
