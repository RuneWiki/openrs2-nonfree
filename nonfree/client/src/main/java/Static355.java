import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array19;

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "[Lclient!wl;")
	public static Class62_Sub1[] aClass62_Sub1Array3;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "Lclient!wk;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!wp", name = "y", descriptor = "Lclient!tq;")
	public static Class191 aClass191_223;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_119 = new Class93("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "Lclient!lb;")
	public static final Class115 aClass115_1 = new Class115();

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
	public static int anInt6969 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([I[B[[BI[I[[BBI)I")
	public static int method5983(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0[arg3];
		@Pc(15) int local15 = arg4[arg3] + local9;
		@Pc(19) int local19 = arg0[arg6];
		@Pc(25) int local25 = local19 + arg4[arg6];
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg1[arg3] & 0xFF;
		if (local53 > (arg1[arg6] & 0xFF)) {
			local53 = arg1[arg6] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg2[arg3];
		@Pc(74) byte[] local74 = arg5[arg6];
		@Pc(78) int local78 = local27 - local9;
		@Pc(82) int local82 = local27 - local19;
		for (@Pc(89) int local89 = local27; local89 < local38; local89++) {
			@Pc(101) int local101 = local70[local78++] + local74[local82++];
			if (local53 > local101) {
				local53 = local101;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public static void method5984() {
		Static214.aClass4_9.method4216(((float) Static316.anInt6385 * 0.1F + 0.7F) * 1.1523438F);
		Static214.aClass4_9.method4223(Static260.anInt5270, 0.69921875F, 1.2F, (float) -50, -60.0F, -50.0F);
		Static214.aClass4_9.method4206(Static332.anInt3541, -1);
		Static214.aClass4_9.method4243(Static318.aClass22_4);
	}
}
