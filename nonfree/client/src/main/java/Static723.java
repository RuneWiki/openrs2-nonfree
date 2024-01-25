import java.io.ByteArrayInputStream;
import java.io.File;
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

public final class Static723 {

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
	public static int anInt11214;

	@OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
	public static int anInt11225;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_192 = new Class397(49, 7);

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "[I")
	public static final int[] anIntArray795 = new int[8];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLclient!aba;)V")
	public static void method9561(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		@Pc(10) Class3_Sub31 local10 = (Class3_Sub31) Static256.aClass342_26.method7644();
		if (local10 == null) {
			return;
		}
		@Pc(16) boolean local16 = false;
		for (@Pc(27) int local27 = 0; local27 < local10.anInt4860; local27++) {
			if (local10.aClass338Array2[local27] != null) {
				if (local10.aClass338Array2[local27].anInt8934 == 2) {
					local10.anIntArray353[local27] = -5;
				}
				if (local10.aClass338Array2[local27].anInt8934 == 0) {
					local16 = true;
				}
			}
			if (local10.aClass338Array1[local27] != null) {
				if (local10.aClass338Array1[local27].anInt8934 == 2) {
					local10.anIntArray353[local27] = -6;
				}
				if (local10.aClass338Array1[local27].anInt8934 == 0) {
					local16 = true;
				}
			}
		}
		if (local16) {
			return;
		}
		@Pc(110) int local110 = arg0.anInt2178;
		arg0.method2018(local10.anInt4859);
		for (@Pc(117) int local117 = 0; local117 < local10.anInt4860; local117++) {
			if (local10.anIntArray353[local117] == 0) {
				try {
					@Pc(145) int local145 = local10.anIntArray351[local117];
					@Pc(161) Field local161;
					@Pc(189) int local189;
					if (local145 == 0) {
						local161 = (Field) local10.aClass338Array2[local117].anObject16;
						local189 = local161.getInt((Object) null);
						arg0.method2065(0);
						arg0.method2018(local189);
					} else if (local145 == 1) {
						local161 = (Field) local10.aClass338Array2[local117].anObject16;
						local161.setInt((Object) null, local10.anIntArray352[local117]);
						arg0.method2065(0);
					} else if (local145 == 2) {
						local161 = (Field) local10.aClass338Array2[local117].anObject16;
						local189 = local161.getModifiers();
						arg0.method2065(0);
						arg0.method2018(local189);
					}
					@Pc(230) Method local230;
					if (local145 == 3) {
						local230 = (Method) local10.aClass338Array1[local117].anObject16;
						@Pc(235) byte[][] local235 = local10.aByteArrayArrayArray10[local117];
						@Pc(239) Object[] local239 = new Object[local235.length];
						for (@Pc(241) int local241 = 0; local241 < local235.length; local241++) {
							@Pc(253) ObjectInputStream local253 = new ObjectInputStream(new ByteArrayInputStream(local235[local241]));
							local239[local241] = local253.readObject();
						}
						@Pc(272) Object local272 = local230.invoke((Object) null, local239);
						if (local272 == null) {
							arg0.method2065(0);
						} else if (local272 instanceof Number) {
							arg0.method2065(1);
							arg0.method2016(((Number) local272).longValue());
						} else if (local272 instanceof String) {
							arg0.method2065(2);
							arg0.method2073((String) local272);
						} else {
							arg0.method2065(4);
						}
					} else if (local145 == 4) {
						local230 = (Method) local10.aClass338Array1[local117].anObject16;
						local189 = local230.getModifiers();
						arg0.method2065(0);
						arg0.method2018(local189);
					}
				} catch (@Pc(358) ClassNotFoundException local358) {
					arg0.method2065(-10);
				} catch (@Pc(364) InvalidClassException local364) {
					arg0.method2065(-11);
				} catch (@Pc(370) StreamCorruptedException local370) {
					arg0.method2065(-12);
				} catch (@Pc(376) OptionalDataException local376) {
					arg0.method2065(-13);
				} catch (@Pc(382) IllegalAccessException local382) {
					arg0.method2065(-14);
				} catch (@Pc(390) IllegalArgumentException local390) {
					arg0.method2065(-15);
				} catch (@Pc(398) InvocationTargetException local398) {
					arg0.method2065(-16);
				} catch (@Pc(404) SecurityException local404) {
					arg0.method2065(-17);
				} catch (@Pc(410) IOException local410) {
					arg0.method2065(-18);
				} catch (@Pc(418) NullPointerException local418) {
					arg0.method2065(-19);
				} catch (@Pc(424) Exception local424) {
					arg0.method2065(-20);
				} catch (@Pc(432) Throwable local432) {
					arg0.method2065(-21);
				}
			} else {
				arg0.method2065(local10.anIntArray353[local117]);
			}
		}
		arg0.method2072(local110);
		local10.method9596();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method9562(@OriginalArg(0) String arg0) {
		if (!Static205.aClass47_2.aBoolean105) {
			return -1;
		} else if (Static687.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(28) String local28 = Static257.method3550(arg0);
			if (local28 == null) {
				return -1;
			}
			@Pc(42) String local42 = Static515.aString100 + local28;
			if (!Static368.aClass182_79.method3955(local42, "")) {
				return -1;
			} else if (Static368.aClass182_79.method3953(local42)) {
				@Pc(68) byte[] local68 = Static368.aClass182_79.method3958("", local42);
				@Pc(74) File local74;
				try {
					local74 = Static200.method3059(local28);
				} catch (@Pc(76) RuntimeException local76) {
					return -1;
				}
				if (local68 == null || local74 == null) {
					return -1;
				}
				@Pc(86) boolean local86 = true;
				@Pc(90) byte[] local90 = Static459.method6215(local74);
				if (local90 != null && local90.length == local68.length) {
					for (@Pc(101) int local101 = 0; local101 < local90.length; local101++) {
						if (local90[local101] != local68[local101]) {
							local86 = false;
							break;
						}
					}
				} else {
					local86 = false;
				}
				try {
					if (!local86) {
						Static205.aClass47_2.method1399(local74, local68);
					}
				} catch (@Pc(139) Throwable local139) {
					return -1;
				}
				Static117.method2219(local74, arg0);
				return 100;
			} else {
				return Static368.aClass182_79.method3963(local42);
			}
		}
	}
}
