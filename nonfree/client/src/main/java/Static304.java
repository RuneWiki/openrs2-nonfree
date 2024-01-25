import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "Lclient!rk;")
	public static Class180 aClass180_85;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "[B")
	public static final byte[] aByteArray87 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "Lclient!bo;")
	public static final Class30 aClass30_10 = new Class30();

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString376 = "rating: ";

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLjava/lang/Object;Lclient!bd;)V")
	public static void method4915(@OriginalArg(1) Object arg0, @OriginalArg(2) Class21 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static129.method2634(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V")
	public static void method4916() {
		Static239.aClass103_46.method2678();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[[[Lclient!dg;)V")
	public static void method4917(@OriginalArg(1) Class49[][][] arg0) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(14) Class49[][] local14 = arg0[local9];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(19) int local19 = 0; local19 < local14[local16].length; local19++) {
					@Pc(26) Class49 local26 = local14[local16][local19];
					if (local26 != null) {
						if (local26.aClass22_Sub1_1 instanceof Interface1) {
							((Interface1) local26.aClass22_Sub1_1).method5358();
						}
						if (local26.aClass22_Sub5_2 instanceof Interface1) {
							((Interface1) local26.aClass22_Sub5_2).method5358();
						}
						if (local26.aClass22_Sub5_1 instanceof Interface1) {
							((Interface1) local26.aClass22_Sub5_1).method5358();
						}
						if (local26.aClass22_Sub4_1 instanceof Interface1) {
							((Interface1) local26.aClass22_Sub4_1).method5358();
						}
						if (local26.aClass22_Sub4_2 instanceof Interface1) {
							((Interface1) local26.aClass22_Sub4_2).method5358();
						}
						for (@Pc(76) Class47 local76 = local26.aClass47_3; local76 != null; local76 = local76.aClass47_2) {
							@Pc(80) Class22_Sub2 local80 = local76.aClass22_Sub2_1;
							if (local80 instanceof Interface1) {
								((Interface1) local80).method5358();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!bi;II)Ljava/lang/String;")
	public static String method4918(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1) {
		if (!Static45.method1034(arg0).method3755(arg1) && arg0.anObjectArray20 == null) {
			return null;
		} else if (arg0.aStringArray6 == null || arg1 >= arg0.aStringArray6.length || arg0.aStringArray6[arg1] == null || arg0.aStringArray6[arg1].trim().length() == 0) {
			return Static105.aBoolean439 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray6[arg1];
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIBI)V")
	public static void method4919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static253.anInt4924 = arg1;
		Static338.anInt6374 = arg0;
		Static28.anInt643 = arg3;
		Static76.anInt1893 = arg2;
	}
}
