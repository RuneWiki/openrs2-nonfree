import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	public static int anInt124 = 1;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "I")
	public static int anInt125 = 0;

	@OriginalMember(owner = "client!af", name = "C", descriptor = "Lclient!ai;")
	private static Class6 aClass6_56 = Static38.method685("Please enter your password)3");

	@OriginalMember(owner = "client!af", name = "J", descriptor = "[I")
	public static int[] anIntArray5 = new int[5];

	@OriginalMember(owner = "client!af", name = "K", descriptor = "I")
	public static int anInt131 = 1;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_57 = aClass6_56;

	@OriginalMember(owner = "client!af", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_58 = Static38.method685("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method80() {
		for (@Pc(10) Class2_Sub3_Sub5_Sub4 local10 = (Class2_Sub3_Sub5_Sub4) Static154.aClass84_13.method2694(); local10 != null; local10 = (Class2_Sub3_Sub5_Sub4) Static154.aClass84_13.method2697()) {
			if (Static36.anInt1020 != local10.anInt2929 || local10.aBoolean122) {
				local10.method2808();
			} else if (Static107.anInt2559 >= local10.anInt2937) {
				local10.method1963(Static131.anInt3038);
				if (local10.aBoolean122) {
					local10.method2808();
				} else {
					Static30.aClass44_1.method1267(local10.anInt2929, local10.anInt2935, local10.anInt2940, local10.anInt2941, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V")
	public static void method81() {
		aClass6_57 = null;
		aClass6_58 = null;
		aClass6_56 = null;
		anIntArray5 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lclient!ai;")
	public static Class6 method83(@OriginalArg(1) int arg0) {
		@Pc(3) Class6 local3 = new Class6();
		local3.aByteArray2 = new byte[arg0];
		local3.anInt165 = 0;
		return local3;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
	public static void method86() {
		@Pc(5) Object local5 = Static135.anObject4;
		synchronized (Static135.anObject4) {
			if (Static121.anInt2816 != 0) {
				Static121.anInt2816 = 1;
				try {
					Static135.anObject4.wait();
				} catch (@Pc(15) InterruptedException local15) {
				}
			}
		}
	}
}
