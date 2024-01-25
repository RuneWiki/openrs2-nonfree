import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!ae;")
	public static Class8 aClass8_147;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
	public static final int[] anIntArray706 = new int[13];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	public static void method9006() {
		@Pc(16) byte[] local16;
		if (Static503.anObject21 == null) {
			@Pc(9) Class50_Sub1_Sub2 local9 = new Class50_Sub1_Sub2();
			local16 = local9.method4498();
			Static503.anObject21 = Static486.method7063(local16);
		}
		if (Static340.anObject18 == null) {
			@Pc(32) Class50_Sub2_Sub1 local32 = new Class50_Sub2_Sub1();
			local16 = local32.method1959();
			Static340.anObject18 = Static486.method7063(local16);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method9007(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static183.method2640(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static651.method8875(local7);
			local7 = Static219.method3185(local7, ":", "%3a");
			local7 = Static219.method3185(local7, "@", "%40");
			local7 = Static219.method3185(local7, "&", "%26");
			local7 = Static219.method3185(local7, "#", "%23");
			if (Static538.anApplet3 != null) {
				@Pc(110) Class103 local110 = Static49.aClass380_1.method8811(new URL(Static538.anApplet3.getCodeBase(), "clienterror.ws?c=" + Static165.anInt2773 + "&u=" + (Static294.aString139 == null ? String.valueOf(Static350.aLong171) : Static294.aString139) + "&v1=" + Static647.aString145 + "&v2=" + Static647.aString148 + "&e=" + local7));
				while (local110.anInt2541 == 0) {
					Static520.method7923(1L);
				}
				if (local110.anInt2541 == 1) {
					@Pc(131) DataInputStream local131 = (DataInputStream) local110.anObject9;
					local131.read();
					local131.close();
				}
			}
		} catch (@Pc(138) Exception local138) {
		}
	}
}
