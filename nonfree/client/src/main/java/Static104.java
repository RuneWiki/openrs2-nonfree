import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public static int anInt5551;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!se;")
	public static final Class179 aClass179_10 = new Class179(64);

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "[Lclient!rs;")
	public static final Class174[] aClass174Array3 = new Class174[29];

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "[I")
	public static final int[] anIntArray407 = new int[25];

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
	public static final int[] anIntArray408 = new int[4096];

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "[I")
	public static final int[] anIntArray409 = new int[256];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZI)V")
	public static void method4925(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static138.anInt2875--;
			if (Static138.anInt2875 == 0) {
				Static267.anIntArray400 = null;
			}
		}
		Static154.anInt6526--;
		if (Static154.anInt6526 == 0) {
			Static120.anIntArray232 = null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
	public static boolean method4926(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 15 || arg0 == 3 || arg0 == 13 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Lclient!kl;")
	public static Class62_Sub3 method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass62_Sub3_1 == null ? null : local7.aClass62_Sub3_1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!qr;[I[I[II)V")
	public static void method4928(@OriginalArg(0) Class62_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg2[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && local23 < arg0.aClass103Array3.length; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass103Array3[local23] = null;
					} else {
						@Pc(37) Class107 local37 = Static212.method3773(local13);
						@Pc(40) int local40 = local37.anInt3273;
						@Pc(45) Class103 local45 = arg0.aClass103Array3[local23];
						if (local45 != null) {
							if (local45.anInt3236 == local13) {
								if (local40 == 0) {
									local45 = arg0.aClass103Array3[local23] = null;
								} else if (local40 == 1) {
									local45.anInt3240 = 0;
									local45.anInt3241 = 0;
									local45.anInt3239 = 1;
									local45.anInt3242 = local21;
									local45.anInt3237 = 0;
									Static343.method5928(arg0 == Static41.aClass62_Sub1_Sub2_Sub2_2, local37, arg0.anInt5289, 0, arg0.anInt5280);
								} else if (local40 == 2) {
									local45.anInt3241 = 0;
								}
							} else if (local37.anInt3287 >= Static212.method3773(local45.anInt3236).anInt3287) {
								local45 = arg0.aClass103Array3[local23] = null;
							}
						}
						if (local45 == null) {
							local45 = arg0.aClass103Array3[local23] = new Class103();
							local45.anInt3236 = local13;
							local45.anInt3242 = local21;
							local45.anInt3240 = 0;
							local45.anInt3239 = 1;
							local45.anInt3241 = 0;
							local45.anInt3237 = 0;
							Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg0, local37, arg0.anInt5289, 0, arg0.anInt5280);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method4930() {
		if (Static326.aBoolean583) {
			return;
		}
		Static330.method5773(Static163.aClass8ArrayArrayArray2);
		if (Static227.aClass8ArrayArrayArray3 != null) {
			Static330.method5773(Static227.aClass8ArrayArrayArray3);
		}
		Static326.aBoolean583 = true;
	}
}
