import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
	public static int anInt2870;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_56 = new Class180(115, -1);

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!gea;")
	public static Class3_Sub11_Sub8 aClass3_Sub11_Sub8_1 = null;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "[I")
	public static final int[] anIntArray232 = new int[5];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!jp;I)Lclient!gu;")
	public static Class55_Sub2 method2608(@OriginalArg(0) Class3_Sub25 arg0) {
		return new Class55_Sub2(arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8607(), arg0.method8632());
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2609(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static101.method1778("\n", arg0, "%0a"));
	}
}
