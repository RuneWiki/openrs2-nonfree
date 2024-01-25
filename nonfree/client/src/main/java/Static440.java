import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	public static int anInt7777;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	public static int anInt7781;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "Lclient!hr;")
	public static Class29 aClass29_3;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Lclient!ul;")
	public static final Class243 aClass243_5 = new Class243(16);

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public static int anInt7784 = 500;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)V")
	public static void method6356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static109.aClass6_Sub1_Sub1_5.method6461(arg1);
		Static109.aClass6_Sub1_Sub1_5.method6453(arg2);
		Static109.aClass6_Sub1_Sub1_5.method6453(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
	public static boolean method6358(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(70) int local70;
			if (local41 >= '0' && local41 <= '9') {
				local70 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local70 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local70 = local41 - 'W';
			} else {
				return false;
			}
			if (local70 >= 10) {
				return false;
			}
			if (local26) {
				local70 = -local70;
			}
			@Pc(117) int local117 = local30 * 10 + local70;
			if (local30 != local117 / 10) {
				return false;
			}
			local28 = true;
			local30 = local117;
		}
		return local28;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method6360(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static212.method3218(arg0, 2);
		local13.method3088();
		local13.aString28 = arg1;
	}
}
