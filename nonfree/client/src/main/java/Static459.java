import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!dda;")
	public static Class53 aClass53_132;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_168 = new Class239(0, 3);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method6984(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static496.method7298(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static464.method7008(local7);
			local7 = Static23.method572("%3a", local7, ":");
			local7 = Static23.method572("%40", local7, "@");
			local7 = Static23.method572("%26", local7, "&");
			local7 = Static23.method572("%23", local7, "#");
			if (Static348.aClass283_3.anApplet1 != null) {
				@Pc(103) Class20 local103 = Static348.aClass283_3.method7172(new URL(Static348.aClass283_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static160.anInt2917 + "&u=" + Static293.aLong149 + "&v1=" + Static482.aString183 + "&v2=" + Static482.aString186 + "&e=" + local7));
				while (local103.anInt593 == 0) {
					Static379.method5233(1L);
				}
				if (local103.anInt593 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local103.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIBI)V")
	public static void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static7.anInt8119 && arg4 <= Static34.anInt603 && arg0 >= Static328.anInt6154 && arg1 <= Static394.anInt7462) {
			Static418.method6524(arg1, arg3, arg4, arg0, arg2);
		} else {
			Static512.method7472(arg4, arg2, arg0, arg3, arg1);
		}
	}
}
