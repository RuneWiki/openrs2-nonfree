import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lp", name = "cb", descriptor = "I")
	public static int anInt3805;

	@OriginalMember(owner = "client!lp", name = "hb", descriptor = "I")
	public static int anInt3810;

	@OriginalMember(owner = "client!lp", name = "U", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_91 = new Class211(88, 6);

	@OriginalMember(owner = "client!lp", name = "bb", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!lp", name = "eb", descriptor = "I")
	public static int anInt3807 = -1;

	@OriginalMember(owner = "client!lp", name = "gb", descriptor = "I")
	public static int anInt3809 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!qk;")
	public static Class203 method3043(@OriginalArg(1) Component arg0) {
		return new Class203_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method3045(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static219.method4783(arg1, local13);
		} else if (arg0 instanceof Class89) {
			@Pc(25) Class89 local25 = (Class89) arg0;
			return local25.method5150(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIZ)V")
	public static void method3046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static260.method3501(arg1)) {
			Static457.method5721(arg0, arg2, -1, arg3, Static151.aClass16ArrayArray1[arg1]);
		}
	}
}
