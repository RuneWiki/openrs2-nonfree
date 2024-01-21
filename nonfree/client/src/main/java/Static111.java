import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!gd;")
	public static Class27 aClass27_39;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	public static int anInt2565;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "Lclient!gd;")
	public static Class27 aClass27_40;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	public static int anInt2556 = -1;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_1291 = Static109.method1737("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	public static int anInt2561 = 0;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!na;")
	public static Class53 aClass53_1292 = Static109.method1737(" )2> @lre@");

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Lclient!na;")
	private static Class53 aClass53_1294 = Static109.method1737(" from your friend list first");

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!na;")
	public static Class53 aClass53_1293 = aClass53_1294;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public static int anInt2569 = 0;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "Lclient!na;")
	public static Class53 aClass53_1295 = Static109.method1737("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1296 = Static109.method1737("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "Lclient!te;")
	public static Class75 aClass75_72 = new Class75(64);

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
	public static int anInt2574 = -1;

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
	public static int anInt2582 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Lclient!ma;")
	public static Class3_Sub1_Sub9 method1783(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub9 local6 = (Class3_Sub1_Sub9) Static53.aClass75_59.method1728((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static93.aClass62_18.method1512(4, arg0);
		local6 = new Class3_Sub1_Sub9();
		if (local20 != null) {
			local6.method1219(arg0, new Class3_Sub7(local20));
		}
		local6.method1222();
		Static53.aClass75_59.method1730(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[IB[II[Lclient!mc;)V")
	public static void method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class49[] arg4) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg3) / 2;
		@Pc(14) int local14 = arg3 - 1;
		@Pc(18) int local18 = arg0 + 1;
		@Pc(22) Class49 local22 = arg4[local10];
		arg4[local10] = arg4[arg3];
		arg4[arg3] = local22;
		while (local14 < local18) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(56) int local56;
			@Pc(51) int local51;
			do {
				local18--;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg1[local39] == 2) {
						local51 = local22.anInt1835;
						local56 = arg4[local18].anInt1835;
					} else if (arg1[local39] == 1) {
						local51 = local22.anInt1834;
						local56 = arg4[local18].anInt1834;
						if (local56 == -1 && arg2[local39] == 1) {
							local56 = 2001;
						}
						if (local51 == -1 && arg2[local39] == 1) {
							local51 = 2001;
						}
					} else if (arg1[local39] == 3) {
						local51 = local22.aBoolean68 ? 1 : 0;
						local56 = arg4[local18].aBoolean68 ? 1 : 0;
					} else {
						local56 = arg4[local18].anInt1831;
						local51 = local22.anInt1831;
					}
					if (local56 != local51) {
						if ((arg2[local39] != 1 || local56 <= local51) && (arg2[local39] != 0 || local56 >= local51)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local14++;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg1[local39] == 2) {
						local56 = arg4[local14].anInt1835;
						local51 = local22.anInt1835;
					} else if (arg1[local39] == 1) {
						local51 = local22.anInt1834;
						local56 = arg4[local14].anInt1834;
						if (local51 == -1 && arg2[local39] == 1) {
							local51 = 2001;
						}
						if (local56 == -1 && arg2[local39] == 1) {
							local56 = 2001;
						}
					} else if (arg1[local39] == 3) {
						local56 = arg4[local14].aBoolean68 ? 1 : 0;
						local51 = local22.aBoolean68 ? 1 : 0;
					} else {
						local56 = arg4[local14].anInt1831;
						local51 = local22.anInt1831;
					}
					if (local51 != local56) {
						if ((arg2[local39] != 1 || local56 >= local51) && (arg2[local39] != 0 || local51 >= local56)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local18 > local14) {
				@Pc(326) Class49 local326 = arg4[local14];
				arg4[local14] = arg4[local18];
				arg4[local18] = local326;
			}
		}
		method1784(local18, arg1, arg2, arg3, arg4);
		method1784(arg0, arg1, arg2, local18 + 1, arg4);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!we;I)V")
	public static void method1786(@OriginalArg(0) Class62 arg0) {
		Static21.aClass62_3 = arg0;
		Static81.anInt2047 = Static21.aClass62_3.method1507(16);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIII)Lclient!na;")
	public static Class53 method1787(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class53 local5 = new Class53();
		local5.anInt1890 = 0;
		local5.aByteArray43 = new byte[arg2];
		for (@Pc(19) int local19 = arg1; local19 < arg1 + arg2; local19++) {
			if (arg0[local19] != 0) {
				local5.aByteArray43[local5.anInt1890++] = arg0[local19];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public static void method1788() {
		aClass53_1292 = null;
		aClass27_39 = null;
		aClass53_1293 = null;
		aClass75_72 = null;
		aClass53_1294 = null;
		aClass53_1295 = null;
		aClass53_1291 = null;
		aClass53_1296 = null;
		aClass27_40 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Z")
	public static boolean method1789(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
