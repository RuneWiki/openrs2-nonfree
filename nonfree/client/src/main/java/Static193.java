import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!eq;")
	public static Class97 aClass97_56;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIII)V")
	public static void method3435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg0, 4);
		local8.method4393();
		local8.anInt5246 = arg1;
		local8.anInt5245 = arg3;
		local8.anInt5255 = arg2;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)V")
	public static void method3438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1009) {
			Static639.method8548(Static610.aClass188_9, arg1, arg2);
		} else if (arg0 == 1004) {
			Static639.method8548(Static409.aClass188_6, arg1, arg2);
		} else if (arg0 == 1003) {
			Static639.method8548(Static201.aClass188_2, arg1, arg2);
		} else if (arg0 == 1007) {
			Static639.method8548(Static305.aClass188_4, arg1, arg2);
		} else if (arg0 == 1010) {
			Static639.method8548(Static531.aClass188_8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZILjava/lang/String;)I")
	public static int method3439(@OriginalArg(2) String arg0) {
		return Static99.method1704(arg0, 16);
	}
}
