import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_202 = new Class194(73, 6);

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	public static int anInt6517 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5662(@OriginalArg(1) String arg0) {
		if (!Static425.aBoolean536 || (Static95.anInt1910 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static174.anInt3362;
		@Pc(18) int[] local18 = Static495.anIntArray529;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(30) Class9_Sub2_Sub1_Sub2_Sub1 local30 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local18[local20]];
			if (local30.aString5 != null && local30.aString5.equalsIgnoreCase(arg0) && (local30 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 && (Static95.anInt1910 & 0x10) != 0 || local30 != null && (Static95.anInt1910 & 0x8) != 0)) {
				@Pc(63) Class3_Sub27 local63 = Static59.method1040(Static325.aClass20_2, Static487.aClass314_121);
				local63.aClass3_Sub9_Sub2_2.method5593(0);
				local63.aClass3_Sub9_Sub2_2.method5581(local18[local20]);
				local63.aClass3_Sub9_Sub2_2.method5620(Static174.anInt3360);
				local63.aClass3_Sub9_Sub2_2.method5581(Static260.anInt5074);
				local63.aClass3_Sub9_Sub2_2.method5637(Static491.anInt8353);
				Static148.method2572(local63);
				local14 = true;
				Static276.method4535(local30.anIntArray675[0], true, local30.anIntArray676[0], 0, local30.method8619(), local30.method8619(), 0, -2);
				break;
			}
		}
		if (!local14) {
			Static608.method8332(Static369.aClass235_24.method5893(Static455.anInt7738) + arg0);
		}
		if (Static425.aBoolean536) {
			Static409.method6364();
		}
	}
}
