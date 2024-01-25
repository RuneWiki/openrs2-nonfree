import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
	public static int anInt9633;

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)Lclient!vi;")
	public static Class2_Sub52 method8448() {
		@Pc(6) Class2_Sub52 local6 = Static512.method7980();
		local6.anInt10946 = 0;
		local6.aClass341_108 = null;
		local6.aClass2_Sub8_Sub2_2 = new Class2_Sub8_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Z")
	public static boolean method8449(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!lja;)V")
	public static void method8451(@OriginalArg(0) Class217 arg0) {
		Static212.aClass217_1 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([BBIIII)V")
	public static void method8453(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		arg2 += arg3;
		@Pc(30) int local30 = arg1 - arg3 >> 2;
		while (true) {
			local30--;
			if (local30 < 0) {
				local30 = arg1 - arg3 & 0x3;
				while (true) {
					local30--;
					if (local30 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(35) int local35 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local35] = 1;
			@Pc(45) int local45 = local40 + 1;
			arg0[local40] = 1;
			arg2 = local45 + 1;
			arg0[local45] = 1;
		}
	}
}
