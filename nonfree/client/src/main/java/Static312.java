import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	public static int anInt5126;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "Lclient!ek;")
	public static Class42 aClass42_81;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString171 = "Prepared sound engine";

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)I")
	public static int method4080(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub10 local18 = (Class2_Sub10) Static219.aClass101_18.method2867((long) arg0);
		if (local18 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local18.anIntArray105.length) {
			return local18.anIntArray105[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	public static void method4082() {
		Static18.anInterface5Array1 = null;
		Static286.method4454();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!g;)Z")
	public static boolean method4083(@OriginalArg(1) Class56 arg0) {
		if (arg0.anIntArray185 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < arg0.anIntArray185.length; local13++) {
			@Pc(27) int local27 = Static127.method2292(local13, arg0);
			@Pc(32) int local32 = arg0.anIntArray182[local13];
			if (arg0.anIntArray185[local13] == 2) {
				if (local27 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray185[local13] == 3) {
				if (local27 <= local32) {
					return false;
				}
			} else if (arg0.anIntArray185[local13] == 4) {
				if (local32 == local27) {
					return false;
				}
			} else if (local27 != local32) {
				return false;
			}
		}
		return true;
	}
}
