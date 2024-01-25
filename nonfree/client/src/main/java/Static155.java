import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3065(@OriginalArg(0) String arg0) {
		Static548.method7725(0, arg0, 0, "", "", "");
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ni;I)V")
	public static void method3067(@OriginalArg(0) Class223 arg0) {
		Static432.anInt7908 = arg0.method5959("p11_full");
		Static473.anInt8397 = arg0.method5959("p12_full");
		Static59.anInt1888 = arg0.method5959("b12_full");
	}
}
