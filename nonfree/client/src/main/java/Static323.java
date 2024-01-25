import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static323 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "[B")
	public static byte[] aByteArray95;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	public static int anInt6015;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_124 = new Class239(82, -2);

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!pm;")
	public static final Class223 aClass223_6 = new Class223();

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray20 = new byte[50][];

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public static int anInt6016 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIZIIIII)V")
	public static void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static7.anInt8119 && Static34.anInt603 >= arg2 && Static7.anInt8119 <= arg5 && arg5 <= Static34.anInt603 && arg0 >= Static7.anInt8119 && Static34.anInt603 >= arg0 && Static7.anInt8119 <= arg6 && arg6 <= Static34.anInt603 && Static328.anInt6154 <= arg7 && Static394.anInt7462 >= arg7 && arg1 >= Static328.anInt6154 && Static394.anInt7462 >= arg1 && arg8 >= Static328.anInt6154 && arg8 <= Static394.anInt7462 && Static328.anInt6154 <= arg3 && arg3 <= Static394.anInt7462) {
			Static36.method707(arg3, arg7, arg5, arg2, arg1, arg6, arg8, arg4, arg0);
		} else {
			Static541.method7776(arg1, arg4, arg7, arg8, arg3, arg5, arg6, arg0, arg2);
		}
	}
}
