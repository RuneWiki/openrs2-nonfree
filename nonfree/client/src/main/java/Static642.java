import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
	public static int anInt10085;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "F")
	public static float aFloat230 = 0.0F;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	public static int anInt10087 = -1;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	public static int anInt10095 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([I[IIIILclient!pc;)Lclient!gh;")
	public static Class1_Sub1 method8555(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33_Sub3 arg4) {
		@Pc(28) byte[] local28 = new byte[arg2 * arg3];
		for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
			@Pc(41) int local41 = local30 * arg2 + arg0[local30];
			for (@Pc(43) int local43 = 0; local43 < arg1[local30]; local43++) {
				local28[local41++] = -1;
			}
		}
		return new Class1_Sub1(arg4, arg2, arg3, local28);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIFFFFLclient!fba;IIII[BIF)V")
	public static void method8556(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) Class107 arg4, @OriginalArg(7) int arg5, @OriginalArg(10) int arg6, @OriginalArg(11) byte[] arg7, @OriginalArg(13) float arg8) {
		@Pc(30) float[] local30 = new float[16384];
		@Pc(60) int local60;
		@Pc(78) int local78;
		for (@Pc(32) int local32 = 0; local32 < 8; local32++) {
			arg4.method7911(arg3 * 127.0F, 0, arg8 / (float) 16, arg1 / (float) 128, local30, arg5, arg2 / (float) 128);
			local60 = arg6;
			arg2 *= 2.0F;
			arg3 *= arg0;
			arg8 *= 2.0F;
			arg1 *= 2.0F;
			for (local78 = 0; local78 < 16384; local78++) {
				arg7[local60] = (byte) (int) ((float) arg7[local60] + local30[local78]);
				local60++;
			}
		}
		local60 = arg6;
		for (local78 = 0; local78 < 16384; local78++) {
			arg7[local60] -= -127;
			local60++;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
	public static void method8558() {
		Static415.aClass217_6.method4672();
		Static14.aClass160_1.method3542();
		Static511.aClass254_1.method5197();
		Static441.aClass74_169.method2078();
		Static255.aClass380_1.method8600();
		Static532.aClass255_2.method5213();
		Static99.aClass2_1.method25();
		Static341.aClass349_1.method7601();
		Static110.aClass184_1.method4125();
		Static522.aClass365_1.method8033();
		Static315.aClass135_1.method3029();
		Static116.aClass177_1.method3978();
		Static623.aClass132_4.method2917();
		Static526.aClass59_4.method1796();
		Static431.aClass39_1.method1308();
		Static482.aClass84_2.method2150();
		Static153.aClass344_1.method7524();
		Static422.aClass273_1.method6187();
		Static270.aClass299_1.method6599();
		Static87.aClass32_1.method1029();
		Static536.aClass148_1.method3262();
		Static204.aClass361_1.method7870();
		Static338.method4622();
		Static143.method2494();
		Static384.method4981();
		Static268.method3817();
		Static64.method1425();
		Static307.aClass352_65.method7656();
		Static618.aClass352_70.method7656();
		Static158.aClass352_71.method7656();
		Static602.aClass352_68.method7656();
		Static237.aClass352_33.method7656();
	}
}
