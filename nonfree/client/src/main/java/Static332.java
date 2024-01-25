import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
	public static int anInt6356;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	public static int anInt6357;

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "Lclient!dk;")
	public static final Class72 aClass72_8 = new Class72(3);

	@OriginalMember(owner = "client!nn", name = "J", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_183 = new Class88("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[[BI[I[I[B[[B)I")
	public static int method5311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg3[arg0];
		@Pc(15) int local15 = arg4[arg0] + local9;
		@Pc(19) int local19 = arg3[arg1];
		@Pc(25) int local25 = arg4[arg1] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg5[arg0] & 0xFF;
		if ((arg5[arg1] & 0xFF) < local49) {
			local49 = arg5[arg1] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg2[arg0];
		@Pc(70) byte[] local70 = arg6[arg1];
		@Pc(80) int local80 = local27 - local9;
		@Pc(85) int local85 = local27 - local19;
		for (@Pc(87) int local87 = local27; local87 < local34; local87++) {
			@Pc(99) int local99 = local70[local85++] + local66[local80++];
			if (local49 > local99) {
				local49 = local99;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!dv;I)V")
	public static void method5312(@OriginalArg(0) Class77 arg0) {
		Static383.aClass12_Sub8_Sub2_1.method5237(arg0.method2113());
	}
}
