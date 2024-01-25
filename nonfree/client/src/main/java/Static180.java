import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt4001 = -1;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_51 = new Class274(101, 0);

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_19 = new Class233(128, 4);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lclient!dm;")
	public static Class78 method3291(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static399.aClass78ArrayArray1[local12] == null || Static399.aClass78ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static164.method3053(local12);
			if (!local30) {
				return null;
			}
		}
		return Static399.aClass78ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	public static int method3292() {
		@Pc(10) byte local10;
		if (Static545.anInt9053 < 96) {
			local10 = 1;
			Static623.method8043();
		} else {
			@Pc(17) int local17 = Static134.method2601();
			if (local17 <= 100) {
				Static455.method6666();
				local10 = 4;
			} else if (local17 <= 500) {
				local10 = 3;
				Static596.method8207();
			} else if (local17 > 1000) {
				local10 = 1;
				Static623.method8043();
			} else {
				local10 = 2;
				Static534.method7470();
			}
		}
		if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() != 0) {
			Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
			Static352.method5455(false, 0);
		}
		Static209.method3628();
		return local10;
	}
}
