import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_184 = new Class60();

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "Z")
	public static boolean aBoolean775 = false;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method7978(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static143.anInt2455; local12++) {
			if (arg0.equalsIgnoreCase(Static80.aStringArray8[local12])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z")
	public static boolean method7979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return ((arg1 & 0x2000) != 0 | Static671.method9143(arg1, arg2) | Static46.method603(arg2, arg1)) & Static596.method8184(arg1, arg2);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZIZLjava/lang/String;Ljava/lang/String;)V")
	public static void method7981(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		Static376.aString64 = arg3;
		if (!arg0) {
			Static233.anInt3710 = -1;
		}
		Static489.aString91 = arg2;
		Static449.aBoolean616 = arg0;
		Static390.aBoolean547 = arg1;
		if (!Static449.aBoolean616 && (Static376.aString64.equals("") || Static489.aString91.equals(""))) {
			Static223.method7019(3);
			return;
		}
		if (Static25.anInt319 != 1) {
			Static368.anInt5884 = 0;
			Static580.anInt9159 = -1;
			Static78.anInt1361 = -1;
		}
		Static560.aClass221_3.aBoolean488 = false;
		Static223.method7019(-3);
		Static395.anInt6513 = 0;
		Static479.anInt7695 = 0;
		Static391.anInt6484 = 1;
	}
}
