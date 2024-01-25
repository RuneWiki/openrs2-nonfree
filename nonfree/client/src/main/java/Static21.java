import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public static int anInt6206;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_102 = new Class66(4);

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt6208 = 0;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public static int anInt6209 = -1;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "J")
	public static long aLong210 = 0L;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!am;IZLjava/lang/String;)Lclient!ep;")
	public static Class60 method5515(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method318(arg2);
		}
		@Pc(43) Class60 local43;
		if (arg1 == 1) {
			try {
				Static367.method4777("openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() }, arg0.anApplet1);
				local43 = new Class60();
				local43.anInt1838 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class60();
				local43.anInt1838 = 2;
				return local43;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local43 = new Class60();
				local43.anInt1838 = 1;
				return local43;
			} catch (@Pc(85) Exception local85) {
				local43 = new Class60();
				local43.anInt1838 = 2;
				return local43;
			}
		} else if (arg1 == 3) {
			try {
				Static367.method4779("loggedout", arg0.anApplet1);
			} catch (@Pc(107) Throwable local107) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local43 = new Class60();
				local43.anInt1838 = 1;
				return local43;
			} catch (@Pc(129) Exception local129) {
				local43 = new Class60();
				local43.anInt1838 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
