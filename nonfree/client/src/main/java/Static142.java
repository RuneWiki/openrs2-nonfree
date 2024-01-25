import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)I")
	public static int method2675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static52.anIntArray216[arg1 & 0x3] : Static183.anIntArray665[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method2676(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static105.method2213(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static224.method3685(local7);
			local7 = Static24.method446(local7, "%3a", ":");
			local7 = Static24.method446(local7, "%40", "@");
			local7 = Static24.method446(local7, "%26", "&");
			local7 = Static24.method446(local7, "%23", "#");
			if (Static237.aClass111_3.anApplet1 != null) {
				@Pc(106) Class182 local106 = Static237.aClass111_3.method2811(new URL(Static237.aClass111_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static158.anInt3032 + "&u=" + Static109.aLong75 + "&v1=" + Static152.aString34 + "&v2=" + Static152.aString33 + "&e=" + local7));
				while (local106.anInt4498 == 0) {
					Static358.method2028(1L);
				}
				if (local106.anInt4498 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local106.anObject6;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ae;Lclient!ae;I)V")
	public static void method2677(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		Static216.method3597(Static140.aClass11_50);
		Static372.aClass2_Sub16_Sub2_4.method5355(arg1.anInt94);
		Static372.aClass2_Sub16_Sub2_4.method5372(arg0.anInt94);
		Static372.aClass2_Sub16_Sub2_4.method5328(arg1.anInt58);
		Static372.aClass2_Sub16_Sub2_4.method5328(arg0.lb);
		Static372.aClass2_Sub16_Sub2_4.method5351(arg1.lb);
		Static372.aClass2_Sub16_Sub2_4.method5351(arg0.anInt58);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method2678(@OriginalArg(1) String arg0) {
		return Static94.method1870(arg0, 16);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method2679(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(30) int local30 = 2;
		@Pc(34) int local34 = arg0 / 10;
		while (local34 != 0) {
			local34 /= 10;
			local30++;
		}
		@Pc(48) char[] local48 = new char[local30];
		local48[0] = '+';
		for (@Pc(56) int local56 = local30 - 1; local56 > 0; local56--) {
			@Pc(59) int local59 = arg0;
			arg0 /= 10;
			@Pc(69) int local69 = local59 - arg0 * 10;
			if (local69 < 10) {
				local48[local56] = (char) (local69 + 48);
			} else {
				local48[local56] = (char) (local69 + 87);
			}
		}
		return new String(local48);
	}
}
