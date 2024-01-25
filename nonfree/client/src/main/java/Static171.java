import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
	public static int anInt3340;

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_50 = new Class130(14, 8);

	@OriginalMember(owner = "client!gaa", name = "F", descriptor = "Lclient!mfa;")
	public static final Class215 aClass215_1 = new Class215(1);

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3001(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local45.append(Static152.aCharArray2[(int) (local49 - arg0 * 37L)]);
			}
			return local45.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;ZZII)V")
	public static void method3002(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static441.method6863(arg1, arg3, null, arg0, arg2, false);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)Z")
	public static boolean method3004(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
