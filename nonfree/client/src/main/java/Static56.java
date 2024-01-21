import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public static int anInt1777;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_3;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public static int anInt1776 = 0;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[8];

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_404 = Static158.method3034("Use");

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_405 = aClass60_404;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_406 = Static158.method3034("k");

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_407 = Static158.method3034("Please contact customer support)3");

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!ob;")
	public static Class60 aClass60_408 = aClass60_407;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JIZI)Lclient!ob;")
	public static Class60 method1330(@OriginalArg(0) long arg0) {
		@Pc(33) int local33 = 1;
		@Pc(38) long local38 = arg0 / (long) 10;
		while (local38 != 0L) {
			local38 /= 10;
			local33++;
		}
		@Pc(54) int local54 = local33;
		if (arg0 < 0L) {
			local54 = local33 + 1;
		}
		@Pc(64) byte[] local64 = new byte[local54];
		if (arg0 < 0L) {
			local64[0] = 45;
		}
		for (@Pc(84) int local84 = 0; local84 < local33; local84++) {
			@Pc(92) int local92 = (int) (arg0 % (long) 10);
			if (local92 < 0) {
				local92 = -local92;
			}
			if (local92 > 9) {
				local92 += 39;
			}
			arg0 /= 10;
			local64[local54 - local84 - 1] = (byte) (local92 + 48);
		}
		@Pc(135) Class60 local135 = new Class60();
		local135.aByteArray39 = local64;
		local135.anInt3466 = local54;
		return local135;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method1331() {
		for (@Pc(3) int local3 = 0; local3 < Static148.anInt3844; local3++) {
			@Pc(9) int local9 = Static113.anIntArray361[local3];
			@Pc(13) Class2_Sub1_Sub1_Sub3_Sub2 local13 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local9];
			@Pc(19) int local19 = Static139.aClass2_Sub3_Sub1_32.method218();
			@Pc(30) int local30;
			@Pc(34) int local34;
			if ((local19 & 0x8) != 0) {
				local30 = Static139.aClass2_Sub3_Sub1_32.method242();
				local34 = Static139.aClass2_Sub3_Sub1_32.method194();
				if (local30 == 65535) {
					local30 = -1;
				}
				if (local30 == local13.anInt3270 && local30 != -1) {
					@Pc(53) Class2_Sub1_Sub5 local53 = Static103.method2357(local30);
					@Pc(56) int local56 = local53.anInt794;
					if (local56 == 1) {
						local13.anInt3281 = 0;
						local13.anInt3261 = 0;
						local13.anInt3280 = local34;
						local13.anInt3290 = 0;
						Static9.method258(local13.anInt3302, local53, local13.anInt3290, false, local13.anInt3273);
					}
					if (local56 == 2) {
						local13.anInt3281 = 0;
					}
				} else if (local30 == -1 || local13.anInt3270 == -1 || Static103.method2357(local30).anInt786 >= Static103.method2357(local13.anInt3270).anInt786) {
					local13.anInt3305 = local13.anInt3254;
					local13.anInt3281 = 0;
					local13.anInt3270 = local30;
					local13.anInt3261 = 0;
					local13.anInt3290 = 0;
					local13.anInt3280 = local34;
					if (local13.anInt3270 != -1) {
						Static9.method258(local13.anInt3302, Static103.method2357(local13.anInt3270), local13.anInt3290, false, local13.anInt3273);
					}
				}
			}
			if ((local19 & 0x40) != 0) {
				local13.aClass60_919 = Static139.aClass2_Sub3_Sub1_32.method240();
				local13.anInt3300 = 100;
			}
			if ((local19 & 0x2) != 0) {
				local30 = Static139.aClass2_Sub3_Sub1_32.method218();
				local34 = Static139.aClass2_Sub3_Sub1_32.method201();
				local13.method2558(local30, Static20.anInt580, local34);
				local13.anInt3294 = Static20.anInt580 + 300;
				local13.anInt3282 = Static139.aClass2_Sub3_Sub1_32.method229();
			}
			if ((local19 & 0x80) != 0) {
				local13.anInt3291 = Static139.aClass2_Sub3_Sub1_32.method209();
				if (local13.anInt3291 == 65535) {
					local13.anInt3291 = -1;
				}
			}
			if ((local19 & 0x20) != 0) {
				local13.aClass2_Sub1_Sub2_1 = Static50.method1143(Static139.aClass2_Sub3_Sub1_32.method209());
				local13.anInt3278 = local13.aClass2_Sub1_Sub2_1.anInt347;
				local13.anInt3258 = local13.aClass2_Sub1_Sub2_1.anInt335;
				local13.anInt3279 = local13.aClass2_Sub1_Sub2_1.anInt319;
				local13.anInt3296 = local13.aClass2_Sub1_Sub2_1.anInt348;
				local13.anInt3286 = local13.aClass2_Sub1_Sub2_1.anInt343;
				local13.anInt3260 = local13.aClass2_Sub1_Sub2_1.anInt349;
				local13.anInt3289 = local13.aClass2_Sub1_Sub2_1.anInt342;
				local13.anInt3252 = local13.aClass2_Sub1_Sub2_1.anInt334;
				local13.anInt3268 = local13.aClass2_Sub1_Sub2_1.anInt333;
			}
			if ((local19 & 0x10) != 0) {
				local30 = Static139.aClass2_Sub3_Sub1_32.method194();
				local34 = Static139.aClass2_Sub3_Sub1_32.method218();
				local13.method2558(local30, Static20.anInt580, local34);
			}
			if ((local19 & 0x4) != 0) {
				local13.anInt3249 = Static139.aClass2_Sub3_Sub1_32.method242();
				local30 = Static139.aClass2_Sub3_Sub1_32.method233();
				local13.anInt3251 = local30 >> 16;
				if (local13.anInt3249 == 65535) {
					local13.anInt3249 = -1;
				}
				local13.anInt3306 = Static20.anInt580 + (local30 & 0xFFFF);
				local13.anInt3259 = 0;
				local13.anInt3297 = 0;
				if (local13.anInt3306 > Static20.anInt580) {
					local13.anInt3297 = -1;
				}
			}
			if ((local19 & 0x1) != 0) {
				local13.anInt3293 = Static139.aClass2_Sub3_Sub1_32.method209();
				local13.anInt3269 = Static139.aClass2_Sub3_Sub1_32.method192();
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZII)V")
	public static void method1332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg2) {
			Static163.method3070(arg1, arg2, arg3, Static42.anIntArrayArray8[arg0]);
		} else {
			Static163.method3070(arg2, arg1, arg3, Static42.anIntArrayArray8[arg0]);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ra;B)V")
	public static void method1333(@OriginalArg(0) Class72 arg0) {
		@Pc(2) int local2 = arg0.anInt3884;
		if (local2 == 324) {
			if (Static94.anInt2813 == -1) {
				Static155.anInt3944 = arg0.anInt3864;
				Static94.anInt2813 = arg0.anInt3861;
			}
			if (Static130.aClass32_2.aBoolean88) {
				arg0.anInt3861 = Static94.anInt2813;
			} else {
				arg0.anInt3861 = Static155.anInt3944;
			}
		} else if (local2 == 325) {
			if (Static94.anInt2813 == -1) {
				Static94.anInt2813 = arg0.anInt3861;
				Static155.anInt3944 = arg0.anInt3864;
			}
			if (Static130.aClass32_2.aBoolean88) {
				arg0.anInt3861 = Static155.anInt3944;
			} else {
				arg0.anInt3861 = Static94.anInt2813;
			}
		} else if (local2 == 327) {
			arg0.anInt3865 = 150;
			arg0.anInt3881 = (int) (Math.sin((double) Static20.anInt580 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3891 = -1;
			arg0.anInt3885 = 5;
		} else if (local2 == 328) {
			if (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288 == null) {
				arg0.anInt3891 = 0;
			} else {
				arg0.anInt3865 = 150;
				arg0.anInt3881 = (int) (Math.sin((double) Static20.anInt580 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3885 = 5;
				arg0.anInt3891 = ((int) Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass60_288.method2691() << 11) + 2047;
				arg0.anInt3941 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3301;
				arg0.anInt3923 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3250;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(DI)V")
	public static void method1335(@OriginalArg(0) double arg0) {
		if (arg0 == Static162.aDouble9) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static174.anIntArray463[local11] = local23 <= 255 ? local23 : 255;
		}
		Static162.aDouble9 = arg0;
	}
}
