import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
	public static int anInt913;

	@OriginalMember(owner = "client!cf", name = "T", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
	public static int anInt918;

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
	public static int anInt911 = 0;

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
	public static int anInt912 = 0;

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
	public static int anInt915 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([Lclient!fd;IZ)V")
	public static void method769(@OriginalArg(0) Class72[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class72 local13 = arg0[local7];
			if (local13 != null && local13.anInt1813 == arg1 && (!local13.aBoolean159 || !Static46.method886(local13))) {
				if (local13.anInt1825 == 0) {
					if (!local13.aBoolean159 && Static46.method886(local13) && Static55.aClass72_4 != local13) {
						continue;
					}
					method769(arg0, local13.anInt1830);
					if (local13.aClass72Array1 != null) {
						method769(local13.aClass72Array1, local13.anInt1830);
					}
					@Pc(66) Class4_Sub8 local66 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local13.anInt1830);
					if (local66 != null) {
						Static220.method3777(local66.anInt1670);
					}
				}
				if (local13.anInt1825 == 6) {
					@Pc(94) int local94;
					if (local13.anInt1836 != -1 || local13.anInt1866 != -1) {
						@Pc(89) boolean local89 = Static218.method3765(local13);
						if (local89) {
							local94 = local13.anInt1866;
						} else {
							local94 = local13.anInt1836;
						}
						if (local94 != -1) {
							@Pc(106) Class116 local106 = Static340.method5560(local94);
							if (local106 != null) {
								local13.anInt1832 += Static106.anInt2370;
								while (local13.anInt1832 > local106.anIntArray329[local13.anInt1808]) {
									local13.anInt1832 -= local106.anIntArray329[local13.anInt1808];
									local13.anInt1808++;
									if (local13.anInt1808 >= local106.anIntArray330.length) {
										local13.anInt1808 -= local106.anInt3753;
										if (local13.anInt1808 < 0 || local13.anInt1808 >= local106.anIntArray330.length) {
											local13.anInt1808 = 0;
										}
									}
									local13.anInt1821 = local13.anInt1808 + 1;
									if (local13.anInt1821 >= local106.anIntArray330.length) {
										local13.anInt1821 -= local106.anInt3753;
										if (local13.anInt1821 < 0 || local13.anInt1821 >= local106.anIntArray330.length) {
											local13.anInt1821 = -1;
										}
									}
									Static238.method4097(local13);
								}
							}
						}
					}
					if (local13.anInt1828 != 0 && !local13.aBoolean159) {
						@Pc(227) int local227 = local13.anInt1828 >> 16;
						@Pc(231) int local231 = local227 * Static106.anInt2370;
						local94 = local13.anInt1828 << 16 >> 16;
						local13.anInt1817 = local13.anInt1817 + local231 & 0x3FFF;
						local94 *= Static106.anInt2370;
						local13.anInt1867 = local94 + local13.anInt1867 & 0x3FFF;
						Static238.method4097(local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
	public static void method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class86 local3 = new Class86();
		local3.anInt2423 = arg1 >> 7;
		local3.anInt2422 = arg2 >> 7;
		local3.anInt2428 = arg3 >> 7;
		local3.anInt2429 = arg4 >> 7;
		local3.anInt2415 = arg0;
		local3.anInt2413 = arg1;
		local3.anInt2426 = arg2;
		local3.anInt2412 = arg3;
		local3.anInt2417 = arg4;
		local3.anInt2419 = arg5;
		local3.anInt2425 = arg6;
		Static183.aClass86Array2[Static281.anInt5702++] = local3;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	public static void method772() {
		if (Static135.aBoolean259) {
			return;
		}
		if (Static166.aBoolean307) {
			Static138.aFloat35 = (int) Static138.aFloat35 + 191 & 0xFFFFFF80;
		} else {
			Static229.aFloat44 += (24.0F - Static229.aFloat44) / 2.0F;
		}
		Static135.aBoolean259 = true;
		Static275.aBoolean495 = true;
	}
}
