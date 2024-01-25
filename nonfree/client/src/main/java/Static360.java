import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!uh;")
	public static Class6_Sub4_Sub4 aClass6_Sub4_Sub4_2;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[Lclient!rr;")
	public static final Class68_Sub1[] aClass68_Sub1Array2 = new Class68_Sub1[30];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)V")
	public static void method5332(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lclient!uj;")
	public static Class6_Sub2_Sub15 method5333() {
		return Static7.aClass6_Sub2_Sub15_2;
	}
}
