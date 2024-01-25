import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public static int anInt7531;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public static int anInt7527 = 0;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public static final int anInt7528 = 205;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_247 = new Class175("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public static int anInt7529 = 0;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
	public static int anInt7530 = 0;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_251 = new Class92(9, -1);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIFIFF[BIFLclient!qi;IFI)V")
	public static void method5914(@OriginalArg(3) float arg0, @OriginalArg(5) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) Class10 arg6, @OriginalArg(12) float arg7, @OriginalArg(13) int arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(57) int local57;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			@Pc(15) int local15 = arg4;
			arg6.method407(arg0 / (float) 128, arg8, arg7 / (float) 128, arg1 * 127.0F, local10, arg5 / (float) 16, 0);
			arg1 *= arg2;
			arg0 *= 2.0F;
			arg5 *= 2.0F;
			arg7 *= 2.0F;
			for (local57 = 0; local57 < 16384; local57++) {
				arg3[local15] = (byte) ((float) arg3[local15] + local10[local57]);
				local15++;
			}
		}
		local57 = arg4;
		for (@Pc(91) int local91 = 0; local91 < 16384; local91++) {
			arg3[local57] = (byte) (arg3[local57] + 127);
			local57++;
		}
	}
}
