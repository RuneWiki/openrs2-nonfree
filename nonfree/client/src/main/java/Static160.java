import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "Lclient!j;")
	public static Class41 aClass41_4;

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "Lclient!k;")
	public static Class47 aClass47_8;

	@OriginalMember(owner = "client!te", name = "sb", descriptor = "Lclient!na;")
	public static Class1_Sub2_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub2_Sub1_5;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1305 = Static120.method2057("mapfunction");

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1306 = Static120.method2057(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!te", name = "S", descriptor = "I")
	public static int anInt3643 = 0;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
	public static int anInt3650 = 0;

	@OriginalMember(owner = "client!te", name = "db", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1307 = Static120.method2057("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
	public static int anInt3652 = -1;

	@OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
	public static int anInt3656 = -1;

	@OriginalMember(owner = "client!te", name = "lb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1308 = Static120.method2057("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
	public static int anInt3657 = 0;

	@OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
	public static int anInt3660 = 0;

	@OriginalMember(owner = "client!te", name = "rb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1309 = Static120.method2057(" weitere Optionen");

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public static void method2786() {
		aClass81_1306 = null;
		aClass81_1305 = null;
		aClass81_1307 = null;
		aClass47_8 = null;
		aClass81_1308 = null;
		aClass81_1309 = null;
		aClass1_Sub2_Sub2_Sub2_Sub1_5 = null;
		aClass41_4 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)V")
	public static void method2787(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	public static void method2788() {
		Static52.aClass59_11.method1967();
		Static47.aClass59_9.method1967();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!gh;IZI)V")
	public static void method2790(@OriginalArg(0) Class1_Sub2_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt3024 && arg2 != -1) {
			@Pc(65) int local65 = Static73.method1277(arg2).anInt3800;
			if (local65 == 1) {
				arg0.anInt3013 = 0;
				arg0.anInt3060 = 0;
				arg0.anInt3037 = arg1;
				arg0.anInt3008 = 0;
			}
			if (local65 == 2) {
				arg0.anInt3060 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt3024 == -1 || Static73.method1277(arg2).anInt3789 >= Static73.method1277(arg0.anInt3024).anInt3789) {
			arg0.anInt3060 = 0;
			arg0.anInt3045 = arg0.anInt3011;
			arg0.anInt3024 = arg2;
			arg0.anInt3013 = 0;
			arg0.anInt3037 = arg1;
			arg0.anInt3008 = 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIII)V")
	public static void method2791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg1; local11 <= arg1 + arg3; local11++) {
			for (@Pc(15) int local15 = arg2; local15 <= arg0 + arg2; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static168.aByteArrayArrayArray9[0][local15][local11] = 127;
					if (local15 == arg2 && local15 > 0) {
						Static157.anIntArrayArrayArray7[0][local15][local11] = Static157.anIntArrayArrayArray7[0][local15 - 1][local11];
					}
					if (local15 == arg0 + arg2 && local15 < 103) {
						Static157.anIntArrayArrayArray7[0][local15][local11] = Static157.anIntArrayArrayArray7[0][local15 + 1][local11];
					}
					if (arg1 == local11 && local11 > 0) {
						Static157.anIntArrayArrayArray7[0][local15][local11] = Static157.anIntArrayArrayArray7[0][local15][local11 - 1];
					}
					if (local11 == arg3 + arg1 && local11 < 103) {
						Static157.anIntArrayArrayArray7[0][local15][local11] = Static157.anIntArrayArrayArray7[0][local15][local11 + 1];
					}
				}
			}
		}
	}
}
