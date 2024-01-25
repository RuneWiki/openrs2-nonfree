import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!pu;")
	public static Class270 aClass270_76;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_12 = new Class297(4, 1);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method5402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 >= Static270.anInt4759 && arg6 <= Static162.anInt2935 && Static514.anInt8722 <= arg0 && Static451.anInt7775 >= arg4) {
			Static243.method3637(arg3, arg0, arg6, arg1, arg5, arg4, arg2);
		} else {
			Static492.method7383(arg6, arg2, arg5, arg0, arg1, arg4, arg3);
		}
	}
}
