import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	public static int anInt4850;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
	public static final int[] anIntArray346 = new int[6];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIZ)Lclient!bq;")
	public static Class1_Sub5 method4234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class1_Sub5 local7 = new Class1_Sub5();
		local7.anInt1389 = arg2;
		local7.anInt1387 = arg1;
		Static484.aClass174_32.method4420(local7, (long) arg0);
		Static68.method1869(arg2);
		@Pc(33) Class309 local33 = Static80.method2005(arg0);
		if (local33 != null) {
			Static291.method4908(local33);
		}
		if (Static531.aClass309_14 != null) {
			Static291.method4908(Static531.aClass309_14);
			Static531.aClass309_14 = null;
		}
		Static441.method6402();
		if (local33 != null) {
			Static341.method5527(local33, !arg3);
		}
		if (!arg3) {
			Static387.method5827(arg2);
		}
		if (!arg3 && Static85.anInt2201 != -1) {
			Static16.method808(1, Static85.anInt2201);
		}
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IJ)V")
	public static void method4237(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	public static int method4240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static157.anIntArray272[arg1 & 0x3] : Static525.anIntArray765[arg1 & 0x3];
	}
}
