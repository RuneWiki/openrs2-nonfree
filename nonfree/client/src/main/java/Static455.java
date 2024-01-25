import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
	public static int anInt7589;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_130 = new Class231("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray22 = new byte[250][];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II[BIBI)V")
	public static void method6180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg0 <= arg1) {
			return;
		}
		arg3 += arg1;
		@Pc(24) int local24 = arg0 - arg1 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg0 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg3 = local39 + 1;
			arg2[local39] = 1;
		}
	}
}
