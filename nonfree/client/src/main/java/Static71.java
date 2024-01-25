import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	public static int anInt1203;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_4 = new Class163(0, 6);

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	public static void method1100(@OriginalArg(0) int arg0) {
		if (Static82.anIntArray354 == null || Static82.anIntArray354.length < arg0) {
			Static82.anIntArray354 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[Lclient!vk;")
	public static Class259[] method1102() {
		return new Class259[] { Static446.aClass259_4, Static259.aClass259_2, Static207.aClass259_1 };
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)[Lclient!fg;")
	public static Class78[] method1104() {
		return new Class78[] { Static173.aClass78_1, Static173.aClass78_2, Static173.aClass78_3, Static173.aClass78_4, Static173.aClass78_5, Static173.aClass78_6, Static173.aClass78_7, Static173.aClass78_8, Static173.aClass78_9, Static173.aClass78_10, Static173.aClass78_11, Static173.aClass78_12 };
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method1107(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(19) char local19 = arg0.charAt(local10);
			if (local19 >= 'A' && local19 <= 'Z') {
				local5 += local19 + 1 - 65;
			} else if (local19 >= 'a' && local19 <= 'z') {
				local5 += local19 - 96;
			} else if (local19 >= '0' && local19 <= '9') {
				local5 += local19 + 27 - 48;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}
}
