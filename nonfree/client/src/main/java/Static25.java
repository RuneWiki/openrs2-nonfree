import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!c", name = "O", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "Lclient!qe;")
	private static Class78 aClass78_89 = Static199.method3560(" ");

	@OriginalMember(owner = "client!c", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_88 = aClass78_89;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "[I")
	public static int[] anIntArray75 = new int[50];

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "I")
	public static int anInt457 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
	public static boolean method326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(25) Class2_Sub3_Sub17 local25 = Static121.method3984(arg1);
		return local25.method1877(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method327(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static11.aClass76_1);
		arg0.removeMouseMotionListener(Static11.aClass76_1);
		arg0.removeFocusListener(Static11.aClass76_1);
		Static184.anInt4293 = 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!qc;BIII)Lclient!qc;")
	public static Class5_Sub3 method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg4;
		@Pc(14) Class5_Sub3 local14 = (Class5_Sub3) Static43.aClass53_3.method1793(local8);
		if (local14 == null) {
			@Pc(21) Class5_Sub7 local21 = Static218.method3807(Static110.aClass72_Sub1_23, arg4);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method3795(64, 768, -50, -10, -50);
			Static43.aClass53_3.method1794(local14, local8);
		}
		@Pc(41) int local41 = arg2.method1431();
		@Pc(49) int local49 = arg2.method1416();
		@Pc(52) int local52 = arg2.method1426();
		@Pc(55) int local55 = arg2.method1422();
		local14 = local14.method1417(true, true);
		if (arg5 != 0) {
			local14.method1414(arg5);
		}
		@Pc(71) Class5_Sub3_Sub1 local71 = (Class5_Sub3_Sub1) local14;
		if (Static208.method3667(arg1 + local41, Static137.anInt3136, local52 + arg0) != arg3 || Static208.method3667(local49 + arg1, Static137.anInt3136, arg0 + local55) != arg3) {
			for (@Pc(103) int local103 = 0; local103 < local71.anInt1782; local103++) {
				local71.anIntArray305[local103] += Static208.method3667(arg1 + local71.anIntArray309[local103], Static137.anInt3136, arg0 + local71.anIntArray308[local103]) - arg3;
			}
			local71.aBoolean66 = false;
		}
		return local14;
	}
}
