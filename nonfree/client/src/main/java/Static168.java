import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!so;")
	public static final Class314 aClass314_8 = new Class314(3, 2);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!fba;II)V")
	public static void method3340(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1) {
		if (Static55.anInt1863 >= 50 || (arg0 == null || arg0.anIntArrayArray13 == null || arg1 >= arg0.anIntArrayArray13.length || arg0.anIntArrayArray13[arg1] == null)) {
			return;
		}
		@Pc(32) int local32 = arg0.anIntArrayArray13[arg1][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray13[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray13[arg1].length);
			if (local65 > 0) {
				local36 = arg0.anIntArrayArray13[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray183 != null && arg0.anIntArray181 != null) {
			local65 = Static403.method6409(arg0.anIntArray181[arg1], arg0.anIntArray183[arg1]);
		}
		if (arg0.aBoolean265) {
			Static343.method5470(0, false, local42, local65, local36, 255);
		} else {
			Static143.method2988(local65, local42, local36, 255, 0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public static void method3343() {
		Static60.aClass236_11.method6253();
	}
}
