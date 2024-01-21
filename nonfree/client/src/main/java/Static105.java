import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!sd;")
	public static Class29 aClass29_66;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_45;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public static int anInt2778;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public static int anInt2779;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!sd;")
	public static Class29 aClass29_67;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1200 = Static63.method1251("gleiten:");

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1201 = Static63.method1251("backvmid2");

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1207 = Static63.method1251("Your profile will be transferred in:");

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1202 = aClass45_1207;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1203 = Static63.method1251("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1204 = Static63.method1251("Enter object name");

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1205 = Static63.method1251("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1206 = Static63.method1251("Classic");

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1211 = Static63.method1251("No response from server)3");

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1208 = aClass45_1211;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1209 = Static63.method1251("Aus");

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!sa;")
	public static Class67 aClass67_24 = new Class67(100);

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1210 = aClass45_1204;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1905() {
		for (@Pc(7) int local7 = 0; local7 < Static79.anInt2240; local7++) {
			@Pc(13) int local13 = Static104.anIntArray425[local7];
			@Pc(17) Class5_Sub2_Sub4_Sub3_Sub1 local17 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local13];
			@Pc(23) int local23 = Static70.aClass5_Sub9_Sub1_3.method1408();
			if ((local23 & 0x8) != 0) {
				local23 += Static70.aClass5_Sub9_Sub1_3.method1408() << 8;
			}
			Static119.method2135(local17, local23, local13);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBLclient!r;)V")
	public static void method1906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub6_Sub3 arg2) {
		@Pc(7) int local7 = arg0 * arg0 + arg1 * arg1;
		if (local7 <= 4225 || local7 >= 90000) {
			Static69.method1355(arg0, arg1, arg2);
			return;
		}
		@Pc(34) int local34 = Static112.anInt2981 + Static100.anInt2699 & 0x7FF;
		@Pc(38) int local38 = Class5_Sub2_Sub6_Sub2.anIntArray360[local34];
		@Pc(46) int local46 = local38 * 256 / (Static4.anInt98 + 256);
		@Pc(50) int local50 = Class5_Sub2_Sub6_Sub2.anIntArray362[local34];
		@Pc(58) int local58 = local50 * 256 / (Static4.anInt98 + 256);
		@Pc(69) int local69 = local46 * arg1 + local58 * arg0 >> 16;
		@Pc(80) int local80 = arg1 * local58 - local46 * arg0 >> 16;
		@Pc(86) double local86 = Math.atan2((double) local69, (double) local80);
		@Pc(92) int local92 = (int) (Math.sin(local86) * 63.0D);
		@Pc(98) int local98 = (int) (Math.cos(local86) * 57.0D);
		Static85.aClass5_Sub2_Sub6_Sub3_3.method1777(local92 + 4 + 94 - 10, -local98 + 63, local86);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method1907() {
		for (@Pc(18) Class5_Sub19 local18 = (Class5_Sub19) Static74.aClass10_10.method230(); local18 != null; local18 = (Class5_Sub19) Static74.aClass10_10.method233()) {
			if (local18.anInt3116 > 0) {
				local18.anInt3116--;
			}
			if (local18.anInt3116 != 0) {
				if (local18.anInt3120 > 0) {
					local18.anInt3120--;
				}
				if (local18.anInt3120 == 0 && local18.anInt3117 >= 1 && local18.anInt3122 >= 1 && local18.anInt3117 <= 102 && local18.anInt3122 <= 102 && (local18.anInt3128 < 0 || Static72.method1457(local18.anInt3125, local18.anInt3128))) {
					Static116.method2102(local18.anInt3128, local18.anInt3117, local18.anInt3125, local18.anInt3129, local18.anInt3115, local18.anInt3122, local18.anInt3124);
					local18.anInt3120 = -1;
					if (local18.anInt3128 == local18.anInt3127 && local18.anInt3127 == -1) {
						local18.method2144();
					} else if (local18.anInt3127 == local18.anInt3128 && local18.anInt3114 == local18.anInt3129 && local18.anInt3118 == local18.anInt3125) {
						local18.method2144();
					}
				}
			} else if (local18.anInt3127 < 0 || Static72.method1457(local18.anInt3118, local18.anInt3127)) {
				Static116.method2102(local18.anInt3127, local18.anInt3117, local18.anInt3118, local18.anInt3114, local18.anInt3115, local18.anInt3122, local18.anInt3124);
				local18.method2144();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method1908() {
		aClass45_1207 = null;
		aClass45_1208 = null;
		aLongArray6 = null;
		aClass45_1210 = null;
		aClass45_1209 = null;
		aClass45_1202 = null;
		aClass45_1201 = null;
		aClass29_66 = null;
		aClass45_1200 = null;
		aClass29_67 = null;
		aClass45_1204 = null;
		aClass45_1205 = null;
		aClass67_24 = null;
		aClass45_1206 = null;
		aClass29_Sub1_45 = null;
		aClass45_1203 = null;
		aClass45_1211 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!na;I)V")
	public static void method1909(@OriginalArg(1) Class5_Sub9_Sub1 arg0) {
		while (true) {
			@Pc(15) Class5_Sub15 local15 = (Class5_Sub15) Static103.aClass10_12.method230();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2745; local22++) {
				if (local15.aClass46Array1[local22] != null) {
					if (local15.aClass46Array1[local22].anInt1964 == 2) {
						local15.anIntArray420[local22] = -5;
					}
					if (local15.aClass46Array1[local22].anInt1964 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass46Array2[local22] != null) {
					if (local15.aClass46Array2[local22].anInt1964 == 2) {
						local15.anIntArray420[local22] = -6;
					}
					if (local15.aClass46Array2[local22].anInt1964 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1466(246);
			arg0.method1428(0);
			@Pc(109) int local109 = arg0.anInt2140;
			arg0.method1413(local15.anInt2752);
			for (@Pc(116) int local116 = 0; local116 < local15.anInt2745; local116++) {
				if (local15.anIntArray420[local116] == 0) {
					try {
						@Pc(137) int local137 = local15.anIntArray421[local116];
						@Pc(146) Field local146;
						@Pc(150) int local150;
						if (local137 == 0) {
							local146 = (Field) local15.aClass46Array1[local116].anObject4;
							local150 = local146.getInt(null);
							arg0.method1428(0);
							arg0.method1413(local150);
						} else if (local137 == 1) {
							local146 = (Field) local15.aClass46Array1[local116].anObject4;
							local146.setInt(null, local15.anIntArray418[local116]);
							arg0.method1428(0);
						} else if (local137 == 2) {
							local146 = (Field) local15.aClass46Array1[local116].anObject4;
							local150 = local146.getModifiers();
							arg0.method1428(0);
							arg0.method1413(local150);
						}
						@Pc(224) Method local224;
						if (local137 == 3) {
							local224 = (Method) local15.aClass46Array2[local116].anObject4;
							@Pc(229) byte[][] local229 = local15.aByteArrayArrayArray7[local116];
							@Pc(233) Object[] local233 = new Object[local229.length];
							for (@Pc(235) int local235 = 0; local235 < local229.length; local235++) {
								@Pc(247) ObjectInputStream local247 = new ObjectInputStream(new ByteArrayInputStream(local229[local235]));
								local233[local235] = local247.readObject();
							}
							@Pc(266) Object local266 = local224.invoke(null, local233);
							if (local266 == null) {
								arg0.method1428(0);
							} else if (local266 instanceof Number) {
								arg0.method1428(1);
								arg0.method1454(((Number) local266).longValue());
							} else if (local266 instanceof Class45) {
								arg0.method1428(2);
								arg0.method1402((Class45) local266);
							} else {
								arg0.method1428(4);
							}
						} else if (local137 == 4) {
							local224 = (Method) local15.aClass46Array2[local116].anObject4;
							local150 = local224.getModifiers();
							arg0.method1428(0);
							arg0.method1413(local150);
						}
					} catch (@Pc(334) ClassNotFoundException local334) {
						arg0.method1428(-10);
					} catch (@Pc(340) InvalidClassException local340) {
						arg0.method1428(-11);
					} catch (@Pc(346) StreamCorruptedException local346) {
						arg0.method1428(-12);
					} catch (@Pc(352) OptionalDataException local352) {
						arg0.method1428(-13);
					} catch (@Pc(358) IllegalAccessException local358) {
						arg0.method1428(-14);
					} catch (@Pc(366) IllegalArgumentException local366) {
						arg0.method1428(-15);
					} catch (@Pc(374) InvocationTargetException local374) {
						arg0.method1428(-16);
					} catch (@Pc(380) SecurityException local380) {
						arg0.method1428(-17);
					} catch (@Pc(386) IOException local386) {
						arg0.method1428(-18);
					} catch (@Pc(392) NullPointerException local392) {
						arg0.method1428(-19);
					} catch (@Pc(400) Exception local400) {
						arg0.method1428(-20);
					} catch (@Pc(406) Throwable local406) {
						arg0.method1428(-21);
					}
				} else {
					arg0.method1428(local15.anIntArray420[local116]);
				}
			}
			arg0.method1437(local109);
			arg0.method1440(arg0.anInt2140 - local109);
			local15.method2144();
		}
	}
}
