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

public final class Static38 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public static int anInt635;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method611(@OriginalArg(0) String arg0) {
		return Static463.method6324(arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!ik;)V")
	public static void method612(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25_Sub1 arg1) {
		while (true) {
			@Pc(15) Class3_Sub45 local15 = (Class3_Sub45) Static254.aClass193_57.method4519();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt7117; local22++) {
				if (local15.aClass181Array2[local22] != null) {
					if (local15.aClass181Array2[local22].anInt5298 == 2) {
						local15.anIntArray456[local22] = -5;
					}
					if (local15.aClass181Array2[local22].anInt5298 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass181Array1[local22] != null) {
					if (local15.aClass181Array1[local22].anInt5298 == 2) {
						local15.anIntArray456[local22] = -6;
					}
					if (local15.aClass181Array1[local22].anInt5298 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method2781(arg0);
			arg1.method4081(0);
			@Pc(102) int local102 = arg1.anInt4974;
			arg1.method4082(local15.anInt7115);
			for (@Pc(109) int local109 = 0; local109 < local15.anInt7117; local109++) {
				if (local15.anIntArray456[local109] == 0) {
					try {
						@Pc(133) int local133 = local15.anIntArray457[local109];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local133 == 0) {
							local142 = (Field) local15.aClass181Array2[local109].anObject7;
							local146 = local142.getInt(null);
							arg1.method4081(0);
							arg1.method4082(local146);
						} else if (local133 == 1) {
							local142 = (Field) local15.aClass181Array2[local109].anObject7;
							local142.setInt(null, local15.anIntArray455[local109]);
							arg1.method4081(0);
						} else if (local133 == 2) {
							local142 = (Field) local15.aClass181Array2[local109].anObject7;
							local146 = local142.getModifiers();
							arg1.method4081(0);
							arg1.method4082(local146);
						}
						@Pc(214) Method local214;
						if (local133 == 3) {
							local214 = (Method) local15.aClass181Array1[local109].anObject7;
							@Pc(219) byte[][] local219 = local15.aByteArrayArrayArray17[local109];
							@Pc(223) Object[] local223 = new Object[local219.length];
							for (@Pc(225) int local225 = 0; local225 < local219.length; local225++) {
								@Pc(237) ObjectInputStream local237 = new ObjectInputStream(new ByteArrayInputStream(local219[local225]));
								local223[local225] = local237.readObject();
							}
							@Pc(252) Object local252 = local214.invoke(null, local223);
							if (local252 == null) {
								arg1.method4081(0);
							} else if (local252 instanceof Number) {
								arg1.method4081(1);
								arg1.method4063(((Number) local252).longValue());
							} else if (local252 instanceof String) {
								arg1.method4081(2);
								arg1.method4080((String) local252);
							} else {
								arg1.method4081(4);
							}
						} else if (local133 == 4) {
							local214 = (Method) local15.aClass181Array1[local109].anObject7;
							local146 = local214.getModifiers();
							arg1.method4081(0);
							arg1.method4082(local146);
						}
					} catch (@Pc(318) ClassNotFoundException local318) {
						arg1.method4081(-10);
					} catch (@Pc(324) InvalidClassException local324) {
						arg1.method4081(-11);
					} catch (@Pc(330) StreamCorruptedException local330) {
						arg1.method4081(-12);
					} catch (@Pc(336) OptionalDataException local336) {
						arg1.method4081(-13);
					} catch (@Pc(342) IllegalAccessException local342) {
						arg1.method4081(-14);
					} catch (@Pc(348) IllegalArgumentException local348) {
						arg1.method4081(-15);
					} catch (@Pc(354) InvocationTargetException local354) {
						arg1.method4081(-16);
					} catch (@Pc(360) SecurityException local360) {
						arg1.method4081(-17);
					} catch (@Pc(366) IOException local366) {
						arg1.method4081(-18);
					} catch (@Pc(372) NullPointerException local372) {
						arg1.method4081(-19);
					} catch (@Pc(378) Exception local378) {
						arg1.method4081(-20);
					} catch (@Pc(384) Throwable local384) {
						arg1.method4081(-21);
					}
				} else {
					arg1.method4081(local15.anIntArray456[local109]);
				}
			}
			arg1.method4113(local102);
			arg1.method4091(arg1.anInt4974 - local102);
			local15.method6288();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIII)V")
	public static void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static399.anInt2866 <= arg4 && arg1 <= Static372.anInt6316 && arg0 >= Static316.anInt5349 && arg2 <= Static418.anInt7030) {
			if (arg3 == 1) {
				Static306.method4339(arg4, arg1, arg5, arg0, arg2);
			} else {
				Static344.method4826(arg5, arg1, arg3, arg2, arg0, arg4);
			}
		} else if (arg3 == 1) {
			Static271.method3764(arg2, arg1, arg5, arg0, arg4);
		} else {
			Static303.method4313(arg0, arg1, arg5, arg2, arg4, arg3);
		}
	}
}
