import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!fc;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
	public static int anInt6542;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!ct;")
	public static Class30 aClass30_102;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public static int anInt6545 = -50;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)Lclient!md;")
	public static Class132 method5759(@OriginalArg(1) int arg0) {
		@Pc(17) Class132 local17 = (Class132) Static120.aClass21_77.method854((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static337.aClass30_99.method1161(arg0, 0);
		local17 = new Class132();
		if (local27 != null) {
			local17.method3634(new Class1_Sub7(local27));
		}
		local17.method3628();
		Static120.aClass21_77.method843(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public static void method5761() {
		if (Static13.anInt334 == 10) {
			Static44.method1064(28);
		}
		if (Static13.anInt334 == 30) {
			Static44.method1064(25);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZIIZB)I")
	public static int method5763(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class1_Sub26 local10 = Static65.method5281(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray255.length; local18++) {
			if (local10.anIntArray255[local18] >= 0 && local10.anIntArray255[local18] < Static243.aClass220_2.anInt6933) {
				@Pc(40) Class22 local40 = Static243.aClass220_2.method5972(local10.anIntArray255[local18]);
				@Pc(51) int local51 = local40.method893(Static296.method5175(arg2).anInt1431, arg2);
				if (arg0) {
					local16 += local51 * local10.anIntArray256[local18];
				} else {
					local16 += local51;
				}
			}
		}
		return local16;
	}
}
