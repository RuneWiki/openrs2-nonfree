import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "[I")
	public static int[] anIntArray601;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_140 = new Class397(24, -1);

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "Lclient!tb;")
	public static final Class273 aClass273_1 = Static204.method3092();

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_41 = new Class313(32);

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_81 = new Class144(71, -1);

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_141 = new Class397(122, 1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!br;Ljava/lang/String;Ljava/lang/String;)Lclient!sfa;")
	public static Class338 method7125(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg0 == 0) {
			return arg1.method1403(arg3);
		}
		@Pc(58) Class338 local58;
		if (arg0 == 1) {
			try {
				@Pc(37) Object local37 = Static728.method689(new Object[] { (new URL(Static41.anApplet1.getCodeBase(), arg3)).toString() }, Static41.anApplet1, arg2);
				if (local37 == null) {
					throw new RuntimeException();
				}
				@Pc(48) Class338 local48 = new Class338();
				local48.anInt8934 = 1;
				return local48;
			} catch (@Pc(54) Throwable local54) {
				local58 = new Class338();
				local58.anInt8934 = 2;
				return local58;
			}
		} else if (arg0 == 2) {
			try {
				Static41.anApplet1.getAppletContext().showDocument(new URL(Static41.anApplet1.getCodeBase(), arg3), "_blank");
				local58 = new Class338();
				local58.anInt8934 = 1;
				return local58;
			} catch (@Pc(88) Exception local88) {
				local58 = new Class338();
				local58.anInt8934 = 2;
				return local58;
			}
		} else if (arg0 == 3) {
			try {
				Static728.method688(Static41.anApplet1, "loggedout");
			} catch (@Pc(109) Throwable local109) {
			}
			try {
				Static41.anApplet1.getAppletContext().showDocument(new URL(Static41.anApplet1.getCodeBase(), arg3), "_top");
				local58 = new Class338();
				local58.anInt8934 = 1;
				return local58;
			} catch (@Pc(131) Exception local131) {
				local58 = new Class338();
				local58.anInt8934 = 2;
				return local58;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
