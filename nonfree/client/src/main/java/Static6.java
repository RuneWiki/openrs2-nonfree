import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	public static int anInt193;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "I")
	public static int anInt195;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "I")
	public static int anInt196;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!ae;")
	public static final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_1 = new Class5_Sub1_Sub1(5000);

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	public static int anInt194 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method183() {
		if (Static88.anInt1583 == 0) {
			return;
		}
		try {
			if (++Static64.anInt1550 > 2000) {
				if (Static95.aClass68_23 != null) {
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
				}
				if (Static111.anInt2410 >= 1) {
					Static45.anInt1178 = -5;
					Static88.anInt1583 = 0;
					return;
				}
				Static64.anInt1550 = 0;
				if (anInt195 == Static312.anInt5956) {
					Static312.anInt5956 = Static62.anInt1434;
				} else {
					Static312.anInt5956 = anInt195;
				}
				Static111.anInt2410++;
				Static88.anInt1583 = 1;
			}
			if (Static88.anInt1583 == 1) {
				Static164.aClass60_6 = Static202.aClass10_3.method310(Static312.anInt5956, Static13.aString28);
				Static88.anInt1583 = 2;
			}
			@Pc(122) int local122;
			if (Static88.anInt1583 == 2) {
				if (Static164.aClass60_6.anInt1838 == 2) {
					throw new IOException();
				}
				if (Static164.aClass60_6.anInt1838 != 1) {
					return;
				}
				Static95.aClass68_23 = new Class68((Socket) Static164.aClass60_6.anObject2, Static202.aClass10_3);
				Static164.aClass60_6 = null;
				Static95.aClass68_23.method2002(Static335.aClass5_Sub1_Sub1_3.anInt2029, Static335.aClass5_Sub1_Sub1_3.aByteArray18);
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				local122 = Static95.aClass68_23.method2000();
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				if (local122 != 21) {
					Static45.anInt1178 = local122;
					Static88.anInt1583 = 0;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
					return;
				}
				Static88.anInt1583 = 3;
			}
			if (Static88.anInt1583 == 3) {
				if (Static95.aClass68_23.method1999() < 1) {
					return;
				}
				Static257.aStringArray39 = new String[Static95.aClass68_23.method2000()];
				Static88.anInt1583 = 4;
			}
			if (Static88.anInt1583 == 4 && Static95.aClass68_23.method1999() >= Static257.aStringArray39.length * 8) {
				aClass5_Sub1_Sub1_1.anInt2029 = 0;
				Static95.aClass68_23.method1993(aClass5_Sub1_Sub1_1.aByteArray18, Static257.aStringArray39.length * 8, 0);
				for (local122 = 0; local122 < Static257.aStringArray39.length; local122++) {
					Static257.aStringArray39[local122] = Static350.method5775(aClass5_Sub1_Sub1_1.method1884());
				}
				Static45.anInt1178 = 21;
				Static88.anInt1583 = 0;
				Static95.aClass68_23.method1994();
				Static95.aClass68_23 = null;
			}
		} catch (@Pc(222) IOException local222) {
			if (Static95.aClass68_23 != null) {
				Static95.aClass68_23.method1994();
				Static95.aClass68_23 = null;
			}
			if (Static111.anInt2410 < 1) {
				Static64.anInt1550 = 0;
				Static111.anInt2410++;
				if (Static312.anInt5956 == anInt195) {
					Static312.anInt5956 = Static62.anInt1434;
				} else {
					Static312.anInt5956 = anInt195;
				}
				Static88.anInt1583 = 1;
			} else {
				Static45.anInt1178 = -4;
				Static88.anInt1583 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([SB)[S")
	public static short[] method184(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static359.method753(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V")
	public static void method186(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static78.method1746(arg3, arg2, arg0, 0, arg1, arg4);
	}
}
