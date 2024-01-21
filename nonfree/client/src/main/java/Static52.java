import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jc", name = "rb", descriptor = "Lclient!l;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "Lclient!qf;")
	public static Class60 aClass60_759 = Static59.method1195("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <lt>AN<gt>");

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
	public static int anInt1715 = 0;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!jc", name = "qb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_763 = Static59.method1195("Loading wordpack )2 ");

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_760 = aClass60_763;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
	public static int anInt1721 = 0;

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
	public static int anInt1724 = 128;

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_761 = Static59.method1195("T");

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "I")
	public static int anInt1727 = -1;

	@OriginalMember(owner = "client!jc", name = "sb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_764 = Static59.method1195("white:");

	@OriginalMember(owner = "client!jc", name = "tb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_765 = aClass60_764;

	@OriginalMember(owner = "client!jc", name = "ub", descriptor = "Lclient!qf;")
	public static Class60 aClass60_766 = Static59.method1195(")1p");

	@OriginalMember(owner = "client!jc", name = "vb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_767 = aClass60_764;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)[B")
	public static byte[] method1123(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static135.method1705(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!qf;ILclient!qf;Lclient!jb;)Lclient!gd;")
	public static Class3_Sub1_Sub2_Sub2 method1124(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class25 arg2) {
		@Pc(9) int local9 = arg2.method920(arg1);
		@Pc(15) int local15 = arg2.method922(local9, arg0);
		return Static120.method2172(arg2, local9, local15);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JZ)V")
	public static void method1125(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static61.anInt1946 >= 100 && Static11.anInt340 != 1 || Static61.anInt1946 >= 200) {
			Static76.method1565(0, Static86.aClass60_722, Static120.aClass60_1369);
			return;
		}
		@Pc(33) Class60 local33 = Static97.method1821(arg0).method1866();
		for (@Pc(35) int local35 = 0; local35 < Static61.anInt1946; local35++) {
			if (arg0 == Static83.aLongArray4[local35]) {
				Static76.method1565(0, Static60.method1211(new Class60[] { local33, Static36.aClass60_481 }), Static120.aClass60_1369);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static107.anInt3035; local66++) {
			if (arg0 == Static113.aLongArray5[local66]) {
				Static76.method1565(0, Static60.method1211(new Class60[] { Static64.aClass60_886, local33, Static81.aClass60_1083 }), Static120.aClass60_1369);
				return;
			}
		}
		if (local33.method1839(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass60_245)) {
			return;
		}
		Static54.aClass60Array6[Static61.anInt1946] = local33;
		Static83.aLongArray4[Static61.anInt1946] = arg0;
		Static41.anIntArray159[Static61.anInt1946] = 0;
		Static26.anIntArray123[Static61.anInt1946] = 0;
		Static61.anInt1946++;
		Static80.anInt2518 += 32;
		Static118.aBoolean115 = true;
		Static81.aClass3_Sub12_Sub1_2.method1980(118);
		Static81.aClass3_Sub12_Sub1_2.method1972(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	public static void method1126() {
		Static91.aClass17_45.method646();
		Static130.aClass17_57.method646();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	public static void method1127() {
		aClass40_1 = null;
		aClass60_760 = null;
		anObject3 = null;
		aClass60_764 = null;
		aClass60_766 = null;
		aClass60_767 = null;
		aClass60_765 = null;
		aClass60_761 = null;
		aClass60_763 = null;
		aClass60_759 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
	public static int method1128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) long local15 = (long) (arg1 + (arg0 << 16));
		return Static85.aClass3_Sub1_Sub4_1 != null && local15 == Static85.aClass3_Sub1_Sub4_1.aLong107 ? Static124.aClass3_Sub12_7.anInt2886 * 99 / (Static124.aClass3_Sub12_7.aByteArray77.length - Static85.aClass3_Sub1_Sub4_1.aByte6) + 1 : 0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)Z")
	public static boolean method1129(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!jb;Lclient!qf;Lclient!qf;)[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] method1130(@OriginalArg(1) Class25 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(8) int local8 = arg0.method920(arg1);
		@Pc(14) int local14 = arg0.method922(local8, arg2);
		return Static96.method1803(local14, arg0, local8);
	}
}
