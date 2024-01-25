import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_125 = new Class363(54, -2);

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "[I")
	public static final int[] anIntArray325 = new int[4096];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!qi;)V")
	public static void method3969(@OriginalArg(1) Class6_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(15) Class2_Sub39 local15 = (Class2_Sub39) Static175.aClass162_19.method3519((long) arg0.lb);
		if (local15 == null) {
			return;
		}
		if (local15.aClass2_Sub10_Sub4_3 != null) {
			Static122.aClass2_Sub10_Sub1_2.method1012(local15.aClass2_Sub10_Sub4_3);
			local15.aClass2_Sub10_Sub4_3 = null;
		}
		local15.method7966();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3970(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(2, arg1);
		local8.method6098();
		local8.aString64 = arg0;
	}
}
