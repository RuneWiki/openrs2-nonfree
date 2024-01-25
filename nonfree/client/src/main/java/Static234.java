import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_60 = new Class397(21, -1);

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "F")
	public static float aFloat61 = 0.25F;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_61 = new Class397(135, -2);

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Lclient!bd;")
	public static Class31 method3391(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static593.aClass31Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BILjava/lang/String;)Lclient!qo;")
	public static Class314 method3392(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class314 local10;
		try {
			local10 = (Class314) Class.forName("rja").getDeclaredConstructor().newInstance();
		} catch (@Pc(12) Throwable local12) {
			local10 = new Class314_Sub2();
		}
		local10.aString127 = arg1;
		local10.anInt10665 = arg0;
		return local10;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;")
	public static String method3394(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local22 = true;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(45) int local45;
		@Pc(50) int local50;
		if (arg2 > 0) {
			for (local45 = 0; local45 < arg2; local45++) {
				local50 = (int) arg3;
				arg3 /= 10L;
				local38.append((char) (local50 + 48 - (int) arg3 * 10));
			}
			local38.append(local7);
		}
		local45 = 0;
		while (true) {
			local50 = (int) arg3;
			arg3 /= 10L;
			local38.append((char) (local50 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local22) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg0) {
				local45++;
				if (local45 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V")
	public static void method3396(@OriginalArg(0) int arg0) {
		Static489.anInt10872 = 100;
		Static412.anInt6360 = 3;
		Static496.anInt7889 = -1;
		Static270.anInt4162 = arg0;
	}
}
