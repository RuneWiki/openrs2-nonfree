import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!ai;")
	public static Class7 aClass7_33;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_25;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1217 = Static200.method3116("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1220 = Static200.method3116("white:");

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1218 = aClass60_1220;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1219 = Static200.method3116("Your profile will be transferred in:");

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	public static int anInt3551 = 0;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1221 = aClass60_1219;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1222 = Static200.method3116("null");

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1223 = aClass60_1220;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIIIIII)V")
	public static void method2682(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= Static214.anInt4572 && Static130.anInt2847 >= arg1 && arg4 >= Static141.anInt3163 && Static200.anInt4273 >= arg0) {
			if (arg5 == 1) {
				Static36.method2892(arg4, arg3, arg1, arg0, arg2);
			} else {
				Static38.method663(arg2, arg3, arg5, arg0, arg4, arg1);
			}
		} else if (arg5 == 1) {
			Static130.method2189(arg4, arg3, arg2, arg0, arg1);
		} else {
			Static128.method2144(arg3, arg0, arg2, arg4, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	public static int method2684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method2685(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static85.aClass42_1);
		arg0.removeFocusListener(Static85.aClass42_1);
		Static214.anInt4567 = -1;
	}
}
