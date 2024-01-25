import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_20 = new Class132(64);

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_3 = new Class258("WTI", 5);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)Z")
	public static boolean method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static135.method1996(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static460.anInt7074;
			@Pc(14) int local14 = arg2 << Static460.anInt7074;
			return Static387.method4966(local10 + 1, Static345.aClass162Array3[arg0].ua(arg1, arg2) + arg3, local14 + 1) && Static387.method4966(local10 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1 + 1, arg2) + arg3, local14 + 1) && Static387.method4966(local10 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1 + 1, arg2 + 1) + arg3, local14 + Static67.anInt1221 - 1) && Static387.method4966(local10 + 1, Static345.aClass162Array3[arg0].ua(arg1, arg2 + 1) + arg3, local14 + Static67.anInt1221 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
	public static void method2368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class22 local3 = new Class22();
		local3.anInt556 = arg1 >> Static460.anInt7074;
		local3.anInt559 = arg2 >> Static460.anInt7074;
		local3.anInt569 = arg3 >> Static460.anInt7074;
		local3.anInt561 = arg4 >> Static460.anInt7074;
		local3.anInt555 = arg0;
		local3.anInt567 = arg1;
		local3.anInt570 = arg2;
		local3.anInt572 = arg3;
		local3.anInt560 = arg4;
		local3.anInt565 = arg5;
		local3.anInt553 = arg6;
		Static328.aClass22Array2[Static10.anInt151++] = local3;
	}
}
