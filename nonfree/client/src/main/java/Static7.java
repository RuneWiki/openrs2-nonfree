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

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
	public static int anInt294;

	@OriginalMember(owner = "client!ba", name = "ob", descriptor = "Lclient!da;")
	public static Class15 aClass15_9;

	@OriginalMember(owner = "client!ba", name = "Db", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "Lclient!wb;")
	private static Class65 aClass65_135 = Static24.method441("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "Lclient!wb;")
	public static Class65 aClass65_136 = Static24.method441("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
	public static int anInt287 = 0;

	@OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
	public static int anInt288 = 0;

	@OriginalMember(owner = "client!ba", name = "lb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_137 = Static24.method441("No reply from loginserver)3");

	@OriginalMember(owner = "client!ba", name = "rb", descriptor = "I")
	public static int anInt298 = 0;

	@OriginalMember(owner = "client!ba", name = "sb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_138 = aClass65_135;

	@OriginalMember(owner = "client!ba", name = "ub", descriptor = "Lclient!wb;")
	public static Class65 aClass65_139 = aClass65_137;

	@OriginalMember(owner = "client!ba", name = "Bb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_141 = Static24.method441("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ba", name = "vb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_140 = aClass65_141;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!qa;I)V")
	public static void method145(@OriginalArg(1) Class2_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub11 local15 = (Class2_Sub11) Static76.aClass52_9.method1587();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt1243; local22++) {
				if (local15.aClass20Array2[local22] != null) {
					if (local15.aClass20Array2[local22].anInt1156 == 2) {
						local15.anIntArray165[local22] = -5;
					}
					if (local15.aClass20Array2[local22].anInt1156 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass20Array1[local22] != null) {
					if (local15.aClass20Array1[local22].anInt1156 == 2) {
						local15.anIntArray165[local22] = -6;
					}
					if (local15.aClass20Array1[local22].anInt1156 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1425(10);
			arg0.method1375(0);
			@Pc(104) int local104 = arg0.anInt2342;
			arg0.method1370(local15.anInt1241);
			for (@Pc(111) int local111 = 0; local111 < local15.anInt1243; local111++) {
				if (local15.anIntArray165[local111] == 0) {
					try {
						@Pc(132) int local132 = local15.anIntArray163[local111];
						@Pc(149) Field local149;
						@Pc(175) int local175;
						if (local132 == 0) {
							local149 = (Field) local15.aClass20Array2[local111].anObject4;
							local175 = local149.getInt(null);
							arg0.method1375(0);
							arg0.method1370(local175);
						} else if (local132 == 1) {
							local149 = (Field) local15.aClass20Array2[local111].anObject4;
							local149.setInt(null, local15.anIntArray162[local111]);
							arg0.method1375(0);
						} else if (local132 == 2) {
							local149 = (Field) local15.aClass20Array2[local111].anObject4;
							local175 = local149.getModifiers();
							arg0.method1375(0);
							arg0.method1370(local175);
						}
						@Pc(221) Method local221;
						if (local132 == 3) {
							@Pc(239) byte[][] local239 = local15.aByteArrayArrayArray5[local111];
							local221 = (Method) local15.aClass20Array1[local111].anObject4;
							@Pc(250) Object[] local250 = new Object[local239.length];
							for (@Pc(252) int local252 = 0; local252 < local239.length; local252++) {
								@Pc(264) ObjectInputStream local264 = new ObjectInputStream(new ByteArrayInputStream(local239[local252]));
								local250[local252] = local264.readObject();
							}
							@Pc(279) Object local279 = local221.invoke(null, local250);
							if (local279 == null) {
								arg0.method1375(0);
							} else if (local279 instanceof Number) {
								arg0.method1375(1);
								arg0.method1389(((Number) local279).longValue());
							} else if (local279 instanceof Class65) {
								arg0.method1375(2);
								arg0.method1417((Class65) local279);
							} else {
								arg0.method1375(4);
							}
						} else if (local132 == 4) {
							local221 = (Method) local15.aClass20Array1[local111].anObject4;
							local175 = local221.getModifiers();
							arg0.method1375(0);
							arg0.method1370(local175);
						}
					} catch (@Pc(322) ClassNotFoundException local322) {
						arg0.method1375(-10);
					} catch (@Pc(328) InvalidClassException local328) {
						arg0.method1375(-11);
					} catch (@Pc(334) StreamCorruptedException local334) {
						arg0.method1375(-12);
					} catch (@Pc(340) OptionalDataException local340) {
						arg0.method1375(-13);
					} catch (@Pc(346) IllegalAccessException local346) {
						arg0.method1375(-14);
					} catch (@Pc(352) IllegalArgumentException local352) {
						arg0.method1375(-15);
					} catch (@Pc(358) InvocationTargetException local358) {
						arg0.method1375(-16);
					} catch (@Pc(364) SecurityException local364) {
						arg0.method1375(-17);
					} catch (@Pc(370) IOException local370) {
						arg0.method1375(-18);
					} catch (@Pc(376) NullPointerException local376) {
						arg0.method1375(-19);
					} catch (@Pc(382) Exception local382) {
						arg0.method1375(-20);
					} catch (@Pc(388) Throwable local388) {
						arg0.method1375(-21);
					}
				} else {
					arg0.method1375(local15.anIntArray165[local111]);
				}
			}
			arg0.method1407(local104);
			arg0.method1404(arg0.anInt2342 - local104);
			local15.method1794();
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
	public static void method149() {
		aByteArrayArrayArray2 = null;
		aByteArrayArrayArray3 = null;
		aClass65_139 = null;
		aClass65_136 = null;
		aClass65_137 = null;
		aClass65_141 = null;
		aClass65_138 = null;
		aClass65_140 = null;
		aClass15_9 = null;
		aClass65_135 = null;
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
	public static void method150() {
		Static79.aBoolean119 = true;
		Static42.method806();
		@Pc(24) boolean local24;
		if (Static89.anInt2549 != -1) {
			local24 = Static76.method1305(0, 0, -1, 1, Static89.anInt2549, 0, 190, 261);
			if (!local24) {
				Static19.aBoolean99 = true;
			}
		} else if (Static62.anIntArray253[Static37.anInt1223] != -1) {
			local24 = Static76.method1305(0, 0, -1, 1, Static62.anIntArray253[Static37.anInt1223], 0, 190, 261);
			if (!local24) {
				Static19.aBoolean99 = true;
			}
		}
		if (Static51.aBoolean83 && Static99.anInt2540 == 1) {
			if (Static59.anInt1817 == 1) {
				Static17.method362();
			} else {
				method153();
			}
		}
		Static98.method1697();
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
	public static void method151() {
		if (Static55.anInt1675 > 0) {
			Static47.method827();
		} else {
			Static76.method1307(40);
			Static9.aClass13_1 = Static41.aClass13_3;
			Static41.aClass13_3 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!sb;Ljava/awt/Component;B)V")
	public static void method152(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(8) Class31_Sub1 local8 = (Class31_Sub1) Class.forName("Class31_Sub1_Sub1").getDeclaredConstructor().newInstance();
			local8.method1185(arg0, 2048);
			Static68.aClass31_1 = local8;
		} catch (@Pc(23) Throwable local23) {
			try {
				Static68.aClass31_1 = new Class31_Sub1_Sub2(arg0, arg1);
			} catch (@Pc(31) Throwable local31) {
				if (Static94.aString4.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static68.aClass31_1 = new Class31_Sub2();
						return;
					} catch (@Pc(45) Throwable local45) {
					}
				}
				Static68.aClass31_1 = new Class31(8000);
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(Z)V")
	public static void method153() {
		@Pc(3) int local3 = Static61.anInt1849;
		@Pc(9) int local9 = Static16.anInt489;
		@Pc(11) int local11 = Static101.anInt2788;
		@Pc(15) int local15 = Static32.anInt1055;
		Static43.method1815(local9, local3, local11, local15, 6116423);
		Static43.method1815(local9 + 1, local3 + 1, local11 - 2, 16, 0);
		Static43.method1806(local9 + 1, local3 - -18, local11 - 2, local15 - 19, 0);
		Static38.aClass2_Sub1_Sub4_Sub4_1.method1828(Static17.aClass65_268, local9 + 3, local3 + 14, 6116423);
		@Pc(59) int local59 = Static16.anInt480;
		@Pc(61) int local61 = Static85.anInt2459;
		if (Static99.anInt2540 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static99.anInt2540 == 1) {
			local61 -= 205;
			local59 -= 553;
		}
		if (Static99.anInt2540 == 2) {
			local59 -= 17;
			local61 -= 357;
		}
		for (@Pc(84) int local84 = 0; local84 < Static24.anInt719; local84++) {
			@Pc(98) int local98 = (Static24.anInt719 - local84 - 1) * 15 + local3 + 31;
			@Pc(100) int local100 = 16777215;
			if (local59 > local9 && local9 + local11 > local59 && local61 > local98 - 13 && local98 + 3 > local61) {
				local100 = 16776960;
			}
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1826(Static89.aClass65Array12[local84], local9 + 3, local98, local100, true);
		}
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V")
	public static void method154() {
		for (@Pc(3) int local3 = 0; local3 < Static51.anInt1482; local3++) {
			@Pc(16) int local16 = Static23.anIntArray92[local3];
			@Pc(20) Class2_Sub1_Sub1_Sub2_Sub1 local20 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local16];
			if (local20 != null) {
				Static110.method1846(local20.aClass2_Sub1_Sub11_1.anInt2105, local20);
			}
		}
	}
}
