import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
	public static final int[] anIntArray469 = new int[1000];

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[Lclient!mc;")
	public static Class182[] aClass182Array1 = new Class182[50];

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
	public static final int[] anIntArray470 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
	public static final int[] anIntArray471 = new int[1000];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!pq;BILjava/lang/String;)Lclient!vs;")
	public static Class311 method5434(@OriginalArg(0) Class229 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method6070(arg2);
		}
		@Pc(39) Class311 local39;
		if (arg1 == 1) {
			try {
				Static558.method7783(new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() }, arg0.anApplet1, "openjs");
				local39 = new Class311();
				local39.anInt9169 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class311();
				local39.anInt9169 = 2;
				return local39;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local39 = new Class311();
				local39.anInt9169 = 1;
				return local39;
			} catch (@Pc(79) Exception local79) {
				local39 = new Class311();
				local39.anInt9169 = 2;
				return local39;
			}
		} else if (arg1 == 3) {
			try {
				Static558.method7782("loggedout", arg0.anApplet1);
			} catch (@Pc(107) Throwable local107) {
			}
			@Pc(123) Class311 local123;
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local123 = new Class311();
				local123.anInt9169 = 1;
				return local123;
			} catch (@Pc(129) Exception local129) {
				local123 = new Class311();
				local123.anInt9169 = 2;
				return local123;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
