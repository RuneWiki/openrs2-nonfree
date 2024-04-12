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

public final class Static63 {

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!ud;")
	public static Class5 aClass5_5;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Lclient!ud;")
	public static Class5 aClass5_6;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!p;")
	public static Class45 aClass45_8;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
	private static boolean aBoolean34;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 83)
	public static void method325() {
		aClass45_8 = null;
		Applet_Sub1.aClass40_103 = null;
		Applet_Sub1.aClass40_101 = null;
		aClass5_5 = null;
		Applet_Sub1.aClass40_107 = null;
		Applet_Sub1.aClass40_105 = null;
		Applet_Sub1.aClass40_104 = null;
		Applet_Sub1.aClass40_106 = null;
		Applet_Sub1.aClass40_102 = null;
		aClass5_6 = null;
		Applet_Sub1.aClass40_108 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZB[BII)V", line = 445)
	public static void method335(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Class34.anInt1548 >= 0) {
			Class30.anInt1175 = arg3;
			if (Class34.anInt1548 == 0) {
				Class15.anInt432 = 1;
			} else {
				@Pc(43) int local43 = Static40.method1248(Class34.anInt1548);
				@Pc(47) int local47 = local43 - Class2_Sub2_Sub16.anInt2474;
				Class15.anInt432 = (local47 + 3600) / arg3;
				if (Class15.anInt432 < 1) {
					Class15.anInt432 = 1;
				}
			}
			Static23.aByteArray9 = arg1;
			Static21.aBoolean185 = arg0;
			Static26.anInt685 = arg2;
		} else if (Class15.anInt432 == 0) {
			Static67.method1208(arg0, arg2, arg1);
		} else {
			Static23.aByteArray9 = arg1;
			Static26.anInt685 = arg2;
			Static21.aBoolean185 = arg0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!wc;BI)V", line = 523)
	public static void method337(@OriginalArg(0) Class2_Sub3_Sub1 arg0) {
		while (true) {
			@Pc(16) Class2_Sub12 local16 = (Class2_Sub12) Class63.aClass44_9.method1224();
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

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)Lclient!qb;", line = 719)
	public static Class2_Sub2_Sub2_Sub3 method338() {
		@Pc(3) Class2_Sub2_Sub2_Sub3 local3 = new Class2_Sub2_Sub2_Sub3();
		local3.anInt1909 = Static41.anInt1079;
		local3.anInt1908 = Static96.anInt2513;
		local3.anInt1907 = Static75.anIntArray430[0];
		local3.anInt1906 = Static89.anIntArray503[0];
		local3.anInt1905 = Static61.anIntArray338[0];
		local3.anInt1910 = Static18.anIntArray86[0];
		local3.anIntArray427 = Static19.anIntArray92;
		local3.aByteArray16 = Static83.aByteArrayArray10[0];
		Static85.method1485();
		return local3;
	}
}
