import java.awt.Frame;
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

public final class Static29 {

	@OriginalMember(owner = "client!d", name = "R", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_7;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "lb", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "mb", descriptor = "Ljava/lang/Class;")
	private static Class aClass2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "nb", descriptor = "Ljava/lang/Class;")
	private static Class aClass3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "ob", descriptor = "Ljava/lang/Class;")
	private static Class aClass4;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "pb", descriptor = "Ljava/lang/Class;")
	private static Class aClass5;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "qb", descriptor = "Ljava/lang/Class;")
	private static Class aClass6;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "rb", descriptor = "Ljava/lang/Class;")
	private static Class aClass7;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "sb", descriptor = "Ljava/lang/Class;")
	private static Class aClass8;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "tb", descriptor = "Ljava/lang/Class;")
	private static Class aClass9;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "ub", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "vb", descriptor = "Ljava/lang/Class;")
	private static Class aClass11;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "wb", descriptor = "Ljava/lang/Class;")
	private static Class aClass12;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "xb", descriptor = "Ljava/lang/Class;")
	private static Class aClass13;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "yb", descriptor = "Ljava/lang/Class;")
	private static Class aClass14;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "zb", descriptor = "Ljava/lang/Class;")
	private static Class aClass15;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Ab", descriptor = "Ljava/lang/Class;")
	private static Class aClass16;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Bb", descriptor = "Ljava/lang/Class;")
	private static Class aClass17;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Cb", descriptor = "Ljava/lang/Class;")
	private static Class aClass18;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Db", descriptor = "Ljava/lang/Class;")
	private static Class aClass19;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Eb", descriptor = "Ljava/lang/Class;")
	private static Class aClass20;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Fb", descriptor = "Ljava/lang/Class;")
	private static Class aClass21;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Gb", descriptor = "Ljava/lang/Class;")
	private static Class aClass22;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Hb", descriptor = "Ljava/lang/Class;")
	private static Class aClass23;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Ib", descriptor = "Ljava/lang/Class;")
	private static Class aClass24;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Jb", descriptor = "Ljava/lang/Class;")
	private static Class aClass25;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Kb", descriptor = "Ljava/lang/Class;")
	private static Class aClass26;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Lb", descriptor = "Ljava/lang/Class;")
	private static Class aClass27;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Mb", descriptor = "Ljava/lang/Class;")
	private static Class aClass28;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Nb", descriptor = "Ljava/lang/Class;")
	private static Class aClass29;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Ob", descriptor = "Ljava/lang/Class;")
	private static Class aClass30;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Pb", descriptor = "Ljava/lang/Class;")
	private static Class aClass31;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Qb", descriptor = "Ljava/lang/Class;")
	private static Class aClass32;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Rb", descriptor = "Ljava/lang/Class;")
	private static Class aClass33;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Sb", descriptor = "Ljava/lang/Class;")
	private static Class aClass34;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Tb", descriptor = "Ljava/lang/Class;")
	private static Class aClass35;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Ub", descriptor = "Ljava/lang/Class;")
	private static Class aClass36;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Vb", descriptor = "Ljava/lang/Class;")
	private static Class aClass37;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Wb", descriptor = "Ljava/lang/Class;")
	private static Class aClass38;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Xb", descriptor = "Ljava/lang/Class;")
	private static Class aClass39;

	// $FF: synthetic field
	@OriginalMember(owner = "client!d", name = "Yb", descriptor = "Ljava/lang/Class;")
	private static Class aClass40;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_225 = Static120.method1824("Loading sprites )2 ");

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_226 = Static120.method1824("_");

	@OriginalMember(owner = "client!d", name = "T", descriptor = "Lclient!rd;")
	public static Class80 aClass80_227 = aClass80_225;

	@OriginalMember(owner = "client!d", name = "X", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_228 = Static120.method1824("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
	public static int anInt735 = 0;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
	public static int anInt739 = 127;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_229 = Static120.method1824("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_230 = aClass80_228;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Ljava/lang/Class;")
	public static Class method487(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass1 == null ? (aClass1 = Class3_Sub5_Sub4.a("tb")) : aClass1;
		} else if (arg0 == 1) {
			return aClass2 == null ? (aClass2 = Class3_Sub5_Sub4.a("ji")) : aClass2;
		} else if (arg0 == 2) {
			return aClass3 == null ? (aClass3 = Class3_Sub5_Sub4.a("mh")) : aClass3;
		} else if (arg0 == 3) {
			return aClass4 == null ? (aClass4 = Class3_Sub5_Sub4.a("jg")) : aClass4;
		} else if (arg0 == 4) {
			return aClass5 == null ? (aClass5 = Class3_Sub5_Sub4.a("hh")) : aClass5;
		} else if (arg0 == 5) {
			return aClass6 == null ? (aClass6 = Class3_Sub5_Sub4.a("f")) : aClass6;
		} else if (arg0 == 6) {
			return aClass7 == null ? (aClass7 = Class3_Sub5_Sub4.a("q")) : aClass7;
		} else if (arg0 == 7) {
			return aClass8 == null ? (aClass8 = Class3_Sub5_Sub4.a("vg")) : aClass8;
		} else if (arg0 == 8) {
			return aClass9 == null ? (aClass9 = Class3_Sub5_Sub4.a("eg")) : aClass9;
		} else if (arg0 == 9) {
			return aClass10 == null ? (aClass10 = Class3_Sub5_Sub4.a("wc")) : aClass10;
		} else if (arg0 == 10) {
			return aClass11 == null ? (aClass11 = Class3_Sub5_Sub4.a("re")) : aClass11;
		} else if (arg0 == 11) {
			return aClass12 == null ? (aClass12 = Class3_Sub5_Sub4.a("cb")) : aClass12;
		} else if (arg0 == 12) {
			return aClass13 == null ? (aClass13 = Class3_Sub5_Sub4.a("qe")) : aClass13;
		} else if (arg0 == 13) {
			return aClass14 == null ? (aClass14 = Class3_Sub5_Sub4.a("va")) : aClass14;
		} else if (arg0 == 14) {
			return aClass15 == null ? (aClass15 = Class3_Sub5_Sub4.a("qi")) : aClass15;
		} else if (arg0 == 15) {
			return aClass16 == null ? (aClass16 = Class3_Sub5_Sub4.a("r")) : aClass16;
		} else if (arg0 == 16) {
			return aClass17 == null ? (aClass17 = Class3_Sub5_Sub4.a("od")) : aClass17;
		} else if (arg0 == 17) {
			return aClass18 == null ? (aClass18 = Class3_Sub5_Sub4.a("sh")) : aClass18;
		} else if (arg0 == 18) {
			return aClass19 == null ? (aClass19 = Class3_Sub5_Sub4.a("qa")) : aClass19;
		} else if (arg0 == 19) {
			return aClass20 == null ? (aClass20 = Class3_Sub5_Sub4.a("sc")) : aClass20;
		} else if (arg0 == 20) {
			return aClass21 == null ? (aClass21 = Class3_Sub5_Sub4.a("td")) : aClass21;
		} else if (arg0 == 21) {
			return aClass22 == null ? (aClass22 = Class3_Sub5_Sub4.a("gi")) : aClass22;
		} else if (arg0 == 22) {
			return aClass23 == null ? (aClass23 = Class3_Sub5_Sub4.a("la")) : aClass23;
		} else if (arg0 == 23) {
			return aClass24 == null ? (aClass24 = Class3_Sub5_Sub4.a("gd")) : aClass24;
		} else if (arg0 == 24) {
			return aClass25 == null ? (aClass25 = Class3_Sub5_Sub4.a("p")) : aClass25;
		} else if (arg0 == 25) {
			return aClass26 == null ? (aClass26 = Class3_Sub5_Sub4.a("tf")) : aClass26;
		} else if (arg0 == 26) {
			return aClass27 == null ? (aClass27 = Class3_Sub5_Sub4.a("vb")) : aClass27;
		} else if (arg0 == 27) {
			return aClass28 == null ? (aClass28 = Class3_Sub5_Sub4.a("qd")) : aClass28;
		} else if (arg0 == 28) {
			return aClass29 == null ? (aClass29 = Class3_Sub5_Sub4.a("he")) : aClass29;
		} else if (arg0 == 29) {
			return aClass30 == null ? (aClass30 = Class3_Sub5_Sub4.a("i")) : aClass30;
		} else if (arg0 == 30) {
			return aClass31 == null ? (aClass31 = Class3_Sub5_Sub4.a("bi")) : aClass31;
		} else if (arg0 == 31) {
			return aClass32 == null ? (aClass32 = Class3_Sub5_Sub4.a("hd")) : aClass32;
		} else if (arg0 == 32) {
			return aClass33 == null ? (aClass33 = Class3_Sub5_Sub4.a("d")) : aClass33;
		} else if (arg0 == 33) {
			return aClass34 == null ? (aClass34 = Class3_Sub5_Sub4.a("ch")) : aClass34;
		} else if (arg0 == 34) {
			return aClass35 == null ? (aClass35 = Class3_Sub5_Sub4.a("wh")) : aClass35;
		} else if (arg0 == 35) {
			return aClass36 == null ? (aClass36 = Class3_Sub5_Sub4.a("si")) : aClass36;
		} else if (arg0 == 36) {
			return aClass37 == null ? (aClass37 = Class3_Sub5_Sub4.a("ue")) : aClass37;
		} else if (arg0 == 37) {
			return aClass38 == null ? (aClass38 = Class3_Sub5_Sub4.a("gb")) : aClass38;
		} else if (arg0 == 38) {
			return aClass39 == null ? (aClass39 = Class3_Sub5_Sub4.a("mf")) : aClass39;
		} else if (arg0 == 39) {
			return aClass40 == null ? (aClass40 = Class3_Sub5_Sub4.a("kd")) : aClass40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
	public static void method489() {
		@Pc(1) Object local1 = Static56.anObject2;
		synchronized (Static56.anObject2) {
			if (Static149.anInt3347 == 0) {
				Static58.aClass61_1.method1792(5, new Class35());
			}
			Static149.anInt3347 = 600;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
	public static void method491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static188.method3068(arg0)) {
			Static7.method158(arg1, Static57.aClass77ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!pf;II)V")
	public static void method492(@OriginalArg(0) Class3_Sub17_Sub1 arg0) {
		while (true) {
			@Pc(17) Class3_Sub24 local17 = (Class3_Sub24) Static126.aClass70_17.method1953();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt3974; local24++) {
				if (local17.aClass94Array1[local24] != null) {
					if (local17.aClass94Array1[local24].anInt4472 == 2) {
						local17.anIntArray478[local24] = -5;
					}
					if (local17.aClass94Array1[local24].anInt4472 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass94Array2[local24] != null) {
					if (local17.aClass94Array2[local24].anInt4472 == 2) {
						local17.anIntArray478[local24] = -6;
					}
					if (local17.aClass94Array2[local24].anInt4472 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method2146(108);
			arg0.method2108(0);
			@Pc(102) int local102 = arg0.anInt2923;
			arg0.method2131(local17.anInt3977);
			for (@Pc(109) int local109 = 0; local109 < local17.anInt3974; local109++) {
				if (local17.anIntArray478[local109] == 0) {
					try {
						@Pc(130) int local130 = local17.anIntArray480[local109];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local130 == 0) {
							local142 = (Field) local17.aClass94Array1[local109].anObject3;
							local146 = local142.getInt(null);
							arg0.method2108(0);
							arg0.method2131(local146);
						} else if (local130 == 1) {
							local142 = (Field) local17.aClass94Array1[local109].anObject3;
							local142.setInt(null, local17.anIntArray479[local109]);
							arg0.method2108(0);
						} else if (local130 == 2) {
							local142 = (Field) local17.aClass94Array1[local109].anObject3;
							local146 = local142.getModifiers();
							arg0.method2108(0);
							arg0.method2131(local146);
						}
						@Pc(212) Method local212;
						if (local130 == 3) {
							local212 = (Method) local17.aClass94Array2[local109].anObject3;
							@Pc(217) byte[][] local217 = local17.aByteArrayArrayArray6[local109];
							@Pc(221) Object[] local221 = new Object[local217.length];
							for (@Pc(223) int local223 = 0; local223 < local217.length; local223++) {
								@Pc(235) ObjectInputStream local235 = new ObjectInputStream(new ByteArrayInputStream(local217[local223]));
								local221[local223] = local235.readObject();
							}
							@Pc(254) Object local254 = local212.invoke(null, local221);
							if (local254 == null) {
								arg0.method2108(0);
							} else if (local254 instanceof Number) {
								arg0.method2108(1);
								arg0.method2112(((Number) local254).longValue());
							} else if (local254 instanceof Class80) {
								arg0.method2108(2);
								arg0.method2130((Class80) local254);
							} else {
								arg0.method2108(4);
							}
						} else if (local130 == 4) {
							local212 = (Method) local17.aClass94Array2[local109].anObject3;
							local146 = local212.getModifiers();
							arg0.method2108(0);
							arg0.method2131(local146);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method2108(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method2108(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method2108(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method2108(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method2108(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method2108(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method2108(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method2108(-17);
					} catch (@Pc(374) IOException local374) {
						arg0.method2108(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method2108(-19);
					} catch (@Pc(386) Exception local386) {
						arg0.method2108(-20);
					} catch (@Pc(392) Throwable local392) {
						arg0.method2108(-21);
					}
				} else {
					arg0.method2108(local17.anIntArray478[local109]);
				}
			}
			arg0.method2128(local102);
			arg0.method2142(arg0.anInt2923 - local102);
			local17.method3159();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIIII)V")
	public static void method493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) long local10 = Static11.method218(arg1, arg3, arg4);
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(49) int local49;
		@Pc(44) int local44;
		@Pc(62) int local62;
		if (local10 != 0L) {
			local23 = (int) local10 >> 20 & 0x3;
			local30 = (int) local10 >> 14 & 0x1F;
			local44 = arg3 * 4 + 4 * 512 * (103 - arg4) + 24624;
			@Pc(47) int[] local47 = Static27.aClass3_Sub1_Sub4_Sub4_41.anIntArray449;
			local49 = arg2;
			if (local10 > 0L) {
				local49 = arg0;
			}
			local62 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(66) Class3_Sub1_Sub1 local66 = Static162.method2627(local62);
			if (local66.anInt164 == -1) {
				if (local30 == 0 || local30 == 2) {
					if (local23 == 0) {
						local47[local44] = local49;
						local47[local44 + 512] = local49;
						local47[local44 + 1024] = local49;
						local47[local44 + 1536] = local49;
					} else if (local23 == 1) {
						local47[local44] = local49;
						local47[local44 + 1] = local49;
						local47[local44 + 2] = local49;
						local47[local44 + 3] = local49;
					} else if (local23 == 2) {
						local47[local44 + 3] = local49;
						local47[local44 + 3 + 512] = local49;
						local47[local44 + 1027] = local49;
						local47[local44 + 1536 + 3] = local49;
					} else if (local23 == 3) {
						local47[local44 + 1536] = local49;
						local47[local44 + 1537] = local49;
						local47[local44 + 2 + 1536] = local49;
						local47[local44 + 1539] = local49;
					}
				}
				if (local30 == 3) {
					if (local23 == 0) {
						local47[local44] = local49;
					} else if (local23 == 1) {
						local47[local44 + 3] = local49;
					} else if (local23 == 2) {
						local47[local44 + 1536 + 3] = local49;
					} else if (local23 == 3) {
						local47[local44 + 1536] = local49;
					}
				}
				if (local30 == 2) {
					if (local23 == 3) {
						local47[local44] = local49;
						local47[local44 + 512] = local49;
						local47[local44 + 1024] = local49;
						local47[local44 + 1536] = local49;
					} else if (local23 == 0) {
						local47[local44] = local49;
						local47[local44 + 1] = local49;
						local47[local44 + 2] = local49;
						local47[local44 + 3] = local49;
					} else if (local23 == 1) {
						local47[local44 + 3] = local49;
						local47[local44 + 515] = local49;
						local47[local44 + 3 + 1024] = local49;
						local47[local44 + 1536 + 3] = local49;
					} else if (local23 == 2) {
						local47[local44 + 1536] = local49;
						local47[local44 + 1536 + 1] = local49;
						local47[local44 + 2 + 1536] = local49;
						local47[local44 + 3 + 1536] = local49;
					}
				}
			} else {
				@Pc(381) Class3_Sub1_Sub4_Sub1 local381 = Static125.aClass3_Sub1_Sub4_Sub1Array5[local66.anInt164];
				if (local381 != null) {
					@Pc(394) int local394 = (local66.anInt145 * 4 - local381.anInt819) / 2;
					@Pc(405) int local405 = (local66.anInt150 * 4 - local381.anInt818) / 2;
					local381.method567(local394 + arg3 * 4 + 48, (-arg4 + 104 - local66.anInt150) * 4 + 48 + local405);
				}
			}
		}
		local10 = Static56.method822(arg1, arg3, arg4);
		if (local10 != 0L) {
			local23 = (int) local10 >> 20 & 0x3;
			local30 = (int) local10 >> 14 & 0x1F;
			local49 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(463) Class3_Sub1_Sub1 local463 = Static162.method2627(local49);
			@Pc(496) int local496;
			if (local463.anInt164 != -1) {
				@Pc(472) Class3_Sub1_Sub4_Sub1 local472 = Static125.aClass3_Sub1_Sub4_Sub1Array5[local463.anInt164];
				if (local472 != null) {
					local62 = (local463.anInt145 * 4 - local472.anInt819) / 2;
					local496 = (local463.anInt150 * 4 - local472.anInt818) / 2;
					local472.method567(arg3 * 4 + local62 + 48, local496 + (-arg4 + 104 + -local463.anInt150) * 4 + 48);
				}
			} else if (local30 == 9) {
				@Pc(529) int[] local529 = Static27.aClass3_Sub1_Sub4_Sub4_41.anIntArray449;
				local44 = 15658734;
				if (local10 > 0L) {
					local44 = 15597568;
				}
				local496 = (52736 - arg4 * 512) * 4 + arg3 * 4 + 24624;
				if (local23 == 0 || local23 == 2) {
					local529[local496 + 1536] = local44;
					local529[local496 + 1024 + 1] = local44;
					local529[local496 + 512 + 2] = local44;
					local529[local496 + 3] = local44;
				} else {
					local529[local496] = local44;
					local529[local496 + 512 + 1] = local44;
					local529[local496 + 2 + 1024] = local44;
					local529[local496 + 1539] = local44;
				}
			}
		}
		local10 = Static31.method496(arg1, arg3, arg4);
		if (local10 == 0L) {
			return;
		}
		local23 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
		@Pc(640) Class3_Sub1_Sub1 local640 = Static162.method2627(local23);
		if (local640.anInt164 == -1) {
			return;
		}
		@Pc(649) Class3_Sub1_Sub4_Sub1 local649 = Static125.aClass3_Sub1_Sub4_Sub1Array5[local640.anInt164];
		if (local649 != null) {
			local44 = (local640.anInt150 * 4 - local649.anInt818) / 2;
			@Pc(673) int local673 = (local640.anInt145 * 4 - local649.anInt819) / 2;
			local649.method567(local673 + arg3 * 4 + 48, (-arg4 + 104 + -local640.anInt150) * 4 + 48 + local44);
			return;
		}
	}
}
