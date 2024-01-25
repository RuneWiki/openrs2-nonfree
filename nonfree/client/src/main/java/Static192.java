import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "[Lclient!ui;")
	public static Class4_Sub8[] aClass4_Sub8Array5;

	@OriginalMember(owner = "client!gga", name = "s", descriptor = "Lclient!rg;")
	public static Class310 aClass310_135;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
	public static int anInt10923 = -1;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "[Lclient!dea;")
	public static final Class72[] aClass72Array5 = new Class72[4];

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)V")
	public static void method9268(@OriginalArg(0) int arg0) {
		if (Static71.aClass14_Sub48_1 == null || (arg0 < 0 || arg0 >= Static71.aClass14_Sub48_1.anInt10291)) {
			return;
		}
		@Pc(22) Class155 local22 = Static71.aClass14_Sub48_1.aClass155Array1[arg0];
		if (local22.aByte85 != -1) {
			return;
		}
		@Pc(40) Class347 local40 = Static435.method6495();
		@Pc(46) Class14_Sub54 local46 = Static72.method1195(local40.aClass197_2, Static134.aClass251_75);
		local46.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(local22.aString45) + 2);
		local46.aClass14_Sub21_Sub2_2.method7751(arg0);
		local46.aClass14_Sub21_Sub2_2.method7690(local22.aString45);
		local40.method8308(local46);
	}
}
