import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Z")
	public static boolean aBoolean104 = true;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZIIIIBII)V")
	public static void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (Static154.aClass53_Sub1_Sub1_2.method3324() == 2) {
			Static226.method418(arg8, arg3, arg5, arg6, arg0, arg4, arg1, arg2, arg7);
		} else if (Static154.aClass53_Sub1_Sub1_2.method3324() > 2) {
			Static131.method1999(arg6, arg8, arg0, arg3, arg5, arg7, arg4, arg2, Static154.aClass53_Sub1_Sub1_2.method3324(), arg1);
		} else {
			Static143.method2198(arg5, arg8, arg7, arg1, arg4, arg6, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	public static void method1338() {
		@Pc(8) int[] local8 = new int[Static188.anInt6076];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static188.anInt6076; local12++) {
			@Pc(23) Class165 local23 = Static287.method4398(local12);
			if (local23.anInt5082 >= 0 || local23.anInt5091 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static263.anIntArray545 = new int[local10];
		for (local12 = 0; local12 < local10; local12++) {
			Static263.anIntArray545[local12] = local8[local12];
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIII)I")
	public static int method1339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + (arg0 >> 2 << 10);
	}
}
