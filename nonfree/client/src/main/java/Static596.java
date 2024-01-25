import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_13;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public static int anInt10195;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "[Lclient!jj;")
	public static Interface11[] anInterface11Array1;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Z")
	public static boolean aBoolean731 = false;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Z")
	public static boolean method8230() {
		if (Static393.aClass8_Sub5_Sub7_2 == null) {
			return false;
		} else {
			if (Static393.aClass8_Sub5_Sub7_2.anInt3779 >= 2000) {
				Static393.aClass8_Sub5_Sub7_2.anInt3779 -= 2000;
			}
			return Static393.aClass8_Sub5_Sub7_2.anInt3779 == 1002;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method8231(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = Static169.method3361(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg0;
			}
			Static114.method2590(local12);
			local12 = Static361.method5671(":", "%3a", local12);
			local12 = Static361.method5671("@", "%40", local12);
			local12 = Static361.method5671("&", "%26", local12);
			local12 = Static361.method5671("#", "%23", local12);
			if (Static573.anApplet2 != null) {
				@Pc(107) Class301 local107 = Static486.aClass118_4.method3399(new URL(Static573.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static256.anInt3670 + "&u=" + (Static634.aString96 == null ? String.valueOf(Static533.aLong240) : Static634.aString96) + "&v1=" + Static175.aString47 + "&v2=" + Static175.aString52 + "&e=" + local12));
				while (local107.anInt8915 == 0) {
					Static214.method4061(1L);
				}
				if (local107.anInt8915 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local107.anObject18;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}
}
