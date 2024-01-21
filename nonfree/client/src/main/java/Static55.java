import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "Lclient!jg;")
	public static Class44 aClass44_9;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_479 = Static65.method1172("Neuer Benutzer");

	@OriginalMember(owner = "client!h", name = "w", descriptor = "I")
	public static volatile int anInt1435 = 0;

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_481 = Static65.method1172("compass");

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "I")
	public static volatile int anInt1456 = 0;

	@OriginalMember(owner = "client!h", name = "Jc", descriptor = "Lclient!kb;")
	private static Class46 aClass46_488 = Static65.method1172("Too many connections from your address)3");

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_484 = aClass46_488;

	@OriginalMember(owner = "client!h", name = "Lc", descriptor = "Lclient!kb;")
	private static Class46 aClass46_490 = Static65.method1172("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!h", name = "Kb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_485 = aClass46_490;

	@OriginalMember(owner = "client!h", name = "Vb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_487 = Static65.method1172("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method1027() {
		aClass46_481 = null;
		aClass46_485 = null;
		aClass46_487 = null;
		aClass46_488 = null;
		aClass46_490 = null;
		aClass46_479 = null;
		aClass46_484 = null;
		aClass44_9 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub24 local7 = null;
		for (@Pc(12) Class3_Sub24 local12 = (Class3_Sub24) Static1.aClass59_1.method1731(); local12 != null; local12 = (Class3_Sub24) Static1.aClass59_1.method1734()) {
			if (arg5 == local12.anInt3523 && local12.anInt3513 == arg1 && arg2 == local12.anInt3514 && arg8 == local12.anInt3516) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub24();
			local7.anInt3513 = arg1;
			local7.anInt3516 = arg8;
			local7.anInt3514 = arg2;
			local7.anInt3523 = arg5;
			Static12.method2888(local7);
			Static1.aClass59_1.method1730(local7);
		}
		local7.anInt3519 = arg6;
		local7.anInt3512 = arg7;
		local7.anInt3515 = arg4;
		local7.anInt3524 = arg3;
		local7.anInt3521 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IJ)V")
	public static void method1032(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILclient!jg;)[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] method1037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2) {
		return Static122.method2089(arg0, arg2, arg1) ? Static113.method1448() : null;
	}
}
