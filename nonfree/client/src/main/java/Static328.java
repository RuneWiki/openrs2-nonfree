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

public final class Static328 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_182 = new Class214(112, -2);

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public static int anInt5871 = 0;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
	public static int anInt5872 = -1;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public static int anInt5873 = 0;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
	public static final int[] anIntArray478 = new int[1000];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4873(@OriginalArg(1) String arg0) {
		if (Static65.aStringArray8 == null) {
			Static19.method306();
		}
		@Pc(14) String[] local14 = Static399.method5642(arg0, '\n');
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			for (@Pc(25) int local25 = Static15.anInt304; local25 > 0; local25--) {
				Static65.aStringArray8[local25] = Static65.aStringArray8[local25 - 1];
			}
			Static65.aStringArray8[0] = local14[local21];
			if (Static65.aStringArray8.length - 1 > Static15.anInt304) {
				Static15.anInt304++;
				if (Static210.anInt4285 > 0) {
					Static210.anInt4285++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!iu;II)V")
	public static void method4875(@OriginalArg(0) Class4_Sub20_Sub1 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) Class4_Sub35 local15 = (Class4_Sub35) Static210.aClass91_27.method2584();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt6333; local22++) {
				if (local15.aClass87Array2[local22] != null) {
					if (local15.aClass87Array2[local22].anInt2679 == 2) {
						local15.anIntArray510[local22] = -5;
					}
					if (local15.aClass87Array2[local22].anInt2679 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass87Array1[local22] != null) {
					if (local15.aClass87Array1[local22].anInt2679 == 2) {
						local15.anIntArray510[local22] = -6;
					}
					if (local15.aClass87Array1[local22].anInt2679 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method3238(arg1);
			arg0.method4590(0);
			@Pc(99) int local99 = arg0.anInt5526;
			arg0.method4561(local15.anInt6335);
			for (@Pc(108) int local108 = 0; local108 < local15.anInt6333; local108++) {
				if (local15.anIntArray510[local108] == 0) {
					try {
						@Pc(129) int local129 = local15.anIntArray511[local108];
						@Pc(141) Field local141;
						@Pc(145) int local145;
						if (local129 == 0) {
							local141 = (Field) local15.aClass87Array2[local108].anObject3;
							local145 = local141.getInt(null);
							arg0.method4590(0);
							arg0.method4561(local145);
						} else if (local129 == 1) {
							local141 = (Field) local15.aClass87Array2[local108].anObject3;
							local141.setInt(null, local15.anIntArray509[local108]);
							arg0.method4590(0);
						} else if (local129 == 2) {
							local141 = (Field) local15.aClass87Array2[local108].anObject3;
							local145 = local141.getModifiers();
							arg0.method4590(0);
							arg0.method4561(local145);
						}
						@Pc(216) Method local216;
						if (local129 == 3) {
							local216 = (Method) local15.aClass87Array1[local108].anObject3;
							@Pc(241) byte[][] local241 = local15.aByteArrayArrayArray10[local108];
							@Pc(245) Object[] local245 = new Object[local241.length];
							for (@Pc(247) int local247 = 0; local247 < local241.length; local247++) {
								@Pc(259) ObjectInputStream local259 = new ObjectInputStream(new ByteArrayInputStream(local241[local247]));
								local245[local247] = local259.readObject();
							}
							@Pc(278) Object local278 = local216.invoke(null, local245);
							if (local278 == null) {
								arg0.method4590(0);
							} else if (local278 instanceof Number) {
								arg0.method4590(1);
								arg0.method4556(((Number) local278).longValue());
							} else if (local278 instanceof String) {
								arg0.method4590(2);
								arg0.method4599((String) local278);
							} else {
								arg0.method4590(4);
							}
						} else if (local129 == 4) {
							local216 = (Method) local15.aClass87Array1[local108].anObject3;
							local145 = local216.getModifiers();
							arg0.method4590(0);
							arg0.method4561(local145);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method4590(-10);
					} catch (@Pc(329) InvalidClassException local329) {
						arg0.method4590(-11);
					} catch (@Pc(335) StreamCorruptedException local335) {
						arg0.method4590(-12);
					} catch (@Pc(341) OptionalDataException local341) {
						arg0.method4590(-13);
					} catch (@Pc(349) IllegalAccessException local349) {
						arg0.method4590(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method4590(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method4590(-16);
					} catch (@Pc(371) SecurityException local371) {
						arg0.method4590(-17);
					} catch (@Pc(377) IOException local377) {
						arg0.method4590(-18);
					} catch (@Pc(385) NullPointerException local385) {
						arg0.method4590(-19);
					} catch (@Pc(393) Exception local393) {
						arg0.method4590(-20);
					} catch (@Pc(401) Throwable local401) {
						arg0.method4590(-21);
					}
				} else {
					arg0.method4590(local15.anIntArray510[local108]);
				}
			}
			arg0.method4574(local99);
			arg0.method4567(arg0.anInt5526 - local99);
			local15.method6330();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	public static void method4876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static448.method6134(Static45.aClass212_9);
		Static457.aClass4_Sub20_Sub1_5.method4558(arg1);
		Static457.aClass4_Sub20_Sub1_5.method4562(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI)V")
	public static void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(43) String local43 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local43);
		Static222.method3822(local43, true, false);
	}
}
