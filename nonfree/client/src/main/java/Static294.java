import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Lclient!kl;")
	public static Class175 aClass175_3;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_66 = new Class160(52, 8);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII[I[ILclient!sv;)Lclient!ap;")
	public static Class16_Sub1 method4108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class121_Sub2 arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg4.method7169(Static490.aClass214_14, Static108.aClass82_8)) {
			@Pc(21) int[] local21 = new int[arg1 * arg0];
			for (local23 = 0; local23 < arg1; local23++) {
				local34 = local23 * arg0 + arg3[local23];
				for (local36 = 0; local36 < arg2[local23]; local36++) {
					local21[local34++] = -16777216;
				}
			}
			return new Class16_Sub1(arg4, arg0, arg1, local21);
		}
		@Pc(70) byte[] local70 = new byte[arg1 * arg0];
		for (local23 = 0; local23 < arg1; local23++) {
			local34 = local23 * arg0 + arg3[local23];
			for (local36 = 0; local36 < arg2[local23]; local36++) {
				local70[local34++] = -1;
			}
		}
		return new Class16_Sub1(arg4, arg0, arg1, local70);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIBZILclient!fq;I)V")
	public static void method4111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class108 arg4, @OriginalArg(6) int arg5) {
		if (Static231.anInt3927 >= 50 || (arg4 == null || arg4.anIntArrayArray37 == null || arg0 >= arg4.anIntArrayArray37.length || arg4.anIntArrayArray37[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg4.anIntArrayArray37[arg0][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(47) int local47 = local32 >> 5 & 0x7;
		@Pc(51) int local51 = local32 & 0x1F;
		@Pc(68) int local68;
		if (arg4.anIntArrayArray37[arg0].length > 1) {
			local68 = (int) (Math.random() * (double) arg4.anIntArrayArray37[arg0].length);
			if (local68 > 0) {
				local36 = arg4.anIntArrayArray37[arg0][local68];
			}
		}
		if (local51 == 0) {
			if (arg2) {
				if (!arg4.aBoolean176) {
					Static533.method7409(255, local36, local47, 0);
					return;
				}
				Static370.method5428(local36, false, 0, 255, local47);
			}
		} else if (Static480.aClass6_Sub37_Sub1_1.anInt6058 != 0) {
			local68 = arg3 - 256 >> 9;
			@Pc(118) int local118 = arg1 - 256 >> 9;
			Static103.aClass172Array7[Static231.anInt3927++] = new Class172((byte) (arg4.aBoolean176 ? 2 : 1), local36, local47, 0, 255, (local118 << 8) + (arg5 << 24) + (local68 << 16) + local51);
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	public static void method4113() {
		Static117.method1790();
	}
}
