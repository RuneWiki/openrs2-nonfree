import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("ada0c4996cbd0df7e019926ebc1082a79b45282dae38dc409b2b377906b3a638709a11d2bf4c94bcc697cbd681d0a6e1d6518ba1fe51658e2d8f62fba5dfc74e93d19460092b8409f6ba97ea61d91c3783309b6edd56c6f8a178d864ecfa5811e7a2df38cf4efd3dca7a22e194523703595d22143c2ff6e1823f2e1f8b4f3baaf8f4d92b74df4309a882311973ec2f994ddcab39d1bf0a4470a5a8777527fade536cbb7c1e2f76fbfe513ea7851b26cfe206e8bfd0ed157d2df2e1308b74f2615e911a5eea8e46e774e25900bf1b971f7cc46b25c14f08446d6ec1f44e88419077d73ee212b59ed4dd7f2d1adf2252abd3d865ada958fa5319832bc6be35d61cb85cb54722bcc06149334aa023aa709739f9fa64c4f64b20e4ea8bc409135e396ee67865aafad8a2c77b43347be2506a41339901ae696274166ad315c004f45ab8cf6356ecdbeb07488501d0c79fae6127f0263cf657fe297d914bb225806ff3fd6539eac0e7a8f40a2bf5135e7c398f3d446537f26effc4c2bedd5233515d5f9188b34673f2a311fafe12cae7ff54f0d8fb97f397f8a85a9299cdaa31bf5f660180f827f1b7a41625522ba501f623758e0a0df2c912dac6a925d22b9a3ba9816a2e3c356c6c6f33c3fbda4c6c2a5414d01fed798fa2956aaf3c6224575ab9cc858398c32fe0f1af5640275ae64ef3aaf3644fa64697d453bdae4e42ea5358df", 16);

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "[Lclient!hi;")
	public static final Class122[] aClass122Array2 = new Class122[14];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!qf;I)V")
	public static void method4639(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class245 arg1) {
		@Pc(15) int local15 = arg1.anInt7287 == 0 ? arg1.anInt7249 : arg1.anInt7287;
		@Pc(27) int local27 = arg1.anInt7243 == 0 ? arg1.anInt7229 : arg1.anInt7243;
		Static176.method3399(local27, arg0, Static459.aClass245ArrayArray2[arg1.anInt7256 >> 16], arg1.anInt7256, local15);
		if (arg1.aClass245Array2 != null) {
			Static176.method3399(local27, arg0, arg1.aClass245Array2, arg1.anInt7256, local15);
		}
		@Pc(64) Class3_Sub29 local64 = (Class3_Sub29) Static156.aClass267_14.method6644((long) arg1.anInt7256);
		if (local64 != null) {
			Static64.method1306(local64.anInt5522, local27, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[FIIII)V")
	public static void method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static260.method4582(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static260.method4582(arg5)) {
			@Pc(31) int local31 = Static56.method1148(6408);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg1 >= arg5 ? arg5 : arg1;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg5 >> 1;
			@Pc(54) float[] local54 = arg2;
			@Pc(61) float[] local61 = new float[local31 * local52 * local48];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg1, arg5, 0, 6408, 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(81) int local81 = local31 * arg1;
				@Pc(83) float[] local83 = local61;
				for (@Pc(85) int local85 = 0; local85 < local31; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(95) int local95 = local81 + local85;
					for (@Pc(97) int local97 = 0; local97 < local52; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local48; local101++) {
							@Pc(107) float local107 = local54[local91];
							local91 += local31;
							@Pc(117) float local117 = local107 + local54[local91];
							@Pc(123) float local123 = local117 + local54[local95];
							local91 += local31;
							local95 += local31;
							@Pc(137) float local137 = local123 + local54[local95];
							local95 += local31;
							local61[local89] = local137 * 0.25F;
							local89 += local31;
						}
						local95 += local81;
						local91 += local81;
					}
				}
				local61 = local54;
				arg5 = local52;
				local54 = local83;
				arg1 = local48;
				local48 >>= 0x1;
				local44 >>= 0x1;
				local33++;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!aca;")
	public static Class4_Sub1 method4641(@OriginalArg(1) int arg0) {
		@Pc(7) Class90[] local7 = Class3_Sub1_Sub25.aClass90Array1;
		synchronized (Class3_Sub1_Sub25.aClass90Array1) {
			@Pc(27) Class4_Sub1 local27;
			if (Class3_Sub1_Sub25.aClass90Array1.length <= arg0 || Class3_Sub1_Sub25.aClass90Array1[arg0].method2320()) {
				local27 = new Class4_Sub1();
				local27.aClass4_Sub7Array1 = new Class4_Sub7[arg0];
				for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
					local27.aClass4_Sub7Array1[local33] = new Class4_Sub7();
				}
			} else {
				local27 = (Class4_Sub1) Class3_Sub1_Sub25.aClass90Array1[arg0].method2323();
				local27.method7407();
				@Pc(66) int local66 = Static162.anIntArray373[arg0]--;
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZJIBI)Ljava/lang/String;")
	public static String method4645(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local29 = true;
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg3 > 0) {
			for (local52 = 0; local52 < arg3; local52++) {
				local57 = (int) arg1;
				arg1 /= 10L;
				local45.append((char) (local57 + 48 - (int) arg1 * 10));
			}
			local45.append(local7);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg1;
			arg1 /= 10L;
			local45.append((char) (local57 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local29) {
					local45.append('-');
				}
				return local45.reverse().toString();
			}
			if (arg0) {
				local52++;
				if (local52 % 3 == 0) {
					local45.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;IIB)V")
	public static void method4646(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class245 local8 = Static80.method1631(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray24 != null) {
			@Pc(23) Class3_Sub21 local23 = new Class3_Sub21();
			local23.aClass245_8 = local8;
			local23.anObjectArray4 = local8.anObjectArray24;
			local23.anInt4195 = arg2;
			local23.aString34 = arg1;
			Static60.method1227(local23);
		}
		if (Static512.anInt8932 != 9 || !Static63.method1295(local8).method1759(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static278.method4791(Static374.aClass158_92);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 2) {
			Static278.method4791(Static66.aClass158_15);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 3) {
			Static278.method4791(Static129.aClass158_33);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 4) {
			Static278.method4791(Static322.aClass158_78);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 5) {
			Static278.method4791(Static132.aClass158_35);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 6) {
			Static278.method4791(Static419.aClass158_100);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 7) {
			Static278.method4791(Static429.aClass158_101);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 8) {
			Static278.method4791(Static284.aClass158_74);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 9) {
			Static278.method4791(Static399.aClass158_96);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
		if (arg2 == 10) {
			Static278.method4791(Static317.aClass158_76);
			Static130.method2267(arg3, arg0, local8.anInt7271);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I")
	public static int method4647() {
		return 16;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B[[BLclient!fda;)V")
	public static void method4648(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class85_Sub1 arg1) {
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt2722; local18++) {
			Static442.method6680();
			for (@Pc(24) int local24 = 0; local24 < Static118.anInt2527 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static549.anInt9482 >> 3; local28++) {
					@Pc(38) int local38 = Static109.anIntArrayArrayArray4[local18][local24][local28];
					if (local38 != -1) {
						@Pc(47) int local47 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean202 || local47 == 0) {
							@Pc(58) int local58 = local38 >> 1 & 0x3;
							@Pc(64) int local64 = local38 >> 14 & 0x3FF;
							@Pc(70) int local70 = local38 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static467.anIntArray715.length; local82++) {
								if (Static467.anIntArray715[local82] == local80 && arg0[local82] != null) {
									arg1.method2298(local58, local24 * 8, Static95.aClass306Array1, (local70 & 0x7) * 8, local18, local28 * 8, (local64 & 0x7) * 8, arg0[local82], local47, Static121.aClass5_7);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILclient!kea;)Lclient!or;")
	public static Class222 method4649(@OriginalArg(1) int arg0, @OriginalArg(3) Class161 arg1) {
		@Pc(9) byte[] local9 = arg1.method4243(0, arg0);
		return local9 == null ? null : new Class222(local9);
	}
}
