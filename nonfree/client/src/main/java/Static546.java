import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "Lclient!cka;")
	public static Class62 aClass62_7;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7470(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7471(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(19) int local19 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(29) char local29 = arg0.charAt(local21);
			if (local29 == '%' && local21 + 2 < local19) {
				local29 = arg0.charAt(local21 + 1);
				@Pc(88) int local88;
				if (local29 >= '0' && local29 <= '9') {
					local88 = local29 - 48;
				} else if (local29 >= 'a' && local29 <= 'f') {
					local88 = local29 - 87;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local88 = local29 - 55;
				}
				local29 = arg0.charAt(local21 + 2);
				local88 *= 16;
				if (local29 >= '0' && local29 <= '9') {
					local88 += local29 - 48;
				} else if (local29 >= 'a' && local29 <= 'f') {
					local88 += local29 - 87;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local88 += local29 + '\n' - 65;
				}
				local21 += 2;
				if (local88 != 0 && Static426.method6182((byte) local88)) {
					local9.append(Static92.method8227((byte) local88));
				}
			} else if (local29 == '+') {
				local9.append(' ');
			} else {
				local9.append(local29);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)Z")
	public static boolean method7472() {
		return Static205.anInt3674 != 0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(III[B)[B")
	public static byte[] method7474(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static693.method8320(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!wq;B)Lclient!m;")
	public static Class125_Sub1 method7475(@OriginalArg(0) Class5_Sub36 arg0) {
		return new Class125_Sub1(arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7303(), arg0.method7331(), arg0.method7291());
	}
}
