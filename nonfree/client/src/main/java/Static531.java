import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
	public static int anInt9126 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
	public static boolean method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static24.method368(arg0, arg1) || Static282.method4747(arg0, arg1);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7864(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		while (local10 < local13 && Static90.method1504(arg0.charAt(local10))) {
			local10++;
		}
		while (local10 < local13 && Static90.method1504(arg0.charAt(local13 - 1))) {
			local13--;
		}
		@Pc(50) int local50 = local13 - local10;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(74) StringBuffer local74 = new StringBuffer(local50);
		for (@Pc(76) int local76 = local10; local76 < local13; local76++) {
			@Pc(81) char local81 = arg0.charAt(local76);
			if (Static33.method574(local81)) {
				@Pc(89) char local89 = Static1.method6047(local81);
				if (local89 != '\u0000') {
					local74.append(local89);
				}
			}
		}
		if (local74.length() == 0) {
			return null;
		} else {
			return local74.toString();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static588.method8382(arg0, arg1) & Static372.method5788(arg0, arg1);
	}
}
