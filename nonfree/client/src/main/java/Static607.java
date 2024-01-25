import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
	public static int[] anIntArray692;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_173 = new Class274(71, 0);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method8295(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static102.method7315(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static102.method7315(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(65) byte[] local65 = new byte[local26];
		Static399.method6039(arg0, 0, local65);
		return local65;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!vk;ILjava/lang/String;I)Lclient!av;")
	public static Class26 method8296(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.method8271(arg2);
		}
		@Pc(36) Class26 local36;
		if (arg1 == 1) {
			try {
				Static648.method3664("openjs", new Object[] { (new URL(Static234.anApplet2.getCodeBase(), arg2)).toString() }, Static234.anApplet2);
				local36 = new Class26();
				local36.anInt762 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class26();
				local36.anInt762 = 2;
				return local36;
			}
		} else if (arg1 == 2) {
			try {
				Static234.anApplet2.getAppletContext().showDocument(new URL(Static234.anApplet2.getCodeBase(), arg2), "_blank");
				local36 = new Class26();
				local36.anInt762 = 1;
				return local36;
			} catch (@Pc(76) Exception local76) {
				local36 = new Class26();
				local36.anInt762 = 2;
				return local36;
			}
		} else if (arg1 == 3) {
			try {
				Static648.method3663("loggedout", Static234.anApplet2);
			} catch (@Pc(102) Throwable local102) {
			}
			try {
				Static234.anApplet2.getAppletContext().showDocument(new URL(Static234.anApplet2.getCodeBase(), arg2), "_top");
				local36 = new Class26();
				local36.anInt762 = 1;
				return local36;
			} catch (@Pc(122) Exception local122) {
				local36 = new Class26();
				local36.anInt762 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
