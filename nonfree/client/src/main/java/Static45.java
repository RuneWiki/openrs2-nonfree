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

public final class Static45 {

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	public static int anInt1601;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt1607;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_582 = Static56.method1206("attack");

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static int anInt1597 = 1;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!lc;")
	public static Class31 aClass31_583 = Static56.method1206("(U5");

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_584 = Static56.method1206("Select");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_585 = Static56.method1206("compass");

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
	public static int anInt1603 = -1;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[J")
	public static long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!eb;BI)V")
	public static void method1064(@OriginalArg(0) Class2_Sub6_Sub1 arg0) {
		while (true) {
			@Pc(17) Class2_Sub10 local17 = (Class2_Sub10) Static28.aClass36_3.method1365();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt1270; local24++) {
				if (local17.aClass59Array1[local24] != null) {
					if (local17.aClass59Array1[local24].anInt2608 == 2) {
						local17.anIntArray155[local24] = -5;
					}
					if (local17.aClass59Array1[local24].anInt2608 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass59Array2[local24] != null) {
					if (local17.aClass59Array2[local24].anInt2608 == 2) {
						local17.anIntArray155[local24] = -6;
					}
					if (local17.aClass59Array2[local24].anInt2608 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method684(149);
			arg0.method637(0);
			@Pc(101) int local101 = arg0.anInt952;
			arg0.method666(local17.anInt1275);
			for (@Pc(108) int local108 = 0; local108 < local17.anInt1270; local108++) {
				if (local17.anIntArray155[local108] == 0) {
					try {
						@Pc(132) int local132 = local17.anIntArray154[local108];
						@Pc(141) Field local141;
						@Pc(145) int local145;
						if (local132 == 0) {
							local141 = (Field) local17.aClass59Array1[local108].anObject5;
							local145 = local141.getInt(null);
							arg0.method637(0);
							arg0.method666(local145);
						} else if (local132 == 1) {
							local141 = (Field) local17.aClass59Array1[local108].anObject5;
							local141.setInt(null, local17.anIntArray156[local108]);
							arg0.method637(0);
						} else if (local132 == 2) {
							local141 = (Field) local17.aClass59Array1[local108].anObject5;
							local145 = local141.getModifiers();
							arg0.method637(0);
							arg0.method666(local145);
						}
						@Pc(218) Method local218;
						if (local132 == 3) {
							@Pc(211) byte[][] local211 = local17.aByteArrayArrayArray16[local108];
							local218 = (Method) local17.aClass59Array2[local108].anObject5;
							@Pc(222) Object[] local222 = new Object[local211.length];
							for (@Pc(224) int local224 = 0; local224 < local211.length; local224++) {
								@Pc(236) ObjectInputStream local236 = new ObjectInputStream(new ByteArrayInputStream(local211[local224]));
								local222[local224] = local236.readObject();
							}
							@Pc(251) Object local251 = local218.invoke(null, local222);
							if (local251 == null) {
								arg0.method637(0);
							} else if (local251 instanceof Number) {
								arg0.method637(1);
								arg0.method626(((Number) local251).longValue());
							} else if (local251 instanceof Class31) {
								arg0.method637(2);
								arg0.method654((Class31) local251);
							} else {
								arg0.method637(4);
							}
						} else if (local132 == 4) {
							local218 = (Method) local17.aClass59Array2[local108].anObject5;
							local145 = local218.getModifiers();
							arg0.method637(0);
							arg0.method666(local145);
						}
					} catch (@Pc(317) ClassNotFoundException local317) {
						arg0.method637(-10);
					} catch (@Pc(323) InvalidClassException local323) {
						arg0.method637(-11);
					} catch (@Pc(329) StreamCorruptedException local329) {
						arg0.method637(-12);
					} catch (@Pc(335) OptionalDataException local335) {
						arg0.method637(-13);
					} catch (@Pc(341) IllegalAccessException local341) {
						arg0.method637(-14);
					} catch (@Pc(347) IllegalArgumentException local347) {
						arg0.method637(-15);
					} catch (@Pc(353) InvocationTargetException local353) {
						arg0.method637(-16);
					} catch (@Pc(359) SecurityException local359) {
						arg0.method637(-17);
					} catch (@Pc(365) IOException local365) {
						arg0.method637(-18);
					} catch (@Pc(371) NullPointerException local371) {
						arg0.method637(-19);
					} catch (@Pc(377) Exception local377) {
						arg0.method637(-20);
					} catch (@Pc(383) Throwable local383) {
						arg0.method637(-21);
					}
				} else {
					arg0.method637(local17.anIntArray155[local108]);
				}
			}
			arg0.method678(local101);
			arg0.method659(arg0.anInt952 - local101);
			local17.method1695();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!kc;BLclient!lc;Lclient!lc;)Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 method1065(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(13) int local13 = arg0.method345(arg1);
		@Pc(19) int local19 = arg0.method334(local13, arg2);
		return Static15.method430(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!kc;Lclient!kc;I)I")
	public static int method1066(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method330(Static7.aClass31_104, Static58.aClass31_688)) {
			local5++;
		}
		if (arg1.method330(Static58.aClass31_685, Static58.aClass31_688)) {
			local5++;
		}
		if (arg1.method330(Static88.aClass31_818, Static58.aClass31_688)) {
			local5++;
		}
		if (arg1.method330(Static91.aClass31_855, Static58.aClass31_688)) {
			local5++;
		}
		if (arg1.method330(Static83.aClass31_807, Static58.aClass31_688)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1067() {
		aClass31_584 = null;
		aClass31_582 = null;
		aLongArray4 = null;
		aClass31_585 = null;
		aClass31_583 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!kc;Lclient!kc;Lclient!kc;)V")
	public static void method1068(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static58.aClass11_11 = arg1;
		Static54.aClass11_9 = arg0;
		Static89.aClass11_20 = arg2;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB[BI)Z")
	public static boolean method1069(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class2_Sub6 local17 = new Class2_Sub6(arg1);
		@Pc(19) int local19 = -1;
		label65: while (true) {
			@Pc(23) int local23 = local17.method646();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(91) Class2_Sub1_Sub16 local91;
				do {
					@Pc(67) int local67;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method646();
										if (local39 == 0) {
											continue label65;
										}
										local17.method665();
									}
									local39 = local17.method646();
									if (local39 == 0) {
										continue label65;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local17.method665() >> 2;
									local67 = arg0 + local57;
									local72 = local51 + arg2;
								} while (local67 <= 0);
							} while (local72 <= 0);
						} while (local67 >= 103);
					} while (local72 >= 103);
					local91 = Static92.method1045(local19);
				} while (local63 == 22 && Static10.aBoolean28 && local91.anInt2722 == 0 && !local91.aBoolean146);
				local33 = true;
				if (!local91.method1712()) {
					local12 = false;
					Static95.anInt2563++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1070(@OriginalArg(0) Component arg0) {
		try {
			@Pc(5) Method local5 = Static84.aMethod1;
			if (local5 != null) {
				local5.invoke(arg0, Boolean.FALSE);
			}
		} catch (@Pc(19) Throwable local19) {
		}
		arg0.addKeyListener(Static13.aClass12_1);
		arg0.addFocusListener(Static13.aClass12_1);
	}
}
