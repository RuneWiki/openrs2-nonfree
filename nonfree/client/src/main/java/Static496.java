import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLjava/lang/String;Lclient!qn;Ljava/lang/String;I)Lclient!eba;")
	public static Class81 method7117(@OriginalArg(1) String arg0, @OriginalArg(2) Class291 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return arg1.method7125(arg0);
		}
		@Pc(55) Class81 local55;
		if (arg3 == 1) {
			try {
				@Pc(35) Object local35 = Static686.method8108(arg2, new Object[] { (new URL(Static124.anApplet1.getCodeBase(), arg0)).toString() }, Static124.anApplet1);
				if (local35 == null) {
					throw new RuntimeException();
				}
				@Pc(45) Class81 local45 = new Class81();
				local45.anInt2532 = 1;
				return local45;
			} catch (@Pc(51) Throwable local51) {
				local55 = new Class81();
				local55.anInt2532 = 2;
				return local55;
			}
		} else if (arg3 == 2) {
			try {
				Static124.anApplet1.getAppletContext().showDocument(new URL(Static124.anApplet1.getCodeBase(), arg0), "_blank");
				local55 = new Class81();
				local55.anInt2532 = 1;
				return local55;
			} catch (@Pc(85) Exception local85) {
				local55 = new Class81();
				local55.anInt2532 = 2;
				return local55;
			}
		} else if (arg3 == 3) {
			try {
				Static686.method8109(Static124.anApplet1, "loggedout");
			} catch (@Pc(104) Throwable local104) {
			}
			try {
				Static124.anApplet1.getAppletContext().showDocument(new URL(Static124.anApplet1.getCodeBase(), arg0), "_top");
				local55 = new Class81();
				local55.anInt2532 = 1;
				return local55;
			} catch (@Pc(124) Exception local124) {
				local55 = new Class81();
				local55.anInt2532 = 2;
				return local55;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public static void method7118() {
		if (Static361.anInt5827 < 0) {
			Static361.anInt5827 = 0;
			Static88.anInt1725 = -1;
			Static590.anInt9485 = -1;
		}
		if (Static361.anInt5827 > Static317.anInt5410) {
			Static361.anInt5827 = Static317.anInt5410;
			Static88.anInt1725 = -1;
			Static590.anInt9485 = -1;
		}
		if (Static90.anInt10121 < 0) {
			Static590.anInt9485 = -1;
			Static90.anInt10121 = 0;
			Static88.anInt1725 = -1;
		}
		if (Static90.anInt10121 > Static317.anInt5405) {
			Static90.anInt10121 = Static317.anInt5405;
			Static590.anInt9485 = -1;
			Static88.anInt1725 = -1;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZBI)V")
	public static void method7120(@OriginalArg(1) boolean arg0) {
		Static348.anInt5701 = 22050;
		Static163.anInt3211 = 2;
		Static219.aBoolean313 = arg0;
	}
}
