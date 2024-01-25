import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public static int anInt7058 = 0;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "J")
	public static final long aLong199 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Z")
	public static boolean method5715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static447.method8531(arg0, arg1)) {
			return (arg1 & 0x9000) != 0 | Static193.method2994(arg1, arg0) | Static379.method9308(arg0, arg1) ? true : (Static266.method3896(arg0, arg1) | (arg1 & 0x2000) != 0 | Static653.method9075(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)Lclient!fj;")
	public static Class12_Sub2_Sub3 method5716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_Sub3_2;
	}
}
