import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public static int anInt3302 = -1;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!vk;")
	public static final Class207 aClass207_24 = new Class207(32);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/lang/Object;Lclient!wd;)V")
	public static void method2800(@OriginalArg(1) Object arg0, @OriginalArg(2) Class215 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static163.method2863(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B[[[Lclient!gk;)V")
	public static void method2802(@OriginalArg(1) Class83[][][] arg0) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class83[][] local14 = arg0[local8];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < local14[local16].length; local20++) {
					@Pc(28) Class83 local28 = local14[local16][local20];
					if (local28 != null) {
						if (local28.aClass10_Sub3_1 instanceof Interface4) {
							((Interface4) local28.aClass10_Sub3_1).method5450();
						}
						if (local28.aClass10_Sub4_2 instanceof Interface4) {
							((Interface4) local28.aClass10_Sub4_2).method5450();
						}
						if (local28.aClass10_Sub4_1 instanceof Interface4) {
							((Interface4) local28.aClass10_Sub4_1).method5450();
						}
						if (local28.aClass10_Sub2_1 instanceof Interface4) {
							((Interface4) local28.aClass10_Sub2_1).method5450();
						}
						if (local28.aClass10_Sub2_2 instanceof Interface4) {
							((Interface4) local28.aClass10_Sub2_2).method5450();
						}
						for (@Pc(78) Class59 local78 = local28.aClass59_2; local78 != null; local78 = local78.aClass59_1) {
							@Pc(83) Class10_Sub1 local83 = local78.aClass10_Sub1_1;
							if (local83 instanceof Interface4) {
								((Interface4) local83).method5450();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)V")
	public static void method2803(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(5, arg0);
		local12.method4782();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2805(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static112.aClass220_1);
		arg0.removeMouseMotionListener(Static112.aClass220_1);
		arg0.removeFocusListener(Static112.aClass220_1);
		Static140.anInt2707 = 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	public static void method2806(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub15 local14 = Static17.method307(12, arg0);
		local14.method4782();
	}
}
