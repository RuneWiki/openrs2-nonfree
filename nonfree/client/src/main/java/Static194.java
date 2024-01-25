import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	public static int anInt4052;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method3661() {
		@Pc(5) Class198 local5 = Static86.aClass198_74;
		synchronized (Static86.aClass198_74) {
			Static86.aClass198_74.method5209();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ICB)I")
	public static int method3662(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!eg;")
	public static Class54 method3665(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class54_Sub2");
			@Pc(10) Class54 local10 = (Class54) local6.getDeclaredConstructor().newInstance();
			local10.method1855(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class54_Sub1 local26 = new Class54_Sub1();
			local26.method1855(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I")
	public static int method3667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static274.anIntArray444[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static160.method3157(arg0, arg1, arg4, arg2, arg3, 0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public static void method3669(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 8);
		local8.method4902();
	}
}
