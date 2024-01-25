import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_209 = new Class107(11, 0);

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
	public static int anInt7102 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Lclient!en;")
	public static Class1_Sub2_Sub6 method5808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub2_Sub6 local15 = (Class1_Sub2_Sub6) Static166.aClass96_19.method2335((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class1_Sub2_Sub6(arg0, arg1);
			Static166.aClass96_19.method2341(local15.aLong222, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Lclient!qu;")
	public static Class204 method5809(@OriginalArg(0) int arg0) {
		@Pc(11) Class204[] local11 = Static454.method5964();
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			if (local11[local13].anInt5716 == arg0) {
				return local11[local13];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)Z")
	public static boolean method5812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class129 local8 = Static349.aClass115_4.method2766(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method3018(arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B[I[J)V")
	public static void method5814(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static203.method4234(0, arg1, arg0, arg1.length - 1);
	}
}
