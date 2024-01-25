import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "Lclient!pl;")
	public static Class259 aClass259_158;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public static int anInt8482;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "Lclient!qn;")
	public static Class273 aClass273_6;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
	public static int anInt8481 = 0;

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "Z")
	public static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
	public static int anInt8495 = 0;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILclient!ev;Z)Z")
	public static boolean method7054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub1_Sub3 arg3) {
		if (!Static225.aBoolean343) {
			return false;
		} else if (Static228.anInt4256 < 100) {
			return false;
		} else if (Static563.method7642(arg0, arg2, arg1)) {
			@Pc(26) int local26 = arg2 << Static134.anInt2822;
			@Pc(30) int local30 = arg1 << Static134.anInt2822;
			@Pc(40) int local40 = Static421.aClass67Array7[arg0].method6707(arg1, arg2) - 1;
			@Pc(46) int local46 = arg3.method7328() + local40;
			if (arg3.aShort98 == 1) {
				if (!Static56.method937(local46, local46, local30 + Static33.anInt857, local30, local30, local26, local40, local26, local26)) {
					return false;
				} else if (Static56.method937(local40, local46, local30 + Static33.anInt857, local30, Static33.anInt857 + local30, local26, local40, local26, local26)) {
					Static347.anInt6253++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort98 == 2) {
				if (!Static56.method937(local46, local46, local30 + Static33.anInt857, local30 + Static33.anInt857, local30 + Static33.anInt857, Static33.anInt857 + local26, local40, local26, local26)) {
					return false;
				} else if (Static56.method937(local46, local40, Static33.anInt857 + local30, Static33.anInt857 + local30, local30 + Static33.anInt857, Static33.anInt857 + local26, local40, Static33.anInt857 + local26, local26)) {
					Static347.anInt6253++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort98 == 4) {
				if (!Static56.method937(local46, local46, local30 + Static33.anInt857, local30, local30, Static33.anInt857 + local26, local40, local26 + Static33.anInt857, Static33.anInt857 + local26)) {
					return false;
				} else if (Static56.method937(local40, local46, Static33.anInt857 + local30, local30, local30 + Static33.anInt857, Static33.anInt857 + local26, local40, Static33.anInt857 + local26, Static33.anInt857 + local26)) {
					Static347.anInt6253++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort98 == 8) {
				if (!Static56.method937(local46, local46, local30, local30, local30, Static33.anInt857 + local26, local40, local26, local26)) {
					return false;
				} else if (Static56.method937(local46, local40, local30, local30, local30, local26 + Static33.anInt857, local40, local26 + Static33.anInt857, local26)) {
					Static347.anInt6253++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort98 == 16) {
				if (Static84.method1347(Static81.anInt1767, local46, local30 + Static81.anInt1767, local40, local26, Static81.anInt1767)) {
					Static347.anInt6253++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort98 == 32) {
				if (Static84.method1347(Static81.anInt1767, local46, local30 + Static81.anInt1767, local40, local26 + Static81.anInt1767, Static81.anInt1767)) {
					Static347.anInt6253++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort98 == 64) {
				if (Static84.method1347(Static81.anInt1767, local46, local30, local40, Static81.anInt1767 + local26, Static81.anInt1767)) {
					Static347.anInt6253++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort98 != 128) {
				return true;
			} else if (Static84.method1347(Static81.anInt1767, local46, local30, local40, local26, Static81.anInt1767)) {
				Static347.anInt6253++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7058(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local17) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(72) int local72;
				if (local25 >= '0' && local25 <= '9') {
					local72 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local72 = local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local72 = local25 + '\n' - 65;
				}
				local72 *= 16;
				local25 = arg0.charAt(local19 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local72 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local72 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local72 += local25 + '\n' - 65;
				}
				local19 += 2;
				if (local72 != 0 && Static452.method6455((byte) local72)) {
					local9.append(Static128.method2158((byte) local72));
				}
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	public static void method7060() {
		@Pc(1) Class313 local1 = Static30.aClass313_7;
		synchronized (Static30.aClass313_7) {
			Static30.aClass313_7.method6982(5);
		}
		local1 = Static6.aClass313_3;
		synchronized (Static6.aClass313_3) {
			Static6.aClass313_3.method6982(5);
		}
	}
}
