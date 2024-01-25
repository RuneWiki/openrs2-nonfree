import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!rja;")
	public static Class310 aClass310_3;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Lclient!rha;")
	public static Class309 aClass309_8;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_190 = new Class126(125, -1);

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	public static int anInt9434 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZLclient!lu;Ljava/lang/String;)Lclient!fo;")
	public static Class129 method7980(@OriginalArg(0) int arg0, @OriginalArg(2) Class231 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method5284(arg2);
		}
		@Pc(36) Class129 local36;
		if (arg0 == 1) {
			try {
				Static685.method3973(new Object[] { (new URL(Static287.anApplet2.getCodeBase(), arg2)).toString() }, "openjs", Static287.anApplet2);
				local36 = new Class129();
				local36.anInt3299 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class129();
				local36.anInt3299 = 2;
				return local36;
			}
		} else if (arg0 == 2) {
			try {
				Static287.anApplet2.getAppletContext().showDocument(new URL(Static287.anApplet2.getCodeBase(), arg2), "_blank");
				local36 = new Class129();
				local36.anInt3299 = 1;
				return local36;
			} catch (@Pc(74) Exception local74) {
				local36 = new Class129();
				local36.anInt3299 = 2;
				return local36;
			}
		} else if (arg0 == 3) {
			try {
				Static685.method3974(Static287.anApplet2, "loggedout");
			} catch (@Pc(98) Throwable local98) {
			}
			try {
				Static287.anApplet2.getAppletContext().showDocument(new URL(Static287.anApplet2.getCodeBase(), arg2), "_top");
				local36 = new Class129();
				local36.anInt3299 = 1;
				return local36;
			} catch (@Pc(118) Exception local118) {
				local36 = new Class129();
				local36.anInt3299 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
