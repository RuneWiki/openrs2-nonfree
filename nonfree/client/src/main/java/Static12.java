import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "Lclient!v;")
	public static Class2_Sub16_Sub2 aClass2_Sub16_Sub2_1;

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "I")
	public static int anInt362;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lclient!u;")
	public static Class74 aClass74_328 = Static72.method1077("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "[I")
	public static int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "Lclient!u;")
	public static Class74 aClass74_329 = Static72.method1077("Fallen lassen");

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
	public static int anInt360 = 1;

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "Lclient!u;")
	private static Class74 aClass74_333 = Static72.method1077("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "Lclient!u;")
	public static Class74 aClass74_330 = aClass74_333;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "Lclient!u;")
	private static Class74 aClass74_331 = Static72.method1077("Enter name of friend to add to list");

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "Lclient!u;")
	public static Class74 aClass74_332 = aClass74_331;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Lclient!ma;")
	public static Class2_Sub2_Sub11 method270(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub11 local12 = (Class2_Sub2_Sub11) Static65.aClass16_54.method490((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static89.aClass26_22.method1358(arg0, 12);
		local12 = new Class2_Sub2_Sub11();
		if (local22 != null) {
			local12.method1047(new Class2_Sub10(local22));
		}
		local12.method1053();
		Static65.aClass16_54.method492(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
	public static void method271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			if (Static106.aClass74Array17[local13] != null) {
				@Pc(23) int local23 = Static100.anIntArray314[local13];
				@Pc(35) int local35 = Static46.anInt1055 + 4 + 70 - local3 * 14;
				if (local35 < -20) {
					break;
				}
				if (local23 == 0) {
					local3++;
				}
				@Pc(45) Class74 local45 = Static20.aClass74Array3[local13];
				if (local45 != null && local45.method1719(Static48.aClass74_838)) {
					local45 = local45.method1697(5);
				}
				if (local45 != null && local45.method1719(Static21.aClass74_474)) {
					local45 = local45.method1697(5);
				}
				if ((local23 == 1 || local23 == 2) && (local23 == 1 || Static65.anInt1443 == 0 || Static65.anInt1443 == 1 && Static7.method1864(local45))) {
					if (arg0 > local35 - 14 && arg0 <= local35 && !local45.method1733(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass74_1661)) {
						if (Static5.anInt64 >= 1) {
							Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static105.aClass74_1484, 0, 45);
						}
						Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static125.aClass74_1688, 0, 56);
						Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static67.aClass74_1040, 0, 13);
					}
					local3++;
				}
				if ((local23 == 3 || local23 == 7) && Static54.anInt1314 == 0 && (local23 == 7 || Static41.anInt964 == 0 || Static41.anInt964 == 1 && Static7.method1864(local45))) {
					if (arg0 > local35 - 14 && arg0 <= local35) {
						if (Static5.anInt64 >= 1) {
							Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static105.aClass74_1484, 0, 45);
						}
						Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static125.aClass74_1688, 0, 56);
						Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static67.aClass74_1040, 0, 13);
					}
					local3++;
				}
				if (local23 == 4 && (Static107.anInt2345 == 0 || Static107.anInt2345 == 1 && Static7.method1864(local45))) {
					local3++;
					if (arg0 > local35 - 14 && local35 >= arg0) {
						Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static128.aClass74_1744, 0, 2);
					}
				}
				if ((local23 == 5 || local23 == 6) && Static54.anInt1314 == 0 && Static41.anInt964 < 2) {
					local3++;
				}
				if (local23 == 8 && (Static107.anInt2345 == 0 || Static107.anInt2345 == 1 && Static7.method1864(local45))) {
					if (arg0 > local35 - 14 && arg0 <= local35) {
						Static79.method1250(0, 0, Static91.method1340(new Class74[] { Static42.aClass74_702, local45 }), Static7.aClass74_1655, 0, 51);
					}
					local3++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method273() {
		anIntArray39 = null;
		aClass2_Sub16_Sub2_1 = null;
		aClass74_331 = null;
		aClass74_329 = null;
		aClass74_333 = null;
		aBigInteger1 = null;
		aClass74_330 = null;
		aClass74_332 = null;
		aClass74_328 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!g;Lclient!g;I)V")
	public static void method274(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1) {
		Static101.aClass26_27 = arg1;
		Static36.aClass26_6 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)I")
	public static int method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg5;
			arg5 = local8;
		}
		@Pc(20) int local20 = arg1 & 0x3;
		if (local20 == 0) {
			return arg4;
		} else if (local20 == 1) {
			return arg3;
		} else if (local20 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return 7 + 1 - arg3 - arg5;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B[Lclient!u;)[Lclient!u;")
	public static Class74[] method276(@OriginalArg(1) Class74[] arg0) {
		@Pc(13) Class74[] local13 = new Class74[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static91.method1340(new Class74[] { Static56.method940(local15), Static2.aClass74_31 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static91.method1340(new Class74[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}
}
