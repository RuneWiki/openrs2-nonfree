import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
	public static int anInt6217;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
	public static int anInt6219;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
	public static int anInt6211 = 0;

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_192 = new Class107(102, 6);

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_9 = new Class200("", 14);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
	public static void method5177(@OriginalArg(1) byte arg0) {
		if (Static22.aByteArrayArrayArray10 == null) {
			Static22.aByteArrayArrayArray10 = new byte[4][Static195.anInt3537][Static118.anInt2419];
		}
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			for (@Pc(20) int local20 = 0; local20 < Static195.anInt3537; local20++) {
				for (@Pc(23) int local23 = 0; local23 < Static118.anInt2419; local23++) {
					Static22.aByteArrayArrayArray10[local17][local20][local23] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ig;I)Z")
	public static boolean method5180(@OriginalArg(0) Interface5 arg0) {
		@Pc(10) Class129 local10 = Static349.aClass115_4.method2766(arg0.method5176());
		if (local10.anInt3493 == -1) {
			return true;
		} else {
			@Pc(24) Class58 local24 = Static343.aClass217_15.method4901(local10.anInt3493);
			return local24.anInt1855 == -1 ? true : local24.method1604();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
	public static int method5181(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!kk;I)V")
	public static void method5182(@OriginalArg(0) int arg0, @OriginalArg(1) Class31_Sub2_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(16) int local16 = 0;
		if (Static378.anInt4244 < arg1.anInt7351) {
			Static126.method2241(arg1);
		} else if (Static378.anInt4244 > arg1.anInt7312) {
			Static137.method2331(false, arg1);
			local16 = Static43.anInt896;
			local7 = Static294.anInt7294;
		} else {
			Static207.method3308(arg1);
		}
		if (arg1.anInt7300 < 128 || arg1.anInt7298 < 128 || Static195.anInt3537 * 128 - 128 <= arg1.anInt7300 || arg1.anInt7298 >= (Static118.anInt2419 - 1) * 128) {
			arg1.anInt7365 = -1;
			local7 = -1;
			arg1.anInt7368 = -1;
			local16 = 0;
			arg1.anInt7321 = -1;
			arg1.anInt7351 = 0;
			arg1.anInt7312 = 0;
			arg1.anInt7300 = arg1.anIntArray658[0] * 128 + arg1.method5989() * 64;
			arg1.anInt7298 = arg1.anIntArray657[0] * 128 + arg1.method5989() * 64;
			arg1.method5980();
		}
		if (Static452.aClass31_Sub2_Sub1_Sub1_2 == arg1 && (arg1.anInt7300 < 1536 || arg1.anInt7298 < 1536 || Static195.anInt3537 * 128 - 1536 <= arg1.anInt7300 || arg1.anInt7298 >= Static118.anInt2419 * 128 - 1536)) {
			arg1.anInt7321 = -1;
			local7 = -1;
			arg1.anInt7351 = 0;
			local16 = 0;
			arg1.anInt7365 = -1;
			arg1.anInt7312 = 0;
			arg1.anInt7368 = -1;
			arg1.anInt7300 = arg1.anIntArray658[0] * 128 + arg1.method5989() * 64;
			arg1.anInt7298 = arg1.anIntArray657[0] * 128 + arg1.method5989() * 64;
			arg1.method5980();
		}
		@Pc(225) int local225 = Static223.method3423(arg1);
		Static177.method2837(local225, local16, arg1, local7);
		Static169.method2681(arg1);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public static void method5184(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(6, arg0);
		local8.method1775();
	}
}
