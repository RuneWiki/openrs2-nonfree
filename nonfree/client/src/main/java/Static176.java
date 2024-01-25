import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
	public static int anInt3080;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_52 = new Class186(5, -1);

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method2767(@OriginalArg(1) String arg0) {
		return Static369.method5139(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)Z")
	public static boolean method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static275.method4186(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static301.anInt2759;
			@Pc(14) int local14 = arg2 << Static301.anInt2759;
			return Static365.method3018(local10 + 1, Static420.aClass84Array4[arg0].method5322(arg1, arg2) + arg3, local14 + 1) && Static365.method3018(local10 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1 + 1, arg2) + arg3, local14 + 1) && Static365.method3018(local10 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1 + 1, arg2 + 1) + arg3, local14 + Static22.anInt397 - 1) && Static365.method3018(local10 + 1, Static420.aClass84Array4[arg0].method5322(arg1, arg2 + 1) + arg3, local14 + Static22.anInt397 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!ha;)Ljava/lang/String;")
	public static String method2770(@OriginalArg(1) Class6_Sub15 arg0) {
		return Static290.method4314(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
	public static void method2771(@OriginalArg(1) int arg0) {
		Static392.anInt6525 = arg0;
		@Pc(7) Class220 local7 = Static61.aClass220_4;
		synchronized (Static61.aClass220_4) {
			Static61.aClass220_4.method4999();
		}
		local7 = Static135.aClass220_16;
		synchronized (Static135.aClass220_16) {
			Static135.aClass220_16.method4999();
		}
	}
}
