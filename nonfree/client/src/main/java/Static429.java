import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
	public static int anInt7355;

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_52 = new Class91();

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "[I")
	public static final int[] anIntArray597 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!uw", name = "E", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_60 = new Class83(8);

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BZILjava/lang/String;)Z")
	public static boolean method5905(@OriginalArg(3) String arg0) {
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
			@Pc(71) int local71;
			if (local41 >= '0' && local41 <= '9') {
				local71 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local71 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local71 = local41 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local26) {
				local71 = -local71;
			}
			@Pc(115) int local115 = local30 * 10 + local71;
			if (local115 / 10 != local30) {
				return false;
			}
			local28 = true;
			local30 = local115;
		}
		return local28;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!tf;II)V")
	public static void method5910(@OriginalArg(0) int arg0, @OriginalArg(1) Class240 arg1, @OriginalArg(3) int arg2) {
		Static125.anInt2599 = arg0;
		Static6.anInt67 = arg2;
		Static179.aClass240_9 = arg1;
	}
}
