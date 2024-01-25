import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[S")
	public static short[] aShortArray79;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static int anInt7006;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!wh;")
	public static final Class356 aClass356_31 = new Class356(512);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ILclient!gba;I)Lclient!ba;")
	public static Class23 method5764(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2) {
		if (arg1 == 0) {
			return arg2.method2503(arg0);
		}
		@Pc(47) Class23 local47;
		if (arg1 == 1) {
			try {
				Static602.method5581("openjs", new Object[] { (new URL(Static412.anApplet1.getCodeBase(), arg0)).toString() }, Static412.anApplet1);
				local47 = new Class23();
				local47.anInt875 = 1;
				return local47;
			} catch (@Pc(53) Throwable local53) {
				local47 = new Class23();
				local47.anInt875 = 2;
				return local47;
			}
		} else if (arg1 == 2) {
			try {
				Static412.anApplet1.getAppletContext().showDocument(new URL(Static412.anApplet1.getCodeBase(), arg0), "_blank");
				local47 = new Class23();
				local47.anInt875 = 1;
				return local47;
			} catch (@Pc(87) Exception local87) {
				local47 = new Class23();
				local47.anInt875 = 2;
				return local47;
			}
		} else if (arg1 == 3) {
			try {
				Static602.method5582(Static412.anApplet1, "loggedout");
			} catch (@Pc(106) Throwable local106) {
			}
			try {
				Static412.anApplet1.getAppletContext().showDocument(new URL(Static412.anApplet1.getCodeBase(), arg0), "_top");
				local47 = new Class23();
				local47.anInt875 = 1;
				return local47;
			} catch (@Pc(126) Exception local126) {
				local47 = new Class23();
				local47.anInt875 = 2;
				return local47;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)V")
	public static void method5765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(161) Class293 local161 = Static118.aClass293ArrayArrayArray14[arg0][arg4][arg1];
		if (local161 == null) {
			local161 = new Class293(arg0);
		}
		if (arg2 == 1) {
			local161.aShort78 = (short) arg3;
			local161.aShort79 = (short) arg5;
		} else if (arg2 == 2) {
			local161.aShort77 = (short) arg3;
			local161.aShort80 = (short) arg5;
		}
		if (Static333.aBoolean432) {
			Static486.method6807();
		}
	}
}
