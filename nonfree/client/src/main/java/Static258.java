import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!mu;")
	public static Class196 aClass196_3;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLclient!qf;)V")
	public static void method4549(@OriginalArg(1) Class245 arg0) {
		if (!Static506.aBoolean659) {
			return;
		}
		if (arg0.anObjectArray16 != null) {
			@Pc(23) Class245 local23 = Static80.method1631(Static508.anInt8865, Static448.anInt8198);
			if (local23 != null) {
				@Pc(29) Class3_Sub21 local29 = new Class3_Sub21();
				local29.anObjectArray4 = arg0.anObjectArray16;
				local29.aClass245_9 = local23;
				local29.aClass245_8 = arg0;
				Static60.method1227(local29);
			}
		}
		Static278.method4791(Static148.aClass158_40);
		Static515.aClass3_Sub27_Sub1_2.method7594(arg0.anInt7256);
		Static515.aClass3_Sub27_Sub1_2.method7567(Static113.anInt2478);
		Static515.aClass3_Sub27_Sub1_2.method7600(arg0.anInt7271, 30364);
		Static515.aClass3_Sub27_Sub1_2.method7567(Static508.anInt8865);
		Static515.aClass3_Sub27_Sub1_2.method7600(arg0.anInt7264, 30364);
		Static515.aClass3_Sub27_Sub1_2.method7585(Static448.anInt8198);
	}
}
