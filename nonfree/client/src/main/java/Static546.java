import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_16 = new Class188(14, 0, 4, 1);

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
	public static int anInt9213 = 0;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
	public static final int[] anIntArray692 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IC)Z")
	public static boolean method7521(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method7522(@OriginalArg(1) String arg0) {
		if (Static70.aString18.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static70.aString18.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static70.aString18.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IILclient!cr;)Lclient!rp;")
	public static Class278 method7523(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class57 arg2) {
		if (arg1 == 0) {
			return arg2.method928(arg0);
		}
		@Pc(39) Class278 local39;
		if (arg1 == 1) {
			try {
				Static587.method3350(Static189.anApplet4, "openjs", new Object[] { (new URL(Static189.anApplet4.getCodeBase(), arg0)).toString() });
				local39 = new Class278();
				local39.anInt7757 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class278();
				local39.anInt7757 = 2;
				return local39;
			}
		} else if (arg1 == 2) {
			try {
				Static189.anApplet4.getAppletContext().showDocument(new URL(Static189.anApplet4.getCodeBase(), arg0), "_blank");
				local39 = new Class278();
				local39.anInt7757 = 1;
				return local39;
			} catch (@Pc(79) Exception local79) {
				local39 = new Class278();
				local39.anInt7757 = 2;
				return local39;
			}
		} else if (arg1 == 3) {
			try {
				Static587.method3349(Static189.anApplet4, "loggedout");
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static189.anApplet4.getAppletContext().showDocument(new URL(Static189.anApplet4.getCodeBase(), arg0), "_top");
				local39 = new Class278();
				local39.anInt7757 = 1;
				return local39;
			} catch (@Pc(120) Exception local120) {
				local39 = new Class278();
				local39.anInt7757 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
	public static boolean method7525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static272.method3839(arg1, arg0) | (arg1 & 0x70000) != 0 || Static123.method1856(arg1, arg0);
	}
}
