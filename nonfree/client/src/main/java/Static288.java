import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	public static int anInt4570;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_8 = new Class210(5, 1);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4128(@OriginalArg(0) String arg0) {
		if (!Static463.aBoolean582 || (Static25.anInt576 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static518.anInt10290;
		@Pc(21) int[] local21 = Static489.anIntArray519;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(31) Class3_Sub1_Sub2_Sub2_Sub1 local31 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local21[local23]];
			if (local31.aString37 != null && local31.aString37.equalsIgnoreCase(arg0) && (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == local31 && (Static25.anInt576 & 0x10) != 0 || local31 != null && (Static25.anInt576 & 0x8) != 0)) {
				@Pc(67) Class4_Sub48 local67 = Static335.method4615(Static606.aClass216_141, Static669.aClass196_2);
				local67.aClass4_Sub11_Sub1_2.method8849(local21[local23]);
				local67.aClass4_Sub11_Sub1_2.method8838(Static270.anInt4357);
				local67.aClass4_Sub11_Sub1_2.method8889(0);
				local67.aClass4_Sub11_Sub1_2.method8838(Static292.anInt4612);
				local67.aClass4_Sub11_Sub1_2.method8845(Static169.anInt3012);
				Static410.method5170(local67);
				Static254.method3686(true, -2, local31.anIntArray694[0], 0, local31.method8514(), 0, local31.anIntArray693[0], local31.method8514());
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static417.method5293(Static279.aClass179_21.method4066(Static164.anInt2984) + arg0);
		}
		if (Static463.aBoolean582) {
			Static124.method2204();
		}
	}
}
