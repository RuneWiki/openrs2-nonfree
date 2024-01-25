import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
	public static int anInt2682;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
	public static int anInt2691;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "[I")
	public static final int[] anIntArray137 = new int[200];

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	public static int anInt2687 = 0;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_92 = new Class151("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_116 = new Class137(15, 8);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(FIZIFLclient!uv;FFIIFI[BI)V")
	public static void method2235(@OriginalArg(0) float arg0, @OriginalArg(4) float arg1, @OriginalArg(5) Class10 arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6, @OriginalArg(11) int arg7, @OriginalArg(12) byte[] arg8) {
		@Pc(16) float[] local16 = new float[16384];
		@Pc(22) int local22;
		@Pc(56) int local56;
		for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
			local22 = arg5;
			arg2.method211(arg7, 0, local16, arg1 / (float) 128, arg6 / (float) 16, arg4 / (float) 128, arg0 * 127.0F);
			arg4 *= 2.0F;
			arg1 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg8[local22] = (byte) ((float) arg8[local22] + local16[local56]);
				local22++;
			}
			arg6 *= 2.0F;
			arg0 *= arg3;
		}
		local22 = arg5;
		for (local56 = 0; local56 < 16384; local56++) {
			arg8[local22] = (byte) (arg8[local22] + 127);
			local22++;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public static void method2237() {
		Static37.aClass167_15.method3390();
	}
}
