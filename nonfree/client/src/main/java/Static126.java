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

public final class Static126 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public static int anInt3212 = 0;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt3213 = 0;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!he;")
	public static Class26 aClass26_1740 = Static6.method100("gelb:");

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public static int anInt3217 = 0;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!he;")
	public static Class26 aClass26_1741 = Static6.method100("nav");

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_1742 = Static6.method100("p12_full");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "[I")
	public static int[] anIntArray387 = new int[5];

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_1743 = Static6.method100("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method2196() {
		aClass26_1743 = null;
		aClass26_1742 = null;
		aClass26_1741 = null;
		anIntArray387 = null;
		aClass26_1740 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)V")
	public static void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static107.aClass3_Sub11_Sub1_3.method1029(240);
		Static107.aClass3_Sub11_Sub1_3.method1001(arg1);
		Static107.aClass3_Sub11_Sub1_3.method989(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method2198() {
		@Pc(9) int local9 = Static31.anInt2721 * 128 + 64;
		@Pc(15) int local15 = Static115.anInt3050 * 128 + 64;
		@Pc(24) int local24 = Static110.method2006(local9, local15, Static132.anInt3270) - Static73.anInt2073;
		if (Static10.anInt282 < local9) {
			Static10.anInt282 += Static1.anInt1 + Static118.anInt3118 * (local9 - Static10.anInt282) / 1000;
			if (Static10.anInt282 > local9) {
				Static10.anInt282 = local9;
			}
		}
		if (local9 < Static10.anInt282) {
			Static10.anInt282 -= (Static10.anInt282 - local9) * Static118.anInt3118 / 1000 + Static1.anInt1;
			if (Static10.anInt282 < local9) {
				Static10.anInt282 = local9;
			}
		}
		if (Static54.anInt1624 < local15) {
			Static54.anInt1624 += Static1.anInt1 + (local15 - Static54.anInt1624) * Static118.anInt3118 / 1000;
			if (local15 < Static54.anInt1624) {
				Static54.anInt1624 = local15;
			}
		}
		local9 = Static18.anInt442 * 128 + 64;
		if (local15 < Static54.anInt1624) {
			Static54.anInt1624 -= Static1.anInt1 + Static118.anInt3118 * (Static54.anInt1624 - local15) / 1000;
			if (local15 > Static54.anInt1624) {
				Static54.anInt1624 = local15;
			}
		}
		if (local24 > Static79.anInt2157) {
			Static79.anInt2157 += Static1.anInt1 + Static118.anInt3118 * (local24 - Static79.anInt2157) / 1000;
			if (Static79.anInt2157 > local24) {
				Static79.anInt2157 = local24;
			}
		}
		local15 = Static25.anInt3161 * 128 + 64;
		if (Static79.anInt2157 > local24) {
			Static79.anInt2157 -= (Static79.anInt2157 - local24) * Static118.anInt3118 / 1000 + Static1.anInt1;
			if (Static79.anInt2157 < local24) {
				Static79.anInt2157 = local24;
			}
		}
		local24 = Static110.method2006(local9, local15, Static132.anInt3270) - Static12.anInt304;
		@Pc(208) int local208 = local24 - Static79.anInt2157;
		@Pc(213) int local213 = local9 - Static10.anInt282;
		@Pc(217) int local217 = local15 - Static54.anInt1624;
		@Pc(228) int local228 = (int) Math.sqrt((double) (local217 * local217 + local213 * local213));
		@Pc(239) int local239 = (int) (Math.atan2((double) local208, (double) local228) * 325.949D) & 0x7FF;
		if (local239 < 128) {
			local239 = 128;
		}
		@Pc(257) int local257 = (int) (-325.949D * Math.atan2((double) local213, (double) local217)) & 0x7FF;
		@Pc(262) int local262 = local257 - Static32.anInt1052;
		if (local239 > 383) {
			local239 = 383;
		}
		if (local262 > 1024) {
			local262 -= 2048;
		}
		if (Static81.anInt2248 < local239) {
			Static81.anInt2248 += Static87.anInt2440 * (local239 - Static81.anInt2248) / 1000 + Static29.anInt1007;
			if (Static81.anInt2248 > local239) {
				Static81.anInt2248 = local239;
			}
		}
		if (Static81.anInt2248 > local239) {
			Static81.anInt2248 -= (Static81.anInt2248 - local239) * Static87.anInt2440 / 1000 + Static29.anInt1007;
			if (Static81.anInt2248 < local239) {
				Static81.anInt2248 = local239;
			}
		}
		if (local262 < -1024) {
			local262 += 2048;
		}
		if (local262 > 0) {
			Static32.anInt1052 += Static87.anInt2440 * local262 / 1000 + Static29.anInt1007;
			Static32.anInt1052 &= 0x7FF;
		}
		if (local262 < 0) {
			Static32.anInt1052 -= Static29.anInt1007 + Static87.anInt2440 * -local262 / 1000;
			Static32.anInt1052 &= 0x7FF;
		}
		@Pc(369) int local369 = local257 - Static32.anInt1052;
		if (local369 > 1024) {
			local369 -= 2048;
		}
		if (local369 < -1024) {
			local369 += 2048;
		}
		if (local369 < 0 && local262 > 0 || local369 > 0 && local262 < 0) {
			Static32.anInt1052 = local257;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBLclient!ib;)V")
	public static void method2199(@OriginalArg(2) Class3_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(16) Class3_Sub7 local16 = (Class3_Sub7) Static12.aClass65_11.method1958();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.anInt1042; local23++) {
				if (local16.aClass22Array2[local23] != null) {
					if (local16.aClass22Array2[local23].anInt1200 == 2) {
						local16.anIntArray109[local23] = -5;
					}
					if (local16.aClass22Array2[local23].anInt1200 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass22Array1[local23] != null) {
					if (local16.aClass22Array1[local23].anInt1200 == 2) {
						local16.anIntArray109[local23] = -6;
					}
					if (local16.aClass22Array1[local23].anInt1200 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method1029(226);
			arg0.method992(0);
			@Pc(99) int local99 = arg0.anInt1562;
			arg0.method1001(local16.anInt1051);
			for (@Pc(106) int local106 = 0; local106 < local16.anInt1042; local106++) {
				if (local16.anIntArray109[local106] == 0) {
					try {
						@Pc(130) int local130 = local16.anIntArray107[local106];
						@Pc(145) Field local145;
						@Pc(173) int local173;
						if (local130 == 0) {
							local145 = (Field) local16.aClass22Array2[local106].anObject3;
							local173 = local145.getInt(null);
							arg0.method992(0);
							arg0.method1001(local173);
						} else if (local130 == 1) {
							local145 = (Field) local16.aClass22Array2[local106].anObject3;
							local145.setInt(null, local16.anIntArray110[local106]);
							arg0.method992(0);
						} else if (local130 == 2) {
							local145 = (Field) local16.aClass22Array2[local106].anObject3;
							local173 = local145.getModifiers();
							arg0.method992(0);
							arg0.method1001(local173);
						}
						@Pc(217) Method local217;
						if (local130 == 3) {
							local217 = (Method) local16.aClass22Array1[local106].anObject3;
							@Pc(242) byte[][] local242 = local16.aByteArrayArrayArray2[local106];
							@Pc(246) Object[] local246 = new Object[local242.length];
							for (@Pc(248) int local248 = 0; local248 < local242.length; local248++) {
								@Pc(260) ObjectInputStream local260 = new ObjectInputStream(new ByteArrayInputStream(local242[local248]));
								local246[local248] = local260.readObject();
							}
							@Pc(275) Object local275 = local217.invoke(null, local246);
							if (local275 == null) {
								arg0.method992(0);
							} else if (local275 instanceof Number) {
								arg0.method992(1);
								arg0.method1020(((Number) local275).longValue());
							} else if (local275 instanceof Class26) {
								arg0.method992(2);
								arg0.method1024((Class26) local275);
							} else {
								arg0.method992(4);
							}
						} else if (local130 == 4) {
							local217 = (Method) local16.aClass22Array1[local106].anObject3;
							local173 = local217.getModifiers();
							arg0.method992(0);
							arg0.method1001(local173);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method992(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method992(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method992(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method992(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method992(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method992(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method992(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method992(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method992(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method992(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method992(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method992(-21);
					}
				} else {
					arg0.method992(local16.anIntArray109[local106]);
				}
			}
			arg0.method999(local99);
			arg0.method1023(arg0.anInt1562 - local99);
			local16.method2201();
		}
	}
}
