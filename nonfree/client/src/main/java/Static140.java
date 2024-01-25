import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_4 = new Class206(9, 7);

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString44 = "";

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static void method2345() {
		if (Static164.aClass33_1 != null) {
			Static164.aClass33_1.method8229();
		}
		if (Static261.aClass33_4 != null) {
			Static261.aClass33_4.method8229();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2347(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!rba;)Ljava/lang/String;")
	public static String method2349(@OriginalArg(2) Class3_Sub28 arg0) {
		try {
			@Pc(12) int local12 = arg0.method5331();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt6241 += Static301.aClass151_1.method3700(0, arg0.aByteArray50, local12, arg0.anInt6241, local20);
			return Static358.method5137(local20, local12, 0);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}
