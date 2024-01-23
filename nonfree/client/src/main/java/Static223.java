import java.net.URL;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!k;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	public static int anInt4775 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public static void method3534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static27.aFloat44 = arg1;
		if (Static106.anInt2378 == 2) {
			Static120.anInt6251 = arg0;
			Static44.anInt1071 = arg1;
		}
		Static62.aFloat16 = arg0;
		Static140.method2324();
		Static136.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!pd;")
	public static Class1_Sub3_Sub5_Sub1 method3535(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub3_Sub5_Sub1 local6 = (Class1_Sub3_Sub5_Sub1) Static138.aClass89_18.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static41.aClass168_34.method4058(0, arg0);
		local6 = new Class1_Sub3_Sub5_Sub1(local21);
		local6.method3502(Static225.aClass46Array5, null);
		Static138.aClass89_18.method2272((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(JJ)J")
	public static long method3538(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZLclient!th;BLclient!th;)Lclient!ui;")
	public static Class1_Sub3_Sub21 method3541(@OriginalArg(0) int arg0, @OriginalArg(2) Class168 arg1, @OriginalArg(4) Class168 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(8) int[] local8 = arg2.method4044(arg0);
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			@Pc(42) byte[] local42 = arg2.method4051(arg0, local8[local14]);
			if (local42 == null) {
				local3 = false;
			} else {
				@Pc(64) int local64 = local42[1] & 0xFF | (local42[0] & 0xFF) << 8;
				@Pc(72) byte[] local72 = arg1.method4051(local64, 0);
				if (local72 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class1_Sub3_Sub21(arg2, arg1, arg0, false);
		} catch (@Pc(104) Exception local104) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z")
	public static boolean method3542(@OriginalArg(0) int arg0) {
		@Pc(7) Class80_Sub1 local7 = Static215.method3450(arg0);
		if (local7 == null) {
			return false;
		} else if (Static179.anInt3942 == 1 || Static179.anInt3942 == 2 || Static236.anInt1712 == 2) {
			Static96.anInt2210 = local7.anInt2583;
			Static44.aString59 = local7.aString164;
			if (Static236.anInt1712 != 0) {
				Static265.anInt5307 = Static96.anInt2210 + 40000;
				Static277.anInt5551 = Static96.anInt2210 + 50000;
				Static188.anInt4156 = Static265.anInt5307;
			}
			return true;
		} else {
			@Pc(52) String local52 = "";
			@Pc(54) String local54 = "";
			if (Static210.aString313 != null) {
				local54 = "/p=" + Static210.aString313;
			}
			if (Static236.anInt1712 != 0) {
				local52 = ":" + (local7.anInt2583 + 7000);
			}
			@Pc(127) String local127 = "http://" + local7.aString164 + local52 + "/l=" + Static134.anInt3081 + "/a=" + Static23.anInt656 + local54 + "/j" + (Static109.aBoolean152 ? "1" : "0") + ",o" + (Static89.aBoolean387 ? "1" : "0") + ",a2,m" + (Static245.aBoolean315 ? "1" : "0");
			try {
				Static241.aClient1.getAppletContext().showDocument(new URL(local127), "_self");
				return true;
			} catch (@Pc(137) Exception local137) {
				return false;
			}
		}
	}
}
