import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!od", name = "T", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)V")
	public static void method6118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg0, 5);
		local9.method7441();
		local9.anInt8635 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)Lclient!nka;")
	public static Class254 method6120(@OriginalArg(0) int arg0) {
		@Pc(10) Class254 local10 = (Class254) Static421.aClass168_62.method3860((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static365.aClass126_169.method3086(arg0, 0);
		local10 = new Class254();
		if (local21 != null) {
			local10.method5822(new Class5_Sub36(local21));
		}
		local10.method5821();
		Static421.aClass168_62.method3853((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method6122(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub4 arg1) {
		if (arg1.aClass5_Sub27_6 != null) {
			arg1.aClass5_Sub27_6.anInt4765 = 0;
		}
		arg1.aBoolean334 = false;
		for (@Pc(20) Class5_Sub4 local20 = arg1.method4711(); local20 != null; local20 = arg1.method4714()) {
			method6122(0, local20);
		}
		if (arg0 != 0) {
			method6122(5, (Class5_Sub4) null);
		}
	}
}
