import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!pb;")
	public static Class273 aClass273_168;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!bda;")
	public static final Class34 aClass34_172 = new Class34();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([II[IIILclient!kd;)Lclient!td;")
	public static Class1_Sub3 method9328(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class57_Sub3 arg4) {
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (!arg4.method7844(Static453.aClass278_13, Static78.aClass114_19)) {
			@Pc(81) int[] local81 = new int[arg3 * arg1];
			for (local31 = 0; local31 < arg1; local31++) {
				local42 = arg2[local31] + arg3 * local31;
				for (local44 = 0; local44 < arg0[local31]; local44++) {
					local81[local42++] = -16777216;
				}
			}
			return new Class1_Sub3(arg4, arg3, arg1, local81);
		}
		@Pc(29) byte[] local29 = new byte[arg3 * arg1];
		for (local31 = 0; local31 < arg1; local31++) {
			local42 = local31 * arg3 + arg2[local31];
			for (local44 = 0; local44 < arg0[local31]; local44++) {
				local29[local42++] = -1;
			}
		}
		return new Class1_Sub3(arg4, arg3, arg1, local29);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method9330(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(28) String local28 = Static250.method3679(arg0);
		if (local28 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < Static453.anInt7761; local34++) {
			@Pc(40) String local40 = Static197.aStringArray73[local34];
			if (local40.startsWith("*")) {
				local40 = local40.substring(1);
			}
			local40 = Static250.method3679(local40);
			if (local40 != null && local40.equals(local28)) {
				Static453.anInt7761--;
				for (@Pc(66) int local66 = local34; local66 < Static453.anInt7761; local66++) {
					Static197.aStringArray73[local66] = Static197.aStringArray73[local66 + 1];
					Static30.aStringArray4[local66] = Static30.aStringArray4[local66 + 1];
					Static430.aStringArray43[local66] = Static430.aStringArray43[local66 + 1];
					Static546.aStringArray71[local66] = Static546.aStringArray71[local66 + 1];
					Static24.aBooleanArray1[local66] = Static24.aBooleanArray1[local66 + 1];
				}
				Static148.anInt2385 = Static261.anInt4525;
				@Pc(125) Class5_Sub50 local125 = Static457.method6722(Static263.aClass387_50, Static80.aClass313_1);
				local125.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(arg0));
				local125.aClass5_Sub23_Sub2_2.method8538(arg0);
				Static494.method7120(local125);
				return;
			}
		}
	}
}
