import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!us", name = "s", descriptor = "Lclient!lb;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!us", name = "r", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_250 = new Class251(7, 3);

	@OriginalMember(owner = "client!us", name = "o", descriptor = "I")
	public static final int anInt10319 = 0;

	@OriginalMember(owner = "client!us", name = "q", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_251 = new Class251(89, 8);

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(III)Z")
	public static boolean method8827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method8829(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static615.method8660(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			Static335.method5160(local5);
			local5 = Static118.method1849("%3a", ":", local5);
			local5 = Static118.method1849("%40", "@", local5);
			local5 = Static118.method1849("%26", "&", local5);
			local5 = Static118.method1849("%23", "#", local5);
			if (Static312.anApplet1 != null) {
				@Pc(131) Class230 local131 = Static61.aClass173_2.method4242(new URL(Static312.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static159.anInt2414 + "&u=" + (Static519.aString108 == null ? String.valueOf(Static186.aLong110) : Static519.aString108) + "&v1=" + Static251.aString62 + "&v2=" + Static251.aString64 + "&e=" + local5));
				while (local131.anInt6256 == 0) {
					Static548.method7968(1L);
				}
				if (local131.anInt6256 == 1) {
					@Pc(151) DataInputStream local151 = (DataInputStream) local131.anObject12;
					local151.read();
					local151.close();
				}
			}
		} catch (@Pc(158) Exception local158) {
		}
	}
}
