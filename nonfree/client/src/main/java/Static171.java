import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Lclient!jo;")
	public static Class96 aClass96_16 = new Class96();

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public static int anInt3357 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2952(@OriginalArg(1) int arg0) {
		if (arg0 >= 100000) {
			return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + Static85.aString66 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + Static125.aString85 + "</col>";
		} else {
			return "<col=ffff00>" + arg0 + "</col>";
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!jm;")
	public static Class1_Sub5_Sub8 method2953(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub5_Sub8 local6 = (Class1_Sub5_Sub8) Static24.aClass112_2.method2951((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = Static8.aClass119_1.method3235(arg0 & 0x7FFF, 0);
		} else {
			local30 = Static17.aClass119_4.method3235(arg0, 0);
		}
		local6 = new Class1_Sub5_Sub8();
		if (local30 != null) {
			local6.method2327(new Class1_Sub13(local30));
		}
		if (arg0 >= 32768) {
			local6.method2328();
		}
		Static24.aClass112_2.method2950((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!pl;I)Z")
	public static boolean method2957(@OriginalArg(0) Class136 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean366) {
			return false;
		} else if (!arg0.method3522()) {
			return false;
		} else if (Static242.aClass86_29.method2136((long) arg0.anInt4078) == null) {
			return Static260.aClass86_34.method2136((long) arg0.anInt4073) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(IJ)V")
	public static void method2958(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}
}
