import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_92 = new Class62("K", "T", "K", "K");

	@OriginalMember(owner = "client!h", name = "y", descriptor = "I")
	public static int anInt2718 = 503;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_34 = new Class183(80, 4);

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_93 = new Class62(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
	public static int method2191() {
		if (Static268.aClass3_13 == null) {
			if (!Static214.aBoolean313 && Static233.anInt4642 > 0) {
				if (Static228.aBoolean332 && Static68.aClass98_1.method4517(81) && Static233.anInt4642 > 2) {
					return ((Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243.aClass2_243).anInt7125;
				}
				return ((Class2_Sub43) Static262.aClass238_29.aClass2_225.aClass2_243).anInt7125;
			}
			@Pc(43) int local43 = Static136.aClass91_2.method5223();
			@Pc(49) int local49 = Static136.aClass91_2.method5224();
			@Pc(51) int local51 = Static30.anInt453;
			@Pc(53) int local53 = Static92.anInt1974;
			@Pc(55) int local55 = Static392.anInt7142;
			if (local43 > local51 && local43 < local55 + local51) {
				@Pc(73) int local73 = -1;
				@Pc(91) int local91;
				for (@Pc(75) int local75 = 0; local75 < Static233.anInt4642; local75++) {
					if (Static127.aBoolean191) {
						local91 = local53 + (Static233.anInt4642 - local75 - 1) * 16 + 33;
						if (local49 > local91 - 13 && local49 <= local91 + 3) {
							local73 = local75;
						}
					} else {
						local91 = (Static233.anInt4642 - local75 - 1) * 16 + local53 + 31;
						if (local91 - 13 < local49 && local49 <= local91 + 3) {
							local73 = local75;
						}
					}
				}
				if (local73 != -1) {
					local91 = 0;
					@Pc(157) Class42 local157 = new Class42(Static262.aClass238_29);
					for (@Pc(162) Class2_Sub43 local162 = (Class2_Sub43) local157.method841(); local162 != null; local162 = (Class2_Sub43) local157.method840()) {
						if (local91++ == local73) {
							return local162.anInt7125;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(B)I")
	public static int method2192() {
		try {
			if (Static331.anInt6109 == 0) {
				if (Static101.method1805() - 5000L < Static176.aLong109) {
					return 0;
				}
				Static118.aClass86_9 = Static154.aClass123_2.method3269(Static292.anInt5460, Static79.aString18);
				Static223.aLong132 = Static101.method1805();
				Static331.anInt6109 = 1;
			}
			if (Static101.method1805() > Static223.aLong132 + 30000L) {
				return Static275.method5399(1000);
			}
			@Pc(78) int local78;
			@Pc(116) int local116;
			if (Static331.anInt6109 == 1) {
				if (Static118.aClass86_9.anInt2590 == 2) {
					return Static275.method5399(1001);
				}
				if (Static118.aClass86_9.anInt2590 != 1) {
					return -1;
				}
				Static386.aClass226_4 = new Class226((Socket) Static118.aClass86_9.anObject2, Static154.aClass123_2);
				Static118.aClass86_9 = null;
				local78 = 0;
				if (Static108.aBoolean179) {
					local78 = Static375.anInt6899;
				}
				Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
				Static76.aClass2_Sub24_Sub2_7.method5746(Static290.aClass15_9.anInt268);
				Static76.aClass2_Sub24_Sub2_7.method5734(local78);
				Static386.aClass226_4.method5549(Static76.aClass2_Sub24_Sub2_7.anInt6669, Static76.aClass2_Sub24_Sub2_7.aByteArray100);
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				local116 = Static386.aClass226_4.method5547();
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				if (local116 != 0) {
					return Static275.method5399(local116);
				}
				Static331.anInt6109 = 2;
			}
			if (Static331.anInt6109 == 2) {
				if (Static386.aClass226_4.method5550() < 2) {
					return -1;
				}
				Static11.anInt208 = Static386.aClass226_4.method5547();
				Static11.anInt208 <<= 0x8;
				Static11.anInt208 += Static386.aClass226_4.method5547();
				Static57.anInt1229 = 0;
				Static331.anInt6109 = 3;
				Static354.aByteArray97 = new byte[Static11.anInt208];
			}
			if (Static331.anInt6109 != 3) {
				return -1;
			}
			local78 = Static386.aClass226_4.method5550();
			if (local78 < 1) {
				return -1;
			}
			if (local78 > Static11.anInt208 - Static57.anInt1229) {
				local78 = Static11.anInt208 - Static57.anInt1229;
			}
			Static386.aClass226_4.method5546(Static354.aByteArray97, Static57.anInt1229, local78);
			Static57.anInt1229 += local78;
			if (Static57.anInt1229 < Static11.anInt208) {
				return -1;
			} else if (Static235.method4215(Static354.aByteArray97)) {
				Static222.aClass35_Sub1Array1 = new Class35_Sub1[Static189.anInt637];
				local116 = 0;
				for (@Pc(225) int local225 = Static392.anInt7143; local225 <= Static23.anInt351; local225++) {
					@Pc(231) Class35_Sub1 local231 = Static131.method2289(local225);
					if (local231 != null) {
						Static222.aClass35_Sub1Array1[local116++] = local231;
					}
				}
				Static301.anInt5601 = 0;
				Static73.aClass2_Sub22_1 = null;
				Static386.aClass226_4.method5543();
				Static386.aClass226_4 = null;
				Static331.anInt6109 = 0;
				Static89.anInt1894 = 0;
				Static354.aByteArray97 = null;
				Static176.aLong109 = Static101.method1805();
				return 0;
			} else {
				return Static275.method5399(1002);
			}
		} catch (@Pc(276) IOException local276) {
			return Static275.method5399(1003);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
	public static boolean method2194(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local33; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local26 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local47 >= '0' && local47 <= '9') {
				local84 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local84 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local84 = local47 - 'W';
			} else {
				return false;
			}
			if (local84 >= 10) {
				return false;
			}
			if (local26) {
				local84 = -local84;
			}
			@Pc(116) int local116 = local30 * 10 + local84;
			if (local116 / 10 != local30) {
				return false;
			}
			local30 = local116;
			local28 = true;
		}
		return local28;
	}
}
