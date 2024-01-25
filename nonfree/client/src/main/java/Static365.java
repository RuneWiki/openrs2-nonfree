import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "Lclient!wj;")
	public static Class265 aClass265_139;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_138 = new Class265(81, 3);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)V")
	public static void method4986(@OriginalArg(0) int arg0) {
		if (Static162.anInt3250 == arg0) {
			return;
		}
		if (Static162.anInt3250 == 0) {
			Static41.method649();
		}
		if (arg0 == 40) {
			Static54.method892();
		}
		if (arg0 != 40 && Static378.aClass34_3 != null) {
			Static378.aClass34_3.method610();
			Static378.aClass34_3 = null;
		}
		if (Static162.anInt3250 == 25 || Static162.anInt3250 == 28) {
			Static49.aClass160_6.anInt4623 = 2;
			Static395.aClass160_76.anInt4623 = 2;
			Static331.aClass160_65.anInt4623 = 2;
			Static234.aClass160_47.anInt4623 = 2;
			Static138.aClass160_20.anInt4623 = 2;
			Static217.aClass160_40.anInt4623 = 2;
			Static146.aClass160_23.anInt4623 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static296.anInt5296 = 1;
			Static416.anInt6986 = 0;
			Static18.anInt7350 = 1;
			Static11.anInt282 = 0;
			Static139.anInt2953 = 0;
			Static251.method5213(true);
			Static49.aClass160_6.anInt4623 = 1;
			Static395.aClass160_76.anInt4623 = 1;
			Static331.aClass160_65.anInt4623 = 1;
			Static234.aClass160_47.anInt4623 = 1;
			Static138.aClass160_20.anInt4623 = 1;
			Static217.aClass160_40.anInt4623 = 1;
			Static146.aClass160_23.anInt4623 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static312.method4391();
		}
		if (arg0 == 5) {
			Static454.method5860(Static33.aClass49_1, Static153.aClass160_25);
		} else {
			Static359.method4898();
		}
		@Pc(151) boolean local151 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(166) boolean local166 = Static162.anInt3250 == 5 || Static162.anInt3250 == 10 || Static162.anInt3250 == 28;
		if (local166 != local151) {
			if (local151) {
				Static342.anInt5851 = Static77.anInt1722;
				if (Static12.aClass79_Sub1_1.anInt4931 == 0) {
					Static349.method4777();
				} else {
					Static192.method3005(Static12.aClass79_Sub1_1.anInt4931, Static186.aClass160_34, Static77.anInt1722);
				}
				Static102.aClass243_2.method5240(false);
			} else {
				Static349.method4777();
				Static102.aClass243_2.method5240(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static33.aClass49_1.method4432();
		}
		Static162.anInt3250 = arg0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLclient!vc;I)V")
	public static void method4990(@OriginalArg(1) Class2_Sub23_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(18) Class2_Sub44 local18 = (Class2_Sub44) Static33.aClass14_3.method309();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt7214; local25++) {
				if (local18.aClass138Array2[local25] != null) {
					if (local18.aClass138Array2[local25].anInt3723 == 2) {
						local18.anIntArray611[local25] = -5;
					}
					if (local18.aClass138Array2[local25].anInt3723 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass138Array1[local25] != null) {
					if (local18.aClass138Array1[local25].anInt3723 == 2) {
						local18.anIntArray611[local25] = -6;
					}
					if (local18.aClass138Array1[local25].anInt3723 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method5518(arg1);
			arg0.method5449(0);
			@Pc(106) int local106 = arg0.anInt6952;
			arg0.method5506(local18.anInt7215);
			for (@Pc(113) int local113 = 0; local113 < local18.anInt7214; local113++) {
				if (local18.anIntArray611[local113] == 0) {
					try {
						@Pc(137) int local137 = local18.anIntArray609[local113];
						@Pc(149) Field local149;
						@Pc(153) int local153;
						if (local137 == 0) {
							local149 = (Field) local18.aClass138Array2[local113].anObject7;
							local153 = local149.getInt(null);
							arg0.method5449(0);
							arg0.method5506(local153);
						} else if (local137 == 1) {
							local149 = (Field) local18.aClass138Array2[local113].anObject7;
							local149.setInt(null, local18.anIntArray610[local113]);
							arg0.method5449(0);
						} else if (local137 == 2) {
							local149 = (Field) local18.aClass138Array2[local113].anObject7;
							local153 = local149.getModifiers();
							arg0.method5449(0);
							arg0.method5506(local153);
						}
						@Pc(219) Method local219;
						if (local137 == 3) {
							local219 = (Method) local18.aClass138Array1[local113].anObject7;
							@Pc(224) byte[][] local224 = local18.aByteArrayArrayArray17[local113];
							@Pc(228) Object[] local228 = new Object[local224.length];
							for (@Pc(230) int local230 = 0; local230 < local224.length; local230++) {
								@Pc(242) ObjectInputStream local242 = new ObjectInputStream(new ByteArrayInputStream(local224[local230]));
								local228[local230] = local242.readObject();
							}
							@Pc(261) Object local261 = local219.invoke(null, local228);
							if (local261 == null) {
								arg0.method5449(0);
							} else if (local261 instanceof Number) {
								arg0.method5449(1);
								arg0.method5450(((Number) local261).longValue());
							} else if (local261 instanceof String) {
								arg0.method5449(2);
								arg0.method5496((String) local261);
							} else {
								arg0.method5449(4);
							}
						} else if (local137 == 4) {
							local219 = (Method) local18.aClass138Array1[local113].anObject7;
							local153 = local219.getModifiers();
							arg0.method5449(0);
							arg0.method5506(local153);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method5449(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method5449(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method5449(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method5449(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method5449(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method5449(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method5449(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method5449(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method5449(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method5449(-19);
					} catch (@Pc(387) Exception local387) {
						arg0.method5449(-20);
					} catch (@Pc(393) Throwable local393) {
						arg0.method5449(-21);
					}
				} else {
					arg0.method5449(local18.anIntArray611[local113]);
				}
			}
			arg0.method5480(local106);
			arg0.method5448(arg0.anInt6952 - local106);
			local18.method5866();
		}
	}
}
