import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Lclient!pk;")
	public static Class132 aClass132_80;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
	public static int anInt4701 = 0;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[S")
	public static short[] aShortArray52 = new short[256];

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString164 = "Loading title screen - ";

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!lk;Z)V")
	public static void method3543(@OriginalArg(0) Class36_Sub3 arg0) {
		@Pc(4) int local4 = arg0.anInt4078 - Static183.anInt3590;
		@Pc(20) int local20 = arg0.anInt4143 * 128 + arg0.method3110() * 64;
		@Pc(31) int local31 = arg0.anInt4092 * 128 + arg0.method3110() * 64;
		arg0.anInt4148 = 0;
		if (arg0.anInt4063 == 0) {
			arg0.anInt4081 = 1024;
		}
		arg0.anInt4117 += (local20 - arg0.anInt4117) / local4;
		if (arg0.anInt4063 == 1) {
			arg0.anInt4081 = 1536;
		}
		arg0.anInt4118 += (local31 - arg0.anInt4118) / local4;
		if (arg0.anInt4063 == 2) {
			arg0.anInt4081 = 0;
		}
		if (arg0.anInt4063 == 3) {
			arg0.anInt4081 = 512;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ph;B)V")
	public static void method3544(@OriginalArg(0) Class36_Sub3_Sub2 arg0) {
		for (@Pc(18) Class8_Sub12 local18 = (Class8_Sub12) Static191.aClass182_24.method4319(); local18 != null; local18 = (Class8_Sub12) Static191.aClass182_24.method4329()) {
			if (arg0 == local18.aClass36_Sub3_Sub2_1) {
				if (local18.aClass8_Sub8_Sub4_3 != null) {
					Static84.aClass8_Sub8_Sub1_1.method837(local18.aClass8_Sub8_Sub4_3);
					local18.aClass8_Sub8_Sub4_3 = null;
				}
				local18.method4273();
				return;
			}
		}
	}
}
