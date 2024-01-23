import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public static int anInt1244;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "I")
	public static int anInt1237 = 0;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Lclient!gi;")
	public static Class64 aClass64_11 = new Class64(128);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!rf;)V")
	public static void method1011(@OriginalArg(1) Class6_Sub6 arg0) {
		@Pc(9) int local9 = arg0.anInt4515 - Static261.anInt5259;
		@Pc(20) int local20 = arg0.anInt4553 * 128 + arg0.method3509() * 64;
		@Pc(33) int local33 = arg0.anInt4537 * 128 + arg0.method3509() * 64;
		arg0.anInt4551 = 0;
		arg0.anInt4569 += (local33 - arg0.anInt4569) / local9;
		arg0.anInt4562 += (local20 - arg0.anInt4562) / local9;
		if (arg0.anInt4524 == 0) {
			arg0.anInt4579 = 1024;
		}
		if (arg0.anInt4524 == 1) {
			arg0.anInt4579 = 1536;
		}
		if (arg0.anInt4524 == 2) {
			arg0.anInt4579 = 0;
		}
		if (arg0.anInt4524 == 3) {
			arg0.anInt4579 = 512;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
	public static void method1014() {
		Static26.aClass31_7.method855();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1015(@OriginalArg(1) long arg0) {
		Static186.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static186.aCalendar1.get(7);
		@Pc(17) int local17 = Static186.aCalendar1.get(5);
		@Pc(28) int local28 = Static186.aCalendar1.get(2);
		@Pc(32) int local32 = Static186.aCalendar1.get(1);
		@Pc(36) int local36 = Static186.aCalendar1.get(11);
		@Pc(40) int local40 = Static186.aCalendar1.get(12);
		@Pc(44) int local44 = Static186.aCalendar1.get(13);
		return Static271.aStringArray32[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static297.aStringArray39[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method1017(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(15) byte[] local15 = (byte[]) arg1;
			return arg0 ? Static112.method1751(local15) : local15;
		} else if (arg1 instanceof Class8) {
			@Pc(30) Class8 local30 = (Class8) arg1;
			return local30.method2695();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
