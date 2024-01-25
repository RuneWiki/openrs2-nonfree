import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Lclient!uf;")
	public static final Class334 aClass334_6 = new Class334();

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public static int anInt6170 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!wk;IIB)J")
	public static long method5170(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class350 local19 = Static619.aClass281_4.method6734(arg0.method8326());
		@Pc(40) long local40 = (long) ((arg0.method8329() | 0x10000) << 14 | arg2 << 7 | arg1 | arg0.method8328() << 20);
		if (local19.anInt9624 == 0) {
			local40 |= local12;
		}
		if (local19.anInt9635 == 1) {
			local40 |= local10;
		}
		return local40 | (long) arg0.method8326() << 32;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Lclient!mf;")
	public static Class217 method5171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static440.aClass217ArrayArrayArray3[0][arg1][arg2] != null && Static440.aClass217ArrayArrayArray3[0][arg1][arg2].aClass217_1 != null;
			if (local28 && arg0 >= Static330.anInt4381 - 1) {
				return null;
			}
			Static526.method7336(arg0, arg1, arg2);
		}
		return Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method5172(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(7) int local7 = arg1.indexOf(arg0); local7 != -1; local7 = arg1.indexOf(arg0, local7 + arg2.length())) {
			arg1 = arg1.substring(0, local7) + arg2 + arg1.substring(arg0.length() + local7);
		}
		return arg1;
	}
}
