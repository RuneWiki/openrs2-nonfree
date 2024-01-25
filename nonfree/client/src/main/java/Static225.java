import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
	public static int anInt4391;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!hha", name = "l", descriptor = "I")
	public static int anInt4393 = 0;

	@OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
	public static int anInt4394 = 1;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIFIIIF[BILclient!kc;FIFF)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) byte[] arg4, @OriginalArg(9) Class11 arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(52) int local52;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg5.method168(local12, arg3 / (float) 128, arg2, arg8 * 127.0F, arg7 / (float) 16, arg1 / (float) 128, 0);
			local42 = arg0;
			arg3 *= 2.0F;
			arg1 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg4[local42] = (byte) (int) ((float) arg4[local42] + local12[local52]);
				local42++;
			}
			arg7 *= 2.0F;
			arg8 *= arg6;
		}
		local42 = arg0;
		for (local52 = 0; local52 < 16384; local52++) {
			arg4[local42] = (byte) (arg4[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!jka;I)I")
	public static int method4050(@OriginalArg(0) Class6_Sub2_Sub11 arg0) {
		@Pc(14) String local14 = Static104.method2009(arg0);
		@Pc(16) int[] local16 = null;
		if (Static536.method7655(arg0.anInt5173)) {
			local16 = Static149.aClass244_1.method5958((int) arg0.aLong169).anIntArray500;
		} else if (arg0.anInt5175 != -1) {
			local16 = Static149.aClass244_1.method5958(arg0.anInt5175).anIntArray500;
		} else if (Static67.method810(arg0.anInt5173)) {
			@Pc(49) Class6_Sub11 local49 = (Class6_Sub11) Static419.aClass74_45.method1401((long) (int) arg0.aLong169);
			if (local49 != null) {
				@Pc(54) Class60_Sub1_Sub1_Sub3_Sub2 local54 = local49.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				@Pc(57) Class294 local57 = local54.aClass294_1;
				if (local57.anIntArray511 != null) {
					local57 = local57.method7168(Static303.aClass55_2);
				}
				if (local57 != null) {
					local16 = local57.anIntArray513;
				}
			}
		} else if (Static635.method8594(arg0.anInt5173)) {
			@Pc(87) Class125 local87 = Static290.aClass163_5.method4124(119, (int) (arg0.aLong169 >>> 32 & 0x7FFFFFFFL));
			if (local87.anIntArray198 != null) {
				local87 = local87.method3383(Static303.aClass55_2);
			}
			if (local87 != null) {
				local16 = local87.anIntArray194;
			}
		}
		if (local16 != null) {
			local14 = local14 + Static170.method3325(local16);
		}
		@Pc(128) int local128 = Static228.aClass53_7.method822(Static532.aClass49Array14, local14);
		if (arg0.aBoolean394) {
			local128 += Static386.aClass49_27.method8988() + 4;
		}
		return local128;
	}
}
