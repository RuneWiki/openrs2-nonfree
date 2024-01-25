import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[Lclient!s;")
	public static Class51[] aClass51Array2;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	public static int anInt8240 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public static void method6861(@OriginalArg(1) int arg0) {
		Static476.anInt8289 = arg0;
		Static67.aClass264_13.method6360();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)B")
	public static byte method6862(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILclient!wia;Lclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static Class137 method6864(@OriginalArg(1) int arg0, @OriginalArg(2) Class386 arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		if (arg3 != null) {
			@Pc(17) Dimension local17 = arg3.getSize();
			local10 = local17.width;
			local12 = local17.height;
		}
		return Static204.method7896(arg3, local10, arg0, arg1, local12, arg4, arg2);
	}
}
