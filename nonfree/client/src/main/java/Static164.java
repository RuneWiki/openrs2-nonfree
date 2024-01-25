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

public final class Static164 {

	@OriginalMember(owner = "client!ft", name = "B", descriptor = "[Lclient!s;")
	public static Class112[] aClass112Array1;

	@OriginalMember(owner = "client!ft", name = "L", descriptor = "Lclient!eq;")
	public static Class97 aClass97_42;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "[I")
	public static final int[] anIntArray259 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ft", name = "D", descriptor = "Lclient!et;")
	public static Class99 aClass99_1 = new Class99();

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
	public static int anInt3693 = 0;

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "[I")
	public static final int[] anIntArray260 = new int[3];

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!rca;)V")
	public static void method3049(@OriginalArg(1) Class2_Sub34_Sub2 arg0) {
		@Pc(8) Class2_Sub46 local8 = (Class2_Sub46) Static632.aClass238_64.method5833();
		if (local8 == null) {
			return;
		}
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < local8.anInt8646; local15++) {
			if (local8.aClass26Array1[local15] != null) {
				if (local8.aClass26Array1[local15].anInt762 == 2) {
					local8.anIntArray598[local15] = -5;
				}
				if (local8.aClass26Array1[local15].anInt762 == 0) {
					local13 = true;
				}
			}
			if (local8.aClass26Array2[local15] != null) {
				if (local8.aClass26Array2[local15].anInt762 == 2) {
					local8.anIntArray598[local15] = -6;
				}
				if (local8.aClass26Array2[local15].anInt762 == 0) {
					local13 = true;
				}
			}
		}
		if (local13) {
			return;
		}
		@Pc(86) int local86 = arg0.anInt8188;
		arg0.method6864(local8.anInt8643);
		for (@Pc(93) int local93 = 0; local93 < local8.anInt8646; local93++) {
			if (local8.anIntArray598[local93] == 0) {
				try {
					@Pc(115) int local115 = local8.anIntArray597[local93];
					@Pc(127) Field local127;
					@Pc(152) int local152;
					if (local115 == 0) {
						local127 = (Field) local8.aClass26Array1[local93].anObject3;
						local152 = local127.getInt(null);
						arg0.method6894(0);
						arg0.method6864(local152);
					} else if (local115 == 1) {
						local127 = (Field) local8.aClass26Array1[local93].anObject3;
						local127.setInt(null, local8.anIntArray599[local93]);
						arg0.method6894(0);
					} else if (local115 == 2) {
						local127 = (Field) local8.aClass26Array1[local93].anObject3;
						local152 = local127.getModifiers();
						arg0.method6894(0);
						arg0.method6864(local152);
					}
					@Pc(192) Method local192;
					if (local115 == 3) {
						local192 = (Method) local8.aClass26Array2[local93].anObject3;
						@Pc(197) byte[][] local197 = local8.aByteArrayArrayArray12[local93];
						@Pc(201) Object[] local201 = new Object[local197.length];
						for (@Pc(203) int local203 = 0; local203 < local197.length; local203++) {
							@Pc(214) ObjectInputStream local214 = new ObjectInputStream(new ByteArrayInputStream(local197[local203]));
							local201[local203] = local214.readObject();
						}
						@Pc(229) Object local229 = local192.invoke(null, local201);
						if (local229 == null) {
							arg0.method6894(0);
						} else if (local229 instanceof Number) {
							arg0.method6894(1);
							arg0.method6871(((Number) local229).longValue());
						} else if (local229 instanceof String) {
							arg0.method6894(2);
							arg0.method6918((String) local229);
						} else {
							arg0.method6894(4);
						}
					} else if (local115 == 4) {
						local192 = (Method) local8.aClass26Array2[local93].anObject3;
						local152 = local192.getModifiers();
						arg0.method6894(0);
						arg0.method6864(local152);
					}
				} catch (@Pc(293) ClassNotFoundException local293) {
					arg0.method6894(-10);
				} catch (@Pc(299) InvalidClassException local299) {
					arg0.method6894(-11);
				} catch (@Pc(305) StreamCorruptedException local305) {
					arg0.method6894(-12);
				} catch (@Pc(311) OptionalDataException local311) {
					arg0.method6894(-13);
				} catch (@Pc(317) IllegalAccessException local317) {
					arg0.method6894(-14);
				} catch (@Pc(323) IllegalArgumentException local323) {
					arg0.method6894(-15);
				} catch (@Pc(329) InvocationTargetException local329) {
					arg0.method6894(-16);
				} catch (@Pc(335) SecurityException local335) {
					arg0.method6894(-17);
				} catch (@Pc(341) IOException local341) {
					arg0.method6894(-18);
				} catch (@Pc(347) NullPointerException local347) {
					arg0.method6894(-19);
				} catch (@Pc(353) Exception local353) {
					arg0.method6894(-20);
				} catch (@Pc(359) Throwable local359) {
					arg0.method6894(-21);
				}
			} else {
				arg0.method6894(local8.anIntArray598[local93]);
			}
		}
		arg0.method6885(local86);
		local8.method8599();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIFFIFLclient!se;IFFI[B)V")
	public static void method3050(@OriginalArg(1) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) Class256 arg4, @OriginalArg(10) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) int arg7, @OriginalArg(13) byte[] arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(39) int local39;
		@Pc(53) int local53;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			arg4.method6433(arg5 / (float) 128, 0, local10, arg0, arg6 / (float) 128, arg2 * 127.0F, arg1 / (float) 16);
			local39 = arg7;
			arg5 *= 2.0F;
			arg6 *= 2.0F;
			arg1 *= 2.0F;
			for (local53 = 0; local53 < 16384; local53++) {
				arg8[local39] = (byte) ((float) arg8[local39] + local10[local53]);
				local39++;
			}
			arg2 *= arg3;
		}
		local39 = arg7;
		for (local53 = 0; local53 < 16384; local53++) {
			arg8[local39] = (byte) (arg8[local39] + 127);
			local39++;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)Z")
	public static boolean method3053(@OriginalArg(1) int arg0) {
		if (Static214.aBooleanArray27[arg0]) {
			return true;
		} else if (Static455.aClass97_116.method2550(arg0)) {
			@Pc(29) int local29 = Static455.aClass97_116.method2569(arg0);
			if (local29 == 0) {
				Static214.aBooleanArray27[arg0] = true;
				return true;
			}
			if (Static399.aClass78ArrayArray1[arg0] == null) {
				Static399.aClass78ArrayArray1[arg0] = new Class78[local29];
			}
			for (@Pc(48) int local48 = 0; local48 < local29; local48++) {
				if (Static399.aClass78ArrayArray1[arg0][local48] == null) {
					@Pc(61) byte[] local61 = Static455.aClass97_116.method2545(local48, arg0);
					if (local61 != null) {
						@Pc(73) Class78 local73 = Static399.aClass78ArrayArray1[arg0][local48] = new Class78();
						local73.anInt1968 = (arg0 << 16) + local48;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method1696(new Class2_Sub34(local61));
					}
				}
			}
			Static214.aBooleanArray27[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
