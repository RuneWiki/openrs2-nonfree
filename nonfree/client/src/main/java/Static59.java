import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "J")
	public static long aLong44;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Lclient!mb;")
	public static Class70 aClass70_16;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "[I")
	public static int[] anIntArray87 = new int[32];

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "[S")
	public static short[] aShortArray11 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_420 = Static64.method1101("overlay)3dat");

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
	public static int[] anIntArray88 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method1033() {
		if (Static192.aClass11_36 != null) {
			Static192.aClass11_36.method271();
			Static192.aClass11_36 = null;
		}
		Static150.method2572();
		Static3.method66();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static228.aClass90Array1[local17].method2703();
		}
		Static18.method383();
		System.gc();
		Static226.method3703();
		Static178.aBoolean183 = false;
		Static69.anInt1577 = -1;
		Static122.method2152(true);
		Static118.anInt2541 = 0;
		Static65.aBoolean70 = false;
		Static198.anInt4217 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static36.aClass104Array1.length; local58++) {
			Static36.aClass104Array1[local58] = null;
		}
		Static58.anInt1372 = 0;
		Static118.anInt2542 = 0;
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static191.aClass5_Sub1_Sub1Array1[local75] = null;
			Static78.aClass1_Sub16Array1[local75] = null;
		}
		for (@Pc(93) int local93 = 0; local93 < 32768; local93++) {
			Static168.aClass5_Sub1_Sub2Array1[local93] = null;
		}
		Static142.method2482(8);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BIIZIII[Lclient!q;II)V")
	public static void method1034(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class90[] arg7, @OriginalArg(10) int arg8) {
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if (arg6 + local13 > 0 && arg6 + local13 < 103 && arg8 + local17 > 0 && local17 + arg8 < 103) {
					arg7[arg4].anIntArrayArray22[arg6 + local13][local17 + arg8] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(96) Class1_Sub16 local96 = new Class1_Sub16(arg1);
		for (@Pc(102) int local102 = 0; local102 < 4; local102++) {
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				for (@Pc(110) int local110 = 0; local110 < 64; local110++) {
					if (local102 == arg3 && local106 >= arg5 && local106 < arg5 + 8 && arg2 <= local110 && arg2 + 8 > local110) {
						Static13.method266(arg8 + Static105.method1797(arg0, local106 & 0x7, local110 & 0x7), arg4, Static136.method2049(local110 & 0x7, arg0, local106 & 0x7) + arg6, local96, arg0, 0, 0);
					} else {
						Static13.method266(-1, 0, -1, local96, 0, 0, 0);
					}
				}
			}
		}
	}
}
