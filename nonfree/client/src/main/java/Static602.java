import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!uia", name = "F", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_231 = new Class359(99, 3);

	@OriginalMember(owner = "client!uia", name = "K", descriptor = "[I")
	public static final int[] anIntArray546 = new int[13];

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method8247(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg0];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(19) int local19 = arg1[local10 + arg2] & 0xFF;
			if (local19 != 0) {
				if (local19 >= 128 && local19 < 160) {
					@Pc(33) char local33 = Static528.aCharArray14[local19 - 128];
					if (local33 == '\u0000') {
						local33 = '?';
					}
					local19 = local33;
				}
				local6[local8++] = (char) local19;
			}
		}
		return new String(local6, 0, local8);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!uaa;B)V")
	public static void method8250(@OriginalArg(0) Class345 arg0) {
		if (arg0.anInt9591 == 5 && arg0.anInt9654 != -1) {
			Static294.method4749(Static208.aClass65_7, arg0);
		}
	}

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "(Z)V")
	public static void method8251() {
		if (Static64.aFileOutputStream1 != null) {
			try {
				Static64.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Static64.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!oq;Ljava/lang/String;ZI)Lclient!tba;")
	public static Class331 method8252(@OriginalArg(0) Class268 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method6337(arg1);
		}
		@Pc(36) Class331 local36;
		if (arg2 == 1) {
			try {
				Static682.method3655(new Object[] { (new URL(Static639.anApplet2.getCodeBase(), arg1)).toString() }, "openjs", Static639.anApplet2);
				local36 = new Class331();
				local36.anInt9108 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class331();
				local36.anInt9108 = 2;
				return local36;
			}
		} else if (arg2 == 2) {
			try {
				Static639.anApplet2.getAppletContext().showDocument(new URL(Static639.anApplet2.getCodeBase(), arg1), "_blank");
				local36 = new Class331();
				local36.anInt9108 = 1;
				return local36;
			} catch (@Pc(76) Exception local76) {
				local36 = new Class331();
				local36.anInt9108 = 2;
				return local36;
			}
		} else if (arg2 == 3) {
			try {
				Static682.method3657("loggedout", Static639.anApplet2);
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static639.anApplet2.getAppletContext().showDocument(new URL(Static639.anApplet2.getCodeBase(), arg1), "_top");
				local36 = new Class331();
				local36.anInt9108 = 1;
				return local36;
			} catch (@Pc(120) Exception local120) {
				local36 = new Class331();
				local36.anInt9108 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
