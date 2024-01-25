import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "Lclient!jt;")
	public static final Class167 aClass167_7 = new Class167(2);

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
	public static int anInt9172 = 0;

	@OriginalMember(owner = "client!rba", name = "w", descriptor = "Lclient!nha;")
	public static final Class229 aClass229_12 = new Class229("", 13);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7559(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static347.method5691("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IB)I")
	public static int method7561(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
