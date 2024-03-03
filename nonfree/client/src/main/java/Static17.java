import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!at", name = "N", descriptor = "Lclient!nh;")
	public static Class11_Sub5_Sub2_Sub1 aClass11_Sub5_Sub2_Sub1_3;

	@OriginalMember(owner = "client!at", name = "P", descriptor = "Lclient!ml;")
	public static Class152 aClass152_4;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BII)V", line = 5)
	public static void method4209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(7, arg0);
		local8.method2313();
		local8.anInt2286 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZZ)V", line = 38)
	public static void method4211(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Class150.aClass2_Sub4_Sub2_3.method4874(Class61.anInt1834) >= 15) {
				@Pc(16) int local16 = Class150.aClass2_Sub4_Sub2_3.method4869(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local16] == null) {
						Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local16] = new Class11_Sub5_Sub2_Sub2();
						Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local16].anInt4610 = local16;
						local21 = true;
					}
					@Pc(42) Class11_Sub5_Sub2_Sub2 local42 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local16];
					Class149.anIntArray230[Class117.anInt3183++] = local16;
					local42.anInt4601 = Class83.anInt2345;
					if (local42.aClass71_1 != null && local42.aClass71_1.method2101()) {
						Static145.method2783(local42);
					}
					@Pc(71) int local71;
					if (arg0) {
						local71 = Class150.aClass2_Sub4_Sub2_3.method4869(8);
						if (local71 > 127) {
							local71 -= 256;
						}
					} else {
						local71 = Class150.aClass2_Sub4_Sub2_3.method4869(5);
						if (local71 > 15) {
							local71 -= 32;
						}
					}
					@Pc(97) int local97;
					if (arg0) {
						local97 = Class150.aClass2_Sub4_Sub2_3.method4869(8);
						if (local97 > 127) {
							local97 -= 256;
						}
					} else {
						local97 = Class150.aClass2_Sub4_Sub2_3.method4869(5);
						if (local97 > 15) {
							local97 -= 32;
						}
					}
					@Pc(119) int local119 = Class150.aClass2_Sub4_Sub2_3.method4869(1);
					if (local119 == 1) {
						Class187.anIntArray361[Class226.anInt6378++] = local16;
					}
					local42.method4343(Static6.aClass219_1.method5571(Class150.aClass2_Sub4_Sub2_3.method4869(14)));
					@Pc(151) int local151 = Class150.aClass2_Sub4_Sub2_3.method4869(3) + 4 << 11 & 0x3929;
					@Pc(156) int local156 = Class150.aClass2_Sub4_Sub2_3.method4869(2);
					@Pc(161) int local161 = Class150.aClass2_Sub4_Sub2_3.method4869(1);
					local42.method4323(local42.aClass71_1.anInt2038);
					local42.anInt4596 = local42.aClass71_1.anInt2041 << 3;
					if (local42.anInt4596 == 0) {
						local42.method4331(0);
					} else if (local21) {
						local42.method4331(local151);
					}
					local42.method4340(local42.method4329(), local156, aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] + local97, local161 == 1, aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] + local71);
					if (local42.aClass71_1.method2101()) {
						Static197.method3725(null, local42.anIntArray317[0], 0, null, local42, local42.anIntArray316[0], local42.aByte78);
					}
					continue;
				}
			}
			Class150.aClass2_Sub4_Sub2_3.method4866();
			return;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([Ljava/lang/Object;B[III)V", line = 141)
	public static void method4212(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if ((local46 & 0x1) + local20 > arg1[local46]) {
				@Pc(61) int local61 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local61;
				@Pc(75) Object local75 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local75;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method4212(arg0, arg1, arg2, local16 - 1);
		method4212(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 197)
	public static Class method4213(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V", line = 237)
	public static void method4214(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(4, arg0);
		local8.method2314();
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)Lclient!wj;", line = 247)
	public static Class236 method4215() {
		try {
			return (Class236) Class.forName("Class236_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!ml;)V", line = 273)
	public static void method4216(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class152 arg1) {
		while (true) {
			@Pc(19) Class32 local19 = arg1.method3764(arg0);
			while (local19.anInt992 == 0) {
				Static214.method4024(10L);
			}
			if (local19.anInt992 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static214.method4024(100L);
		}
	}
}
