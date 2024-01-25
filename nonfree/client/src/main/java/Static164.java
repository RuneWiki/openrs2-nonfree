import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
	public static int anInt10678;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "[I")
	public static int[] anIntArray710;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_154 = new Class289(8, -1);

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
	public static final int anInt10672 = -1;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "Lclient!hba;")
	public static final Class134 aClass134_11 = new Class134();

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)Z")
	public static boolean method9055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public static void method9056(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 5);
		local9.method7979();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method9057(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static351.method5106(arg0);
		@Pc(17) int local17 = Static43.aCalendar1.get(5);
		@Pc(23) int local23 = Static43.aCalendar1.get(2) + 1;
		@Pc(27) int local27 = Static43.aCalendar1.get(1);
		return Integer.toString(local17 / 10) + local17 % 10 + "/" + local23 / 10 + local23 % 10 + "/" + local27 % 100 / 10 + local27 % 10;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(CI)Z")
	public static boolean method9059(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static418.method6243(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static45.aCharArray2;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static304.aCharArray5;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (local55 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
