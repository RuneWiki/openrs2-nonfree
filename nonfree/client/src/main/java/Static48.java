import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Lclient!eq;")
	public static Class97 aClass97_6;

	@OriginalMember(owner = "client!br", name = "q", descriptor = "I")
	public static int anInt1059;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBJ)V")
	public static void method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static191.method5050(0, true, 0, local10, 0, arg1, arg0, local17);
			return;
		}
		@Pc(52) Class350 local52 = Static619.aClass281_4.method6734(local24);
		@Pc(65) int local65;
		@Pc(62) int local62;
		if (local17 == 0 || local17 == 2) {
			local62 = local52.anInt9622;
			local65 = local52.anInt9662;
		} else {
			local62 = local52.anInt9662;
			local65 = local52.anInt9622;
		}
		@Pc(75) int local75 = local52.anInt9633;
		if (local17 != 0) {
			local75 = (local75 << local17 & 0xF) + (local75 >> 4 - local17);
		}
		Static191.method5050(local75, true, local62, 0, local65, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method946(@OriginalArg(0) String arg0) {
		for (@Pc(16) int local16 = 0; local16 < Static390.aStringArray24.length; local16++) {
			if (Static390.aStringArray24[local16].equalsIgnoreCase(arg0)) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIII)V")
	public static void method947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static292.anInt8376 / (float) Static292.anInt8378;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg1 - local11) / 2;
		@Pc(49) int local49 = arg2 - (arg3 - local13) / 2;
		Static304.anInt5622 = Static292.anInt8376 - local49 * Static292.anInt8376 / local13;
		Static413.anInt7559 = -1;
		Static416.anInt7592 = Static292.anInt8378 * local40 / local11;
		Static92.anInt1857 = -1;
		Static466.method3730();
	}
}
