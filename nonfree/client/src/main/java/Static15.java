import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Lclient!ef;")
	public static Class16 aClass16_22;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Lclient!he;")
	public static Class26 aClass26_237 = Static6.method100("Welt");

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "Lclient!he;")
	public static Class26 aClass26_238 = Static6.method100("Stufe)2");

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "[Lclient!eb;")
	public static Class16_Sub1[] aClass16_Sub1Array1 = new Class16_Sub1[256];

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
	public static int anInt403 = 0;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "Lclient!he;")
	private static Class26 aClass26_239 = Static6.method100("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "Lclient!he;")
	public static Class26 aClass26_240 = aClass26_239;

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
	public static int anInt408 = -1;

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "[I")
	public static int[] anIntArray53 = new int[5];

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	public static void method263() {
		@Pc(9) int local9 = Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4.method1600(Static39.aClass26_641);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static56.anInt1695; local11++) {
			local19 = Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4.method1600(Static91.method1672(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		Static69.anInt2516 = Static56.anInt1695 * 15 + 22;
		Static109.aBoolean162 = true;
		local9 += 8;
		@Pc(51) int local51 = Static59.anInt1803 - local9 / 2;
		Static103.anInt2776 = local9;
		if (local51 + local9 > 765) {
			local51 = 765 - local9;
		}
		@Pc(67) int local67 = Static19.anInt514;
		local19 = Static56.anInt1695 * 15 + 21;
		if (local51 < 0) {
			local51 = 0;
		}
		if (local67 + local19 > 503) {
			local67 = 503 - local19;
		}
		Static118.anInt3105 = local51;
		if (local67 < 0) {
			local67 = 0;
		}
		Static7.anInt188 = local67;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
	public static void method264() {
		anIntArrayArray4 = null;
		aClass26_237 = null;
		anIntArray53 = null;
		aClass26_239 = null;
		anIntArrayArrayArray1 = null;
		aClass26_240 = null;
		aClass16_22 = null;
		aClass26_238 = null;
		aClass16_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II[Lclient!ac;[BIIIZII)V")
	public static void method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if (local8 + arg5 > 0 && arg5 + local8 < 103 && local12 + arg7 > 0 && arg7 + local12 < 103) {
					arg2[arg8].anIntArrayArray1[arg5 + local8][arg7 + local12] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(92) Class3_Sub11 local92 = new Class3_Sub11(arg3);
		for (@Pc(94) int local94 = 0; local94 < 4; local94++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					if (local94 == arg1 && arg0 <= local98 && local98 < arg0 + 8 && local102 >= arg6 && arg6 + 8 > local102) {
						Static132.method2269(arg8, arg5 + Static29.method607(local98 & 0x7, local102 & 0x7, arg4), arg7 + Static32.method632(local102 & 0x7, arg4, local98 & 0x7), local92, 0, 0, arg4);
					} else {
						Static132.method2269(0, -1, -1, local92, 0, 0, 0);
					}
				}
			}
		}
	}
}
