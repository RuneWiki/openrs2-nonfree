import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!sm", name = "W", descriptor = "Lclient!ha;")
	public static Class132 aClass132_13;

	@OriginalMember(owner = "client!sm", name = "xb", descriptor = "I")
	public static final int anInt9208 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ns;IILclient!ns;BIIIII)V")
	public static void method7765(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub1_Sub3 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg3.method4330();
		if (local7 == -1) {
			return;
		}
		@Pc(29) Class9 local29 = (Class9) Static466.aClass10_47.method373((long) local7);
		if (local29 == null) {
			@Pc(36) Class112[] local36 = Static681.method2323(Static624.aClass8_139, local7);
			if (local36 == null) {
				return;
			}
			local29 = aClass132_13.method7488(local36[0], true);
			Static466.aClass10_47.method366(local29, (long) local7);
		}
		Static234.method3564(arg0.aByte140, 0, arg0.anInt10001, arg5 >> 1, arg4 >> 1, arg0.method4326() * 256, arg0.anInt10006);
		@Pc(84) int local84 = Static574.anIntArray632[0] + arg6 - 18;
		@Pc(94) int local94 = Static574.anIntArray632[1] + arg1 - 54 - 16;
		@Pc(102) int local102 = local84 + arg2 / 4 * 18;
		@Pc(110) int local110 = local94 + arg2 % 4 * 18;
		local29.method8920(local102, local110);
		if (arg3 == arg0) {
			aClass132_13.method7462(-256, 18, local102 - 1, local110 + -1, 18);
		}
		Static629.method8681(local102 + 18, local110 + -1, local110 + 18, local102 + -1);
		@Pc(146) Class2_Sub2 local146 = Static629.method8677();
		local146.anInt989 = local102 + 16;
		local146.anInt987 = local110;
		local146.anInt988 = local102;
		local146.anInt990 = local110 + 16;
		local146.aClass2_Sub1_Sub1_Sub3_1 = arg3;
		Static304.aClass43_9.method1084(local146);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)I")
	public static int method7766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(30) int local30 = ((arg1 & 0xFF00) * local12 & 0xFF0000 | (arg1 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return (((arg0 & 0xFF00FF) * local35 & 0xFF00FF00 | local35 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I")
	public static int method7769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(Z)V")
	public static void method7770(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static441.aClass351ArrayArrayArray1 = Static661.aClass351ArrayArrayArray3;
			Static289.aClass12Array3 = Static68.aClass12Array2;
		} else {
			Static441.aClass351ArrayArrayArray1 = Static611.aClass351ArrayArrayArray2;
			Static289.aClass12Array3 = Static64.aClass12Array1;
		}
		Static633.anInt10310 = Static441.aClass351ArrayArrayArray1.length;
	}
}
