import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "Lclient!v;")
	private static Class76 aClass76_223 = Static134.method2017("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "Lclient!v;")
	public static Class76 aClass76_221 = aClass76_223;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "Lclient!v;")
	public static Class76 aClass76_222 = Static134.method2017(" (X");

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "Lclient!v;")
	private static Class76 aClass76_224 = Static134.method2017("Loading fonts )2 ");

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "Lclient!v;")
	public static Class76 aClass76_225 = Static134.method2017("scrollen:");

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lclient!v;")
	public static Class76 aClass76_226 = aClass76_224;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public static void method367(@OriginalArg(1) boolean arg0) {
		if (Static1.aClass75_1 == null) {
			return;
		}
		try {
			@Pc(11) Class4_Sub10 local11 = new Class4_Sub10(4);
			local11.method600(arg0 ? 2 : 3);
			local11.method577(0);
			Static1.aClass75_1.method1849(4, local11.aByteArray17);
		} catch (@Pc(32) IOException local32) {
			try {
				Static1.aClass75_1.method1842();
			} catch (@Pc(37) Exception local37) {
			}
			Static1.aClass75_1 = null;
			Static85.anInt2051++;
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	public static void method370() {
		aClass76_224 = null;
		anIntArray80 = null;
		aClass76_221 = null;
		aClass76_225 = null;
		aClass76_222 = null;
		aClass76_226 = null;
		aClass76_223 = null;
	}
}
