import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Lclient!am;")
	public static Class11 aClass11_95;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "Lclient!jp;")
	public static Class106 aClass106_5;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public static int anInt4817;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Z")
	public static boolean method3948() {
		if (Static27.aBoolean27) {
			try {
				if ((Boolean) Static369.method5674(Static212.aClass120_3.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public static void method3950() {
		Static322.aClass154_100.method4219();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZIBI)Lclient!em;")
	public static Class4_Sub8 method3954(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub8 local7 = new Class4_Sub8();
		local7.anInt1671 = arg2;
		local7.anInt1670 = arg0;
		Static38.aClass198_5.method5267((long) arg3, local7);
		Static322.method5314(arg0);
		@Pc(33) Class72 local33 = Static66.method1243(arg3);
		if (local33 != null) {
			Static238.method4097(local33);
		}
		if (Static251.aClass72_16 != null) {
			Static238.method4097(Static251.aClass72_16);
			Static251.aClass72_16 = null;
		}
		Static36.method672();
		if (local33 != null) {
			Static124.method3067(!arg1, local33);
		}
		if (!arg1) {
			Static97.method1757(arg0);
		}
		if (!arg1 && Static310.anInt6220 != -1) {
			Static39.method733(Static310.anInt6220, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(JI)V")
	public static void method3958(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)[Lclient!tn;")
	public static Class196[] method3959() {
		if (Static193.aClass196Array1 == null) {
			@Pc(7) Class196[] local7 = Static223.method3821(Static212.aClass120_3);
			@Pc(11) Class196[] local11 = new Class196[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(61) int local61;
			@Pc(67) Class196 local67;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class196 local21 = local7[local15];
				if ((local21.anInt6213 <= 0 || local21.anInt6213 >= 24) && local21.anInt6206 >= 800 && local21.anInt6212 >= 600 && (Static161.anInt3644 >= 96 || Static6.anInt1971 != 0 || local21.anInt6206 <= 1024 && local21.anInt6212 <= 768)) {
					for (local61 = 0; local61 < local13; local61++) {
						local67 = local11[local61];
						if (local67.anInt6206 == local21.anInt6206 && local21.anInt6212 == local67.anInt6212) {
							if (local21.anInt6213 > local67.anInt6213) {
								local11[local61] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static193.aClass196Array1 = new Class196[local13];
			Static363.method4759(local11, 0, Static193.aClass196Array1, 0, local13);
			@Pc(131) int[] local131 = new int[Static193.aClass196Array1.length];
			for (local61 = 0; local61 < Static193.aClass196Array1.length; local61++) {
				local67 = Static193.aClass196Array1[local61];
				local131[local61] = local67.anInt6206 * local67.anInt6212;
			}
			Static190.method3456(Static193.aClass196Array1, local131);
		}
		return Static193.aClass196Array1;
	}
}
