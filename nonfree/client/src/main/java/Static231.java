import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hba", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZI)I")
	public static int method3374(@OriginalArg(0) boolean arg0) {
		if (Static690.anIntArray771 == null) {
			return 0;
		} else if (arg0 || Static169.aClass196Array1 == null) {
			@Pc(24) int local24 = 0;
			for (@Pc(35) int local35 = 0; local35 < Static690.anIntArray771.length; local35++) {
				@Pc(43) int local43 = Static690.anIntArray771[local35];
				if (Static175.aClass182_46.method3964(local43)) {
					local24++;
				}
				if (Static725.aClass182_131.method3964(local43)) {
					local24++;
				}
			}
			return local24;
		} else {
			return Static690.anIntArray771.length * 2;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3378(@OriginalArg(0) String arg0) {
		if (!Static474.aBoolean505 || (Static723.anInt11214 & 0x18) == 0) {
			return;
		}
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = Static607.anInt9201;
		@Pc(28) int[] local28 = Static384.anIntArray436;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(38) Class9_Sub1_Sub1_Sub2_Sub1 local38 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local28[local30]];
			if (local38.aString4 != null && local38.aString4.equalsIgnoreCase(arg0) && (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == local38 && (Static723.anInt11214 & 0x10) != 0 || (Static723.anInt11214 & 0x8) != 0)) {
				@Pc(78) Class3_Sub29 local78 = Static507.method6901(Static716.aClass144_113, Static95.aClass292_2.aClass88_2);
				local78.aClass3_Sub2_Sub1_1.method2037(Static418.anInt6410);
				local78.aClass3_Sub2_Sub1_1.method2037(local28[local30]);
				local78.aClass3_Sub2_Sub1_1.method2074(0);
				local78.aClass3_Sub2_Sub1_1.method2025(Static216.anInt3565);
				local78.aClass3_Sub2_Sub1_1.method2010(Static318.anInt1773);
				Static95.aClass292_2.method6855(local78);
				Static671.method8997(0, local38.method7485(), local38.method7485(), local38.anIntArray643[0], 0, -2, true, local38.anIntArray644[0]);
				local24 = true;
				break;
			}
		}
		if (!local24) {
			Static304.method4498(Static430.aClass257_21.method5699(Static456.anInt7118) + arg0);
		}
		if (Static474.aBoolean505) {
			Static443.method5872();
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V")
	public static void method3379() {
		if (Static15.aClass3_Sub7_Sub5_1 != null) {
			Static15.aClass3_Sub7_Sub5_1 = null;
			Static216.method3227(Static225.anInt3682, Static331.anInt5337, Static558.anInt8545, Static440.anInt6770);
		}
	}
}
