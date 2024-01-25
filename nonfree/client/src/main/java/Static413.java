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

public final class Static413 {

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
	public static int anInt7729 = 1;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZLclient!nj;I)V")
	public static void method6431(@OriginalArg(1) Class12_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) Class12_Sub50 local15 = (Class12_Sub50) Static421.aClass73_66.method2005();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt9592; local22++) {
				if (local15.aClass55Array2[local22] != null) {
					if (local15.aClass55Array2[local22].anInt1481 == 2) {
						local15.anIntArray691[local22] = -5;
					}
					if (local15.aClass55Array2[local22].anInt1481 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass55Array1[local22] != null) {
					if (local15.aClass55Array1[local22].anInt1481 == 2) {
						local15.anIntArray691[local22] = -6;
					}
					if (local15.aClass55Array1[local22].anInt1481 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method5237(arg1);
			arg0.method5214(0);
			@Pc(101) int local101 = arg0.anInt6217;
			arg0.method5223(local15.anInt9589);
			for (@Pc(108) int local108 = 0; local108 < local15.anInt9592; local108++) {
				if (local15.anIntArray691[local108] == 0) {
					try {
						@Pc(132) int local132 = local15.anIntArray692[local108];
						@Pc(154) Field local154;
						@Pc(157) int local157;
						if (local132 == 0) {
							local154 = (Field) local15.aClass55Array2[local108].anObject5;
							local157 = local154.getInt(null);
							arg0.method5214(0);
							arg0.method5223(local157);
						} else if (local132 == 1) {
							local154 = (Field) local15.aClass55Array2[local108].anObject5;
							local154.setInt(null, local15.anIntArray693[local108]);
							arg0.method5214(0);
						} else if (local132 == 2) {
							local154 = (Field) local15.aClass55Array2[local108].anObject5;
							local157 = local154.getModifiers();
							arg0.method5214(0);
							arg0.method5223(local157);
						}
						@Pc(219) Method local219;
						if (local132 == 3) {
							local219 = (Method) local15.aClass55Array1[local108].anObject5;
							@Pc(244) byte[][] local244 = local15.aByteArrayArrayArray20[local108];
							@Pc(248) Object[] local248 = new Object[local244.length];
							for (@Pc(250) int local250 = 0; local250 < local244.length; local250++) {
								@Pc(262) ObjectInputStream local262 = new ObjectInputStream(new ByteArrayInputStream(local244[local250]));
								local248[local250] = local262.readObject();
							}
							@Pc(277) Object local277 = local219.invoke(null, local248);
							if (local277 == null) {
								arg0.method5214(0);
							} else if (local277 instanceof Number) {
								arg0.method5214(1);
								arg0.method5208(((Number) local277).longValue());
							} else if (local277 instanceof String) {
								arg0.method5214(2);
								arg0.method5180((String) local277);
							} else {
								arg0.method5214(4);
							}
						} else if (local132 == 4) {
							local219 = (Method) local15.aClass55Array1[local108].anObject5;
							local157 = local219.getModifiers();
							arg0.method5214(0);
							arg0.method5223(local157);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method5214(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method5214(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method5214(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method5214(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method5214(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method5214(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method5214(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method5214(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method5214(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method5214(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method5214(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method5214(-21);
					}
				} else {
					arg0.method5214(local15.anIntArray691[local108]);
				}
			}
			arg0.method5221(local101);
			arg0.method5172(arg0.anInt6217 - local101);
			local15.method7967();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "()V")
	public static void method6432() {
		for (@Pc(1) int local1 = 0; local1 < Static261.anInt5286; local1++) {
			@Pc(6) Class30_Sub1 local6 = Static9.aClass30_Sub1Array1[local1];
			Static347.method5471(local6);
			Static9.aClass30_Sub1Array1[local1] = null;
		}
		Static261.anInt5286 = 0;
	}
}
