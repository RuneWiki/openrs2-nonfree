import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_9 = new Class295(13, 3);

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public static int anInt7395 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public static void method5955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static568.aClass360ArrayArrayArray22[0][arg1][arg2] != null && Static568.aClass360ArrayArrayArray22[0][arg1][arg2].aClass360_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static568.aClass360ArrayArrayArray22[local22][arg1][arg2] == null) {
				@Pc(44) Class360 local44 = Static568.aClass360ArrayArrayArray22[local22][arg1][arg2] = new Class360(local22);
				if (local20) {
					local44.aByte129++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method5957(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static289.method4344(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static269.method3930(local7);
			local7 = Static574.method7732(":", local7, "%3a");
			local7 = Static574.method7732("@", local7, "%40");
			local7 = Static574.method7732("&", local7, "%26");
			local7 = Static574.method7732("#", local7, "%23");
			if (Static415.anApplet3 == null) {
				return;
			}
			@Pc(97) Class191 local97 = Static325.aClass198_2.method4303(new URL(Static415.anApplet3.getCodeBase(), "clienterror.ws?c=" + Static74.anInt3296 + "&u=" + Static67.aLong38 + "&v1=" + Static285.aString62 + "&v2=" + Static285.aString64 + "&e=" + local7));
			while (local97.anInt5014 == 0) {
				Static408.method5841(1L);
			}
			if (local97.anInt5014 == 1) {
				@Pc(116) DataInputStream local116 = (DataInputStream) local97.anObject11;
				local116.read();
				local116.close();
			}
		} catch (@Pc(123) Exception local123) {
		}
	}
}
