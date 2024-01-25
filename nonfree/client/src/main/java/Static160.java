import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "Lclient!q;")
	public static Class204_Sub1 aClass204_Sub1_1;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_45 = new Class231("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "[S")
	public static short[] aShortArray47 = new short[256];

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "Lclient!um;")
	public static final Class6_Sub41 aClass6_Sub41_1 = new Class6_Sub41(0, 0);

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_45 = new Class186(42, 3);

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
	public static final int[] anIntArray265 = new int[500];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FI[BFILclient!gg;IIFIFFII)V")
	public static void method2634(@OriginalArg(0) float arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7, @OriginalArg(13) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(60) int local60;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg4.method3212(arg7 / (float) 128, arg6 / (float) 128, 0, local12, arg2 * 127.0F, arg8, arg0 / (float) 16);
			local42 = arg3;
			arg0 *= 2.0F;
			arg6 *= 2.0F;
			arg7 *= 2.0F;
			arg2 *= arg5;
			for (local60 = 0; local60 < 16384; local60++) {
				arg1[local42] = (byte) ((float) arg1[local42] + local12[local60]);
				local42++;
			}
		}
		local42 = arg3;
		for (local60 = 0; local60 < 16384; local60++) {
			arg1[local42] = (byte) (arg1[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2635(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!lt;Lclient!vl;)V")
	public static void method2637(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Interface11 arg1) {
		Static314.aClass158_89 = arg0;
		Static213.anInterface11_5 = arg1;
	}
}
