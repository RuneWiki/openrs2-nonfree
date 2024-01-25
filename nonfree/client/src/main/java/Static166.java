import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!go", name = "N", descriptor = "Lclient!tb;")
	public static Class278 aClass278_2;

	@OriginalMember(owner = "client!go", name = "P", descriptor = "I")
	public static int anInt3343;

	@OriginalMember(owner = "client!go", name = "D", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_79 = new Class150(112, 0);

	@OriginalMember(owner = "client!go", name = "K", descriptor = "Lclient!sq;")
	public static final Class273 aClass273_1 = new Class273();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;Lclient!ae;IB)Lclient!ei;")
	public static Class83 method2947(@OriginalArg(0) String arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg1.method285(arg0);
		}
		@Pc(38) Class83 local38;
		if (arg2 == 1) {
			try {
				Static555.method5218(arg1.anApplet1, new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, "openjs");
				local38 = new Class83();
				local38.anInt2495 = 1;
				return local38;
			} catch (@Pc(44) Throwable local44) {
				local38 = new Class83();
				local38.anInt2495 = 2;
				return local38;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local38 = new Class83();
				local38.anInt2495 = 1;
				return local38;
			} catch (@Pc(85) Exception local85) {
				local38 = new Class83();
				local38.anInt2495 = 2;
				return local38;
			}
		} else if (arg2 == 3) {
			try {
				Static555.method5217(arg1.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local38 = new Class83();
				local38.anInt2495 = 1;
				return local38;
			} catch (@Pc(127) Exception local127) {
				local38 = new Class83();
				local38.anInt2495 = 2;
				return local38;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
