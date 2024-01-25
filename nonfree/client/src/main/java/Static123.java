import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eea", name = "I", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_45 = new Class268(116, 0);

	@OriginalMember(owner = "client!eea", name = "J", descriptor = "I")
	public static int anInt2417 = 0;

	@OriginalMember(owner = "client!eea", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[200];

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!jn;)Z")
	public static boolean method2041(@OriginalArg(1) Interface12 arg0) {
		@Pc(10) Class312 local10 = Static283.aClass210_2.method5629(arg0.method9026());
		if (local10.anInt9222 == -1) {
			return true;
		} else {
			@Pc(24) Class246 local24 = Static592.aClass304_4.method7759(local10.anInt9222);
			return local24.anInt7561 == -1 ? true : local24.method6523();
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!vt;II)Z")
	public static boolean method2042(@OriginalArg(0) Class6_Sub40_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method8619(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(105) int local105;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (local8 == 0) {
			if (arg0.method8619(1) != 0) {
				method2042(arg0, arg1);
			}
			local31 = arg0.method8619(6);
			local36 = arg0.method8619(6);
			@Pc(48) boolean local48 = arg0.method8619(1) == 1;
			if (local48) {
				Static87.anIntArray119[Static26.anInt506++] = arg1;
			}
			if (Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class260 local71 = Static592.aClass260Array1[arg1];
			@Pc(79) Class20_Sub2_Sub2_Sub1_Sub1 local79 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[arg1] = new Class20_Sub2_Sub2_Sub1_Sub1();
			local79.anInt5567 = arg1;
			if (Static594.aClass6_Sub40Array1[arg1] != null) {
				local79.method1028(Static594.aClass6_Sub40Array1[arg1]);
			}
			local79.method4920(true, local71.anInt7980);
			local79.anInt5572 = local71.anInt7978;
			local105 = local71.anInt7979;
			local109 = local105 >> 28;
			local115 = local105 >> 14 & 0xFF;
			@Pc(119) int local119 = local105 & 0xFF;
			@Pc(128) int local128 = (local115 << 6) + local31 - Static606.anInt8651;
			local79.aBoolean74 = local71.aBoolean535;
			@Pc(140) int local140 = local36 + (local119 << 6) - Static195.anInt3961;
			local79.aByteArray60[0] = Static114.aByteArray40[arg1];
			local79.aByte131 = local79.aByte130 = (byte) local109;
			if (Static492.method7384(local128, local140)) {
				local79.aByte130++;
			}
			local79.method1024(local140, local128);
			local79.aBoolean76 = false;
			Static592.aClass260Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method8619(2);
			local36 = Static592.aClass260Array1[arg1].anInt7979;
			Static592.aClass260Array1[arg1].anInt7979 = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(232) int local232;
			@Pc(237) int local237;
			@Pc(245) int local245;
			if (local8 != 2) {
				local31 = arg0.method8619(18);
				local36 = local31 >> 16;
				local232 = local31 >> 8 & 0xFF;
				local237 = local31 & 0xFF;
				local245 = Static592.aClass260Array1[arg1].anInt7979;
				local105 = local36 + (local245 >> 28) & 0x3;
				local109 = (local245 >> 14) + local232 & 0xFF;
				local115 = local245 + local237 & 0xFF;
				Static592.aClass260Array1[arg1].anInt7979 = local115 + (local109 << 14) + (local105 << 28);
				return false;
			}
			local31 = arg0.method8619(5);
			local36 = local31 >> 3;
			local232 = local31 & 0x7;
			local237 = Static592.aClass260Array1[arg1].anInt7979;
			local245 = local36 + (local237 >> 28) & 0x3;
			local105 = local237 >> 14 & 0xFF;
			local109 = local237 & 0xFF;
			if (local232 == 0) {
				local109--;
				local105--;
			}
			if (local232 == 1) {
				local109--;
			}
			if (local232 == 2) {
				local105++;
				local109--;
			}
			if (local232 == 3) {
				local105--;
			}
			if (local232 == 4) {
				local105++;
			}
			if (local232 == 5) {
				local109++;
				local105--;
			}
			if (local232 == 6) {
				local109++;
			}
			if (local232 == 7) {
				local105++;
				local109++;
			}
			Static592.aClass260Array1[arg1].anInt7979 = local109 + (local245 << 28) + (local105 << 14);
			return false;
		}
	}
}
