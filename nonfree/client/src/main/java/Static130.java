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

public final class Static130 {

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Lclient!ie;")
	public static Class35 aClass35_12;

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
	public static int anInt1511;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_727 = Static9.method266("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!id;")
	private static Class34 aClass34_728 = Static9.method266("shake:");

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!id;")
	private static Class34 aClass34_733 = Static9.method266("glow3:");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!id;")
	public static Class34 aClass34_729 = aClass34_733;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_730 = aClass34_733;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!id;")
	private static Class34 aClass34_731 = Static9.method266("Select a world");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_732 = aClass34_728;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!id;")
	public static Class34 aClass34_734 = aClass34_728;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "Lclient!wd;")
	public static Class1_Sub19_Sub1 aClass1_Sub19_Sub1_5 = new Class1_Sub19_Sub1(5000);

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_735 = aClass34_731;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	public static int anInt1500 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!id;")
	public static Class34 aClass34_736 = Static9.method266("gr-Un:");

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
	public static int anInt1509 = 0;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "B")
	public static byte aByte5 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg0 < 1 || arg5 > 102 || arg0 > 102) {
			return;
		}
		if (Static21.aBoolean39 && Static42.anInt1208 != arg3) {
			return;
		}
		@Pc(32) int local32 = 0;
		if (arg2 == 0) {
			local32 = Static39.aClass44_1.method1145(arg3, arg5, arg0);
		}
		if (arg2 == 1) {
			local32 = Static39.aClass44_1.method1143(arg3, arg5, arg0);
		}
		if (arg2 == 2) {
			local32 = Static39.aClass44_1.method1156(arg3, arg5, arg0);
		}
		if (arg2 == 3) {
			local32 = Static39.aClass44_1.method1153(arg3, arg5, arg0);
		}
		@Pc(93) int local93;
		if (local32 != 0) {
			@Pc(86) int local86 = local32 >> 14 & 0x7FFF;
			local93 = Static39.aClass44_1.method1138(arg3, arg5, arg0, local32);
			@Pc(97) int local97 = local93 & 0x1F;
			@Pc(103) int local103 = local93 >> 6 & 0x3;
			@Pc(114) Class1_Sub1_Sub16 local114;
			if (arg2 == 0) {
				Static39.aClass44_1.method1136(arg3, arg5, arg0);
				local114 = Static28.method2008(local86);
				if (local114.anInt2971 != 0) {
					Static114.aClass58Array1[arg3].method1604(local97, arg0, local103, local114.aBoolean173, arg5);
				}
			}
			if (arg2 == 1) {
				Static39.aClass44_1.method1135(arg3, arg5, arg0);
			}
			if (arg2 == 2) {
				Static39.aClass44_1.method1163(arg3, arg5, arg0);
				local114 = Static28.method2008(local86);
				if (local114.anInt2962 + arg5 > 103 || local114.anInt2962 + arg0 > 103 || local114.anInt2946 + arg5 > 103 || arg0 + local114.anInt2946 > 103) {
					return;
				}
				if (local114.anInt2971 != 0) {
					Static114.aClass58Array1[arg3].method1596(local103, local114.anInt2946, arg0, local114.aBoolean173, local114.anInt2962, arg5);
				}
			}
			if (arg2 == 3) {
				Static39.aClass44_1.method1139(arg3, arg5, arg0);
				local114 = Static28.method2008(local86);
				if (local114.anInt2971 == 1) {
					Static114.aClass58Array1[arg3].method1605(arg5, arg0);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		local93 = arg3;
		if (arg3 < 3 && (Static105.aByteArrayArrayArray9[1][arg5][arg0] & 0x2) == 2) {
			local93 = arg3 + 1;
		}
		Static9.method267(arg4, local93, arg3, arg0, arg1, arg6, Static39.aClass44_1, Static114.aClass58Array1[arg3], arg5);
		return;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!wd;I)V")
	public static void method928(@OriginalArg(1) Class1_Sub19_Sub1 arg0) {
		while (true) {
			@Pc(14) Class1_Sub2 local14 = (Class1_Sub2) Static97.aClass38_21.method1034();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt439; local21++) {
				if (local14.aClass73Array1[local21] != null) {
					if (local14.aClass73Array1[local21].anInt2813 == 2) {
						local14.anIntArray32[local21] = -5;
					}
					if (local14.aClass73Array1[local21].anInt2813 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass73Array2[local21] != null) {
					if (local14.aClass73Array2[local21].anInt2813 == 2) {
						local14.anIntArray32[local21] = -6;
					}
					if (local14.aClass73Array2[local21].anInt2813 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2105(71);
			arg0.method2061(0);
			@Pc(104) int local104 = arg0.anInt3111;
			arg0.method2062(local14.anInt437);
			for (@Pc(111) int local111 = 0; local111 < local14.anInt439; local111++) {
				if (local14.anIntArray32[local111] == 0) {
					try {
						@Pc(135) int local135 = local14.anIntArray33[local111];
						@Pc(150) Field local150;
						@Pc(153) int local153;
						if (local135 == 0) {
							local150 = (Field) local14.aClass73Array1[local111].anObject4;
							local153 = local150.getInt(null);
							arg0.method2061(0);
							arg0.method2062(local153);
						} else if (local135 == 1) {
							local150 = (Field) local14.aClass73Array1[local111].anObject4;
							local150.setInt(null, local14.anIntArray34[local111]);
							arg0.method2061(0);
						} else if (local135 == 2) {
							local150 = (Field) local14.aClass73Array1[local111].anObject4;
							local153 = local150.getModifiers();
							arg0.method2061(0);
							arg0.method2062(local153);
						}
						@Pc(217) Method local217;
						if (local135 == 3) {
							local217 = (Method) local14.aClass73Array2[local111].anObject4;
							@Pc(242) byte[][] local242 = local14.aByteArrayArrayArray4[local111];
							@Pc(246) Object[] local246 = new Object[local242.length];
							for (@Pc(248) int local248 = 0; local248 < local242.length; local248++) {
								@Pc(260) ObjectInputStream local260 = new ObjectInputStream(new ByteArrayInputStream(local242[local248]));
								local246[local248] = local260.readObject();
							}
							@Pc(275) Object local275 = local217.invoke(null, local246);
							if (local275 == null) {
								arg0.method2061(0);
							} else if (local275 instanceof Number) {
								arg0.method2061(1);
								arg0.method2073(((Number) local275).longValue());
							} else if (local275 instanceof Class34) {
								arg0.method2061(2);
								arg0.method2050((Class34) local275);
							} else {
								arg0.method2061(4);
							}
						} else if (local135 == 4) {
							local217 = (Method) local14.aClass73Array2[local111].anObject4;
							local153 = local217.getModifiers();
							arg0.method2061(0);
							arg0.method2062(local153);
						}
					} catch (@Pc(318) ClassNotFoundException local318) {
						arg0.method2061(-10);
					} catch (@Pc(324) InvalidClassException local324) {
						arg0.method2061(-11);
					} catch (@Pc(330) StreamCorruptedException local330) {
						arg0.method2061(-12);
					} catch (@Pc(336) OptionalDataException local336) {
						arg0.method2061(-13);
					} catch (@Pc(342) IllegalAccessException local342) {
						arg0.method2061(-14);
					} catch (@Pc(348) IllegalArgumentException local348) {
						arg0.method2061(-15);
					} catch (@Pc(354) InvocationTargetException local354) {
						arg0.method2061(-16);
					} catch (@Pc(360) SecurityException local360) {
						arg0.method2061(-17);
					} catch (@Pc(366) IOException local366) {
						arg0.method2061(-18);
					} catch (@Pc(372) NullPointerException local372) {
						arg0.method2061(-19);
					} catch (@Pc(378) Exception local378) {
						arg0.method2061(-20);
					} catch (@Pc(384) Throwable local384) {
						arg0.method2061(-21);
					}
				} else {
					arg0.method2061(local14.anIntArray32[local111]);
				}
			}
			arg0.method2094(local104);
			arg0.method2087(arg0.anInt3111 - local104);
			local14.method2039();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method934(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub7 local10 = (Class1_Sub7) Static14.aClass48_2.method1340((long) arg0);
		if (local10 != null) {
			local10.method2039();
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public static void method937() {
		aClass35_12 = null;
		aClass34_734 = null;
		aClass34_736 = null;
		aClass34_733 = null;
		aClass34_729 = null;
		aClass34_735 = null;
		aClass34_731 = null;
		aClass34_728 = null;
		aClass34_727 = null;
		aClass34_732 = null;
		aClass1_Sub19_Sub1_5 = null;
		aClass34_730 = null;
	}
}
