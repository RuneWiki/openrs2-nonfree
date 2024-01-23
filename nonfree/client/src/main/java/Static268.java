import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "Lclient!km;")
	public static Class91 aClass91_193;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
	public static int anInt5247;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(35) int local35 = (Static150.aShort26 - Static137.aShort23) * local7 / 100 + Static137.aShort23;
		@Pc(41) int local41 = arg3 * local35 >> 8;
		@Pc(48) int local48 = 2048 - arg0 & 0x7FF;
		@Pc(54) int local54 = 2048 - arg1 & 0x7FF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local41;
		@Pc(70) int local70;
		@Pc(81) int local81;
		if (local54 != 0) {
			local70 = Class68.anIntArray229[local54];
			local58 = local70 * -local41 >> 16;
			local81 = Class68.anIntArray226[local54];
			local60 = local41 * local81 >> 16;
		}
		if (local48 != 0) {
			local81 = Class68.anIntArray226[local48];
			local70 = Class68.anIntArray229[local48];
			local56 = local70 * local60 >> 16;
			local60 = local81 * local60 >> 16;
		}
		Static91.anInt2040 = arg0;
		Static69.anInt1504 = arg4 - local56;
		Static134.anInt2950 = arg1;
		Static297.anInt5618 = arg5 - local58;
		Static239.anInt4738 = arg6 - local60;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!fj;I)V")
	public static void method4065(@OriginalArg(0) Class14_Sub2_Sub1 arg0) {
		@Pc(20) Class1_Sub8 local20 = (Class1_Sub8) Static179.aClass70_12.method2075(Static93.method1658(arg0.aString99));
		if (local20 == null) {
			Static84.method1471(Static140.anInt3034, arg0.anIntArray418[0], 0, arg0, arg0.anIntArray415[0], null, null);
		} else {
			local20.method364();
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
	public static void method4067() {
		if (Static116.anInt5593 != -1) {
			Static218.method3440(Static116.anInt5593);
		}
		for (@Pc(13) int local13 = 0; local13 < Static270.anInt5273; local13++) {
			if (Static272.aBooleanArray50[local13]) {
				Static78.aBooleanArray17[local13] = true;
			}
			Static44.aBooleanArray15[local13] = Static272.aBooleanArray50[local13];
			Static272.aBooleanArray50[local13] = false;
		}
		Static104.anInt2455 = -1;
		if (Static277.aBoolean412) {
			Static129.aBoolean215 = true;
		}
		Static183.anInt4433 = -1;
		Static207.anInt4872 = Static237.anInt4710;
		Static222.aClass71_19 = null;
		if (Static116.anInt5593 != -1) {
			Static270.anInt5273 = 0;
			Static48.method933();
		}
		if (Static277.aBoolean412) {
			Static41.method842();
		} else {
			Static50.method952();
		}
		Static129.anInt2881 = 0;
	}
}
