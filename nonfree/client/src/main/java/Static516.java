import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
	public static int anInt9011 = 0;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	public static int anInt9014 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)I")
	public static int method7389(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;Lclient!fl;I)Lclient!jt;")
	public static Class159 method7390(@OriginalArg(1) String arg0, @OriginalArg(2) Class104 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method3128(arg0);
		}
		@Pc(37) Class159 local37;
		if (arg2 == 1) {
			try {
				Static651.method5914(Static635.anApplet2, "openjs", new Object[] { (new URL(Static635.anApplet2.getCodeBase(), arg0)).toString() });
				local37 = new Class159();
				local37.anInt5910 = 1;
				return local37;
			} catch (@Pc(43) Throwable local43) {
				local37 = new Class159();
				local37.anInt5910 = 2;
				return local37;
			}
		} else if (arg2 == 2) {
			try {
				Static635.anApplet2.getAppletContext().showDocument(new URL(Static635.anApplet2.getCodeBase(), arg0), "_blank");
				local37 = new Class159();
				local37.anInt5910 = 1;
				return local37;
			} catch (@Pc(77) Exception local77) {
				local37 = new Class159();
				local37.anInt5910 = 2;
				return local37;
			}
		} else if (arg2 == 3) {
			try {
				Static651.method5913("loggedout", Static635.anApplet2);
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				Static635.anApplet2.getAppletContext().showDocument(new URL(Static635.anApplet2.getCodeBase(), arg0), "_top");
				local37 = new Class159();
				local37.anInt5910 = 1;
				return local37;
			} catch (@Pc(123) Exception local123) {
				local37 = new Class159();
				local37.anInt5910 = 2;
				return local37;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)V")
	public static void method7391() {
		if (!Static141.aBoolean262) {
			return;
		}
		@Pc(19) Class302 local19 = Static454.method6884(Static350.anInt6854, Static541.anInt9362);
		if (local19 != null && local19.anObjectArray27 != null) {
			@Pc(28) Class6_Sub29 local28 = new Class6_Sub29();
			local28.aClass302_7 = local19;
			local28.anObjectArray1 = local19.anObjectArray27;
			Static435.method6669(local28);
		}
		Static141.aBoolean262 = false;
		Static641.anInt10722 = -1;
		Static329.anInt6606 = -1;
		if (local19 != null) {
			Static580.method8049(local19);
		}
	}
}
