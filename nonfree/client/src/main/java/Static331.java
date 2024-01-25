import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "Lclient!dn;")
	public static Class56 aClass56_71;

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_19 = new Class87(2, 3);

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "J")
	public static long aLong170 = -1L;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!wt;II)V")
	public static void method4556(@OriginalArg(0) Class3_Sub2_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static442.anInt7517 = 0;
		Static6.aBoolean6 = false;
		Static233.method3664(arg0);
		Static273.method4055(arg0);
		if (Static6.aBoolean6) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt7620 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt7620 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)I")
	public static int method4557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local10 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local10 * arg1;
		} else {
			return local10;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILjava/lang/String;IZIZJILjava/lang/String;Z)V")
	public static void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) boolean arg9) {
		@Pc(14) int[] local14 = new int[4];
		for (@Pc(16) int local16 = 0; local16 < 3; local16++) {
			local14[local16] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(35) Class3_Sub2 local35 = new Class3_Sub2(128);
		local35.method6001(10);
		local35.method6045((arg9 ? 1 : 0) | (arg3 ? 2 : 0) | (arg5 ? 4 : 0));
		local35.method5990(arg6);
		local35.method6008(local14[0]);
		local35.method6033(arg2);
		local35.method6008(local14[1]);
		local35.method6045(Static448.anInt7558);
		local35.method6001(arg1);
		local35.method6001(arg4);
		local35.method6008(local14[2]);
		local35.method6045(arg7);
		local35.method6045(arg0);
		local35.method6008(local14[3]);
		local35.method6036(Static259.aBigInteger1, Static454.aBigInteger2);
		@Pc(121) Class3_Sub2 local121 = new Class3_Sub2(350);
		local121.method6033(arg8);
		@Pc(134) int local134 = 8 - Static442.method5901(arg8) % 8;
		for (@Pc(136) int local136 = 0; local136 < local134; local136++) {
			local121.method6001((int) (Math.random() * 255.0D));
		}
		local121.method6012(local14);
		Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
		Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_8.anInt1611);
		Static302.aClass3_Sub2_Sub2_2.method6045(local35.anInt7620 + local121.anInt7620 + 2);
		Static302.aClass3_Sub2_Sub2_2.method6045(583);
		Static302.aClass3_Sub2_Sub2_2.method6026(local35.anInt7620, local35.aByteArray95);
		Static302.aClass3_Sub2_Sub2_2.method6026(local121.anInt7620, local121.aByteArray95);
		Static407.anInt7061 = -3;
		Static418.anInt7207 = 0;
		Static284.anInt5211 = 1;
		Static4.anInt817 = 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 + arg3;
		@Pc(14) int local14 = arg4 - arg5;
		for (@Pc(20) int local20 = arg3; local20 < local9; local20++) {
			Static15.method463(arg1, Static376.anIntArrayArray64[local20], arg2, arg0);
		}
		for (@Pc(36) int local36 = arg4; local36 > local14; local36--) {
			Static15.method463(arg1, Static376.anIntArrayArray64[local36], arg2, arg0);
		}
		@Pc(54) int local54 = arg5 + arg2;
		@Pc(59) int local59 = arg0 - arg5;
		for (@Pc(61) int local61 = local9; local61 <= local14; local61++) {
			@Pc(67) int[] local67 = Static376.anIntArrayArray64[local61];
			Static15.method463(arg1, local67, arg2, local54);
			Static15.method463(arg1, local67, local59, arg0);
		}
	}
}
