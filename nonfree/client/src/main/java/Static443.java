import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_16 = new Class358(12, 0, 1, 0);

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
	public static int anInt7208 = 13156520;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_141 = new Class56(81, 0);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Z")
	public static boolean method6029(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBLclient!wp;I)V")
	public static void method6034(@OriginalArg(0) int arg0, @OriginalArg(2) Class361 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class81 local13 = arg1.method7897(Static505.aClass45_11);
		if (local13 == null) {
			return;
		}
		Static505.aClass45_11.da(arg2, arg0, arg1.anInt9668 + arg2, arg1.anInt9650 + arg0);
		if (Static503.anInt8177 >= 3) {
			Static505.aClass45_11.FA(-16777216, local13, arg2, arg0);
		} else {
			Static17.aClass14_1.method7679((float) arg1.anInt9668 / 2.0F + (float) arg2, (float) arg0 + (float) arg1.anInt9650 / 2.0F, ((int) -Static43.aFloat20 & 0x3FFF) << 2, local13, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
	public static String method6035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg0 == 0) {
			local12 = '.';
			local14 = ',';
		}
		if (arg0 == 2) {
			local14 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local29 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg1 > 0) {
			for (local50 = 0; local50 < arg1; local50++) {
				local55 = (int) arg2;
				arg2 /= 10L;
				local43.append((char) (local55 + 48 - (int) arg2 * 10));
			}
			local43.append(local12);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg2;
			arg2 /= 10L;
			local43.append((char) (local55 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local29) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg3) {
				local50++;
				if (local50 % 3 == 0) {
					local43.append(local14);
				}
			}
		}
	}
}
