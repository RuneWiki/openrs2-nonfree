import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!hda", name = "G", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method3535(@OriginalArg(1) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += local27 + 27 - 48;
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;ZLclient!ra;B)V")
	public static void method3537(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class80 arg2) {
		@Pc(20) int local20 = Static267.aClass244_5.method6159(null, arg0, 250);
		@Pc(29) int local29 = Static267.aClass244_5.method6150(arg0, 250, null) * 13;
		Static243.aClass42_4.f(6, 6, local20 + 4 + 4, local29 - -4 + 4, -16777216, 0);
		Static243.aClass42_4.method5834(6, 6, local20 + 4 + 4, local29 + 8, -1, 0);
		arg2.method7778(-1, 10, 0, arg0, 0, null, null, 1, 10, local29, local20, -1, null);
		Static480.method7208(6, 6, local29 + 4 + 4, local20 + 8);
		if (arg1) {
			try {
				Static243.aClass42_4.method5821();
			} catch (@Pc(122) Exception_Sub1 local122) {
			}
		}
	}
}
