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

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "cb", descriptor = "S")
	public static short aShort21 = 32767;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILclient!ck;)V")
	public static void method364(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7_Sub1 arg1) {
		while (true) {
			@Pc(16) Class3_Sub19 local16 = (Class3_Sub19) Static46.aClass243_7.method5208();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.anInt3019; local23++) {
				if (local16.aClass43Array2[local23] != null) {
					if (local16.aClass43Array2[local23].anInt1521 == 2) {
						local16.anIntArray190[local23] = -5;
					}
					if (local16.aClass43Array2[local23].anInt1521 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass43Array1[local23] != null) {
					if (local16.aClass43Array1[local23].anInt1521 == 2) {
						local16.anIntArray190[local23] = -6;
					}
					if (local16.aClass43Array1[local23].anInt1521 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg1.method1057(arg0);
			arg1.method2628(0);
			@Pc(99) int local99 = arg1.anInt3235;
			arg1.method2636(local16.anInt3021);
			for (@Pc(106) int local106 = 0; local106 < local16.anInt3019; local106++) {
				if (local16.anIntArray190[local106] == 0) {
					try {
						@Pc(130) int local130 = local16.anIntArray192[local106];
						@Pc(139) Field local139;
						@Pc(143) int local143;
						if (local130 == 0) {
							local139 = (Field) local16.aClass43Array2[local106].anObject3;
							local143 = local139.getInt(null);
							arg1.method2628(0);
							arg1.method2636(local143);
						} else if (local130 == 1) {
							local139 = (Field) local16.aClass43Array2[local106].anObject3;
							local139.setInt(null, local16.anIntArray191[local106]);
							arg1.method2628(0);
						} else if (local130 == 2) {
							local139 = (Field) local16.aClass43Array2[local106].anObject3;
							local143 = local139.getModifiers();
							arg1.method2628(0);
							arg1.method2636(local143);
						}
						@Pc(214) Method local214;
						if (local130 == 3) {
							local214 = (Method) local16.aClass43Array1[local106].anObject3;
							@Pc(239) byte[][] local239 = local16.aByteArrayArrayArray3[local106];
							@Pc(243) Object[] local243 = new Object[local239.length];
							for (@Pc(245) int local245 = 0; local245 < local239.length; local245++) {
								@Pc(257) ObjectInputStream local257 = new ObjectInputStream(new ByteArrayInputStream(local239[local245]));
								local243[local245] = local257.readObject();
							}
							@Pc(272) Object local272 = local214.invoke(null, local243);
							if (local272 == null) {
								arg1.method2628(0);
							} else if (local272 instanceof Number) {
								arg1.method2628(1);
								arg1.method2603(((Number) local272).longValue());
							} else if (local272 instanceof String) {
								arg1.method2628(2);
								arg1.method2608((String) local272);
							} else {
								arg1.method2628(4);
							}
						} else if (local130 == 4) {
							local214 = (Method) local16.aClass43Array1[local106].anObject3;
							local143 = local214.getModifiers();
							arg1.method2628(0);
							arg1.method2636(local143);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg1.method2628(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg1.method2628(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg1.method2628(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg1.method2628(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg1.method2628(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg1.method2628(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg1.method2628(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg1.method2628(-17);
					} catch (@Pc(363) IOException local363) {
						arg1.method2628(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg1.method2628(-19);
					} catch (@Pc(375) Exception local375) {
						arg1.method2628(-20);
					} catch (@Pc(381) Throwable local381) {
						arg1.method2628(-21);
					}
				} else {
					arg1.method2628(local16.anIntArray190[local106]);
				}
			}
			arg1.method2625(local99);
			arg1.method2629(arg1.anInt3235 - local99);
			local16.method5977();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I")
	public static int method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static182.method2888(arg0 - 1, arg1 + -1) + Static182.method2888(arg0 - 1, arg1 + 1) + Static182.method2888(arg0 + 1, arg1 - 1) + Static182.method2888(arg0 + 1, arg1 + 1);
		@Pc(72) int local72 = Static182.method2888(arg0, arg1 - 1) + Static182.method2888(arg0, arg1 + 1) + Static182.method2888(arg0 - 1, arg1) + Static182.method2888(arg0 + 1, arg1);
		@Pc(77) int local77 = Static182.method2888(arg0, arg1);
		return local77 / 4 + local72 / 8 + local42 / 16;
	}
}
