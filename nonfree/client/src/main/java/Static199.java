import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
	public static int anInt3921;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString256 = "glow1:";

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method3566(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static239.aClass152_1);
		arg0.removeFocusListener(Static239.aClass152_1);
		Static225.anInt4491 = -1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!rk;ILclient!lg;Lclient!rk;)V")
	public static void method3567(@OriginalArg(0) Class180 arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Class180 arg2) {
		Static211.aClass180_54 = arg0;
		Static286.aClass180_79 = arg2;
		Static320.anInterface4_1 = arg1;
		if (Static286.aClass180_79 != null) {
			Static336.anInt4181 = Static286.aClass180_79.method4553(1);
		}
		if (Static211.aClass180_54 != null) {
			Static132.anInt2880 = Static211.aClass180_54.method4553(1);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method3568(@OriginalArg(1) String arg0) {
		@Pc(10) long local10 = 0L;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			local10 *= 37L;
			@Pc(24) char local24 = arg0.charAt(local15);
			if (local24 >= 'A' && local24 <= 'Z') {
				local10 += local24 + 1 - 65;
			} else if (local24 >= 'a' && local24 <= 'z') {
				local10 += local24 + 1 - 97;
			} else if (local24 >= '0' && local24 <= '9') {
				local10 += local24 + 27 - 48;
			}
			if (local10 >= 177917621779460413L) {
				break;
			}
		}
		while (local10 % 37L == 0L && local10 != 0L) {
			local10 /= 37L;
		}
		return local10;
	}
}
