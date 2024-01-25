import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wc", name = "hd", descriptor = "I")
	public static int anInt6714;

	@OriginalMember(owner = "client!wc", name = "xc", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_223 = new Class18(13, 11);

	@OriginalMember(owner = "client!wc", name = "Mc", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_224 = new Class18(16, 3);

	@OriginalMember(owner = "client!wc", name = "cd", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_205 = new Class217(35, -1);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIIJ)Ljava/lang/String;")
	public static String method5850(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(23) boolean local23 = false;
		if (arg3 < 0L) {
			local23 = true;
			arg3 = -arg3;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		@Pc(51) int local51;
		if (arg1 > 0) {
			for (local46 = 0; local46 < arg1; local46++) {
				local51 = (int) arg3;
				arg3 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg3 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			local51 = (int) arg3;
			arg3 /= 10L;
			local39.append((char) (local51 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local23) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg0) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!kg;BLclient!fp;)V")
	public static void method5854(@OriginalArg(0) Class112 arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(36) boolean local36 = Static243.aClass220_2.method5978(arg0.anInt3432, arg1, arg0.anInt3442, arg0.aBoolean241 ? Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1 : null, arg0.anInt3451, arg0.anInt3389, arg0.anInt3380 | 0xFF000000) == null;
		if (local36) {
			Static198.aClass42_34.method1549(new Class1_Sub36(arg0.anInt3451, arg0.anInt3432, arg0.anInt3442, arg0.anInt3380 | 0xFF000000, arg0.anInt3389, arg0.aBoolean241));
		}
	}
}
