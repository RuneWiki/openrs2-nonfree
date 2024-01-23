import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "[Lclient!fl;")
	public static Class58[] aClass58Array1;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Lclient!vl;")
	public static Class177 aClass177_3;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "S")
	public static short aShort10 = 1;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	public static int anInt1115 = -1;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Loaded textures";

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString55 = "Take";

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public static int anInt1117 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method971(@OriginalArg(1) String arg0) {
		@Pc(3) int local3 = Static268.method4458(arg0);
		if (local3 != -1) {
			@Pc(43) int[] local43 = Static197.aClass2_Sub3_Sub18_2.method2981(Static37.aClass113_1.anIntArray261[local3] >> 14 & 0x3FFF, (Static37.aClass113_1.anIntArray261[local3] & 0x3CE4FA68) >> 28, Static37.aClass113_1.anIntArray261[local3] & 0x3FFF);
			Static177.method3093(local43[1], local43[2]);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
	public static boolean method973(@OriginalArg(0) int arg0) {
		@Pc(3) Class132_Sub1 local3 = Static163.method2818(arg0);
		if (local3 == null) {
			return false;
		} else if (Static282.anInt5835 == 1 || Static282.anInt5835 == 2 || Static7.anInt237 == 2) {
			Static186.aString197 = local3.aString205;
			Static186.anInt3934 = local3.anInt4132;
			if (Static7.anInt237 != 0) {
				Static139.anInt3001 = Static186.anInt3934 + 40000;
				Static205.anInt4279 = Static139.anInt3001;
				Static2.anInt5943 = Static186.anInt3934 + 50000;
			}
			return true;
		} else {
			@Pc(48) String local48 = "";
			@Pc(50) String local50 = "";
			if (Static16.aString23 != null) {
				local50 = "/p=" + Static16.aString23;
			}
			if (Static7.anInt237 != 0) {
				local48 = ":" + (local3.anInt4132 + 7000);
			}
			@Pc(122) String local122 = "http://" + local3.aString205 + local48 + "/l=" + Static206.anInt4309 + "/a=" + Static136.anInt2976 + local50 + "/j" + (Static54.aBoolean95 ? "1" : "0") + ",o" + (Static19.aBoolean39 ? "1" : "0") + ",a2,m" + (Static295.aBoolean487 ? "1" : "0");
			try {
				Static262.aClient41.getAppletContext().showDocument(new URL(local122), "_self");
				return true;
			} catch (@Pc(132) Exception local132) {
				return false;
			}
		}
	}
}
