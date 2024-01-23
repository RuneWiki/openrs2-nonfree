import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray104;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	public static int anInt4643;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public static int anInt4636 = 0;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString148 = "Connection lost.";

	@OriginalMember(owner = "client!q", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!td;Lclient!td;ZII)I")
	public static int method3682(@OriginalArg(0) Class140_Sub1 arg0, @OriginalArg(1) Class140_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg3 == 1) {
			@Pc(11) int local11 = arg0.anInt5454;
			@Pc(14) int local14 = arg1.anInt5454;
			if (!arg2) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local14 - local11;
		} else if (arg3 == 2) {
			return Static82.method1469(arg1.method4277().aString61, Static244.anInt5333, arg0.method4277().aString61);
		} else if (arg3 == 3) {
			if (arg1.aString176.equals("-")) {
				if (arg0.aString176.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString176.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static82.method1469(arg1.aString176, Static244.anInt5333, arg0.aString176);
			}
		} else if (arg3 == 4) {
			return arg1.method4268() ? (arg0.method4268() ? 0 : 1) : (arg0.method4268() ? -1 : 0);
		} else if (arg3 == 5) {
			return arg1.method4270() ? (arg0.method4270() ? 0 : 1) : (arg0.method4270() ? -1 : 0);
		} else if (arg3 == 6) {
			return arg1.method4269() ? (arg0.method4269() ? 0 : 1) : (arg0.method4269() ? -1 : 0);
		} else if (arg3 == 7) {
			return arg1.method4266() ? (arg0.method4266() ? 0 : 1) : (arg0.method4266() ? -1 : 0);
		} else {
			return arg1.anInt5462 - arg0.anInt5462;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!h;IJIIII)Z")
	public static boolean method3684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static48.method1027(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
