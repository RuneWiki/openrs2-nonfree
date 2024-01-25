import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
	public static int anInt7615;

	@OriginalMember(owner = "client!qba", name = "s", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_13 = new Class376(7, 8);

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
	public static int anInt7613 = -50;

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_131 = new Class337(62, 6);

	@OriginalMember(owner = "client!qba", name = "w", descriptor = "[I")
	public static final int[] anIntArray410 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_132 = new Class337(71, -1);

	@OriginalMember(owner = "client!qba", name = "A", descriptor = "[J")
	public static final long[] aLongArray13 = new long[32];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!ka;III)Lclient!kn;")
	public static Class200 method6733(@OriginalArg(1) Class187 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class200(arg3, arg1, arg2, arg0.na(), arg0.V(), arg0.RA(), arg0.fa(), arg0.EA(), arg0.HA(), arg0.G());
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method6734(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static225.anInt4205 >= 100) {
			Static141.method2041(Static174.aClass120_39.method2690(Static266.anInt4796));
			return;
		}
		@Pc(25) String local25 = Static156.method2258(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(30) int local30 = 0; local30 < Static225.anInt4205; local30++) {
			@Pc(38) String local38 = Static156.method2258(Static447.aStringArray59[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static141.method2041(arg1 + Static174.aClass120_40.method2690(Static266.anInt4796));
				return;
			}
			if (Static526.aStringArray72[local30] != null) {
				local69 = Static156.method2258(Static526.aStringArray72[local30]);
				if (local69 != null && local69.equals(local25)) {
					Static141.method2041(arg1 + Static174.aClass120_40.method2690(Static266.anInt4796));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static48.anInt995; local100++) {
			local69 = Static156.method2258(Static400.aStringArray55[local100]);
			if (local69 != null && local69.equals(local25)) {
				Static141.method2041(Static174.aClass120_45.method2690(Static266.anInt4796) + arg1 + Static174.aClass120_46.method2690(Static266.anInt4796));
				return;
			}
			if (Static257.aStringArray32[local100] != null) {
				@Pc(144) String local144 = Static156.method2258(Static257.aStringArray32[local100]);
				if (local144 != null && local144.equals(local25)) {
					Static141.method2041(Static174.aClass120_45.method2690(Static266.anInt4796) + arg1 + Static174.aClass120_46.method2690(Static266.anInt4796));
					return;
				}
			}
		}
		if (Static156.method2258(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17).equals(local25)) {
			Static141.method2041(Static174.aClass120_42.method2690(Static266.anInt4796));
			return;
		}
		@Pc(208) Class5_Sub48 local208 = Static16.method232(Static11.aClass46_2, Static276.aClass251_2);
		local208.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(arg1) + 1);
		local208.aClass5_Sub22_Sub1_2.method5910(arg1);
		local208.aClass5_Sub22_Sub1_2.method5905(arg0 ? 1 : 0);
		Static277.method4436(local208);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static66.method1097(arg1, arg0) || Static180.method2777(arg0, arg1);
	}
}
