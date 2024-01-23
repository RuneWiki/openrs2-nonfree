import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!rn;")
	public static Class155 aClass155_81;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!rn;")
	public static Class155 aClass155_82;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public static int anInt3816 = 0;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString134 = "glow3:";

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
	public static int[] anIntArray437 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Lclient!bb;")
	public static Class13 method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class13 local14 = local7.aClass13_1;
			local7.aClass13_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Class121[] local13 = Static51.aClass121Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class121 local23 = local13[local15];
			if (local23 != null && local23.anInt3691 == 2) {
				Static144.method4036(local23.anInt3697 * 2, arg4, (local23.anInt3703 - Static101.anInt1844 << 7) + local23.anInt3695, arg3 >> 1, arg0, (local23.anInt3696 - Static43.anInt798 << 7) + local23.anInt3689, arg1 >> 1);
				if (Static244.anInt4957 > -1 && Static124.anInt2371 % 20 < 10) {
					Static270.aClass3_Sub4_Sub12Array10[local23.anInt3699].method4697(arg5 + Static244.anInt4957 - 12, Static67.anInt1246 + -28 + arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V")
	public static void method3236(@OriginalArg(0) int arg0) {
		Static9.anInt187 = -1;
		Static79.anInt1913 = -1;
		Static158.anInt2949 = arg0;
		Static202.method3347();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!rn;II)Lclient!kk;")
	public static Class81_Sub2 method3237(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1) {
		return Static115.method1878(0, arg1, arg0) ? Static168.method2794() : null;
	}
}
