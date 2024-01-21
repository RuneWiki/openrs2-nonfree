import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1020 = Static38.method685("wave:");

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1017 = aClass6_1020;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!vb;")
	public static Class84 aClass84_12 = new Class84();

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1018 = aClass6_1020;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1019 = Static38.method685("(Y<)4col>");

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "[I")
	public static int[] anIntArray312 = new int[32768];

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
	public static volatile int anInt3474 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2283(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static74.aClass46_1);
		arg0.addMouseMotionListener(Static74.aClass46_1);
		arg0.addFocusListener(Static74.aClass46_1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
	public static void method2284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg0);
		@Pc(21) Class2_Sub3_Sub18 local21 = (Class2_Sub3_Sub18) Static86.aClass16_6.method479(local11);
		if (local21 != null) {
			Static36.aClass60_2.method1871(local21);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method2285() {
		for (@Pc(16) Class2_Sub21 local16 = (Class2_Sub21) Static131.aClass84_11.method2694(); local16 != null; local16 = (Class2_Sub21) Static131.aClass84_11.method2697()) {
			if (local16.aClass2_Sub3_Sub6_1 != null) {
				local16.method2339();
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I")
	public static int method2286(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method2287() {
		aClass6_1017 = null;
		anIntArray312 = null;
		aClass6_1018 = null;
		aClass6_1019 = null;
		aClass6_1020 = null;
		aClass84_12 = null;
	}
}
