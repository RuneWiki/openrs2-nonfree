import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!uk", name = "nb", descriptor = "I")
	public static int anInt8911;

	@OriginalMember(owner = "client!uk", name = "pb", descriptor = "I")
	public static int anInt8913;

	@OriginalMember(owner = "client!uk", name = "hb", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_146 = new Class349(58, 8);

	@OriginalMember(owner = "client!uk", name = "ob", descriptor = "I")
	public static int anInt8912 = 0;

	@OriginalMember(owner = "client!uk", name = "qb", descriptor = "[I")
	public static final int[] anIntArray581 = new int[5];

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZILjava/lang/String;)Z")
	public static boolean method7095(@OriginalArg(3) String arg0) {
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
			@Pc(82) int local82;
			if (local41 >= '0' && local41 <= '9') {
				local82 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local82 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local82 = local41 - 'W';
			} else {
				return false;
			}
			if (local82 >= 10) {
				return false;
			}
			if (local26) {
				local82 = -local82;
			}
			@Pc(105) int local105 = local30 * 10 + local82;
			if (local30 != local105 / 10) {
				return false;
			}
			local30 = local105;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V")
	public static void method7097(@OriginalArg(1) int arg0) {
		Static254.anInt7147 = arg0;
		@Pc(7) Class21 local7 = Static547.aClass21_88;
		synchronized (Static547.aClass21_88) {
			Static547.aClass21_88.method313();
		}
		local7 = Static31.aClass21_9;
		synchronized (Static31.aClass21_9) {
			Static31.aClass21_9.method313();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BII)Z")
	public static boolean method7100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static421.method5634(arg0, arg1)) {
			return Static486.method6250(arg1, arg0) | (arg1 & 0xB000) != 0 | Static331.method4765(arg1, arg0) ? true : (Static525.method6782(arg0, arg1) | Static245.method3480(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
