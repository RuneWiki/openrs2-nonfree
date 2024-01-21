import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt4307;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1457 = Static49.method1293("Wordpack geladen)3");

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1458 = Static49.method1293("mapscene");

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1459 = Static49.method1293("headicons_prayer");

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[J")
	public static long[] aLongArray9 = new long[500];

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "[I")
	public static int[] anIntArray411 = new int[50];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method3302() {
		while (true) {
			@Pc(9) Class4 local9 = Static89.aClass4_9;
			@Pc(16) Class1_Sub13 local16;
			synchronized (Static89.aClass4_9) {
				local16 = (Class1_Sub13) Static36.aClass4_3.method173();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass76_Sub1_7.method3336(local16.aClass9_1, local16.aByteArray33, (int) local16.aLong147, false);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method3303(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static62.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.addKeyListener(Static156.aClass62_1);
		arg0.addFocusListener(Static156.aClass62_1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static106.method2213(arg2)) {
			Static35.method1519(arg0, arg5, arg3, arg1, -1, Static77.aClass39ArrayArray1[arg2], arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method3305() {
		aClass70_1457 = null;
		anIntArray411 = null;
		aLongArray9 = null;
		aClass70_1459 = null;
		aClass70_1458 = null;
	}
}
