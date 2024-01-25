import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array14;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_168 = new Class397(46, 6);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!hu;)I")
	public static int method7938(@OriginalArg(1) Class167 arg0) {
		if (Static259.aClass167_4 == arg0) {
			return 5120;
		} else if (Static259.aClass167_5 == arg0) {
			return 5122;
		} else if (arg0 == Static259.aClass167_6) {
			return 5124;
		} else if (Static259.aClass167_7 == arg0) {
			return 5121;
		} else if (Static259.aClass167_8 == arg0) {
			return 5123;
		} else if (Static259.aClass167_9 == arg0) {
			return 5125;
		} else if (Static259.aClass167_10 == arg0) {
			return 5131;
		} else if (arg0 == Static259.aClass167_11) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!nt;I)V")
	public static void method7939(@OriginalArg(0) Class270 arg0) {
		@Pc(7) Class270 local7 = Static518.method6970(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static76.anInt1720;
			local12 = Static681.anInt10652;
		} else {
			local12 = local7.anInt7015;
			local15 = local7.anInt7045;
		}
		Static114.method2189(local12, arg0, local15, false);
		Static266.method3805(local15, arg0, local12);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method7940(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static505.method6886(arg0, arg1) : Integer.toString(arg1);
	}
}
