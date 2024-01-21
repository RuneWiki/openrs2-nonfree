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

public final class Static79 {

	@OriginalMember(owner = "client!o", name = "Db", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array12;

	@OriginalMember(owner = "client!o", name = "Fb", descriptor = "[Lclient!oe;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!o", name = "Hb", descriptor = "Lclient!ea;")
	public static Class20 aClass20_40;

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "Lclient!wc;")
	public static Class81 aClass81_10 = new Class81(4096);

	@OriginalMember(owner = "client!o", name = "Mb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_624 = Static60.method1113(" has logged out)3");

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_616 = aClass22_624;

	@OriginalMember(owner = "client!o", name = "zb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_617 = Static60.method1113("Unable to find ");

	@OriginalMember(owner = "client!o", name = "Ab", descriptor = "I")
	public static int anInt2177 = 0;

	@OriginalMember(owner = "client!o", name = "Bb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_618 = Static60.method1113("Please try again)3");

	@OriginalMember(owner = "client!o", name = "Cb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_619 = Static60.method1113("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!o", name = "Eb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_620 = Static60.method1113("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!o", name = "Gb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_621 = aClass22_618;

	@OriginalMember(owner = "client!o", name = "Ib", descriptor = "Lclient!ec;")
	public static Class22 aClass22_622 = aClass22_617;

	@OriginalMember(owner = "client!o", name = "Jb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_623 = aClass22_619;

	@OriginalMember(owner = "client!o", name = "Kb", descriptor = "I")
	public static final int anInt2178 = 20;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)I")
	public static int method1428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local6 ^ local6 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & local21 * (local21 * 15731 * local21 + 789221) + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BILclient!ge;)V")
	public static void method1430(@OriginalArg(2) Class4_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(17) Class4_Sub6 local17 = (Class4_Sub6) Static93.aClass82_9.method2025();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt575; local24++) {
				if (local17.aClass12Array1[local24] != null) {
					if (local17.aClass12Array1[local24].anInt373 == 2) {
						local17.anIntArray63[local24] = -5;
					}
					if (local17.aClass12Array1[local24].anInt373 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass12Array2[local24] != null) {
					if (local17.aClass12Array2[local24].anInt373 == 2) {
						local17.anIntArray63[local24] = -6;
					}
					if (local17.aClass12Array2[local24].anInt373 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method752(183);
			arg0.method701(0);
			@Pc(103) int local103 = arg0.anInt1099;
			arg0.method717(local17.anInt571);
			for (@Pc(110) int local110 = 0; local110 < local17.anInt575; local110++) {
				if (local17.anIntArray63[local110] == 0) {
					try {
						@Pc(134) int local134 = local17.anIntArray65[local110];
						@Pc(151) Field local151;
						@Pc(154) int local154;
						if (local134 == 0) {
							local151 = (Field) local17.aClass12Array1[local110].anObject1;
							local154 = local151.getInt(null);
							arg0.method701(0);
							arg0.method717(local154);
						} else if (local134 == 1) {
							local151 = (Field) local17.aClass12Array1[local110].anObject1;
							local151.setInt(null, local17.anIntArray64[local110]);
							arg0.method701(0);
						} else if (local134 == 2) {
							local151 = (Field) local17.aClass12Array1[local110].anObject1;
							local154 = local151.getModifiers();
							arg0.method701(0);
							arg0.method717(local154);
						}
						@Pc(220) Method local220;
						if (local134 == 3) {
							local220 = (Method) local17.aClass12Array2[local110].anObject1;
							@Pc(245) byte[][] local245 = local17.aByteArrayArrayArray2[local110];
							@Pc(249) Object[] local249 = new Object[local245.length];
							for (@Pc(251) int local251 = 0; local251 < local245.length; local251++) {
								@Pc(263) ObjectInputStream local263 = new ObjectInputStream(new ByteArrayInputStream(local245[local251]));
								local249[local251] = local263.readObject();
							}
							@Pc(278) Object local278 = local220.invoke(null, local249);
							if (local278 == null) {
								arg0.method701(0);
							} else if (local278 instanceof Number) {
								arg0.method701(1);
								arg0.method728(((Number) local278).longValue());
							} else if (local278 instanceof Class22) {
								arg0.method701(2);
								arg0.method708((Class22) local278);
							} else {
								arg0.method701(4);
							}
						} else if (local134 == 4) {
							local220 = (Method) local17.aClass12Array2[local110].anObject1;
							local154 = local220.getModifiers();
							arg0.method701(0);
							arg0.method717(local154);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method701(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method701(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method701(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method701(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method701(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg0.method701(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg0.method701(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg0.method701(-17);
					} catch (@Pc(369) IOException local369) {
						arg0.method701(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg0.method701(-19);
					} catch (@Pc(381) Exception local381) {
						arg0.method701(-20);
					} catch (@Pc(387) Throwable local387) {
						arg0.method701(-21);
					}
				} else {
					arg0.method701(local17.anIntArray63[local110]);
				}
			}
			arg0.method709(local103);
			arg0.method702(arg0.anInt1099 - local103);
			local17.method1999();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1431(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(14) int local14 = local8.method719();
		@Pc(18) int local18 = local8.method725();
		if (local18 < 0 || Static31.anInt737 != 0 && Static31.anInt737 < local18) {
			throw new RuntimeException();
		} else if (local14 == 0) {
			@Pc(89) byte[] local89 = new byte[local18];
			local8.method744(local18, local89);
			return local89;
		} else {
			@Pc(47) int local47 = local8.method725();
			if (local47 < 0 || Static31.anInt737 != 0 && Static31.anInt737 < local47) {
				throw new RuntimeException();
			}
			@Pc(67) byte[] local67 = new byte[local47];
			if (local14 == 1) {
				Static102.method1708(local67, local47, arg0, local18);
			} else {
				Static11.aClass2_32.method6(local67, local8);
			}
			return local67;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ec;ZILclient!ec;Lclient!ec;)V")
	public static void method1433(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) Class22 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static14.anIntArray40[local3] = Static14.anIntArray40[local3 - 1];
			Static12.aClass22Array2[local3] = Static12.aClass22Array2[local3 - 1];
			Static31.aClass22Array5[local3] = Static31.aClass22Array5[local3 - 1];
			Static92.aClass22Array19[local3] = Static92.aClass22Array19[local3 - 1];
		}
		Static13.anInt285 = Static96.anInt2513;
		Static12.aClass22Array2[0] = arg0;
		Static19.anInt543++;
		Static14.anIntArray40[0] = arg1;
		Static31.aClass22Array5[0] = arg2;
		Static92.aClass22Array19[0] = arg3;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method1436() {
		aClass4_Sub1_Sub2_Sub2Array12 = null;
		aClass22_619 = null;
		aClass22_621 = null;
		aClass22_618 = null;
		aClass22_623 = null;
		aClass54Array1 = null;
		aClass20_40 = null;
		aClass22_622 = null;
		aClass22_620 = null;
		aClass22_624 = null;
		aClass22_616 = null;
		aClass22_617 = null;
		aClass81_10 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!vc;")
	public static Class4_Sub1_Sub17 method1437(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub1_Sub17 local6 = (Class4_Sub1_Sub17) Static76.aClass33_25.method998((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static65.aClass20_34.method597(12, arg0);
		local6 = new Class4_Sub1_Sub17();
		if (local25 != null) {
			local6.method1911(new Class4_Sub11(local25));
		}
		local6.method1919();
		Static76.aClass33_25.method997((long) arg0, local6);
		return local6;
	}
}
