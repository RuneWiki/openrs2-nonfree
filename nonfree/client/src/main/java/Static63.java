import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	public static int anInt2653 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
	public static void method2279(@OriginalArg(1) byte arg0) {
		if (Static263.aByteArrayArrayArray9 == null) {
			Static263.aByteArrayArrayArray9 = new byte[4][Static43.anInt1151][Static260.anInt5348];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static43.anInt1151; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static260.anInt5348; local22++) {
					Static263.aByteArrayArrayArray9[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!wd;Ljava/lang/String;II)Lclient!tj;")
	public static Class193 method2280(@OriginalArg(0) Class215 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg0.method5660(arg1);
		}
		@Pc(44) Class193 local44;
		if (arg2 == 1) {
			try {
				Static367.method3948(arg0.anApplet1, new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg1)).toString() }, "openjs");
				local44 = new Class193();
				local44.anInt5986 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class193();
				local44.anInt5986 = 2;
				return local44;
			}
		} else if (arg2 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_blank");
				local44 = new Class193();
				local44.anInt5986 = 1;
				return local44;
			} catch (@Pc(84) Exception local84) {
				local44 = new Class193();
				local44.anInt5986 = 2;
				return local44;
			}
		} else if (arg2 == 3) {
			try {
				Static367.method3947(arg0.anApplet1, "loggedout");
			} catch (@Pc(108) Throwable local108) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg1), "_top");
				local44 = new Class193();
				local44.anInt5986 = 1;
				return local44;
			} catch (@Pc(130) Exception local130) {
				local44 = new Class193();
				local44.anInt5986 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ps;III)V")
	public static void method2281(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static152.anInt3124 = arg1;
		Static208.anInt4363 = arg2;
		Static215.aClass163_13 = arg0;
	}
}
