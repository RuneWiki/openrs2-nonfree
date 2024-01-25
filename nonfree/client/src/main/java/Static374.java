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

public final class Static374 {

	@OriginalMember(owner = "client!of", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[200];

	@OriginalMember(owner = "client!of", name = "F", descriptor = "[I")
	public static final int[] anIntArray367 = new int[13];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!i;)V")
	public static void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1) {
		Static499.aClass83Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!r;)V")
	public static void method5998(@OriginalArg(1) Class44 arg0) {
		Static401.aClass32Array1 = new Class32[Static566.anIntArray532.length];
		for (@Pc(11) int local11 = 0; local11 < Static566.anIntArray532.length; local11++) {
			@Pc(17) int local17 = Static566.anIntArray532[local11];
			@Pc(22) Class114 local22 = Static503.method7393(Static114.aClass176_130, local17);
			@Pc(30) Class58 local30 = arg0.method4983(local22, Static598.method6316(Static478.aClass176_116, local17));
			Static401.aClass32Array1[local11] = new Class32(local30, local22);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!dc;B)V")
	public static void method5999(@OriginalArg(0) Class4_Sub11_Sub1 arg0) {
		@Pc(10) Class4_Sub23 local10 = (Class4_Sub23) Static410.aClass244_54.method5963();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt4040; local17++) {
			if (local10.aClass234Array2[local17] != null) {
				if (local10.aClass234Array2[local17].anInt6717 == 2) {
					local10.anIntArray197[local17] = -5;
				}
				if (local10.aClass234Array2[local17].anInt6717 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass234Array1[local17] != null) {
				if (local10.aClass234Array1[local17].anInt6717 == 2) {
					local10.anIntArray197[local17] = -6;
				}
				if (local10.aClass234Array1[local17].anInt6717 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(83) int local83 = arg0.anInt5831;
		arg0.method4909(local10.anInt4038);
		for (@Pc(90) int local90 = 0; local90 < local10.anInt4040; local90++) {
			if (local10.anIntArray197[local90] == 0) {
				try {
					@Pc(114) int local114 = local10.anIntArray195[local90];
					@Pc(123) Field local123;
					@Pc(127) int local127;
					if (local114 == 0) {
						local123 = (Field) local10.aClass234Array2[local90].anObject16;
						local127 = local123.getInt(null);
						arg0.method4957(0);
						arg0.method4909(local127);
					} else if (local114 == 1) {
						local123 = (Field) local10.aClass234Array2[local90].anObject16;
						local123.setInt(null, local10.anIntArray196[local90]);
						arg0.method4957(0);
					} else if (local114 == 2) {
						local123 = (Field) local10.aClass234Array2[local90].anObject16;
						local127 = local123.getModifiers();
						arg0.method4957(0);
						arg0.method4909(local127);
					}
					@Pc(197) Method local197;
					if (local114 == 3) {
						local197 = (Method) local10.aClass234Array1[local90].anObject16;
						@Pc(202) byte[][] local202 = local10.aByteArrayArrayArray3[local90];
						@Pc(206) Object[] local206 = new Object[local202.length];
						for (@Pc(208) int local208 = 0; local208 < local202.length; local208++) {
							@Pc(220) ObjectInputStream local220 = new ObjectInputStream(new ByteArrayInputStream(local202[local208]));
							local206[local208] = local220.readObject();
						}
						@Pc(235) Object local235 = local197.invoke(null, local206);
						if (local235 == null) {
							arg0.method4957(0);
						} else if (local235 instanceof Number) {
							arg0.method4957(1);
							arg0.method4906(((Number) local235).longValue());
						} else if (local235 instanceof String) {
							arg0.method4957(2);
							arg0.method4945((String) local235);
						} else {
							arg0.method4957(4);
						}
					} else if (local114 == 4) {
						local197 = (Method) local10.aClass234Array1[local90].anObject16;
						local127 = local197.getModifiers();
						arg0.method4957(0);
						arg0.method4909(local127);
					}
				} catch (@Pc(303) ClassNotFoundException local303) {
					arg0.method4957(-10);
				} catch (@Pc(309) InvalidClassException local309) {
					arg0.method4957(-11);
				} catch (@Pc(315) StreamCorruptedException local315) {
					arg0.method4957(-12);
				} catch (@Pc(321) OptionalDataException local321) {
					arg0.method4957(-13);
				} catch (@Pc(327) IllegalAccessException local327) {
					arg0.method4957(-14);
				} catch (@Pc(333) IllegalArgumentException local333) {
					arg0.method4957(-15);
				} catch (@Pc(339) InvocationTargetException local339) {
					arg0.method4957(-16);
				} catch (@Pc(345) SecurityException local345) {
					arg0.method4957(-17);
				} catch (@Pc(351) IOException local351) {
					arg0.method4957(-18);
				} catch (@Pc(357) NullPointerException local357) {
					arg0.method4957(-19);
				} catch (@Pc(363) Exception local363) {
					arg0.method4957(-20);
				} catch (@Pc(369) Throwable local369) {
					arg0.method4957(-21);
				}
			} else {
				arg0.method4957(local10.anIntArray197[local90]);
			}
		}
		arg0.method4928(local83);
		local10.method8379();
	}
}
