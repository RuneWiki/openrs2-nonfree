import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
	public static int anInt440 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZ)Z")
	public static boolean method356(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!at;Lclient!at;I)V")
	public static void method357(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1) {
		Static29.method451(Static114.aClass102_71);
		Static456.aClass2_Sub13_Sub2_2.method3569(arg1.anInt293);
		Static456.aClass2_Sub13_Sub2_2.method3577(arg0.anInt301);
		Static456.aClass2_Sub13_Sub2_2.method3569(arg0.anInt293);
		Static456.aClass2_Sub13_Sub2_2.method3577(arg0.anInt320);
		Static456.aClass2_Sub13_Sub2_2.method3595(arg1.anInt301);
		Static456.aClass2_Sub13_Sub2_2.method3568(arg1.anInt320);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method358(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
	public static void method360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static2.aClass148_Sub1_1.anInt3778 != 0 && arg3 != 0 && Static208.anInt3488 < 50 && arg1 != -1) {
			Static147.aClass64Array1[Static208.anInt3488++] = new Class64((byte) 2, arg1, arg3, arg0, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!ws;)V")
	public static void method361(@OriginalArg(1) Class2_Sub46 arg0) {
		if (!Static126.aBoolean52) {
			arg0.method5703();
			Static137.anInt6647--;
		}
	}
}
