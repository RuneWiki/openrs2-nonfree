import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt3446;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt3447;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)I")
	public static int method2847(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(24) int local24 = (local14 & 0x33333333) + (local14 >>> 2 & 0x33333333);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local33 + (local33 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z")
	public static boolean method2848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static161.method2611(arg0, arg1) & Static628.method8809(arg1, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!so;I)Lclient!lc;")
	public static Class207 method2849(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(7) Class207 local7 = new Class207();
		local7.anInt6123 = arg0.method5900();
		local7.aClass14_Sub3_Sub20_1 = Static526.aClass266_1.method6436(local7.anInt6123);
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)I")
	public static int method2850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
