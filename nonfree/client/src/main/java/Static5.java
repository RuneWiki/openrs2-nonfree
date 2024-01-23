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

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "Lclient!hc;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
	public static int[] anIntArray6 = new int[50];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method84() {
		@Pc(7) int local7 = Static95.anInt2633;
		@Pc(9) int local9 = Static48.anInt1406;
		@Pc(11) int local11 = Static75.anInt2037;
		@Pc(13) int local13 = Static197.anInt2398;
		Static189.method3193(local7, local9, local11, local13, 6116423);
		Static189.method3193(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static189.method3185(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		Static120.aClass1_Sub2_Sub7_2.method1940(Static16.aString354, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(68) int local68 = Static240.anInt5167;
		@Pc(70) int local70 = Static71.anInt1930;
		for (@Pc(72) int local72 = 0; local72 < Static230.anInt5417; local72++) {
			@Pc(87) int local87 = local9 + (-local72 + Static230.anInt5417 + -1) * 15 + 31;
			@Pc(89) int local89 = 16777215;
			if (local7 < local70 && local70 < local7 + local11 && local68 > local87 - 13 && local68 < local87 + 3) {
				local89 = 16776960;
			}
			Static120.aClass1_Sub2_Sub7_2.method1940(Static174.method2990(local72), local7 + 3, local87, local89, 0);
		}
		Static116.method2308(Static197.anInt2398, Static75.anInt2037, Static48.anInt1406, Static95.anInt2633);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!h;)V")
	public static void method88(@OriginalArg(2) Class1_Sub13_Sub1 arg0) {
		while (true) {
			@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) Static89.aClass3_11.method30();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt22; local22++) {
				if (local15.aClass145Array1[local22] != null) {
					if (local15.aClass145Array1[local22].anInt5354 == 2) {
						local15.anIntArray4[local22] = -5;
					}
					if (local15.aClass145Array1[local22].anInt5354 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass145Array2[local22] != null) {
					if (local15.aClass145Array2[local22].anInt5354 == 2) {
						local15.anIntArray4[local22] = -6;
					}
					if (local15.aClass145Array2[local22].anInt5354 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1825(173);
			arg0.method1766(0);
			@Pc(104) int local104 = arg0.anInt2395;
			arg0.method1754(local15.anInt27);
			for (@Pc(111) int local111 = 0; local111 < local15.anInt22; local111++) {
				if (local15.anIntArray4[local111] == 0) {
					try {
						@Pc(132) int local132 = local15.anIntArray2[local111];
						@Pc(144) Field local144;
						@Pc(148) int local148;
						if (local132 == 0) {
							local144 = (Field) local15.aClass145Array1[local111].anObject7;
							local148 = local144.getInt(null);
							arg0.method1766(0);
							arg0.method1754(local148);
						} else if (local132 == 1) {
							local144 = (Field) local15.aClass145Array1[local111].anObject7;
							local144.setInt(null, local15.anIntArray1[local111]);
							arg0.method1766(0);
						} else if (local132 == 2) {
							local144 = (Field) local15.aClass145Array1[local111].anObject7;
							local148 = local144.getModifiers();
							arg0.method1766(0);
							arg0.method1754(local148);
						}
						@Pc(214) Method local214;
						if (local132 == 3) {
							local214 = (Method) local15.aClass145Array2[local111].anObject7;
							@Pc(219) byte[][] local219 = local15.aByteArrayArrayArray1[local111];
							@Pc(223) Object[] local223 = new Object[local219.length];
							for (@Pc(225) int local225 = 0; local225 < local219.length; local225++) {
								@Pc(237) ObjectInputStream local237 = new ObjectInputStream(new ByteArrayInputStream(local219[local225]));
								local223[local225] = local237.readObject();
							}
							@Pc(256) Object local256 = local214.invoke(null, local223);
							if (local256 == null) {
								arg0.method1766(0);
							} else if (local256 instanceof Number) {
								arg0.method1766(1);
								arg0.method1770(((Number) local256).longValue());
							} else if (local256 instanceof String) {
								arg0.method1766(2);
								arg0.method1791((String) local256);
							} else {
								arg0.method1766(4);
							}
						} else if (local132 == 4) {
							local214 = (Method) local15.aClass145Array2[local111].anObject7;
							local148 = local214.getModifiers();
							arg0.method1766(0);
							arg0.method1754(local148);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method1766(-10);
					} catch (@Pc(330) InvalidClassException local330) {
						arg0.method1766(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method1766(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method1766(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method1766(-14);
					} catch (@Pc(354) IllegalArgumentException local354) {
						arg0.method1766(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method1766(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method1766(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method1766(-18);
					} catch (@Pc(378) NullPointerException local378) {
						arg0.method1766(-19);
					} catch (@Pc(384) Exception local384) {
						arg0.method1766(-20);
					} catch (@Pc(390) Throwable local390) {
						arg0.method1766(-21);
					}
				} else {
					arg0.method1766(local15.anIntArray4[local111]);
				}
			}
			arg0.method1763(local104);
			arg0.method1785(arg0.anInt2395 - local104);
			local15.method4186();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method93() {
		if (Static40.aString55.toLowerCase().indexOf("microsoft") != -1) {
			Static43.anIntArray95[189] = 26;
			Static43.anIntArray95[223] = 28;
			Static43.anIntArray95[221] = 43;
			Static43.anIntArray95[191] = 73;
			Static43.anIntArray95[220] = 74;
			Static43.anIntArray95[187] = 27;
			Static43.anIntArray95[190] = 72;
			Static43.anIntArray95[222] = 59;
			Static43.anIntArray95[188] = 71;
			Static43.anIntArray95[219] = 42;
			Static43.anIntArray95[186] = 57;
			Static43.anIntArray95[192] = 58;
			return;
		}
		Static43.anIntArray95[46] = 72;
		Static43.anIntArray95[61] = 27;
		Static43.anIntArray95[44] = 71;
		Static43.anIntArray95[45] = 26;
		Static43.anIntArray95[93] = 43;
		Static43.anIntArray95[47] = 73;
		Static43.anIntArray95[92] = 74;
		Static43.anIntArray95[91] = 42;
		if (Static40.aMethod2 == null) {
			Static43.anIntArray95[192] = 58;
			Static43.anIntArray95[222] = 59;
		} else {
			Static43.anIntArray95[520] = 59;
			Static43.anIntArray95[192] = 28;
			Static43.anIntArray95[222] = 58;
		}
		Static43.anIntArray95[59] = 57;
	}
}
