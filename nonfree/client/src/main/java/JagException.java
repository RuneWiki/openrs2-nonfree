import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.DataInputStream;
import java.net.URL;

@OriginalClass("client!wf")
public final class JagException extends RuntimeException {

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public JagException(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable1 = arg0;
		this.aString5 = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void report(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static56.method1039(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (GameShell.aClass17_3.anApplet1 != null) {
				@Pc(102) PrivilegedRequest local102 = GameShell.aClass17_3.method386(new URL(GameShell.aClass17_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + GameShell.anInt2572 + "&u=" + Static80.aLong68 + "&v1=" + SignLink.aString3 + "&v2=" + SignLink.aString2 + "&e=" + local7));
				while (local102.anInt373 == 0) {
					Static46.method889(1L);
				}
				if (local102.anInt373 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local102.anObject1;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}
}
