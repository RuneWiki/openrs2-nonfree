import java.awt.event.KeyEvent;
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

public final class Static61 {

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Lclient!sd;")
	public static Class60 aClass60_13;

	@OriginalMember(owner = "client!ga", name = "tb", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!ga", name = "Eb", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!ga", name = "mb", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[8];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZILclient!bh;)V")
	public static void method1071(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub4_Sub1 arg2) {
		@Pc(17) int local17;
		if ((arg1 & 0x1) != 0) {
			local17 = Static1.aClass1_Sub14_Sub1_43.method1752();
			@Pc(20) byte[] local20 = new byte[local17];
			@Pc(25) Class1_Sub14 local25 = new Class1_Sub14(local20);
			Static1.aClass1_Sub14_Sub1_43.method1725(local20, local17);
			Static2.aClass1_Sub14Array1[arg0] = local25;
			arg2.method378(local25);
		}
		if ((arg1 & 0x200) != 0) {
			arg2.anInt3958 = Static1.aClass1_Sub14_Sub1_43.method1752();
			arg2.anInt3947 = Static1.aClass1_Sub14_Sub1_43.method1722();
			arg2.anInt3952 = Static1.aClass1_Sub14_Sub1_43.method1722();
			arg2.anInt3948 = Static1.aClass1_Sub14_Sub1_43.method1738();
			arg2.anInt3963 = Static1.aClass1_Sub14_Sub1_43.method1704() + Static174.anInt3887;
			arg2.anInt3984 = Static1.aClass1_Sub14_Sub1_43.method1704() + Static174.anInt3887;
			arg2.anInt3949 = Static1.aClass1_Sub14_Sub1_43.method1722();
			arg2.anInt3951 = 1;
			arg2.anInt3953 = 0;
		}
		@Pc(112) int local112;
		if ((arg1 & 0x4) != 0) {
			local17 = Static1.aClass1_Sub14_Sub1_43.method1728();
			local112 = Static1.aClass1_Sub14_Sub1_43.method1752();
			arg2.method2993(Static174.anInt3887, local17, local112);
			arg2.anInt3985 = Static174.anInt3887 + 300;
			arg2.anInt3941 = Static1.aClass1_Sub14_Sub1_43.method1722();
		}
		if ((arg1 & 0x100) != 0) {
			local17 = Static1.aClass1_Sub14_Sub1_43.method1738();
			local112 = Static1.aClass1_Sub14_Sub1_43.method1728();
			arg2.method2993(Static174.anInt3887, local17, local112);
		}
		if ((arg1 & 0x80) != 0) {
			arg2.anInt3928 = Static1.aClass1_Sub14_Sub1_43.method1704();
			if (arg2.anInt3928 == 65535) {
				arg2.anInt3928 = -1;
			}
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt3966 = Static1.aClass1_Sub14_Sub1_43.method1749();
			arg2.anInt3944 = Static1.aClass1_Sub14_Sub1_43.method1704();
		}
		if ((arg1 & 0x2) != 0) {
			arg2.aClass65_2377 = Static1.aClass1_Sub14_Sub1_43.method1706();
			if (arg2.aClass65_2377.method2473(0) == 126) {
				arg2.aClass65_2377 = arg2.aClass65_2377.method2483(1);
				Static31.method603(2, arg2.aClass65_479, arg2.aClass65_2377);
			} else if (Static201.aClass6_Sub4_Sub1_3 == arg2) {
				Static31.method603(2, arg2.aClass65_479, arg2.aClass65_2377);
			}
			arg2.anInt3961 = 0;
			arg2.anInt3973 = 150;
			arg2.anInt3940 = 0;
		}
		if ((arg1 & 0x8) != 0) {
			local17 = Static1.aClass1_Sub14_Sub1_43.method1749();
			if (local17 == 65535) {
				local17 = -1;
			}
			local112 = Static1.aClass1_Sub14_Sub1_43.method1752();
			Static128.method2420(local112, arg2, local17);
		}
		if ((arg1 & 0x10) != 0) {
			local17 = Static1.aClass1_Sub14_Sub1_43.method1749();
			local112 = Static1.aClass1_Sub14_Sub1_43.method1752();
			@Pc(274) int local274 = Static1.aClass1_Sub14_Sub1_43.method1738();
			@Pc(277) int local277 = Static1.aClass1_Sub14_Sub1_43.anInt2306;
			if (arg2.aClass65_479 != null && arg2.aClass19_1 != null) {
				@Pc(288) long local288 = arg2.aClass65_479.method2475();
				@Pc(290) boolean local290 = false;
				if (local112 <= 1) {
					for (@Pc(297) int local297 = 0; local297 < Static29.anInt859; local297++) {
						if (Static197.aLongArray9[local297] == local288) {
							local290 = true;
							break;
						}
					}
				}
				if (!local290 && Static18.anInt456 == 0) {
					Static31.aClass1_Sub14_1.anInt2306 = 0;
					@Pc(327) int local327 = -1;
					Static1.aClass1_Sub14_Sub1_43.method1725(Static31.aClass1_Sub14_1.aByteArray29, local274);
					Static31.aClass1_Sub14_1.anInt2306 = 0;
					@Pc(345) boolean local345 = (local17 & 0x8000) != 0;
					@Pc(364) Class65 local364;
					if (local345) {
						local17 &= 0x7FFF;
						@Pc(355) Class69 local355 = Static68.method984(Static31.aClass1_Sub14_1);
						local327 = local355.anInt3416;
						local364 = local355.aClass1_Sub2_Sub24_1.method3207(Static31.aClass1_Sub14_1);
					} else {
						local364 = Static175.method1620(Static199.method3232(Static31.aClass1_Sub14_1).method2491());
					}
					arg2.aClass65_2377 = local364.method2466();
					arg2.anInt3961 = local17 & 0xFF;
					arg2.anInt3940 = local17 >> 8;
					arg2.anInt3973 = 150;
					if (local112 == 2) {
						method1078(local327, null, local345 ? 17 : 1, local364, Static109.method2004(new Class65[] { Static16.aClass65_319, arg2.aClass65_479 }));
					} else if (local112 == 1) {
						method1078(local327, null, local345 ? 17 : 1, local364, Static109.method2004(new Class65[] { Static193.aClass65_2484, arg2.aClass65_479 }));
					} else {
						method1078(local327, null, local345 ? 17 : 2, local364, arg2.aClass65_479);
					}
				}
			}
			Static1.aClass1_Sub14_Sub1_43.anInt2306 = local277 + local274;
		}
		if ((arg1 & 0x400) == 0) {
			return;
		}
		arg2.anInt3964 = Static1.aClass1_Sub14_Sub1_43.method1704();
		local17 = Static1.aClass1_Sub14_Sub1_43.method1700();
		arg2.anInt3960 = local17 >> 16;
		arg2.anInt3983 = Static174.anInt3887 + (local17 & 0xFFFF);
		arg2.anInt3977 = 0;
		if (Static174.anInt3887 < arg2.anInt3983) {
			arg2.anInt3977 = -1;
		}
		arg2.anInt3935 = 0;
		if (arg2.anInt3964 == 65535) {
			arg2.anInt3964 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1073(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!oc;IILclient!oc;Lclient!oc;)V")
	public static void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) Class65 arg4) {
		for (@Pc(1) int local1 = 99; local1 > 0; local1--) {
			Static46.anIntArray115[local1] = Static46.anIntArray115[local1 - 1];
			Static127.aClass65Array43[local1] = Static127.aClass65Array43[local1 - 1];
			Static28.aClass65Array11[local1] = Static28.aClass65Array11[local1 - 1];
			Static16.aClass65Array8[local1] = Static16.aClass65Array8[local1 - 1];
			Static86.anIntArray240[local1] = Static86.anIntArray240[local1 - 1];
		}
		Static156.anInt3582++;
		Static46.anIntArray115[0] = arg2;
		Static40.anInt1074 = Static1.anInt4459;
		Static86.anIntArray240[0] = arg0;
		Static127.aClass65Array43[0] = arg4;
		Static28.aClass65Array11[0] = arg3;
		Static16.aClass65Array8[0] = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!k;I)V")
	public static void method1081(@OriginalArg(1) Class1_Sub14_Sub1 arg0) {
		while (true) {
			@Pc(13) Class1_Sub4 local13 = (Class1_Sub4) Static147.aClass91_15.method3148();
			if (local13 == null) {
				return;
			}
			@Pc(18) boolean local18 = false;
			for (@Pc(20) int local20 = 0; local20 < local13.anInt458; local20++) {
				if (local13.aClass34Array1[local20] != null) {
					if (local13.aClass34Array1[local20].anInt1727 == 2) {
						local13.anIntArray51[local20] = -5;
					}
					if (local13.aClass34Array1[local20].anInt1727 == 0) {
						local18 = true;
					}
				}
				if (local13.aClass34Array2[local20] != null) {
					if (local13.aClass34Array2[local20].anInt1727 == 2) {
						local13.anIntArray51[local20] = -6;
					}
					if (local13.aClass34Array2[local20].anInt1727 == 0) {
						local18 = true;
					}
				}
			}
			if (local18) {
				return;
			}
			arg0.method1761(47);
			arg0.method1710(0);
			@Pc(101) int local101 = arg0.anInt2306;
			arg0.method1724(local13.anInt459);
			for (@Pc(108) int local108 = 0; local108 < local13.anInt458; local108++) {
				if (local13.anIntArray51[local108] == 0) {
					try {
						@Pc(130) int local130 = local13.anIntArray49[local108];
						@Pc(145) Field local145;
						@Pc(170) int local170;
						if (local130 == 0) {
							local145 = (Field) local13.aClass34Array1[local108].anObject1;
							local170 = local145.getInt(null);
							arg0.method1710(0);
							arg0.method1724(local170);
						} else if (local130 == 1) {
							local145 = (Field) local13.aClass34Array1[local108].anObject1;
							local145.setInt(null, local13.anIntArray50[local108]);
							arg0.method1710(0);
						} else if (local130 == 2) {
							local145 = (Field) local13.aClass34Array1[local108].anObject1;
							local170 = local145.getModifiers();
							arg0.method1710(0);
							arg0.method1724(local170);
						}
						@Pc(210) Method local210;
						if (local130 == 3) {
							local210 = (Method) local13.aClass34Array2[local108].anObject1;
							@Pc(215) byte[][] local215 = local13.aByteArrayArrayArray12[local108];
							@Pc(219) Object[] local219 = new Object[local215.length];
							for (@Pc(221) int local221 = 0; local221 < local215.length; local221++) {
								@Pc(232) ObjectInputStream local232 = new ObjectInputStream(new ByteArrayInputStream(local215[local221]));
								local219[local221] = local232.readObject();
							}
							@Pc(251) Object local251 = local210.invoke(null, local219);
							if (local251 == null) {
								arg0.method1710(0);
							} else if (local251 instanceof Number) {
								arg0.method1710(1);
								arg0.method1721(((Number) local251).longValue());
							} else if (local251 instanceof Class65) {
								arg0.method1710(2);
								arg0.method1742((Class65) local251);
							} else {
								arg0.method1710(4);
							}
						} else if (local130 == 4) {
							local210 = (Method) local13.aClass34Array2[local108].anObject1;
							local170 = local210.getModifiers();
							arg0.method1710(0);
							arg0.method1724(local170);
						}
					} catch (@Pc(313) ClassNotFoundException local313) {
						arg0.method1710(-10);
					} catch (@Pc(319) InvalidClassException local319) {
						arg0.method1710(-11);
					} catch (@Pc(325) StreamCorruptedException local325) {
						arg0.method1710(-12);
					} catch (@Pc(331) OptionalDataException local331) {
						arg0.method1710(-13);
					} catch (@Pc(337) IllegalAccessException local337) {
						arg0.method1710(-14);
					} catch (@Pc(343) IllegalArgumentException local343) {
						arg0.method1710(-15);
					} catch (@Pc(349) InvocationTargetException local349) {
						arg0.method1710(-16);
					} catch (@Pc(355) SecurityException local355) {
						arg0.method1710(-17);
					} catch (@Pc(361) IOException local361) {
						arg0.method1710(-18);
					} catch (@Pc(367) NullPointerException local367) {
						arg0.method1710(-19);
					} catch (@Pc(373) Exception local373) {
						arg0.method1710(-20);
					} catch (@Pc(379) Throwable local379) {
						arg0.method1710(-21);
					}
				} else {
					arg0.method1710(local13.anIntArray51[local108]);
				}
			}
			arg0.method1709(local101);
			arg0.method1697(arg0.anInt2306 - local101);
			local13.method3295();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
	public static boolean method1082(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
