import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!pba", name = "dd", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!pba", name = "nd", descriptor = "Lclient!ri;")
	public static Class284 aClass284_116;

	@OriginalMember(owner = "client!pba", name = "xd", descriptor = "J")
	public static long aLong191 = -1L;

	@OriginalMember(owner = "client!pba", name = "Bd", descriptor = "I")
	public static int anInt7159 = 0;

	@OriginalMember(owner = "client!pba", name = "Od", descriptor = "Lclient!qs;")
	public static final Class273 aClass273_2 = new Class273();

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5672(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!dda;Z)V")
	public static void method5673(@OriginalArg(0) Class25_Sub3 arg0) {
		arg0.aClass25_Sub2_Sub2_Sub5_1 = null;
		if (Static156.anInt3544 < 20) {
			Static463.aClass269_8.method5977(arg0);
			Static156.anInt3544++;
		}
	}

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "(B)[Lclient!ui;")
	public static Class329[] method5680() {
		return new Class329[] { Static499.aClass329_39, Static215.aClass329_26, Static373.aClass329_42, Static490.aClass329_56, Static360.aClass329_70, Static478.aClass329_54, Static69.aClass329_43, Static216.aClass329_27, Static540.aClass329_62, Static243.aClass329_60, Static409.aClass329_9, Static499.aClass329_38, Static569.aClass329_67, Static252.aClass329_30 };
	}
}
