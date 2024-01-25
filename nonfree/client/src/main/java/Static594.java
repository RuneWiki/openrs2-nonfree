import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!eh;")
	public static Class56 aClass56_14;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Lclient!fda;")
	public static Class112 aClass112_18;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray84 = new int[6][];

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance();

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean710 = true;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!kia;I)I")
	public static int method8045(@OriginalArg(0) Class41_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(6) Class311 local6 = arg0.aClass311_1;
		if (local6.anIntArray476 != null) {
			local6 = local6.method7325(Static413.aClass63_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(26) int local26 = local6.anInt8677;
		@Pc(30) Class201 local30 = arg0.method7933();
		if (arg0.anInt9484 == -1 || arg0.aBoolean690) {
			local26 = local6.lb;
		} else if (local30.anInt4759 == arg0.anInt9484 || local30.anInt4786 == arg0.anInt9484 || local30.anInt4776 == arg0.anInt9484 || arg0.anInt9484 == local30.anInt4761) {
			local26 = local6.anInt8661;
		} else if (local30.anInt4781 == arg0.anInt9484 || arg0.anInt9484 == local30.anInt4779 || arg0.anInt9484 == local30.anInt4765 || arg0.anInt9484 == local30.anInt4753) {
			local26 = local6.anInt8639;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method8046(@OriginalArg(1) Class211 arg0) {
		Static651.aClass211_1 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
	public static String method8048(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(5) char local5 = ',';
		@Pc(7) char local7 = '.';
		if (arg3 == 0) {
			local5 = '.';
			local7 = ',';
		}
		if (arg3 == 2) {
			local7 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg2 < (long) 0) {
			local22 = true;
			arg2 = -arg2;
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(26);
		@Pc(44) int local44;
		@Pc(48) int local48;
		if (arg0 > 0) {
			for (local44 = 0; local44 < arg0; local44++) {
				local48 = (int) arg2;
				arg2 /= 10L;
				local37.append((char) (local48 + 48 - (int) arg2 * 10));
			}
			local37.append(local5);
		}
		local44 = 0;
		while (true) {
			local48 = (int) arg2;
			arg2 /= 10L;
			local37.append((char) (local48 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local22) {
					local37.append('-');
				}
				return local37.reverse().toString();
			}
			if (arg1) {
				local44++;
				if (local44 % 3 == 0) {
					local37.append(local7);
				}
			}
		}
	}
}
