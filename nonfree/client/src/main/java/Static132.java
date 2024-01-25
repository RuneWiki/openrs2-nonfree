import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!pn;")
	public static Class4_Sub21_Sub4 aClass4_Sub21_Sub4_1;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!tn;")
	public static final Class318 aClass318_4 = new Class318();

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[I")
	public static final int[] anIntArray138 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!kq;")
	public static final Class184 aClass184_3 = new Class184(9, 2);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!kfa;ZIII)Lclient!bb;")
	public static Class3_Sub2_Sub1 method2398(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean377 || Static32.method1002(arg2) && Static32.method1002(arg0)) {
			return new Class3_Sub2_Sub1(arg1, 3553, arg3, arg4, arg2, arg0, true);
		} else if (arg1.aBoolean381) {
			return new Class3_Sub2_Sub1(arg1, 34037, arg3, arg4, arg2, arg0, true);
		} else {
			return new Class3_Sub2_Sub1(arg1, arg3, arg4, arg2, arg0, Static488.method7100(arg2), Static488.method7100(arg0), true);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([BI)[B")
	public static byte[] method2400(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static599.method3060(arg0, 0, local14, 0, local6);
		return local14;
	}
}
