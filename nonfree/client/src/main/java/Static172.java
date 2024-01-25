import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray202;

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
	public static int anInt9422 = 0;

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "D")
	public static double aDouble148 = -1.0D;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)I")
	public static int method7824(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCD) >>> 2);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/lang/String;)V")
	public static void method7826(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static539.method7196(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static403.method5840(local7);
			local7 = Static540.method7199("%3a", ":", local7);
			local7 = Static540.method7199("%40", "@", local7);
			local7 = Static540.method7199("%26", "&", local7);
			local7 = Static540.method7199("%23", "#", local7);
			if (Static151.anApplet2 != null) {
				@Pc(97) Class39 local97 = Static182.aClass258_2.method5894(new URL(Static151.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static285.anInt4886 + "&u=" + Static515.aLong77 + "&v1=" + Static408.aString55 + "&v2=" + Static408.aString56 + "&e=" + local7));
				while (local97.anInt894 == 0) {
					Static589.method7892(1L);
				}
				if (local97.anInt894 == 1) {
					@Pc(113) DataInputStream local113 = (DataInputStream) local97.anObject2;
					local113.read();
					local113.close();
				}
			}
		} catch (@Pc(120) Exception local120) {
		}
	}
}
