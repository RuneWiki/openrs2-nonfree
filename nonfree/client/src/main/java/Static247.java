import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public static int anInt4761;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array10;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_108 = new Class263(75, 7);

	@OriginalMember(owner = "client!me", name = "i", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_4 = new Class220(15, 0, 1, 0);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
	public static void method3667(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static377.aFloat70 = 3.0F;
		} else if (arg0 == 50) {
			Static377.aFloat70 = 4.0F;
		} else if (arg0 == 75) {
			Static377.aFloat70 = 6.0F;
		} else if (arg0 == 100) {
			Static377.aFloat70 = 8.0F;
		} else if (arg0 == 200) {
			Static377.aFloat70 = 16.0F;
		}
		Static332.anInt6412 = -1;
		Static332.anInt6412 = -1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method3669(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static185.method3079(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			Static402.method5528(local5);
			local5 = Static310.method4464(":", "%3a", local5);
			local5 = Static310.method4464("@", "%40", local5);
			local5 = Static310.method4464("&", "%26", local5);
			local5 = Static310.method4464("#", "%23", local5);
			if (Static58.aClass183_2.anApplet1 != null) {
				@Pc(102) Class157 local102 = Static58.aClass183_2.method4144(new URL(Static58.aClass183_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static224.anInt7000 + "&u=" + Static385.aLong199 + "&v1=" + Static282.aString42 + "&v2=" + Static282.aString44 + "&e=" + local5));
				while (local102.anInt4667 == 0) {
					Static289.method4249(1L);
				}
				if (local102.anInt4667 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local102.anObject13;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}
}
