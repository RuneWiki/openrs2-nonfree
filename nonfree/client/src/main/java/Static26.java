import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "Lclient!sc;")
	public static Class107 aClass107_176 = Static231.method3737("huffman");

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "Lclient!sc;")
	public static Class107 aClass107_177 = Static231.method3737("null");

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lclient!sc;")
	private static Class107 aClass107_178 = Static231.method3737("Loading )2 please wait)3");

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "Lclient!sc;")
	public static Class107 aClass107_179 = aClass107_178;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "Lclient!sc;")
	public static Class107 aClass107_180 = Static231.method3737("zap");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == arg1) {
			Static203.method182(arg6, arg5, arg0, arg1, arg3, arg4);
		} else if (arg5 - arg1 >= Static99.anInt915 && Static38.anInt784 >= arg5 + arg1 && Static223.anInt4869 <= arg6 - arg2 && arg2 + arg6 <= Static47.anInt1057) {
			Static38.method717(arg0, arg4, arg6, arg2, arg1, arg3, arg5);
		} else {
			Static163.method2614(arg1, arg6, arg2, arg4, arg0, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)I")
	public static int method476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + ((arg1 >>> 31) + arg1) % arg0;
	}
}
