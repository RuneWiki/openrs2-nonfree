import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	public static int anInt6951 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method5809(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static24.method704(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static365.method5876(local7);
			local7 = Static450.method6845("%3a", ":", local7);
			local7 = Static450.method6845("%40", "@", local7);
			local7 = Static450.method6845("%26", "&", local7);
			local7 = Static450.method6845("%23", "#", local7);
			if (Static253.anApplet1 != null) {
				@Pc(107) Class159 local107 = Static457.aClass104_3.method3135(new URL(Static253.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static305.anInt6170 + "&u=" + (Static534.aString98 == null ? String.valueOf(Static192.aLong123) : Static534.aString98) + "&v1=" + Static161.aString37 + "&v2=" + Static161.aString35 + "&e=" + local7));
				while (local107.anInt5910 == 0) {
					Static344.method5698(1L);
				}
				if (local107.anInt5910 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local107.anObject13;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	public static void method5811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub5_Sub19 local12 = Static348.method5721(arg1, 7);
		local12.method5179();
		local12.anInt6198 = arg0;
	}
}
