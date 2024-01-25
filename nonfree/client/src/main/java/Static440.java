import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_110 = new Class96(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_183 = new Class151(20);

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt7674 = -1;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)V")
	public static void method5906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static47.anInt762 <= arg4 && Static60.anInt1086 >= arg1 && arg2 >= Static357.anInt6537 && Static85.anInt1517 >= arg5) {
			if (arg3 == 1) {
				Static249.method3575(arg1, arg4, arg2, arg5, arg0);
			} else {
				Static418.method5657(arg3, arg5, arg4, arg0, arg1, arg2);
			}
		} else if (arg3 == 1) {
			Static201.method3107(arg0, arg2, arg4, arg5, arg1);
		} else {
			Static185.method2964(arg2, arg3, arg4, arg0, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I")
	public static int method5907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static152.aByteArrayArray13 == null ? 0 : Static152.aByteArrayArray13[arg0][arg1] & 0xFF;
	}
}
