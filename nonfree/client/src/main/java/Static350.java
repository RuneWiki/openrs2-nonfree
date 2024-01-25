import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
	public static int anInt6255;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Lclient!ha;")
	public static Class2 aClass2_36;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
	public static int anInt6254 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([BI)Lclient!ws;")
	public static Class1_Sub1_Sub18 method5288(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class1_Sub1_Sub18 local9 = new Class1_Sub1_Sub18();
		@Pc(14) Class1_Sub6 local14 = new Class1_Sub6(arg0);
		local14.anInt4555 = local14.aByteArray66.length - 2;
		@Pc(25) int local25 = local14.method3967();
		@Pc(36) int local36 = local14.aByteArray66.length - local25 - 12 - 2;
		local14.anInt4555 = local36;
		@Pc(43) int local43 = local14.method3925();
		local9.anInt9151 = local14.method3967();
		local9.anInt9153 = local14.method3967();
		local9.anInt9152 = local14.method3967();
		local9.anInt9150 = local14.method3967();
		@Pc(75) int local75 = local14.method3922();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local75 > 0) {
			local9.aClass17Array1 = new Class17[local75];
			for (local83 = 0; local83 < local75; local83++) {
				local89 = local14.method3967();
				@Pc(96) Class17 local96 = new Class17(Static352.method5306(local89));
				local9.aClass17Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method3925();
					@Pc(111) int local111 = local14.method3925();
					local96.method737(new Class1_Sub9(local111), (long) local107);
				}
			}
		}
		local14.anInt4555 = 0;
		local9.aString80 = local14.method3935();
		local9.anIntArray846 = new int[local43];
		local9.aStringArray44 = new String[local43];
		local9.anIntArray847 = new int[local43];
		local83 = 0;
		while (local14.anInt4555 < local36) {
			local89 = local14.method3967();
			if (local89 == 3) {
				local9.aStringArray44[local83] = local14.method3954().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray846[local83] = local14.method3922();
			} else {
				local9.anIntArray846[local83] = local14.method3925();
			}
			local9.anIntArray847[local83++] = local89;
		}
		return local9;
	}
}
