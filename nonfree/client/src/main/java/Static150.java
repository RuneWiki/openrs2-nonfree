import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!oba;")
	public static Class3_Sub11_Sub14 aClass3_Sub11_Sub14_2;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_82 = new Class218(41, 3);

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Lclient!hv;")
	public static final Class146 aClass146_21 = new Class146(4, 1);

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
	public static final int[] anIntArray491 = new int[1000];

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_122 = new Class180(69, 6);

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method5038() {
		@Pc(10) Class3_Sub23 local10;
		for (local10 = (Class3_Sub23) Static482.aClass338_192.method8177(); local10 != null; local10 = (Class3_Sub23) Static482.aClass338_192.method8168()) {
			Static321.method4915(false, local10);
		}
		for (local10 = (Class3_Sub23) Static165.aClass338_227.method8177(); local10 != null; local10 = (Class3_Sub23) Static165.aClass338_227.method8168()) {
			Static321.method4915(true, local10);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5040(@OriginalArg(1) String arg0) {
		if (Class6_Sub8.aString37.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class6_Sub8.aString37.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class6_Sub8.aString37.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public static void method5041(@OriginalArg(0) int arg0) {
		Static674.anInt10876 = arg0;
		Static669.aClass165_84.method4403();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!d;Ljava/awt/Canvas;BI)Lclient!ha;")
	public static Class13 method5042(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) int arg3) {
		return new oa(arg2, arg1, arg0, arg3);
	}
}
