import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "Lclient!kp;")
	public static Class192 aClass192_10;

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "Lclient!om;")
	public static Class246 aClass246_251;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Z")
	public static boolean aBoolean695;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "Lclient!aea;")
	public static Class3_Sub5 aClass3_Sub5_2;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)V")
	public static void method7335() {
		Static245.aClass10_22.method262();
		Static19.aClass10_3.method262();
		Static338.aClass10_34.method262();
		Static392.aClass10_42.method262();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBII)Lclient!mu;")
	public static Class3_Sub34 method7337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub34 local5 = null;
		if (arg2 == 0) {
			local5 = Static374.method5522(Static148.aClass298_60, Static220.aClass287_2);
		}
		if (arg2 == 1) {
			local5 = Static374.method5522(Static278.aClass298_104, Static220.aClass287_2);
		}
		local5.aClass3_Sub11_Sub1_2.method3132(arg0 + Static463.anInt7588);
		local5.aClass3_Sub11_Sub1_2.method3132(Static529.anInt8344 + arg1);
		local5.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
		Static77.aBoolean168 = false;
		Static341.anInt6021 = arg1;
		Static329.anInt5894 = arg0;
		Static468.method6468();
		return local5;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!oea;I)V")
	public static void method7338(@OriginalArg(0) Class3_Sub6 arg0) {
		arg0.aBoolean323 = false;
		if (arg0.aClass3_Sub20_5 != null) {
			arg0.aClass3_Sub20_5.anInt2619 = 0;
		}
		for (@Pc(18) Class3_Sub6 local18 = arg0.method3731(); local18 != null; local18 = arg0.method3730()) {
			method7338(local18);
		}
	}
}
