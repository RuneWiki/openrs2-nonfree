import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!bda;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_54 = new Class223(20);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBI)V")
	public static void method6557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static376.anInt7260) {
			Static292.anIntArray394 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static292.anIntArray394[local13] = (local13 << 12) / arg0;
			}
			Static569.anInt9982 = arg0 - 1;
			Static349.anInt6735 = arg0 * 32;
			Static376.anInt7260 = arg0;
		}
		if (Static477.anInt8774 == arg1) {
			return;
		}
		if (Static376.anInt7260 == arg1) {
			Static442.anIntArray449 = Static292.anIntArray394;
		} else {
			Static442.anIntArray449 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static442.anIntArray449[local13] = (local13 << 12) / arg1;
			}
		}
		Static237.anInt4286 = arg1 - 1;
		Static477.anInt8774 = arg1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method6558() {
		if (!Static418.aBoolean541) {
			return;
		}
		@Pc(17) Class225 local17 = Static24.method318(Static7.anInt173, Static317.anInt10281);
		if (local17 != null && local17.anObjectArray16 != null) {
			@Pc(26) Class4_Sub25 local26 = new Class4_Sub25();
			local26.aClass225_21 = local17;
			local26.anObjectArray1 = local17.anObjectArray16;
			Static388.method6121(local26);
		}
		Static592.anInt10215 = -1;
		Static418.aBoolean541 = false;
		Static180.anInt3622 = -1;
		if (local17 != null) {
			Static92.method2100(local17);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZB)V")
	public static void method6560(@OriginalArg(0) boolean arg0) {
		Static390.method6204();
		if (!Static270.method4668(Static203.anInt3855)) {
			return;
		}
		Static12.anInt226++;
		if (Static12.anInt226 < 50 && !arg0) {
			return;
		}
		Static12.anInt226 = 0;
		if (!Static152.aBoolean276 && Static299.aClass241_3 != null) {
			@Pc(43) Class4_Sub14 local43 = Static196.method3380(Static17.aClass159_1, Static122.aClass173_40);
			Static353.method5712(local43);
			try {
				Static367.method5899();
			} catch (@Pc(50) IOException local50) {
				Static152.aBoolean276 = true;
			}
		}
		Static390.method6204();
	}
}
