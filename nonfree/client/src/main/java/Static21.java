import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Z")
	public static boolean aBoolean12;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!ed;")
	public static Class5_Sub19 aClass5_Sub19_1;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_1 = new Class376(4, 8);

	@OriginalMember(owner = "client!am", name = "o", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_1 = new Class365(1, 2);

	@OriginalMember(owner = "client!am", name = "q", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!cca;I[I[I[I)V")
	public static void method257(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg1[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg0.aClass228Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass228Array3[local23] = null;
					} else {
						@Pc(47) Class362 local47 = Static435.aClass298_1.method7034(local13);
						@Pc(50) int local50 = local47.anInt10002;
						@Pc(55) Class228 local55 = arg0.aClass228Array3[local23];
						if (local55 != null) {
							if (local55.anInt5659 == local13) {
								if (local50 == 0) {
									local55 = arg0.aClass228Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt5663 = 1;
									local55.anInt5665 = 0;
									local55.anInt5657 = local21;
									local55.anInt5664 = 0;
									local55.anInt5662 = 0;
									if (!arg0.aBoolean71) {
										Static67.method1108(arg0, 0, local47);
									}
								} else if (local50 == 2) {
									local55.anInt5662 = 0;
								}
							} else if (local47.anInt10005 >= Static435.aClass298_1.method7034(local55.anInt5659).anInt10005) {
								local55 = arg0.aClass228Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg0.aClass228Array3[local23] = new Class228();
							local55.anInt5657 = local21;
							local55.anInt5665 = 0;
							local55.anInt5664 = 0;
							local55.anInt5662 = 0;
							local55.anInt5659 = local13;
							local55.anInt5663 = 1;
							if (!arg0.aBoolean71) {
								Static67.method1108(arg0, 0, local47);
							}
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
