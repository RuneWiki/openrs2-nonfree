import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kha", name = "i", descriptor = "Z")
	public static boolean aBoolean428;

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "Lclient!st;")
	public static final Class314 aClass314_86 = new Class314(79, 0);

	@OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
	public static int anInt5883 = 0;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IB)V")
	public static void method5072(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub7_Sub5 local15 = Static138.method2377(1, arg0);
		local15.method1473();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method5075(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static491.method7207(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static105.method1728(local7);
			local7 = Static292.method4813(":", "%3a", local7);
			local7 = Static292.method4813("@", "%40", local7);
			local7 = Static292.method4813("&", "%26", local7);
			local7 = Static292.method4813("#", "%23", local7);
			if (Static73.anApplet1 != null) {
				@Pc(102) Class174 local102 = Static640.aClass298_15.method7276(new URL(Static73.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static26.anInt392 + "&u=" + (Static69.aString7 == null ? String.valueOf(Static242.aLong126) : Static69.aString7) + "&v1=" + Static501.aString73 + "&v2=" + Static501.aString79 + "&e=" + local7));
				while (local102.anInt5121 == 0) {
					Static143.method2414(1L);
				}
				if (local102.anInt5121 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local102.anObject12;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(BB)Z")
	public static boolean method5076(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static22.aCharArray4[local7 - 128] != '\u0000';
		}
	}
}
