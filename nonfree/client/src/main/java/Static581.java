import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public static final int anInt8142 = 1338;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!oca;")
	public static RuntimeException_Sub1 method6764(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString46 = local12.aString46 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(JJ)J")
	public static long method6765(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIILclient!sp;Lclient!sp;III)V")
	public static void method6766(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class41_Sub2_Sub1_Sub4 arg2, @OriginalArg(6) Class41_Sub2_Sub1_Sub4 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg3.method7864();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class14 local20 = (Class14) Static420.aClass6_52.method92((long) local7);
		if (local20 == null) {
			@Pc(27) Class279[] local27 = Static604.method6156(Static552.aClass322_150, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static505.aClass45_11.method7398(local27[0], true);
			Static420.aClass6_52.method106((long) local7, local20);
		}
		Static432.method6083(arg2.aByte117, arg6 >> 1, arg2.anInt9444, arg4 >> 1, arg2.anInt9442, 0, arg2.method7858() * 256);
		@Pc(75) int local75 = Static22.anIntArray20[0] + arg1 - 18;
		@Pc(85) int local85 = arg0 + Static22.anIntArray20[1] - 54 - 16;
		@Pc(93) int local93 = local75 + arg5 / 4 * 18;
		@Pc(101) int local101 = local85 + arg5 % 4 * 18;
		local20.method7680(local93, local101);
		if (arg3 == arg2) {
			Static505.aClass45_11.method7379(-256, 18, 18, local101 - 1, local93 - 1);
		}
		@Pc(128) Class41_Sub5 local128 = Static536.method7154();
		local128.anInt7028 = local93;
		local128.aClass41_Sub2_Sub1_Sub4_1 = arg3;
		local128.anInt7027 = local101 + 16;
		local128.anInt7030 = local101;
		local128.anInt7024 = local93 + 16;
		Static564.aClass178_23.method4166(local128);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIII)V")
	public static void method6767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static405.aClass3_Sub3_Sub1_1.anInt7553 * arg2 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static434.method6090(arg1, Static121.aClass322_45, local6);
			Static6.aBoolean1 = true;
		}
	}
}
