import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "Lclient!vh;")
	public static Class250 aClass250_41;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_46 = new Class84("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "[I")
	public static final int[] anIntArray274 = new int[1];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vf;")
	public static RuntimeException_Sub1 method2784(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString56 = local12.aString56 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Lclient!ub;")
	public static Class234 method2786(@OriginalArg(0) int arg0) {
		@Pc(8) Class234[] local8 = Static66.method1137();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class234 local16 = local8[local10];
			if (local16.anInt6927 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	public static void method2787() {
		if (Static211.aBoolean268) {
			return;
		}
		Static255.aBoolean311 = true;
		Static211.aBoolean268 = true;
		if (Static389.aClass128_Sub1_1.aBoolean233) {
			Static274.aFloat78 = (int) Static274.aFloat78 - 65 & 0xFFFFFF80;
		} else {
			Static107.aFloat33 += (-24.0F - Static107.aFloat33) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V")
	public static void method2788() {
		if (Static151.anInt2579 == 10) {
			Static455.method4431(28);
		}
		if (Static151.anInt2579 == 30) {
			Static455.method4431(25);
		}
	}
}
