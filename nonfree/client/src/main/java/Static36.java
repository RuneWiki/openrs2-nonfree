import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public static int anInt1126;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_15 = new Class92(28, 3);

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	public static int anInt1129 = -1;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)Z")
	public static boolean method906(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static136.method2409(arg0, arg1) | (arg0 & 0x70000) != 0 || Static193.method3053(arg0, arg1);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
	public static int method907() {
		return 6;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method908(@OriginalArg(1) String arg0) {
		if (Static406.aStringArray46 == null) {
			Static379.method5650();
		}
		@Pc(16) String[] local16 = Static142.method2449(arg0, '\n');
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			for (@Pc(22) int local22 = Static20.anInt657; local22 > 0; local22--) {
				Static406.aStringArray46[local22] = Static406.aStringArray46[local22 - 1];
			}
			Static406.aStringArray46[0] = local16[local18];
			if (Static406.aStringArray46.length - 1 > Static20.anInt657) {
				if (Static161.anInt3241 > 0) {
					Static161.anInt3241++;
				}
				Static20.anInt657++;
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!he;ILclient!eq;)V")
	public static void method910(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class66 arg1) {
		if (Static46.aBoolean96) {
			return;
		}
		arg1.method5045(0);
		Static144.aClass87_8 = arg1.method5038(Static458.method4486(arg0, Static436.anInt7724));
		Static144.aClass87_8.method6567((Static348.anInt6272 - Static144.aClass87_8.method6565()) / 2, (Static199.anInt3767 - Static144.aClass87_8.method6561()) / 2);
		Static297.aClass87_20 = arg1.method5038(Static458.method4486(arg0, Static311.anInt5427));
		Static297.aClass87_20.method6567((Static348.anInt6272 - Static297.aClass87_20.method6565()) / 2, 18);
		Static46.aBoolean96 = true;
	}
}
