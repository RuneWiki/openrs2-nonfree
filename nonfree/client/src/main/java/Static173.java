import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	public static int anInt2855;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "[S")
	public static short[] aShortArray36;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray67;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt2851 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!wm;)Lclient!bu;")
	public static Class1_Sub2 method2283(@OriginalArg(1) Class1_Sub19 arg0) {
		arg0.method2915();
		@Pc(13) int local13 = arg0.method2915();
		@Pc(22) Class1_Sub2 local22 = Static334.method4389(local13);
		local22.anInt7401 = arg0.method2915();
		@Pc(31) int local31 = arg0.method2915();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method2915();
			local22.method5962(arg0, local39);
		}
		local22.method5967();
		return local22;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method2286() {
		try {
			if (Static270.anInt1979 == 1) {
				@Pc(10) int local10 = Static181.aClass1_Sub9_Sub3_2.method4663();
				if (local10 > 0 && Static181.aClass1_Sub9_Sub3_2.method4647()) {
					local10 -= Static353.anInt5706;
					if (local10 < 0) {
						local10 = 0;
					}
					Static181.aClass1_Sub9_Sub3_2.method4642(local10);
					return;
				}
				Static181.aClass1_Sub9_Sub3_2.method4629();
				Static181.aClass1_Sub9_Sub3_2.method4652();
				Static45.aClass1_Sub14_1 = null;
				Static246.aClass58_1 = null;
				if (Static371.aClass185_97 == null) {
					Static270.anInt1979 = 0;
				} else {
					Static270.anInt1979 = 2;
				}
			}
		} catch (@Pc(52) Exception local52) {
			local52.printStackTrace();
			Static181.aClass1_Sub9_Sub3_2.method4629();
			Static371.aClass185_97 = null;
			Static270.anInt1979 = 0;
			Static45.aClass1_Sub14_1 = null;
			Static246.aClass58_1 = null;
		}
	}
}
