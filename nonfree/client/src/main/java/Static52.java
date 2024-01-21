import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!la", name = "Lb", descriptor = "Lclient!ub;")
	public static Class61 aClass61_3;

	@OriginalMember(owner = "client!la", name = "pb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_629 = Static34.method846(" ");

	@OriginalMember(owner = "client!la", name = "Bb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_634 = Static34.method846(" more options");

	@OriginalMember(owner = "client!la", name = "qb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_630 = aClass55_634;

	@OriginalMember(owner = "client!la", name = "rb", descriptor = "Z")
	public static volatile boolean aBoolean74 = true;

	@OriginalMember(owner = "client!la", name = "sb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_631 = Static34.method846(": ");

	@OriginalMember(owner = "client!la", name = "Tb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_642 = Static34.method846("To play on this world move to a free area first");

	@OriginalMember(owner = "client!la", name = "ub", descriptor = "Lclient!rc;")
	public static Class55 aClass55_632 = aClass55_642;

	@OriginalMember(owner = "client!la", name = "Ob", descriptor = "Lclient!rc;")
	private static Class55 aClass55_639 = Static34.method846("Loading textures )2 ");

	@OriginalMember(owner = "client!la", name = "xb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_633 = aClass55_639;

	@OriginalMember(owner = "client!la", name = "Db", descriptor = "I")
	public static int anInt1647 = 0;

	@OriginalMember(owner = "client!la", name = "Eb", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!la", name = "Fb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_635 = Static34.method846("Empf-=nger:");

	@OriginalMember(owner = "client!la", name = "Gb", descriptor = "[I")
	public static int[] anIntArray160 = new int[500];

	@OriginalMember(owner = "client!la", name = "Mb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_638 = Static34.method846("Password: ");

	@OriginalMember(owner = "client!la", name = "Ib", descriptor = "Lclient!rc;")
	public static Class55 aClass55_636 = aClass55_638;

	@OriginalMember(owner = "client!la", name = "Kb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_637 = aClass55_629;

	@OriginalMember(owner = "client!la", name = "Pb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_640 = Static34.method846("Versteckt");

	@OriginalMember(owner = "client!la", name = "Rb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_641 = Static34.method846("Konfig geladen)3");

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(III)Z")
	public static boolean method1118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static103.anInt3042 == arg1) {
			return true;
		} else if (arg0 == 1 && arg1 == Static33.anInt1267) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static59.anInt1819 == arg1;
		}
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
	public static void method1119() {
		aClass55_637 = null;
		aClass55_634 = null;
		aClass55_632 = null;
		aClass61_3 = null;
		anIntArray160 = null;
		aClass55_636 = null;
		aClass55_633 = null;
		aClass55_642 = null;
		aClass55_638 = null;
		aClass55_641 = null;
		aClass55_631 = null;
		aClass55_640 = null;
		aClass55_639 = null;
		aClass55_629 = null;
		aClass55_630 = null;
		aClass55_635 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([BIIB)Z")
	public static boolean method1120(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class6_Sub1 local14 = new Class6_Sub1(arg0);
		@Pc(16) boolean local16 = true;
		@Pc(18) int local18 = -1;
		label52: while (true) {
			@Pc(22) int local22 = local14.method1465();
			if (local22 == 0) {
				return local16;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(43) int local43;
				while (!local35) {
					local43 = local14.method1465();
					if (local43 == 0) {
						continue label52;
					}
					local33 += local43 - 1;
					@Pc(77) int local77 = local33 & 0x3F;
					@Pc(83) int local83 = local33 >> 6 & 0x3F;
					@Pc(89) int local89 = local14.method1495() >> 2;
					@Pc(93) int local93 = arg2 + local83;
					@Pc(98) int local98 = local77 + arg1;
					if (local93 > 0 && local98 > 0 && local93 < 103 && local98 < 103) {
						@Pc(117) Class6_Sub2_Sub15 local117 = Static8.method333(local18);
						if (local89 != 22 || !Static90.aBoolean119 || local117.anInt3004 != 0 || local117.aBoolean153) {
							local35 = true;
							if (!local117.method1940()) {
								Static71.anInt2109++;
								local16 = false;
							}
						}
					}
				}
				local43 = local14.method1465();
				if (local43 == 0) {
					break;
				}
				local14.method1495();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!sb;[BIIIILclient!kb;IIII)V")
	public static void method1121(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class6_Sub1 local17 = new Class6_Sub1(arg1);
		while (true) {
			@Pc(21) int local21 = local17.method1465();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local17.method1465();
				if (local36 == 0) {
					break;
				}
				@Pc(45) int local45 = local17.method1495();
				local32 += local36 - 1;
				@Pc(55) int local55 = local45 >> 2;
				@Pc(61) int local61 = local32 >> 6 & 0x3F;
				@Pc(65) int local65 = local32 & 0x3F;
				@Pc(69) int local69 = local32 >> 12;
				@Pc(73) int local73 = local45 & 0x3;
				if (local69 == arg6 && local61 >= arg8 && local61 < arg8 + 8 && arg4 <= local65 && arg4 + 8 > local65) {
					@Pc(104) Class6_Sub2_Sub15 local104 = Static8.method333(local12);
					@Pc(121) int local121 = arg9 + Static32.method803(local65 & 0x7, local73, local104.anInt2984, local61 & 0x7, local104.anInt2981, arg7);
					@Pc(139) int local139 = arg2 + Static96.method1865(local65 & 0x7, local104.anInt2981, local104.anInt2984, local61 & 0x7, local73, arg7);
					if (local121 > 0 && local139 > 0 && local121 < 103 && local139 < 103) {
						@Pc(153) int local153 = arg3;
						@Pc(155) Class57 local155 = null;
						if ((Static43.aByteArrayArrayArray8[1][local121][local139] & 0x2) == 2) {
							local153 = arg3 - 1;
						}
						if (local153 >= 0) {
							local155 = arg0[local153];
						}
						Static4.method1618(local55, arg5, local121, local12, arg7 + local73 & 0x3, local155, local139, arg3);
					}
				}
			}
		}
	}
}
