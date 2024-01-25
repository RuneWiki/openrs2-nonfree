import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!jm", name = "Q", descriptor = "Lclient!ib;")
	public static final Class13 aClass13_1 = Static91.method7969();

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IZLjava/lang/String;)V")
	public static void method4129(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		Static313.method5432(arg0, arg3, null, arg2, arg1, arg4, -1);
	}

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "(I)V")
	public static void method4130() {
		@Pc(9) int local9 = (int) ((double) Static237.anInt4563 * 34.46D);
		local9 <<= 0x0;
		if (Static455.aClass4_11.method7151()) {
			local9 += 128;
		}
		Static455.aClass4_11.ta(50, local9);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!os;)Ljava/lang/String;")
	public static String method4131(@OriginalArg(1) Class1_Sub17 arg0) {
		return Static545.method8262(arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method4132(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static542.aCharArray8[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}
