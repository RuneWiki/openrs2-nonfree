import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!sn", name = "U", descriptor = "Lclient!kb;")
	public static Class83 aClass83_168;

	@OriginalMember(owner = "client!sn", name = "ab", descriptor = "Lclient!kb;")
	public static Class83 aClass83_169;

	@OriginalMember(owner = "client!sn", name = "db", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!sn", name = "X", descriptor = "Lclient!tl;")
	public static Class155 aClass155_40 = new Class155(200);

	@OriginalMember(owner = "client!sn", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString172 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!sn", name = "bb", descriptor = "[S")
	public static short[] aShortArray85 = new short[256];

	@OriginalMember(owner = "client!sn", name = "cb", descriptor = "I")
	public static int anInt5416 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public static void method4245() {
		if (Static270.aBoolean308) {
			Static270.aBoolean308 = false;
			Static90.aClass7_1 = null;
			Static229.aClass1_Sub2_Sub14_7 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!ba;)V")
	public static void method4246(@OriginalArg(1) Class1_Sub3 arg0) {
		arg0.aBoolean169 = false;
		if (arg0.aClass1_Sub4_5 != null) {
			arg0.aClass1_Sub4_5.anInt4838 = 0;
		}
		for (@Pc(22) Class1_Sub3 local22 = arg0.method2543(); local22 != null; local22 = arg0.method2542()) {
			method4246(local22);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)I")
	public static int method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local6 ^ local6 << 13;
		@Pc(30) int local30 = Integer.MAX_VALUE & local16 * (local16 * 15731 * local16 + 789221) + 1376312589;
		return local30 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)V")
	public static void method4248(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static125.aFloat97 = arg0;
		Static25.aFloat19 = arg1;
		if (Static280.anInt5999 == 2) {
			Static97.anInt6055 = arg0;
			Static38.anInt1151 = arg1;
		}
		Static192.method3415();
		Static37.aBoolean69 = true;
	}
}
