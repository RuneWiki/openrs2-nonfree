import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIZILclient!pi;)Ljava/awt/Frame;")
	public static Frame method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class258 arg3) {
		if (!arg3.method5884()) {
			return null;
		}
		@Pc(20) Class306[] local20 = Static517.method6937(arg3);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt7912 == arg2 && arg0 == local20[local28].anInt7911 && (!local26 || local20[local28].anInt7909 > arg1)) {
				local26 = true;
				arg1 = local20[local28].anInt7909;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(90) Class39 local90 = arg3.method5896(arg0, arg2, arg1);
		while (local90.anInt894 == 0) {
			Static589.method7892(10L);
		}
		@Pc(110) Frame local110 = (Frame) local90.anObject2;
		if (local110 == null) {
			return null;
		} else if (local90.anInt894 == 2) {
			Static40.method656(arg3, local110);
			return null;
		} else {
			return local110;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIJ)V")
	public static void method2726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(12) int local12 = (int) arg2 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg2 >> 20 & 0x3;
		@Pc(26) int local26 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local12 != 10 && local12 != 11 && local12 != 22) {
			Static492.method6667(0, local19, local12, 0, 0, arg0, true, arg1);
			return;
		}
		@Pc(57) Class280 local57 = Static478.aClass212_3.method4793(local26);
		@Pc(65) int local65;
		@Pc(68) int local68;
		if (local19 == 0 || local19 == 2) {
			local65 = local57.anInt7391;
			local68 = local57.anInt7396;
		} else {
			local65 = local57.anInt7396;
			local68 = local57.anInt7391;
		}
		@Pc(79) int local79 = local57.anInt7360;
		if (local19 != 0) {
			local79 = (local79 << local19 & 0xF) + (local79 >> 4 - local19);
		}
		Static492.method6667(local79, 0, 0, local68, local65, arg0, true, arg1);
	}
}
