import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!pa", name = "fb", descriptor = "Z")
	public static boolean aBoolean118;

	@OriginalMember(owner = "client!pa", name = "hb", descriptor = "Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3 aClass2_Sub2_Sub3_Sub3_4;

	@OriginalMember(owner = "client!pa", name = "jb", descriptor = "Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3 aClass2_Sub2_Sub3_Sub3_5;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1103 = Static146.method2172("Hidden");

	@OriginalMember(owner = "client!pa", name = "kb", descriptor = "[I")
	public static int[] anIntArray449 = new int[5];

	@OriginalMember(owner = "client!pa", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1104 = aClass77_1103;

	@OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
	public static int anInt2968 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!ke;)V")
	public static void method2125(@OriginalArg(1) Class43 arg0) {
		Static42.aClass43_11 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V")
	public static void method2126() {
		aClass2_Sub2_Sub3_Sub3_4 = null;
		anIntArray449 = null;
		aClass2_Sub2_Sub3_Sub3_5 = null;
		aClass77_1103 = null;
		aClass77_1104 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[Lclient!sg;)[Lclient!sg;")
	public static Class77[] method2127(@OriginalArg(1) Class77[] arg0) {
		@Pc(2) Class77[] local2 = new Class77[5];
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			local2[local13] = Static146.method2168(new Class77[] { Static2.method61(local13), Static163.aClass77_1370 });
			if (arg0 != null && arg0[local13] != null) {
				local2[local13] = Static146.method2168(new Class77[] { local2[local13], arg0[local13] });
			}
		}
		return local2;
	}
}
