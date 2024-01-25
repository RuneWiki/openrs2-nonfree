import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "Lclient!fi;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_1;

	@OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
	public static int anInt1509;

	@OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
	public static int anInt1510;

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_32 = new Class208(0, 10);

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_19 = new Class183(55, 11);

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
	public static int anInt1508 = -1;

	@OriginalMember(owner = "client!dh", name = "ab", descriptor = "[I")
	public static int[] anIntArray112 = new int[2];

	@OriginalMember(owner = "client!dh", name = "cb", descriptor = "[I")
	public static final int[] anIntArray113 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!qo;[I[II[I)V")
	public static void method1227(@OriginalArg(0) Class1_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg0.aClass51Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass51Array3[local19] = null;
					} else {
						@Pc(43) Class102 local43 = Static333.aClass50_2.method1175(local9);
						@Pc(46) int local46 = local43.anInt2985;
						@Pc(51) Class51 local51 = arg0.aClass51Array3[local19];
						if (local51 != null) {
							if (local9 == local51.anInt1433) {
								if (local46 == 0) {
									local51 = arg0.aClass51Array3[local19] = null;
								} else if (local46 == 1) {
									local51.anInt1435 = 0;
									local51.anInt1436 = 0;
									local51.anInt1434 = 1;
									local51.anInt1438 = local17;
									local51.anInt1437 = 0;
									Static343.method5495(local43, false, arg0.anInt6800, 0, arg0.anInt6798, arg0.aByte73);
								} else if (local46 == 2) {
									local51.anInt1436 = 0;
								}
							} else if (local43.anInt2992 >= Static333.aClass50_2.method1175(local51.anInt1433).anInt2992) {
								local51 = arg0.aClass51Array3[local19] = null;
							}
						}
						if (local51 == null) {
							local51 = arg0.aClass51Array3[local19] = new Class51();
							local51.anInt1438 = local17;
							local51.anInt1434 = 1;
							local51.anInt1437 = 0;
							local51.anInt1435 = 0;
							local51.anInt1436 = 0;
							local51.anInt1433 = local9;
							Static343.method5495(local43, false, arg0.anInt6800, 0, arg0.anInt6798, arg0.aByte73);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1228(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static139.anInt2976; local11++) {
			if (arg0.equalsIgnoreCase(Static30.aStringArray6[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!vt;)Lclient!e;")
	public static Class43_Sub2 method1229(@OriginalArg(1) Class2_Sub24 arg0) {
		return new Class43_Sub2(arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5743(), arg0.method5736(), arg0.method5732());
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLclient!cj;)V")
	public static void method1230(@OriginalArg(1) Class1_Sub2_Sub1_Sub1 arg0) {
		@Pc(20) Class2_Sub41 local20 = (Class2_Sub41) Static309.aClass243_26.method5967((long) arg0.anInt5374);
		if (local20 == null) {
			return;
		}
		if (local20.aClass2_Sub11_Sub2_3 != null) {
			Static192.aClass2_Sub11_Sub4_1.method4879(local20.aClass2_Sub11_Sub2_3);
			local20.aClass2_Sub11_Sub2_3 = null;
		}
		local20.method6130();
	}
}
