import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static int anInt3950 = 0;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt3955 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)V")
	public static void method3662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(15) int local15 = arg2 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static121.method2581(arg4, arg2, arg0, arg3);
			}
		} else if (local15 == 0) {
			Static209.method3809(arg0, arg3, arg4, arg1);
		} else {
			@Pc(47) int local47 = (local15 << 12) / local10;
			@Pc(61) int local61 = arg4 - (arg3 * local47 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (Static6.anInt136 > arg3) {
				local75 = Static6.anInt136;
				local73 = local61 + (local47 * Static6.anInt136 >> 12);
			} else if (Static275.anInt5244 >= arg3) {
				local73 = arg4;
				local75 = arg3;
			} else {
				local75 = Static275.anInt5244;
				local73 = local61 + (Static275.anInt5244 * local47 >> 12);
			}
			@Pc(106) int local106;
			@Pc(114) int local114;
			if (Static6.anInt136 > arg1) {
				local106 = Static6.anInt136;
				local114 = (Static6.anInt136 * local47 >> 12) + local61;
			} else if (Static275.anInt5244 >= arg1) {
				local106 = arg1;
				local114 = arg2;
			} else {
				local114 = local61 + (local47 * Static275.anInt5244 >> 12);
				local106 = Static275.anInt5244;
			}
			if (Static32.anInt750 > local114) {
				local114 = Static32.anInt750;
				local106 = (Static32.anInt750 - local61 << 12) / local47;
			} else if (Static112.anInt2485 < local114) {
				local114 = Static112.anInt2485;
				local106 = (Static112.anInt2485 - local61 << 12) / local47;
			}
			if (Static32.anInt750 > local73) {
				local75 = (Static32.anInt750 - local61 << 12) / local47;
				local73 = Static32.anInt750;
			} else if (Static112.anInt2485 < local73) {
				local75 = (Static112.anInt2485 - local61 << 12) / local47;
				local73 = Static112.anInt2485;
			}
			Static156.method5351(local114, local106, arg0, local73, local75);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method3664(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static215.method3866(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(44) int local44 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(47) int local47;
			do {
				local47 = arg0.nextInt();
			} while (local44 <= local47);
			return Static190.method3621(local47, arg1);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIILclient!e;II)V")
	public static void method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class46 arg6, @OriginalArg(7) int arg7) {
		@Pc(11) Interface7 local11 = (Interface7) Static242.method4277(arg0, arg2, arg1);
		@Pc(19) Class59 local19;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (local11 != null) {
			local19 = Static232.method2200(local11.method4070());
			local25 = local11.method4067() & 0x3;
			local29 = local11.method4066();
			if (local19.anInt1949 == -1) {
				local36 = arg7;
				if (local19.anInt1955 > 0) {
					local36 = arg5;
				}
				if (local29 == 0 || local29 == 2) {
					if (local25 == 0) {
						arg6.method5099(arg3, 4, arg4, local36);
					} else if (local25 == 1) {
						arg6.method5113(local36, arg4, arg3, 4);
					} else if (local25 == 2) {
						arg6.method5099(arg3 + 3, 4, arg4, local36);
					} else if (local25 == 3) {
						arg6.method5113(local36, arg4 + 3, arg3, 4);
					}
				}
				if (local29 == 3) {
					if (local25 == 0) {
						arg6.method5108(1, arg3, 1, local36, arg4);
					} else if (local25 == 1) {
						arg6.method5108(1, arg3 + 3, 1, local36, arg4);
					} else if (local25 == 2) {
						arg6.method5108(1, arg3 + 3, 1, local36, arg4 + 3);
					} else if (local25 == 3) {
						arg6.method5108(1, arg3, 1, local36, arg4 + 3);
					}
				}
				if (local29 == 2) {
					if (local25 == 0) {
						arg6.method5113(local36, arg4, arg3, 4);
					} else if (local25 == 1) {
						arg6.method5099(arg3 + 3, 4, arg4, local36);
					} else if (local25 == 2) {
						arg6.method5113(local36, arg4 + 3, arg3, 4);
					} else if (local25 == 3) {
						arg6.method5099(arg3, 4, arg4, local36);
					}
				}
			} else {
				Static274.method4658(arg3, local25, arg6, arg4, local19);
			}
		}
		local11 = (Interface7) Static263.method4514(arg0, arg2, arg1, up.class);
		if (local11 != null) {
			local19 = Static232.method2200(local11.method4070());
			local25 = local11.method4067() & 0x3;
			local29 = local11.method4066();
			if (local19.anInt1949 != -1) {
				Static274.method4658(arg3, local25, arg6, arg4, local19);
			} else if (local29 == 9) {
				local36 = -1118482;
				if (local19.anInt1955 > 0) {
					local36 = -1179648;
				}
				if (local25 == 0 || local25 == 2) {
					arg6.method5120(arg3 + 3, arg4 + 3, arg3, arg4, local36);
				} else {
					arg6.method5120(arg3 + 3, arg4, arg3, arg4 + 3, local36);
				}
			}
		}
		local11 = (Interface7) Static274.method4660(arg0, arg2, arg1);
		if (local11 == null) {
			return;
		}
		local19 = Static232.method2200(local11.method4070());
		local25 = local11.method4067() & 0x3;
		if (local19.anInt1949 != -1) {
			Static274.method4658(arg3, local25, arg6, arg4, local19);
		}
	}
}
