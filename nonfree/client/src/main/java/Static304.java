import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!jfa", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!jfa", name = "t", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "S")
	public static short aShort63 = 205;

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_48 = new Class144(8, 3);

	@OriginalMember(owner = "client!jfa", name = "r", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4498(@OriginalArg(2) String arg0) {
		Static97.method1971(arg0, "", "", "", 4, 0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZB)V")
	public static void method4501(@OriginalArg(0) boolean arg0) {
		Static445.aClass58_5.method9516(Static536.aClass22_11.method9369());
		@Pc(10) int[] local10 = Static536.aClass22_11.Y();
		Static407.anInt6328 = local10[0];
		Static476.anInt7505 = local10[3];
		Static42.anInt1245 = local10[1];
		Static260.anInt4028 = local10[2];
		if (arg0) {
			Static536.aClass22_11.DA(Static217.anInt3586, Static670.anInt10497, Static482.anInt7546, Static702.anInt10973);
			Static286.method4023(Static553.aDouble20);
		} else {
			Static536.aClass22_11.DA(Static521.anInt8160, Static515.anInt8130, Static417.anInt8530, Static662.anInt10154);
			Static286.method4023(Static403.aDouble12);
		}
	}
}
