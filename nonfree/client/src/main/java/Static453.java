import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!qea", name = "J", descriptor = "[[S")
	public static short[][] aShortArrayArray18;

	@OriginalMember(owner = "client!qea", name = "L", descriptor = "[Lclient!oq;")
	public static Class251[] aClass251Array1;

	@OriginalMember(owner = "client!qea", name = "R", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!qea", name = "F", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_106 = new Class218(57, 0);

	@OriginalMember(owner = "client!qea", name = "M", descriptor = "I")
	public static final int anInt8226 = 50;

	@OriginalMember(owner = "client!qea", name = "I", descriptor = "[I")
	public static final int[] anIntArray514 = new int[anInt8226];

	@OriginalMember(owner = "client!qea", name = "K", descriptor = "[I")
	public static final int[] anIntArray515 = new int[anInt8226];

	@OriginalMember(owner = "client!qea", name = "O", descriptor = "[I")
	public static final int[] anIntArray516 = new int[anInt8226];

	@OriginalMember(owner = "client!qea", name = "P", descriptor = "[I")
	public static final int[] anIntArray517 = new int[anInt8226];

	@OriginalMember(owner = "client!qea", name = "S", descriptor = "[I")
	public static final int[] anIntArray519 = new int[anInt8226];

	@OriginalMember(owner = "client!qea", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[anInt8226];

	@OriginalMember(owner = "client!qea", name = "V", descriptor = "[I")
	public static final int[] anIntArray520 = new int[anInt8226];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method6836(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local17) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(86) int local86;
				if (local25 >= '0' && local25 <= '9') {
					local86 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local86 = local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local86 = local25 + '\n' - 65;
				}
				local86 *= 16;
				local25 = arg0.charAt(local19 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local86 += local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local86 += local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local86 += local25 - 55;
				}
				local19 += 2;
				if (local86 != 0 && Static144.method3176((byte) local86)) {
					local9.append(Static278.method6290((byte) local86));
				}
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg1 && arg7 == arg6 && arg4 == arg0 && arg3 == arg2) {
			Static530.method7539(arg1, arg7, arg8, arg2, arg0);
			return;
		}
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg7;
		@Pc(21) int local21 = arg1 * 3;
		@Pc(25) int local25 = arg7 * 3;
		@Pc(29) int local29 = arg5 * 3;
		@Pc(33) int local33 = arg6 * 3;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(50) int local50 = local29 + arg0 - local37 - arg1;
		@Pc(59) int local59 = arg2 + local33 - local41 - arg7;
		@Pc(69) int local69 = local21 + local37 - local29 - local29;
		@Pc(79) int local79 = local25 + local41 - local33 - local33;
		@Pc(83) int local83 = local29 - local21;
		@Pc(87) int local87 = local33 - local25;
		for (@Pc(89) int local89 = 128; local89 <= 4096; local89 += 128) {
			@Pc(97) int local97 = local89 * local89 >> 12;
			@Pc(103) int local103 = local89 * local97 >> 12;
			@Pc(107) int local107 = local50 * local103;
			@Pc(111) int local111 = local59 * local103;
			@Pc(115) int local115 = local69 * local97;
			@Pc(119) int local119 = local97 * local79;
			@Pc(123) int local123 = local83 * local89;
			@Pc(127) int local127 = local87 * local89;
			@Pc(139) int local139 = arg1 + (local115 + local107 + local123 >> 12);
			@Pc(151) int local151 = arg7 + (local119 + local111 + local127 >> 12);
			Static530.method7539(local15, local17, arg8, local151, local139);
			local15 = local139;
			local17 = local151;
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(Z)V")
	public static void method6838() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static88.anInt2308 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
