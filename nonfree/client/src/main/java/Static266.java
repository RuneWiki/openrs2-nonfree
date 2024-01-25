import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "Lclient!gt;")
	public static Class123 aClass123_7;

	@OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
	public static int anInt5676;

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
	public static int anInt5673 = 0;

	@OriginalMember(owner = "client!ju", name = "D", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_70 = new Class71(110, 6);

	@OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
	public static int anInt5675 = -1;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "I")
	public static int anInt5677 = 1;

	@OriginalMember(owner = "client!ju", name = "M", descriptor = "I")
	public static int anInt5681 = -1;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZZZ)V")
	public static void method4631(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static413.anInt7858--;
			if (Static413.anInt7858 == 0) {
				Static77.anIntArray92 = null;
			}
		}
		if (arg0) {
			Static252.anInt5530--;
			if (Static252.anInt5530 == 0) {
				Static491.anIntArray491 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;")
	public static String method4633(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(18) String local18 = arg0[arg1];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg2 + arg1;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg1; local33 < local29; local33++) {
				@Pc(39) String local39 = arg0[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local31);
			for (@Pc(67) int local67 = arg1; local67 < local29; local67++) {
				@Pc(73) String local73 = arg0[local67];
				if (local73 == null) {
					local65.append("null");
				} else {
					local65.append(local73);
				}
			}
			return local65.toString();
		}
	}
}
