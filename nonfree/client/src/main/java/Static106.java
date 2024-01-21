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

public final class Static106 {

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "Lclient!bc;")
	public static Class8 aClass8_53 = new Class8(200);

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1000 = Static119.method1462("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1002 = Static119.method1462(" has logged out)3");

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1001 = aClass65_1002;

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
	public static int anInt2390 = 127;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1003 = Static119.method1462("<col=ffffff>");

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
	public static int anInt2392 = 0;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1004 = Static119.method1462("Prepared visibility map");

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	public static final int anInt2394 = 20;

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1005 = aClass65_1004;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	public static int method1716() {
		return 6;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] method1717() {
		@Pc(11) Class2_Sub1_Sub4_Sub1[] local11 = new Class2_Sub1_Sub4_Sub1[Static72.anInt1650];
		for (@Pc(13) int local13 = 0; local13 < Static72.anInt1650; local13++) {
			@Pc(22) Class2_Sub1_Sub4_Sub1 local22 = local11[local13] = new Class2_Sub1_Sub4_Sub1();
			local22.anInt601 = Static19.anInt471;
			local22.anInt604 = Static47.anInt1144;
			local22.anInt600 = Static88.anIntArray256[local13];
			local22.anInt599 = Static128.anIntArray359[local13];
			local22.anInt602 = Static45.anIntArray130[local13];
			local22.anInt603 = Static100.anIntArray294[local13];
			@Pc(54) int local54 = local22.anInt602 * local22.anInt603;
			@Pc(58) byte[] local58 = Static76.aByteArrayArray6[local13];
			local22.anIntArray54 = new int[local54];
			for (@Pc(64) int local64 = 0; local64 < local54; local64++) {
				local22.anIntArray54[local64] = Static110.anIntArray328[local58[local64] & 0xFF];
			}
		}
		Static37.method655();
		return local11;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
	public static int method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & 0x7F;
		@Pc(38) int local38 = arg1 & 0x7F;
		@Pc(40) int local40 = arg2;
		if (arg2 < 3 && (Static88.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
			local40 = arg2 + 1;
		}
		@Pc(90) int local90 = Static67.anIntArrayArrayArray8[local40][local7 + 1][local11 + 1] * local38 + (128 - local38) * Static67.anIntArrayArrayArray8[local40][local7][local11 + 1] >> 7;
		@Pc(117) int local117 = (128 - local38) * Static67.anIntArrayArrayArray8[local40][local7][local11] + Static67.anIntArrayArrayArray8[local40][local7 + 1][local11] * local38 >> 7;
		return (128 - local34) * local117 + local34 * local90 >> 7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZII)I")
	public static int method1719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		return Static37.aClass2_Sub1_Sub16_1 != null && local15 == Static37.aClass2_Sub1_Sub16_1.aLong100 ? Static3.aClass2_Sub4_4.anInt1298 * 99 / (Static3.aClass2_Sub4_4.aByteArray20.length - Static37.aClass2_Sub1_Sub16_1.aByte5) + 1 : 0;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method1720() {
		aClass65_1003 = null;
		aClass65_1005 = null;
		aClass8_53 = null;
		aClass65_1001 = null;
		aClass65_1004 = null;
		aClass65_1002 = null;
		aByteArrayArrayArray4 = null;
		aClass65_1000 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!jf;Z)V")
	public static void method1721(@OriginalArg(1) Class2_Sub4_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) Static16.aClass13_14.method270();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2635; local22++) {
				if (local15.aClass15Array2[local22] != null) {
					if (local15.aClass15Array2[local22].anInt404 == 2) {
						local15.anIntArray348[local22] = -5;
					}
					if (local15.aClass15Array2[local22].anInt404 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass15Array1[local22] != null) {
					if (local15.aClass15Array1[local22].anInt404 == 2) {
						local15.anIntArray348[local22] = -6;
					}
					if (local15.aClass15Array1[local22].anInt404 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method962(166);
			arg0.method926(0);
			@Pc(98) int local98 = arg0.anInt1298;
			arg0.method914(local15.anInt2638);
			for (@Pc(105) int local105 = 0; local105 < local15.anInt2635; local105++) {
				if (local15.anIntArray348[local105] == 0) {
					try {
						@Pc(129) int local129 = local15.anIntArray349[local105];
						@Pc(144) Field local144;
						@Pc(172) int local172;
						if (local129 == 0) {
							local144 = (Field) local15.aClass15Array2[local105].anObject9;
							local172 = local144.getInt(null);
							arg0.method926(0);
							arg0.method914(local172);
						} else if (local129 == 1) {
							local144 = (Field) local15.aClass15Array2[local105].anObject9;
							local144.setInt(null, local15.anIntArray347[local105]);
							arg0.method926(0);
						} else if (local129 == 2) {
							local144 = (Field) local15.aClass15Array2[local105].anObject9;
							local172 = local144.getModifiers();
							arg0.method926(0);
							arg0.method914(local172);
						}
						@Pc(213) Method local213;
						if (local129 == 3) {
							local213 = (Method) local15.aClass15Array1[local105].anObject9;
							@Pc(218) byte[][] local218 = local15.aByteArrayArrayArray6[local105];
							@Pc(222) Object[] local222 = new Object[local218.length];
							for (@Pc(224) int local224 = 0; local224 < local218.length; local224++) {
								@Pc(236) ObjectInputStream local236 = new ObjectInputStream(new ByteArrayInputStream(local218[local224]));
								local222[local224] = local236.readObject();
							}
							@Pc(255) Object local255 = local213.invoke(null, local222);
							if (local255 == null) {
								arg0.method926(0);
							} else if (local255 instanceof Number) {
								arg0.method926(1);
								arg0.method948(((Number) local255).longValue());
							} else if (local255 instanceof Class65) {
								arg0.method926(2);
								arg0.method943((Class65) local255);
							} else {
								arg0.method926(4);
							}
						} else if (local129 == 4) {
							local213 = (Method) local15.aClass15Array1[local105].anObject9;
							local172 = local213.getModifiers();
							arg0.method926(0);
							arg0.method914(local172);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method926(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method926(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method926(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method926(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method926(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg0.method926(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg0.method926(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg0.method926(-17);
					} catch (@Pc(369) IOException local369) {
						arg0.method926(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg0.method926(-19);
					} catch (@Pc(381) Exception local381) {
						arg0.method926(-20);
					} catch (@Pc(387) Throwable local387) {
						arg0.method926(-21);
					}
				} else {
					arg0.method926(local15.anIntArray348[local105]);
				}
			}
			arg0.method913(local98);
			arg0.method945(arg0.anInt1298 - local98);
			local15.method2053();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	public static void method1723() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(13) int local13 = 0; local13 < Static49.anInt1205 - 1; local13++) {
				if (Static126.anIntArray355[local13] < 1000 && Static126.anIntArray355[local13 + 1] > 1000) {
					local3 = false;
					@Pc(35) Class65 local35 = Static83.aClass65Array40[local13];
					Static83.aClass65Array40[local13] = Static83.aClass65Array40[local13 + 1];
					Static83.aClass65Array40[local13 + 1] = local35;
					@Pc(53) Class65 local53 = Static83.aClass65Array39[local13];
					Static83.aClass65Array39[local13] = Static83.aClass65Array39[local13 + 1];
					Static83.aClass65Array39[local13 + 1] = local53;
					@Pc(71) int local71 = Static126.anIntArray355[local13];
					Static126.anIntArray355[local13] = Static126.anIntArray355[local13 + 1];
					Static126.anIntArray355[local13 + 1] = local71;
					@Pc(89) int local89 = Static84.anIntArray241[local13];
					Static84.anIntArray241[local13] = Static84.anIntArray241[local13 + 1];
					Static84.anIntArray241[local13 + 1] = local89;
					@Pc(107) int local107 = Static113.anIntArray333[local13];
					Static113.anIntArray333[local13] = Static113.anIntArray333[local13 + 1];
					Static113.anIntArray333[local13 + 1] = local107;
					@Pc(125) int local125 = Static45.anIntArray131[local13];
					Static45.anIntArray131[local13] = Static45.anIntArray131[local13 + 1];
					Static45.anIntArray131[local13 + 1] = local125;
				}
			}
		}
	}
}
