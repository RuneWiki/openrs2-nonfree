import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!cda;")
	public static Class47 aClass47_6;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public static int anInt9657 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(JBIIZ)Ljava/lang/String;")
	public static String method8181(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg0 < 0L) {
			local24 = true;
			arg0 = -arg0;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(42) int local42;
		@Pc(47) int local47;
		if (arg1 > 0) {
			for (local42 = 0; local42 < arg1; local42++) {
				local47 = (int) arg0;
				arg0 /= 10L;
				local38.append((char) (local47 + 48 - (int) arg0 * 10));
			}
			local38.append(local7);
		}
		local42 = 0;
		while (true) {
			local47 = (int) arg0;
			arg0 /= 10L;
			local38.append((char) (local47 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local24) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg3) {
				local42++;
				if (local42 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public static void method8182() {
		@Pc(13) Class6_Sub15 local13 = (Class6_Sub15) Static334.aClass8_33.method149();
		@Pc(24) boolean local24 = Static478.aClass302_56 != null || Static614.anInt10101 > 0;
		@Pc(28) int local28 = local13.method8383();
		@Pc(32) int local32 = local13.method8387();
		if (local24) {
			Static194.anInt3940 = 1;
		}
		if (local24) {
			Static120.aClass6_Sub2_Sub4_1 = Static482.aClass6_Sub2_Sub4_4;
		} else {
			Static20.method337(local32, Static482.aClass6_Sub2_Sub4_4, local28);
		}
	}
}
