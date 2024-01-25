import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!hl;")
	public static final Class96 aClass96_3 = new Class96(16);

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_40 = new Class214(83, 2);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)I")
	public static int method1077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static302.anIntArray455[arg0 & 0x3] : Static429.anIntArray597[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	public static void method1078() {
		Static179.aClient1.method1122();
		Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
		Static20.aClass214_216 = null;
		Static432.aClass214_220 = null;
		Static72.aClass214_68 = null;
		Static293.anInt5391 = 0;
		Static298.aClass214_171 = null;
		Static270.anInt5899 = 0;
		Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
		Static139.method2569();
		Static87.aClass152Array1 = null;
		Static6.anInt75 = 0;
		Static65.anInt1626 = 0;
		Static43.aString5 = null;
		Static422.anInt7300 = 0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
	public static void method1079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static176.anInt3462 && arg3 + arg2 <= Static418.anInt3023 && arg0 - arg3 >= Static162.anInt1715 && arg3 + arg0 <= Static55.anInt1319) {
			Static162.method1546(arg3, arg1, arg2, arg0);
		} else {
			Static451.method6169(arg2, arg0, arg1, arg3);
		}
	}
}
