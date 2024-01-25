import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public static int anInt535 = -50;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "[I")
	public static final int[] anIntArray43 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "[I")
	public static final int[] anIntArray44 = new int[14];

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "F")
	public static float aFloat7 = 0.0F;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method446(@OriginalArg(0) long arg0) {
		Static235.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static235.aCalendar2.get(7);
		@Pc(17) int local17 = Static235.aCalendar2.get(5);
		@Pc(26) int local26 = Static235.aCalendar2.get(2);
		@Pc(30) int local30 = Static235.aCalendar2.get(1);
		@Pc(34) int local34 = Static235.aCalendar2.get(11);
		@Pc(38) int local38 = Static235.aCalendar2.get(12);
		@Pc(42) int local42 = Static235.aCalendar2.get(13);
		return Static349.aStringArray40[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static296.aStringArray33[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIII)I")
	public static int method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(18) int local18 = arg5 & 0x3;
		if (local18 == 0) {
			return arg1;
		} else if (local18 == 1) {
			return arg2;
		} else if (local18 == 2) {
			return 1 + 7 - arg3 - arg1;
		} else {
			return 7 + 1 - arg2 - arg4;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method448(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static153.method2172(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static426.method3627(local7);
			local7 = Static324.method4280(":", "%3a", local7);
			local7 = Static324.method4280("@", "%40", local7);
			local7 = Static324.method4280("&", "%26", local7);
			local7 = Static324.method4280("#", "%23", local7);
			if (Static43.aClass196_6.anApplet1 != null) {
				@Pc(99) Class45 local99 = Static43.aClass196_6.method3900(new URL(Static43.aClass196_6.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static413.anInt6988 + "&u=" + Static182.aLong93 + "&v1=" + Static300.aString45 + "&v2=" + Static300.aString51 + "&e=" + local7));
				while (local99.anInt1129 == 0) {
					Static435.method5777(1L);
				}
				if (local99.anInt1129 == 1) {
					@Pc(118) DataInputStream local118 = (DataInputStream) local99.anObject5;
					local118.read();
					local118.close();
				}
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILclient!tf;)V")
	public static void method449(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9_Sub2 arg1) {
		while (true) {
			@Pc(15) Class4_Sub41 local15 = (Class4_Sub41) Static298.aClass244_27.method5263();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt7077; local22++) {
				if (local15.aClass45Array1[local22] != null) {
					if (local15.aClass45Array1[local22].anInt1129 == 2) {
						local15.anIntArray533[local22] = -5;
					}
					if (local15.aClass45Array1[local22].anInt1129 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass45Array2[local22] != null) {
					if (local15.aClass45Array2[local22].anInt1129 == 2) {
						local15.anIntArray533[local22] = -6;
					}
					if (local15.aClass45Array2[local22].anInt1129 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method5078(arg0);
			arg1.method4999(0);
			@Pc(107) int local107 = arg1.anInt6207;
			arg1.method5047(local15.anInt7079);
			for (@Pc(114) int local114 = 0; local114 < local15.anInt7077; local114++) {
				if (local15.anIntArray533[local114] == 0) {
					try {
						@Pc(135) int local135 = local15.anIntArray535[local114];
						@Pc(149) Field local149;
						@Pc(175) int local175;
						if (local135 == 0) {
							local149 = (Field) local15.aClass45Array1[local114].anObject5;
							local175 = local149.getInt(null);
							arg1.method4999(0);
							arg1.method5047(local175);
						} else if (local135 == 1) {
							local149 = (Field) local15.aClass45Array1[local114].anObject5;
							local149.setInt(null, local15.anIntArray534[local114]);
							arg1.method4999(0);
						} else if (local135 == 2) {
							local149 = (Field) local15.aClass45Array1[local114].anObject5;
							local175 = local149.getModifiers();
							arg1.method4999(0);
							arg1.method5047(local175);
						}
						@Pc(216) Method local216;
						if (local135 == 3) {
							local216 = (Method) local15.aClass45Array2[local114].anObject5;
							@Pc(221) byte[][] local221 = local15.aByteArrayArrayArray17[local114];
							@Pc(225) Object[] local225 = new Object[local221.length];
							for (@Pc(227) int local227 = 0; local227 < local221.length; local227++) {
								@Pc(239) ObjectInputStream local239 = new ObjectInputStream(new ByteArrayInputStream(local221[local227]));
								local225[local227] = local239.readObject();
							}
							@Pc(258) Object local258 = local216.invoke(null, local225);
							if (local258 == null) {
								arg1.method4999(0);
							} else if (local258 instanceof Number) {
								arg1.method4999(1);
								arg1.method5030(((Number) local258).longValue());
							} else if (local258 instanceof String) {
								arg1.method4999(2);
								arg1.method5039((String) local258);
							} else {
								arg1.method4999(4);
							}
						} else if (local135 == 4) {
							local216 = (Method) local15.aClass45Array2[local114].anObject5;
							local175 = local216.getModifiers();
							arg1.method4999(0);
							arg1.method5047(local175);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg1.method4999(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg1.method4999(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg1.method4999(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg1.method4999(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg1.method4999(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg1.method4999(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg1.method4999(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg1.method4999(-17);
					} catch (@Pc(374) IOException local374) {
						arg1.method4999(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg1.method4999(-19);
					} catch (@Pc(386) Exception local386) {
						arg1.method4999(-20);
					} catch (@Pc(392) Throwable local392) {
						arg1.method4999(-21);
					}
				} else {
					arg1.method4999(local15.anIntArray533[local114]);
				}
			}
			arg1.method5006(local107);
			arg1.method5025(arg1.anInt6207 - local107);
			local15.method6059();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BZ)V")
	public static void method450(@OriginalArg(1) boolean arg0) {
		if (Static338.aClass152_4 != null) {
			Static338.aClass152_4.method2924();
			Static338.aClass152_4 = null;
		}
		Static166.anInt3041 = 0;
		Static297.method3871();
		Static382.method5075();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static409.aClass128Array1[local19].method2466();
		}
		Static284.method3714(false);
		System.gc();
		Static175.method2453();
		Static26.aBoolean37 = false;
		Static267.anInt4386 = -1;
		Static337.method4458(true);
		Static361.anInt627 = 0;
		Static366.anInt6052 = 0;
		Static365.anInt6047 = 0;
		Static267.anInt4402 = 0;
		Static34.anInt2146 = 0;
		for (@Pc(61) int local61 = 0; local61 < Static62.aClass133Array1.length; local61++) {
			Static62.aClass133Array1[local61] = null;
		}
		Static149.method2109();
		for (@Pc(80) int local80 = 0; local80 < 2048; local80++) {
			Static267.aClass8_Sub3_Sub1_Sub1Array1[local80] = null;
		}
		Static148.anInt2692 = 0;
		for (@Pc(96) int local96 = 0; local96 < 32768; local96++) {
			Static367.aClass8_Sub3_Sub1_Sub2Array1[local96] = null;
		}
		Static41.aClass67_2.method1431();
		Static425.method5718();
		Static318.anInt5169 = 0;
		Static52.aClass81_1.method1663();
		Static360.method4758();
		Static248.method3590();
		Static333.aLong166 = 0L;
		Static170.aClass4_Sub16_3 = null;
		if (arg0) {
			Static119.method4569(11);
			return;
		}
		Static119.method4569(2);
		try {
			Static467.method6000("loggedout", Static24.aClass196_1.anApplet1);
		} catch (@Pc(139) Throwable local139) {
		}
	}
}
