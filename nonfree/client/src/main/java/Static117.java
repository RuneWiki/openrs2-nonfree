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

public final class Static117 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	public static int anInt2505;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString86 = "Unable to find ";

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	private static void method2034() {
		Static290.aClass198_53.method5243(5);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method2035() {
		method2034();
		Static131.method2231();
		Static328.method5352();
		Static319.method5265();
		Static312.method5335();
		Static175.method2871();
		Static91.method1453();
		Static91.method1445();
		Static95.method1576();
		Static347.method5662();
		Static253.method4244();
		Static313.method5226();
		Static236.method4021();
		Static7.method148();
		Static345.method5625();
		Static236.method4022();
		Static246.method4180();
		Static344.method5611();
		Static109.method1872();
		Static44.method737();
		Static22.method432();
		Static271.method4584();
		Static196.method3451();
		Static258.aClass198_48.method5243(5);
		Static2.aClass198_1.method5243(5);
		Static99.aClass198_19.method5243(5);
		Static115.aClass198_21.method5243(5);
		Static139.aClass198_22.method5243(5);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(CI)C")
	public static char method2036(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!ni;)V")
	public static void method2037(@OriginalArg(2) Class3_Sub4_Sub2 arg0) {
		while (true) {
			@Pc(15) Class3_Sub35 local15 = (Class3_Sub35) Static254.aClass127_26.method3402();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt4837; local22++) {
				if (local15.aClass207Array1[local22] != null) {
					if (local15.aClass207Array1[local22].anInt6346 == 2) {
						local15.anIntArray395[local22] = -5;
					}
					if (local15.aClass207Array1[local22].anInt6346 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass207Array2[local22] != null) {
					if (local15.aClass207Array2[local22].anInt6346 == 2) {
						local15.anIntArray395[local22] = -6;
					}
					if (local15.aClass207Array2[local22].anInt6346 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method3682(248);
			arg0.method3614(0);
			@Pc(98) int local98 = arg0.anInt4268;
			arg0.method3650(local15.anInt4834);
			for (@Pc(105) int local105 = 0; local105 < local15.anInt4837; local105++) {
				if (local15.anIntArray395[local105] == 0) {
					try {
						@Pc(126) int local126 = local15.anIntArray397[local105];
						@Pc(143) Field local143;
						@Pc(169) int local169;
						if (local126 == 0) {
							local143 = (Field) local15.aClass207Array1[local105].anObject7;
							local169 = local143.getInt(null);
							arg0.method3614(0);
							arg0.method3650(local169);
						} else if (local126 == 1) {
							local143 = (Field) local15.aClass207Array1[local105].anObject7;
							local143.setInt(null, local15.anIntArray396[local105]);
							arg0.method3614(0);
						} else if (local126 == 2) {
							local143 = (Field) local15.aClass207Array1[local105].anObject7;
							local169 = local143.getModifiers();
							arg0.method3614(0);
							arg0.method3650(local169);
						}
						@Pc(213) Method local213;
						if (local126 == 3) {
							local213 = (Method) local15.aClass207Array2[local105].anObject7;
							@Pc(238) byte[][] local238 = local15.aByteArrayArrayArray11[local105];
							@Pc(242) Object[] local242 = new Object[local238.length];
							for (@Pc(244) int local244 = 0; local244 < local238.length; local244++) {
								@Pc(256) ObjectInputStream local256 = new ObjectInputStream(new ByteArrayInputStream(local238[local244]));
								local242[local244] = local256.readObject();
							}
							@Pc(275) Object local275 = local213.invoke(null, local242);
							if (local275 == null) {
								arg0.method3614(0);
							} else if (local275 instanceof Number) {
								arg0.method3614(1);
								arg0.method3668(((Number) local275).longValue());
							} else if (local275 instanceof String) {
								arg0.method3614(2);
								arg0.method3624((String) local275);
							} else {
								arg0.method3614(4);
							}
						} else if (local126 == 4) {
							local213 = (Method) local15.aClass207Array2[local105].anObject7;
							local169 = local213.getModifiers();
							arg0.method3614(0);
							arg0.method3650(local169);
						}
					} catch (@Pc(318) ClassNotFoundException local318) {
						arg0.method3614(-10);
					} catch (@Pc(324) InvalidClassException local324) {
						arg0.method3614(-11);
					} catch (@Pc(330) StreamCorruptedException local330) {
						arg0.method3614(-12);
					} catch (@Pc(336) OptionalDataException local336) {
						arg0.method3614(-13);
					} catch (@Pc(342) IllegalAccessException local342) {
						arg0.method3614(-14);
					} catch (@Pc(348) IllegalArgumentException local348) {
						arg0.method3614(-15);
					} catch (@Pc(354) InvocationTargetException local354) {
						arg0.method3614(-16);
					} catch (@Pc(360) SecurityException local360) {
						arg0.method3614(-17);
					} catch (@Pc(366) IOException local366) {
						arg0.method3614(-18);
					} catch (@Pc(372) NullPointerException local372) {
						arg0.method3614(-19);
					} catch (@Pc(378) Exception local378) {
						arg0.method3614(-20);
					} catch (@Pc(384) Throwable local384) {
						arg0.method3614(-21);
					}
				} else {
					arg0.method3614(local15.anIntArray395[local105]);
				}
			}
			arg0.method3618(local98);
			arg0.method3661(arg0.anInt4268 - local98);
			local15.method5717();
		}
	}
}
