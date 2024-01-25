import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public static int anInt10372;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	public static int[] anIntArray638;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray24;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!wl;")
	public static final Class377 aClass377_12 = new Class377();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!fga;")
	public static Class6_Sub17 aClass6_Sub17_8 = null;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!vd;IIZLclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static synchronized Class100 method8793(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) Canvas arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 0) {
			return Static258.method4612(arg2, arg6, arg5, arg4);
		} else if (arg0 == 2) {
			return Static469.method7110(arg2, arg4, arg6, arg5);
		} else if (arg0 == 1) {
			return Static447.method6915(arg5, arg3, arg4);
		} else if (arg0 == 5) {
			return Static477.method7158(arg3, arg1, arg4, arg5);
		} else if (arg0 == 3) {
			return Static652.method3153(arg5, arg1, arg4, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB[I[[B[BI[[B[I)I")
	public static int method8801(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg0];
		@Pc(15) int local15 = local9 + arg1[arg0];
		@Pc(19) int local19 = arg6[arg4];
		@Pc(25) int local25 = arg1[arg4] + local19;
		@Pc(32) int local32 = local9;
		if (local9 < local19) {
			local32 = local19;
		}
		@Pc(43) int local43 = local15;
		if (local25 < local15) {
			local43 = local25;
		}
		@Pc(54) int local54 = arg3[arg0] & 0xFF;
		if (local54 > (arg3[arg4] & 0xFF)) {
			local54 = arg3[arg4] & 0xFF;
		}
		@Pc(75) byte[] local75 = arg5[arg0];
		@Pc(79) byte[] local79 = arg2[arg4];
		@Pc(83) int local83 = local32 - local9;
		@Pc(88) int local88 = local32 - local19;
		for (@Pc(90) int local90 = local32; local90 < local43; local90++) {
			@Pc(102) int local102 = local75[local83++] + local79[local88++];
			if (local54 > local102) {
				local54 = local102;
			}
		}
		return -local54;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ka;IIII)Lclient!ria;")
	public static Class290 method8846(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 == null ? null : new Class290(arg2, arg3, arg1, arg0.na(), arg0.V(), arg0.RA(), arg0.fa(), arg0.EA(), arg0.HA(), arg0.G());
	}
}
