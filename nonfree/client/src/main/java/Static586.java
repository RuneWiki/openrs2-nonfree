import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public static int anInt9337;

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "Lclient!sl;")
	public static final Class310 aClass310_40 = new Class310(8);

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "[Lclient!nda;")
	public static final Class226[] aClass226Array1 = new Class226[4];

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "[I")
	public static int[] anIntArray694 = new int[1];

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "Lclient!fda;")
	public static final Class93 aClass93_15 = new Class93(1);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method7739(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub34 local12 = Static374.method5522(Static122.aClass298_51, Static220.aClass287_2);
		local12.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(arg0) + 1);
		local12.aClass3_Sub11_Sub1_2.method3136(arg0);
		local12.aClass3_Sub11_Sub1_2.method3093(arg1);
		Static131.method2572(local12);
	}
}
