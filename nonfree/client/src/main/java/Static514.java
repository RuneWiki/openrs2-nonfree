import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Lclient!nca;")
	public static Class254 aClass254_129;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZIII)V")
	public static void method7276(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static407.method6011(arg3, 0, arg0, Static313.aClass88_Sub1Array2.length - 1, arg2, arg1);
		Static580.anInt9164 = 0;
		Static611.aClass2_Sub25_2 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILjava/lang/String;Lclient!vo;Ljava/lang/String;)Lclient!hma;")
	public static Class163 method7280(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class389 arg2, @OriginalArg(4) String arg3) {
		if (arg0 == 0) {
			return arg2.method9262(arg3);
		}
		@Pc(52) Class163 local52;
		if (arg0 == 1) {
			try {
				@Pc(31) Object local31 = Static736.method7135(new Object[] { (new URL(Static214.anApplet1.getCodeBase(), arg3)).toString() }, arg1, Static214.anApplet1);
				if (local31 == null) {
					throw new RuntimeException();
				}
				@Pc(42) Class163 local42 = new Class163();
				local42.anInt3843 = 1;
				return local42;
			} catch (@Pc(48) Throwable local48) {
				local52 = new Class163();
				local52.anInt3843 = 2;
				return local52;
			}
		} else if (arg0 == 2) {
			try {
				Static214.anApplet1.getAppletContext().showDocument(new URL(Static214.anApplet1.getCodeBase(), arg3), "_blank");
				local52 = new Class163();
				local52.anInt3843 = 1;
				return local52;
			} catch (@Pc(89) Exception local89) {
				local52 = new Class163();
				local52.anInt3843 = 2;
				return local52;
			}
		} else if (arg0 == 3) {
			try {
				Static736.method7134(Static214.anApplet1, "loggedout");
			} catch (@Pc(110) Throwable local110) {
			}
			try {
				Static214.anApplet1.getAppletContext().showDocument(new URL(Static214.anApplet1.getCodeBase(), arg3), "_top");
				local52 = new Class163();
				local52.anInt3843 = 1;
				return local52;
			} catch (@Pc(132) Exception local132) {
				local52 = new Class163();
				local52.anInt3843 = 2;
				return local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
