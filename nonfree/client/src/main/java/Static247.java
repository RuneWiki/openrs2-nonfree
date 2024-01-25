import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Lclient!ek;")
	public static final Class67 aClass67_24 = new Class67(16);

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Lclient!tf;")
	public static final Class4_Sub9_Sub2 aClass4_Sub9_Sub2_2 = new Class4_Sub9_Sub2(5000);

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method3253(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(16) byte[] local16 = new byte[24];
		if (Static37.aClass142_2 != null) {
			@Pc(28) int local28;
			try {
				Static37.aClass142_2.method2808(0L);
				Static37.aClass142_2.method2809(local16);
				for (local28 = 0; local28 < 24 && local16[local28] == 0; local28++) {
				}
				if (local28 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(53) Exception local53) {
				for (local28 = 0; local28 < 24; local28++) {
					local16[local28] = -1;
				}
			}
		}
		arg0.method5052(24, local16);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IFFFIIII)[F")
	public static float[] method3254(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg6 / 32767.0F;
		@Pc(88) float local88 = 1.0F - local83;
		@Pc(99) float local99 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local110 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local78 = (float) arg5 / local110;
				local76 = (float) -arg4 / local110;
			}
			local74[3] = local99 * -local78;
			local74[6] = local78 * local76 * local88;
			local74[0] = local88 * local76 * local76 + local83;
			local74[4] = local83;
			local74[2] = local88 * local76 * local78;
			local74[1] = local99 * local78;
			local74[7] = local99 * -local76;
			local74[8] = local78 * local78 * local88 + local83;
			local74[5] = local99 * local76;
			local9[0] = local74[0] * local6[0] + local6[1] * local74[3] + local74[6] * local6[2];
			local9[1] = local6[2] * local74[7] + local74[1] * local6[0] + local6[1] * local74[4];
			local9[3] = local74[6] * local6[5] + local74[0] * local6[3] + local74[3] * local6[4];
			local9[2] = local74[5] * local6[1] + local74[2] * local6[0] + local74[8] * local6[2];
			local9[4] = local6[5] * local74[7] + local6[4] * local74[4] + local6[3] * local74[1];
			local9[6] = local74[6] * local6[8] + local74[3] * local6[7] + local6[6] * local74[0];
			local9[5] = local74[8] * local6[5] + local6[4] * local74[5] + local6[3] * local74[2];
			local9[7] = local74[4] * local6[7] + local6[6] * local74[1] + local6[8] * local74[7];
			local9[8] = local6[7] * local74[5] + local6[6] * local74[2] + local6[8] * local74[8];
		}
		local9[0] *= arg1;
		local9[7] *= arg3;
		local9[4] *= arg2;
		local9[2] *= arg1;
		local9[1] *= arg1;
		local9[8] *= arg3;
		local9[6] *= arg3;
		local9[3] *= arg2;
		local9[5] *= arg2;
		return local9;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!hd;III)V")
	public static void method3255(@OriginalArg(0) Class110 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray3 != null) {
			@Pc(20) Class4_Sub34 local20 = new Class4_Sub34();
			local20.anObjectArray34 = arg0.anObjectArray3;
			local20.aClass110_14 = arg0;
			Static80.method1289(local20);
		}
		Static70.aBoolean94 = true;
		Static134.anInt2452 = arg1;
		Static81.anInt1601 = arg0.anInt2588;
		Static270.anInt4512 = arg0.anInt2585;
		Static111.anInt2085 = arg0.anInt2594;
		Static259.anInt4347 = arg0.anInt2675;
		Static340.anInt5535 = arg0.anInt2613;
		Static115.anInt2115 = arg2;
		Static118.method1693(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
	public static byte[] method3256(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(19) byte[] local19 = (byte[]) arg1;
			return Static442.method5540(local19, arg0);
		} else if (arg1 instanceof Class22) {
			@Pc(31) Class22 local31 = (Class22) arg1;
			return local31.method424(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
