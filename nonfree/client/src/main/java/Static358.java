import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
	public static final int[] anIntArray474 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "J")
	public static long aLong177 = 0L;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;ILclient!qj;I)Lclient!ue;")
	public static Class331 method5423(@OriginalArg(0) String arg0, @OriginalArg(2) Class272 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method6129(arg0);
		}
		@Pc(34) Class331 local34;
		if (arg2 == 1) {
			try {
				Static608.method4638(new Object[] { (new URL(Static249.anApplet1.getCodeBase(), arg0)).toString() }, Static249.anApplet1, "openjs");
				local34 = new Class331();
				local34.anInt8818 = 1;
				return local34;
			} catch (@Pc(40) Throwable local40) {
				local34 = new Class331();
				local34.anInt8818 = 2;
				return local34;
			}
		} else if (arg2 == 2) {
			try {
				Static249.anApplet1.getAppletContext().showDocument(new URL(Static249.anApplet1.getCodeBase(), arg0), "_blank");
				local34 = new Class331();
				local34.anInt8818 = 1;
				return local34;
			} catch (@Pc(74) Exception local74) {
				local34 = new Class331();
				local34.anInt8818 = 2;
				return local34;
			}
		} else if (arg2 == 3) {
			try {
				Static608.method4639(Static249.anApplet1, "loggedout");
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static249.anApplet1.getAppletContext().showDocument(new URL(Static249.anApplet1.getCodeBase(), arg0), "_top");
				local34 = new Class331();
				local34.anInt8818 = 1;
				return local34;
			} catch (@Pc(120) Exception local120) {
				local34 = new Class331();
				local34.anInt8818 = 2;
				return local34;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
