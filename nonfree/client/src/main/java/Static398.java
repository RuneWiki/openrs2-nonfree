import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ofa", name = "T", descriptor = "Lclient!mha;")
	public static final Class232 aClass232_9 = new Class232(16);

	@OriginalMember(owner = "client!ofa", name = "rb", descriptor = "[I")
	public static final int[] anIntArray368 = new int[13];

	@OriginalMember(owner = "client!ofa", name = "sb", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_73 = new Class46(84, 4);

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILclient!ofa;)Lclient!wv;")
	public static Class380 method5922(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(7) String local7 = arg0.method5937();
		@Pc(14) Class245 local14 = Static116.method4813()[arg0.method5966()];
		@Pc(23) Class183 local23 = Static1.method7584()[arg0.method5966()];
		@Pc(27) int local27 = arg0.method5956();
		@Pc(31) int local31 = arg0.method5956();
		@Pc(37) int local37 = arg0.method5966();
		@Pc(43) int local43 = arg0.method5966();
		@Pc(47) int local47 = arg0.method5966();
		@Pc(51) int local51 = arg0.method5968();
		@Pc(55) int local55 = arg0.method5968();
		@Pc(61) int local61 = arg0.method5913();
		@Pc(65) int local65 = arg0.method5913();
		@Pc(69) int local69 = arg0.method5913();
		return new Class380(local7, local14, local23, local27, local31, local37, local43, local47, local51, local55, local61, local65, local69);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(ILjava/lang/String;)I")
	public static int method5936(@OriginalArg(1) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static163.aStringArray79.length; local14++) {
			if (Static163.aStringArray79[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}
}
