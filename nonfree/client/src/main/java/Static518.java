import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard3;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIZB)V")
	public static void method8570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 0) {
			Static631.method8821(false);
		} else {
			Static347.anInt6430 = Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541();
			Static155.method2506(0, true);
		}
		Static541.aBoolean700 = arg3;
		Static526.anInt9138 = arg0;
		Static12.anInt94 = arg2;
		Static498.method7302(arg1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBIIIII)I")
	public static int method8573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(14) int local14 = arg2;
			arg2 = arg1;
			arg1 = local14;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return 1 + 7 - arg2 - arg5;
		} else if (local7 == 2) {
			return 7 + 1 - arg3 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIB)V")
	public static void method8575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static26.method487(arg1, arg0);
	}
}
