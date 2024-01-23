import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!rn;")
	public static Class155 aClass155_105;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "Lclient!uh;")
	public static Class178 aClass178_5;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "Lclient!uf;")
	public static Class138 aClass138_2 = Static105.method1681();

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
	public static int anInt5202 = 0;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "[I")
	public static int[] anIntArray544 = new int[5];

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString180 = " more options";

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
	public static int anInt5204 = 255;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	public static void method4256() {
		Static274.aClass98_44.method2571();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ua;)V")
	public static void method4258(@OriginalArg(1) Class176 arg0) {
		Static251.anInt5174 = 3;
		@Pc(9) Class70 local9 = null;
		Static48.method761(true);
		anInt5204 = 255;
		Static76.aBoolean127 = true;
		Static268.anInt5481 = 0;
		Static241.aBoolean341 = true;
		Static132.anInt2491 = 0;
		Static201.aBoolean280 = true;
		Static110.aBoolean160 = true;
		Static66.aBoolean94 = true;
		Static67.aBoolean95 = true;
		Static187.anInt3701 = 0;
		Static177.anInt3306 = 127;
		Static120.anInt2254 = 0;
		Static86.anInt1599 = 2;
		Static40.aBoolean431 = true;
		Static258.aBoolean367 = true;
		Static305.anInt6006 = 127;
		Static218.aBoolean307 = true;
		Static199.aBoolean275 = true;
		Static315.aBoolean435 = true;
		if (Static258.anInt5304 >= 96) {
			Static71.method1077(2);
		} else {
			Static71.method1077(0);
		}
		Static247.aBoolean348 = false;
		Static255.anInt5254 = 0;
		Static27.anInt489 = 0;
		Static19.aBoolean34 = false;
		Static57.aBoolean82 = true;
		Static224.anInt6084 = 0;
		Static17.aBoolean31 = false;
		try {
			@Pc(83) Class178 local83 = arg0.method4511("runescape");
			while (local83.anInt5649 == 0) {
				Static150.method2552(1L);
			}
			if (local83.anInt5649 == 1) {
				local9 = (Class70) local83.anObject6;
				@Pc(107) byte[] local107 = new byte[(int) local9.method1686()];
				@Pc(123) int local123;
				for (@Pc(109) int local109 = 0; local109 < local107.length; local109 += local123) {
					local123 = local9.method1689(local107.length - local109, local109, local107);
					if (local123 == -1) {
						throw new IOException("EOF");
					}
				}
				Static87.method3726(new Class3_Sub26(local107));
			}
		} catch (@Pc(145) Exception local145) {
		}
		try {
			if (local9 != null) {
				local9.method1687();
			}
		} catch (@Pc(156) Exception local156) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	public static void method4259() {
		Static217.aClass98_37.method2565(5);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[I[I[ILclient!sd;)V")
	public static void method4260(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class10_Sub5_Sub2 arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(20) int local20 = arg2[local12];
			@Pc(24) int local24 = arg1[local12];
			@Pc(28) int local28 = arg0[local12];
			for (@Pc(30) int local30 = 0; local24 != 0 && local30 < arg3.aClass145Array3.length; local30++) {
				if ((local24 & 0x1) != 0) {
					if (local20 == -1) {
						arg3.aClass145Array3[local30] = null;
					} else {
						@Pc(61) Class15 local61 = Static253.method4288(local20);
						@Pc(64) int local64 = local61.anInt412;
						@Pc(69) Class145 local69 = arg3.aClass145Array3[local30];
						if (local69 != null) {
							if (local69.anInt4347 == local20) {
								if (local64 == 0) {
									local69 = arg3.aClass145Array3[local30] = null;
								} else if (local64 == 1) {
									local69.anInt4345 = 1;
									local69.anInt4348 = local28;
									local69.anInt4350 = 0;
									local69.anInt4346 = 0;
									local69.anInt4341 = 0;
									Static158.method2622(arg3.anInt5073, 0, local61, false, arg3.anInt5016);
								} else if (local64 == 2) {
									local69.anInt4346 = 0;
								}
							} else if (local61.anInt420 >= Static253.method4288(local69.anInt4347).anInt420) {
								local69 = arg3.aClass145Array3[local30] = null;
							}
						}
						if (local69 == null) {
							local69 = arg3.aClass145Array3[local30] = new Class145();
							local69.anInt4347 = local20;
							local69.anInt4348 = local28;
							local69.anInt4341 = 0;
							local69.anInt4350 = 0;
							local69.anInt4346 = 0;
							local69.anInt4345 = 1;
							Static158.method2622(arg3.anInt5073, 0, local61, false, arg3.anInt5016);
						}
					}
				}
				local24 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!kk;)V")
	public static void method4261(@OriginalArg(1) Class81_Sub2 arg0) {
		@Pc(3) int local3;
		for (local3 = 0; local3 < Static33.anIntArray50.length; local3++) {
			Static33.anIntArray50[local3] = 0;
		}
		@Pc(35) int local35;
		for (local3 = 0; local3 < 5000; local3++) {
			local35 = (int) (Math.random() * 128.0D * (double) 256);
			Static33.anIntArray50[local35] = (int) (Math.random() * 284.0D);
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(76) int local76;
		for (local3 = 0; local3 < 20; local3++) {
			for (local60 = 1; local60 < 255; local60++) {
				for (local67 = 1; local67 < 127; local67++) {
					local76 = local67 + (local60 << 7);
					Static36.anIntArray57[local76] = (Static33.anIntArray50[local76 - 128] + Static33.anIntArray50[local76 - 1] + Static33.anIntArray50[local76 + 1] + Static33.anIntArray50[local76 + 128]) / 4;
				}
			}
			@Pc(113) int[] local113 = Static33.anIntArray50;
			Static33.anIntArray50 = Static36.anIntArray57;
			Static36.anIntArray57 = local113;
		}
		if (arg0 == null) {
			return;
		}
		local3 = 0;
		for (local35 = 0; local35 < arg0.anInt2796; local35++) {
			for (local60 = 0; local60 < arg0.anInt2797; local60++) {
				if (arg0.aByteArray38[local3++] != 0) {
					local67 = local60 + arg0.anInt2801 + 16;
					local76 = local35 + arg0.anInt2798 + 16;
					@Pc(174) int local174 = (local76 << 7) + local67;
					Static33.anIntArray50[local174] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Z)I")
	public static int method4262() {
		if ((double) Static228.aFloat18 == 3.0D) {
			return 37;
		} else if ((double) Static228.aFloat18 == 4.0D) {
			return 50;
		} else if ((double) Static228.aFloat18 == 6.0D) {
			return 75;
		} else if ((double) Static228.aFloat18 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BJ)V")
	public static void method4263(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(14) InterruptedException local14) {
		}
	}
}
