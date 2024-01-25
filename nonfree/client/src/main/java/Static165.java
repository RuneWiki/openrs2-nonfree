import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
	public static int anInt5077;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
	public static int anInt5083;

	@OriginalMember(owner = "client!ki", name = "T", descriptor = "Lclient!mo;")
	public static Class143 aClass143_95;

	@OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
	public static int anInt5091;

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
	public static int anInt5076 = 0;

	@OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
	public static int anInt5082 = 0;

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString191 = "Drop";

	@OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
	public static int anInt5089 = 0;

	@OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
	public static int anInt5094 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BJ)V")
	public static void method4552(@OriginalArg(1) long arg0) {
		@Pc(18) int local18 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 + Static253.anInt1051;
		@Pc(23) int local23 = Static240.anInt6477 + Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908;
		if (Static17.anInt349 - local18 < -500 || Static17.anInt349 - local18 > 500 || Static340.anInt6526 - local23 < -500 || Static340.anInt6526 - local23 > 500) {
			Static340.anInt6526 = local23;
			Static17.anInt349 = local18;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (Static17.anInt349 != local18) {
			local59 = local18 - Static17.anInt349;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local59 < local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static17.anInt349 += local67;
		}
		if (!Static61.aBoolean94) {
			Static274.aFloat100 += Static232.aFloat44 * (float) arg0 / 6.0F;
			Static94.aFloat42 += Static214.aFloat83 * (float) arg0 / 6.0F;
		}
		if (local23 != Static340.anInt6526) {
			local59 = local23 - Static340.anInt6526;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 <= 0) {
				if (local67 == 0) {
					local67 = -1;
				} else if (local67 < local59) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = 1;
			} else if (local67 > local59) {
				local67 = local59;
			}
			Static340.anInt6526 += local67;
		}
		Static235.method4146();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([BIILjava/lang/String;II)I")
	public static int method4553(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		@Pc(18) int local18 = arg1;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(28) char local28 = arg2.charAt(local20);
			if (local28 > '\u0000' && local28 < '\u0080' || !(local28 < ' ' || local28 > 'ÿ')) {
				arg0[arg3 + local20] = (byte) local28;
			} else if (local28 == '€') {
				arg0[local20 + arg3] = -128;
			} else if (local28 == '‚') {
				arg0[local20 + arg3] = -126;
			} else if (local28 == 'ƒ') {
				arg0[arg3 + local20] = -125;
			} else if (local28 == '„') {
				arg0[arg3 + local20] = -124;
			} else if (local28 == '…') {
				arg0[arg3 + local20] = -123;
			} else if (local28 == '†') {
				arg0[local20 + arg3] = -122;
			} else if (local28 == '‡') {
				arg0[arg3 + local20] = -121;
			} else if (local28 == 'ˆ') {
				arg0[arg3 + local20] = -120;
			} else if (local28 == '‰') {
				arg0[arg3 + local20] = -119;
			} else if (local28 == 'Š') {
				arg0[local20 + arg3] = -118;
			} else if (local28 == '‹') {
				arg0[arg3 + local20] = -117;
			} else if (local28 == 'Œ') {
				arg0[arg3 + local20] = -116;
			} else if (local28 == 'Ž') {
				arg0[arg3 + local20] = -114;
			} else if (local28 == '‘') {
				arg0[local20 + arg3] = -111;
			} else if (local28 == '’') {
				arg0[arg3 + local20] = -110;
			} else if (local28 == '“') {
				arg0[local20 + arg3] = -109;
			} else if (local28 == '”') {
				arg0[local20 + arg3] = -108;
			} else if (local28 == '•') {
				arg0[arg3 + local20] = -107;
			} else if (local28 == '–') {
				arg0[arg3 + local20] = -106;
			} else if (local28 == '—') {
				arg0[local20 + arg3] = -105;
			} else if (local28 == '˜') {
				arg0[local20 + arg3] = -104;
			} else if (local28 == '™') {
				arg0[arg3 + local20] = -103;
			} else if (local28 == 'š') {
				arg0[local20 + arg3] = -102;
			} else if (local28 == '›') {
				arg0[local20 + arg3] = -101;
			} else if (local28 == 'œ') {
				arg0[local20 + arg3] = -100;
			} else if (local28 == 'ž') {
				arg0[arg3 + local20] = -98;
			} else if (local28 == 'Ÿ') {
				arg0[arg3 + local20] = -97;
			} else {
				arg0[local20 + arg3] = 63;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/Object;ILclient!ap;)V")
	public static void method4554(@OriginalArg(0) Object arg0, @OriginalArg(2) Class15 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static15.method5425(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
