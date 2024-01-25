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

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "[I")
	public static int[] anIntArray22;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public static int anInt205;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_3 = new Class217(79, -1);

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
	public static final int[] anIntArray23 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_4 = new Class217(102, 3);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!ge;)V")
	public static void method276(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7_Sub2 arg1) {
		while (true) {
			@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) Static38.aClass42_2.method1543();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2768; local22++) {
				if (local15.aClass121Array2[local22] != null) {
					if (local15.aClass121Array2[local22].anInt3693 == 2) {
						local15.anIntArray205[local22] = -5;
					}
					if (local15.aClass121Array2[local22].anInt3693 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass121Array1[local22] != null) {
					if (local15.aClass121Array1[local22].anInt3693 == 2) {
						local15.anIntArray205[local22] = -6;
					}
					if (local15.aClass121Array1[local22].anInt3693 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg1.method2163(arg0);
			arg1.method2121(0);
			@Pc(98) int local98 = arg1.anInt2219;
			arg1.method2115(local15.anInt2769);
			for (@Pc(105) int local105 = 0; local105 < local15.anInt2768; local105++) {
				if (local15.anIntArray205[local105] == 0) {
					try {
						@Pc(126) int local126 = local15.anIntArray204[local105];
						@Pc(143) Field local143;
						@Pc(171) int local171;
						if (local126 == 0) {
							local143 = (Field) local15.aClass121Array2[local105].anObject2;
							local171 = local143.getInt(null);
							arg1.method2121(0);
							arg1.method2115(local171);
						} else if (local126 == 1) {
							local143 = (Field) local15.aClass121Array2[local105].anObject2;
							local143.setInt(null, local15.anIntArray206[local105]);
							arg1.method2121(0);
						} else if (local126 == 2) {
							local143 = (Field) local15.aClass121Array2[local105].anObject2;
							local171 = local143.getModifiers();
							arg1.method2121(0);
							arg1.method2115(local171);
						}
						@Pc(217) Method local217;
						if (local126 == 3) {
							local217 = (Method) local15.aClass121Array1[local105].anObject2;
							@Pc(242) byte[][] local242 = local15.aByteArrayArrayArray2[local105];
							@Pc(246) Object[] local246 = new Object[local242.length];
							for (@Pc(248) int local248 = 0; local248 < local242.length; local248++) {
								@Pc(260) ObjectInputStream local260 = new ObjectInputStream(new ByteArrayInputStream(local242[local248]));
								local246[local248] = local260.readObject();
							}
							@Pc(275) Object local275 = local217.invoke(null, local246);
							if (local275 == null) {
								arg1.method2121(0);
							} else if (local275 instanceof Number) {
								arg1.method2121(1);
								arg1.method2124(((Number) local275).longValue());
							} else if (local275 instanceof String) {
								arg1.method2121(2);
								arg1.method2106((String) local275);
							} else {
								arg1.method2121(4);
							}
						} else if (local126 == 4) {
							local217 = (Method) local15.aClass121Array1[local105].anObject2;
							local171 = local217.getModifiers();
							arg1.method2121(0);
							arg1.method2115(local171);
						}
					} catch (@Pc(318) ClassNotFoundException local318) {
						arg1.method2121(-10);
					} catch (@Pc(324) InvalidClassException local324) {
						arg1.method2121(-11);
					} catch (@Pc(330) StreamCorruptedException local330) {
						arg1.method2121(-12);
					} catch (@Pc(336) OptionalDataException local336) {
						arg1.method2121(-13);
					} catch (@Pc(342) IllegalAccessException local342) {
						arg1.method2121(-14);
					} catch (@Pc(348) IllegalArgumentException local348) {
						arg1.method2121(-15);
					} catch (@Pc(354) InvocationTargetException local354) {
						arg1.method2121(-16);
					} catch (@Pc(360) SecurityException local360) {
						arg1.method2121(-17);
					} catch (@Pc(366) IOException local366) {
						arg1.method2121(-18);
					} catch (@Pc(372) NullPointerException local372) {
						arg1.method2121(-19);
					} catch (@Pc(378) Exception local378) {
						arg1.method2121(-20);
					} catch (@Pc(384) Throwable local384) {
						arg1.method2121(-21);
					}
				} else {
					arg1.method2121(local15.anIntArray205[local105]);
				}
			}
			arg1.method2149(local98);
			arg1.method2147(arg1.anInt2219 - local98);
			local15.method6045();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	public static void method278() {
		@Pc(12) Class21 local12 = Static288.aClass21_148;
		synchronized (Static288.aClass21_148) {
			Static288.aClass21_148.method857();
		}
	}
}
