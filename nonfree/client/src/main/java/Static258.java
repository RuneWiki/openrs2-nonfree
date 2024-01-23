import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString177 = null;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString178 = " is already on your friend list.";

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V")
	public static void method4024() {
		Static115.aClass175_18.method4288(5);
		Static97.aClass175_15.method4288(5);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!uo;Ljava/awt/Frame;I)V")
	public static void method4025(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class153 local10 = arg0.method4368(arg1);
			while (local10.anInt4614 == 0) {
				Static16.method242(10L);
			}
			if (local10.anInt4614 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static16.method242(100L);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIII)Z")
	public static boolean method4027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static17.method273(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static193.method3324(local10 + 1, Static280.anIntArrayArrayArray13[arg0][arg1][arg2] + arg3, local14 + 1) && Static193.method3324(local10 + 128 - 1, Static280.anIntArrayArrayArray13[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static193.method3324(local10 + 128 - 1, Static280.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static193.method3324(local10 + 1, Static280.anIntArrayArrayArray13[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
