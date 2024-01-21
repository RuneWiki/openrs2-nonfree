import java.awt.Component;
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

public final class Static31 {

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array2;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_364 = Static2.method59("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt1083 = 0;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	public static int anInt1085 = -1;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_365 = Static2.method59(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public static int anInt1091 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIILclient!ce;IZ)V")
	public static void method574(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class11_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) long local10 = (long) (arg1 + (arg2 << 16));
		@Pc(21) Class2_Sub1_Sub15 local21 = (Class2_Sub1_Sub15) Static40.aClass41_4.method1056(local10);
		if (local21 != null) {
			return;
		}
		local21 = (Class2_Sub1_Sub15) Static108.aClass41_13.method1056(local10);
		if (local21 != null) {
			return;
		}
		local21 = (Class2_Sub1_Sub15) Static45.aClass41_10.method1056(local10);
		if (local21 == null) {
			if (!arg5) {
				local21 = (Class2_Sub1_Sub15) Static21.aClass41_2.method1056(local10);
				if (local21 != null) {
					return;
				}
			}
			local21 = new Class2_Sub1_Sub15();
			local21.anInt2701 = arg4;
			local21.aByte5 = arg0;
			local21.aClass11_Sub1_17 = arg3;
			if (arg5) {
				Static40.aClass41_4.method1063(local21, local10);
				Static55.anInt1309++;
			} else {
				Static111.aClass70_32.method1849(local21);
				Static45.aClass41_10.method1063(local21, local10);
				Static57.anInt1735++;
			}
		} else if (arg5) {
			local21.method1934();
			Static40.aClass41_4.method1063(local21, local10);
			Static55.anInt1309++;
			Static57.anInt1735--;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public static void method575() {
		Static14.aClass28_1.method716();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static87.aLongArray8[local6] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static45.aLongArray6[local22] = 0L;
		}
		Static89.anInt2171 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method576(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static116.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static5.aClass57_1);
		arg0.addFocusListener(Static5.aClass57_1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLclient!t;)V")
	public static void method577(@OriginalArg(2) Class2_Sub17_Sub1 arg0) {
		while (true) {
			@Pc(18) Class2_Sub8 local18 = (Class2_Sub8) Static55.aClass58_7.method1285();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt1845; local25++) {
				if (local18.aClass56Array1[local25] != null) {
					if (local18.aClass56Array1[local25].anInt2056 == 2) {
						local18.anIntArray231[local25] = -5;
					}
					if (local18.aClass56Array1[local25].anInt2056 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass56Array2[local25] != null) {
					if (local18.aClass56Array2[local25].anInt2056 == 2) {
						local18.anIntArray231[local25] = -6;
					}
					if (local18.aClass56Array2[local25].anInt2056 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method1799(19);
			arg0.method1769(0);
			@Pc(103) int local103 = arg0.anInt2799;
			arg0.method1765(local18.anInt1847);
			for (@Pc(110) int local110 = 0; local110 < local18.anInt1845; local110++) {
				if (local18.anIntArray231[local110] == 0) {
					try {
						@Pc(131) int local131 = local18.anIntArray229[local110];
						@Pc(143) Field local143;
						@Pc(169) int local169;
						if (local131 == 0) {
							local143 = (Field) local18.aClass56Array1[local110].anObject2;
							local169 = local143.getInt(null);
							arg0.method1769(0);
							arg0.method1765(local169);
						} else if (local131 == 1) {
							local143 = (Field) local18.aClass56Array1[local110].anObject2;
							local143.setInt(null, local18.anIntArray228[local110]);
							arg0.method1769(0);
						} else if (local131 == 2) {
							local143 = (Field) local18.aClass56Array1[local110].anObject2;
							local169 = local143.getModifiers();
							arg0.method1769(0);
							arg0.method1765(local169);
						}
						@Pc(211) Method local211;
						if (local131 == 3) {
							local211 = (Method) local18.aClass56Array2[local110].anObject2;
							@Pc(236) byte[][] local236 = local18.aByteArrayArrayArray4[local110];
							@Pc(240) Object[] local240 = new Object[local236.length];
							for (@Pc(242) int local242 = 0; local242 < local236.length; local242++) {
								@Pc(254) ObjectInputStream local254 = new ObjectInputStream(new ByteArrayInputStream(local236[local242]));
								local240[local242] = local254.readObject();
							}
							@Pc(273) Object local273 = local211.invoke(null, local240);
							if (local273 == null) {
								arg0.method1769(0);
							} else if (local273 instanceof Number) {
								arg0.method1769(1);
								arg0.method1772(((Number) local273).longValue());
							} else if (local273 instanceof Class80) {
								arg0.method1769(2);
								arg0.method1754((Class80) local273);
							} else {
								arg0.method1769(4);
							}
						} else if (local131 == 4) {
							local211 = (Method) local18.aClass56Array2[local110].anObject2;
							local169 = local211.getModifiers();
							arg0.method1769(0);
							arg0.method1765(local169);
						}
					} catch (@Pc(316) ClassNotFoundException local316) {
						arg0.method1769(-10);
					} catch (@Pc(322) InvalidClassException local322) {
						arg0.method1769(-11);
					} catch (@Pc(328) StreamCorruptedException local328) {
						arg0.method1769(-12);
					} catch (@Pc(334) OptionalDataException local334) {
						arg0.method1769(-13);
					} catch (@Pc(340) IllegalAccessException local340) {
						arg0.method1769(-14);
					} catch (@Pc(346) IllegalArgumentException local346) {
						arg0.method1769(-15);
					} catch (@Pc(352) InvocationTargetException local352) {
						arg0.method1769(-16);
					} catch (@Pc(358) SecurityException local358) {
						arg0.method1769(-17);
					} catch (@Pc(364) IOException local364) {
						arg0.method1769(-18);
					} catch (@Pc(370) NullPointerException local370) {
						arg0.method1769(-19);
					} catch (@Pc(376) Exception local376) {
						arg0.method1769(-20);
					} catch (@Pc(382) Throwable local382) {
						arg0.method1769(-21);
					}
				} else {
					arg0.method1769(local18.anIntArray231[local110]);
				}
			}
			arg0.method1752(local103);
			arg0.method1768(arg0.anInt2799 - local103);
			local18.method1961();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	public static void method578() {
		aClass80_365 = null;
		aClass80_364 = null;
		aClass2_Sub1_Sub9_Sub3Array2 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method580() {
		Static38.method657();
		Static77.aBoolean145 = true;
		Static11.method179();
		@Pc(38) boolean local38;
		if (Static97.anInt2559 != -1) {
			local38 = Static125.method1778(Static97.anInt2559, 190, 1, 261);
			if (!local38) {
				Static70.aBoolean131 = true;
			}
		} else if (Static39.anIntArray89[Static23.anInt875] != -1) {
			local38 = Static125.method1778(Static39.anIntArray89[Static23.anInt875], 190, 1, 261);
			if (!local38) {
				Static70.aBoolean131 = true;
			}
		}
		if (Static122.aBoolean241 && Static11.anInt315 == 1) {
			if (Static81.anInt2043 == 1) {
				Static18.method400();
			} else {
				Static112.method1848();
			}
		}
		Static92.method1397();
	}
}
