import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
	public static final int[] anIntArray418 = new int[14];

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_99 = new Class200(39, -2);

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method6037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (Static262.aClass3_Sub27_12.aClass21_Sub14_4.method5405() != 0 && arg3 != 0 && Static393.anInt7276 < 50 && arg0 != -1) {
			Static508.aClass371Array1[Static393.anInt7276++] = new Class371((byte) 2, arg0, arg3, arg2, arg1, arg4, arg5, null);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z")
	public static boolean method6039(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static384.method6205(arg0, arg1) | Static127.method2501(arg0, arg1) | Static242.method3966(arg0, arg1)) & Static488.method7261(arg1, arg0);
	}
}
