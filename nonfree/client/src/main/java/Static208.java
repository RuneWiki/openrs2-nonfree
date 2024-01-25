import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static208 {

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_15 = new Class118(13);

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
	public static int anInt5310 = -1;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIB)Z")
	public static boolean method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static392.aByteArrayArrayArray16[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static392.aByteArrayArrayArray16[arg2][arg1][arg0] & 0x10) == 0) {
			return Static381.method5505(arg2, arg0, arg1) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IBILclient!np;)V")
	public static void method4775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class264 arg2) {
		Static307.aClass264ArrayArray1[arg0][arg1] = arg2;
	}
}
