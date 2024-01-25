import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cq", name = "G", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_58 = new Class123(92, 12);

	@OriginalMember(owner = "client!cq", name = "I", descriptor = "Lclient!naa;")
	public static final Class218 aClass218_5 = new Class218();

	@OriginalMember(owner = "client!cq", name = "K", descriptor = "[I")
	public static final int[] anIntArray66 = new int[3];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lclient!rda;")
	public static Class279 method1789() {
		return new Class279(1, false);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method1790(@OriginalArg(0) byte[] arg0) {
		return Static151.method2838(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)V")
	public static void method1791(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(12, arg0);
		local8.method7364();
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(IIII)V")
	public static void method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(40) String local40 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local40);
		Static513.method6930(true, local40, false);
	}
}
