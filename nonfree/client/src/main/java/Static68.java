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

public final class Static68 {

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!ud;")
	public static Class5 aClass5_5;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Lclient!ud;")
	public static Class5 aClass5_6;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!p;")
	public static Class45 aClass45_8;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
	private static boolean aBoolean34;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_101 = Static13.method257("mapmarker");

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt375 = 0;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_102 = Static13.method257("(U3");

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_103 = Static13.method257("Existing User");

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_104 = Static13.method257("This computers address has been blocked");

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_105 = Static13.method257("Imported maps");

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_106 = Static13.method257("Friends");

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public static int anInt390 = 0;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!o;")
	public static Class40 aClass40_107 = Static13.method257(" days ago");

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "Lclient!o;")
	public static Class40 aClass40_108 = Static13.method257("Message @whi@");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method325() {
		aClass45_8 = null;
		aClass40_103 = null;
		aClass40_101 = null;
		aClass5_5 = null;
		aClass40_107 = null;
		aClass40_105 = null;
		aClass40_104 = null;
		aClass40_106 = null;
		aClass40_102 = null;
		aClass5_6 = null;
		aClass40_108 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZB[BII)V")
	public static void method335(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static106.aClass12_1 == null) {
			return;
		}
		if (Static61.anInt1548 >= 0) {
			Static52.anInt1175 = arg3;
			if (Static61.anInt1548 == 0) {
				Static18.anInt432 = 1;
			} else {
				@Pc(43) int local43 = Static43.method1248(Static61.anInt1548);
				@Pc(47) int local47 = local43 - Static102.anInt2474;
				Static18.anInt432 = (local47 + 3600) / arg3;
				if (Static18.anInt432 < 1) {
					Static18.anInt432 = 1;
				}
			}
			Static24.aByteArray9 = arg1;
			Static22.aBoolean185 = arg0;
			Static27.anInt685 = arg2;
		} else if (Static18.anInt432 == 0) {
			Static73.method1208(arg0, arg2, arg1);
		} else {
			Static24.aByteArray9 = arg1;
			Static27.anInt685 = arg2;
			Static22.aBoolean185 = arg0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!wc;BI)V")
	public static void method337(@OriginalArg(0) Class2_Sub3_Sub1 arg0) {
		while (true) {
			@Pc(16) Class2_Sub12 local16 = (Class2_Sub12) Static104.aClass44_9.method1224();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.anInt2350; local23++) {
				if (local16.aClass48Array2[local23] != null) {
					if (local16.aClass48Array2[local23].anInt1928 == 2) {
						local16.anIntArray498[local23] = -5;
					}
					if (local16.aClass48Array2[local23].anInt1928 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass48Array1[local23] != null) {
					if (local16.aClass48Array1[local23].anInt1928 == 2) {
						local16.anIntArray498[local23] = -6;
					}
					if (local16.aClass48Array1[local23].anInt1928 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method1736(149);
			arg0.method1703(0);
			@Pc(97) int local97 = arg0.anInt2546;
			arg0.method1725(local16.anInt2355);
			for (@Pc(104) int local104 = 0; local104 < local16.anInt2350; local104++) {
				if (local16.anIntArray498[local104] == 0) {
					try {
						@Pc(125) int local125 = local16.anIntArray499[local104];
						@Pc(139) Field local139;
						@Pc(165) int local165;
						if (local125 == 0) {
							local139 = (Field) local16.aClass48Array2[local104].anObject4;
							local165 = local139.getInt(null);
							arg0.method1703(0);
							arg0.method1725(local165);
						} else if (local125 == 1) {
							local139 = (Field) local16.aClass48Array2[local104].anObject4;
							local139.setInt(null, local16.anIntArray502[local104]);
							arg0.method1703(0);
						} else if (local125 == 2) {
							local139 = (Field) local16.aClass48Array2[local104].anObject4;
							local165 = local139.getModifiers();
							arg0.method1703(0);
							arg0.method1725(local165);
						}
						@Pc(209) Method local209;
						if (local125 == 3) {
							local209 = (Method) local16.aClass48Array1[local104].anObject4;
							@Pc(234) byte[][] local234 = local16.aByteArrayArrayArray11[local104];
							@Pc(238) Object[] local238 = new Object[local234.length];
							for (@Pc(240) int local240 = 0; local240 < local234.length; local240++) {
								@Pc(252) ObjectInputStream local252 = new ObjectInputStream(new ByteArrayInputStream(local234[local240]));
								local238[local240] = local252.readObject();
							}
							@Pc(271) Object local271 = local209.invoke(null, local238);
							if (local271 == null) {
								arg0.method1703(0);
							} else if (local271 instanceof Number) {
								arg0.method1703(1);
								arg0.method1680(((Number) local271).longValue());
							} else if (local271 instanceof Class40) {
								arg0.method1703(2);
								arg0.method1683((Class40) local271);
							} else {
								arg0.method1703(4);
							}
						} else if (local125 == 4) {
							local209 = (Method) local16.aClass48Array1[local104].anObject4;
							local165 = local209.getModifiers();
							arg0.method1703(0);
							arg0.method1725(local165);
						}
					} catch (@Pc(318) ClassNotFoundException local318) {
						arg0.method1703(-10);
					} catch (@Pc(324) InvalidClassException local324) {
						arg0.method1703(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method1703(-12);
					} catch (@Pc(340) OptionalDataException local340) {
						arg0.method1703(-13);
					} catch (@Pc(346) IllegalAccessException local346) {
						arg0.method1703(-14);
					} catch (@Pc(352) IllegalArgumentException local352) {
						arg0.method1703(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method1703(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method1703(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method1703(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method1703(-19);
					} catch (@Pc(386) Exception local386) {
						arg0.method1703(-20);
					} catch (@Pc(392) Throwable local392) {
						arg0.method1703(-21);
					}
				} else {
					arg0.method1703(local16.anIntArray498[local104]);
				}
			}
			arg0.method1687(local97);
			arg0.method1731(arg0.anInt2546 - local97);
			local16.method1677();
		}
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 method338() {
		@Pc(3) Class2_Sub2_Sub2_Sub3 local3 = new Class2_Sub2_Sub2_Sub3();
		local3.anInt1909 = Static44.anInt1079;
		local3.anInt1908 = Static104.anInt2513;
		local3.anInt1907 = Static83.anIntArray430[0];
		local3.anInt1906 = Static97.anIntArray503[0];
		local3.anInt1905 = Static66.anIntArray338[0];
		local3.anInt1910 = Static19.anIntArray86[0];
		local3.anIntArray427 = Static20.anIntArray92;
		local3.aByteArray16 = Static91.aByteArrayArray10[0];
		Static93.method1485();
		return local3;
	}
}
