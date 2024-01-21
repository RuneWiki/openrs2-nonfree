import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_9;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] aClass2_Sub2_Sub3_Sub3Array9;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 aClass2_Sub2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!sg;")
	private static Class77 aClass77_586 = Static146.method2172("Unable to connect)3");

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!sg;")
	private static Class77 aClass77_589 = Static146.method2172("flash2:");

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_587 = aClass77_589;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_588 = aClass77_586;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_590 = aClass77_589;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!sg;")
	public static Class77 aClass77_591 = aClass77_586;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lclient!qf;")
	public static Class66 method1034(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = arg0 >> 16;
		@Pc(12) int local12 = arg0 & 0xFFFF;
		if (Static125.aClass66ArrayArray1[local8] == null || Static125.aClass66ArrayArray1[local8][local12] == null) {
			@Pc(30) boolean local30 = Static40.method798(local8);
			if (!local30) {
				return null;
			}
		}
		return Static125.aClass66ArrayArray1[local8][local12];
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method1035() {
		aClass40_1 = null;
		aClass2_Sub2_Sub3_Sub2_2 = null;
		aClass77_588 = null;
		aClass77_590 = null;
		aClass77_587 = null;
		aClass77_589 = null;
		aClass77_586 = null;
		aClass77_591 = null;
		aClass43_Sub1_9 = null;
		aClass2_Sub2_Sub3_Sub3Array9 = null;
	}
}
