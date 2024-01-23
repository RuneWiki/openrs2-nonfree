import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ci", name = "O", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString32 = "K";

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
	public static int anInt742 = 0;

	@OriginalMember(owner = "client!ci", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString33 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!fh;)Lclient!kf;")
	public static Class94_Sub2 method672(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class94_Sub2(arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1878(), arg0.method1878(), arg0.method1853());
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILjava/lang/StringBuffer;C)Ljava/lang/StringBuffer;")
	public static StringBuffer method673(@OriginalArg(2) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(18) int local18 = local8; local18 < 0; local18++) {
			arg0.setCharAt(local18, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIZ)V")
	public static void method674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(3) int local3;
		@Pc(16) Class11_Sub4_Sub2 local16;
		@Pc(91) int local91;
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(213) int local213;
		@Pc(222) int local222;
		@Pc(112) int local112;
		for (local3 = 0; local3 < Static1.anInt48; local3++) {
			local16 = Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local3]];
			if (local16 != null && local16.method3354() && local16.aClass183_1.method4517()) {
				@Pc(31) int local31 = local16.method3347();
				if (arg1) {
					if (!local16.aClass183_1.aBoolean515) {
						continue;
					}
				} else if (arg2 != local16.aClass183_1.aBoolean512 || arg0 != 0 && arg0 != local31) {
					continue;
				}
				@Pc(86) int local86;
				if (local31 == 1) {
					if ((local16.anInt3865 & 0x7F) == 64 && (local16.anInt3856 & 0x7F) == 64) {
						local86 = local16.anInt3865 >> 7;
						local91 = local16.anInt3856 >> 7;
						if (local86 >= 0 && local86 < 104 && local91 >= 0 && local91 < 104) {
							local112 = Static287.anIntArrayArray39[local86][local91]++;
						}
					}
				} else if (((local31 & 0x1) != 0 || (local16.anInt3865 & 0x7F) == 0 && (local16.anInt3856 & 0x7F) == 0) && ((local31 & 0x1) != 1 || (local16.anInt3865 & 0x7F) == 64 && (local16.anInt3856 & 0x7F) == 64)) {
					local86 = local16.anInt3865 - local31 * 64 >> 7;
					local91 = local16.anInt3856 - local31 * 64 >> 7;
					local183 = local16.method3347() + local86;
					if (local183 > 104) {
						local183 = 104;
					}
					local195 = local91 + local16.method3347();
					if (local86 < 0) {
						local86 = 0;
					}
					if (local91 < 0) {
						local91 = 0;
					}
					if (local195 > 104) {
						local195 = 104;
					}
					for (local213 = local86; local213 < local183; local213++) {
						for (local222 = local91; local222 < local195; local222++) {
							local112 = Static287.anIntArrayArray39[local213][local222]++;
						}
					}
				}
			}
		}
		label211: for (local3 = 0; local3 < Static1.anInt48; local3++) {
			@Pc(271) long local271 = (long) Static288.anIntArray572[local3] << 32 | 0x20000000L;
			local16 = Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local3]];
			if (local16 != null && local16.method3354() && local16.aClass183_1.method4517()) {
				local91 = local16.method3347();
				if (arg1) {
					if (!local16.aClass183_1.aBoolean515) {
						continue;
					}
				} else if (local16.aClass183_1.aBoolean512 != arg2 || arg0 != 0 && arg0 != local91) {
					continue;
				}
				local16.aBoolean332 = true;
				if (local91 == 1) {
					if ((local16.anInt3865 & 0x7F) == 64 && (local16.anInt3856 & 0x7F) == 64) {
						local183 = local16.anInt3865 >> 7;
						local195 = local16.anInt3856 >> 7;
						if (local183 < 0 || local183 >= 104 || local195 < 0 || local195 >= 104) {
							continue;
						}
						if (Static287.anIntArrayArray39[local183][local195] > 1) {
							local112 = Static287.anIntArrayArray39[local183][local195]--;
							continue;
						}
					}
				} else if ((local91 & 0x1) == 0 && (local16.anInt3865 & 0x7F) == 0 && (local16.anInt3856 & 0x7F) == 0 || (local91 & 0x1) == 1 && (local16.anInt3865 & 0x7F) == 64 && (local16.anInt3856 & 0x7F) == 64) {
					local183 = local16.anInt3865 - local91 * 64 >> 7;
					local213 = local183 + local91;
					if (local183 < 0) {
						local183 = 0;
					}
					local195 = local16.anInt3856 - local91 * 64 >> 7;
					if (local213 > 104) {
						local213 = 104;
					}
					local222 = local195 + local91;
					@Pc(419) boolean local419 = true;
					if (local195 < 0) {
						local195 = 0;
					}
					if (local222 > 104) {
						local222 = 104;
					}
					@Pc(434) int local434;
					@Pc(439) int local439;
					for (local434 = local183; local434 < local213; local434++) {
						for (local439 = local195; local439 < local222; local439++) {
							if (Static287.anIntArrayArray39[local434][local439] <= 1) {
								local419 = false;
								break;
							}
						}
					}
					if (local419) {
						local434 = local183;
						while (true) {
							if (local434 >= local213) {
								continue label211;
							}
							for (local439 = local195; local439 < local222; local439++) {
								local112 = Static287.anIntArrayArray39[local434][local439]--;
							}
							local434++;
						}
					}
				}
				local16.aBoolean332 = false;
				if (!local16.aClass183_1.aBoolean511) {
					local271 |= Long.MIN_VALUE;
				}
				local16.anInt3839 = Static42.method768(local16.anInt3865, Static132.anInt2608, local16.anInt3856);
				Static168.method2837(Static132.anInt2608, local16.anInt3865, local16.anInt3856, local16.anInt3839, (local91 - 1) * 64 + 60, local16, local16.anInt3852, local271, local16.aBoolean338);
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!si;Z)V")
	public static void method676(@OriginalArg(1) Class157 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt4727 == 0 ? arg0.anInt4680 : arg0.anInt4727;
		@Pc(30) int local30 = arg0.anInt4683 == 0 ? arg0.anInt4689 : arg0.anInt4683;
		Static102.method1974(arg1, arg0.anInt4672, Static176.aClass157ArrayArray1[arg0.anInt4672 >> 16], local30, local12);
		if (arg0.aClass157Array2 != null) {
			Static102.method1974(arg1, arg0.anInt4672, arg0.aClass157Array2, local30, local12);
		}
		@Pc(64) Class1_Sub20 local64 = (Class1_Sub20) Static224.aClass86_27.method2136((long) arg0.anInt4672);
		if (local64 != null) {
			Static175.method2997(local12, local64.anInt3422, local30, arg1);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!nm;)V")
	public static void method678(@OriginalArg(1) Class119 arg0) {
		Static130.aClass119_50 = arg0;
		Static90.anInt1906 = Static130.aClass119_50.method3217(16);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
	public static void method680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static253.anInt4650 == 0 || arg1 == 0 || Static173.anInt3382 >= 50 || arg0 == -1) {
			return;
		}
		Static274.anIntArray560[Static173.anInt3382] = arg0;
		Static231.anIntArray486[Static173.anInt3382] = arg1;
		Static167.anIntArray68[Static173.anInt3382] = arg3;
		Static21.aClass101Array1[Static173.anInt3382] = null;
		Static306.anIntArray603[Static173.anInt3382] = 0;
		Static184.anIntArray378[Static173.anInt3382] = arg2;
		Static173.anInt3382++;
	}
}
