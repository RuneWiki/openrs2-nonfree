import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
	public static int anInt8282;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "[Lclient!vu;")
	public static Class5_Sub1_Sub21[] aClass5_Sub1_Sub21Array4;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_169 = new Class156(61, 3);

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_217 = new Class381(86, 7);

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_170 = new Class156(4, 4);

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
	public static int anInt8283 = -1;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "[I")
	public static final int[] anIntArray476 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
	public static void method7115(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static12.method197(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static483.method6820(local7);
			local7 = Static92.method8233(local7, "%3a", ":");
			local7 = Static92.method8233(local7, "%40", "@");
			local7 = Static92.method8233(local7, "%26", "&");
			local7 = Static92.method8233(local7, "%23", "#");
			if (Static155.anApplet1 != null) {
				@Pc(126) Class361 local126 = Static9.aClass349_2.method7741(new URL(Static155.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static166.anInt3254 + "&u=" + (Static177.aString31 == null ? String.valueOf(Static167.aLong94) : Static177.aString31) + "&v1=" + Static576.aString110 + "&v2=" + Static576.aString107 + "&e=" + local7));
				while (local126.anInt9720 == 0) {
					Static620.method7045(-4, 1L);
				}
				if (local126.anInt9720 == 1) {
					@Pc(157) DataInputStream local157 = (DataInputStream) local126.anObject20;
					local157.read();
					local157.close();
				}
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public static void method7116() {
		Static434.method6247();
	}
}
