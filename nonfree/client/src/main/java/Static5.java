import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
	public static int anInt59;

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!aca", name = "z", descriptor = "Z")
	public static boolean aBoolean4;

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_3 = new Class305(0, 0);

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(BI)Lclient!fba;")
	public static Class5_Sub3_Sub3 method65(@OriginalArg(1) int arg0) {
		@Pc(18) Class5_Sub3_Sub3 local18 = (Class5_Sub3_Sub3) Static69.aClass97_5.method2405((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static98.aClass390_19.method8914(arg0, 0);
		if (local28 == null || local28.length <= 1) {
			return null;
		}
		try {
			local18 = Static89.method1862(local28);
		} catch (@Pc(44) Exception local44) {
			throw new RuntimeException(local44.getMessage() + " S: " + arg0);
		}
		Static69.aClass97_5.method2400(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(JBI)Ljava/lang/String;")
	public static String method66(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static493.method7070(arg0);
		@Pc(15) int local15 = Static158.aCalendar2.get(5);
		@Pc(21) int local21 = Static158.aCalendar2.get(2) + 1;
		@Pc(25) int local25 = Static158.aCalendar2.get(1);
		return Integer.toString(local15 / 10) + local15 % 10 + "/" + local21 / 10 + local21 % 10 + "/" + local25 % 100 / 10 + local25 % 10;
	}
}
