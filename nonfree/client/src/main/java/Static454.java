import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Lclient!nf;")
	public static Class102 aClass102_33;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "Lclient!d;")
	public static Interface5 anInterface5_11;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
	public static int anInt7771;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public static int anInt7760 = 0;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	public static int anInt7767 = 0;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "[I")
	public static final int[] anIntArray473 = new int[5];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static643.method8446(arg1, arg0) | (arg0 & 0x70000) != 0 || Static519.method7350(arg0, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6516(@OriginalArg(1) String arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer();
		@Pc(19) int local19 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local19 > local21 + 2) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(59) int local59;
				if (local27 >= '0' && local27 <= '9') {
					local59 = local27 - '0';
				} else if (local27 >= 'a' && local27 <= 'f') {
					local59 = local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local16.append('%');
						continue;
					}
					local59 = local27 + 10 - 65;
				}
				local27 = arg0.charAt(local21 + 2);
				local59 *= 16;
				if (local27 >= '0' && local27 <= '9') {
					local59 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local59 += local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local16.append('%');
						continue;
					}
					local59 += local27 + 10 - 65;
				}
				if (local59 != 0 && Static404.method5779((byte) local59)) {
					local16.append(Static669.method8682((byte) local59));
				}
				local21 += 2;
			} else if (local27 == '+') {
				local16.append(' ');
			} else {
				local16.append(local27);
			}
		}
		return local16.toString();
	}
}
