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

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	public static int anInt796;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	public static int anInt804;

	@OriginalMember(owner = "client!dc", name = "lb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_266 = Static177.method3050("New User");

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "Lclient!jd;")
	public static Class46 aClass46_262 = aClass46_266;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "Lclient!jd;")
	public static Class46 aClass46_263 = null;

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_264 = Static177.method3050("Neuer Benutzer");

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
	public static int anInt803 = 3;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array6 = new Class46[200];

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_265 = Static177.method3050(":chalreq:");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lclient!jd;")
	public static Class46 method523(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static69.method1482(new Class46[] { Static99.aClass46_902, Static127.method2240(arg0), Static159.aClass46_1313 });
		} else if (arg0 < 10000000) {
			return Static69.method1482(new Class46[] { Static175.aClass46_1430, Static127.method2240(arg0 / 1000), Static135.aClass46_1175, Static159.aClass46_1313 });
		} else {
			return Static69.method1482(new Class46[] { Static141.aClass46_1209, Static127.method2240(arg0 / 1000000), Static172.aClass46_1412, Static159.aClass46_1313 });
		}
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)Lclient!v;")
	public static Class4_Sub1_Sub18 method524() {
		if (Static59.aClass4_Sub1_Sub18_1 == null) {
			Static59.aClass4_Sub1_Sub18_1 = new Class4_Sub1_Sub18();
		}
		return Static59.aClass4_Sub1_Sub18_1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Z")
	public static boolean method526(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLclient!gh;)V")
	public static void method527(@OriginalArg(2) Class4_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(15) Class4_Sub20 local15 = (Class4_Sub20) Static14.aClass11_2.method274();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt3233; local22++) {
				if (local15.aClass84Array2[local22] != null) {
					if (local15.aClass84Array2[local22].anInt3578 == 2) {
						local15.anIntArray308[local22] = -5;
					}
					if (local15.aClass84Array2[local22].anInt3578 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass84Array1[local22] != null) {
					if (local15.aClass84Array1[local22].anInt3578 == 2) {
						local15.anIntArray308[local22] = -6;
					}
					if (local15.aClass84Array1[local22].anInt3578 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1285(113);
			arg0.method1238(0);
			@Pc(98) int local98 = arg0.anInt1597;
			arg0.method1256(local15.anInt3232);
			for (@Pc(105) int local105 = 0; local105 < local15.anInt3233; local105++) {
				if (local15.anIntArray308[local105] == 0) {
					try {
						@Pc(129) int local129 = local15.anIntArray310[local105];
						@Pc(141) Field local141;
						@Pc(145) int local145;
						if (local129 == 0) {
							local141 = (Field) local15.aClass84Array2[local105].anObject4;
							local145 = local141.getInt(null);
							arg0.method1238(0);
							arg0.method1256(local145);
						} else if (local129 == 1) {
							local141 = (Field) local15.aClass84Array2[local105].anObject4;
							local141.setInt(null, local15.anIntArray311[local105]);
							arg0.method1238(0);
						} else if (local129 == 2) {
							local141 = (Field) local15.aClass84Array2[local105].anObject4;
							local145 = local141.getModifiers();
							arg0.method1238(0);
							arg0.method1256(local145);
						}
						@Pc(214) Method local214;
						if (local129 == 3) {
							local214 = (Method) local15.aClass84Array1[local105].anObject4;
							@Pc(239) byte[][] local239 = local15.aByteArrayArrayArray7[local105];
							@Pc(243) Object[] local243 = new Object[local239.length];
							for (@Pc(245) int local245 = 0; local245 < local239.length; local245++) {
								@Pc(257) ObjectInputStream local257 = new ObjectInputStream(new ByteArrayInputStream(local239[local245]));
								local243[local245] = local257.readObject();
							}
							@Pc(272) Object local272 = local214.invoke(null, local243);
							if (local272 == null) {
								arg0.method1238(0);
							} else if (local272 instanceof Number) {
								arg0.method1238(1);
								arg0.method1269(((Number) local272).longValue());
							} else if (local272 instanceof Class46) {
								arg0.method1238(2);
								arg0.method1276((Class46) local272);
							} else {
								arg0.method1238(4);
							}
						} else if (local129 == 4) {
							local214 = (Method) local15.aClass84Array1[local105].anObject4;
							local145 = local214.getModifiers();
							arg0.method1238(0);
							arg0.method1256(local145);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg0.method1238(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg0.method1238(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg0.method1238(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg0.method1238(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg0.method1238(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg0.method1238(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg0.method1238(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg0.method1238(-17);
					} catch (@Pc(363) IOException local363) {
						arg0.method1238(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg0.method1238(-19);
					} catch (@Pc(375) Exception local375) {
						arg0.method1238(-20);
					} catch (@Pc(381) Throwable local381) {
						arg0.method1238(-21);
					}
				} else {
					arg0.method1238(local15.anIntArray308[local105]);
				}
			}
			arg0.method1257(local98);
			arg0.method1231(arg0.anInt1597 - local98);
			local15.method3173();
		}
	}
}
