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

public final class Static240 {

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt6958;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt6962;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "J")
	public static long aLong218 = -1L;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString73 = null;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!uu;)V")
	public static void method5503(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15_Sub2 arg1) {
		while (true) {
			@Pc(15) Class5_Sub47 local15 = (Class5_Sub47) Static430.aClass177_47.method3618();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt7453; local22++) {
				if (local15.aClass268Array1[local22] != null) {
					if (local15.aClass268Array1[local22].anInt7420 == 2) {
						local15.anIntArray509[local22] = -5;
					}
					if (local15.aClass268Array1[local22].anInt7420 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass268Array2[local22] != null) {
					if (local15.aClass268Array2[local22].anInt7420 == 2) {
						local15.anIntArray509[local22] = -6;
					}
					if (local15.aClass268Array2[local22].anInt7420 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method5614(arg0);
			arg1.method5583(0);
			@Pc(101) int local101 = arg1.anInt7013;
			arg1.method5550(local15.anInt7449);
			for (@Pc(108) int local108 = 0; local108 < local15.anInt7453; local108++) {
				if (local15.anIntArray509[local108] == 0) {
					try {
						@Pc(129) int local129 = local15.anIntArray506[local108];
						@Pc(141) Field local141;
						@Pc(145) int local145;
						if (local129 == 0) {
							local141 = (Field) local15.aClass268Array1[local108].anObject10;
							local145 = local141.getInt(null);
							arg1.method5583(0);
							arg1.method5550(local145);
						} else if (local129 == 1) {
							local141 = (Field) local15.aClass268Array1[local108].anObject10;
							local141.setInt(null, local15.anIntArray508[local108]);
							arg1.method5583(0);
						} else if (local129 == 2) {
							local141 = (Field) local15.aClass268Array1[local108].anObject10;
							local145 = local141.getModifiers();
							arg1.method5583(0);
							arg1.method5550(local145);
						}
						@Pc(211) Method local211;
						if (local129 == 3) {
							local211 = (Method) local15.aClass268Array2[local108].anObject10;
							@Pc(216) byte[][] local216 = local15.aByteArrayArrayArray17[local108];
							@Pc(220) Object[] local220 = new Object[local216.length];
							for (@Pc(222) int local222 = 0; local222 < local216.length; local222++) {
								@Pc(234) ObjectInputStream local234 = new ObjectInputStream(new ByteArrayInputStream(local216[local222]));
								local220[local222] = local234.readObject();
							}
							@Pc(249) Object local249 = local211.invoke(null, local220);
							if (local249 == null) {
								arg1.method5583(0);
							} else if (local249 instanceof Number) {
								arg1.method5583(1);
								arg1.method5587(((Number) local249).longValue());
							} else if (local249 instanceof String) {
								arg1.method5583(2);
								arg1.method5545((String) local249);
							} else {
								arg1.method5583(4);
							}
						} else if (local129 == 4) {
							local211 = (Method) local15.aClass268Array2[local108].anObject10;
							local145 = local211.getModifiers();
							arg1.method5583(0);
							arg1.method5550(local145);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg1.method5583(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg1.method5583(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg1.method5583(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg1.method5583(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg1.method5583(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg1.method5583(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg1.method5583(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg1.method5583(-17);
					} catch (@Pc(363) IOException local363) {
						arg1.method5583(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg1.method5583(-19);
					} catch (@Pc(375) Exception local375) {
						arg1.method5583(-20);
					} catch (@Pc(381) Throwable local381) {
						arg1.method5583(-21);
					}
				} else {
					arg1.method5583(local15.anIntArray509[local108]);
				}
			}
			arg1.method5571(local101);
			arg1.method5556(arg1.anInt7013 - local101);
			local15.method6003();
		}
	}
}
