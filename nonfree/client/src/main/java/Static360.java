import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!si", name = "Bb", descriptor = "[[B")
	public static byte[][] aByteArrayArray56;

	@OriginalMember(owner = "client!si", name = "nb", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_156 = new Class209("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!si", name = "zb", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_47 = new Class14();

	@OriginalMember(owner = "client!si", name = "Ab", descriptor = "I")
	public static int anInt6968 = 0;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(II)Z")
	public static boolean method5466(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!co;)V")
	public static void method5481(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static131.anInt2821 == arg0.anInt6183 || arg0.anInt6163 == -1 || arg0.anInt6139 != 0) {
			local5 = true;
		} else {
			@Pc(27) Class250 local27 = Static338.aClass12_2.method255(arg0.anInt6163);
			if (local27.aBoolean466 || local27.anIntArray594[arg0.anInt6149] < arg0.anInt6178 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(51) int local51 = arg0.anInt6183 - arg0.anInt6181;
			@Pc(56) int local56 = Static131.anInt2821 - arg0.anInt6181;
			@Pc(68) int local68 = arg0.anInt6175 * 128 + arg0.method4935() * 64;
			@Pc(80) int local80 = arg0.anInt6173 * 128 + arg0.method4935() * 64;
			@Pc(92) int local92 = arg0.anInt6189 * 128 + arg0.method4935() * 64;
			@Pc(103) int local103 = arg0.anInt6179 * 128 + arg0.method4935() * 64;
			arg0.anInt6121 = (local80 * (local51 - local56) + local103 * local56) / local51;
			arg0.anInt6119 = (local92 * local56 + local68 * (local51 - local56)) / local51;
		}
		arg0.anInt6203 = 0;
		if (arg0.anInt6131 == 0) {
			arg0.method4921(8192);
		}
		if (arg0.anInt6131 == 1) {
			arg0.method4921(12288);
		}
		if (arg0.anInt6131 == 2) {
			arg0.method4921(0);
		}
		if (arg0.anInt6131 == 3) {
			arg0.method4921(4096);
		}
	}
}
