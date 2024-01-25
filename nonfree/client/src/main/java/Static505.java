import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Lclient!jp;")
	public static Class177 aClass177_2;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "Lclient!oq;")
	public static Class1_Sub6_Sub11 aClass1_Sub6_Sub11_3;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "[I")
	public static final int[] anIntArray649 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public static int anInt8616 = 0;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "[B")
	public static final byte[] aByteArray91 = new byte[2048];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7052(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class1_Sub11 local22 = Static276.method3885(Static43.aClass70_12, Static481.aClass276_2);
			local22.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(arg0));
			local22.aClass1_Sub35_Sub2_1.method5761(arg0);
			Static48.method743(local22);
		}
	}
}
